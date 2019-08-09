package java.util.concurrent

import java.lang.{Object, Runnable}
import scala.scalanative.annotation.stub

/** A handler for rejected tasks that silently discards the
 *  rejected task.
 */
object ThreadPoolExecutor.DiscardPolicy extends Object with RejectedExecutionHandler {

    /** Creates a DiscardPolicy. */
    @stub
    def DiscardPolicy() = ???

    /** Does nothing, which has the effect of discarding task r. */
    @stub
    def rejectedExecution(r: Runnable, e: ThreadPoolExecutor): Unit = ???
}
