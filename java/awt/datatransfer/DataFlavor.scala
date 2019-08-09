package java.awt.datatransfer

import java.io.{Externalizable, ObjectInput, Reader}
import java.lang.{Class, ClassLoader, Cloneable, Object, String}

// A DataFlavor provides meta information about data. DataFlavor
// is typically used to access data on the clipboard, or during
// a drag and drop operation.
// 
// An instance of DataFlavor encapsulates a content type as
// defined in RFC 2045
// and RFC 2046.
// A content type is typically referred to as a MIME type.
// 
// A content type consists of a media type (referred
// to as the primary type), a subtype, and optional parameters. See
// RFC 2045
// for details on the syntax of a MIME type.
// 
// The JRE data transfer implementation interprets the parameter "class"
// of a MIME type as a representation class.
// The representation class reflects the class of the object being
// transferred. In other words, the representation class is the type of
// object returned by Transferable.getTransferData(java.awt.datatransfer.DataFlavor).
// For example, the MIME type of imageFlavor is
// "image/x-java-image;class=java.awt.Image",
// the primary type is image, the subtype is
// x-java-image, and the representation class is
// java.awt.Image. When getTransferData is invoked
// with a DataFlavor of imageFlavor, an instance of
// java.awt.Image is returned.
// It's important to note that DataFlavor does no error checking
// against the representation class. It is up to consumers of
// DataFlavor, such as Transferable, to honor the representation
// class.
// 
// Note, if you do not specify a representation class when
// creating a DataFlavor, the default
// representation class is used. See appropriate documentation for
// DataFlavor's constructors.
// 
// Also, DataFlavor instances with the "text" primary
// MIME type may have a "charset" parameter. Refer to
// RFC 2046 and
// selectBestTextFlavor(java.awt.datatransfer.DataFlavor[]) for details on "text" MIME types
// and the "charset" parameter.
// 
// Equality of DataFlavors is determined by the primary type,
// subtype, and representation class. Refer to equals(DataFlavor) for
// details. When determining equality, any optional parameters are ignored.
// For example, the following produces two DataFlavors that
// are considered identical:
// 
//   DataFlavor flavor1 = new DataFlavor(Object.class, "X-test/test; class=<java.lang.Object>; foo=bar");
//   DataFlavor flavor2 = new DataFlavor(Object.class, "X-test/test; class=<java.lang.Object>; x=y");
//   // The following returns true.
//   flavor1.equals(flavor2);
// 
// As mentioned, flavor1 and flavor2 are considered identical.
// As such, asking a Transferable for either DataFlavor returns
// the same results.
// 
// For more information on the using data transfer with Swing see
// the 
// How to Use Drag and Drop and Data Transfer,
// section in Java Tutorial.
class DataFlavor extends Object with Externalizable, with Cloneable {

    @stub
    // Constructs a new DataFlavor.
    def this() = ???

    @stub
    // Constructs a DataFlavor that represents a Java class.
    def this(representationClass: Class[_], humanPresentableName: String) = ???

    @stub
    // Constructs a DataFlavor from a mimeType string.
    def this(mimeType: String) = ???

    @stub
    // Constructs a DataFlavor that represents a
    // MimeType.
    def this(mimeType: String, humanPresentableName: String) = ???

    @stub
    // Returns a clone of this DataFlavor.
    def clone(): Object = ???

    @stub
    // This method has the same behavior as equals(Object).
    def equals(that: DataFlavor): Boolean = ???

    @stub
    // Indicates whether some other object is "equal to" this one.
    def equals(o: Object): Boolean = ???

    @stub
    // Deprecated. 
    //As inconsistent with hashCode() contract,
    //             use isMimeTypeEqual(String) instead.
    //
    def equals(s: String): Boolean = ???

    @stub
    // 
    def getDefaultRepresentationClass(): Class[_] = ???

    @stub
    // 
    def getDefaultRepresentationClassAsString(): String = ???

    @stub
    // Returns the human presentable name for the data format that this
    // DataFlavor represents.
    def getHumanPresentableName(): String = ???

    @stub
    // Returns the MIME type string for this DataFlavor.
    def getMimeType(): String = ???

    @stub
    // Returns the human presentable name for this DataFlavor
    // if paramName equals "humanPresentableName".
    def getParameter(paramName: String): String = ???

    @stub
    // Returns the primary MIME type for this DataFlavor.
    def getPrimaryType(): String = ???

    @stub
    // Gets a Reader for a text flavor, decoded, if necessary, for the expected
    // charset (encoding).
    def getReaderForText(transferable: Transferable): Reader = ???

    @stub
    // Returns the Class which objects supporting this
    // DataFlavor will return when this DataFlavor
    // is requested.
    def getRepresentationClass(): Class[_] = ???

    @stub
    // Returns the sub MIME type of this DataFlavor.
    def getSubType(): String = ???

    @stub
    // Returns hash code for this DataFlavor.
    def hashCode(): Int = ???

    @stub
    // Returns true if the DataFlavor specified represents
    // a list of file objects.
    def isFlavorJavaFileListType(): Boolean = ???

