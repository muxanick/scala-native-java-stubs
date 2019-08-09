package javax.naming

import java.lang.{Exception, Object, Throwable}

// This exception is thrown when a context implementation does not support
// the operation being invoked.
// For example, if a server does not support the Context.bind() method
// it would throw OperationNotSupportedException when the bind() method
// is invoked on it.
// 
// Synchronization and serialization issues that apply to NamingException
// apply directly here.
class OperationNotSupportedException extends NamingException {

    @stub
    // Constructs a new instance of OperationNotSupportedException.
    def this() = ???
}