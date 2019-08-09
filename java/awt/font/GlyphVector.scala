package java.awt.font

import java.awt.{Font, Rectangle, Shape}
import java.awt.geom.{AffineTransform, Point2D, Rectangle2D}
import java.lang.{Cloneable, Object}
import scala.scalanative.annotation.stub

/** A GlyphVector object is a collection of glyphs
 *  containing geometric information for the placement of each glyph
 *  in a transformed coordinate space which corresponds to the
 *  device on which the GlyphVector is ultimately
 *  displayed.
 *  
 *  The GlyphVector does not attempt any interpretation of
 *  the sequence of glyphs it contains.  Relationships between adjacent
 *  glyphs in sequence are solely used to determine the placement of
 *  the glyphs in the visual coordinate space.
 *  
 *  Instances of GlyphVector are created by a Font.
 *  
 *  In a text processing application that can cache intermediate
 *  representations of text, creation and subsequent caching of a
 *  GlyphVector for use during rendering is the fastest
 *  method to present the visual representation of characters to a user.
 *  
 *  A GlyphVector is associated with exactly one
 *  Font, and can provide data useful only in relation to
 *  this Font.  In addition, metrics obtained from a
 *  GlyphVector are not generally geometrically scaleable
 *  since the pixelization and spacing are dependent on grid-fitting
 *  algorithms within a Font.  To facilitate accurate
 *  measurement of a GlyphVector and its component
 *  glyphs, you must specify a scaling transform, anti-alias mode, and
 *  fractional metrics mode when creating the GlyphVector.
 *  These characteristics can be derived from the destination device.
 *  
 *  For each glyph in the GlyphVector, you can obtain:
 *  
 *  the position of the glyph
 *  the transform associated with the glyph
 *  the metrics of the glyph in the context of the
 *    GlyphVector.  The metrics of the glyph may be
 *    different under different transforms, application specified
 *    rendering hints, and the specific instance of the glyph within
 *    the GlyphVector.
 *  
 *  
 *  Altering the data used to create the GlyphVector does not
 *  alter the state of the GlyphVector.
 *  
 *  Methods are provided to adjust the positions of the glyphs
 *  within the GlyphVector.  These methods are most
 *  appropriate for applications that are performing justification
 *  operations for the presentation of the glyphs.
 *  
 *  Methods are provided to transform individual glyphs within the
 *  GlyphVector.  These methods are primarily useful for
 *  special effects.
 *  
 *  Methods are provided to return both the visual, logical, and pixel bounds
 *  of the entire GlyphVector or of individual glyphs within
 *  the GlyphVector.
 *  
 *  Methods are provided to return a Shape for the
 *  GlyphVector, and for individual glyphs within the
 *  GlyphVector.
 */
abstract class GlyphVector extends Object with Cloneable {

    /**  */
    @stub
    def this() = ???

    /** Tests if the specified GlyphVector exactly
     *  equals this GlyphVector.
     */
    def equals(set: GlyphVector): Boolean

    /** Returns the Font associated with this
     *  GlyphVector.
     */
    def getFont(): Font

    /** Returns the FontRenderContext associated with this
     *  GlyphVector.
     */
    def getFontRenderContext(): FontRenderContext

    /** Returns the character index of the specified glyph. */
    def getGlyphCharIndex(glyphIndex: Int): Int

    /** Returns the character indices of the specified glyphs. */
    def getGlyphCharIndices(beginGlyphIndex: Int, numEntries: Int, codeReturn: Array[Int]): Array[Int]

    /** Returns the glyphcode of the specified glyph. */
    def getGlyphCode(glyphIndex: Int): Int

    /** Returns an array of glyphcodes for the specified glyphs. */
    def getGlyphCodes(beginGlyphIndex: Int, numEntries: Int, codeReturn: Array[Int]): Array[Int]

    /** Returns the justification information for the glyph at
     *  the specified index into this GlyphVector.
     */
    def getGlyphJustificationInfo(glyphIndex: Int): GlyphJustificationInfo

    /** Returns the logical bounds of the specified glyph within this
     *  GlyphVector.
     */
    def getGlyphLogicalBounds(glyphIndex: Int): Shape

