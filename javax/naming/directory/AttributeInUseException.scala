package javax.naming.directory

import java.lang.{Exception, Object, Throwable}
import javax.naming.NamingException

// This exception is thrown when an operation attempts
// to add an attribute that already exists.
// 
// Synchronization and serialization issues that apply to NamingException
// apply directly here.
class AttributeInUseException extends NamingException {

    @stub
    // Constructs a new instance of AttributeInUseException.
    def this() = ???
}
