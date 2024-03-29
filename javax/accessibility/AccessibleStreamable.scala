package javax.accessibility

import java.awt.datatransfer.DataFlavor
import java.io.InputStream
import scala.scalanative.annotation.stub

/** The AccessibleStreamable interface should be implemented
 *  by the AccessibleContext of any component that presents the
 *  raw stream behind a component on the display screen.  Examples of such
 *  components are HTML, bitmap images and MathML.  An object that implements
 *  AccessibleStreamable provides two things: a list of MIME
 *  types supported by the object and a streaming interface for each MIME type to
 *  get the data.
 */
trait AccessibleStreamable {

    /** Returns an array of DataFlavor objects for the MIME types
     *  this object supports.
     */
    @stub
    def getMimeTypes(): Array[DataFlavor] = ???

    /** Returns an InputStream for a DataFlavor */
    @stub
    def getStream(flavor: DataFlavor): InputStream = ???
}
