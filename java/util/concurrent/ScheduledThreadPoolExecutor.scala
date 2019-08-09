package java.util.concurrent

import java.lang.{Object, Runnable}
import java.util.List

// A ThreadPoolExecutor that can additionally schedule
// commands to run after a given delay, or to execute
// periodically. This class is preferable to Timer
// when multiple worker threads are needed, or when the additional
// flexibility or capabilities of ThreadPoolExecutor (which
// this class extends) are required.
//
// Delayed tasks execute no sooner than they are enabled, but
// without any real-time guarantees about when, after they are
// enabled, they will commence. Tasks scheduled for exactly the same
// execution time are enabled in first-in-first-out (FIFO) order of
// submission.
//
// When a submitted task is cancelled before it is run, execution
// is suppressed. By default, such a cancelled task is not
// automatically removed from the work queue until its delay
// elapses. While this enables further inspection and monitoring, it
// may also cause unbounded retention of cancelled tasks. To avoid
// this, set setRemoveOnCancelPolicy(boolean) to true, which
// causes tasks to be immediately removed from the work queue at
// time of cancellation.
//
// Successive executions of a task scheduled via
// scheduleAtFixedRate or
// scheduleWithFixedDelay do not overlap. While different
// executions may be performed by different threads, the effects of
// prior executions happen-before
// those of subsequent ones.
//
// While this class inherits from ThreadPoolExecutor, a few
// of the inherited tuning methods are not useful for it. In
// particular, because it acts as a fixed-sized pool using
// corePoolSize threads and an unbounded queue, adjustments
// to maximumPoolSize have no useful effect. Additionally, it
// is almost never a good idea to set corePoolSize to zero or
// use allowCoreThreadTimeOut because this may leave the pool
// without threads to handle tasks once they become eligible to run.
//
// Extension notes: This class overrides the
// execute and
// submit
// methods to generate internal ScheduledFuture objects to
// control per-task delays and scheduling.  To preserve
// functionality, any further overrides of these methods in
// subclasses must invoke superclass versions, which effectively
// disables additional task customization.  However, this class
// provides alternative protected extension method
// decorateTask (one version each for Runnable and
// Callable) that can be used to customize the concrete task
// types used to execute commands entered via execute,
// submit, schedule, scheduleAtFixedRate,
// and scheduleWithFixedDelay.  By default, a
// ScheduledThreadPoolExecutor uses a task type extending
// FutureTask. However, this may be modified or replaced using
// subclasses of the form:
//
//   
// public class CustomScheduledExecutor extends ScheduledThreadPoolExecutor {
//
//   static class CustomTask<V> implements RunnableScheduledFuture<V> { ... }
//
//   protected <V> RunnableScheduledFuture<V> decorateTask(
//                Runnable r, RunnableScheduledFuture<V> task) {
//       return new CustomTask<V>(r, task);
//   }
//
//   protected <V> RunnableScheduledFuture<V> decorateTask(
//                Callable<V> c, RunnableScheduledFuture<V> task) {
//       return new CustomTask<V>(c, task);
//   }
//   // ... add constructors, etc.
// }
class ScheduledThreadPoolExecutor extends ThreadPoolExecutor with ScheduledExecutorService {

    @stub
    // Creates a new ScheduledThreadPoolExecutor with the
    // given core pool size.
    def this(corePoolSize: Int) = ???

    @stub
    // Creates a new ScheduledThreadPoolExecutor with the given
    // initial parameters.
    def this(corePoolSize: Int, handler: RejectedExecutionHandler) = ???

    @stub
    // Creates a new ScheduledThreadPoolExecutor with the
    // given initial parameters.
    def this(corePoolSize: Int, threadFactory: ThreadFactory) = ???

    @stub
    // Modifies or replaces the task used to execute a callable.
    def RunnableScheduledFuture[V]: protected[V] = ???

    @stub
    // Modifies or replaces the task used to execute a runnable.
    def RunnableScheduledFuture[V]: protected[V] = ???

    @stub
    // Executes command with zero required delay.
    def execute(command: Runnable): Unit = ???

    @stub
    // Gets the policy on whether to continue executing existing
    // periodic tasks even when this executor has been shutdown.
    def getContinueExistingPeriodicTasksAfterShutdownPolicy(): Boolean = ???

    @stub
    // Gets the policy on whether to execute existing delayed
    // tasks even when this executor has been shutdown.
    def getExecuteExistingDelayedTasksAfterShutdownPolicy(): Boolean = ???

    @stub
    // Returns the task queue used by this executor.
    def getQueue(): BlockingQueue[Runnable] = ???

    @stub
    // Gets the policy on whether cancelled tasks should be immediately
    // removed from the work queue at time of cancellation.
    def getRemoveOnCancelPolicy(): Boolean = ???

    @stub
    // Creates and executes a ScheduledFuture that becomes enabled after the
    // given delay.
    def ScheduledFuture[V]: [V] = ???

    @stub
    // Creates and executes a one-shot action that becomes enabled
    // after the given delay.
    def schedule(command: Runnable, delay: Long, unit: TimeUnit): ScheduledFuture[_] = ???

    @stub
    // Creates and executes a periodic action that becomes enabled first
    // after the given initial delay, and subsequently with the given
    // period; that is executions will commence after
    // initialDelay then initialDelay+period, then
    // initialDelay + 2 * period, and so on.
    def scheduleAtFixedRate(command: Runnable, initialDelay: Long, period: Long, unit: TimeUnit): ScheduledFuture[_] = ???

    @stub
    // Creates and executes a periodic action that becomes enabled first
    // after the given initial delay, and subsequently with the
    // given delay between the termination of one execution and the
    // commencement of the next.
    def scheduleWithFixedDelay(command: Runnable, initialDelay: Long, delay: Long, unit: TimeUnit): ScheduledFuture[_] = ???

    @stub
    // Sets the policy on whether to continue executing existing
    // periodic tasks even when this executor has been shutdown.
    def setContinueExistingPeriodicTasksAfterShutdownPolicy(value: Boolean): Unit = ???

    @stub
    // Sets the policy on whether to execute existing delayed
    // tasks even when this executor has been shutdown.
    def setExecuteExistingDelayedTasksAfterShutdownPolicy(value: Boolean): Unit = ???

    @stub
    // Sets the policy on whether cancelled tasks should be immediately
    // removed from the work queue at time of cancellation.
    def setRemoveOnCancelPolicy(value: Boolean): Unit = ???

    @stub
    // Initiates an orderly shutdown in which previously submitted
    // tasks are executed, but no new tasks will be accepted.
    def shutdown(): Unit = ???

    @stub
    // Attempts to stop all actively executing tasks, halts the
    // processing of waiting tasks, and returns a list of the tasks
    // that were awaiting execution.
    def shutdownNow(): List[Runnable] = ???

    @stub
    // Submits a value-returning task for execution and returns a
    // Future representing the pending results of the task.
    def Future[T]: [T] = ???

    @stub
    // Submits a Runnable task for execution and returns a Future
    // representing that task.
    def submit(task: Runnable): Future[_] = ???
}
