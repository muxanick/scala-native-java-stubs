package java.util.concurrent

import java.lang.Runnable
import scala.scalanative.annotation.stub

/** A handler for tasks that cannot be executed by a ThreadPoolExecutor. */
trait RejectedExecutionHandler {

    /** Method that may be invoked by a ThreadPoolExecutor when
     *  execute cannot accept a
     *  task.
     */
    @stub
    def rejectedExecution(r: Runnable, executor: ThreadPoolExecutor): Unit = ???
}
