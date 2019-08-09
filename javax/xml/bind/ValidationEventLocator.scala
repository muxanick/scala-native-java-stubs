package javax.xml.bind

import java.lang.Object
import org.w3c.dom.Node

// Encapsulate the location of a ValidationEvent.
//
// 
// The ValidationEventLocator indicates where the ValidationEvent
//  occurred.  Different fields will be set depending on the type of
// validation that was being performed when the error or warning was detected.
// For example, on-demand validation would produce locators that contained
// references to objects in the Java content tree while unmarshal-time
// validation would produce locators containing information appropriate to the
// source of the XML data (file, url, Node, etc).
trait ValidationEventLocator {

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
}
