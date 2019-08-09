package java.util.concurrent

import java.io.Serializable
import java.lang.{Object, Runnable, Throwable}
import java.util.Collection

// Abstract base class for tasks that run within a ForkJoinPool.
// A ForkJoinTask is a thread-like entity that is much
// lighter weight than a normal thread.  Huge numbers of tasks and
// subtasks may be hosted by a small number of actual threads in a
// ForkJoinPool, at the price of some usage limitations.
//
// A "main" ForkJoinTask begins execution when it is
// explicitly submitted to a ForkJoinPool, or, if not already
// engaged in a ForkJoin computation, commenced in the ForkJoinPool.commonPool() via fork(), invoke(), or
// related methods.  Once started, it will usually in turn start other
// subtasks.  As indicated by the name of this class, many programs
// using ForkJoinTask employ only methods fork() and
// join(), or derivatives such as invokeAll.  However, this class also
// provides a number of other methods that can come into play in
// advanced usages, as well as extension mechanics that allow support
// of new forms of fork/join processing.
//
// A ForkJoinTask is a lightweight form of Future.
// The efficiency of ForkJoinTasks stems from a set of
// restrictions (that are only partially statically enforceable)
// reflecting their main use as computational tasks calculating pure
// functions or operating on purely isolated objects.  The primary
// coordination mechanisms are fork(), that arranges
// asynchronous execution, and join(), that doesn't proceed
// until the task's result has been computed.  Computations should
// ideally avoid synchronized methods or blocks, and should
// minimize other blocking synchronization apart from joining other
// tasks or using synchronizers such as Phasers that are advertised to
// cooperate with fork/join scheduling. Subdividable tasks should also
// not perform blocking I/O, and should ideally access variables that
// are completely independent of those accessed by other running
// tasks. These guidelines are loosely enforced by not permitting
// checked exceptions such as IOExceptions to be
// thrown. However, computations may still encounter unchecked
// exceptions, that are rethrown to callers attempting to join
// them. These exceptions may additionally include RejectedExecutionException stemming from internal resource
// exhaustion, such as failure to allocate internal task
// queues. Rethrown exceptions behave in the same way as regular
// exceptions, but, when possible, contain stack traces (as displayed
// for example using ex.printStackTrace()) of both the thread
// that initiated the computation as well as the thread actually
// encountering the exception; minimally only the latter.
//
// It is possible to define and use ForkJoinTasks that may block,
// but doing do requires three further considerations: (1) Completion
// of few if any other tasks should be dependent on a task
// that blocks on external synchronization or I/O. Event-style async
// tasks that are never joined (for example, those subclassing CountedCompleter) often fall into this category.  (2) To minimize
// resource impact, tasks should be small; ideally performing only the
// (possibly) blocking action. (3) Unless the ForkJoinPool.ManagedBlocker API is used, or the number of possibly
// blocked tasks is known to be less than the pool's ForkJoinPool.getParallelism() level, the pool cannot guarantee that
// enough threads will be available to ensure progress or good
// performance.
//
// The primary method for awaiting completion and extracting
// results of a task is join(), but there are several variants:
// The Future.get() methods support interruptible and/or timed
// waits for completion and report results using Future
// conventions. Method invoke() is semantically
// equivalent to fork(); join() but always attempts to begin
// execution in the current thread. The "quiet" forms of
// these methods do not extract results or report exceptions. These
// may be useful when a set of tasks are being executed, and you need
// to delay processing of results or exceptions until all complete.
// Method invokeAll (available in multiple versions)
// performs the most common form of parallel invocation: forking a set
// of tasks and joining them all.
//
// In the most typical usages, a fork-join pair act like a call
// (fork) and return (join) from a parallel recursive function. As is
// the case with other forms of recursive calls, returns (joins)
// should be performed innermost-first. For example, a.fork();
// b.fork(); b.join(); a.join(); is likely to be substantially more
// efficient than joining a before b.
//
// The execution status of tasks may be queried at several levels
// of detail: isDone() is true if a task completed in any way
// (including the case where a task was cancelled without executing);
// isCompletedNormally() is true if a task completed without
// cancellation or encountering an exception; isCancelled() is
// true if the task was cancelled (in which case getException()
// returns a CancellationException); and
// isCompletedAbnormally() is true if a task was either
// cancelled or encountered an exception, in which case getException() will return either the encountered exception or
// CancellationException.
//
// The ForkJoinTask class is not usually directly subclassed.
// Instead, you subclass one of the abstract classes that support a
// particular style of fork/join processing, typically RecursiveAction for most computations that do not return results,
// RecursiveTask for those that do, and CountedCompleter for those in which completed actions trigger
// other actions.  Normally, a concrete ForkJoinTask subclass declares
// fields comprising its parameters, established in a constructor, and
// then defines a compute method that somehow uses the control
// methods supplied by this base class.
//
// Method join() and its variants are appropriate for use
// only when completion dependencies are acyclic; that is, the
// parallel computation can be described as a directed acyclic graph
// (DAG). Otherwise, executions may encounter a form of deadlock as
// tasks cyclically wait for each other.  However, this framework
// supports other methods and techniques (for example the use of
// Phaser, helpQuiesce(), and complete(V)) that
// may be of use in constructing custom subclasses for problems that
// are not statically structured as DAGs. To support such usages, a
// ForkJoinTask may be atomically tagged with a short
// value using setForkJoinTaskTag(short) or compareAndSetForkJoinTaskTag(short, short) and checked using getForkJoinTaskTag(). The ForkJoinTask implementation does not use
// these protected methods or tags for any purpose, but they
// may be of use in the construction of specialized subclasses.  For
// example, parallel graph traversals can use the supplied methods to
// avoid revisiting nodes/tasks that have already been processed.
// (Method names for tagging are bulky in part to encourage definition
// of methods that reflect their usage patterns.)
//
// Most base support methods are final, to prevent
// overriding of implementations that are intrinsically tied to the
// underlying lightweight task scheduling framework.  Developers
// creating new basic styles of fork/join processing should minimally
// implement protected methods exec(), setRawResult(V), and getRawResult(), while also introducing
// an abstract computational method that can be implemented in its
// subclasses, possibly relying on other protected methods
// provided by this class.
//
// ForkJoinTasks should perform relatively small amounts of
// computation. Large tasks should be split into smaller subtasks,
// usually via recursive decomposition. As a very rough rule of thumb,
// a task should perform more than 100 and less than 10000 basic
// computational steps, and should avoid indefinite looping. If tasks
// are too big, then parallelism cannot improve throughput. If too
// small, then memory and internal task maintenance overhead may
// overwhelm processing.
//
// This class provides adapt methods for Runnable
// and Callable, that may be of use when mixing execution of
// ForkJoinTasks with other kinds of tasks. When all tasks are
// of this form, consider using a pool constructed in asyncMode.
//
// ForkJoinTasks are Serializable, which enables them to be
// used in extensions such as remote execution frameworks. It is
// sensible to serialize tasks only before or after, but not during,
// execution. Serialization is not relied on during execution itself.
abstract class ForkJoinTask[V] extends Object with Future[V], with Serializable {

