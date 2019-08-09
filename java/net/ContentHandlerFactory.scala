package java.net

import java.lang.String
import scala.scalanative.annotation.stub

/** This interface defines a factory for content handlers. An
 *  implementation of this interface should map a MIME type into an
 *  instance of ContentHandler.
 *  
 *  This interface is used by the URLStreamHandler class
 *  to create a ContentHandler for a MIME type.
 */
trait ContentHandlerFactory {

    /** Creates a new ContentHandler to read an object from
     *  a URLStreamHandler.
     */
    @stub
    def createContentHandler(mimetype: String): ContentHandler = ???
}
