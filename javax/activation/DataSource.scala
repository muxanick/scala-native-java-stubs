package javax.activation

import java.io.{InputStream, OutputStream}
import java.lang.String
import scala.scalanative.annotation.stub

/** The DataSource interface provides the JavaBeans Activation Framework
 *  with an abstraction of an arbitrary collection of data.  It
 *  provides a type for that data as well as access
 *  to it in the form of InputStreams and
 *  OutputStreams where appropriate.
 */
trait DataSource {

    /** This method returns the MIME type of the data in the form of a
     *  string.
     */
    @stub
    def getContentType(): String = ???

    /** This method returns an InputStream representing
     *  the data and throws the appropriate exception if it can
     *  not do so.
     */
    @stub
    def getInputStream(): InputStream = ???

    /** Return the name of this object where the name of the object
     *  is dependant on the nature of the underlying objects.
     */
    @stub
    def getName(): String = ???

    /** This method returns an OutputStream where the
     *  data can be written and throws the appropriate exception if it can
     *  not do so.
     */
    @stub
    def getOutputStream(): OutputStream = ???
}
