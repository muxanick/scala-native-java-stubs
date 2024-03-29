package java.awt

import java.awt.image.{ColorModel, Raster}
import scala.scalanative.annotation.stub

/** The PaintContext interface defines the encapsulated
 *  and optimized environment to generate color patterns in device
 *  space for fill or stroke operations on a
 *  Graphics2D.  The PaintContext provides
 *  the necessary colors for Graphics2D operations in the
 *  form of a Raster associated with a ColorModel.
 *  The PaintContext maintains state for a particular paint
 *  operation.  In a multi-threaded environment, several
 *  contexts can exist simultaneously for a single Paint object.
 */
trait PaintContext {

    /** Releases the resources allocated for the operation. */
    @stub
    def dispose(): Unit = ???

    /** Returns the ColorModel of the output. */
    @stub
    def getColorModel(): ColorModel = ???

    /** Returns a Raster containing the colors generated for
     *  the graphics operation.
     */
    @stub
    def getRaster(x: Int, y: Int, w: Int, h: Int): Raster = ???
}
