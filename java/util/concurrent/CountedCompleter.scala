package java.util.concurrent

import java.lang.{Object, Throwable}

// A ForkJoinTask with a completion action performed when
// triggered and there are no remaining pending actions.
// CountedCompleters are in general more robust in the
// presence of subtask stalls and blockage than are other forms of
// ForkJoinTasks, but are less intuitive to program.  Uses of
// CountedCompleter are similar to those of other completion based
// components (such as CompletionHandler)
// except that multiple pending completions may be necessary
// to trigger the completion action onCompletion(CountedCompleter),
// not just one.
// Unless initialized otherwise, the pending
// count starts at zero, but may be (atomically) changed using
// methods setPendingCount(int), addToPendingCount(int), and
// compareAndSetPendingCount(int, int). Upon invocation of tryComplete(), if the pending action count is nonzero, it is
// decremented; otherwise, the completion action is performed, and if
// this completer itself has a completer, the process is continued
// with its completer.  As is the case with related synchronization
// components such as Phaser and
// Semaphore, these methods
// affect only internal counts; they do not establish any further
// internal bookkeeping. In particular, the identities of pending
// tasks are not maintained. As illustrated below, you can create
// subclasses that do record some or all pending tasks or their
// results when needed.  As illustrated below, utility methods
// supporting customization of completion traversals are also
// provided. However, because CountedCompleters provide only basic
// synchronization mechanisms, it may be useful to create further
// abstract subclasses that maintain linkages, fields, and additional
// support methods appropriate for a set of related usages.
//
// A concrete CountedCompleter class must define method compute(), that should in most cases (as illustrated below), invoke
// tryComplete() once before returning. The class may also
// optionally override method onCompletion(CountedCompleter)
// to perform an action upon normal completion, and method
// onExceptionalCompletion(Throwable, CountedCompleter) to
// perform an action upon any exception.
//
// CountedCompleters most often do not bear results, in which case
// they are normally declared as CountedCompleter<Void>, and
// will always return null as a result value.  In other cases,
// you should override method getRawResult() to provide a
// result from join(), invoke(), and related methods.  In
// general, this method should return the value of a field (or a
// function of one or more fields) of the CountedCompleter object that
// holds the result upon completion. Method setRawResult(T) by
// default plays no role in CountedCompleters.  It is possible, but
// rarely applicable, to override this method to maintain other
// objects or fields holding result data.
//
// A CountedCompleter that does not itself have a completer (i.e.,
// one for which getCompleter() returns null) can be
// used as a regular ForkJoinTask with this added functionality.
// However, any completer that in turn has another completer serves
// only as an internal helper for other computations, so its own task
// status (as reported in methods such as ForkJoinTask.isDone())
// is arbitrary; this status changes only upon explicit invocations of
// complete(T), ForkJoinTask.cancel(boolean),
// ForkJoinTask.completeExceptionally(Throwable) or upon
// exceptional completion of method compute. Upon any
// exceptional completion, the exception may be relayed to a task's
// completer (and its completer, and so on), if one exists and it has
// not otherwise already completed. Similarly, cancelling an internal
// CountedCompleter has only a local effect on that completer, so is
// not often useful.
//
// Sample Usages.
//
// Parallel recursive decomposition. CountedCompleters may
// be arranged in trees similar to those often used with RecursiveActions, although the constructions involved in setting
// them up typically vary. Here, the completer of each task is its
// parent in the computation tree. Even though they entail a bit more
// bookkeeping, CountedCompleters may be better choices when applying
// a possibly time-consuming operation (that cannot be further
// subdivided) to each element of an array or collection; especially
// when the operation takes a significantly different amount of time
// to complete for some elements than others, either because of
// intrinsic variation (for example I/O) or auxiliary effects such as
// garbage collection.  Because CountedCompleters provide their own
// continuations, other threads need not block waiting to perform
// them.
//
// For example, here is an initial version of a class that uses
// divide-by-two recursive decomposition to divide work into single
// pieces (leaf tasks). Even when work is split into individual calls,
// tree-based techniques are usually preferable to directly forking
// leaf tasks, because they reduce inter-thread communication and
// improve load balancing. In the recursive case, the second of each
// pair of subtasks to finish triggers completion of its parent
// (because no result combination is performed, the default no-op
// implementation of method onCompletion is not overridden).
// A static utility method sets up the base task and invokes it
// (here, implicitly using the ForkJoinPool.commonPool()).
//
//  
// class MyOperation<E> { void apply(E e) { ... }  }
//
// class ForEach<E> extends CountedCompleter<Void> {
//
//   public static <E> void forEach(E[] array, MyOperation<E> op) {
//     new ForEach<E>(null, array, op, 0, array.length).invoke();
//   }
//
//   final E[] array; final MyOperation<E> op; final int lo, hi;
//   ForEach(CountedCompleter<?> p, E[] array, MyOperation<E> op, int lo, int hi) {
//     super(p);
//     this.array = array; this.op = op; this.lo = lo; this.hi = hi;
//   }
//
//   public void compute() { // version 1
//     if (hi - lo >= 2) {
//       int mid = (lo + hi) >>> 1;
//       setPendingCount(2); // must set pending count before fork
//       new ForEach(this, array, op, mid, hi).fork(); // right child
//       new ForEach(this, array, op, lo, mid).fork(); // left child
//     }
//     else if (hi > lo)
//       op.apply(array[lo]);
//     tryComplete();
//   }
// }
//
// This design can be improved by noticing that in the recursive case,
// the task has nothing to do after forking its right task, so can
// directly invoke its left task before returning. (This is an analog
// of tail recursion removal.)  Also, because the task returns upon
// executing its left task (rather than falling through to invoke
// tryComplete) the pending count is set to one:
//
//  
// class ForEach<E> ...
//   public void compute() { // version 2
//     if (hi - lo >= 2) {
//       int mid = (lo + hi) >>> 1;
//       setPendingCount(1); // only one pending
//       new ForEach(this, array, op, mid, hi).fork(); // right child
//       new ForEach(this, array, op, lo, mid).compute(); // direct invoke
//     }
//     else {
//       if (hi > lo)
//         op.apply(array[lo]);
//       tryComplete();
//     }
//   }
// 
//
// As a further improvement, notice that the left task need not even exist.
// Instead of creating a new one, we can iterate using the original task,
// and add a pending count for each fork.  Additionally, because no task
// in this tree implements an onCompletion(CountedCompleter) method,
// tryComplete() can be replaced with propagateCompletion().
//
//  
// class ForEach<E> ...
//   public void compute() { // version 3
//     int l = lo,  h = hi;
//     while (h - l >= 2) {
//       int mid = (l + h) >>> 1;
//       addToPendingCount(1);
//       new ForEach(this, array, op, mid, h).fork(); // right child
//       h = mid;
//     }
//     if (h > l)
//       op.apply(array[l]);
//     propagateCompletion();
//   }
// 
//
// Additional improvements of such classes might entail precomputing
// pending counts so that they can be established in constructors,
// specializing classes for leaf steps, subdividing by say, four,
// instead of two per iteration, and using an adaptive threshold
// instead of always subdividing down to single elements.
//
// Searching. A tree of CountedCompleters can search for a
// value or property in different parts of a data structure, and
// report a result in an AtomicReference as
// soon as one is found. The others can poll the result to avoid
// unnecessary work. (You could additionally cancel other tasks, but it is usually simpler and more efficient
// to just let them notice that the result is set and if so skip
// further processing.)  Illustrating again with an array using full
// partitioning (again, in practice, leaf tasks will almost always
// process more than one element):
//
//  
// class Searcher<E> extends CountedCompleter<E> {
//   final E[] array; final AtomicReference<E> result; final int lo, hi;
//   Searcher(CountedCompleter<?> p, E[] array, AtomicReference<E> result, int lo, int hi) {
//     super(p);
//     this.array = array; this.result = result; this.lo = lo; this.hi = hi;
//   }
//   public E getRawResult() { return result.get(); }
//   public void compute() { // similar to ForEach version 3
//     int l = lo,  h = hi;
//     while (result.get() == null && h >= l) {
//       if (h - l >= 2) {
//         int mid = (l + h) >>> 1;
//         addToPendingCount(1);
//         new Searcher(this, array, result, mid, h).fork();
//         h = mid;
//       }
//       else {
//         E x = array[l];
//         if (matches(x) && result.compareAndSet(null, x))
//           quietlyCompleteRoot(); // root task is now joinable
//         break;
//       }
//     }
//     tryComplete(); // normally complete whether or not found
//   }
//   boolean matches(E e) { ... } // return true if found
//
//   public static <E> E search(E[] array) {
//       return new Searcher<E>(null, array, new AtomicReference<E>(), 0, array.length).invoke();
//   }
// }
//
// In this example, as well as others in which tasks have no other
// effects except to compareAndSet a common result, the trailing
// unconditional invocation of tryComplete could be made
// conditional (if (result.get() == null) tryComplete();)
// because no further bookkeeping is required to manage completions
// once the root task completes.
//
// Recording subtasks. CountedCompleter tasks that combine
// results of multiple subtasks usually need to access these results
// in method onCompletion(CountedCompleter). As illustrated in the following
// class (that performs a simplified form of map-reduce where mappings
// and reductions are all of type E), one way to do this in
// divide and conquer designs is to have each subtask record its
// sibling, so that it can be accessed in method onCompletion.
// This technique applies to reductions in which the order of
// combining left and right results does not matter; ordered
// reductions require explicit left/right designations.  Variants of
// other streamlinings seen in the above examples may also apply.
//
//  
// class MyMapper<E> { E apply(E v) {  ...  } }
// class MyReducer<E> { E apply(E x, E y) {  ...  } }
// class MapReducer<E> extends CountedCompleter<E> {
//   final E[] array; final MyMapper<E> mapper;
//   final MyReducer<E> reducer; final int lo, hi;
//   MapReducer<E> sibling;
//   E result;
//   MapReducer(CountedCompleter<?> p, E[] array, MyMapper<E> mapper,
//              MyReducer<E> reducer, int lo, int hi) {
//     super(p);
//     this.array = array; this.mapper = mapper;
//     this.reducer = reducer; this.lo = lo; this.hi = hi;
//   }
//   public void compute() {
//     if (hi - lo >= 2) {
//       int mid = (lo + hi) >>> 1;
//       MapReducer<E> left = new MapReducer(this, array, mapper, reducer, lo, mid);
//       MapReducer<E> right = new MapReducer(this, array, mapper, reducer, mid, hi);
//       left.sibling = right;
//       right.sibling = left;
//       setPendingCount(1); // only right is pending
//       right.fork();
//       left.compute();     // directly execute left
//     }
//     else {
//       if (hi > lo)
//           result = mapper.apply(array[lo]);
//       tryComplete();
//     }
//   }
//   public void onCompletion(CountedCompleter<?> caller) {
//     if (caller != this) {
//       MapReducer<E> child = (MapReducer<E>)caller;
//       MapReducer<E> sib = child.sibling;
//       if (sib == null || sib.result == null)
//         result = child.result;
//       else
//         result = reducer.apply(child.result, sib.result);
//     }
//   }
//   public E getRawResult() { return result; }
//
//   public static <E> E mapReduce(E[] array, MyMapper<E> mapper, MyReducer<E> reducer) {
//     return new MapReducer<E>(null, array, mapper, reducer,
//                              0, array.length).invoke();
//   }
// }
//
// Here, method onCompletion takes a form common to many
// completion designs that combine results. This callback-style method
// is triggered once per task, in either of the two different contexts
// in which the pending count is, or becomes, zero: (1) by a task
// itself, if its pending count is zero upon invocation of tryComplete, or (2) by any of its subtasks when they complete and
// decrement the pending count to zero. The caller argument
// distinguishes cases.  Most often, when the caller is this,
// no action is necessary. Otherwise the caller argument can be used
// (usually via a cast) to supply a value (and/or links to other
// values) to be combined.  Assuming proper use of pending counts, the
// actions inside onCompletion occur (once) upon completion of
// a task and its subtasks. No additional synchronization is required
// within this method to ensure thread safety of accesses to fields of
// this task or other completed tasks.
//
// Completion Traversals. If using onCompletion to
// process completions is inapplicable or inconvenient, you can use
// methods firstComplete() and nextComplete() to create
// custom traversals.  For example, to define a MapReducer that only
// splits out right-hand tasks in the form of the third ForEach
// example, the completions must cooperatively reduce along
// unexhausted subtask links, which can be done as follows:
//
//  
// class MapReducer<E> extends CountedCompleter<E> { // version 2
//   final E[] array; final MyMapper<E> mapper;
//   final MyReducer<E> reducer; final int lo, hi;
//   MapReducer<E> forks, next; // record subtask forks in list
//   E result;
//   MapReducer(CountedCompleter<?> p, E[] array, MyMapper<E> mapper,
//              MyReducer<E> reducer, int lo, int hi, MapReducer<E> next) {
//     super(p);
//     this.array = array; this.mapper = mapper;
//     this.reducer = reducer; this.lo = lo; this.hi = hi;
//     this.next = next;
//   }
//   public void compute() {
//     int l = lo,  h = hi;
//     while (h - l >= 2) {
//       int mid = (l + h) >>> 1;
//       addToPendingCount(1);
//       (forks = new MapReducer(this, array, mapper, reducer, mid, h, forks)).fork();
//       h = mid;
//     }
//     if (h > l)
//       result = mapper.apply(array[l]);
//     // process completions by reducing along and advancing subtask links
//     for (CountedCompleter<?> c = firstComplete(); c != null; c = c.nextComplete()) {
//       for (MapReducer t = (MapReducer)c, s = t.forks;  s != null; s = t.forks = s.next)
//         t.result = reducer.apply(t.result, s.result);
//     }
//   }
//   public E getRawResult() { return result; }
//
//   public static <E> E mapReduce(E[] array, MyMapper<E> mapper, MyReducer<E> reducer) {
//     return new MapReducer<E>(null, array, mapper, reducer,
//                              0, array.length, null).invoke();
//   }
// }
//
// Triggers. Some CountedCompleters are themselves never
// forked, but instead serve as bits of plumbing in other designs;
// including those in which the completion of one or more async tasks
// triggers another async task. For example:
//
//  
// class HeaderBuilder extends CountedCompleter<...> { ... }
// class BodyBuilder extends CountedCompleter<...> { ... }
// class PacketSender extends CountedCompleter<...> {
//   PacketSender(...) { super(null, 1); ... } // trigger on second completion
//   public void compute() { } // never called
//   public void onCompletion(CountedCompleter<?> caller) { sendPacket(); }
// }
// // sample use:
// PacketSender p = new PacketSender();
// new HeaderBuilder(p, ...).fork();
// new BodyBuilder(p, ...).fork();
// 
abstract class CountedCompleter[T] extends ForkJoinTask[T] {

