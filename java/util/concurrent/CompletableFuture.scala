package java.util.concurrent

import java.lang.{Object, Runnable, String, Throwable, Void}
import java.util.function.{BiConsumer, BiFunction, Consumer, Function, Supplier}
import scala.scalanative.annotation.stub

/** A Future that may be explicitly completed (setting its
 *  value and status), and may be used as a CompletionStage,
 *  supporting dependent functions and actions that trigger upon its
 *  completion.
 * 
 *  When two or more threads attempt to
 *  complete,
 *  completeExceptionally, or
 *  cancel
 *  a CompletableFuture, only one of them succeeds.
 * 
 *  In addition to these and related methods for directly
 *  manipulating status and results, CompletableFuture implements
 *  interface CompletionStage with the following policies: 
 * 
 *  Actions supplied for dependent completions of
 *  non-async methods may be performed by the thread that
 *  completes the current CompletableFuture, or by any other caller of
 *  a completion method.
 * 
 *  All async methods without an explicit Executor
 *  argument are performed using the ForkJoinPool.commonPool()
 *  (unless it does not support a parallelism level of at least two, in
 *  which case, a new Thread is created to run each task).  To simplify
 *  monitoring, debugging, and tracking, all generated asynchronous
 *  tasks are instances of the marker interface CompletableFuture.AsynchronousCompletionTask. 
 * 
 *  All CompletionStage methods are implemented independently of
 *  other public methods, so the behavior of one method is not impacted
 *  by overrides of others in subclasses.   
 * 
 *  CompletableFuture also implements Future with the following
 *  policies: 
 * 
 *  Since (unlike FutureTask) this class has no direct
 *  control over the computation that causes it to be completed,
 *  cancellation is treated as just another form of exceptional
 *  completion.  Method cancel has the same effect as
 *  completeExceptionally(new CancellationException()). Method
 *  isCompletedExceptionally() can be used to determine if a
 *  CompletableFuture completed in any exceptional fashion.
 * 
 *  In case of exceptional completion with a CompletionException,
 *  methods get() and get(long, TimeUnit) throw an
 *  ExecutionException with the same cause as held in the
 *  corresponding CompletionException.  To simplify usage in most
 *  contexts, this class also defines methods join() and
 *  getNow(T) that instead throw the CompletionException directly
 *  in these cases. 
 */
class CompletableFuture[T] extends Object with Future[T] with CompletionStage[T] {

    /** Creates a new incomplete CompletableFuture. */
    @stub
    def this() = ???

    /** Returns a new CompletionStage that, when either this or the
     *  other given stage complete normally, is executed with the
     *  corresponding result as argument to the supplied action.
     */
    @stub
    def acceptEither(other: CompletionStage[_ <: T], action: Consumer[_ >: T]): CompletableFuture[Void] = ???

    /** Returns a new CompletionStage that, when either this or the
     *  other given stage complete normally, is executed using this
     *  stage's default asynchronous execution facility, with the
     *  corresponding result as argument to the supplied action.
     */
    @stub
    def acceptEitherAsync(other: CompletionStage[_ <: T], action: Consumer[_ >: T]): CompletableFuture[Void] = ???

    /** Returns a new CompletionStage that, when either this or the
     *  other given stage complete normally, is executed using the
     *  supplied executor, with the corresponding result as argument to
     *  the supplied function.
     */
    @stub
    def acceptEitherAsync(other: CompletionStage[_ <: T], action: Consumer[_ >: T], executor: Executor): CompletableFuture[Void] = ???

    /** Returns a new CompletionStage that, when either this or the
     *  other given stage complete normally, is executed with the
     *  corresponding result as argument to the supplied function.
     */
    @stub
    def applyToEither[U](other: CompletionStage[_ <: T], fn: Function[_ >: T, U]): CompletableFuture[U] = ???

    /** Returns a new CompletionStage that, when either this or the
     *  other given stage complete normally, is executed using this
     *  stage's default asynchronous execution facility, with the
     *  corresponding result as argument to the supplied function.
     */
    @stub
    def applyToEitherAsync[U](other: CompletionStage[_ <: T], fn: Function[_ >: T, U]): CompletableFuture[U] = ???

