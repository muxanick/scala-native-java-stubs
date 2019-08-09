package java.util.concurrent

import java.lang.{Object, Runnable}
import java.security.{PrivilegedAction, PrivilegedExceptionAction}
import scala.scalanative.annotation.stub

/** Factory and utility methods for Executor, ExecutorService, ScheduledExecutorService, ThreadFactory, and Callable classes defined in this
 *  package. This class supports the following kinds of methods:
 * 
 *  
 *     Methods that create and return an ExecutorService
 *         set up with commonly useful configuration settings.
 *     Methods that create and return a ScheduledExecutorService
 *         set up with commonly useful configuration settings.
 *     Methods that create and return a "wrapped" ExecutorService, that
 *         disables reconfiguration by making implementation-specific methods
 *         inaccessible.
 *     Methods that create and return a ThreadFactory
 *         that sets newly created threads to a known state.
 *     Methods that create and return a Callable
 *         out of other closure-like forms, so they can be used
 *         in execution methods requiring Callable.
 *  
 */
class Executors extends Object {
}

object Executors {
    /** Returns a Callable object that, when
     *  called, runs the given privileged action and returns its result.
     */
    @stub
    def callable(action: PrivilegedAction[_]): Callable[Object] = ???

    /** Returns a Callable object that, when
     *  called, runs the given privileged exception action and returns
     *  its result.
     */
    @stub
    def callable(action: PrivilegedExceptionAction[_]): Callable[Object] = ???

    /** Returns a Callable object that, when
     *  called, runs the given task and returns null.
     */
    @stub
    def callable(task: Runnable): Callable[Object] = ???

    /** Returns a Callable object that, when
     *  called, runs the given task and returns the given result.
     */
    @stub
    def callable[T](task: Runnable, result: T): Callable[T] = ???

    /** Returns a default thread factory used to create new threads. */
    @stub
    def defaultThreadFactory(): ThreadFactory = ???

    /** Creates a thread pool that creates new threads as needed, but
     *  will reuse previously constructed threads when they are
     *  available.
     */
    @stub
    def newCachedThreadPool(): ExecutorService = ???

    /** Creates a thread pool that creates new threads as needed, but
     *  will reuse previously constructed threads when they are
     *  available, and uses the provided
     *  ThreadFactory to create new threads when needed.
     */
    @stub
    def newCachedThreadPool(threadFactory: ThreadFactory): ExecutorService = ???

    /** Creates a thread pool that reuses a fixed number of threads
     *  operating off a shared unbounded queue.
     */
    @stub
    def newFixedThreadPool(nThreads: Int): ExecutorService = ???

    /** Creates a thread pool that reuses a fixed number of threads
     *  operating off a shared unbounded queue, using the provided
     *  ThreadFactory to create new threads when needed.
     */
    @stub
    def newFixedThreadPool(nThreads: Int, threadFactory: ThreadFactory): ExecutorService = ???

    /** Creates a thread pool that can schedule commands to run after a
     *  given delay, or to execute periodically.
     */
    @stub
    def newScheduledThreadPool(corePoolSize: Int): ScheduledExecutorService = ???

    /** Creates a thread pool that can schedule commands to run after a
     *  given delay, or to execute periodically.
     */
    @stub
    def newScheduledThreadPool(corePoolSize: Int, threadFactory: ThreadFactory): ScheduledExecutorService = ???

    /** Creates an Executor that uses a single worker thread operating
     *  off an unbounded queue.
     */
    @stub
    def newSingleThreadExecutor(): ExecutorService = ???

    /** Creates an Executor that uses a single worker thread operating
     *  off an unbounded queue, and uses the provided ThreadFactory to
     *  create a new thread when needed.
     */
    @stub
    def newSingleThreadExecutor(threadFactory: ThreadFactory): ExecutorService = ???

    /** Creates a single-threaded executor that can schedule commands
     *  to run after a given delay, or to execute periodically.
     */
    @stub
    def newSingleThreadScheduledExecutor(): ScheduledExecutorService = ???

    /** Creates a single-threaded executor that can schedule commands
     *  to run after a given delay, or to execute periodically.
     */
    @stub
    def newSingleThreadScheduledExecutor(threadFactory: ThreadFactory): ScheduledExecutorService = ???

    /** Creates a work-stealing thread pool using all
     *  available processors
     *  as its target parallelism level.
     */
    @stub
    def newWorkStealingPool(): ExecutorService = ???

    /** Creates a thread pool that maintains enough threads to support
     *  the given parallelism level, and may use multiple queues to
     *  reduce contention.
     */
    @stub
    def newWorkStealingPool(parallelism: Int): ExecutorService = ???

    /** Returns a Callable object that will, when called,
     *  execute the given callable under the current access
     *  control context.
     */
    @stub
    def privilegedCallable[T](callable: Callable[T]): Callable[T] = ???

    /** Returns a Callable object that will, when called,
     *  execute the given callable under the current access
     *  control context, with the current context class loader as the
     *  context class loader.
     */
    @stub
    def privilegedCallableUsingCurrentClassLoader[T](callable: Callable[T]): Callable[T] = ???

    /** Returns a thread factory used to create new threads that
     *  have the same permissions as the current thread.
     */
    @stub
    def privilegedThreadFactory(): ThreadFactory = ???

    /** Returns an object that delegates all defined ExecutorService methods to the given executor, but not any
     *  other methods that might otherwise be accessible using
     *  casts.
     */
    @stub
    def unconfigurableExecutorService(executor: ExecutorService): ExecutorService = ???

    /** Returns an object that delegates all defined ScheduledExecutorService methods to the given executor, but
     *  not any other methods that might otherwise be accessible using
     *  casts.
     */
    @stub
    def unconfigurableScheduledExecutorService(executor: ScheduledExecutorService): ScheduledExecutorService = ???
}
