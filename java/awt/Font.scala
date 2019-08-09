package java.awt

import java.awt.font.{FontRenderContext, GlyphVector, LineMetrics, TextAttribute}
import java.awt.geom.{AffineTransform, Rectangle2D}
import java.io.{File, InputStream, Serializable}
import java.lang.{Object, String}
import java.text.{AttributedCharacterIterator.Attribute, CharacterIterator}
import java.util.{Locale, Map}

// The Font class represents fonts, which are used to
// render text in a visible way.
// A font provides the information needed to map sequences of
// characters to sequences of glyphs
// and to render sequences of glyphs on Graphics and
// Component objects.
//
// Characters and Glyphs
//
// A character is a symbol that represents an item such as a letter,
// a digit, or punctuation in an abstract way. For example, 'g',
// LATIN SMALL LETTER G, is a character.
// 
// A glyph is a shape used to render a character or a sequence of
// characters. In simple writing systems, such as Latin, typically one glyph
// represents one character. In general, however, characters and glyphs do not
// have one-to-one correspondence. For example, the character 'á'
// LATIN SMALL LETTER A WITH ACUTE, can be represented by
// two glyphs: one for 'a' and one for '´'. On the other hand, the
// two-character string "fi" can be represented by a single glyph, an
// "fi" ligature. In complex writing systems, such as Arabic or the South
// and South-East Asian writing systems, the relationship between characters
// and glyphs can be more complicated and involve context-dependent selection
// of glyphs as well as glyph reordering.
//
// A font encapsulates the collection of glyphs needed to render a selected set
// of characters as well as the tables needed to map sequences of characters to
// corresponding sequences of glyphs.
//
// Physical and Logical Fonts
//
// The Java Platform distinguishes between two kinds of fonts:
// physical fonts and logical fonts.
// 
// Physical fonts are the actual font libraries containing glyph data
// and tables to map from character sequences to glyph sequences, using a font
// technology such as TrueType or PostScript Type 1.
// All implementations of the Java Platform must support TrueType fonts;
// support for other font technologies is implementation dependent.
// Physical fonts may use names such as Helvetica, Palatino, HonMincho, or
// any number of other font names.
// Typically, each physical font supports only a limited set of writing
// systems, for example, only Latin characters or only Japanese and Basic
// Latin.
// The set of available physical fonts varies between configurations.
// Applications that require specific fonts can bundle them and instantiate
// them using the createFont method.
// 
// Logical fonts are the five font families defined by the Java
// platform which must be supported by any Java runtime environment:
// Serif, SansSerif, Monospaced, Dialog, and DialogInput.
// These logical fonts are not actual font libraries. Instead, the logical
// font names are mapped to physical fonts by the Java runtime environment.
// The mapping is implementation and usually locale dependent, so the look
// and the metrics provided by them vary.
// Typically, each logical font name maps to several physical fonts in order to
// cover a large range of characters.
// 
// Peered AWT components, such as Label and
// TextField, can only use logical fonts.
// 
// For a discussion of the relative advantages and disadvantages of using
// physical or logical fonts, see the
// Internationalization FAQ
// document.
//
// Font Faces and Names
//
// A Font
// can have many faces, such as heavy, medium, oblique, gothic and
// regular. All of these faces have similar typographic design.
// 
// There are three different names that you can get from a
// Font object.  The logical font name is simply the
// name that was used to construct the font.
// The font face name, or just font name for
// short, is the name of a particular font face, like Helvetica Bold. The
// family name is the name of the font family that determines the
// typographic design across several faces, like Helvetica.
// 
// The Font class represents an instance of a font face from
// a collection of  font faces that are present in the system resources
// of the host system.  As examples, Arial Bold and Courier Bold Italic
// are font faces.  There can be several Font objects
// associated with a font face, each differing in size, style, transform
// and font features.
// 
// The getAllFonts method
// of the GraphicsEnvironment class returns an
// array of all font faces available in the system. These font faces are
// returned as Font objects with a size of 1, identity
// transform and default font features. These
// base fonts can then be used to derive new Font objects
// with varying sizes, styles, transforms and font features via the
// deriveFont methods in this class.
//
// Font and TextAttribute
//
// Font supports most
// TextAttributes.  This makes some operations, such as
// rendering underlined text, convenient since it is not
// necessary to explicitly construct a TextLayout object.
// Attributes can be set on a Font by constructing or deriving it
// using a Map of TextAttribute values.
//
// The values of some TextAttributes are not
// serializable, and therefore attempting to serialize an instance of
// Font that has such values will not serialize them.
// This means a Font deserialized from such a stream will not compare
// equal to the original Font that contained the non-serializable
// attributes.  This should very rarely pose a problem
// since these attributes are typically used only in special
// circumstances and are unlikely to be serialized.
//
// 
// FOREGROUND and BACKGROUND use
// Paint values. The subclass Color is
// serializable, while GradientPaint and
// TexturePaint are not.
// CHAR_REPLACEMENT uses
// GraphicAttribute values.  The subclasses
// ShapeGraphicAttribute and
// ImageGraphicAttribute are not serializable.
// INPUT_METHOD_HIGHLIGHT uses
// InputMethodHighlight values, which are
// not serializable.  See InputMethodHighlight.
// 
//
// Clients who create custom subclasses of Paint and
// GraphicAttribute can make them serializable and
// avoid this problem.  Clients who use input method highlights can
// convert these to the platform-specific attributes for that
// highlight on the current platform and set them on the Font as
// a workaround.
//
// The Map-based constructor and
// deriveFont APIs ignore the FONT attribute, and it is
// not retained by the Font; the static getFont(java.util.Map<? extends java.text.AttributedCharacterIterator.Attribute, ?>) method should
// be used if the FONT attribute might be present.  See TextAttribute.FONT for more information.
//
// Several attributes will cause additional rendering overhead
// and potentially invoke layout.  If a Font has such
// attributes, the hasLayoutAttributes() method
// will return true.
//
// Note: Font rotations can cause text baselines to be rotated.  In
// order to account for this (rare) possibility, font APIs are
// specified to return metrics and take parameters 'in
// baseline-relative coordinates'.  This maps the 'x' coordinate to
// the advance along the baseline, (positive x is forward along the
// baseline), and the 'y' coordinate to a distance along the
// perpendicular to the baseline at 'x' (positive y is 90 degrees
// clockwise from the baseline vector).  APIs for which this is
// especially important are called out as having 'baseline-relative
// coordinates.'
class Font extends Object with Serializable {

