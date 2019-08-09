package java.lang

import scala.scalanative.annotation.stub

/** An Error is a subclass of Throwable
 *  that indicates serious problems that a reasonable application
 *  should not try to catch. Most such errors are abnormal conditions.
 *  The ThreadDeath error, though a "normal" condition,
 *  is also a subclass of Error because most applications
 *  should not try to catch it.
 *  
 *  A method is not required to declare in its throws
 *  clause any subclasses of Error that might be thrown
 *  during the execution of the method but not caught, since these
 *  errors are abnormal conditions that should never occur.
 * 
 *  That is, Error and its subclasses are regarded as unchecked
 *  exceptions for the purposes of compile-time checking of exceptions.
 */
class Error extends Throwable {

    /** Constructs a new error with null as its detail message. */
    @stub
    def this() = ???

    /** Constructs a new error with the specified detail message. */
    @stub
    def this(message: String) = ???

    /** Constructs a new error with the specified detail message and
     *  cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Constructs a new error with the specified detail message,
     *  cause, suppression enabled or disabled, and writable stack
     *  trace enabled or disabled.
     */
    @stub
    protected def this(message: String, cause: Throwable, enableSuppression: Boolean, writableStackTrace: Boolean) = ???

    /** Constructs a new error with the specified cause and a detail
     *  message of (cause==null ? null : cause.toString()) (which
     *  typically contains the class and detail message of cause).
     */
    @stub
    def this(cause: Throwable) = ???
}
