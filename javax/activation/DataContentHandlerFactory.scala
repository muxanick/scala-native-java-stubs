package javax.activation

import java.lang.String
import scala.scalanative.annotation.stub

/** This interface defines a factory for DataContentHandlers. An
 *  implementation of this interface should map a MIME type into an
 *  instance of DataContentHandler. The design pattern for classes implementing
 *  this interface is the same as for the ContentHandler mechanism used in
 *  java.net.URL.
 */
trait DataContentHandlerFactory {

    /** Creates a new DataContentHandler object for the MIME type. */
    @stub
    def createDataContentHandler(mimeType: String): DataContentHandler = ???
}
