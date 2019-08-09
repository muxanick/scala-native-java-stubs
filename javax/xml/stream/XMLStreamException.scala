package javax.xml.stream

import java.lang.{Exception, Object, String, Throwable}

/** The base exception for unexpected processing errors.  This Exception
 *  class is used to report well-formedness errors as well as unexpected
 *  processing conditions.
 */
class XMLStreamException extends Exception {

    /** Default constructor */
    @stub
    def this() = ???

    /** Construct an exception with the assocated message. */
    @stub
    def this(msg: String) = ???

    /** Construct an exception with the assocated message, exception and location. */
    @stub
    def this(msg: String, location: Location) = ???

    /** Construct an exception with the assocated message, exception and location. */
    @stub
    def this(msg: String, location: Location, th: Throwable) = ???

    /** Construct an exception with the assocated message and exception */
    @stub
    def this(msg: String, th: Throwable) = ???

    /**  */
    @stub
    protected val location: Location = ???

    /** Gets the location of the exception */
    @stub
    def getLocation(): Location = ???
}