    /** Returns a new CompletionStage that, when either this or the
     *  other given stage complete normally, is executed using the
     *  supplied executor, with the corresponding result as argument to
     *  the supplied function.
     */
    @stub
    def applyToEitherAsync[U](other: CompletionStage[_ <: T], fn: Function[_ >: T, U], executor: Executor): CompletableFuture[U] = ???

    /** If not already completed, completes this CompletableFuture with
     *  a CancellationException.
     */
    @stub
    def cancel(mayInterruptIfRunning: Boolean): Boolean = ???

    /** If not already completed, sets the value returned by get() and related methods to the given value. */
    @stub
    def complete(value: T): Boolean = ???

    /** If not already completed, causes invocations of get()
     *  and related methods to throw the given exception.
     */
    @stub
    def completeExceptionally(ex: Throwable): Boolean = ???

    /** Returns a new CompletableFuture that is completed when this
     *  CompletableFuture completes, with the result of the given
     *  function of the exception triggering this CompletableFuture's
     *  completion when it completes exceptionally; otherwise, if this
     *  CompletableFuture completes normally, then the returned
     *  CompletableFuture also completes normally with the same value.
     */
    @stub
    def exceptionally(fn: Function[Throwable, _ <: T]): CompletableFuture[T] = ???

    /** Waits if necessary for this future to complete, and then
     *  returns its result.
     */
    @stub
    def get(): T = ???

    /** Waits if necessary for at most the given time for this future
     *  to complete, and then returns its result, if available.
     */
    @stub
    def get(timeout: Long, unit: TimeUnit): T = ???

    /** Returns the result value (or throws any encountered exception)
     *  if completed, else returns the given valueIfAbsent.
     */
    @stub
    def getNow(valueIfAbsent: T): T = ???

    /** Returns the estimated number of CompletableFutures whose
     *  completions are awaiting completion of this CompletableFuture.
     */
    @stub
    def getNumberOfDependents(): Int = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  either normally or exceptionally, is executed with this stage's
     *  result and exception as arguments to the supplied function.
     */
    @stub
    def handle[U](fn: BiFunction[_ >: T, Throwable, _ <: U]): CompletableFuture[U] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  either normally or exceptionally, is executed using this stage's
     *  default asynchronous execution facility, with this stage's
     *  result and exception as arguments to the supplied function.
     */
    @stub
    def handleAsync[U](fn: BiFunction[_ >: T, Throwable, _ <: U]): CompletableFuture[U] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  either normally or exceptionally, is executed using the
     *  supplied executor, with this stage's result and exception as
     *  arguments to the supplied function.
     */
    @stub
    def handleAsync[U](fn: BiFunction[_ >: T, Throwable, _ <: U], executor: Executor): CompletableFuture[U] = ???

    /** Returns true if this CompletableFuture was cancelled
     *  before it completed normally.
     */
    @stub
    def isCancelled(): Boolean = ???

    /** Returns true if this CompletableFuture completed
     *  exceptionally, in any way.
     */
    @stub
    def isCompletedExceptionally(): Boolean = ???

    /** Returns true if completed in any fashion: normally,
     *  exceptionally, or via cancellation.
     */
    @stub
    def isDone(): Boolean = ???

    /** Returns the result value when complete, or throws an
     *  (unchecked) exception if completed exceptionally.
     */
    @stub
    def join(): T = ???

    /** Forcibly causes subsequent invocations of method get()
     *  and related methods to throw the given exception, whether or
     *  not already completed.
     */
    @stub
    def obtrudeException(ex: Throwable): Unit = ???

    /** Forcibly sets or resets the value subsequently returned by
     *  method get() and related methods, whether or not
     *  already completed.
     */
    @stub
    def obtrudeValue(value: T): Unit = ???

    /** Returns a new CompletionStage that, when this and the other
     *  given stage both complete normally, executes the given action.
     */
    @stub
    def runAfterBoth(other: CompletionStage[_], action: Runnable): CompletableFuture[Void] = ???

    /** Returns a new CompletionStage that, when this and the other
     *  given stage complete normally, executes the given action using
     *  this stage's default asynchronous execution facility.
     */
    @stub
    def runAfterBothAsync(other: CompletionStage[_], action: Runnable): CompletableFuture[Void] = ???

    /** Returns a new CompletionStage that, when this and the other
     *  given stage complete normally, executes the given action using
     *  the supplied executor.
     */
    @stub
    def runAfterBothAsync(other: CompletionStage[_], action: Runnable, executor: Executor): CompletableFuture[Void] = ???

