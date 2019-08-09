package java.awt.image

import java.awt.geom.{Point2D, Rectangle2D}
import java.lang.Object

// This class implements a convolution from the source
// to the destination.
// Convolution using a convolution kernel is a spatial operation that
// computes the output pixel from an input pixel by multiplying the kernel
// with the surround of the input pixel.
// This allows the output pixel to be affected by the immediate neighborhood
// in a way that can be mathematically specified with a kernel.
//
// This class operates with BufferedImage data in which color components are
// premultiplied with the alpha component.  If the Source BufferedImage has
// an alpha component, and the color components are not premultiplied with
// the alpha component, then the data are premultiplied before being
// convolved.  If the Destination has color components which are not
// premultiplied, then alpha is divided out before storing into the
// Destination (if alpha is 0, the color components are set to 0).  If the
// Destination has no alpha component, then the resulting alpha is discarded
// after first dividing it out of the color components.
// 
// Rasters are treated as having no alpha channel.  If the above treatment
// of the alpha channel in BufferedImages is not desired, it may be avoided
// by getting the Raster of a source BufferedImage and using the filter method
// of this class which works with Rasters.
// 
// If a RenderingHints object is specified in the constructor, the
// color rendering hint and the dithering hint may be used when color
// conversion is required.
//
// Note that the Source and the Destination may not be the same object.
class ConvolveOp extends Object with BufferedImageOp, with RasterOp {

    @stub
    // Constructs a ConvolveOp given a Kernel.
    def this(kernel: Kernel) = ???

    @stub
    // Creates a zeroed destination image with the correct size and number
    // of bands.
    def createCompatibleDestImage(src: BufferedImage, destCM: ColorModel): BufferedImage = ???

    @stub
    // Creates a zeroed destination Raster with the correct size and number
    // of bands, given this source.
    def createCompatibleDestRaster(src: Raster): WritableRaster = ???

    @stub
    // Performs a convolution on BufferedImages.
    def filter(src: BufferedImage, dst: BufferedImage): BufferedImage = ???

    @stub
    // Performs a convolution on Rasters.
    def filter(src: Raster, dst: WritableRaster): WritableRaster = ???

    @stub
    // Returns the bounding box of the filtered destination image.
    def getBounds2D(src: BufferedImage): Rectangle2D = ???

    @stub
    // Returns the bounding box of the filtered destination Raster.
    def getBounds2D(src: Raster): Rectangle2D = ???

    @stub
    // Returns the edge condition.
    def getEdgeCondition(): Int = ???

    @stub
    // Returns the Kernel.
    def getKernel(): Kernel = ???

    @stub
    // Returns the location of the destination point given a
    // point in the source.
    def getPoint2D(srcPt: Point2D, dstPt: Point2D): Point2D = ???
}

object ConvolveOp {
    @stub
    // Pixels at the edge of the source image are copied to
    // the corresponding pixels in the destination without modification.
    def EDGE_NO_OP: Int = ???
}