    @stub
    // Returns true if the DataFlavor specified represents
    // a remote object.
    def isFlavorRemoteObjectType(): Boolean = ???

    @stub
    // Returns true if the DataFlavor specified represents
    // a serialized object.
    def isFlavorSerializedObjectType(): Boolean = ???

    @stub
    // Returns whether this DataFlavor is a valid text flavor for
    // this implementation of the Java platform.
    def isFlavorTextType(): Boolean = ???

    @stub
    // Compares the mimeType of two DataFlavor
    // objects.
    def isMimeTypeEqual(dataFlavor: DataFlavor): Boolean = ???

    @stub
    // Returns whether the string representation of the MIME type passed in
    // is equivalent to the MIME type of this DataFlavor.
    def isMimeTypeEqual(mimeType: String): Boolean = ???

    @stub
    // Does the DataFlavor represent a serialized object?
    def isMimeTypeSerializedObject(): Boolean = ???

    @stub
    // Returns whether the representation class for this
    // DataFlavor is java.nio.ByteBuffer or a
    // subclass thereof.
    def isRepresentationClassByteBuffer(): Boolean = ???

    @stub
    // Returns whether the representation class for this
    // DataFlavor is java.nio.CharBuffer or a
    // subclass thereof.
    def isRepresentationClassCharBuffer(): Boolean = ???

    @stub
    // Does the DataFlavor represent a
    // java.io.InputStream?
    def isRepresentationClassInputStream(): Boolean = ???

    @stub
    // Returns whether the representation class for this
    // DataFlavor is java.io.Reader or a subclass
    // thereof.
    def isRepresentationClassReader(): Boolean = ???

    @stub
    // Returns true if the representation class is Remote.
    def isRepresentationClassRemote(): Boolean = ???

    @stub
    // Returns true if the representation class can be serialized.
    def isRepresentationClassSerializable(): Boolean = ???

    @stub
    // Identical to equals(DataFlavor).
    def match(that: DataFlavor): Boolean = ???

    @stub
    // Deprecated.  
    protected def normalizeMimeType(mimeType: String): String = ???

    @stub
    // Deprecated.  
    protected def normalizeMimeTypeParameter(parameterName: String, parameterValue: String): String = ???

    @stub
    // Restores this DataFlavor from a Serialized state.
    def readExternal(is: ObjectInput): Unit = ???

    @stub
    // Sets the human presentable name for the data format that this
    // DataFlavor represents.
    def setHumanPresentableName(humanPresentableName: String): Unit = ???

    @stub
    // String representation of this DataFlavor and its
    // parameters.
    def toString(): String = ???
}

object DataFlavor {
    @stub
    // Represents a piece of an HTML markup.
    def allHtmlFlavor: DataFlavor = ???

    @stub
    // Represents a piece of an HTML markup.
    def fragmentHtmlFlavor: DataFlavor = ???

    @stub
    // The DataFlavor representing a Java Image class,
    // where:
    def imageFlavor: DataFlavor = ???

    @stub
    // To transfer a list of files to/from Java (and the underlying
    // platform) a DataFlavor of this type/subtype and
    // representation class of java.util.List is used.
    def javaFileListFlavor: DataFlavor = ???

    @stub
    // To transfer a reference to an arbitrary Java object reference that
    // has no associated MIME Content-type, across a Transferable
    // interface WITHIN THE SAME JVM, a DataFlavor
    // with this type/subtype is used, with a representationClass
    // equal to the type of the class/interface being passed across the
    // Transferable.
    def javaJVMLocalObjectMimeType: String = ???

    @stub
    // In order to pass a live link to a Remote object via a Drag and Drop
    // ACTION_LINK operation a Mime Content Type of
    // application/x-java-remote-object should be used,
    // where the representation class of the DataFlavor
    // represents the type of the Remote interface to be
    // transferred.
    def javaRemoteObjectMimeType: String = ???

    @stub
    // A MIME Content-Type of application/x-java-serialized-object represents
    // a graph of Java object(s) that have been made persistent.
    def javaSerializedObjectMimeType: String = ???

    @stub
    // Deprecated. 
    //as of 1.3. Use DataFlavor.getReaderForText(Transferable)
    //             instead of Transferable.getTransferData(DataFlavor.plainTextFlavor).
    //
    def plainTextFlavor: DataFlavor = ???

    @stub
    // Represents a piece of an HTML markup.
    def selectionHtmlFlavor: DataFlavor = ???

    @stub
    // Returns a DataFlavor representing plain text with Unicode
    // encoding, where:
    def getTextPlainUnicodeFlavor(): DataFlavor = ???

    @stub
    // Selects the best text DataFlavor from an array of 
    // DataFlavors.
    def selectBestTextFlavor(availableFlavors: Array[DataFlavor]): DataFlavor = ???

    @stub
    // Tries to load a class from: the bootstrap loader, the system loader,
    // the context loader (if one is present) and finally the loader specified.
    protected def tryToLoadClass(className: String, fallback: ClassLoader): Class[_] = ???
}