    /** Returns the metrics of the glyph at the specified index into
     *  this GlyphVector.
     */
    def getGlyphMetrics(glyphIndex: Int): GlyphMetrics

    /** Returns a Shape whose interior corresponds to the
     *  visual representation of the specified glyph
     *  within this GlyphVector.
     */
    def getGlyphOutline(glyphIndex: Int): Shape

    /** Returns a Shape whose interior corresponds to the
     *  visual representation of the specified glyph
     *  within this GlyphVector, offset to x, y.
     */
    def getGlyphOutline(glyphIndex: Int, x: Float, y: Float): Shape

    /** Returns the pixel bounds of the glyph at index when this
     *  GlyphVector is rendered in a Graphics with the
     *  given FontRenderContext at the given location.
     */
    def getGlyphPixelBounds(index: Int, renderFRC: FontRenderContext, x: Float, y: Float): Rectangle

    /** Returns the position of the specified glyph relative to the
     *  origin of this GlyphVector.
     */
    def getGlyphPosition(glyphIndex: Int): Point2D

    /** Returns an array of glyph positions for the specified glyphs. */
    def getGlyphPositions(beginGlyphIndex: Int, numEntries: Int, positionReturn: Array[Float]): Array[Float]

    /** Returns the transform of the specified glyph within this
     *  GlyphVector.
     */
    def getGlyphTransform(glyphIndex: Int): AffineTransform

    /** Returns the visual bounds of the specified glyph within the
     *  GlyphVector.
     */
    def getGlyphVisualBounds(glyphIndex: Int): Shape

    /** Returns flags describing the global state of the GlyphVector. */
    def getLayoutFlags(): Int

    /** Returns the logical bounds of this GlyphVector. */
    def getLogicalBounds(): Rectangle2D

    /** Returns the number of glyphs in this GlyphVector. */
    def getNumGlyphs(): Int

    /** Returns a Shape whose interior corresponds to the
     *  visual representation of this GlyphVector.
     */
    def getOutline(): Shape

    /** Returns a Shape whose interior corresponds to the
     *  visual representation of this GlyphVector when
     *  rendered at x, y.
     */
    def getOutline(x: Float, y: Float): Shape

    /** Returns the pixel bounds of this GlyphVector when
     *  rendered in a graphics with the given
     *  FontRenderContext at the given location.
     */
    def getPixelBounds(renderFRC: FontRenderContext, x: Float, y: Float): Rectangle

    /** Returns the visual bounds of this GlyphVector
     *  The visual bounds is the bounding box of the outline of this
     *  GlyphVector.
     */
    def getVisualBounds(): Rectangle2D

    /** Assigns default positions to each glyph in this
     *  GlyphVector.
     */
    def performDefaultLayout(): Unit

    /** Sets the position of the specified glyph within this
     *  GlyphVector.
     */
    def setGlyphPosition(glyphIndex: Int, newPos: Point2D): Unit

    /** Sets the transform of the specified glyph within this
     *  GlyphVector.
     */
    def setGlyphTransform(glyphIndex: Int, newTX: AffineTransform): Unit
}

object GlyphVector {
    /** A flag used with getLayoutFlags that indicates that this GlyphVector has
     *  a complex glyph-to-char mapping (one that does not map glyphs to chars one-to-one in
     *  strictly ascending or descending order matching the run direction).
     */
    @stub
    val FLAG_COMPLEX_GLYPHS: Int = ???

    /** A flag used with getLayoutFlags that indicates that this GlyphVector has
     *  position adjustments.
     */
    @stub
    val FLAG_HAS_POSITION_ADJUSTMENTS: Int = ???

    /** A flag used with getLayoutFlags that indicates that this GlyphVector has
     *  per-glyph transforms.
     */
    @stub
    val FLAG_HAS_TRANSFORMS: Int = ???

    /** A mask for supported flags from getLayoutFlags. */
    @stub
    val FLAG_MASK: Int = ???

    /** A flag used with getLayoutFlags that indicates that this GlyphVector has
     *  a right-to-left run direction.
     */
    @stub
    val FLAG_RUN_RTL: Int = ???
}
