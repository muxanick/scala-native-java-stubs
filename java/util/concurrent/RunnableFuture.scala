package java.util.concurrent

import java.lang.Runnable
import scala.scalanative.annotation.stub

/** A Future that is Runnable. Successful execution of
 *  the run method causes completion of the Future
 *  and allows access to its results.
 */
trait RunnableFuture[V] extends Runnable with Future[V] {

    /** Sets this Future to the result of its computation
     *  unless it has been cancelled.
     */
    @stub
    def run(): Unit = ???
}
