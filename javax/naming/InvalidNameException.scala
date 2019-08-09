package javax.naming

import java.lang.{Exception, Object, Throwable}

// This exception indicates that the name being specified does
// not conform to the naming syntax of a naming system.
// This exception is thrown by any of the methods that does name
// parsing (such as those in Context, DirContext, CompositeName and CompoundName).
// 
// Synchronization and serialization issues that apply to NamingException
// apply directly here.
class InvalidNameException extends NamingException {

    @stub
    // Constructs an instance of InvalidNameException with
    // all fields set to null.
    def this() = ???
}
