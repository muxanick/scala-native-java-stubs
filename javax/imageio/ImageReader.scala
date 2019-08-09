package javax.imageio

import java.awt.Rectangle
import java.awt.image.{BufferedImage, Raster, RenderedImage}
import java.lang.{Object, String}
import java.util.{Iterator, List, Locale, Set}
import javax.imageio.event.{IIOReadProgressListener, IIOReadUpdateListener, IIOReadWarningListener}
import javax.imageio.metadata.IIOMetadata
import javax.imageio.spi.ImageReaderSpi
import scala.scalanative.annotation.stub

/** An abstract superclass for parsing and decoding of images.  This
 *  class must be subclassed by classes that read in images in the
 *  context of the Java Image I/O framework.
 * 
 *   ImageReader objects are normally instantiated by
 *  the service provider interface (SPI) class for the specific format.
 *  Service provider classes (e.g., instances of
 *  ImageReaderSpi) are registered with the
 *  IIORegistry, which uses them for format recognition
 *  and presentation of available format readers and writers.
 * 
 *   When an input source is set (using the setInput
 *  method), it may be marked as "seek forward only".  This setting
 *  means that images contained within the input source will only be
 *  read in order, possibly allowing the reader to avoid caching
 *  portions of the input containing data associated with images that
 *  have been read previously.
 */
abstract class ImageReader extends Object {

    /** Constructs an ImageReader and sets its
     *  originatingProvider field to the supplied value.
     */
    @stub
    protected def this(originatingProvider: ImageReaderSpi) = ???

    /** An array of Locales which may be used to localize
     *  warning messages, or null if localization is not
     *  supported.
     */
    protected val availableLocales: Array[Locale]

    /** true if the current input source has been marked
     *  as allowing metadata to be ignored by setInput.
     */
    protected val ignoreMetadata: Boolean

    /** The ImageInputStream or other
     *  Object by setInput and retrieved
     *  by getInput.
     */
    protected val input: Object

    /** The current Locale to be used for localization, or
     *  null if none has been set.
     */
    protected val locale: Locale

    /** The smallest valid index for reading, initially 0. */
    protected val minIndex: Int

    /** The ImageReaderSpi that instantiated this object,
     *  or null if its identity is not known or none
     *  exists.
     */
    protected val originatingProvider: ImageReaderSpi

    /** A List of currently registered
     *  IIOReadProgressListeners, initialized by default
     *  to null, which is synonymous with an empty
     *  List.
     */
    protected val progressListeners: List[IIOReadProgressListener]

    /** true if the current input source has been marked
     *  as allowing only forward seeking by setInput.
     */
    protected val seekForwardOnly: Boolean

    /** A List of currently registered
     *  IIOReadUpdateListeners, initialized by default to
     *  null, which is synonymous with an empty
     *  List.
     */
    protected val updateListeners: List[IIOReadUpdateListener]

    /** A List of currently registered
     *  IIOReadWarningListeners, initialized by default to
     *  null, which is synonymous with an empty
     *  List.
     */
    protected val warningListeners: List[IIOReadWarningListener]

    /** A List of the Locales associated with
     *  each currently registered IIOReadWarningListener,
     *  initialized by default to null, which is
     *  synonymous with an empty List.
     */
    protected val warningLocales: List[Locale]

    /** Requests that any current read operation be aborted. */
    def abort(): Unit

    /** Returns true if a request to abort the current
     *  read operation has been made since the reader was instantiated or
     *  clearAbortRequest was called.
     */
    protected def abortRequested(): Boolean

    /** Adds an IIOReadProgressListener to the list of
     *  registered progress listeners.
     */
    def addIIOReadProgressListener(listener: IIOReadProgressListener): Unit

    /** Adds an IIOReadUpdateListener to the list of
     *  registered update listeners.
     */
    def addIIOReadUpdateListener(listener: IIOReadUpdateListener): Unit

    /** Adds an IIOReadWarningListener to the list of
     *  registered warning listeners.
     */
    def addIIOReadWarningListener(listener: IIOReadWarningListener): Unit

    /** Returns true if this plug-in supports reading
     *  just a Raster of pixel data.
     */
    def canReadRaster(): Boolean

    /** Clears any previous abort request. */
    protected def clearAbortRequest(): Unit

    /** Allows any resources held by this object to be released. */
    def dispose(): Unit

    /** Returns the aspect ratio of the given image (that is, its width
     *  divided by its height) as a float.
     */
    def getAspectRatio(imageIndex: Int): Float

    /** Returns an array of Locales that may be used to
     *  localize warning listeners and compression settings.
     */
    def getAvailableLocales(): Array[Locale]

