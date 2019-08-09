package java.util.concurrent

import java.lang.{Object, Runnable}
import scala.scalanative.annotation.stub

/** A handler for rejected tasks that runs the rejected task
 *  directly in the calling thread of the execute method,
 *  unless the executor has been shut down, in which case the task
 *  is discarded.
 */
object ThreadPoolExecutor.CallerRunsPolicy extends Object with RejectedExecutionHandler {

    /** Creates a CallerRunsPolicy. */
    @stub
    def CallerRunsPolicy() = ???

    /** Executes task r in the caller's thread, unless the executor
     *  has been shut down, in which case the task is discarded.
     */
    @stub
    def rejectedExecution(r: Runnable, e: ThreadPoolExecutor): Unit = ???
}
