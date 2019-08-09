package java.awt.image

import java.awt.RenderingHints
import java.awt.geom.{Point2D, Rectangle2D}
import java.lang.Object

/** This class performs a pixel-by-pixel rescaling of the data in the
 *  source image by multiplying the sample values for each pixel by a scale
 *  factor and then adding an offset. The scaled sample values are clipped
 *  to the minimum/maximum representable in the destination image.
 *  
 *  The pseudo code for the rescaling operation is as follows:
 *  
 * for each pixel from Source object {
 *     for each band/component of the pixel {
 *         dstElement = (srcElement*scaleFactor) + offset
 *     }
 * }
 *  
 *  
 *  For Rasters, rescaling operates on bands.  The number of
 *  sets of scaling constants may be one, in which case the same constants
 *  are applied to all bands, or it must equal the number of Source
 *  Raster bands.
 *  
 *  For BufferedImages, rescaling operates on color and alpha components.
 *  The number of sets of scaling constants may be one, in which case the
 *  same constants are applied to all color (but not alpha) components.
 *  Otherwise, the  number of sets of scaling constants may
 *  equal the number of Source color components, in which case no
 *  rescaling of the alpha component (if present) is performed.
 *  If neither of these cases apply, the number of sets of scaling constants
 *  must equal the number of Source color components plus alpha components,
 *  in which case all color and alpha components are rescaled.
 *  
 *  BufferedImage sources with premultiplied alpha data are treated in the same
 *  manner as non-premultiplied images for purposes of rescaling.  That is,
 *  the rescaling is done per band on the raw data of the BufferedImage source
 *  without regard to whether the data is premultiplied.  If a color conversion
 *  is required to the destination ColorModel, the premultiplied state of
 *  both source and destination will be taken into account for this step.
 *  
 *  Images with an IndexColorModel cannot be rescaled.
 *  
 *  If a RenderingHints object is specified in the constructor, the
 *  color rendering hint and the dithering hint may be used when color
 *  conversion is required.
 *  
 *  Note that in-place operation is allowed (i.e. the source and destination can
 *  be the same object).
 */
class RescaleOp extends Object with BufferedImageOp with RasterOp {

    /** Constructs a new RescaleOp with the desired scale factors
     *  and offsets.
     */
    @stub
    def this(scaleFactors: Array[Float], offsets: Array[Float], hints: RenderingHints) = ???

    /** Creates a zeroed destination image with the correct size and number of
     *  bands.
     */
    @stub
    def createCompatibleDestImage(src: BufferedImage, destCM: ColorModel): BufferedImage = ???

    /** Creates a zeroed-destination Raster with the correct
     *  size and number of bands, given this source.
     */
    @stub
    def createCompatibleDestRaster(src: Raster): WritableRaster = ???

    /** Rescales the source BufferedImage. */
    @stub
    def filter(src: BufferedImage, dst: BufferedImage): BufferedImage = ???

    /** Rescales the pixel data in the source Raster. */
    @stub
    def filter(src: Raster, dst: WritableRaster): WritableRaster = ???

    /** Returns the bounding box of the rescaled destination image. */
    @stub
    def getBounds2D(src: BufferedImage): Rectangle2D = ???

    /** Returns the bounding box of the rescaled destination Raster. */
    @stub
    def getBounds2D(src: Raster): Rectangle2D = ???

    /** Returns the number of scaling factors and offsets used in this
     *  RescaleOp.
     */
    @stub
    def getNumFactors(): Int = ???

    /** Returns the offsets in the given array. */
    @stub
    def getOffsets(offsets: Array[Float]): Array[Float] = ???

    /** Returns the location of the destination point given a
     *  point in the source.
     */
    @stub
    def getPoint2D(srcPt: Point2D, dstPt: Point2D): Point2D = ???

    /** Returns the rendering hints for this op. */
    @stub
    def getRenderingHints(): RenderingHints = ???
}
