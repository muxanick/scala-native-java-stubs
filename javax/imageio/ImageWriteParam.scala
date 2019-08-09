package javax.imageio

import java.awt.Dimension
import java.lang.{Object, String}
import java.util.Locale

/** A class describing how a stream is to be encoded.  Instances of
 *  this class or its subclasses are used to supply prescriptive
 *  "how-to" information to instances of ImageWriter.
 * 
 *   A plug-in for a specific image format may define a subclass of
 *  this class, and return objects of that class from the
 *  getDefaultWriteParam method of its
 *  ImageWriter implementation.  For example, the built-in
 *  JPEG writer plug-in will return instances of
 *  javax.imageio.plugins.jpeg.JPEGImageWriteParam.
 * 
 *   The region of the image to be written is determined by first
 *  intersecting the actual bounds of the image with the rectangle
 *  specified by IIOParam.setSourceRegion, if any.  If the
 *  resulting rectangle has a width or height of zero, the writer will
 *  throw an IIOException. If the intersection is
 *  non-empty, writing will commence with the first subsampled pixel
 *  and include additional pixels within the intersected bounds
 *  according to the horizontal and vertical subsampling factors
 *  specified by IIOParam.setSourceSubsampling.
 * 
 *   Individual features such as tiling, progressive encoding, and
 *  compression may be set in one of four modes.
 *  MODE_DISABLED disables the features;
 *  MODE_DEFAULT enables the feature with
 *  writer-controlled parameter values; MODE_EXPLICIT
 *  enables the feature and allows the use of a set method
 *  to provide additional parameters; and
 *  MODE_COPY_FROM_METADATA copies relevant parameter
 *  values from the stream and image metadata objects passed to the
 *  writer.  The default for all features is
 *  MODE_COPY_FROM_METADATA.  Non-standard features
 *  supplied in subclasses are encouraged, but not required to use a
 *  similar scheme.
 * 
 *   Plug-in writers may extend the functionality of
 *  ImageWriteParam by providing a subclass that implements
 *  additional, plug-in specific interfaces.  It is up to the plug-in
 *  to document what interfaces are available and how they are to be
 *  used.  Writers will silently ignore any extended features of an
 *  ImageWriteParam subclass of which they are not aware.
 *  Also, they may ignore any optional features that they normally
 *  disable when creating their own ImageWriteParam
 *  instances via getDefaultWriteParam.
 * 
 *   Note that unless a query method exists for a capability, it must
 *  be supported by all ImageWriter implementations
 *  (e.g. progressive encoding is optional, but subsampling must be
 *  supported).
 */
class ImageWriteParam extends IIOParam {

    /** Constructs an empty ImageWriteParam. */
    @stub
    protected def this() = ???

    /** A boolean that is true if this
     *  ImageWriteParam allows tiling grid offset
     *  parameters to be set.
     */
    @stub
    protected val canOffsetTiles: Boolean = ???

    /** A boolean that is true if this writer
     *  can write images using compression.
     */
    @stub
    protected val canWriteCompressed: Boolean = ???

    /** A boolean that is true if this
     *  ImageWriteParam allows images to be written as a
     *  progressive sequence of increasing quality passes.
     */
    @stub
    protected val canWriteProgressive: Boolean = ???

    /** A boolean that is true if this
     *  ImageWriteParam allows tile width and tile height
     *  parameters to be set.
     */
    @stub
    protected val canWriteTiles: Boolean = ???

    /** The mode controlling compression settings, which must be set to
     *  one of the four MODE_* values.
     */
    @stub
    protected val compressionMode: Int = ???

    /** A float containing the current compression quality
     *  setting.
     */
    @stub
    protected val compressionQuality: Float = ???

    /** A String containing the name of the current
     *  compression type, or null if none is set.
     */
    @stub
    protected val compressionType: String = ???

    /** An array of Strings containing the names of the
     *  available compression types.
     */
    @stub
    protected val compressionTypes: Array[String] = ???

    /** A Locale to be used to localize compression type
     *  names and quality descriptions, or null to use a
     *  default Locale.
     */
    @stub
    protected val locale: Locale = ???

    /** An array of preferred tile size range pairs. */
    @stub
    protected val preferredTileSizes: Array[Dimension] = ???

    /** The mode controlling progressive encoding, which must be set to
     *  one of the four MODE_* values, except
     *  MODE_EXPLICIT.
     */
    @stub
    protected val progressiveMode: Int = ???

    /** The amount by which the tile grid origin should be offset
     *  horizontally from the image origin if tiling has been set,
     *  or 0 otherwise.
     */
    @stub
    protected val tileGridXOffset: Int = ???

    /** The amount by which the tile grid origin should be offset
     *  vertically from the image origin if tiling has been set,
     *  or 0 otherwise.
     */
    @stub
    protected val tileGridYOffset: Int = ???

    /** The height of each tile if tiling has been set, or 0 otherwise. */
    @stub
    protected val tileHeight: Int = ???

    /** The width of each tile if tiling has been set, or 0 otherwise. */
    @stub
    protected val tileWidth: Int = ???

    /** The mode controlling tiling settings, which Must be
     *  set to one of the four MODE_* values.
     */
    @stub
    protected val tilingMode: Int = ???

    /** Returns true if the writer can perform tiling with
     *  non-zero grid offsets while writing.
     */
    @stub
    def canOffsetTiles(): Boolean = ???

