package java.util.concurrent

import java.lang.{Object, Runnable, String, Thread.UncaughtExceptionHandler}
import java.util.{Collection, List}
import scala.scalanative.annotation.stub

/** An ExecutorService for running ForkJoinTasks.
 *  A ForkJoinPool provides the entry point for submissions
 *  from non-ForkJoinTask clients, as well as management and
 *  monitoring operations.
 * 
 *  A ForkJoinPool differs from other kinds of ExecutorService mainly by virtue of employing
 *  work-stealing: all threads in the pool attempt to find and
 *  execute tasks submitted to the pool and/or created by other active
 *  tasks (eventually blocking waiting for work if none exist). This
 *  enables efficient processing when most tasks spawn other subtasks
 *  (as do most ForkJoinTasks), as well as when many small
 *  tasks are submitted to the pool from external clients.  Especially
 *  when setting asyncMode to true in constructors, ForkJoinPools may also be appropriate for use with event-style
 *  tasks that are never joined.
 * 
 *  A static commonPool() is available and appropriate for
 *  most applications. The common pool is used by any ForkJoinTask that
 *  is not explicitly submitted to a specified pool. Using the common
 *  pool normally reduces resource usage (its threads are slowly
 *  reclaimed during periods of non-use, and reinstated upon subsequent
 *  use).
 * 
 *  For applications that require separate or custom pools, a ForkJoinPool may be constructed with a given target parallelism
 *  level; by default, equal to the number of available processors.
 *  The pool attempts to maintain enough active (or available) threads
 *  by dynamically adding, suspending, or resuming internal worker
 *  threads, even if some tasks are stalled waiting to join others.
 *  However, no such adjustments are guaranteed in the face of blocked
 *  I/O or other unmanaged synchronization. The nested ForkJoinPool.ManagedBlocker interface enables extension of the kinds of
 *  synchronization accommodated.
 * 
 *  In addition to execution and lifecycle control methods, this
 *  class provides status check methods (for example
 *  getStealCount()) that are intended to aid in developing,
 *  tuning, and monitoring fork/join applications. Also, method
 *  toString() returns indications of pool state in a
 *  convenient form for informal monitoring.
 * 
 *  As is the case with other ExecutorServices, there are three
 *  main task execution methods summarized in the following table.
 *  These are designed to be used primarily by clients not already
 *  engaged in fork/join computations in the current pool.  The main
 *  forms of these methods accept instances of ForkJoinTask,
 *  but overloaded forms also allow mixed execution of plain Runnable- or Callable- based activities as well.  However,
 *  tasks that are already executing in a pool should normally instead
 *  use the within-computation forms listed in the table unless using
 *  async event-style tasks that are not usually joined, in which case
 *  there is little difference among choice of methods.
 * 
 *  
 *  Summary of task execution methods
 *   
 *     
 *      Call from non-fork/join clients
 *      Call from within fork/join computations
 *   
 *   
 *      Arrange async execution
 *      execute(ForkJoinTask)
 *      ForkJoinTask.fork()
 *   
 *   
 *      Await and obtain result
 *      invoke(ForkJoinTask)
 *      ForkJoinTask.invoke()
 *   
 *   
 *      Arrange exec and obtain Future
 *      submit(ForkJoinTask)
 *      ForkJoinTask.fork() (ForkJoinTasks are Futures)
 *   
 *  
 * 
 *  The common pool is by default constructed with default
 *  parameters, but these may be controlled by setting three
 *  system properties:
 *  
 *  java.util.concurrent.ForkJoinPool.common.parallelism
 *  - the parallelism level, a non-negative integer
 *  java.util.concurrent.ForkJoinPool.common.threadFactory
 *  - the class name of a ForkJoinPool.ForkJoinWorkerThreadFactory
 *  java.util.concurrent.ForkJoinPool.common.exceptionHandler
 *  - the class name of a Thread.UncaughtExceptionHandler
 *  
 *  If a SecurityManager is present and no factory is
 *  specified, then the default pool uses a factory supplying
 *  threads that have no Permissions enabled.
 *  The system class loader is used to load these classes.
 *  Upon any error in establishing these settings, default parameters
 *  are used. It is possible to disable or limit the use of threads in
 *  the common pool by setting the parallelism property to zero, and/or
 *  using a factory that may return null. However doing so may
 *  cause unjoined tasks to never be executed.
 * 
 *  Implementation notes: This implementation restricts the
 *  maximum number of running threads to 32767. Attempts to create
 *  pools with greater than the maximum number result in
 *  IllegalArgumentException.
 * 
 *  This implementation rejects submitted tasks (that is, by throwing
 *  RejectedExecutionException) only when the pool is shut down
 *  or internal resources have been exhausted.
 */
