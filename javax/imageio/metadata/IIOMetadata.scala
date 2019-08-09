package javax.imageio.metadata

import java.lang.{Object, String}
import org.w3c.dom.Node

/** An abstract class to be extended by objects that represent metadata
 *  (non-image data) associated with images and streams.  Plug-ins
 *  represent metadata using opaque, plug-in specific objects.  These
 *  objects, however, provide the ability to access their internal
 *  information as a tree of IIOMetadataNode objects that
 *  support the XML DOM interfaces as well as additional interfaces for
 *  storing non-textual data and retrieving information about legal
 *  data values.  The format of such trees is plug-in dependent, but
 *  plug-ins may choose to support a plug-in neutral format described
 *  below.  A single plug-in may support multiple metadata formats,
 *  whose names maybe determined by calling
 *  getMetadataFormatNames.  The plug-in may also support
 *  a single special format, referred to as the "native" format, which
 *  is designed to encode its metadata losslessly.  This format will
 *  typically be designed specifically to work with a specific file
 *  format, so that images may be loaded and saved in the same format
 *  with no loss of metadata, but may be less useful for transferring
 *  metadata between an ImageReader and an
 *  ImageWriter for different image formats.  To convert
 *  between two native formats as losslessly as the image file formats
 *  will allow, an ImageTranscoder object must be used.
 */
abstract class IIOMetadata extends Object {

    /** Constructs an empty IIOMetadata object. */
    @stub
    protected def this() = ???

    /** The IIOMetadataController that will be
     *  used to provide settings for this IIOMetadata
     *  object when the activateController method
     *  is called.
     */
    protected val controller: IIOMetadataController

    /** An IIOMetadataController that is suggested for use
     *  as the controller for this IIOMetadata object.
     */
    protected val defaultController: IIOMetadataController

    /** An array of names of classes implementing IIOMetadataFormat
     *  and representing the metadata formats, other than the standard and
     *  native formats, that are supported by this plug-in,
     *  initialized to null and set via the constructor.
     */
    protected val extraMetadataFormatClassNames: Array[String]

    /** An array of names of formats, other than the standard and
     *  native formats, that are supported by this plug-in,
     *  initialized to null and set via the constructor.
     */
    protected val extraMetadataFormatNames: Array[String]

    /** The name of the class implementing IIOMetadataFormat
     *  and representing the native metadata format, initialized to
     *  null and set via the constructor.
     */
    protected val nativeMetadataFormatClassName: String

    /** The name of the native metadata format for this object,
     *  initialized to null and set via the constructor.
     */
    protected val nativeMetadataFormatName: String

    /** Activates the installed IIOMetadataController for
     *  this IIOMetadata object and returns the resulting
     *  value.
     */
    def activateController(): Boolean

    /** Returns an XML DOM Node object that represents the
     *  root of a tree of metadata contained within this object
     *  according to the conventions defined by a given metadata
     *  format.
     */
    def getAsTree(formatName: String): Node

    /** Returns whatever IIOMetadataController is currently
     *  installed.
     */
    def getController(): IIOMetadataController

    /** Returns the default IIOMetadataController, if there
     *  is one, regardless of the currently installed controller.
     */
    def getDefaultController(): IIOMetadataController

    /** Returns an array of Strings containing the names
     *  of additional metadata formats, other than the native and standard
     *  formats, recognized by this plug-in's
     *  getAsTree, setFromTree, and
     *  mergeTree methods.
     */
    def getExtraMetadataFormatNames(): Array[String]

    /** Returns an IIOMetadataFormat object describing the
     *  given metadata format, or null if no description
     *  is available.
     */
    def getMetadataFormat(formatName: String): IIOMetadataFormat

    /** Returns an array of Strings containing the names
     *  of all metadata formats, including the native and standard
     *  formats, recognized by this plug-in's getAsTree,
     *  setFromTree, and mergeTree methods.
     */
    def getMetadataFormatNames(): Array[String]

    /** Returns the name of the "native" metadata format for this
     *  plug-in, which typically allows for lossless encoding and
     *  transmission of the metadata stored in the format handled by
     *  this plug-in.
     */
    def getNativeMetadataFormatName(): String

    /** Returns an IIOMetadataNode representing the chroma
     *  information of the standard javax_imageio_1.0
     *  metadata format, or null if no such information is
     *  available.
     */
    protected def getStandardChromaNode(): IIOMetadataNode

    /** Returns an IIOMetadataNode representing the
     *  compression information of the standard
     *  javax_imageio_1.0 metadata format, or
     *  null if no such information is available.
     */
    protected def getStandardCompressionNode(): IIOMetadataNode

    /** Returns an IIOMetadataNode representing the data
     *  format information of the standard
     *  javax_imageio_1.0 metadata format, or
     *  null if no such information is available.
     */
    protected def getStandardDataNode(): IIOMetadataNode

    /** Returns an IIOMetadataNode representing the
     *  dimension information of the standard
     *  javax_imageio_1.0 metadata format, or
     *  null if no such information is available.
     */
    protected def getStandardDimensionNode(): IIOMetadataNode

    /** Returns an IIOMetadataNode representing the document
     *  information of the standard javax_imageio_1.0
     *  metadata format, or null if no such information is
     *  available.
     */
    protected def getStandardDocumentNode(): IIOMetadataNode

    /** Returns an IIOMetadataNode representing the textual
     *  information of the standard javax_imageio_1.0
     *  metadata format, or null if no such information is
     *  available.
     */
    protected def getStandardTextNode(): IIOMetadataNode

    /** Returns an IIOMetadataNode representing the tiling
     *  information of the standard javax_imageio_1.0
     *  metadata format, or null if no such information is
     *  available.
     */
    protected def getStandardTileNode(): IIOMetadataNode

    /** Returns an IIOMetadataNode representing the
     *  transparency information of the standard
     *  javax_imageio_1.0 metadata format, or
     *  null if no such information is available.
     */
    protected def getStandardTransparencyNode(): IIOMetadataNode

    /** A utility method to return a tree of
     *  IIOMetadataNodes representing the metadata
     *  contained within this object according to the conventions of
     *  the standard javax_imageio_1.0 metadata format.
     */
    protected def getStandardTree(): IIOMetadataNode

    /** Returns true if there is a controller installed
     *  for this IIOMetadata object.
     */
    def hasController(): Boolean

    /** Returns true if this object does not support the
     *  mergeTree, setFromTree, and
     *  reset methods.
     */
    def isReadOnly(): Boolean

    /** Returns true if the standard metadata format is
     *  supported by getMetadataFormat,
     *  getAsTree, setFromTree, and
     *  mergeTree.
     */
    def isStandardMetadataFormatSupported(): Boolean

    /** Alters the internal state of this IIOMetadata
     *  object from a tree of XML DOM Nodes whose syntax
     *  is defined by the given metadata format.
     */
    def mergeTree(formatName: String, root: Node): Unit

    /** Resets all the data stored in this object to default values,
     *  usually to the state this object was in immediately after
     *  construction, though the precise semantics are plug-in specific.
     */
    def reset(): Unit

    /** Sets the IIOMetadataController to be used
     *  to provide settings for this IIOMetadata
     *  object when the activateController method
     *  is called, overriding any default controller.
     */
    def setController(controller: IIOMetadataController): Unit
}