    /** Returns a new CompletionStage that, when either this or the
     *  other given stage complete normally, executes the given action.
     */
    @stub
    def runAfterEither(other: CompletionStage[_], action: Runnable): CompletableFuture[Void] = ???

    /** Returns a new CompletionStage that, when either this or the
     *  other given stage complete normally, executes the given action
     *  using this stage's default asynchronous execution facility.
     */
    @stub
    def runAfterEitherAsync(other: CompletionStage[_], action: Runnable): CompletableFuture[Void] = ???

    /** Returns a new CompletionStage that, when either this or the
     *  other given stage complete normally, executes the given action
     *  using the supplied executor.
     */
    @stub
    def runAfterEitherAsync(other: CompletionStage[_], action: Runnable, executor: Executor): CompletableFuture[Void] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, is executed with this stage's result as the argument
     *  to the supplied action.
     */
    @stub
    def thenAccept(action: Consumer[_ >: T]): CompletableFuture[Void] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, is executed using this stage's default asynchronous
     *  execution facility, with this stage's result as the argument to
     *  the supplied action.
     */
    @stub
    def thenAcceptAsync(action: Consumer[_ >: T]): CompletableFuture[Void] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, is executed using the supplied Executor, with this
     *  stage's result as the argument to the supplied action.
     */
    @stub
    def thenAcceptAsync(action: Consumer[_ >: T], executor: Executor): CompletableFuture[Void] = ???

    /** Returns a new CompletionStage that, when this and the other
     *  given stage both complete normally, is executed with the two
     *  results as arguments to the supplied action.
     */
    @stub
    def thenAcceptBoth[U](other: CompletionStage[_ <: U], action: BiConsumer[_ >: T, _ >: U]): CompletableFuture[Void] = ???

    /** Returns a new CompletionStage that, when this and the other
     *  given stage complete normally, is executed using this stage's
     *  default asynchronous execution facility, with the two results
     *  as arguments to the supplied action.
     */
    @stub
    def thenAcceptBothAsync[U](other: CompletionStage[_ <: U], action: BiConsumer[_ >: T, _ >: U]): CompletableFuture[Void] = ???

    /** Returns a new CompletionStage that, when this and the other
     *  given stage complete normally, is executed using the supplied
     *  executor, with the two results as arguments to the supplied
     *  function.
     */
    @stub
    def thenAcceptBothAsync[U](other: CompletionStage[_ <: U], action: BiConsumer[_ >: T, _ >: U], executor: Executor): CompletableFuture[Void] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, is executed with this stage's result as the argument
     *  to the supplied function.
     */
    @stub
    def thenApply[U](fn: Function[_ >: T, _ <: U]): CompletableFuture[U] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, is executed using this stage's default asynchronous
     *  execution facility, with this stage's result as the argument to
     *  the supplied function.
     */
    @stub
    def thenApplyAsync[U](fn: Function[_ >: T, _ <: U]): CompletableFuture[U] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, is executed using the supplied Executor, with this
     *  stage's result as the argument to the supplied function.
     */
    @stub
    def thenApplyAsync[U](fn: Function[_ >: T, _ <: U], executor: Executor): CompletableFuture[U] = ???

    /** Returns a new CompletionStage that, when this and the other
     *  given stage both complete normally, is executed with the two
     *  results as arguments to the supplied function.
     */
    @stub
    def thenCombine[U, V](other: CompletionStage[_ <: U], fn: BiFunction[_ >: T, _ >: U, _ <: V]): CompletableFuture[V] = ???

    /** Returns a new CompletionStage that, when this and the other
     *  given stage complete normally, is executed using this stage's
     *  default asynchronous execution facility, with the two results
     *  as arguments to the supplied function.
     */
    @stub
    def thenCombineAsync[U, V](other: CompletionStage[_ <: U], fn: BiFunction[_ >: T, _ >: U, _ <: V]): CompletableFuture[V] = ???

