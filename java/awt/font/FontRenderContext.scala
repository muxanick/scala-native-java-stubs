package java.awt.font

import java.awt.geom.AffineTransform
import java.lang.Object
import scala.scalanative.annotation.stub

/** The FontRenderContext class is a container for the
 *    information needed to correctly measure text.  The measurement of text
 *    can vary because of rules that map outlines to pixels, and rendering
 *    hints provided by an application.
 *    
 *    One such piece of information is a transform that scales
 *    typographical points to pixels. (A point is defined to be exactly 1/72
 *    of an inch, which is slightly different than
 *    the traditional mechanical measurement of a point.)  A character that
 *    is rendered at 12pt on a 600dpi device might have a different size
 *    than the same character rendered at 12pt on a 72dpi device because of
 *    such factors as rounding to pixel boundaries and hints that the font
 *    designer may have specified.
 *    
 *    Anti-aliasing and Fractional-metrics specified by an application can also
 *    affect the size of a character because of rounding to pixel
 *    boundaries.
 *    
 *    Typically, instances of FontRenderContext are
 *    obtained from a Graphics2D object.  A
 *    FontRenderContext which is directly constructed will
 *    most likely not represent any actual graphics device, and may lead
 *    to unexpected or incorrect results.
 */
class FontRenderContext extends Object {

    /** Constructs a new FontRenderContext
     *  object.
     */
    @stub
    protected def this() = ???

    /** Constructs a FontRenderContext object from an
     *  optional AffineTransform and two boolean
     *  values that determine if the newly constructed object has
     *  anti-aliasing or fractional metrics.
     */
    @stub
    def this(tx: AffineTransform, isAntiAliased: Boolean, usesFractionalMetrics: Boolean) = ???

    /** Constructs a FontRenderContext object from an
     *  optional AffineTransform and two Object
     *  values that determine if the newly constructed object has
     *  anti-aliasing or fractional metrics.
     */
    @stub
    def this(tx: AffineTransform, aaHint: Any, fmHint: Any) = ???

    /** Return true if rhs has the same transform, antialiasing,
     *  and fractional metrics values as this.
     */
    @stub
    def equals(rhs: FontRenderContext): Boolean = ???

    /** Return true if obj is an instance of FontRenderContext and has the same
     *  transform, antialiasing, and fractional metrics values as this.
     */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Return the text anti-aliasing rendering mode hint used in this
     *  FontRenderContext.
     */
    @stub
    def getAntiAliasingHint(): Any = ???

    /** Return the text fractional metrics rendering mode hint used in this
     *  FontRenderContext.
     */
    @stub
    def getFractionalMetricsHint(): Any = ???

    /** Gets the transform that is used to scale typographical points
     *    to pixels in this FontRenderContext.
     */
    @stub
    def getTransform(): AffineTransform = ???

    /** Returns the integer type of the affine transform for this
     *  FontRenderContext as specified by
     *  AffineTransform.getType()
     */
    @stub
    def getTransformType(): Int = ???

    /** Return a hashcode for this FontRenderContext. */
    @stub
    def hashCode(): Int = ???

    /** Returns a boolean which indicates whether or not some form of
     *  antialiasing is specified by this FontRenderContext.
     */
    @stub
    def isAntiAliased(): Boolean = ???

    /** Indicates whether or not this FontRenderContext object
     *  measures text in a transformed render context.
     */
    @stub
    def isTransformed(): Boolean = ???

    /** Returns a boolean which whether text fractional metrics mode
     *  is used in this FontRenderContext.
     */
    @stub
    def usesFractionalMetrics(): Boolean = ???
}