    @stub
    // Creates a new CountedCompleter with no completer
    // and an initial pending count of zero.
    protected def this() = ???

    @stub
    // Creates a new CountedCompleter with the given completer
    // and an initial pending count of zero.
    protected def this(completer: CountedCompleter[_]) = ???

    // Adds (atomically) the given value to the pending count.
    def addToPendingCount(delta: Int): Unit

    // Sets (atomically) the pending count to the given count only if
    // it currently holds the given expected value.
    def compareAndSetPendingCount(expected: Int, count: Int): Boolean

    // Regardless of pending count, invokes
    // onCompletion(CountedCompleter), marks this task as
    // complete and further triggers tryComplete() on this
    // task's completer, if one exists.
    def complete(rawResult: T): Unit

    // The main computation performed by this task.
    def compute(): Unit

    // If the pending count is nonzero, (atomically) decrements it.
    def decrementPendingCountUnlessZero(): Int

    // Implements execution conventions for CountedCompleters.
    protected def exec(): Boolean

    // If this task's pending count is zero, returns this task;
    // otherwise decrements its pending count and returns null.
    def firstComplete(): CountedCompleter[_]

    // Returns the completer established in this task's constructor,
    // or null if none.
    def getCompleter(): CountedCompleter[_]

    // Returns the current pending count.
    def getPendingCount(): Int

