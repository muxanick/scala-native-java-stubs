package java.util.concurrent

import java.lang.{Object, Runnable}
import java.util.{Collection, List}

/** Provides default implementations of ExecutorService
 *  execution methods. This class implements the submit,
 *  invokeAny and invokeAll methods using a
 *  RunnableFuture returned by newTaskFor, which defaults
 *  to the FutureTask class provided in this package.  For example,
 *  the implementation of submit(Runnable) creates an
 *  associated RunnableFuture that is executed and
 *  returned. Subclasses may override the newTaskFor methods
 *  to return RunnableFuture implementations other than
 *  FutureTask.
 * 
 *  Extension example. Here is a sketch of a class
 *  that customizes ThreadPoolExecutor to use
 *  a CustomTask class instead of the default FutureTask:
 *    
 *  public class CustomThreadPoolExecutor extends ThreadPoolExecutor {
 * 
 *    static class CustomTask<V> implements RunnableFuture<V> {...}
 * 
 *    protected <V> RunnableFuture<V> newTaskFor(Callable<V> c) {
 *        return new CustomTask<V>(c);
 *    }
 *    protected <V> RunnableFuture<V> newTaskFor(Runnable r, V v) {
 *        return new CustomTask<V>(r, v);
 *    }
 *    // ... add constructors, etc.
 *  }
 */
abstract class AbstractExecutorService extends Object with ExecutorService {

    /** Executes the given tasks, returning a list of Futures holding
     *  their status and results when all complete.
     */
    def invokeAll[T](tasks: Collection[_ <: Callable[T]]): List[Future[T]]

    /** Executes the given tasks, returning a list of Futures holding
     *  their status and results
     *  when all complete or the timeout expires, whichever happens first.
     */
    def invokeAll[T](tasks: Collection[_ <: Callable[T]], timeout: Long, unit: TimeUnit): List[Future[T]]

    /** Executes the given tasks, returning the result
     *  of one that has completed successfully (i.e., without throwing
     *  an exception), if any do.
     */
    def invokeAny[T](tasks: Collection[_ <: Callable[T]]): T

    /** Executes the given tasks, returning the result
     *  of one that has completed successfully (i.e., without throwing
     *  an exception), if any do before the given timeout elapses.
     */
    def invokeAny[T](tasks: Collection[_ <: Callable[T]], timeout: Long, unit: TimeUnit): T

    /** Returns a RunnableFuture for the given callable task. */
    val RunnableFuture[T]: protected[T]

    /** Returns a RunnableFuture for the given runnable and default
     *  value.
     */
    val RunnableFuture[T]: protected[T]

    /** Submits a value-returning task for execution and returns a
     *  Future representing the pending results of the task.
     */
    def submit[T](task: Callable[T]): Future[T]

    /** Submits a Runnable task for execution and returns a Future
     *  representing that task.
     */
    def submit(task: Runnable): Future[_]
}
