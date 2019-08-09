package java.awt.image

import java.awt.RenderingHints
import java.awt.geom.{AffineTransform, Point2D, Rectangle2D}
import java.lang.Object
import scala.scalanative.annotation.stub

/** This class uses an affine transform to perform a linear mapping from
 *  2D coordinates in the source image or Raster to 2D coordinates
 *  in the destination image or Raster.
 *  The type of interpolation that is used is specified through a constructor,
 *  either by a RenderingHints object or by one of the integer
 *  interpolation types defined in this class.
 *  
 *  If a RenderingHints object is specified in the constructor, the
 *  interpolation hint and the rendering quality hint are used to set
 *  the interpolation type for this operation.  The color rendering hint
 *  and the dithering hint can be used when color conversion is required.
 *  
 *  Note that the following constraints have to be met:
 *  
 *  The source and destination must be different.
 *  For Raster objects, the number of bands in the source must
 *  be equal to the number of bands in the destination.
 *  
 */
class AffineTransformOp extends Object with BufferedImageOp with RasterOp {

    /** Constructs an AffineTransformOp given an affine transform
     *  and the interpolation type.
     */
    @stub
    def this(xform: AffineTransform, interpolationType: Int) = ???

    /** Constructs an AffineTransformOp given an affine transform. */
    @stub
    def this(xform: AffineTransform, hints: RenderingHints) = ???

    /** Creates a zeroed destination image with the correct size and number of
     *  bands.
     */
    @stub
    def createCompatibleDestImage(src: BufferedImage, destCM: ColorModel): BufferedImage = ???

    /** Creates a zeroed destination Raster with the correct size
     *  and number of bands.
     */
    @stub
    def createCompatibleDestRaster(src: Raster): WritableRaster = ???

    /** Transforms the source BufferedImage and stores the results
     *  in the destination BufferedImage.
     */
    @stub
    def filter(src: BufferedImage, dst: BufferedImage): BufferedImage = ???

    /** Transforms the source Raster and stores the results in
     *  the destination Raster.
     */
    @stub
    def filter(src: Raster, dst: WritableRaster): WritableRaster = ???

    /** Returns the bounding box of the transformed destination. */
    @stub
    def getBounds2D(src: BufferedImage): Rectangle2D = ???

    /** Returns the bounding box of the transformed destination. */
    @stub
    def getBounds2D(src: Raster): Rectangle2D = ???

    /** Returns the interpolation type used by this op. */
    @stub
    def getInterpolationType(): Int = ???

    /** Returns the location of the corresponding destination point given a
     *  point in the source.
     */
    @stub
    def getPoint2D(srcPt: Point2D, dstPt: Point2D): Point2D = ???

    /** Returns the rendering hints used by this transform operation. */
    @stub
    def getRenderingHints(): RenderingHints = ???

    /** Returns the affine transform used by this transform operation. */
    @stub
    def getTransform(): AffineTransform = ???
}

object AffineTransformOp {
    /** Bicubic interpolation type. */
    @stub
    val TYPE_BICUBIC: Int = ???

    /** Bilinear interpolation type. */
    @stub
    val TYPE_BILINEAR: Int = ???

    /** Nearest-neighbor interpolation type. */
    @stub
    val TYPE_NEAREST_NEIGHBOR: Int = ???
}
