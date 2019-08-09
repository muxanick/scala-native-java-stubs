package javax.imageio.spi

import java.lang.{Object, String}
import javax.imageio.metadata.IIOMetadataFormat
import scala.scalanative.annotation.stub

/** A superclass containing instance variables and methods common to
 *  ImageReaderSpi and ImageWriterSpi.
 */
abstract class ImageReaderWriterSpi extends IIOServiceProvider {

    /** Constructs a blank ImageReaderWriterSpi. */
    @stub
    def this() = ???

    /** Constructs an ImageReaderWriterSpi with a given
     *  set of values.
     */
    @stub
    def this(vendorName: String, version: String, names: Array[String], suffixes: Array[String], MIMETypes: Array[String], pluginClassName: String, supportsStandardStreamMetadataFormat: Boolean, nativeStreamMetadataFormatName: String, nativeStreamMetadataFormatClassName: String, extraStreamMetadataFormatNames: Array[String], extraStreamMetadataFormatClassNames: Array[String], supportsStandardImageMetadataFormat: Boolean, nativeImageMetadataFormatName: String, nativeImageMetadataFormatClassName: String, extraImageMetadataFormatNames: Array[String], extraImageMetadataFormatClassNames: Array[String]) = ???

    /** An array of Strings containing the class names of
     *  any additional image metadata formats supported by this
     *  plug-in, initially null.
     */
    protected val extraImageMetadataFormatClassNames: Array[String]

    /** An array of Strings containing the names of any
     *  additional image metadata formats supported by this plug-in,
     *  initially null.
     */
    protected val extraImageMetadataFormatNames: Array[String]

    /** An array of Strings containing the class names of
     *  any additional stream metadata formats supported by this plug-in,
     *  initially null.
     */
    protected val extraStreamMetadataFormatClassNames: Array[String]

    /** An array of Strings containing the names of any
     *  additional stream metadata formats supported by this plug-in,
     *  initially null.
     */
    protected val extraStreamMetadataFormatNames: Array[String]

    /** An array of strings to be returned from
     *  getMIMETypes, initially null.
     */
    protected val MIMETypes: Array[String]

    /** An array of strings to be returned from
     *  getFormatNames, initially null.
     */
    protected val names: Array[String]

    /** A String containing the class name of the
     *  native stream metadata format supported by this plug-in,
     *  initially null.
     */
    protected val nativeImageMetadataFormatClassName: String

    /** A String containing the name of the
     *  native stream metadata format supported by this plug-in,
     *  initially null.
     */
    protected val nativeImageMetadataFormatName: String

    /** A String containing the class name of the native
     *  stream metadata format supported by this plug-in, initially
     *  null.
     */
    protected val nativeStreamMetadataFormatClassName: String

    /** A String containing the name of the native stream
     *  metadata format supported by this plug-in, initially
     *  null.
     */
    protected val nativeStreamMetadataFormatName: String

    /** A String containing the name of the associated
     *  plug-in class, initially null.
     */
    protected val pluginClassName: String

    /** An array of strings to be returned from
     *  getFileSuffixes, initially null.
     */
    protected val suffixes: Array[String]

    /** A boolean indicating whether this plug-in supports the
     *  standard metadata format for image metadata, initially
     *  false.
     */
    protected val supportsStandardImageMetadataFormat: Boolean

    /** A boolean indicating whether this plug-in supports the
     *  standard metadata format for stream metadata, initially
     *  false.
     */
    protected val supportsStandardStreamMetadataFormat: Boolean

    /** Returns an array of Strings containing the names
     *  of additional document formats, other than the native and
     *  standard formats, recognized by the
     *  getAsTree and setFromTree methods on
     *  the image metadata objects produced or consumed by this
     *  plug-in.
     */
    def getExtraImageMetadataFormatNames(): Array[String]

    /** Returns an array of Strings containing the names
     *  of additional document formats, other than the native and
     *  standard formats, recognized by the
     *  getAsTree and setFromTree methods on
     *  the stream metadata objects produced or consumed by this
     *  plug-in.
     */
    def getExtraStreamMetadataFormatNames(): Array[String]

    /** Returns an array of Strings containing a list of
     *  file suffixes associated with the formats that are generally
     *  usable by the ImageReader or
     *  ImageWriter implementation associated with this
     *  service provider.
     */
    def getFileSuffixes(): Array[String]

    /** Returns an array of Strings containing
     *  human-readable names for the formats that are generally usable
     *  by the ImageReader or ImageWriter
     *  implementation associated with this service provider.
     */
    def getFormatNames(): Array[String]

    /** Returns an IIOMetadataFormat object describing the
     *  given image metadata format, or null if no
     *  description is available.
     */
    def getImageMetadataFormat(formatName: String): IIOMetadataFormat

    /** Returns an array of Strings containing a list of
     *  MIME types associated with the formats that are generally
     *  usable by the ImageReader or
     *  ImageWriter implementation associated with this
     *  service provider.
     */
    def getMIMETypes(): Array[String]

    /** Returns the name of the "native" image metadata format for
     *  this plug-in, which typically allows for lossless encoding and
     *  transmission of the image metadata stored in the format handled by
     *  this plug-in.
     */
    def getNativeImageMetadataFormatName(): String

    /** Returns the name of the "native" stream metadata format for
     *  this plug-in, which typically allows for lossless encoding and
     *  transmission of the stream metadata stored in the format handled by
     *  this plug-in.
     */
    def getNativeStreamMetadataFormatName(): String

    /** Returns the fully-qualified class name of the
     *  ImageReader or ImageWriter plug-in
     *  associated with this service provider.
     */
    def getPluginClassName(): String

    /** Returns an IIOMetadataFormat object describing the
     *  given stream metadata format, or null if no
     *  description is available.
     */
    def getStreamMetadataFormat(formatName: String): IIOMetadataFormat

    /** Returns true if the standard metadata format is
     *  among the document formats recognized by the
     *  getAsTree and setFromTree methods on
     *  the image metadata objects produced or consumed by this
     *  plug-in.
     */
    def isStandardImageMetadataFormatSupported(): Boolean

    /** Returns true if the standard metadata format is
     *  among the document formats recognized by the
     *  getAsTree and setFromTree methods on
     *  the stream metadata objects produced or consumed by this
     *  plug-in.
     */
    def isStandardStreamMetadataFormatSupported(): Boolean
}
