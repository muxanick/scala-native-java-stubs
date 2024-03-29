package java.awt.image

import java.awt.RenderingHints
import java.awt.geom.{Point2D, Rectangle2D}
import java.lang.Object
import scala.scalanative.annotation.stub

/** This class performs an arbitrary linear combination of the bands
 *  in a Raster, using a specified matrix.
 *  
 *  The width of the matrix must be equal to the number of bands in the
 *  source Raster, optionally plus one.  If there is one more
 *  column in the matrix than the number of bands, there is an implied 1 at the
 *  end of the vector of band samples representing a pixel.  The height
 *  of the matrix must be equal to the number of bands in the destination.
 *  
 *  For example, a 3-banded Raster might have the following
 *  transformation applied to each pixel in order to invert the second band of
 *  the Raster.
 *  
 *    [ 1.0   0.0   0.0    0.0  ]     [ b1 ]
 *    [ 0.0  -1.0   0.0  255.0  ]  x  [ b2 ]
 *    [ 0.0   0.0   1.0    0.0  ]     [ b3 ]
 *                                    [ 1 ]
 *  
 * 
 *  
 *  Note that the source and destination can be the same object.
 */
class BandCombineOp extends Object with RasterOp {

    /** Constructs a BandCombineOp with the specified matrix. */
    @stub
    def this(matrix: Array[Array[Float]], hints: RenderingHints) = ???

    /** Creates a zeroed destination Raster with the correct size
     *  and number of bands.
     */
    @stub
    def createCompatibleDestRaster(src: Raster): WritableRaster = ???

    /** Transforms the Raster using the matrix specified in the
     *  constructor.
     */
    @stub
    def filter(src: Raster, dst: WritableRaster): WritableRaster = ???

    /** Returns the bounding box of the transformed destination. */
    @stub
    def getBounds2D(src: Raster): Rectangle2D = ???

    /** Returns a copy of the linear combination matrix. */
    @stub
    def getMatrix(): Array[Array[Float]] = ???

    /** Returns the location of the corresponding destination point given a
     *  point in the source Raster.
     */
    @stub
    def getPoint2D(srcPt: Point2D, dstPt: Point2D): Point2D = ???

    /** Returns the rendering hints for this operation. */
    @stub
    def getRenderingHints(): RenderingHints = ???
}
