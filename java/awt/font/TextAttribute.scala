package java.awt.font

import java.lang.{Boolean, Float, Integer, Object, String}
import java.text.AttributedCharacterIterator.Attribute
import scala.scalanative.annotation.stub

/** The TextAttribute class defines attribute keys and
 *  attribute values used for text rendering.
 *  
 *  TextAttribute instances are used as attribute keys to
 *  identify attributes in
 *  Font,
 *  TextLayout,
 *  AttributedCharacterIterator,
 *  and other classes handling text attributes. Other constants defined
 *  in this class can be used as attribute values.
 *  
 *  For each text attribute, the documentation provides:
 *  
 *    the type of its value,
 *    the relevant predefined constants, if any
 *    the default effect if the attribute is absent
 *    the valid values if there are limitations
 *    a description of the effect.
 *  
 *  
 *  Values
 *  
 *    The values of attributes must always be immutable.
 *    Where value limitations are given, any value outside of that
 *    set is reserved for future use; the value will be treated as
 *    the default.
 *    The value null is treated the same as the
 *    default value and results in the default behavior.
 *    If the value is not of the proper type, the attribute
 *    will be ignored.
 *    The identity of the value does not matter, only the actual
 *    value.  For example, TextAttribute.WEIGHT_BOLD and
 *    new Float(2.0)
 *    indicate the same WEIGHT.
 *    Attribute values of type Number (used for
 *    WEIGHT, WIDTH, POSTURE,
 *    SIZE, JUSTIFICATION, and
 *    TRACKING) can vary along their natural range and are
 *    not restricted to the predefined constants.
 *    Number.floatValue() is used to get the actual value
 *    from the Number.
 *    The values for WEIGHT, WIDTH, and
 *    POSTURE are interpolated by the system, which
 *    can select the 'nearest available' font or use other techniques to
 *    approximate the user's request.
 * 
 *  
 * 
 *  Summary of attributes
 *  
 *  
 *  
 *  Key
 *  Value Type
 *  Principal Constants
 *  Default Value
 *  
 *  
 *  FAMILY
 *  String
 *  See Font DIALOG,
 *  DIALOG_INPUT, SERIF,
 *  SANS_SERIF, and MONOSPACED.
 *  
 *  "Default" (use platform default)
 *  
 *  
 *  WEIGHT
 *  Number
 *  WEIGHT_REGULAR, WEIGHT_BOLD
 *  WEIGHT_REGULAR
 *  
 *  
 *  WIDTH
 *  Number
 *  WIDTH_CONDENSED, WIDTH_REGULAR,WIDTH_EXTENDED
 *  WIDTH_REGULAR
 *  
 *  
 *  POSTURE
 *  Number
 *  POSTURE_REGULAR, POSTURE_OBLIQUE
 *  POSTURE_REGULAR
 *  
 *  
 *  SIZE
 *  Number
 *  none
 *  12.0
 *  
 *  
 *  TRANSFORM
 *  TransformAttribute
 *  See TransformAttribute IDENTITY
 *  TransformAttribute.IDENTITY
 *  
 *  
 *  SUPERSCRIPT
 *  Integer
 *  SUPERSCRIPT_SUPER, SUPERSCRIPT_SUB
 *  0 (use the standard glyphs and metrics)
 *  
 *  
 *  FONT
 *  Font
 *  none
 *  null (do not override font resolution)
 *  
 *  
 *  CHAR_REPLACEMENT
 *  GraphicAttribute
 *  none
 *  null (draw text using font glyphs)
 *  
 *  
 *  FOREGROUND
 *  Paint
 *  none
 *  null (use current graphics paint)
 *  
 *  
 *  BACKGROUND
 *  Paint
 *  none
 *  null (do not render background)
 *  
 *  
 *  UNDERLINE
 *  Integer
 *  UNDERLINE_ON
 *  -1 (do not render underline)
 *  
 *  
 *  STRIKETHROUGH
 *  Boolean
 *  STRIKETHROUGH_ON
 *  false (do not render strikethrough)
 *  
 *  
 *  RUN_DIRECTION
 *  Boolean
 *  RUN_DIRECTION_LTRRUN_DIRECTION_RTL
 *  null (use Bidi standard default)
 *  
 *  
 *  BIDI_EMBEDDING
 *  Integer
 *  none
 *  0 (use base line direction)
 *  
 *  
 *  JUSTIFICATION
 *  Number
 *  JUSTIFICATION_FULL
 *  JUSTIFICATION_FULL
 *  
 *  
 *  INPUT_METHOD_HIGHLIGHT
 *  InputMethodHighlight,Annotation
 *  (see class)
 *  null (do not apply input highlighting)
 *  
 *  
 *  INPUT_METHOD_UNDERLINE
 *  Integer
 *  UNDERLINE_LOW_ONE_PIXEL,UNDERLINE_LOW_TWO_PIXEL
 *  -1 (do not render underline)
 *  
 *  
 *  SWAP_COLORS
 *  Boolean
 *  SWAP_COLORS_ON
 *  false (do not swap colors)
 *  
 *  
 *  NUMERIC_SHAPING
 *  NumericShaper
 *  none
 *  null (do not shape digits)
 *  
 *  
 *  KERNING
 *  Integer
 *  KERNING_ON
 *  0 (do not request kerning)
 *  
 *  
 *  LIGATURES
 *  Integer
 *  LIGATURES_ON
 *  0 (do not form optional ligatures)
 *  
 *  
 *  TRACKING
 *  Number
 *  TRACKING_LOOSE, TRACKING_TIGHT
 *  0 (do not add tracking)
 *  
 *  
 */