    @stub
    // Creates a new Font from the specified font.
    protected def this(font: Font) = ???

    @stub
    // Creates a new Font with the specified attributes.
    def this(attributes: Map[_ <: AttributedCharacterIterator.Attribute, _]) = ???

    @stub
    // The logical name of this Font, as passed to the
    // constructor.
    protected def name: String = ???

    @stub
    // The point size of this Font in float.
    protected def pointSize: float = ???

    @stub
    // The point size of this Font, rounded to integer.
    protected def size: Int = ???

    @stub
    // The style of this Font, as passed to the constructor.
    protected def style: Int = ???

    @stub
    // Checks if this Font has a glyph for the specified
    // character.
    def canDisplay(c: Char): Boolean = ???

    @stub
    // Checks if this Font has a glyph for the specified
    // character.
    def canDisplay(codePoint: Int): Boolean = ???

    @stub
    // Indicates whether or not this Font can display
    // the characters in the specified text
    // starting at start and ending at
    // limit.
    def canDisplayUpTo(text: Array[Char], start: Int, limit: Int): Int = ???

    @stub
    // Indicates whether or not this Font can display the
    // text specified by the iter starting at
    // start and ending at limit.
    def canDisplayUpTo(iter: CharacterIterator, start: Int, limit: Int): Int = ???

    @stub
    // Indicates whether or not this Font can display a
    // specified String.
    def canDisplayUpTo(str: String): Int = ???

    @stub
    // Creates a GlyphVector by
    // mapping characters to glyphs one-to-one based on the
    // Unicode cmap in this Font.
    def createGlyphVector(frc: FontRenderContext, chars: Array[Char]): GlyphVector = ???

    @stub
    // Creates a GlyphVector by
    // mapping the specified characters to glyphs one-to-one based on the
    // Unicode cmap in this Font.
    def createGlyphVector(frc: FontRenderContext, ci: CharacterIterator): GlyphVector = ???

    @stub
    // Creates a GlyphVector by
    // mapping characters to glyphs one-to-one based on the
    // Unicode cmap in this Font.
    def createGlyphVector(frc: FontRenderContext, glyphCodes: Array[Int]): GlyphVector = ???

    @stub
    // Creates a GlyphVector by
    // mapping characters to glyphs one-to-one based on the
    // Unicode cmap in this Font.
    def createGlyphVector(frc: FontRenderContext, str: String): GlyphVector = ???

