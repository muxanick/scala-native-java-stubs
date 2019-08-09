package java.awt.image

import java.awt.RenderingHints
import java.awt.geom.{AffineTransform, Point2D, Rectangle2D}
import java.lang.Object

// This class uses an affine transform to perform a linear mapping from
// 2D coordinates in the source image or Raster to 2D coordinates
// in the destination image or Raster.
// The type of interpolation that is used is specified through a constructor,
// either by a RenderingHints object or by one of the integer
// interpolation types defined in this class.
// 
// If a RenderingHints object is specified in the constructor, the
// interpolation hint and the rendering quality hint are used to set
// the interpolation type for this operation.  The color rendering hint
// and the dithering hint can be used when color conversion is required.
// 
// Note that the following constraints have to be met:
// 
// The source and destination must be different.
// For Raster objects, the number of bands in the source must
// be equal to the number of bands in the destination.
// 
class AffineTransformOp extends Object with BufferedImageOp, with RasterOp {

    @stub
    // Constructs an AffineTransformOp given an affine transform
    // and the interpolation type.
    def this(xform: AffineTransform, interpolationType: Int) = ???

    @stub
    // Creates a zeroed destination image with the correct size and number of
    // bands.
    def createCompatibleDestImage(src: BufferedImage, destCM: ColorModel): BufferedImage = ???

    @stub
    // Creates a zeroed destination Raster with the correct size
    // and number of bands.
    def createCompatibleDestRaster(src: Raster): WritableRaster = ???

    @stub
    // Transforms the source BufferedImage and stores the results
    // in the destination BufferedImage.
    def filter(src: BufferedImage, dst: BufferedImage): BufferedImage = ???

    @stub
    // Transforms the source Raster and stores the results in
    // the destination Raster.
    def filter(src: Raster, dst: WritableRaster): WritableRaster = ???

    @stub
    // Returns the bounding box of the transformed destination.
    def getBounds2D(src: BufferedImage): Rectangle2D = ???

    @stub
    // Returns the bounding box of the transformed destination.
    def getBounds2D(src: Raster): Rectangle2D = ???

    @stub
    // Returns the interpolation type used by this op.
    def getInterpolationType(): Int = ???

    @stub
    // Returns the location of the corresponding destination point given a
    // point in the source.
    def getPoint2D(srcPt: Point2D, dstPt: Point2D): Point2D = ???

    @stub
    // Returns the rendering hints used by this transform operation.
    def getRenderingHints(): RenderingHints = ???
}

object AffineTransformOp {
    @stub
    // Bicubic interpolation type.
    def TYPE_BICUBIC: Int = ???

    @stub
    // Bilinear interpolation type.
    def TYPE_BILINEAR: Int = ???
}