final class TextAttribute extends AttributedCharacterIterator.Attribute {

    /** Constructs a TextAttribute with the specified name. */
    @stub
    protected def this(name: String) = ???

    /** Resolves instances being deserialized to the predefined constants. */
    @stub
    protected def readResolve(): Object = ???
}

object TextAttribute {
    /** Attribute key for the paint used to render the background of
     *  the text.
     */
    @stub
    val BACKGROUND: TextAttribute = ???

    /** Attribute key for the embedding level of the text. */
    @stub
    val BIDI_EMBEDDING: TextAttribute = ???

    /** Attribute key for a user-defined glyph to display in lieu
     *  of the font's standard glyph for a character.
     */
    @stub
    val CHAR_REPLACEMENT: TextAttribute = ???

    /** Attribute key for the font name. */
    @stub
    val FAMILY: TextAttribute = ???

    /** Attribute key used to provide the font to use to render text. */
    @stub
    val FONT: TextAttribute = ???

    /** Attribute key for the paint used to render the text. */
    @stub
    val FOREGROUND: TextAttribute = ???

    /** Attribute key for input method highlight styles. */
    @stub
    val INPUT_METHOD_HIGHLIGHT: TextAttribute = ???

    /** Attribute key for input method underlines. */
    @stub
    val INPUT_METHOD_UNDERLINE: TextAttribute = ???

    /** Attribute key for the justification of a paragraph. */
    @stub
    val JUSTIFICATION: TextAttribute = ???

    /** Justify the line to the full requested width. */
    @stub
    val JUSTIFICATION_FULL: Float = ???

    /** Do not allow the line to be justified. */
    @stub
    val JUSTIFICATION_NONE: Float = ???

    /** Attribute key to request kerning. */
    @stub
    val KERNING: TextAttribute = ???

    /** Request standard kerning. */
    @stub
    val KERNING_ON: Integer = ???

    /** Attribute key for enabling optional ligatures. */
    @stub
    val LIGATURES: TextAttribute = ???

    /** Request standard optional ligatures. */
    @stub
    val LIGATURES_ON: Integer = ???

    /** Attribute key for converting ASCII decimal digits to other
     *  decimal ranges.
     */
    @stub
    val NUMERIC_SHAPING: TextAttribute = ???

    /** Attribute key for the posture of a font. */
    @stub
    val POSTURE: TextAttribute = ???

    /** The standard italic posture. */
    @stub
    val POSTURE_OBLIQUE: Float = ???

    /** The standard posture, upright. */
    @stub
    val POSTURE_REGULAR: Float = ???

    /** Attribute key for the run direction of the line. */
    @stub
    val RUN_DIRECTION: TextAttribute = ???

    /** Left-to-right run direction. */
    @stub
    val RUN_DIRECTION_LTR: Boolean = ???

    /** Right-to-left run direction. */
    @stub
    val RUN_DIRECTION_RTL: Boolean = ???