    @stub
    // Creates a new Font object by replicating the current
    // Font object and applying a new transform to it.
    def deriveFont(trans: AffineTransform): Font = ???

    @stub
    // Creates a new Font object by replicating the current
    // Font object and applying a new size to it.
    def deriveFont(size: float): Font = ???

    @stub
    // Creates a new Font object by replicating the current
    // Font object and applying a new style to it.
    def deriveFont(style: Int): Font = ???

    @stub
    // Creates a new Font object by replicating this
    // Font object and applying a new style and transform.
    def deriveFont(style: Int, trans: AffineTransform): Font = ???

    @stub
    // Creates a new Font object by replicating this
    // Font object and applying a new style and size.
    def deriveFont(style: Int, size: float): Font = ???

    @stub
    // Creates a new Font object by replicating the current
    // Font object and applying a new set of font attributes
    // to it.
    def deriveFont(attributes: Map[_ <: AttributedCharacterIterator.Attribute, _]): Font = ???

    @stub
    // Compares this Font object to the specified
    // Object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns a map of font attributes available in this
    // Font.
    def getAttributes(): Map[TextAttribute, _] = ???

    @stub
    // Returns the keys of all the attributes supported by this
    // Font.
    def getAvailableAttributes(): Array[AttributedCharacterIterator.Attribute] = ???

    @stub
    // Returns the baseline appropriate for displaying this character.
    def getBaselineFor(c: Char): Byte = ???

    @stub
    // Returns the family name of this Font.
    def getFamily(): String = ???

    @stub
    // Returns the family name of this Font, localized for
    // the specified locale.
    def getFamily(l: Locale): String = ???

    @stub
    // Returns the font face name of this Font.
    def getFontName(): String = ???

    @stub
    // Returns the font face name of the Font, localized
    // for the specified locale.
    def getFontName(l: Locale): String = ???

    @stub
    // Returns the italic angle of this Font.
    def getItalicAngle(): float = ???

    @stub
    // Returns a LineMetrics object created with the
    // specified arguments.
    def getLineMetrics(chars: Array[Char], beginIndex: Int, limit: Int, frc: FontRenderContext): LineMetrics = ???

    @stub
    // Returns a LineMetrics object created with the
    // specified arguments.
    def getLineMetrics(ci: CharacterIterator, beginIndex: Int, limit: Int, frc: FontRenderContext): LineMetrics = ???

    @stub
    // Returns a LineMetrics object created with the specified
    // String and FontRenderContext.
    def getLineMetrics(str: String, frc: FontRenderContext): LineMetrics = ???

    @stub
    // Returns a LineMetrics object created with the
    // specified arguments.
    def getLineMetrics(str: String, beginIndex: Int, limit: Int, frc: FontRenderContext): LineMetrics = ???

    @stub
    // Returns the bounds for the character with the maximum
    // bounds as defined in the specified FontRenderContext.
    def getMaxCharBounds(frc: FontRenderContext): Rectangle2D = ???

    @stub
    // Returns the glyphCode which is used when this Font
    // does not have a glyph for a specified unicode code point.
    def getMissingGlyphCode(): Int = ???

    @stub
    // Returns the logical name of this Font.
    def getName(): String = ???

    @stub
    // Returns the number of glyphs in this Font.
    def getNumGlyphs(): Int = ???

    @stub
    // Deprecated. 
    //Font rendering is now platform independent.
    //
    def getPeer(): java.awt.peer.FontPeer = ???

    @stub
    // Returns the postscript name of this Font.
    def getPSName(): String = ???

    @stub
    // Returns the point size of this Font, rounded to
    // an integer.
    def getSize(): Int = ???

    @stub
    // Returns the point size of this Font in
    // float value.
    def getSize2D(): float = ???

    @stub
    // Returns the logical bounds of the specified array of characters
    // in the specified FontRenderContext.
    def getStringBounds(chars: Array[Char], beginIndex: Int, limit: Int, frc: FontRenderContext): Rectangle2D = ???

    @stub
    // Returns the logical bounds of the characters indexed in the
    // specified CharacterIterator in the
    // specified FontRenderContext.
    def getStringBounds(ci: CharacterIterator, beginIndex: Int, limit: Int, frc: FontRenderContext): Rectangle2D = ???

    @stub
    // Returns the logical bounds of the specified String in
    // the specified FontRenderContext.
    def getStringBounds(str: String, frc: FontRenderContext): Rectangle2D = ???