    /** Returns a default ImageReadParam object
     *  appropriate for this format.
     */
    def getDefaultReadParam(): ImageReadParam

    /** Returns a String identifying the format of the
     *  input source.
     */
    def getFormatName(): String

    /** Returns the height in pixels of the given image within the
     *  input source.
     */
    def getHeight(imageIndex: Int): Int

    /** Returns an IIOMetadata object containing metadata
     *  associated with the given image, or null if the
     *  reader does not support reading metadata, is set to ignore
     *  metadata, or if no metadata is available.
     */
    def getImageMetadata(imageIndex: Int): IIOMetadata

    /** Returns an IIOMetadata object representing the
     *  metadata associated with the given image, or null
     *  if the reader does not support reading metadata or none
     *  is available.
     */
    def getImageMetadata(imageIndex: Int, formatName: String, nodeNames: Set[String]): IIOMetadata

    /** Returns an Iterator containing possible image
     *  types to which the given image may be decoded, in the form of
     *  ImageTypeSpecifierss.
     */
    def getImageTypes(imageIndex: Int): Iterator[ImageTypeSpecifier]

    /** Returns the ImageInputStream or other
     *  Object previously set as the input source.
     */
    def getInput(): Object

    /** Returns the currently set Locale, or
     *  null if none has been set.
     */
    def getLocale(): Locale

    /** Returns the lowest valid index for reading an image, thumbnail,
     *  or image metadata.
     */
    def getMinIndex(): Int

    /** Returns the number of images, not including thumbnails, available
     *  from the current input source.
     */
    def getNumImages(allowSearch: Boolean): Int

    /** Returns the number of thumbnail preview images associated with
     *  the given image.
     */
    def getNumThumbnails(imageIndex: Int): Int

    /** Returns the ImageReaderSpi that was passed in on
     *  the constructor.
     */
    def getOriginatingProvider(): ImageReaderSpi

    /** Returns an ImageTypeSpecifier indicating the
     *  SampleModel and ColorModel which most
     *  closely represents the "raw" internal format of the image.
     */
    def getRawImageType(imageIndex: Int): ImageTypeSpecifier

    /** Returns an IIOMetadata object representing the
     *  metadata associated with the input source as a whole (i.e., not
     *  associated with any particular image), or null if
     *  the reader does not support reading metadata, is set to ignore
     *  metadata, or if no metadata is available.
     */
    def getStreamMetadata(): IIOMetadata

    /** Returns an IIOMetadata object representing the
     *  metadata associated with the input source as a whole (i.e.,
     *  not associated with any particular image).
     */
    def getStreamMetadata(formatName: String, nodeNames: Set[String]): IIOMetadata

    /** Returns the height of the thumbnail preview image indexed by
     *  thumbnailIndex, associated with the image indexed
     *  by ImageIndex.
     */
    def getThumbnailHeight(imageIndex: Int, thumbnailIndex: Int): Int

    /** Returns the width of the thumbnail preview image indexed by
     *  thumbnailIndex, associated with the image indexed
     *  by ImageIndex.
     */
    def getThumbnailWidth(imageIndex: Int, thumbnailIndex: Int): Int

    /** Returns the X coordinate of the upper-left corner of tile (0,
     *  0) in the given image.
     */
    def getTileGridXOffset(imageIndex: Int): Int

    /** Returns the Y coordinate of the upper-left corner of tile (0,
     *  0) in the given image.
     */
    def getTileGridYOffset(imageIndex: Int): Int

    /** Returns the height of a tile in the given image. */
    def getTileHeight(imageIndex: Int): Int

    /** Returns the width of a tile in the given image. */
    def getTileWidth(imageIndex: Int): Int

    /** Returns the width in pixels of the given image within the input
     *  source.
     */
    def getWidth(imageIndex: Int): Int

    /** Returns true if the given image has thumbnail
     *  preview images associated with it.
     */
    def hasThumbnails(imageIndex: Int): Boolean

    /** Returns true if the current input source has been
     *  marked as allowing metadata to be ignored by passing
     *  true as the ignoreMetadata argument
     *  to the setInput method.
     */
    def isIgnoringMetadata(): Boolean

    /** Returns true if the image is organized into
     *  tiles, that is, equal-sized non-overlapping rectangles.
     */
    def isImageTiled(imageIndex: Int): Boolean

    /** Returns true if the storage format of the given
     *  image places no inherent impediment on random access to pixels.
     */
    def isRandomAccessEasy(imageIndex: Int): Boolean

    /** Returns true if the current input source has been
     *  marked as seek forward only by passing true as the
     *  seekForwardOnly argument to the
     *  setInput method.
     */
    def isSeekForwardOnly(): Boolean

