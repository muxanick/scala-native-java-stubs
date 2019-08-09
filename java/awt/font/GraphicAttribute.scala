package java.awt.font

import java.awt.Graphics2D
import java.awt.geom.Rectangle2D
import java.lang.Object

// This class is used with the CHAR_REPLACEMENT attribute.
// 
// The GraphicAttribute class represents a graphic embedded
// in text. Clients subclass this class to implement their own char
// replacement graphics.  Clients wishing to embed shapes and images in
// text need not subclass this class.  Instead, clients can use the
// ShapeGraphicAttribute and ImageGraphicAttribute
// classes.
// 
// Subclasses must ensure that their objects are immutable once they
// are constructed.  Mutating a GraphicAttribute that
// is used in a TextLayout results in undefined behavior from the
// TextLayout.
abstract class GraphicAttribute extends Object {

    // Renders this GraphicAttribute at the specified
    // location.
    def draw(graphics: Graphics2D, x: float, y: float): Unit

    // Returns the advance of this GraphicAttribute.
    def getAdvance(): float

    // Returns the alignment of this GraphicAttribute.
    def getAlignment(): Int

    // Returns the ascent of this GraphicAttribute.
    def getAscent(): float

    // Returns a Rectangle2D that encloses all of the
    // bits drawn by this GraphicAttribute relative to the
    // rendering position.
    def getBounds(): Rectangle2D

    // Returns the descent of this GraphicAttribute.
    def getDescent(): float

    // Returns the justification information for this
    // GraphicAttribute.
    def getJustificationInfo(): GlyphJustificationInfo
}

object GraphicAttribute {
    @stub
    // Aligns bottom of graphic to bottom of line.
    def BOTTOM_ALIGNMENT: Int = ???

    @stub
    // Aligns origin of graphic to center baseline of line.
    def CENTER_BASELINE: Int = ???

    @stub
    // Aligns origin of graphic to hanging baseline of line.
    def HANGING_BASELINE: Int = ???

    @stub
    // Aligns origin of graphic to roman baseline of line.
    def ROMAN_BASELINE: Int = ???
}
