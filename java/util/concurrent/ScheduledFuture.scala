package java.util.concurrent

/** A delayed result-bearing action that can be cancelled.
 *  Usually a scheduled future is the result of scheduling
 *  a task with a ScheduledExecutorService.
 */
trait ScheduledFuture[V] extends Delayed with Future[V] {
}
