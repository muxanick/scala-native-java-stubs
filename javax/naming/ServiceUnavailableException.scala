package javax.naming

import java.lang.{Exception, Object, Throwable}

// This exception is thrown when attempting to communicate with a
// directory or naming service and that service is not available.
// It might be unavailable for different reasons. For example,
// the server might be too busy to service the request, or the server
// might not be registered to service any requests, etc.
// 
// Synchronization and serialization issues that apply to NamingException
// apply directly here.
class ServiceUnavailableException extends NamingException {

    @stub
    // Constructs a new instance of ServiceUnavailableException.
    def this() = ???
}