    // Returns the result of the computation.
    def getRawResult(): T

    // Returns the root of the current computation; i.e., this
    // task if it has no completer, else its completer's root.
    def getRoot(): CountedCompleter[_]

    // If this task has not completed, attempts to process at most the
    // given number of other unprocessed tasks for which this task is
    // on the completion path, if any are known to exist.
    def helpComplete(maxTasks: Int): Unit

    // If this task does not have a completer, invokes ForkJoinTask.quietlyComplete() and returns null.
    def nextComplete(): CountedCompleter[_]

    // Performs an action when method tryComplete() is invoked
    // and the pending count is zero, or when the unconditional
    // method complete(T) is invoked.
    def onCompletion(caller: CountedCompleter[_]): Unit

    // Performs an action when method ForkJoinTask.completeExceptionally(Throwable) is invoked or method compute() throws an exception, and this task has not already
    // otherwise completed normally.
    def onExceptionalCompletion(ex: Throwable, caller: CountedCompleter[_]): Boolean

    // Equivalent to tryComplete() but does not invoke onCompletion(CountedCompleter) along the completion path:
    // If the pending count is nonzero, decrements the count;
    // otherwise, similarly tries to complete this task's completer, if
    // one exists, else marks this task as complete.
    def propagateCompletion(): Unit

    // Equivalent to getRoot().quietlyComplete().
    def quietlyCompleteRoot(): Unit

    // Sets the pending count to the given value.
    def setPendingCount(count: Int): Unit

    // A method that result-bearing CountedCompleters may optionally
    // use to help maintain result data.
    protected def setRawResult(t: T): Unit
}
