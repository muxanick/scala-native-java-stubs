package javax.xml.bind

import java.lang.{Exception, Object, String, Throwable}

// This exception indicates that an error has occurred while performing
// a validate operation.
//
// 
// The ValidationEventHandler can cause this exception to be thrown
// during the validate operations.  See
// ValidationEventHandler.handleEvent(ValidationEvent).
class ValidationException extends JAXBException {

    @stub
    // Construct an ValidationException with the specified detail message.
    def this(message: String) = ???

    @stub
    // Construct an ValidationException with the specified detail message and vendor
    // specific errorCode.
    def this(message: String, errorCode: String) = ???

    @stub
    // Construct an ValidationException with the specified detail message, vendor
    // specific errorCode, and linkedException.
    def this(message: String, errorCode: String, exception: Throwable) = ???

    @stub
    // Construct an ValidationException with the specified detail message and
    // linkedException.
    def this(message: String, exception: Throwable) = ???
}
