package java.util.concurrent

import java.lang.{Object, Runnable, Throwable}
import scala.scalanative.annotation.stub

/** A cancellable asynchronous computation.  This class provides a base
 *  implementation of Future, with methods to start and cancel
 *  a computation, query to see if the computation is complete, and
 *  retrieve the result of the computation.  The result can only be
 *  retrieved when the computation has completed; the get
 *  methods will block if the computation has not yet completed.  Once
 *  the computation has completed, the computation cannot be restarted
 *  or cancelled (unless the computation is invoked using
 *  runAndReset()).
 * 
 *  A FutureTask can be used to wrap a Callable or
 *  Runnable object.  Because FutureTask implements
 *  Runnable, a FutureTask can be submitted to an
 *  Executor for execution.
 * 
 *  In addition to serving as a standalone class, this class provides
 *  protected functionality that may be useful when creating
 *  customized task classes.
 */
class FutureTask[V] extends Object with RunnableFuture[V] {

    /** Creates a FutureTask that will, upon running, execute the
     *  given Callable.
     */
    @stub
    def this(callable: Callable[V]) = ???

    /** Creates a FutureTask that will, upon running, execute the
     *  given Runnable, and arrange that get will return the
     *  given result on successful completion.
     */
    @stub
    def this(runnable: Runnable, result: V) = ???

    /** Attempts to cancel execution of this task. */
    @stub
    def cancel(mayInterruptIfRunning: Boolean): Boolean = ???

    /** Protected method invoked when this task transitions to state
     *  isDone (whether normally or via cancellation).
     */
    @stub
    protected def done(): Unit = ???

    /** Waits if necessary for the computation to complete, and then
     *  retrieves its result.
     */
    @stub
    def get(): V = ???

    /** Waits if necessary for at most the given time for the computation
     *  to complete, and then retrieves its result, if available.
     */
    @stub
    def get(timeout: Long, unit: TimeUnit): V = ???

    /** Returns true if this task was cancelled before it completed
     *  normally.
     */
    @stub
    def isCancelled(): Boolean = ???

    /** Returns true if this task completed. */
    @stub
    def isDone(): Boolean = ???

    /** Sets this Future to the result of its computation
     *  unless it has been cancelled.
     */
    @stub
    def run(): Unit = ???

    /** Executes the computation without setting its result, and then
     *  resets this future to initial state, failing to do so if the
     *  computation encounters an exception or is cancelled.
     */
    @stub
    protected def runAndReset(): Boolean = ???

    /** Sets the result of this future to the given value unless
     *  this future has already been set or has been cancelled.
     */
    @stub
    protected def set(v: V): Unit = ???

    /** Causes this future to report an ExecutionException
     *  with the given throwable as its cause, unless this future has
     *  already been set or has been cancelled.
     */
    @stub
    protected def setException(t: Throwable): Unit = ???
}
