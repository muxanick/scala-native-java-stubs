package javax.xml.bind

import java.lang.{Exception, Object, String, Throwable}

// This exception indicates that an error has occurred while performing
// a marshal operation that the provider is unable to recover from.
//
// 
// The ValidationEventHandler can cause this exception to be thrown
// during the marshal operations.  See
// ValidationEventHandler.handleEvent(ValidationEvent).
class MarshalException extends JAXBException {

    @stub
    // Construct a MarshalException with the specified detail message.
    def this(message: String) = ???

    @stub
    // Construct a MarshalException with the specified detail message and vendor
    // specific errorCode.
    def this(message: String, errorCode: String) = ???

    @stub
    // Construct a MarshalException with the specified detail message, vendor
    // specific errorCode, and linkedException.
    def this(message: String, errorCode: String, exception: Throwable) = ???

    @stub
    // Construct a MarshalException with the specified detail message and
    // linkedException.
    def this(message: String, exception: Throwable) = ???
}
