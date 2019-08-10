package java.util.concurrent

import java.lang.{Object, Runnable}
import scala.scalanative.annotation.stub

/** A handler for rejected tasks that throws a
 *  RejectedExecutionException.
 */
object ThreadPoolExecutor_AbortPolicy extends Object with RejectedExecutionHandler {

    /** Creates an AbortPolicy. */
    @stub
    def AbortPolicy() = ???

    /** Always throws RejectedExecutionException. */
    @stub
    def rejectedExecution(r: Runnable, e: ThreadPoolExecutor): Unit = ???
}
