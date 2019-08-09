package javax.naming.directory

import java.lang.{Exception, Object, String, Throwable}
import javax.naming.NamingException
import scala.scalanative.annotation.stub

/** This exception is thrown when an attempt is
 *  made to add to create an attribute with an invalid attribute identifier.
 *  The validity of an attribute identifier is directory-specific.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class InvalidAttributeIdentifierException extends NamingException {

    /** Constructs a new instance of InvalidAttributeIdentifierException. */
    @stub
    def this() = ???

    /** Constructs a new instance of InvalidAttributeIdentifierException using the
     *  explanation supplied.
     */
    @stub
    def this(explanation: String) = ???
}
