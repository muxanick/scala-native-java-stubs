package javax.naming.directory

import java.lang.{Exception, Object, Throwable}
import javax.naming.NamingException

// This exception is thrown when an attempt is
// made to add to create an attribute with an invalid attribute identifier.
// The validity of an attribute identifier is directory-specific.
// 
// Synchronization and serialization issues that apply to NamingException
// apply directly here.
class InvalidAttributeIdentifierException extends NamingException {

    @stub
    // Constructs a new instance of InvalidAttributeIdentifierException.
    def this() = ???
}
