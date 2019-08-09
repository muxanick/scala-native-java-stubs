package java.awt.image

import java.awt.RenderingHints
import java.awt.color.{ColorSpace, ICC_Profile}
import java.awt.geom.{Point2D, Rectangle2D}
import java.lang.Object

// This class performs a pixel-by-pixel color conversion of the data in
// the source image.  The resulting color values are scaled to the precision
// of the destination image.  Color conversion can be specified
// via an array of ColorSpace objects or an array of ICC_Profile objects.
// 
// If the source is a BufferedImage with premultiplied alpha, the
// color components are divided by the alpha component before color conversion.
// If the destination is a BufferedImage with premultiplied alpha, the
// color components are multiplied by the alpha component after conversion.
// Rasters are treated as having no alpha channel, i.e. all bands are
// color bands.
// 
// If a RenderingHints object is specified in the constructor, the
// color rendering hint and the dithering hint may be used to control
// color conversion.
// 
// Note that Source and Destination may be the same object.
class ColorConvertOp extends Object with BufferedImageOp, with RasterOp {

    @stub
    // Constructs a new ColorConvertOp from two ColorSpace objects.
    def this(srcCspace: ColorSpace, dstCspace: ColorSpace, hints: RenderingHints) = ???

    @stub
    // Constructs a new ColorConvertOp from a ColorSpace object.
    def this(cspace: ColorSpace, hints: RenderingHints) = ???

    @stub
    // Constructs a new ColorConvertOp from an array of ICC_Profiles.
    def this(profiles: Array[ICC_Profile], hints: RenderingHints) = ???

    @stub
    // Creates a zeroed destination image with the correct size and number of
    // bands, given this source.
    def createCompatibleDestImage(src: BufferedImage, destCM: ColorModel): BufferedImage = ???

    @stub
    // Creates a zeroed destination Raster with the correct size and number of
    // bands, given this source.
    def createCompatibleDestRaster(src: Raster): WritableRaster = ???

    @stub
    // ColorConverts the source BufferedImage.
    def filter(src: BufferedImage, dest: BufferedImage): BufferedImage = ???

    @stub
    // ColorConverts the image data in the source Raster.
    def filter(src: Raster, dest: WritableRaster): WritableRaster = ???

    @stub
    // Returns the bounding box of the destination, given this source.
    def getBounds2D(src: BufferedImage): Rectangle2D = ???

    @stub
    // Returns the bounding box of the destination, given this source.
    def getBounds2D(src: Raster): Rectangle2D = ???

    @stub
    // Returns the array of ICC_Profiles used to construct this ColorConvertOp.
    def getICC_Profiles(): Array[ICC_Profile] = ???

    @stub
    // Returns the location of the destination point given a
    // point in the source.
    def getPoint2D(srcPt: Point2D, dstPt: Point2D): Point2D = ???
}
