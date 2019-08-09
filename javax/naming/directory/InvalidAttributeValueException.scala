package javax.naming.directory

import java.lang.{Exception, Object, Throwable}
import javax.naming.NamingException

/** This class is thrown when an attempt is
 *  made to add to an attribute a value that conflicts with the attribute's
 *  schema definition.  This could happen, for example, if attempting
 *  to add an attribute with no value when the attribute is required
 *  to have at least one value, or if attempting to add more than
 *  one value to a single valued-attribute, or if attempting to
 *  add a value that conflicts with the syntax of the attribute.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class InvalidAttributeValueException extends NamingException {

    /** Constructs a new instance of InvalidAttributeValueException. */
    @stub
    def this() = ???
}
