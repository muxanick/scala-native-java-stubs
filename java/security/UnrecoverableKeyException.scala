package java.security

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is thrown if a key in the keystore cannot be recovered. */
class UnrecoverableKeyException extends UnrecoverableEntryException {

    /** Constructs an UnrecoverableKeyException with no detail message. */
    @stub
    def this() = ???

    /** Constructs an UnrecoverableKeyException with the specified detail
     *  message, which provides more information about why this exception
     *  has been thrown.
     */
    @stub
    def this(msg: String) = ???
}
