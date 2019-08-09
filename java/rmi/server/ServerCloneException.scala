package java.rmi.server

import java.lang.{CloneNotSupportedException, Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** A ServerCloneException is thrown if a remote exception occurs
 *  during the cloning of a UnicastRemoteObject.
 * 
 *  As of release 1.4, this exception has been retrofitted to conform to
 *  the general purpose exception-chaining mechanism.  The "nested exception"
 *  that may be provided at construction time and accessed via the public
 *  detail field is now known as the cause, and may be
 *  accessed via the Throwable.getCause() method, as well as
 *  the aforementioned "legacy field."
 * 
 *  Invoking the method Throwable.initCause(Throwable) on an
 *  instance of ServerCloneException always throws IllegalStateException.
 */
class ServerCloneException extends CloneNotSupportedException {

    /** Constructs a ServerCloneException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???

    /** Constructs a ServerCloneException with the specified
     *  detail message and cause.
     */
    @stub
    def this(s: String, cause: Exception) = ???

    /** The cause of the exception. */
    @stub
    val detail: Exception = ???

    /** Returns the cause of this exception. */
    @stub
    def getCause(): Throwable = ???

    /** Returns the detail message, including the message from the cause, if
     *  any, of this exception.
     */
    @stub
    def getMessage(): String = ???
}
