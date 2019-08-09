package javax.xml.stream

import java.lang.{Exception, Object, String, Throwable}

// The base exception for unexpected processing errors.  This Exception
// class is used to report well-formedness errors as well as unexpected
// processing conditions.
class XMLStreamException extends Exception {

    @stub
    // Default constructor
    def this() = ???

    @stub
    // Construct an exception with the assocated message.
    def this(msg: String) = ???

    @stub
    // Construct an exception with the assocated message, exception and location.
    def this(msg: String, location: Location) = ???

    @stub
    // Construct an exception with the assocated message, exception and location.
    def this(msg: String, location: Location, th: Throwable) = ???

    @stub
    // Construct an exception with the assocated message and exception
    def this(msg: String, th: Throwable) = ???

    @stub
    // 
    protected def location: Location = ???

    @stub
    // Gets the location of the exception
    def getLocation(): Location = ???
}