    // Attempts to cancel execution of this task.
    def cancel(mayInterruptIfRunning: Boolean): Boolean

    // Atomically conditionally sets the tag value for this task.
    def compareAndSetForkJoinTaskTag(e: Short, tag: Short): Boolean

    // Completes this task, and if not already aborted or cancelled,
    // returning the given value as the result of subsequent
    // invocations of join and related operations.
    def complete(value: V): Unit

    // Completes this task abnormally, and if not already aborted or
    // cancelled, causes it to throw the given exception upon
    // join and related operations.
    def completeExceptionally(ex: Throwable): Unit

    // Immediately performs the base action of this task and returns
    // true if, upon return from this method, this task is guaranteed
    // to have completed normally.
    protected def exec(): Boolean

    // Arranges to asynchronously execute this task in the pool the
    // current task is running in, if applicable, or using the ForkJoinPool.commonPool() if not inForkJoinPool().
    def fork(): ForkJoinTask[V]

    // Waits if necessary for the computation to complete, and then
    // retrieves its result.
    def get(): V

    // Waits if necessary for at most the given time for the computation
    // to complete, and then retrieves its result, if available.
    def get(timeout: Long, unit: TimeUnit): V

    // Returns the exception thrown by the base computation, or a
    // CancellationException if cancelled, or null if
    // none or if the method has not yet completed.
    def getException(): Throwable

    // Returns the tag for this task.
    def getForkJoinTaskTag(): Short

    // Returns the result that would be returned by join(), even
    // if this task completed abnormally, or null if this task
    // is not known to have been completed.
    def getRawResult(): V

