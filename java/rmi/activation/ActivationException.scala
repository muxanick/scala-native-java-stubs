package java.rmi.activation

import java.lang.{Exception, Object, String, Throwable}

/** General exception used by the activation interfaces.
 * 
 *  As of release 1.4, this exception has been retrofitted to conform to
 *  the general purpose exception-chaining mechanism.  The "detail exception"
 *  that may be provided at construction time and accessed via the public
 *  detail field is now known as the cause, and may be
 *  accessed via the Throwable.getCause() method, as well as
 *  the aforementioned "legacy field."
 * 
 *  Invoking the method Throwable.initCause(Throwable) on an
 *  instance of ActivationException always throws IllegalStateException.
 */
class ActivationException extends Exception {

    /** Constructs an ActivationException. */
    @stub
    def this() = ???

    /** Constructs an ActivationException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???

    /** Returns the cause of this exception. */
    @stub
    def getCause(): Throwable = ???
}
