package java.awt.font

import java.awt.{Graphics2D, Shape}
import java.awt.geom.{AffineTransform, Rectangle2D}
import java.lang.Object

/** The ShapeGraphicAttribute class is an implementation of
 *  GraphicAttribute that draws shapes in a TextLayout.
 */
final class ShapeGraphicAttribute extends GraphicAttribute {

    /** Renders this GraphicAttribute at the specified
     *  location.
     */
    @stub
    def draw(graphics: Graphics2D, x: Float, y: Float): Unit = ???

    /** Compares this ShapeGraphicAttribute to the specified
     *  Object.
     */
    @stub
    def equals(rhs: Object): Boolean = ???

    /** Compares this ShapeGraphicAttribute to the specified
     *  ShapeGraphicAttribute.
     */
    @stub
    def equals(rhs: ShapeGraphicAttribute): Boolean = ???

    /** Returns the advance of this ShapeGraphicAttribute. */
    @stub
    def getAdvance(): Float = ???

    /** Returns the ascent of this ShapeGraphicAttribute. */
    @stub
    def getAscent(): Float = ???

    /** Returns a Rectangle2D that encloses all of the
     *  bits drawn by this ShapeGraphicAttribute relative to
     *  the rendering position.
     */
    @stub
    def getBounds(): Rectangle2D = ???

    /** Returns the descent of this ShapeGraphicAttribute. */
    @stub
    def getDescent(): Float = ???

    /** Return a Shape that represents the region that
     *  this ShapeGraphicAttribute renders.
     */
    @stub
    def getOutline(tx: AffineTransform): Shape = ???
}

object ShapeGraphicAttribute {
    /** A key indicating the shape should be filled. */
    @stub
    val FILL: Boolean = ???
}
