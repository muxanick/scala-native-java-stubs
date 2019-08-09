package javax.xml.ws

import java.lang.{Exception, Object, RuntimeException, String, Throwable}

// The WebServiceException class is the base
//  exception class for all JAX-WS API runtime exceptions.
class WebServiceException extends RuntimeException {

    @stub
    // Constructs a new exception with null as its
    //  detail message.
    def this() = ???

    @stub
    // Constructs a new exception with the specified detail
    //  message.
    def this(message: String) = ???

    @stub
    // Constructs a new exception with the specified detail
    //  message and cause.
    def this(message: String, cause: Throwable) = ???
}