    // Commences performing this task, awaits its completion if
    // necessary, and returns its result, or throws an (unchecked)
    // RuntimeException or Error if the underlying
    // computation did so.
    def invoke(): V

    // Returns true if this task was cancelled before it completed
    // normally.
    def isCancelled(): Boolean

    // Returns true if this task threw an exception or was cancelled.
    def isCompletedAbnormally(): Boolean

    // Returns true if this task completed without throwing an
    // exception and was not cancelled.
    def isCompletedNormally(): Boolean

    // Returns true if this task completed.
    def isDone(): Boolean

    // Returns the result of the computation when it is
    // done.
    def join(): V

    // Completes this task normally without setting a value.
    def quietlyComplete(): Unit

    // Commences performing this task and awaits its completion if
    // necessary, without returning its result or throwing its
    // exception.
    def quietlyInvoke(): Unit

    // Joins this task, without returning its result or throwing its
    // exception.
    def quietlyJoin(): Unit

    // Resets the internal bookkeeping state of this task, allowing a
    // subsequent fork.
    def reinitialize(): Unit

    // Atomically sets the tag value for this task.
    def setForkJoinTaskTag(tag: Short): Short

    // Forces the given value to be returned as a result.
    protected def setRawResult(value: V): Unit
}

object ForkJoinTask {
    @stub
    // Returns a new ForkJoinTask that performs the call
    // method of the given Callable as its action, and returns
    // its result upon join(), translating any checked exceptions
    // encountered into RuntimeException.
    def ForkJoinTask[T]: [T] = ???

    @stub
    // Returns a new ForkJoinTask that performs the run
    // method of the given Runnable as its action, and returns
    // a null result upon join().
    def adapt(runnable: Runnable): ForkJoinTask[_] = ???

    @stub
    // Returns a new ForkJoinTask that performs the run
    // method of the given Runnable as its action, and returns
    // the given result upon join().
    def ForkJoinTask[T]: [T] = ???

    @stub
    // Returns the pool hosting the current task execution, or null
    // if this task is executing outside of any ForkJoinPool.
    def getPool(): ForkJoinPool = ???

    @stub
    // Returns an estimate of the number of tasks that have been
    // forked by the current worker thread but not yet executed.
    def getQueuedTaskCount(): Int = ???

    @stub
    // Returns an estimate of how many more locally queued tasks are
    // held by the current worker thread than there are other worker
    // threads that might steal them, or zero if this thread is not
    // operating in a ForkJoinPool.
    def getSurplusQueuedTaskCount(): Int = ???

    @stub
    // Possibly executes tasks until the pool hosting the current task
    // is quiescent.
    def helpQuiesce(): Unit = ???

    @stub
    // Returns true if the current thread is a ForkJoinWorkerThread executing as a ForkJoinPool computation.
    def inForkJoinPool(): Boolean = ???

    @stub
    // Forks all tasks in the specified collection, returning when
    // isDone holds for each task or an (unchecked) exception
    // is encountered, in which case the exception is rethrown.
    def Collection[T]: [T <: ForkJoinTask[_]] = ???

    @stub
    // Forks the given tasks, returning when isDone holds for
    // each task or an (unchecked) exception is encountered, in which
    // case the exception is rethrown.
    def invokeAll(tasks: ForkJoinTask[_]*): Unit = ???

    @stub
    // Forks the given tasks, returning when isDone holds for
    // each task or an (unchecked) exception is encountered, in which
    // case the exception is rethrown.
    def invokeAll(t1: ForkJoinTask[_], t2: ForkJoinTask[_]): Unit = ???

    @stub
    // Returns, but does not unschedule or execute, a task queued by
    // the current thread but not yet executed, if one is immediately
    // available.
    protected def peekNextLocalTask(): ForkJoinTask[_] = ???

    @stub
    // Unschedules and returns, without executing, the next task
    // queued by the current thread but not yet executed, if the
    // current thread is operating in a ForkJoinPool.
    protected def pollNextLocalTask(): ForkJoinTask[_] = ???

    @stub
    // If the current thread is operating in a ForkJoinPool,
    // unschedules and returns, without executing, the next task
    // queued by the current thread but not yet executed, if one is
    // available, or if not available, a task that was forked by some
    // other thread, if available.
    protected def pollTask(): ForkJoinTask[_] = ???
}