class ForkJoinPool extends AbstractExecutorService {

    /** Creates a ForkJoinPool with parallelism equal to Runtime.availableProcessors(), using the default thread factory,
     *  no UncaughtExceptionHandler, and non-async LIFO processing mode.
     */
    @stub
    def this() = ???

    /** Creates a ForkJoinPool with the indicated parallelism
     *  level, the default thread factory,
     *  no UncaughtExceptionHandler, and non-async LIFO processing mode.
     */
    @stub
    def this(parallelism: Int) = ???

    /** Creates a ForkJoinPool with the given parameters. */
    @stub
    def this(parallelism: Int, factory: ForkJoinPool.ForkJoinWorkerThreadFactory, handler: Thread.UncaughtExceptionHandler, asyncMode: Boolean) = ???

    /** If called by a ForkJoinTask operating in this pool, equivalent
     *  in effect to ForkJoinTask.helpQuiesce().
     */
    @stub
    def awaitQuiescence(timeout: Long, unit: TimeUnit): Boolean = ???

    /** Blocks until all tasks have completed execution after a
     *  shutdown request, or the timeout occurs, or the current thread
     *  is interrupted, whichever happens first.
     */
    @stub
    def awaitTermination(timeout: Long, unit: TimeUnit): Boolean = ???

    /** Removes all available unexecuted submitted and forked tasks
     *  from scheduling queues and adds them to the given collection,
     *  without altering their execution status.
     */
    @stub
    protected def drainTasksTo(c: Collection[_ >: ForkJoinTask[_]]): Int = ???

    /** Arranges for (asynchronous) execution of the given task. */
    @stub
    def execute(task: ForkJoinTask[_]): Unit = ???

    /** Executes the given command at some time in the future. */
    @stub
    def execute(task: Runnable): Unit = ???

    /** Returns an estimate of the number of threads that are currently
     *  stealing or executing tasks.
     */
    @stub
    def getActiveThreadCount(): Int = ???

    /** Returns true if this pool uses local first-in-first-out
     *  scheduling mode for forked tasks that are never joined.
     */
    @stub
    def getAsyncMode(): Boolean = ???

    /** Returns the factory used for constructing new workers. */
    @stub
    def getFactory(): ForkJoinPool.ForkJoinWorkerThreadFactory = ???

    /** Returns the targeted parallelism level of this pool. */
    @stub
    def getParallelism(): Int = ???

    /** Returns the number of worker threads that have started but not
     *  yet terminated.
     */
    @stub
    def getPoolSize(): Int = ???

    /** Returns an estimate of the number of tasks submitted to this
     *  pool that have not yet begun executing.
     */
    @stub
    def getQueuedSubmissionCount(): Int = ???

    /** Returns an estimate of the total number of tasks currently held
     *  in queues by worker threads (but not including tasks submitted
     *  to the pool that have not begun executing).
     */
    @stub
    def getQueuedTaskCount(): Long = ???

    /** Returns an estimate of the number of worker threads that are
     *  not blocked waiting to join tasks or for other managed
     *  synchronization.
     */
    @stub
    def getRunningThreadCount(): Int = ???

