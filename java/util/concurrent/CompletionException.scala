package java.util.concurrent

import java.lang.{Exception, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Exception thrown when an error or other exception is encountered
 *  in the course of completing a result or task.
 */
class CompletionException extends RuntimeException {

    /** Constructs a CompletionException with no detail message. */
    @stub
    protected def this() = ???

    /** Constructs a CompletionException with the specified detail
     *  message.
     */
    @stub
    protected def this(message: String) = ???

    /** Constructs a CompletionException with the specified detail
     *  message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Constructs a CompletionException with the specified cause. */
    @stub
    def this(cause: Throwable) = ???
}
