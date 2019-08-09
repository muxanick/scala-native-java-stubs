package java.util.concurrent

import java.lang.{Object, Runnable, Thread.UncaughtExceptionHandler}
import java.util.{Collection, List}

// An ExecutorService for running ForkJoinTasks.
// A ForkJoinPool provides the entry point for submissions
// from non-ForkJoinTask clients, as well as management and
// monitoring operations.
//
// A ForkJoinPool differs from other kinds of ExecutorService mainly by virtue of employing
// work-stealing: all threads in the pool attempt to find and
// execute tasks submitted to the pool and/or created by other active
// tasks (eventually blocking waiting for work if none exist). This
// enables efficient processing when most tasks spawn other subtasks
// (as do most ForkJoinTasks), as well as when many small
// tasks are submitted to the pool from external clients.  Especially
// when setting asyncMode to true in constructors, ForkJoinPools may also be appropriate for use with event-style
// tasks that are never joined.
//
// A static commonPool() is available and appropriate for
// most applications. The common pool is used by any ForkJoinTask that
// is not explicitly submitted to a specified pool. Using the common
// pool normally reduces resource usage (its threads are slowly
// reclaimed during periods of non-use, and reinstated upon subsequent
// use).
//
// For applications that require separate or custom pools, a ForkJoinPool may be constructed with a given target parallelism
// level; by default, equal to the number of available processors.
// The pool attempts to maintain enough active (or available) threads
// by dynamically adding, suspending, or resuming internal worker
// threads, even if some tasks are stalled waiting to join others.
// However, no such adjustments are guaranteed in the face of blocked
// I/O or other unmanaged synchronization. The nested ForkJoinPool.ManagedBlocker interface enables extension of the kinds of
// synchronization accommodated.
//
// In addition to execution and lifecycle control methods, this
// class provides status check methods (for example
// getStealCount()) that are intended to aid in developing,
// tuning, and monitoring fork/join applications. Also, method
// toString() returns indications of pool state in a
// convenient form for informal monitoring.
//
// As is the case with other ExecutorServices, there are three
// main task execution methods summarized in the following table.
// These are designed to be used primarily by clients not already
// engaged in fork/join computations in the current pool.  The main
// forms of these methods accept instances of ForkJoinTask,
// but overloaded forms also allow mixed execution of plain Runnable- or Callable- based activities as well.  However,
// tasks that are already executing in a pool should normally instead
// use the within-computation forms listed in the table unless using
// async event-style tasks that are not usually joined, in which case
// there is little difference among choice of methods.
//
// 
// Summary of task execution methods
//  
//    
//     Call from non-fork/join clients
//     Call from within fork/join computations
//  
//  
//     Arrange async execution
//     execute(ForkJoinTask)
//     ForkJoinTask.fork()
//  
//  
//     Await and obtain result
//     invoke(ForkJoinTask)
//     ForkJoinTask.invoke()
//  
//  
//     Arrange exec and obtain Future
//     submit(ForkJoinTask)
//     ForkJoinTask.fork() (ForkJoinTasks are Futures)
//  
// 
//
// The common pool is by default constructed with default
// parameters, but these may be controlled by setting three
// system properties:
// 
// java.util.concurrent.ForkJoinPool.common.parallelism
// - the parallelism level, a non-negative integer
// java.util.concurrent.ForkJoinPool.common.threadFactory
// - the class name of a ForkJoinPool.ForkJoinWorkerThreadFactory
// java.util.concurrent.ForkJoinPool.common.exceptionHandler
// - the class name of a Thread.UncaughtExceptionHandler
// 
// If a SecurityManager is present and no factory is
// specified, then the default pool uses a factory supplying
// threads that have no Permissions enabled.
// The system class loader is used to load these classes.
// Upon any error in establishing these settings, default parameters
// are used. It is possible to disable or limit the use of threads in
// the common pool by setting the parallelism property to zero, and/or
// using a factory that may return null. However doing so may
// cause unjoined tasks to never be executed.
//
// Implementation notes: This implementation restricts the
// maximum number of running threads to 32767. Attempts to create
// pools with greater than the maximum number result in
// IllegalArgumentException.
//
// This implementation rejects submitted tasks (that is, by throwing
// RejectedExecutionException) only when the pool is shut down
// or internal resources have been exhausted.
class ForkJoinPool extends AbstractExecutorService {

    @stub
    // Creates a ForkJoinPool with parallelism equal to Runtime.availableProcessors(), using the default thread factory,
    // no UncaughtExceptionHandler, and non-async LIFO processing mode.
    def this() = ???

    @stub
    // Creates a ForkJoinPool with the indicated parallelism
    // level, the default thread factory,
    // no UncaughtExceptionHandler, and non-async LIFO processing mode.
    def this(parallelism: Int) = ???

    @stub
    // If called by a ForkJoinTask operating in this pool, equivalent
    // in effect to ForkJoinTask.helpQuiesce().
    def awaitQuiescence(timeout: Long, unit: TimeUnit): Boolean = ???

