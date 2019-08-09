package javax.naming.directory

import java.lang.{Exception, Object, Throwable}
import javax.naming.NamingException

// This exception is thrown when a method
// in some ways violates the schema. An example of schema violation
// is modifying attributes of an object that violates the object's
// schema definition. Another example is renaming or moving an object
// to a part of the namespace that violates the namespace's
// schema definition.
// 
// Synchronization and serialization issues that apply to NamingException
// apply directly here.
class SchemaViolationException extends NamingException {

    @stub
    // Constructs a new instance of SchemaViolationException.
    def this() = ???
}
