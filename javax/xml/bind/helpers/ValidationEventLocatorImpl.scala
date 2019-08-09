package javax.xml.bind.helpers

import java.lang.{Object, String}
import java.net.URL
import javax.xml.bind.ValidationEventLocator
import scala.scalanative.annotation.stub

/** Default implementation of the ValidationEventLocator interface.
 * 
 *  
 *  JAXB providers are allowed to use whatever class that implements
 *  the ValidationEventLocator interface. This class is just provided for a
 *  convenience.
 */
class ValidationEventLocatorImpl extends Object with ValidationEventLocator {

    /** Creates an object with all fields unavailable. */
    @stub
    def this() = ???

    /** Constructs an object from an org.xml.sax.Locator. */
    @stub
    def this(loc: Locator) = ???

    /** Constructs an object that points to a DOM Node. */
    @stub
    def this(_node: Node) = ???

    /** Constructs an object that points to a JAXB content object. */
    @stub
    def this(_object: Object) = ???

    /** Constructs an object from the location information of a SAXParseException. */
    @stub
    def this(e: SAXParseException) = ???

    /** Return the column number if available */
    @stub
    def getColumnNumber(): Int = ???

    /** Return the line number if available */
    @stub
    def getLineNumber(): Int = ???

    /** Return a reference to the DOM Node if available */
    @stub
    def getNode(): Node = ???

    /** Return a reference to the object in the Java content tree if available */
    @stub
    def getObject(): Object = ???

    /** Return the byte offset if available */
    @stub
    def getOffset(): Int = ???

    /** Return the name of the XML source as a URL if available */
    @stub
    def getURL(): URL = ???

    /** Set the columnNumber field on this event locator. */
    @stub
    def setColumnNumber(_columnNumber: Int): Unit = ???

    /** Set the lineNumber field on this event locator. */
    @stub
    def setLineNumber(_lineNumber: Int): Unit = ???

    /** Set the Node field on this event locator. */
    @stub
    def setNode(_node: Node): Unit = ???

    /** Set the Object field on this event locator. */
    @stub
    def setObject(_object: Object): Unit = ???

    /** Set the offset field on this event locator. */
    @stub
    def setOffset(_offset: Int): Unit = ???

    /** Set the URL field on this event locator. */
    @stub
    def setURL(_url: URL): Unit = ???

    /** Returns a string representation of this object in a format
     *  helpful to debugging.
     */
    @stub
    def toString(): String = ???
}
