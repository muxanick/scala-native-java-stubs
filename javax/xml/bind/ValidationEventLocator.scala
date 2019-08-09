package javax.xml.bind

import java.lang.Object
import java.net.URL
import scala.scalanative.annotation.stub

/** Encapsulate the location of a ValidationEvent.
 * 
 *  
 *  The ValidationEventLocator indicates where the ValidationEvent
 *   occurred.  Different fields will be set depending on the type of
 *  validation that was being performed when the error or warning was detected.
 *  For example, on-demand validation would produce locators that contained
 *  references to objects in the Java content tree while unmarshal-time
 *  validation would produce locators containing information appropriate to the
 *  source of the XML data (file, url, Node, etc).
 */
trait ValidationEventLocator {

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
}