    @stub
    // Returns the logical bounds of the specified String in
    // the specified FontRenderContext.
    def getStringBounds(str: String, beginIndex: Int, limit: Int, frc: FontRenderContext): Rectangle2D = ???

    @stub
    // Returns the style of this Font.
    def getStyle(): Int = ???

    @stub
    // Returns a copy of the transform associated with this
    // Font.
    def getTransform(): AffineTransform = ???

    @stub
    // Returns a hashcode for this Font.
    def hashCode(): Int = ???

    @stub
    // Return true if this Font contains attributes that require extra
    // layout processing.
    def hasLayoutAttributes(): Boolean = ???

    @stub
    // Checks whether or not this Font has uniform
    // line metrics.
    def hasUniformLineMetrics(): Boolean = ???

    @stub
    // Indicates whether or not this Font object's style is
    // BOLD.
    def isBold(): Boolean = ???

    @stub
    // Indicates whether or not this Font object's style is
    // ITALIC.
    def isItalic(): Boolean = ???

    @stub
    // Indicates whether or not this Font object's style is
    // PLAIN.
    def isPlain(): Boolean = ???

    @stub
    // Indicates whether or not this Font object has a
    // transform that affects its size in addition to the Size
    // attribute.
    def isTransformed(): Boolean = ???

    @stub
    // Returns a new GlyphVector object, performing full
    // layout of the text if possible.
    def layoutGlyphVector(frc: FontRenderContext, text: Array[Char], start: Int, limit: Int, flags: Int): GlyphVector = ???
}

object Font {
    @stub
    // The bold style constant.
    def BOLD: Int = ???

    @stub
    // The baseline used in ideographic scripts like Chinese, Japanese,
    // and Korean when laying out text.
    def CENTER_BASELINE: Int = ???

    @stub
    // A String constant for the canonical family name of the
    // logical font "Dialog".
    def DIALOG: String = ???

    @stub
    // A String constant for the canonical family name of the
    // logical font "DialogInput".
    def DIALOG_INPUT: String = ???

    @stub
    // The baseline used in Devanigiri and similar scripts when laying
    // out text.
    def HANGING_BASELINE: Int = ???

    @stub
    // The italicized style constant.
    def ITALIC: Int = ???

    @stub
    // A flag to layoutGlyphVector indicating that text is left-to-right as
    // determined by Bidi analysis.
    def LAYOUT_LEFT_TO_RIGHT: Int = ???

    @stub
    // A flag to layoutGlyphVector indicating that text in the char array
    // after the indicated limit should not be examined.
    def LAYOUT_NO_LIMIT_CONTEXT: Int = ???

    @stub
    // A flag to layoutGlyphVector indicating that text in the char array
    // before the indicated start should not be examined.
    def LAYOUT_NO_START_CONTEXT: Int = ???

    @stub
    // A flag to layoutGlyphVector indicating that text is right-to-left as
    // determined by Bidi analysis.
    def LAYOUT_RIGHT_TO_LEFT: Int = ???

    @stub
    // A String constant for the canonical family name of the
    // logical font "Monospaced".
    def MONOSPACED: String = ???

    @stub
    // The plain style constant.
    def PLAIN: Int = ???

    @stub
    // The baseline used in most Roman scripts when laying out text.
    def ROMAN_BASELINE: Int = ???

    @stub
    // A String constant for the canonical family name of the
    // logical font "SansSerif".
    def SANS_SERIF: String = ???

    @stub
    // A String constant for the canonical family name of the
    // logical font "Serif".
    def SERIF: String = ???

    @stub
    // Identify a font resource of type TRUETYPE.
    def TRUETYPE_FONT: Int = ???

    @stub
    // Returns a new Font using the specified font type
    // and the specified font file.
    def createFont(fontFormat: Int, fontFile: File): Font = ???

    @stub
    // Returns a new Font using the specified font type
    // and input data.
    def createFont(fontFormat: Int, fontStream: InputStream): Font = ???

    @stub
    // Returns the Font that the str
    // argument describes.
    def decode(str: String): Font = ???

    @stub
    // Returns a Font appropriate to the attributes.
    def getFont(attributes: Map[_ <: AttributedCharacterIterator.Attribute, _]): Font = ???

    @stub
    // Returns a Font object from the system properties list.
    def getFont(nm: String): Font = ???

    @stub
    // Gets the specified Font from the system properties
    // list.
    def getFont(nm: String, font: Font): Font = ???
}
