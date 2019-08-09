package javax.imageio

import java.awt.{Dimension, Rectangle}
import java.awt.image.{BufferedImage, Raster, RenderedImage}
import java.lang.{Object, String}
import java.util.{List, Locale}
import javax.imageio.event.{IIOWriteProgressListener, IIOWriteWarningListener}
import javax.imageio.metadata.IIOMetadata
import javax.imageio.spi.ImageWriterSpi

/** An abstract superclass for encoding and writing images.  This class
 *  must be subclassed by classes that write out images in the context
 *  of the Java Image I/O framework.
 * 
 *   ImageWriter objects are normally instantiated by
 *  the service provider class for the specific format.  Service
 *  provider classes are registered with the IIORegistry,
 *  which uses them for format recognition and presentation of
 *  available format readers and writers.
 * 
 *  
 */
abstract class ImageWriter extends Object with ImageTranscoder {

    /** An array of Locales that may be used to localize
     *  warning messages and compression setting values, or
     *  null if localization is not supported.
     */
    protected val availableLocales: Array[Locale]

    /** The current Locale to be used for localization, or
     *  null if none has been set.
     */
    protected val locale: Locale

    /** The ImageWriterSpi that instantiated this object,
     *  or null if its identity is not known or none
     *  exists.
     */
    protected val originatingProvider: ImageWriterSpi

    /** The ImageOutputStream or other Object
     *  set by setOutput and retrieved by
     *  getOutput.
     */
    protected val output: Object

    /** A List of currently registered
     *  IIOWriteProgressListeners, initialized by default
     *  null, which is synonymous with an empty
     *  List.
     */
    protected val progressListeners: List[IIOWriteProgressListener]

    /** A List of currently registered
     *  IIOWriteWarningListeners, initialized by default to
     *  null, which is synonymous with an empty
     *  List.
     */
    protected val warningListeners: List[IIOWriteWarningListener]

    /** Requests that any current write operation be aborted. */
    def abort(): Unit

    /** Returns true if a request to abort the current
     *  write operation has been made since the writer was instantiated or
     *  clearAbortRequest was called.
     */
    protected def abortRequested(): Boolean

    /** Adds an IIOWriteProgressListener to the list of
     *  registered progress listeners.
     */
    def addIIOWriteProgressListener(listener: IIOWriteProgressListener): Unit

    /** Adds an IIOWriteWarningListener to the list of
     *  registered warning listeners.
     */
    def addIIOWriteWarningListener(listener: IIOWriteWarningListener): Unit

    /** Returns true if the writer supports the insertion
     *  of a new, empty image at the given index.
     */
    def canInsertEmpty(imageIndex: Int): Boolean

    /** Returns true if the writer supports the insertion
     *  of a new image at the given index.
     */
    def canInsertImage(imageIndex: Int): Boolean

    /** Returns true if the writer supports the removal
     *  of an existing image at the given index.
     */
    def canRemoveImage(imageIndex: Int): Boolean

    /** Returns true if it is possible to replace the
     *  image metadata associated with an existing image with index
     *  imageIndex.
     */
    def canReplaceImageMetadata(imageIndex: Int): Boolean

    /** Returns true if the writer allows pixels of the
     *  given image to be replaced using the replacePixels
     *  methods.
     */
    def canReplacePixels(imageIndex: Int): Boolean

    /** Returns true if it is possible to replace the
     *  stream metadata already present in the output.
     */
    def canReplaceStreamMetadata(): Boolean

    /** Returns true if the writer supports the writing of
     *  a complete image stream consisting of a single image with
     *  undefined pixel values and associated metadata and thumbnails
     *  to the output.
     */
    def canWriteEmpty(): Boolean

    /** Returns true if the methods that take an
     *  IIOImage parameter are capable of dealing with a
     *  Raster (as opposed to RenderedImage)
     *  source image.
     */
    def canWriteRasters(): Boolean

    /** Returns true if the writer is able to append an
     *  image to an image stream that already contains header
     *  information and possibly prior images.
     */
    def canWriteSequence(): Boolean

    /** Clears any previous abort request. */
    protected def clearAbortRequest(): Unit

