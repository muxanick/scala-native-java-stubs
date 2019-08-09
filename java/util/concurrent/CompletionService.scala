package java.util.concurrent

import java.lang.Runnable
import scala.scalanative.annotation.stub

/** A service that decouples the production of new asynchronous tasks
 *  from the consumption of the results of completed tasks.  Producers
 *  submit tasks for execution. Consumers take
 *  completed tasks and process their results in the order they
 *  complete.  A CompletionService can for example be used to
 *  manage asynchronous I/O, in which tasks that perform reads are
 *  submitted in one part of a program or system, and then acted upon
 *  in a different part of the program when the reads complete,
 *  possibly in a different order than they were requested.
 * 
 *  Typically, a CompletionService relies on a separate
 *  Executor to actually execute the tasks, in which case the
 *  CompletionService only manages an internal completion
 *  queue. The ExecutorCompletionService class provides an
 *  implementation of this approach.
 * 
 *  Memory consistency effects: Actions in a thread prior to
 *  submitting a task to a CompletionService
 *  happen-before
 *  actions taken by that task, which in turn happen-before
 *  actions following a successful return from the corresponding take().
 */
trait CompletionService[V] {

    /** Retrieves and removes the Future representing the next
     *  completed task, or null if none are present.
     */
    @stub
    def poll(): Future[V] = ???

    /** Retrieves and removes the Future representing the next
     *  completed task, waiting if necessary up to the specified wait
     *  time if none are yet present.
     */
    @stub
    def poll(timeout: Long, unit: TimeUnit): Future[V] = ???

    /** Submits a value-returning task for execution and returns a Future
     *  representing the pending results of the task.
     */
    @stub
    def submit(task: Callable[V]): Future[V] = ???

    /** Submits a Runnable task for execution and returns a Future
     *  representing that task.
     */
    @stub
    def submit(task: Runnable, result: V): Future[V] = ???

    /** Retrieves and removes the Future representing the next
     *  completed task, waiting if none are yet present.
     */
    @stub
    def take(): Future[V] = ???
}
