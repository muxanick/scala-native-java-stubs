package javax.activation

import java.io.{InputStream, OutputStream}
import java.lang.{Object, String}
import java.net.URL
import scala.scalanative.annotation.stub

/** The URLDataSource class provides an object that wraps a URL
 *  object in a DataSource interface. URLDataSource simplifies the handling
 *  of data described by URLs within the JavaBeans Activation Framework
 *  because this class can be used to create new DataHandlers. NOTE: The
 *  DataHandler object creates a URLDataSource internally,
 *  when it is constructed with a URL.
 */
class URLDataSource extends Object with DataSource {

    /** URLDataSource constructor. */
    @stub
    def this(url: URL) = ???

    /** Returns the value of the URL content-type header field. */
    @stub
    def getContentType(): String = ???

    /** The getInputStream method from the URL. */
    @stub
    def getInputStream(): InputStream = ???

    /** Calls the getFile method on the URL used to
     *  instantiate the object.
     */
    @stub
    def getName(): String = ???

    /** The getOutputStream method from the URL. */
    @stub
    def getOutputStream(): OutputStream = ???

    /** Return the URL used to create this DataSource. */
    @stub
    def getURL(): URL = ???
}
