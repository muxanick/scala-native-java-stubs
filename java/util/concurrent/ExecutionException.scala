package java.util.concurrent

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Exception thrown when attempting to retrieve the result of a task
 *  that aborted by throwing an exception. This exception can be
 *  inspected using the Throwable.getCause() method.
 */
class ExecutionException extends Exception {

    /** Constructs an ExecutionException with no detail message. */
    @stub
    protected def this() = ???

    /** Constructs an ExecutionException with the specified detail
     *  message.
     */
    @stub
    protected def this(message: String) = ???

    /** Constructs an ExecutionException with the specified detail
     *  message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Constructs an ExecutionException with the specified cause. */
    @stub
    def this(cause: Throwable) = ???
}
