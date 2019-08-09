package javax.xml.bind.helpers

import java.lang.Object
import java.net.URL
import javax.xml.bind.ValidationEventLocator
import org.w3c.dom.Node
import org.xml.sax.Locator

// Default implementation of the ValidationEventLocator interface.
//
// 
// JAXB providers are allowed to use whatever class that implements
// the ValidationEventLocator interface. This class is just provided for a
// convenience.
class ValidationEventLocatorImpl extends Object with ValidationEventLocator {

    @stub
    // Creates an object with all fields unavailable.
    def this() = ???

    @stub
    // Constructs an object from an org.xml.sax.Locator.
    def this(loc: Locator) = ???

    @stub
    // Constructs an object that points to a DOM Node.
    def this(_node: Node) = ???

    @stub
    // Constructs an object that points to a JAXB content object.
    def this(_object: Object) = ???

    @stub
    // Return the column number if available
    def getColumnNumber(): Int = ???

    @stub
    // Return the line number if available
    def getLineNumber(): Int = ???

    @stub
    // Return a reference to the DOM Node if available
    def getNode(): Node = ???

    @stub
    // Return a reference to the object in the Java content tree if available
    def getObject(): Object = ???

    @stub
    // Return the byte offset if available
    def getOffset(): Int = ???

    @stub
    // Return the name of the XML source as a URL if available
    def getURL(): URL = ???

    @stub
    // Set the columnNumber field on this event locator.
    def setColumnNumber(_columnNumber: Int): Unit = ???

    @stub
    // Set the lineNumber field on this event locator.
    def setLineNumber(_lineNumber: Int): Unit = ???

    @stub
    // Set the Node field on this event locator.
    def setNode(_node: Node): Unit = ???

    @stub
    // Set the Object field on this event locator.
    def setObject(_object: Object): Unit = ???

    @stub
    // Set the offset field on this event locator.
    def setOffset(_offset: Int): Unit = ???

    @stub
    // Set the URL field on this event locator.
    def setURL(_url: URL): Unit = ???
}
