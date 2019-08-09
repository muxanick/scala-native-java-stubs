package javax.naming.directory

import java.lang.{Exception, Object, Throwable}
import javax.naming.NamingException

// This exception is thrown when an attempt is
// made to add or modify an attribute set that has been specified
// incompletely or incorrectly. This could happen, for example,
// when attempting to add or modify a binding, or to create a new
// subcontext without specifying all the mandatory attributes
// required for creation of the object.  Another situation in
// which this exception is thrown is by specification of incompatible
// attributes within the same attribute set, or attributes in conflict
// with that specified by the object's schema.
// 
// Synchronization and serialization issues that apply to NamingException
// apply directly here.
class InvalidAttributesException extends NamingException {

    @stub
    // Constructs a new instance of InvalidAttributesException.
    def this() = ???
}