    /** Returns an estimate of the total number of tasks stolen from
     *  one thread's work queue by another.
     */
    @stub
    def getStealCount(): Long = ???

    /** Returns the handler for internal worker threads that terminate
     *  due to unrecoverable errors encountered while executing tasks.
     */
    @stub
    def getUncaughtExceptionHandler(): Thread.UncaughtExceptionHandler = ???

    /** Returns true if there are any tasks submitted to this
     *  pool that have not yet begun executing.
     */
    @stub
    def hasQueuedSubmissions(): Boolean = ???

    /** Performs the given task, returning its result upon completion. */
    @stub
    def invoke[T](task: ForkJoinTask[T]): T = ???

    /** Executes the given tasks, returning a list of Futures holding
     *  their status and results when all complete.
     */
    @stub
    def invokeAll[T](tasks: Collection[_ <: Callable[T]]): List[Future[T]] = ???

    /** Returns true if all worker threads are currently idle. */
    @stub
    def isQuiescent(): Boolean = ???

    /** Returns true if this pool has been shut down. */
    @stub
    def isShutdown(): Boolean = ???

    /** Returns true if all tasks have completed following shut down. */
    @stub
    def isTerminated(): Boolean = ???

    /** Returns true if the process of termination has
     *  commenced but not yet completed.
     */
    @stub
    def isTerminating(): Boolean = ???

    /** Returns a RunnableFuture for the given callable task. */
    @stub
    val RunnableFuture[T]: protected[T] = ???

    /** Returns a RunnableFuture for the given runnable and default
     *  value.
     */
    @stub
    val RunnableFuture[T]: protected[T] = ???

    /** Removes and returns the next unexecuted submission if one is
     *  available.
     */
    @stub
    protected def pollSubmission(): ForkJoinTask[_] = ???

    /** Possibly initiates an orderly shutdown in which previously
     *  submitted tasks are executed, but no new tasks will be
     *  accepted.
     */
    @stub
    def shutdown(): Unit = ???

    /** Possibly attempts to cancel and/or stop all tasks, and reject
     *  all subsequently submitted tasks.
     */
    @stub
    def shutdownNow(): List[Runnable] = ???

    /** Submits a value-returning task for execution and returns a
     *  Future representing the pending results of the task.
     */
    @stub
    def submit[T](task: Callable[T]): ForkJoinTask[T] = ???

    /** Submits a ForkJoinTask for execution. */
    @stub
    def submit[T](task: ForkJoinTask[T]): ForkJoinTask[T] = ???

    /** Submits a Runnable task for execution and returns a Future
     *  representing that task.
     */
    @stub
    def submit(task: Runnable): ForkJoinTask[_] = ???

    /** Submits a Runnable task for execution and returns a Future
     *  representing that task.
     */
    @stub
    def submit[T](task: Runnable, result: T): ForkJoinTask[T] = ???

    /** Returns a string identifying this pool, as well as its state,
     *  including indications of run state, parallelism level, and
     *  worker and task counts.
     */
    @stub
    def toString(): String = ???
}

object ForkJoinPool {
    /** Factory for creating new ForkJoinWorkerThreads. */
    @stub
    trait ForkJoinWorkerThreadFactory extends ForkJoinPool.ForkJoinWorkerThreadFactory

    /** Interface for extending managed parallelism for tasks running
     *  in ForkJoinPools.
     */
    @stub
    trait ManagedBlocker extends ForkJoinPool.ManagedBlocker

    /** Creates a new ForkJoinWorkerThread. */
    @stub
    val defaultForkJoinWorkerThreadFactory: ForkJoinPool.ForkJoinWorkerThreadFactory = ???

    /** Returns the common pool instance. */
    @stub
    def commonPool(): ForkJoinPool = ???

    /** Returns the targeted parallelism level of the common pool. */
    @stub
    def getCommonPoolParallelism(): Int = ???

    /** Runs the given possibly blocking task. */
    @stub
    def managedBlock(blocker: ForkJoinPool.ManagedBlocker): Unit = ???
}
