package java.awt.font

import java.awt.geom.Rectangle2D
import java.lang.Object

// The GlyphMetrics class represents information for a
// single glyph.   A glyph is the visual representation of one or more
// characters.  Many different glyphs can be used to represent a single
// character or combination of characters.  GlyphMetrics
// instances are produced by Font and are applicable
// to a specific glyph in a particular Font.
// 
// Glyphs are either STANDARD, LIGATURE, COMBINING, or COMPONENT.
// 
// STANDARD glyphs are commonly used to represent single characters.
// LIGATURE glyphs are used to represent sequences of characters.
// COMPONENT glyphs in a GlyphVector do not correspond to a
// particular character in a text model. Instead, COMPONENT glyphs are
// added for typographical reasons, such as Arabic justification.
// COMBINING glyphs embellish STANDARD or LIGATURE glyphs, such
// as accent marks.  Carets do not appear before COMBINING glyphs.
// 
// 
// Other metrics available through GlyphMetrics are the
// components of the advance, the visual bounds, and the left and right
// side bearings.
// 
// Glyphs for a rotated font, or obtained from a GlyphVector
// which has applied a rotation to the glyph, can have advances that
// contain both X and Y components.  Usually the advance only has one
// component.
// 
// The advance of a glyph is the distance from the glyph's origin to the
// origin of the next glyph along the baseline, which is either vertical
// or horizontal.  Note that, in a GlyphVector,
// the distance from a glyph to its following glyph might not be the
// glyph's advance, because of kerning or other positioning adjustments.
// 
// The bounds is the smallest rectangle that completely contains the
// outline of the glyph.  The bounds rectangle is relative to the
// glyph's origin.  The left-side bearing is the distance from the glyph
// origin to the left of its bounds rectangle. If the left-side bearing is
// negative, part of the glyph is drawn to the left of its origin.  The
// right-side bearing is the distance from the right side of the bounds
// rectangle to the next glyph origin (the origin plus the advance).  If
// negative, part of the glyph is drawn to the right of the next glyph's
// origin.  Note that the bounds does not necessarily enclose all the pixels
// affected when rendering the glyph, because of rasterization and pixel
// adjustment effects.
// 
// Although instances of GlyphMetrics can be directly
// constructed, they are almost always obtained from a
// GlyphVector.  Once constructed, GlyphMetrics
// objects are immutable.
// 
// Example:
// Querying a Font for glyph information
// 
// Font font = ...;
// int glyphIndex = ...;
// GlyphMetrics metrics = GlyphVector.getGlyphMetrics(glyphIndex);
// int isStandard = metrics.isStandard();
// float glyphAdvance = metrics.getAdvance();
// 
final class GlyphMetrics extends Object {

    @stub
    // Constructs a GlyphMetrics object.
    def this(horizontal: Boolean, advanceX: float, advanceY: float, bounds: Rectangle2D, glyphType: Byte) = ???

    @stub
    // Returns the advance of the glyph along the baseline (either
    // horizontal or vertical).
    def getAdvance(): float = ???

    @stub
    // Returns the x-component of the advance of the glyph.
    def getAdvanceX(): float = ???

    @stub
    // Returns the y-component of the advance of the glyph.
    def getAdvanceY(): float = ???

    @stub
    // Returns the bounds of the glyph.
    def getBounds2D(): Rectangle2D = ???

    @stub
    // Returns the left (top) side bearing of the glyph.
    def getLSB(): float = ???

    @stub
    // Returns the right (bottom) side bearing of the glyph.
    def getRSB(): float = ???

    @stub
    // Returns the raw glyph type code.
    def getType(): Int = ???

    @stub
    // Returns true if this is a combining glyph.
    def isCombining(): Boolean = ???

    @stub
    // Returns true if this is a component glyph.
    def isComponent(): Boolean = ???

    @stub
    // Returns true if this is a ligature glyph.
    def isLigature(): Boolean = ???

    @stub
    // Returns true if this is a standard glyph.
    def isStandard(): Boolean = ???
}

object GlyphMetrics {
    @stub
    // Indicates a glyph that represents a combining character,
    // such as an umlaut.
    def COMBINING: Byte = ???

    @stub
    // Indicates a glyph with no corresponding character in the
    // backing store.
    def COMPONENT: Byte = ???

    @stub
    // Indicates a glyph that represents multiple characters
    // as a ligature, for example 'fi' or 'ffi'.
    def LIGATURE: Byte = ???

    @stub
    // Indicates a glyph that represents a single standard
    // character.
    def STANDARD: Byte = ???
}
