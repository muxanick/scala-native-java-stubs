package javax.activation

import java.awt.datatransfer.DataFlavor
import java.lang.{Class, Object, String}
import scala.scalanative.annotation.stub

/** The ActivationDataFlavor class is a special subclass of
 *  java.awt.datatransfer.DataFlavor. It allows the JAF to
 *  set all three values stored by the DataFlavor class via a new
 *  constructor. It also contains improved MIME parsing in the equals
 *   method. Except for the improved parsing, its semantics are
 *  identical to that of the JDK's DataFlavor class.
 */
class ActivationDataFlavor extends DataFlavor {

    /** Construct a DataFlavor that represents a MimeType. */
    @stub
    def this(representationClass: Class, humanPresentableName: String) = ???

    /** Construct a DataFlavor that represents an arbitrary
     *  Java object.
     */
    @stub
    def this(representationClass: Class, mimeType: String, humanPresentableName: String) = ???

    /** Construct a DataFlavor that represents a MimeType. */
    @stub
    def this(mimeType: String, humanPresentableName: String) = ???

    /** Compares the DataFlavor passed in with this DataFlavor; calls
     *  the isMimeTypeEqual method.
     */
    @stub
    def equals(dataFlavor: DataFlavor): Boolean = ???

    /** Return the Human Presentable name. */
    @stub
    def getHumanPresentableName(): String = ???

    /** Return the MIME type for this DataFlavor. */
    @stub
    def getMimeType(): String = ???

    /** Return the representation class. */
    @stub
    def getRepresentationClass(): Class = ???

    /** Is the string representation of the MIME type passed in equivalent
     *  to the MIME type of this DataFlavor.
     */
    @stub
    def isMimeTypeEqual(mimeType: String): Boolean = ???

    /** Deprecated.   */
    @stub
    protected def normalizeMimeType(mimeType: String): String = ???

    /** Deprecated.   */
    @stub
    protected def normalizeMimeTypeParameter(parameterName: String, parameterValue: String): String = ???

    /** Set the human presentable name. */
    @stub
    def setHumanPresentableName(humanPresentableName: String): Unit = ???
}
