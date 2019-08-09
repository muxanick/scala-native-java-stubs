package javax.naming.directory

import java.lang.{Exception, Object, String, Throwable}
import javax.naming.NamingException
import scala.scalanative.annotation.stub

/** This exception is thrown when an operation attempts
 *  to add an attribute that already exists.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class AttributeInUseException extends NamingException {

    /** Constructs a new instance of AttributeInUseException. */
    @stub
    def this() = ???

    /** Constructs a new instance of AttributeInUseException with
     *  an explanation.
     */
    @stub
    def this(explanation: String) = ???
}
