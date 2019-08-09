package java.util.concurrent

import scala.scalanative.annotation.stub

/** A ScheduledFuture that is Runnable. Successful
 *  execution of the run method causes completion of the
 *  Future and allows access to its results.
 */
trait RunnableScheduledFuture[V] extends RunnableFuture[V] with ScheduledFuture[V] {

    /** Returns true if this task is periodic. */
    @stub
    def isPeriodic(): Boolean = ???
}