    /** Returns an IIOMetadata object that may be used for
     *  encoding and optionally modified using its document interfaces
     *  or other interfaces specific to the writer plug-in that will be
     *  used for encoding.
     */
    def convertImageMetadata(inData: IIOMetadata, imageType: ImageTypeSpecifier, param: ImageWriteParam): IIOMetadata

    /** Returns an IIOMetadata object that may be used for
     *  encoding and optionally modified using its document interfaces
     *  or other interfaces specific to the writer plug-in that will be
     *  used for encoding.
     */
    def convertStreamMetadata(inData: IIOMetadata, param: ImageWriteParam): IIOMetadata

    /** Allows any resources held by this object to be released. */
    def dispose(): Unit

    /** Completes the insertion of a new image that was begun with a
     *  prior call to prepareInsertEmpty.
     */
    def endInsertEmpty(): Unit

    /** Terminates a sequence of calls to replacePixels. */
    def endReplacePixels(): Unit

    /** Completes the writing of a new image that was begun with a
     *  prior call to prepareWriteEmpty.
     */
    def endWriteEmpty(): Unit

    /** Completes the writing of a sequence of images begun with
     *  prepareWriteSequence.
     */
    def endWriteSequence(): Unit

    /** Returns an array of Locales that may be used to
     *  localize warning listeners and compression settings.
     */
    def getAvailableLocales(): Array[Locale]

    /** Returns an IIOMetadata object containing default
     *  values for encoding an image of the given type.
     */
    def getDefaultImageMetadata(imageType: ImageTypeSpecifier, param: ImageWriteParam): IIOMetadata

    /** Returns an IIOMetadata object containing default
     *  values for encoding a stream of images.
     */
    def getDefaultStreamMetadata(param: ImageWriteParam): IIOMetadata

    /** Returns a new ImageWriteParam object of the
     *  appropriate type for this file format containing default
     *  values, that is, those values that would be used
     *  if no ImageWriteParam object were specified.
     */
    def getDefaultWriteParam(): ImageWriteParam

    /** Returns the currently set Locale, or
     *  null if none has been set.
     */
    def getLocale(): Locale

    /** Returns the number of thumbnails supported by the format being
     *  written, given the image type and any additional write
     *  parameters and metadata objects that will be used during
     *  encoding.
     */
    def getNumThumbnailsSupported(imageType: ImageTypeSpecifier, param: ImageWriteParam, streamMetadata: IIOMetadata, imageMetadata: IIOMetadata): Int

    /** Returns the ImageWriterSpi object that created
     *  this ImageWriter, or null if this
     *  object was not created through the IIORegistry.
     */
    def getOriginatingProvider(): ImageWriterSpi

    /** Returns the ImageOutputStream or other
     *  Object set by the most recent call to the
     *  setOutput method.
     */
    def getOutput(): Object

    /** Returns an array of Dimensions indicating the
     *  legal size ranges for thumbnail images as they will be encoded
     *  in the output file or stream.
     */
    def getPreferredThumbnailSizes(imageType: ImageTypeSpecifier, param: ImageWriteParam, streamMetadata: IIOMetadata, imageMetadata: IIOMetadata): Array[Dimension]

    /** Begins the insertion of a new image with undefined pixel values
     *  into an existing image stream.
     */
    def prepareInsertEmpty(imageIndex: Int, imageType: ImageTypeSpecifier, width: Int, height: Int, imageMetadata: IIOMetadata, thumbnails: List[_ <: BufferedImage], param: ImageWriteParam): Unit

    /** Prepares the writer to handle a series of calls to the
     *  replacePixels methods.
     */
    def prepareReplacePixels(imageIndex: Int, region: Rectangle): Unit

    /** Begins the writing of a complete image stream, consisting of a
     *  single image with undefined pixel values and associated
     *  metadata and thumbnails, to the output.
     */
    def prepareWriteEmpty(streamMetadata: IIOMetadata, imageType: ImageTypeSpecifier, width: Int, height: Int, imageMetadata: IIOMetadata, thumbnails: List[_ <: BufferedImage], param: ImageWriteParam): Unit

    /** Prepares a stream to accept a series of subsequent
     *  writeToSequence calls, using the provided stream
     *  metadata object.
     */
    def prepareWriteSequence(streamMetadata: IIOMetadata): Unit

