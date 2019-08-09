package java.awt.image

import java.awt.RenderingHints
import java.awt.geom.{Point2D, Rectangle2D}
import java.lang.Object

// This class implements a lookup operation from the source
// to the destination.  The LookupTable object may contain a single array
// or multiple arrays, subject to the restrictions below.
// 
// For Rasters, the lookup operates on bands.  The number of
// lookup arrays may be one, in which case the same array is
// applied to all bands, or it must equal the number of Source
// Raster bands.
// 
// For BufferedImages, the lookup operates on color and alpha components.
// The number of lookup arrays may be one, in which case the
// same array is applied to all color (but not alpha) components.
// Otherwise, the number of lookup arrays may
// equal the number of Source color components, in which case no
// lookup of the alpha component (if present) is performed.
// If neither of these cases apply, the number of lookup arrays
// must equal the number of Source color components plus alpha components,
// in which case lookup is performed for all color and alpha components.
// This allows non-uniform rescaling of multi-band BufferedImages.
// 
// BufferedImage sources with premultiplied alpha data are treated in the same
// manner as non-premultiplied images for purposes of the lookup.  That is,
// the lookup is done per band on the raw data of the BufferedImage source
// without regard to whether the data is premultiplied.  If a color conversion
// is required to the destination ColorModel, the premultiplied state of
// both source and destination will be taken into account for this step.
// 
// Images with an IndexColorModel cannot be used.
// 
// If a RenderingHints object is specified in the constructor, the
// color rendering hint and the dithering hint may be used when color
// conversion is required.
// 
// This class allows the Source to be the same as the Destination.
class LookupOp extends Object with BufferedImageOp, with RasterOp {

    @stub
    // Creates a zeroed destination image with the correct size and number of
    // bands.
    def createCompatibleDestImage(src: BufferedImage, destCM: ColorModel): BufferedImage = ???

    @stub
    // Creates a zeroed-destination Raster with the
    // correct size and number of bands, given this source.
    def createCompatibleDestRaster(src: Raster): WritableRaster = ???

    @stub
    // Performs a lookup operation on a BufferedImage.
    def filter(src: BufferedImage, dst: BufferedImage): BufferedImage = ???

    @stub
    // Performs a lookup operation on a Raster.
    def filter(src: Raster, dst: WritableRaster): WritableRaster = ???

    @stub
    // Returns the bounding box of the filtered destination image.
    def getBounds2D(src: BufferedImage): Rectangle2D = ???

    @stub
    // Returns the bounding box of the filtered destination Raster.
    def getBounds2D(src: Raster): Rectangle2D = ???

    @stub
    // Returns the location of the destination point given a
    // point in the source.
    def getPoint2D(srcPt: Point2D, dstPt: Point2D): Point2D = ???

    @stub
    // Returns the rendering hints for this op.
    def getRenderingHints(): RenderingHints = ???
}
