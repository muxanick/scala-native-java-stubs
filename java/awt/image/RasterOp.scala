package java.awt.image

import java.awt.RenderingHints
import java.awt.geom.{Point2D, Rectangle2D}
import scala.scalanative.annotation.stub

/** This interface describes single-input/single-output
 *  operations performed on Raster objects.  It is implemented by such
 *  classes as AffineTransformOp, ConvolveOp, and LookupOp.  The Source
 *  and Destination objects must contain the appropriate number
 *  of bands for the particular classes implementing this interface.
 *  Otherwise, an exception is thrown.  This interface cannot be used to
 *  describe more sophisticated Ops such as ones that take multiple sources.
 *  Each class implementing this interface will specify whether or not it
 *  will allow an in-place filtering operation (i.e. source object equal
 *  to the destination object).  Note that the restriction to single-input
 *  operations means that the values of destination pixels prior to the
 *  operation are not used as input to the filter operation.
 */
trait RasterOp {

    /** Creates a zeroed destination Raster with the correct size and number of
     *  bands.
     */
    @stub
    def createCompatibleDestRaster(src: Raster): WritableRaster = ???

    /** Performs a single-input/single-output operation from a source Raster
     *  to a destination Raster.
     */
    @stub
    def filter(src: Raster, dest: WritableRaster): WritableRaster = ???

    /** Returns the bounding box of the filtered destination Raster. */
    @stub
    def getBounds2D(src: Raster): Rectangle2D = ???

    /** Returns the location of the destination point given a
     *  point in the source Raster.
     */
    @stub
    def getPoint2D(srcPt: Point2D, dstPt: Point2D): Point2D = ???

    /** Returns the rendering hints for this RasterOp. */
    @stub
    def getRenderingHints(): RenderingHints = ???
}