    /** Broadcasts the completion of an image write to all registered
     *  IIOWriteProgressListeners by calling their
     *  imageComplete method.
     */
    protected def processImageComplete(): Unit

    /** Broadcasts the current percentage of image completion to all
     *  registered IIOWriteProgressListeners by calling
     *  their imageProgress method.
     */
    protected def processImageProgress(percentageDone: Float): Unit

    /** Broadcasts the start of an image write to all registered
     *  IIOWriteProgressListeners by calling their
     *  imageStarted method.
     */
    protected def processImageStarted(imageIndex: Int): Unit

    /** Broadcasts the completion of a thumbnail write to all registered
     *  IIOWriteProgressListeners by calling their
     *  thumbnailComplete method.
     */
    protected def processThumbnailComplete(): Unit

    /** Broadcasts the current percentage of thumbnail completion to
     *  all registered IIOWriteProgressListeners by calling
     *  their thumbnailProgress method.
     */
    protected def processThumbnailProgress(percentageDone: Float): Unit

    /** Broadcasts the start of a thumbnail write to all registered
     *  IIOWriteProgressListeners by calling their
     *  thumbnailStarted method.
     */
    protected def processThumbnailStarted(imageIndex: Int, thumbnailIndex: Int): Unit

    /** Broadcasts a warning message to all registered
     *  IIOWriteWarningListeners by calling their
     *  warningOccurred method.
     */
    protected def processWarningOccurred(imageIndex: Int, warning: String): Unit

    /** Broadcasts a localized warning message to all registered
     *  IIOWriteWarningListeners by calling their
     *  warningOccurred method with a string taken
     *  from a ResourceBundle.
     */
    protected def processWarningOccurred(imageIndex: Int, baseName: String, keyword: String): Unit

    /** Broadcasts that the write has been aborted to all registered
     *  IIOWriteProgressListeners by calling their
     *  writeAborted method.
     */
    protected def processWriteAborted(): Unit

    /** Removes all currently registered
     *  IIOWriteProgressListener objects.
     */
    def removeAllIIOWriteProgressListeners(): Unit

    /** Removes all currently registered
     *  IIOWriteWarningListener objects.
     */
    def removeAllIIOWriteWarningListeners(): Unit

    /** Removes an IIOWriteProgressListener from the list
     *  of registered progress listeners.
     */
    def removeIIOWriteProgressListener(listener: IIOWriteProgressListener): Unit

    /** Removes an IIOWriteWarningListener from the list
     *  of registered warning listeners.
     */
    def removeIIOWriteWarningListener(listener: IIOWriteWarningListener): Unit

    /** Removes an image from the stream. */
    def removeImage(imageIndex: Int): Unit

    /** Replaces the image metadata associated with an existing image. */
    def replaceImageMetadata(imageIndex: Int, imageMetadata: IIOMetadata): Unit

    /** Replaces a portion of an image already present in the output
     *  with a portion of the given Raster.
     */
    def replacePixels(raster: Raster, param: ImageWriteParam): Unit

    /** Replaces a portion of an image already present in the output
     *  with a portion of the given image.
     */
    def replacePixels(image: RenderedImage, param: ImageWriteParam): Unit

    /** Replaces the stream metadata in the output with new
     *  information.
     */
    def replaceStreamMetadata(streamMetadata: IIOMetadata): Unit

    /** Restores the ImageWriter to its initial state. */
    def reset(): Unit

    /** Sets the current Locale of this
     *  ImageWriter to the given value.
     */
    def setLocale(locale: Locale): Unit

    /** Sets the destination to the given
     *  ImageOutputStream or other Object.
     */
    def setOutput(output: Object): Unit

    /** Appends a complete image stream containing a single image with
     *  default metadata and thumbnails to the output.
     */
    def write(image: IIOImage): Unit

    /** Appends a complete image stream containing a single image and
     *  associated stream and image metadata and thumbnails to the
     *  output.
     */
    def write(streamMetadata: IIOMetadata, image: IIOImage, param: ImageWriteParam): Unit

    /** Appends a complete image stream consisting of a single image
     *  with default metadata and thumbnails to the output.
     */
    def write(image: RenderedImage): Unit

    /** Inserts a new image into an existing image stream. */
    def writeInsert(imageIndex: Int, image: IIOImage, param: ImageWriteParam): Unit
}
