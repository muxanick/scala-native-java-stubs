package java.util.concurrent

import java.lang.{Object, Runnable}
import scala.scalanative.annotation.stub

/** A handler for rejected tasks that discards the oldest unhandled
 *  request and then retries execute, unless the executor
 *  is shut down, in which case the task is discarded.
 */
object ThreadPoolExecutor.DiscardOldestPolicy extends Object with RejectedExecutionHandler {

    /** Creates a DiscardOldestPolicy for the given executor. */
    @stub
    def DiscardOldestPolicy() = ???

    /** Obtains and ignores the next task that the executor
     *  would otherwise execute, if one is immediately available,
     *  and then retries execution of task r, unless the executor
     *  is shut down, in which case task r is instead discarded.
     */
    @stub
    def rejectedExecution(r: Runnable, e: ThreadPoolExecutor): Unit = ???
}