    /** Returns true if this writer supports compression. */
    @stub
    def canWriteCompressed(): Boolean = ???

    /** Returns true if the writer can write out images
     *  as a series of passes of progressively increasing quality.
     */
    @stub
    def canWriteProgressive(): Boolean = ???

    /** Returns true if the writer can perform tiling
     *  while writing.
     */
    @stub
    def canWriteTiles(): Boolean = ???

    /** Returns a float indicating an estimate of the
     *  number of bits of output data for each bit of input image data
     *  at the given quality level.
     */
    @stub
    def getBitRate(quality: Float): Float = ???

    /** Returns the current compression mode, if compression is
     *  supported.
     */
    @stub
    def getCompressionMode(): Int = ???

    /** Returns the current compression quality setting. */
    @stub
    def getCompressionQuality(): Float = ???

    /** Returns an array of Strings that may be used along
     *  with getCompressionQualityValues as part of a user
     *  interface for setting or displaying the compression quality
     *  level.
     */
    @stub
    def getCompressionQualityDescriptions(): Array[String] = ???

    /** Returns an array of floats that may be used along
     *  with getCompressionQualityDescriptions as part of a user
     *  interface for setting or displaying the compression quality
     *  level.
     */
    @stub
    def getCompressionQualityValues(): Array[Float] = ???

    /** Returns the currently set compression type, or
     *  null if none has been set.
     */
    @stub
    def getCompressionType(): String = ???

    /** Returns a list of available compression types, as an array or
     *  Strings, or null if a compression
     *  type may not be chosen using these interfaces.
     */
    @stub
    def getCompressionTypes(): Array[String] = ???

    /** Returns the currently set Locale, or
     *  null if only a default Locale is
     *  supported.
     */
    @stub
    def getLocale(): Locale = ???

    /** Returns a localized version of the name of the current
     *  compression type, using the Locale returned by
     *  getLocale.
     */
    @stub
    def getLocalizedCompressionTypeName(): String = ???

    /** Returns an array of Dimensions indicating the
     *  legal size ranges for tiles as they will be encoded in the
     *  output file or stream.
     */
    @stub
    def getPreferredTileSizes(): Array[Dimension] = ???

    /** Returns the current mode for writing the stream in a
     *  progressive manner.
     */
    @stub
    def getProgressiveMode(): Int = ???

    /** Returns the horizontal tile grid offset of an image as it will
     *  be written to the output stream.
     */
    @stub
    def getTileGridXOffset(): Int = ???

    /** Returns the vertical tile grid offset of an image as it will
     *  be written to the output stream.
     */
    @stub
    def getTileGridYOffset(): Int = ???

    /** Returns the height of each tile in an image as it will be written to
     *  the output stream.
     */
    @stub
    def getTileHeight(): Int = ???

    /** Returns the width of each tile in an image as it will be
     *  written to the output stream.
     */
    @stub
    def getTileWidth(): Int = ???

    /** Returns the current tiling mode, if tiling is supported. */
    @stub
    def getTilingMode(): Int = ???

    /** Returns true if the current compression type
     *  provides lossless compression.
     */
    @stub
    def isCompressionLossless(): Boolean = ???

    /** Specifies whether compression is to be performed, and if so how
     *  compression parameters are to be determined.
     */
    @stub
    def setCompressionMode(mode: Int): Unit = ???

    /** Sets the compression quality to a value between 0
     *  and 1.
     */
    @stub
    def setCompressionQuality(quality: Float): Unit = ???

    /** Sets the compression type to one of the values indicated by
     *  getCompressionTypes.
     */
    @stub
    def setCompressionType(compressionType: String): Unit = ???

    /** Specifies that the writer is to write the image out in a
     *  progressive mode such that the stream will contain a series of
     *  scans of increasing quality.
     */
    @stub
    def setProgressiveMode(mode: Int): Unit = ???

    /** Specifies that the image should be tiled in the output stream. */
    @stub
    def setTiling(tileWidth: Int, tileHeight: Int, tileGridXOffset: Int, tileGridYOffset: Int): Unit = ???

    /** Determines whether the image will be tiled in the output
     *  stream and, if it will, how the tiling parameters will be
     *  determined.
     */
    @stub
    def setTilingMode(mode: Int): Unit = ???

    /** Removes any previous compression type and quality settings. */
    @stub
    def unsetCompression(): Unit = ???
}

object ImageWriteParam {
    /** A constant value that may be passed into methods such as
     *  setTilingMode, setProgressiveMode, or
     *  setCompressionMode to enable that feature for
     *  future writes.
     */
    @stub
    val MODE_COPY_FROM_METADATA: Int = ???

    /** A constant value that may be passed into methods such as
     *  setTilingMode,
     *  setProgressiveMode, and
     *  setCompressionMode to enable that feature for
     *  future writes.
     */
    @stub
    val MODE_DEFAULT: Int = ???

    /** A constant value that may be passed into methods such as
     *  setTilingMode, setProgressiveMode,
     *  and setCompressionMode to disable a feature for
     *  future writes.
     */
    @stub
    val MODE_DISABLED: Int = ???

    /** A constant value that may be passed into methods such as
     *  setTilingMode or setCompressionMode
     *  to enable a feature for future writes.
     */
    @stub
    val MODE_EXPLICIT: Int = ???
}
