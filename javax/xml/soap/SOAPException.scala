package javax.xml.soap

import java.lang.{Exception, Object, String, Throwable}

// An exception that signals that a SOAP exception has occurred. A
// SOAPException object may contain a String
// that gives the reason for the exception, an embedded
// Throwable object, or both. This class provides methods
// for retrieving reason messages and for retrieving the embedded
// Throwable object.
//
//  Typical reasons for throwing a SOAPException
// object are problems such as difficulty setting a header, not being
// able to send a message, and not being able to get a connection with
// the provider.  Reasons for embedding a Throwable
// object include problems such as input/output errors or a parsing
// problem, such as an error in parsing a header.
class SOAPException extends Exception {

    @stub
    // Constructs a SOAPException object with no
    // reason or embedded Throwable object.
    def this() = ???

    @stub
    // Constructs a SOAPException object with the given
    // String as the reason for the exception being thrown.
    def this(reason: String) = ???

    @stub
    // Constructs a SOAPException object with the given
    // String as the reason for the exception being thrown
    // and the given Throwable object as an embedded
    // exception.
    def this(reason: String, cause: Throwable) = ???

    @stub
    // Returns the Throwable object embedded in this
    // SOAPException if there is one.
    def getCause(): Throwable = ???

    @stub
    // Returns the detail message for this SOAPException
    // object.
    def getMessage(): String = ???
}
