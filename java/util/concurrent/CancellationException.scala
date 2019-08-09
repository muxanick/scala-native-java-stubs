package java.util.concurrent

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Exception indicating that the result of a value-producing task,
 *  such as a FutureTask, cannot be retrieved because the task
 *  was cancelled.
 */
class CancellationException extends IllegalStateException {

    /** Constructs a CancellationException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a CancellationException with the specified detail
     *  message.
     */
    @stub
    def this(message: String) = ???
}
