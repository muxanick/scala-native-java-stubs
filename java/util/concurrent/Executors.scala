package java.util.concurrent

import java.lang.{Object, Runnable}
import java.security.{PrivilegedAction, PrivilegedExceptionAction}

// Factory and utility methods for Executor, ExecutorService, ScheduledExecutorService, ThreadFactory, and Callable classes defined in this
// package. This class supports the following kinds of methods:
//
// 
//    Methods that create and return an ExecutorService
//        set up with commonly useful configuration settings.
//    Methods that create and return a ScheduledExecutorService
//        set up with commonly useful configuration settings.
//    Methods that create and return a "wrapped" ExecutorService, that
//        disables reconfiguration by making implementation-specific methods
//        inaccessible.
//    Methods that create and return a ThreadFactory
//        that sets newly created threads to a known state.
//    Methods that create and return a Callable
//        out of other closure-like forms, so they can be used
//        in execution methods requiring Callable.
// 
class Executors extends Object {
}

object Executors {
    @stub
    // Returns a Callable object that, when
    // called, runs the given privileged action and returns its result.
    def callable(action: PrivilegedAction[_]): Callable[Object] = ???

    @stub
    // Returns a Callable object that, when
    // called, runs the given privileged exception action and returns
    // its result.
    def callable(action: PrivilegedExceptionAction[_]): Callable[Object] = ???

    @stub
    // Returns a Callable object that, when
    // called, runs the given task and returns null.
    def callable(task: Runnable): Callable[Object] = ???

    @stub
    // Returns a Callable object that, when
    // called, runs the given task and returns the given result.
    def Callable[T]: [T] = ???

    @stub
    // Returns a default thread factory used to create new threads.
    def defaultThreadFactory(): ThreadFactory = ???

    @stub
    // Creates a thread pool that creates new threads as needed, but
    // will reuse previously constructed threads when they are
    // available.
    def newCachedThreadPool(): ExecutorService = ???

    @stub
    // Creates a thread pool that creates new threads as needed, but
    // will reuse previously constructed threads when they are
    // available, and uses the provided
    // ThreadFactory to create new threads when needed.
    def newCachedThreadPool(threadFactory: ThreadFactory): ExecutorService = ???

    @stub
    // Creates a thread pool that reuses a fixed number of threads
    // operating off a shared unbounded queue.
    def newFixedThreadPool(nThreads: Int): ExecutorService = ???

    @stub
    // Creates a thread pool that reuses a fixed number of threads
    // operating off a shared unbounded queue, using the provided
    // ThreadFactory to create new threads when needed.
    def newFixedThreadPool(nThreads: Int, threadFactory: ThreadFactory): ExecutorService = ???

    @stub
    // Creates a thread pool that can schedule commands to run after a
    // given delay, or to execute periodically.
    def newScheduledThreadPool(corePoolSize: Int): ScheduledExecutorService = ???

    @stub
    // Creates a thread pool that can schedule commands to run after a
    // given delay, or to execute periodically.
    def newScheduledThreadPool(corePoolSize: Int, threadFactory: ThreadFactory): ScheduledExecutorService = ???

    @stub
    // Creates an Executor that uses a single worker thread operating
    // off an unbounded queue.
    def newSingleThreadExecutor(): ExecutorService = ???

    @stub
    // Creates an Executor that uses a single worker thread operating
    // off an unbounded queue, and uses the provided ThreadFactory to
    // create a new thread when needed.
    def newSingleThreadExecutor(threadFactory: ThreadFactory): ExecutorService = ???

    @stub
    // Creates a single-threaded executor that can schedule commands
    // to run after a given delay, or to execute periodically.
    def newSingleThreadScheduledExecutor(): ScheduledExecutorService = ???

    @stub
    // Creates a single-threaded executor that can schedule commands
    // to run after a given delay, or to execute periodically.
    def newSingleThreadScheduledExecutor(threadFactory: ThreadFactory): ScheduledExecutorService = ???

    @stub
    // Creates a work-stealing thread pool using all
    // available processors
    // as its target parallelism level.
    def newWorkStealingPool(): ExecutorService = ???

    @stub
    // Creates a thread pool that maintains enough threads to support
    // the given parallelism level, and may use multiple queues to
    // reduce contention.
    def newWorkStealingPool(parallelism: Int): ExecutorService = ???

    @stub
    // Returns a Callable object that will, when called,
    // execute the given callable under the current access
    // control context.
    def Callable[T]: [T] = ???

    @stub
    // Returns a Callable object that will, when called,
    // execute the given callable under the current access
    // control context, with the current context class loader as the
    // context class loader.
    def Callable[T]: [T] = ???

    @stub
    // Returns a thread factory used to create new threads that
    // have the same permissions as the current thread.
    def privilegedThreadFactory(): ThreadFactory = ???

    @stub
    // Returns an object that delegates all defined ExecutorService methods to the given executor, but not any
    // other methods that might otherwise be accessible using
    // casts.
    def unconfigurableExecutorService(executor: ExecutorService): ExecutorService = ???
}
