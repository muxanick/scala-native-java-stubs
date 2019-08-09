package javax.imageio

import java.awt.image.{BufferedImage, Raster, RenderedImage}
import java.lang.Object
import java.util.List
import javax.imageio.metadata.IIOMetadata

// A simple container class to aggregate an image, a set of
// thumbnail (preview) images, and an object representing metadata
// associated with the image.
//
//  The image data may take the form of either a
// RenderedImage, or a Raster.  Reader
// methods that return an IIOImage will always return a
// BufferedImage using the RenderedImage
// reference.  Writer methods that accept an IIOImage
// will always accept a RenderedImage, and may optionally
// accept a Raster.
//
//  Exactly one of getRenderedImage and
// getRaster will return a non-null value.
// Subclasses are responsible for ensuring this behavior.
class IIOImage extends Object {

    @stub
    // Constructs an IIOImage containing a
    // Raster, and thumbnails and metadata
    // associated with it.
    def this(raster: Raster, thumbnails: List[_ <: BufferedImage], metadata: IIOMetadata) = ???

    @stub
    // The RenderedImage being referenced.
    protected def image: RenderedImage = ???

    @stub
    // An IIOMetadata object containing metadata
    // associated with the image.
    protected def metadata: IIOMetadata = ???

    @stub
    // The Raster being referenced.
    protected def raster: Raster = ???

    @stub
    // Returns a reference to the current IIOMetadata
    // object, or null is none is set.
    def getMetadata(): IIOMetadata = ???

    @stub
    // Returns the number of thumbnails stored in this
    // IIOImage.
    def getNumThumbnails(): Int = ???

    @stub
    // Returns the currently set Raster, or
    // null if only a RenderedImage is
    // available.
    def getRaster(): Raster = ???

    @stub
    // Returns the currently set RenderedImage, or
    // null if only a Raster is available.
    def getRenderedImage(): RenderedImage = ???

    @stub
    // Returns a thumbnail associated with the main image.
    def getThumbnail(index: Int): BufferedImage = ???

    @stub
    // Returns the current List of thumbnail
    // BufferedImages, or null if none is
    // set.
    def getThumbnails(): List[_ <: BufferedImage] = ???

    @stub
    // Returns true if this IIOImage stores
    // a Raster rather than a RenderedImage.
    def hasRaster(): Boolean = ???

    @stub
    // Sets the IIOMetadata to a new object, or
    // null.
    def setMetadata(metadata: IIOMetadata): Unit = ???

    @stub
    // Sets the current Raster.
    def setRaster(raster: Raster): Unit = ???

    @stub
    // Sets the current RenderedImage.
    def setRenderedImage(image: RenderedImage): Unit = ???
}
