package javax.management.modelmbean

import java.lang.{Exception, Object, String, Throwable}

/** This exception is thrown when an XML formatted string is being parsed into ModelMBean objects
 *  or when XML formatted strings are being created from ModelMBean objects.
 * 
 *  It is also used to wrapper exceptions from XML parsers that may be used.
 * 
 *  The serialVersionUID of this class is 3176664577895105181L.
 */
class XMLParseException extends Exception {

    /** Default constructor . */
    @stub
    def this() = ???

    /** Constructor taking a string and an exception. */
    @stub
    def this(e: Exception, s: String) = ???
}
