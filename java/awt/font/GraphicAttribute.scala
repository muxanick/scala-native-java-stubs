package java.awt.font

import java.awt.{Graphics2D, Shape}
import java.awt.geom.{AffineTransform, Rectangle2D}
import java.lang.Object
import scala.scalanative.annotation.stub

/** This class is used with the CHAR_REPLACEMENT attribute.
 *  
 *  The GraphicAttribute class represents a graphic embedded
 *  in text. Clients subclass this class to implement their own char
 *  replacement graphics.  Clients wishing to embed shapes and images in
 *  text need not subclass this class.  Instead, clients can use the
 *  ShapeGraphicAttribute and ImageGraphicAttribute
 *  classes.
 *  
 *  Subclasses must ensure that their objects are immutable once they
 *  are constructed.  Mutating a GraphicAttribute that
 *  is used in a TextLayout results in undefined behavior from the
 *  TextLayout.
 */
abstract class GraphicAttribute extends Object {

    /** Constructs a GraphicAttribute. */
    @stub
    protected def this(alignment: Int) = ???

    /** Renders this GraphicAttribute at the specified
     *  location.
     */
    def draw(graphics: Graphics2D, x: Float, y: Float): Unit

    /** Returns the advance of this GraphicAttribute. */
    def getAdvance(): Float

    /** Returns the alignment of this GraphicAttribute. */
    def getAlignment(): Int

    /** Returns the ascent of this GraphicAttribute. */
    def getAscent(): Float

    /** Returns a Rectangle2D that encloses all of the
     *  bits drawn by this GraphicAttribute relative to the
     *  rendering position.
     */
    def getBounds(): Rectangle2D

    /** Returns the descent of this GraphicAttribute. */
    def getDescent(): Float

    /** Returns the justification information for this
     *  GraphicAttribute.
     */
    def getJustificationInfo(): GlyphJustificationInfo

    /** Return a Shape that represents the region that
     *  this GraphicAttribute renders.
     */
    def getOutline(tx: AffineTransform): Shape
}

object GraphicAttribute {
    /** Aligns bottom of graphic to bottom of line. */
    @stub
    val BOTTOM_ALIGNMENT: Int = ???

    /** Aligns origin of graphic to center baseline of line. */
    @stub
    val CENTER_BASELINE: Int = ???

    /** Aligns origin of graphic to hanging baseline of line. */
    @stub
    val HANGING_BASELINE: Int = ???

    /** Aligns origin of graphic to roman baseline of line. */
    @stub
    val ROMAN_BASELINE: Int = ???

    /** Aligns top of graphic to top of line. */
    @stub
    val TOP_ALIGNMENT: Int = ???
}
