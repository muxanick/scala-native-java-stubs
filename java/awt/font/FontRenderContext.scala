package java.awt.font

import java.awt.geom.AffineTransform
import java.lang.Object

// The FontRenderContext class is a container for the
//   information needed to correctly measure text.  The measurement of text
//   can vary because of rules that map outlines to pixels, and rendering
//   hints provided by an application.
//   
//   One such piece of information is a transform that scales
//   typographical points to pixels. (A point is defined to be exactly 1/72
//   of an inch, which is slightly different than
//   the traditional mechanical measurement of a point.)  A character that
//   is rendered at 12pt on a 600dpi device might have a different size
//   than the same character rendered at 12pt on a 72dpi device because of
//   such factors as rounding to pixel boundaries and hints that the font
//   designer may have specified.
//   
//   Anti-aliasing and Fractional-metrics specified by an application can also
//   affect the size of a character because of rounding to pixel
//   boundaries.
//   
//   Typically, instances of FontRenderContext are
//   obtained from a Graphics2D object.  A
//   FontRenderContext which is directly constructed will
//   most likely not represent any actual graphics device, and may lead
//   to unexpected or incorrect results.
class FontRenderContext extends Object {

    @stub
    // Constructs a new FontRenderContext
    // object.
    protected def this() = ???

    @stub
    // Constructs a FontRenderContext object from an
    // optional AffineTransform and two boolean
    // values that determine if the newly constructed object has
    // anti-aliasing or fractional metrics.
    def this(tx: AffineTransform, isAntiAliased: Boolean, usesFractionalMetrics: Boolean) = ???

    @stub
    // Return true if rhs has the same transform, antialiasing,
    // and fractional metrics values as this.
    def equals(rhs: FontRenderContext): Boolean = ???

    @stub
    // Return true if obj is an instance of FontRenderContext and has the same
    // transform, antialiasing, and fractional metrics values as this.
    def equals(obj: Object): Boolean = ???

    @stub
    // Return the text anti-aliasing rendering mode hint used in this
    // FontRenderContext.
    def getAntiAliasingHint(): Object = ???

    @stub
    // Return the text fractional metrics rendering mode hint used in this
    // FontRenderContext.
    def getFractionalMetricsHint(): Object = ???

    @stub
    // Gets the transform that is used to scale typographical points
    //   to pixels in this FontRenderContext.
    def getTransform(): AffineTransform = ???

    @stub
    // Returns the integer type of the affine transform for this
    // FontRenderContext as specified by
    // AffineTransform.getType()
    def getTransformType(): Int = ???

    @stub
    // Return a hashcode for this FontRenderContext.
    def hashCode(): Int = ???

    @stub
    // Returns a boolean which indicates whether or not some form of
    // antialiasing is specified by this FontRenderContext.
    def isAntiAliased(): Boolean = ???

    @stub
    // Indicates whether or not this FontRenderContext object
    // measures text in a transformed render context.
    def isTransformed(): Boolean = ???
}