    /** Broadcasts the completion of an image read to all registered
     *  IIOReadProgressListeners by calling their
     *  imageComplete method.
     */
    protected def processImageComplete(): Unit

    /** Broadcasts the current percentage of image completion to all
     *  registered IIOReadProgressListeners by calling
     *  their imageProgress method.
     */
    protected def processImageProgress(percentageDone: Float): Unit

    /** Broadcasts the start of an image read to all registered
     *  IIOReadProgressListeners by calling their
     *  imageStarted method.
     */
    protected def processImageStarted(imageIndex: Int): Unit

    /** Broadcasts the update of a set of samples to all registered
     *  IIOReadUpdateListeners by calling their
     *  imageUpdate method.
     */
    protected def processImageUpdate(theImage: BufferedImage, minX: Int, minY: Int, width: Int, height: Int, periodX: Int, periodY: Int, bands: Array[Int]): Unit

    /** Broadcasts the end of a progressive pass to all
     *  registered IIOReadUpdateListeners by calling their
     *  passComplete method.
     */
    protected def processPassComplete(theImage: BufferedImage): Unit

    /** Broadcasts the beginning of a progressive pass to all
     *  registered IIOReadUpdateListeners by calling their
     *  passStarted method.
     */
    protected def processPassStarted(theImage: BufferedImage, pass: Int, minPass: Int, maxPass: Int, minX: Int, minY: Int, periodX: Int, periodY: Int, bands: Array[Int]): Unit

    /** Broadcasts that the read has been aborted to all registered
     *  IIOReadProgressListeners by calling their
     *  readAborted method.
     */
    protected def processReadAborted(): Unit

    /** Broadcasts the completion of an sequence of image reads to all
     *  registered IIOReadProgressListeners by calling
     *  their sequenceComplete method.
     */
    protected def processSequenceComplete(): Unit

    /** Broadcasts the start of an sequence of image reads to all
     *  registered IIOReadProgressListeners by calling
     *  their sequenceStarted method.
     */
    protected def processSequenceStarted(minIndex: Int): Unit

    /** Broadcasts the completion of a thumbnail read to all registered
     *  IIOReadProgressListeners by calling their
     *  thumbnailComplete method.
     */
    protected def processThumbnailComplete(): Unit

    /** Broadcasts the end of a thumbnail progressive pass to all
     *  registered IIOReadUpdateListeners by calling their
     *  thumbnailPassComplete method.
     */
    protected def processThumbnailPassComplete(theThumbnail: BufferedImage): Unit

    /** Broadcasts the beginning of a thumbnail progressive pass to all
     *  registered IIOReadUpdateListeners by calling their
     *  thumbnailPassStarted method.
     */
    protected def processThumbnailPassStarted(theThumbnail: BufferedImage, pass: Int, minPass: Int, maxPass: Int, minX: Int, minY: Int, periodX: Int, periodY: Int, bands: Array[Int]): Unit

    /** Broadcasts the current percentage of thumbnail completion to
     *  all registered IIOReadProgressListeners by calling
     *  their thumbnailProgress method.
     */
    protected def processThumbnailProgress(percentageDone: Float): Unit

    /** Broadcasts the start of a thumbnail read to all registered
     *  IIOReadProgressListeners by calling their
     *  thumbnailStarted method.
     */
    protected def processThumbnailStarted(imageIndex: Int, thumbnailIndex: Int): Unit

    /** Broadcasts the update of a set of samples in a thumbnail image
     *  to all registered IIOReadUpdateListeners by
     *  calling their thumbnailUpdate method.
     */
    protected def processThumbnailUpdate(theThumbnail: BufferedImage, minX: Int, minY: Int, width: Int, height: Int, periodX: Int, periodY: Int, bands: Array[Int]): Unit

    /** Broadcasts a warning message to all registered
     *  IIOReadWarningListeners by calling their
     *  warningOccurred method.
     */
    protected def processWarningOccurred(warning: String): Unit

    /** Broadcasts a localized warning message to all registered
     *  IIOReadWarningListeners by calling their
     *  warningOccurred method with a string taken
     *  from a ResourceBundle.
     */
    protected def processWarningOccurred(baseName: String, keyword: String): Unit

    /** Reads the image indexed by imageIndex and returns
     *  it as a complete BufferedImage, using a default
     *  ImageReadParam.
     */
    def read(imageIndex: Int): BufferedImage

    /** Reads the image indexed by imageIndex and returns
     *  it as a complete BufferedImage, using a supplied
     *  ImageReadParam.
     */
    def read(imageIndex: Int, param: ImageReadParam): BufferedImage

