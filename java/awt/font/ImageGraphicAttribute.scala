package java.awt.font

import java.awt.{Graphics2D, Image}
import java.awt.geom.Rectangle2D
import java.lang.Object
import scala.scalanative.annotation.stub

/** The ImageGraphicAttribute class is an implementation of
 *  GraphicAttribute which draws images in
 *  a TextLayout.
 */
final class ImageGraphicAttribute extends GraphicAttribute {

    /** Constucts an ImageGraphicAttribute from the specified
     *  Image.
     */
    @stub
    def this(image: Image, alignment: Int) = ???

    /** Constructs an ImageGraphicAttribute from the specified
     *  Image.
     */
    @stub
    def this(image: Image, alignment: Int, originX: Float, originY: Float) = ???

    /** Renders this GraphicAttribute at the specified
     *  location.
     */
    @stub
    def draw(graphics: Graphics2D, x: Float, y: Float): Unit = ???

    /** Compares this ImageGraphicAttribute to the specified
     *  ImageGraphicAttribute.
     */
    @stub
    def equals(rhs: ImageGraphicAttribute): Boolean = ???

    /** Compares this ImageGraphicAttribute to the specified
     *  Object.
     */
    @stub
    def equals(rhs: Object): Boolean = ???

    /** Returns the advance of this ImageGraphicAttribute. */
    @stub
    def getAdvance(): Float = ???

    /** Returns the ascent of this ImageGraphicAttribute. */
    @stub
    def getAscent(): Float = ???

    /** Returns a Rectangle2D that encloses all of the
     *  bits rendered by this ImageGraphicAttribute, relative
     *  to the rendering position.
     */
    @stub
    def getBounds(): Rectangle2D = ???

    /** Returns the descent of this ImageGraphicAttribute. */
    @stub
    def getDescent(): Float = ???

    /** Returns a hashcode for this ImageGraphicAttribute. */
    @stub
    def hashCode(): Int = ???
}
