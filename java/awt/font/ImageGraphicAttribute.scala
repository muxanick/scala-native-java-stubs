package java.awt.font

import java.awt.{Graphics2D, Image}
import java.awt.geom.Rectangle2D
import java.lang.Object

// The ImageGraphicAttribute class is an implementation of
// GraphicAttribute which draws images in
// a TextLayout.
final class ImageGraphicAttribute extends GraphicAttribute {

    @stub
    // Constucts an ImageGraphicAttribute from the specified
    // Image.
    def this(image: Image, alignment: Int) = ???

    @stub
    // Renders this GraphicAttribute at the specified
    // location.
    def draw(graphics: Graphics2D, x: float, y: float): Unit = ???

    @stub
    // Compares this ImageGraphicAttribute to the specified
    // ImageGraphicAttribute.
    def equals(rhs: ImageGraphicAttribute): Boolean = ???

    @stub
    // Compares this ImageGraphicAttribute to the specified
    // Object.
    def equals(rhs: Object): Boolean = ???

    @stub
    // Returns the advance of this ImageGraphicAttribute.
    def getAdvance(): float = ???

    @stub
    // Returns the ascent of this ImageGraphicAttribute.
    def getAscent(): float = ???

    @stub
    // Returns a Rectangle2D that encloses all of the
    // bits rendered by this ImageGraphicAttribute, relative
    // to the rendering position.
    def getBounds(): Rectangle2D = ???

    @stub
    // Returns the descent of this ImageGraphicAttribute.
    def getDescent(): float = ???
}
