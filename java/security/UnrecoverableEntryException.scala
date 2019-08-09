package java.security

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is thrown if an entry in the keystore cannot be recovered. */
class UnrecoverableEntryException extends GeneralSecurityException {

    /** Constructs an UnrecoverableEntryException with no detail message. */
    @stub
    def this() = ???

    /** Constructs an UnrecoverableEntryException with the specified detail
     *  message, which provides more information about why this exception
     *  has been thrown.
     */
    @stub
    def this(msg: String) = ???
}