    /** Attribute key for the font size. */
    @stub
    val SIZE: TextAttribute = ???

    /** Attribute key for strikethrough. */
    @stub
    val STRIKETHROUGH: TextAttribute = ???

    /** A single strikethrough. */
    @stub
    val STRIKETHROUGH_ON: Boolean = ???

    /** Attribute key for superscripting and subscripting. */
    @stub
    val SUPERSCRIPT: TextAttribute = ???

    /** Standard subscript. */
    @stub
    val SUPERSCRIPT_SUB: Integer = ???

    /** Standard superscript. */
    @stub
    val SUPERSCRIPT_SUPER: Integer = ???

    /** Attribute key for swapping foreground and background
     *  Paints.
     */
    @stub
    val SWAP_COLORS: TextAttribute = ???

    /** Swap foreground and background. */
    @stub
    val SWAP_COLORS_ON: Boolean = ???

    /** Attribute key to control tracking. */
    @stub
    val TRACKING: TextAttribute = ???

    /** Perform loose tracking. */
    @stub
    val TRACKING_LOOSE: Float = ???

    /** Perform tight tracking. */
    @stub
    val TRACKING_TIGHT: Float = ???

    /** Attribute key for the transform of a font. */
    @stub
    val TRANSFORM: TextAttribute = ???

    /** Attribute key for underline. */
    @stub
    val UNDERLINE: TextAttribute = ???

    /** Single pixel dashed low underline. */
    @stub
    val UNDERLINE_LOW_DASHED: Integer = ???

    /** Single pixel dotted low underline. */
    @stub
    val UNDERLINE_LOW_DOTTED: Integer = ???

    /** Double pixel gray low underline. */
    @stub
    val UNDERLINE_LOW_GRAY: Integer = ???

    /** Single pixel solid low underline. */
    @stub
    val UNDERLINE_LOW_ONE_PIXEL: Integer = ???

    /** Double pixel solid low underline. */
    @stub
    val UNDERLINE_LOW_TWO_PIXEL: Integer = ???

    /** Standard underline. */
    @stub
    val UNDERLINE_ON: Integer = ???

    /** Attribute key for the weight of a font. */
    @stub
    val WEIGHT: TextAttribute = ???

    /** The standard bold weight. */
    @stub
    val WEIGHT_BOLD: Float = ???

    /** A moderately lighter weight than WEIGHT_BOLD. */
    @stub
    val WEIGHT_DEMIBOLD: Float = ???

    /** An intermediate weight between WEIGHT_LIGHT and
     *  WEIGHT_STANDARD.
     */
    @stub
    val WEIGHT_DEMILIGHT: Float = ???

    /** The lightest predefined weight. */
    @stub
    val WEIGHT_EXTRA_LIGHT: Float = ???

    /** An extra heavy weight. */
    @stub
    val WEIGHT_EXTRABOLD: Float = ???

    /** A moderately heavier weight than WEIGHT_BOLD. */
    @stub
    val WEIGHT_HEAVY: Float = ???

    /** The standard light weight. */
    @stub
    val WEIGHT_LIGHT: Float = ???

    /** An intermediate weight between WEIGHT_REGULAR and
     *  WEIGHT_BOLD.
     */
    @stub
    val WEIGHT_MEDIUM: Float = ???

    /** The standard weight. */
    @stub
    val WEIGHT_REGULAR: Float = ???

    /** A moderately heavier weight than WEIGHT_REGULAR. */
    @stub
    val WEIGHT_SEMIBOLD: Float = ???

    /** The heaviest predefined weight. */
    @stub
    val WEIGHT_ULTRABOLD: Float = ???

    /** Attribute key for the width of a font. */
    @stub
    val WIDTH: TextAttribute = ???

    /** The most condensed predefined width. */
    @stub
    val WIDTH_CONDENSED: Float = ???

    /** The most extended predefined width. */
    @stub
    val WIDTH_EXTENDED: Float = ???

    /** The standard width. */
    @stub
    val WIDTH_REGULAR: Float = ???

    /** A moderately condensed width. */
    @stub
    val WIDTH_SEMI_CONDENSED: Float = ???

    /** A moderately extended width. */
    @stub
    val WIDTH_SEMI_EXTENDED: Float = ???
}