    /** Reads the image indexed by imageIndex and returns
     *  an IIOImage containing the image, thumbnails, and
     *  associated image metadata, using a supplied
     *  ImageReadParam.
     */
    def readAll(imageIndex: Int, param: ImageReadParam): IIOImage

    /** Returns an Iterator containing all the images,
     *  thumbnails, and metadata, starting at the index given by
     *  getMinIndex, from the input source in the form of
     *  IIOImage objects.
     */
    def readAll(params: Iterator[_ <: ImageReadParam]): Iterator[IIOImage]

    /** Returns a RenderedImage object that contains the
     *  contents of the image indexed by imageIndex.
     */
    def readAsRenderedImage(imageIndex: Int, param: ImageReadParam): RenderedImage

    /** Returns true if the image format understood by
     *  this reader supports thumbnail preview images associated with
     *  it.
     */
    def readerSupportsThumbnails(): Boolean

    /** Returns a new Raster object containing the raw pixel data
     *  from the image stream, without any color conversion applied.
     */
    def readRaster(imageIndex: Int, param: ImageReadParam): Raster

    /** Returns the thumbnail preview image indexed by
     *  thumbnailIndex, associated with the image indexed
     *  by ImageIndex as a BufferedImage.
     */
    def readThumbnail(imageIndex: Int, thumbnailIndex: Int): BufferedImage

    /** Reads the tile indicated by the tileX and
     *  tileY arguments, returning it as a
     *  BufferedImage.
     */
    def readTile(imageIndex: Int, tileX: Int, tileY: Int): BufferedImage

    /** Returns a new Raster object containing the raw
     *  pixel data from the tile, without any color conversion applied.
     */
    def readTileRaster(imageIndex: Int, tileX: Int, tileY: Int): Raster

    /** Removes all currently registered
     *  IIOReadProgressListener objects.
     */
    def removeAllIIOReadProgressListeners(): Unit

    /** Removes all currently registered
     *  IIOReadUpdateListener objects.
     */
    def removeAllIIOReadUpdateListeners(): Unit

    /** Removes all currently registered
     *  IIOReadWarningListener objects.
     */
    def removeAllIIOReadWarningListeners(): Unit

    /** Removes an IIOReadProgressListener from the list
     *  of registered progress listeners.
     */
    def removeIIOReadProgressListener(listener: IIOReadProgressListener): Unit

    /** Removes an IIOReadUpdateListener from the list of
     *  registered update listeners.
     */
    def removeIIOReadUpdateListener(listener: IIOReadUpdateListener): Unit

    /** Removes an IIOReadWarningListener from the list of
     *  registered error listeners.
     */
    def removeIIOReadWarningListener(listener: IIOReadWarningListener): Unit

    /** Restores the ImageReader to its initial state. */
    def reset(): Unit

    /** Sets the input source to use to the given
     *  ImageInputStream or other Object.
     */
    def setInput(input: Object): Unit

    /** Sets the input source to use to the given
     *  ImageInputStream or other Object.
     */
    def setInput(input: Object, seekForwardOnly: Boolean): Unit

    /** Sets the input source to use to the given
     *  ImageInputStream or other Object.
     */
    def setInput(input: Object, seekForwardOnly: Boolean, ignoreMetadata: Boolean): Unit

    /** Sets the current Locale of this
     *  ImageReader to the given value.
     */
    def setLocale(locale: Locale): Unit
}

object ImageReader {
    /** A utility method that may be used by readers to test the
     *  validity of the source and destination band settings of an
     *  ImageReadParam.
     */
    @stub
    protected def checkReadParamBandSettings(param: ImageReadParam, numSrcBands: Int, numDstBands: Int): Unit = ???

    /** Computes the source region of interest and the destination
     *  region of interest, taking the width and height of the source
     *  image, an optional destination image, and an optional
     *  ImageReadParam into account.
     */
    @stub
    protected def computeRegions(param: ImageReadParam, srcWidth: Int, srcHeight: Int, image: BufferedImage, srcRegion: Rectangle, destRegion: Rectangle): Unit = ???

    /** Returns the BufferedImage to which decoded pixel
     *  data should be written.
     */
    @stub
    protected def getDestination(param: ImageReadParam, imageTypes: Iterator[ImageTypeSpecifier], width: Int, height: Int): BufferedImage = ???

    /** A utility method that may be used by readers to compute the
     *  region of the source image that should be read, taking into
     *  account any source region and subsampling offset settings in
     *  the supplied ImageReadParam.
     */
    @stub
    protected def getSourceRegion(param: ImageReadParam, srcWidth: Int, srcHeight: Int): Rectangle = ???
}
