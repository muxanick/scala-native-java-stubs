package javax.activation

import java.awt.datatransfer.DataFlavor
import java.lang.{Class, Object, String}

// The ActivationDataFlavor class is a special subclass of
// java.awt.datatransfer.DataFlavor. It allows the JAF to
// set all three values stored by the DataFlavor class via a new
// constructor. It also contains improved MIME parsing in the equals
//  method. Except for the improved parsing, its semantics are
// identical to that of the JDK's DataFlavor class.
class ActivationDataFlavor extends DataFlavor {

    @stub
    // Construct a DataFlavor that represents a MimeType.
    def this(representationClass: Class, humanPresentableName: String) = ???

    @stub
    // Construct a DataFlavor that represents an arbitrary
    // Java object.
    def this(representationClass: Class, mimeType: String, humanPresentableName: String) = ???

    @stub
    // Compares the DataFlavor passed in with this DataFlavor; calls
    // the isMimeTypeEqual method.
    def equals(dataFlavor: DataFlavor): Boolean = ???

    @stub
    // Return the Human Presentable name.
    def getHumanPresentableName(): String = ???

    @stub
    // Return the MIME type for this DataFlavor.
    def getMimeType(): String = ???

    @stub
    // Return the representation class.
    def getRepresentationClass(): Class = ???

    @stub
    // Is the string representation of the MIME type passed in equivalent
    // to the MIME type of this DataFlavor.
    def isMimeTypeEqual(mimeType: String): Boolean = ???

    @stub
    // Deprecated.  
    protected def normalizeMimeType(mimeType: String): String = ???

    @stub
    // Deprecated.  
    protected def normalizeMimeTypeParameter(parameterName: String, parameterValue: String): String = ???
}
