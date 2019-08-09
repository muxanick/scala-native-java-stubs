package javax.imageio

import java.awt.image.{BufferedImage, Raster, RenderedImage}
import java.lang.Object
import java.util.List
import javax.imageio.metadata.IIOMetadata
import scala.scalanative.annotation.stub

/** A simple container class to aggregate an image, a set of
 *  thumbnail (preview) images, and an object representing metadata
 *  associated with the image.
 * 
 *   The image data may take the form of either a
 *  RenderedImage, or a Raster.  Reader
 *  methods that return an IIOImage will always return a
 *  BufferedImage using the RenderedImage
 *  reference.  Writer methods that accept an IIOImage
 *  will always accept a RenderedImage, and may optionally
 *  accept a Raster.
 * 
 *   Exactly one of getRenderedImage and
 *  getRaster will return a non-null value.
 *  Subclasses are responsible for ensuring this behavior.
 */
class IIOImage extends Object {

    /** Constructs an IIOImage containing a
     *  Raster, and thumbnails and metadata
     *  associated with it.
     */
    @stub
    def this(raster: Raster, thumbnails: List[_ <: BufferedImage], metadata: IIOMetadata) = ???

    /** Constructs an IIOImage containing a
     *  RenderedImage, and thumbnails and metadata
     *  associated with it.
     */
    @stub
    def this(image: RenderedImage, thumbnails: List[_ <: BufferedImage], metadata: IIOMetadata) = ???

    /** The RenderedImage being referenced. */
    @stub
    protected val image: RenderedImage = ???

    /** An IIOMetadata object containing metadata
     *  associated with the image.
     */
    @stub
    protected val metadata: IIOMetadata = ???

    /** The Raster being referenced. */
    @stub
    protected val raster: Raster = ???

    /** A List of BufferedImage thumbnails,
     *  or null.
     */
    @stub
    protected val thumbnails: List[_ <: BufferedImage] = ???

    /** Returns a reference to the current IIOMetadata
     *  object, or null is none is set.
     */
    @stub
    def getMetadata(): IIOMetadata = ???

    /** Returns the number of thumbnails stored in this
     *  IIOImage.
     */
    @stub
    def getNumThumbnails(): Int = ???

    /** Returns the currently set Raster, or
     *  null if only a RenderedImage is
     *  available.
     */
    @stub
    def getRaster(): Raster = ???

    /** Returns the currently set RenderedImage, or
     *  null if only a Raster is available.
     */
    @stub
    def getRenderedImage(): RenderedImage = ???

    /** Returns a thumbnail associated with the main image. */
    @stub
    def getThumbnail(index: Int): BufferedImage = ???

    /** Returns the current List of thumbnail
     *  BufferedImages, or null if none is
     *  set.
     */
    @stub
    def getThumbnails(): List[_ <: BufferedImage] = ???

    /** Returns true if this IIOImage stores
     *  a Raster rather than a RenderedImage.
     */
    @stub
    def hasRaster(): Boolean = ???

    /** Sets the IIOMetadata to a new object, or
     *  null.
     */
    @stub
    def setMetadata(metadata: IIOMetadata): Unit = ???

    /** Sets the current Raster. */
    @stub
    def setRaster(raster: Raster): Unit = ???

    /** Sets the current RenderedImage. */
    @stub
    def setRenderedImage(image: RenderedImage): Unit = ???

    /** Sets the list of thumbnails to a new List of
     *  BufferedImages, or to null.
     */
    @stub
    def setThumbnails(thumbnails: List[_ <: BufferedImage]): Unit = ???
}
