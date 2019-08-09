package java.awt.font

import java.awt.{Graphics2D, Shape}
import java.awt.geom.{AffineTransform, Rectangle2D}
import java.lang.Object

// The ShapeGraphicAttribute class is an implementation of
// GraphicAttribute that draws shapes in a TextLayout.
final class ShapeGraphicAttribute extends GraphicAttribute {

    @stub
    // Renders this GraphicAttribute at the specified
    // location.
    def draw(graphics: Graphics2D, x: float, y: float): Unit = ???

    @stub
    // Compares this ShapeGraphicAttribute to the specified
    // Object.
    def equals(rhs: Object): Boolean = ???

    @stub
    // Compares this ShapeGraphicAttribute to the specified
    // ShapeGraphicAttribute.
    def equals(rhs: ShapeGraphicAttribute): Boolean = ???

    @stub
    // Returns the advance of this ShapeGraphicAttribute.
    def getAdvance(): float = ???

    @stub
    // Returns the ascent of this ShapeGraphicAttribute.
    def getAscent(): float = ???

    @stub
    // Returns a Rectangle2D that encloses all of the
    // bits drawn by this ShapeGraphicAttribute relative to
    // the rendering position.
    def getBounds(): Rectangle2D = ???

    @stub
    // Returns the descent of this ShapeGraphicAttribute.
    def getDescent(): float = ???

    @stub
    // Return a Shape that represents the region that
    // this ShapeGraphicAttribute renders.
    def getOutline(tx: AffineTransform): Shape = ???
}

object ShapeGraphicAttribute {
    @stub
    // A key indicating the shape should be filled.
    def FILL: Boolean = ???
}