    /** Returns a new CompletionStage that, when this and the other
     *  given stage complete normally, is executed using the supplied
     *  executor, with the two results as arguments to the supplied
     *  function.
     */
    @stub
    def thenCombineAsync[U, V](other: CompletionStage[_ <: U], fn: BiFunction[_ >: T, _ >: U, _ <: V], executor: Executor): CompletableFuture[V] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, is executed with this stage as the argument
     *  to the supplied function.
     */
    @stub
    def thenCompose[U](fn: Function[_ >: T, _ <: CompletionStage[U]]): CompletableFuture[U] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, is executed using this stage's default asynchronous
     *  execution facility, with this stage as the argument to the
     *  supplied function.
     */
    @stub
    def thenComposeAsync[U](fn: Function[_ >: T, _ <: CompletionStage[U]]): CompletableFuture[U] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, is executed using the supplied Executor, with this
     *  stage's result as the argument to the supplied function.
     */
    @stub
    def thenComposeAsync[U](fn: Function[_ >: T, _ <: CompletionStage[U]], executor: Executor): CompletableFuture[U] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, executes the given action.
     */
    @stub
    def thenRun(action: Runnable): CompletableFuture[Void] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, executes the given action using this stage's default
     *  asynchronous execution facility.
     */
    @stub
    def thenRunAsync(action: Runnable): CompletableFuture[Void] = ???

    /** Returns a new CompletionStage that, when this stage completes
     *  normally, executes the given action using the supplied Executor.
     */
    @stub
    def thenRunAsync(action: Runnable, executor: Executor): CompletableFuture[Void] = ???

    /** Returns this CompletableFuture. */
    @stub
    def toCompletableFuture(): CompletableFuture[T] = ???

    /** Returns a string identifying this CompletableFuture, as well as
     *  its completion state.
     */
    @stub
    def toString(): String = ???

    /** Returns a new CompletionStage with the same result or exception as
     *  this stage, that executes the given action when this stage completes.
     */
    @stub
    def whenComplete(action: BiConsumer[_ >: T, _ >: Throwable]): CompletableFuture[T] = ???

    /** Returns a new CompletionStage with the same result or exception as
     *  this stage, that executes the given action using this stage's
     *  default asynchronous execution facility when this stage completes.
     */
    @stub
    def whenCompleteAsync(action: BiConsumer[_ >: T, _ >: Throwable]): CompletableFuture[T] = ???

    /** Returns a new CompletionStage with the same result or exception as
     *  this stage, that executes the given action using the supplied
     *  Executor when this stage completes.
     */
    @stub
    def whenCompleteAsync(action: BiConsumer[_ >: T, _ >: Throwable], executor: Executor): CompletableFuture[T] = ???
}

object CompletableFuture {
    /** A marker interface identifying asynchronous tasks produced by
     *  async methods.
     */
    type AsynchronousCompletionTask = CompletableFuture_AsynchronousCompletionTask

    /** Returns a new CompletableFuture that is completed when all of
     *  the given CompletableFutures complete.
     */
    @stub
    def allOf(cfs: CompletableFuture[_]*): CompletableFuture[Void] = ???

    /** Returns a new CompletableFuture that is completed when any of
     *  the given CompletableFutures complete, with the same result.
     */
    @stub
    def anyOf(cfs: CompletableFuture[_]*): CompletableFuture[Object] = ???

    /** Returns a new CompletableFuture that is already completed with
     *  the given value.
     */
    @stub
    def completedFuture[U](value: U): CompletableFuture[U] = ???

    /** Returns a new CompletableFuture that is asynchronously completed
     *  by a task running in the ForkJoinPool.commonPool() after
     *  it runs the given action.
     */
    @stub
    def runAsync(runnable: Runnable): CompletableFuture[Void] = ???

    /** Returns a new CompletableFuture that is asynchronously completed
     *  by a task running in the given executor after it runs the given
     *  action.
     */
    @stub
    def runAsync(runnable: Runnable, executor: Executor): CompletableFuture[Void] = ???

    /** Returns a new CompletableFuture that is asynchronously completed
     *  by a task running in the ForkJoinPool.commonPool() with
     *  the value obtained by calling the given Supplier.
     */
    @stub
    def supplyAsync[U](supplier: Supplier[U]): CompletableFuture[U] = ???

    /** Returns a new CompletableFuture that is asynchronously completed
     *  by a task running in the given executor with the value obtained
     *  by calling the given Supplier.
     */
    @stub
    def supplyAsync[U](supplier: Supplier[U], executor: Executor): CompletableFuture[U] = ???
}
