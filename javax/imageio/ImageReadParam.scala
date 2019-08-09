package javax.imageio

import java.awt.Dimension
import java.awt.image.BufferedImage
import java.lang.Object

// A class describing how a stream is to be decoded.  Instances of
// this class or its subclasses are used to supply prescriptive
// "how-to" information to instances of ImageReader.
//
//  An image encoded as part of a file or stream may be thought of
// extending out in multiple dimensions: the spatial dimensions of
// width and height, a number of bands, and a number of progressive
// decoding passes.  This class allows a contiguous (hyper)rectangular
// subarea of the image in all of these dimensions to be selected for
// decoding.  Additionally, the spatial dimensions may be subsampled
// discontinuously.  Finally, color and format conversions may be
// specified by controlling the ColorModel and
// SampleModel of the destination image, either by
// providing a BufferedImage or by using an
// ImageTypeSpecifier.
//
//  An ImageReadParam object is used to specify how an
// image, or a set of images, will be converted on input from
// a stream in the context of the Java Image I/O framework.  A plug-in for a
// specific image format will return instances of
// ImageReadParam from the
// getDefaultReadParam method of its
// ImageReader implementation.
//
//  The state maintained by an instance of
// ImageReadParam is independent of any particular image
// being decoded.  When actual decoding takes place, the values set in
// the read param are combined with the actual properties of the image
// being decoded from the stream and the destination
// BufferedImage that will receive the decoded pixel
// data.  For example, the source region set using
// setSourceRegion will first be intersected with the
// actual valid source area.  The result will be translated by the
// value returned by getDestinationOffset, and the
// resulting rectangle intersected with the actual valid destination
// area to yield the destination area that will be written.
//
//  The parameters specified by an ImageReadParam are
// applied to an image as follows.  First, if a rendering size has
// been set by setSourceRenderSize, the entire decoded
// image is rendered at the size given by
// getSourceRenderSize.  Otherwise, the image has its
// natural size given by ImageReader.getWidth and
// ImageReader.getHeight.
//
//  Next, the image is clipped against the source region
// specified by getSourceXOffset, getSourceYOffset,
// getSourceWidth, and getSourceHeight.
//
//  The resulting region is then subsampled according to the
// factors given in IIOParam.setSourceSubsampling.  The first pixel,
// the number of pixels per row, and the number of rows all depend
// on the subsampling settings.
// Call the minimum X and Y coordinates of the resulting rectangle
// (minX, minY), its width w
// and its height h.
//
//  This rectangle is offset by
// (getDestinationOffset().x,
// getDestinationOffset().y) and clipped against the
// destination bounds.  If no destination image has been set, the
// destination is defined to have a width of
// getDestinationOffset().x + w, and a
// height of getDestinationOffset().y + h so
// that all pixels of the source region may be written to the
// destination.
//
//  Pixels that land, after subsampling, within the destination
// image, and that are written in one of the progressive passes
// specified by getSourceMinProgressivePass and
// getSourceNumProgressivePasses are passed along to the
// next step.
//
//  Finally, the source samples of each pixel are mapped into
// destination bands according to the algorithm described in the
// comment for setDestinationBands.
//
//  Plug-in writers may extend the functionality of
// ImageReadParam by providing a subclass that implements
// additional, plug-in specific interfaces.  It is up to the plug-in
// to document what interfaces are available and how they are to be
// used.  Readers will silently ignore any extended features of an
// ImageReadParam subclass of which they are not aware.
// Also, they may ignore any optional features that they normally
// disable when creating their own ImageReadParam
// instances via getDefaultReadParam.
//
//  Note that unless a query method exists for a capability, it must
// be supported by all ImageReader implementations
// (e.g. source render size is optional, but subsampling must be
// supported).
class ImageReadParam extends IIOParam {

    @stub
    // true if this ImageReadParam allows
    // the source rendering dimensions to be set.
    protected def canSetSourceRenderSize: Boolean = ???

    @stub
    // The current destination BufferedImage, or
    // null if none has been set.
    protected def destination: BufferedImage = ???

    @stub
    // The set of destination bands to be used, as an array of
    // ints.
    protected def destinationBands: Array[Int] = ???

    @stub
    // The minimum index of a progressive pass to read from the
    // source.
    protected def minProgressivePass: Int = ???

    @stub
    // The maximum number of progressive passes to read from the
    // source.
    protected def numProgressivePasses: Int = ???

    @stub
    // Returns true if this reader allows the source
    // image to be rendered at an arbitrary size as part of the
    // decoding process, by means of the
    // setSourceRenderSize method.
    def canSetSourceRenderSize(): Boolean = ???

    @stub
    // Returns the BufferedImage currently set by the
    // setDestination method, or null
    // if none is set.
    def getDestination(): BufferedImage = ???

    @stub
    // Returns the set of band indices where data will be placed.
    def getDestinationBands(): Array[Int] = ???

    @stub
    // If getSourceNumProgressivePasses is equal to
    // Integer.MAX_VALUE, returns
    // Integer.MAX_VALUE.
    def getSourceMaxProgressivePass(): Int = ???

    @stub
    // Returns the index of the first progressive pass that will be
    // decoded.
    def getSourceMinProgressivePass(): Int = ???

    @stub
    // Returns the number of the progressive passes that will be
    // decoded.
    def getSourceNumProgressivePasses(): Int = ???

    @stub
    // Returns the width and height of the source image as it
    // will be rendered during decoding, if they have been set via the
    // setSourceRenderSize method.
    def getSourceRenderSize(): Dimension = ???

    @stub
    // Supplies a BufferedImage to be used as the
    // destination for decoded pixel data.
    def setDestination(destination: BufferedImage): Unit = ???

    @stub
    // Sets the indices of the destination bands where data
    // will be placed.
    def setDestinationBands(destinationBands: Array[Int]): Unit = ???

    @stub
    // Sets the desired image type for the destination image, using an
    // ImageTypeSpecifier.
    def setDestinationType(destinationType: ImageTypeSpecifier): Unit = ???

    @stub
    // Sets the range of progressive passes that will be decoded.
    def setSourceProgressivePasses(minPass: Int, numPasses: Int): Unit = ???
}
