package java.awt.image

import java.awt.RenderingHints
import java.awt.geom.{Point2D, Rectangle2D}
import java.lang.Object
import scala.scalanative.annotation.stub

/** This class implements a convolution from the source
 *  to the destination.
 *  Convolution using a convolution kernel is a spatial operation that
 *  computes the output pixel from an input pixel by multiplying the kernel
 *  with the surround of the input pixel.
 *  This allows the output pixel to be affected by the immediate neighborhood
 *  in a way that can be mathematically specified with a kernel.
 * 
 *  This class operates with BufferedImage data in which color components are
 *  premultiplied with the alpha component.  If the Source BufferedImage has
 *  an alpha component, and the color components are not premultiplied with
 *  the alpha component, then the data are premultiplied before being
 *  convolved.  If the Destination has color components which are not
 *  premultiplied, then alpha is divided out before storing into the
 *  Destination (if alpha is 0, the color components are set to 0).  If the
 *  Destination has no alpha component, then the resulting alpha is discarded
 *  after first dividing it out of the color components.
 *  
 *  Rasters are treated as having no alpha channel.  If the above treatment
 *  of the alpha channel in BufferedImages is not desired, it may be avoided
 *  by getting the Raster of a source BufferedImage and using the filter method
 *  of this class which works with Rasters.
 *  
 *  If a RenderingHints object is specified in the constructor, the
 *  color rendering hint and the dithering hint may be used when color
 *  conversion is required.
 * 
 *  Note that the Source and the Destination may not be the same object.
 */
class ConvolveOp extends Object with BufferedImageOp with RasterOp {

    /** Constructs a ConvolveOp given a Kernel. */
    @stub
    def this(kernel: Kernel) = ???

    /** Constructs a ConvolveOp given a Kernel, an edge condition, and a
     *  RenderingHints object (which may be null).
     */
    @stub
    def this(kernel: Kernel, edgeCondition: Int, hints: RenderingHints) = ???

    /** Creates a zeroed destination image with the correct size and number
     *  of bands.
     */
    @stub
    def createCompatibleDestImage(src: BufferedImage, destCM: ColorModel): BufferedImage = ???

    /** Creates a zeroed destination Raster with the correct size and number
     *  of bands, given this source.
     */
    @stub
    def createCompatibleDestRaster(src: Raster): WritableRaster = ???

    /** Performs a convolution on BufferedImages. */
    @stub
    def filter(src: BufferedImage, dst: BufferedImage): BufferedImage = ???

    /** Performs a convolution on Rasters. */
    @stub
    def filter(src: Raster, dst: WritableRaster): WritableRaster = ???

    /** Returns the bounding box of the filtered destination image. */
    @stub
    def getBounds2D(src: BufferedImage): Rectangle2D = ???

    /** Returns the bounding box of the filtered destination Raster. */
    @stub
    def getBounds2D(src: Raster): Rectangle2D = ???

    /** Returns the edge condition. */
    @stub
    def getEdgeCondition(): Int = ???

    /** Returns the Kernel. */
    @stub
    def getKernel(): Kernel = ???

    /** Returns the location of the destination point given a
     *  point in the source.
     */
    @stub
    def getPoint2D(srcPt: Point2D, dstPt: Point2D): Point2D = ???

    /** Returns the rendering hints for this op. */
    @stub
    def getRenderingHints(): RenderingHints = ???
}

object ConvolveOp {
    /** Pixels at the edge of the source image are copied to
     *  the corresponding pixels in the destination without modification.
     */
    @stub
    val EDGE_NO_OP: Int = ???

    /** Pixels at the edge of the destination image are set to zero. */
    @stub
    val EDGE_ZERO_FILL: Int = ???
}
