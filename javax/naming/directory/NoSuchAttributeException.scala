package javax.naming.directory

import java.lang.{Exception, Object, String, Throwable}
import javax.naming.NamingException
import scala.scalanative.annotation.stub

/** This exception is thrown when attempting to access
 *  an attribute that does not exist.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class NoSuchAttributeException extends NamingException {

    /** Constructs a new instance of NoSuchAttributeException. */
    @stub
    def this() = ???

    /** Constructs a new instance of NoSuchAttributeException using
     *  an explanation.
     */
    @stub
    def this(explanation: String) = ???
}
