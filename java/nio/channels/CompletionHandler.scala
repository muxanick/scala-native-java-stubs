package java.nio.channels

import java.lang.Throwable
import scala.scalanative.annotation.stub

/** A handler for consuming the result of an asynchronous I/O operation.
 * 
 *   The asynchronous channels defined in this package allow a completion
 *  handler to be specified to consume the result of an asynchronous operation.
 *  The completed method is invoked when the I/O operation
 *  completes successfully. The failed method is invoked if the
 *  I/O operations fails. The implementations of these methods should complete
 *  in a timely manner so as to avoid keeping the invoking thread from dispatching
 *  to other completion handlers.
 */
trait CompletionHandler[V, A] {

    /** Invoked when an operation has completed. */
    @stub
    def completed(result: V, attachment: A): Unit = ???

    /** Invoked when an operation fails. */
    @stub
    def failed(exc: Throwable, attachment: A): Unit = ???
}
