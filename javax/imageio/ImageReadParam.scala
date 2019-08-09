package javax.imageio

import java.awt.Dimension
import java.awt.image.BufferedImage
import java.lang.Object
import scala.scalanative.annotation.stub

/** A class describing how a stream is to be decoded.  Instances of
 *  this class or its subclasses are used to supply prescriptive
 *  "how-to" information to instances of ImageReader.
 * 
 *   An image encoded as part of a file or stream may be thought of
 *  extending out in multiple dimensions: the spatial dimensions of
 *  width and height, a number of bands, and a number of progressive
 *  decoding passes.  This class allows a contiguous (hyper)rectangular
 *  subarea of the image in all of these dimensions to be selected for
 *  decoding.  Additionally, the spatial dimensions may be subsampled
 *  discontinuously.  Finally, color and format conversions may be
 *  specified by controlling the ColorModel and
 *  SampleModel of the destination image, either by
 *  providing a BufferedImage or by using an
 *  ImageTypeSpecifier.
 * 
 *   An ImageReadParam object is used to specify how an
 *  image, or a set of images, will be converted on input from
 *  a stream in the context of the Java Image I/O framework.  A plug-in for a
 *  specific image format will return instances of
 *  ImageReadParam from the
 *  getDefaultReadParam method of its
 *  ImageReader implementation.
 * 
 *   The state maintained by an instance of
 *  ImageReadParam is independent of any particular image
 *  being decoded.  When actual decoding takes place, the values set in
 *  the read param are combined with the actual properties of the image
 *  being decoded from the stream and the destination
 *  BufferedImage that will receive the decoded pixel
 *  data.  For example, the source region set using
 *  setSourceRegion will first be intersected with the
 *  actual valid source area.  The result will be translated by the
 *  value returned by getDestinationOffset, and the
 *  resulting rectangle intersected with the actual valid destination
 *  area to yield the destination area that will be written.
 * 
 *   The parameters specified by an ImageReadParam are
 *  applied to an image as follows.  First, if a rendering size has
 *  been set by setSourceRenderSize, the entire decoded
 *  image is rendered at the size given by
 *  getSourceRenderSize.  Otherwise, the image has its
 *  natural size given by ImageReader.getWidth and
 *  ImageReader.getHeight.
 * 
 *   Next, the image is clipped against the source region
 *  specified by getSourceXOffset, getSourceYOffset,
 *  getSourceWidth, and getSourceHeight.
 * 
 *   The resulting region is then subsampled according to the
 *  factors given in IIOParam.setSourceSubsampling.  The first pixel,
 *  the number of pixels per row, and the number of rows all depend
 *  on the subsampling settings.
 *  Call the minimum X and Y coordinates of the resulting rectangle
 *  (minX, minY), its width w
 *  and its height h.
 * 
 *   This rectangle is offset by
 *  (getDestinationOffset().x,
 *  getDestinationOffset().y) and clipped against the
 *  destination bounds.  If no destination image has been set, the
 *  destination is defined to have a width of
 *  getDestinationOffset().x + w, and a
 *  height of getDestinationOffset().y + h so
 *  that all pixels of the source region may be written to the
 *  destination.
 * 
 *   Pixels that land, after subsampling, within the destination
 *  image, and that are written in one of the progressive passes
 *  specified by getSourceMinProgressivePass and
 *  getSourceNumProgressivePasses are passed along to the
 *  next step.
 * 
 *   Finally, the source samples of each pixel are mapped into
 *  destination bands according to the algorithm described in the
 *  comment for setDestinationBands.
 * 
 *   Plug-in writers may extend the functionality of
 *  ImageReadParam by providing a subclass that implements
 *  additional, plug-in specific interfaces.  It is up to the plug-in
 *  to document what interfaces are available and how they are to be
 *  used.  Readers will silently ignore any extended features of an
 *  ImageReadParam subclass of which they are not aware.
 *  Also, they may ignore any optional features that they normally
 *  disable when creating their own ImageReadParam
 *  instances via getDefaultReadParam.
 * 
 *   Note that unless a query method exists for a capability, it must
 *  be supported by all ImageReader implementations
 *  (e.g. source render size is optional, but subsampling must be
 *  supported).
 */
class ImageReadParam extends IIOParam {

    /** Constructs an ImageReadParam. */
    @stub
    def this() = ???

    /** true if this ImageReadParam allows
     *  the source rendering dimensions to be set.
     */
    @stub
    protected val canSetSourceRenderSize: Boolean = ???

    /** The current destination BufferedImage, or
     *  null if none has been set.
     */
    @stub
    protected val destination: BufferedImage = ???

    /** The set of destination bands to be used, as an array of
     *  ints.
     */
    @stub
    protected val destinationBands: Array[Int] = ???

    /** The minimum index of a progressive pass to read from the
     *  source.
     */
    @stub
    protected val minProgressivePass: Int = ???

    /** The maximum number of progressive passes to read from the
     *  source.
     */
    @stub
    protected val numProgressivePasses: Int = ???

    /** The desired rendering width and height of the source, if
     *  canSetSourceRenderSize is true, or
     *  null.
     */
    @stub
    protected val sourceRenderSize: Dimension = ???

    /** Returns true if this reader allows the source
     *  image to be rendered at an arbitrary size as part of the
     *  decoding process, by means of the
     *  setSourceRenderSize method.
     */
    @stub
    def canSetSourceRenderSize(): Boolean = ???

    /** Returns the BufferedImage currently set by the
     *  setDestination method, or null
     *  if none is set.
     */
    @stub
    def getDestination(): BufferedImage = ???

    /** Returns the set of band indices where data will be placed. */
    @stub
    def getDestinationBands(): Array[Int] = ???

    /** If getSourceNumProgressivePasses is equal to
     *  Integer.MAX_VALUE, returns
     *  Integer.MAX_VALUE.
     */
    @stub
    def getSourceMaxProgressivePass(): Int = ???

    /** Returns the index of the first progressive pass that will be
     *  decoded.
     */
    @stub
    def getSourceMinProgressivePass(): Int = ???

    /** Returns the number of the progressive passes that will be
     *  decoded.
     */
    @stub
    def getSourceNumProgressivePasses(): Int = ???

    /** Returns the width and height of the source image as it
     *  will be rendered during decoding, if they have been set via the
     *  setSourceRenderSize method.
     */
    @stub
    def getSourceRenderSize(): Dimension = ???

    /** Supplies a BufferedImage to be used as the
     *  destination for decoded pixel data.
     */
    @stub
    def setDestination(destination: BufferedImage): Unit = ???

    /** Sets the indices of the destination bands where data
     *  will be placed.
     */
    @stub
    def setDestinationBands(destinationBands: Array[Int]): Unit = ???

    /** Sets the desired image type for the destination image, using an
     *  ImageTypeSpecifier.
     */
    @stub
    def setDestinationType(destinationType: ImageTypeSpecifier): Unit = ???

    /** Sets the range of progressive passes that will be decoded. */
    @stub
    def setSourceProgressivePasses(minPass: Int, numPasses: Int): Unit = ???

    /** If the image is able to be rendered at an arbitrary size, sets
     *  the source width and height to the supplied values.
     */
    @stub
    def setSourceRenderSize(size: Dimension): Unit = ???
}
