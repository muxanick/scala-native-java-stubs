package java.util.concurrent

import java.lang.Runnable

/** A Future that is Runnable. Successful execution of
 *  the run method causes completion of the Future
 *  and allows access to its results.
 */
trait RunnableFuture[V] extends Runnable with Future[V] {
}