    @stub
    // Blocks until all tasks have completed execution after a
    // shutdown request, or the timeout occurs, or the current thread
    // is interrupted, whichever happens first.
    def awaitTermination(timeout: Long, unit: TimeUnit): Boolean = ???

    @stub
    // Removes all available unexecuted submitted and forked tasks
    // from scheduling queues and adds them to the given collection,
    // without altering their execution status.
    protected def drainTasksTo(c: Collection[_ >: ForkJoinTask[_]]): Int = ???

    @stub
    // Arranges for (asynchronous) execution of the given task.
    def execute(task: ForkJoinTask[_]): Unit = ???

    @stub
    // Executes the given command at some time in the future.
    def execute(task: Runnable): Unit = ???

    @stub
    // Returns an estimate of the number of threads that are currently
    // stealing or executing tasks.
    def getActiveThreadCount(): Int = ???

    @stub
    // Returns true if this pool uses local first-in-first-out
    // scheduling mode for forked tasks that are never joined.
    def getAsyncMode(): Boolean = ???

    @stub
    // Returns the factory used for constructing new workers.
    def getFactory(): ForkJoinPool.ForkJoinWorkerThreadFactory = ???

    @stub
    // Returns the targeted parallelism level of this pool.
    def getParallelism(): Int = ???

    @stub
    // Returns the number of worker threads that have started but not
    // yet terminated.
    def getPoolSize(): Int = ???

    @stub
    // Returns an estimate of the number of tasks submitted to this
    // pool that have not yet begun executing.
    def getQueuedSubmissionCount(): Int = ???

    @stub
    // Returns an estimate of the total number of tasks currently held
    // in queues by worker threads (but not including tasks submitted
    // to the pool that have not begun executing).
    def getQueuedTaskCount(): Long = ???

    @stub
    // Returns an estimate of the number of worker threads that are
    // not blocked waiting to join tasks or for other managed
    // synchronization.
    def getRunningThreadCount(): Int = ???

    @stub
    // Returns an estimate of the total number of tasks stolen from
    // one thread's work queue by another.
    def getStealCount(): Long = ???

    @stub
    // Returns the handler for internal worker threads that terminate
    // due to unrecoverable errors encountered while executing tasks.
    def getUncaughtExceptionHandler(): Thread.UncaughtExceptionHandler = ???

    @stub
    // Returns true if there are any tasks submitted to this
    // pool that have not yet begun executing.
    def hasQueuedSubmissions(): Boolean = ???

    @stub
    // Performs the given task, returning its result upon completion.
    def T: [T] = ???

    @stub
    // Executes the given tasks, returning a list of Futures holding
    // their status and results when all complete.
    def List[Future[T]]: [T] = ???

    @stub
    // Returns true if all worker threads are currently idle.
    def isQuiescent(): Boolean = ???

    @stub
    // Returns true if this pool has been shut down.
    def isShutdown(): Boolean = ???

    @stub
    // Returns true if all tasks have completed following shut down.
    def isTerminated(): Boolean = ???

    @stub
    // Returns true if the process of termination has
    // commenced but not yet completed.
    def isTerminating(): Boolean = ???

    @stub
    // Returns a RunnableFuture for the given callable task.
    def RunnableFuture[T]: protected[T] = ???

    @stub
    // Returns a RunnableFuture for the given runnable and default
    // value.
    def RunnableFuture[T]: protected[T] = ???

    @stub
    // Removes and returns the next unexecuted submission if one is
    // available.
    protected def pollSubmission(): ForkJoinTask[_] = ???

    @stub
    // Possibly initiates an orderly shutdown in which previously
    // submitted tasks are executed, but no new tasks will be
    // accepted.
    def shutdown(): Unit = ???

    @stub
    // Possibly attempts to cancel and/or stop all tasks, and reject
    // all subsequently submitted tasks.
    def shutdownNow(): List[Runnable] = ???

    @stub
    // Submits a value-returning task for execution and returns a
    // Future representing the pending results of the task.
    def ForkJoinTask[T]: [T] = ???

    @stub
    // Submits a ForkJoinTask for execution.
    def ForkJoinTask[T]: [T] = ???

    @stub
    // Submits a Runnable task for execution and returns a Future
    // representing that task.
    def submit(task: Runnable): ForkJoinTask[_] = ???

    @stub
    // Submits a Runnable task for execution and returns a Future
    // representing that task.
    def ForkJoinTask[T]: [T] = ???
}

object ForkJoinPool {
    @stub
    // Factory for creating new ForkJoinWorkerThreads.
    def ForkJoinPool.ForkJoinWorkerThreadFactory: trait = ???

    @stub
    // Returns the common pool instance.
    def commonPool(): ForkJoinPool = ???

    @stub
    // Returns the targeted parallelism level of the common pool.
    def getCommonPoolParallelism(): Int = ???

    @stub
    // Runs the given possibly blocking task.
    def managedBlock(blocker: ForkJoinPool.ManagedBlocker): Unit = ???
}
