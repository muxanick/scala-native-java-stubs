package java.awt.font

import java.lang.{Boolean, Float, Integer, Object}
import java.text.AttributedCharacterIterator.Attribute

// The TextAttribute class defines attribute keys and
// attribute values used for text rendering.
// 
// TextAttribute instances are used as attribute keys to
// identify attributes in
// Font,
// TextLayout,
// AttributedCharacterIterator,
// and other classes handling text attributes. Other constants defined
// in this class can be used as attribute values.
// 
// For each text attribute, the documentation provides:
// 
//   the type of its value,
//   the relevant predefined constants, if any
//   the default effect if the attribute is absent
//   the valid values if there are limitations
//   a description of the effect.
// 
// 
// Values
// 
//   The values of attributes must always be immutable.
//   Where value limitations are given, any value outside of that
//   set is reserved for future use; the value will be treated as
//   the default.
//   The value null is treated the same as the
//   default value and results in the default behavior.
//   If the value is not of the proper type, the attribute
//   will be ignored.
//   The identity of the value does not matter, only the actual
//   value.  For example, TextAttribute.WEIGHT_BOLD and
//   new Float(2.0)
//   indicate the same WEIGHT.
//   Attribute values of type Number (used for
//   WEIGHT, WIDTH, POSTURE,
//   SIZE, JUSTIFICATION, and
//   TRACKING) can vary along their natural range and are
//   not restricted to the predefined constants.
//   Number.floatValue() is used to get the actual value
//   from the Number.
//   The values for WEIGHT, WIDTH, and
//   POSTURE are interpolated by the system, which
//   can select the 'nearest available' font or use other techniques to
//   approximate the user's request.
//
// 
//
// Summary of attributes
// 
// 
// 
// Key
// Value Type
// Principal Constants
// Default Value
// 
// 
// FAMILY
// String
// See Font DIALOG,
// DIALOG_INPUT, SERIF,
// SANS_SERIF, and MONOSPACED.
// 
// "Default" (use platform default)
// 
// 
// WEIGHT
// Number
// WEIGHT_REGULAR, WEIGHT_BOLD
// WEIGHT_REGULAR
// 
// 
// WIDTH
// Number
// WIDTH_CONDENSED, WIDTH_REGULAR,WIDTH_EXTENDED
// WIDTH_REGULAR
// 
// 
// POSTURE
// Number
// POSTURE_REGULAR, POSTURE_OBLIQUE
// POSTURE_REGULAR
// 
// 
// SIZE
// Number
// none
// 12.0
// 
// 
// TRANSFORM
// TransformAttribute
// See TransformAttribute IDENTITY
// TransformAttribute.IDENTITY
// 
// 
// SUPERSCRIPT
// Integer
// SUPERSCRIPT_SUPER, SUPERSCRIPT_SUB
// 0 (use the standard glyphs and metrics)
// 
// 
// FONT
// Font
// none
// null (do not override font resolution)
// 
// 
// CHAR_REPLACEMENT
// GraphicAttribute
// none
// null (draw text using font glyphs)
// 
// 
// FOREGROUND
// Paint
// none
// null (use current graphics paint)
// 
// 
// BACKGROUND
// Paint
// none
// null (do not render background)
// 
// 
// UNDERLINE
// Integer
// UNDERLINE_ON
// -1 (do not render underline)
// 
// 
// STRIKETHROUGH
// Boolean
// STRIKETHROUGH_ON
// false (do not render strikethrough)
// 
// 
// RUN_DIRECTION
// Boolean
// RUN_DIRECTION_LTRRUN_DIRECTION_RTL
// null (use Bidi standard default)
// 
// 
// BIDI_EMBEDDING
// Integer
// none
// 0 (use base line direction)
// 
// 
// JUSTIFICATION
// Number
// JUSTIFICATION_FULL
// JUSTIFICATION_FULL
// 
// 
// INPUT_METHOD_HIGHLIGHT
// InputMethodHighlight,Annotation
// (see class)
// null (do not apply input highlighting)
// 
// 
// INPUT_METHOD_UNDERLINE
// Integer
// UNDERLINE_LOW_ONE_PIXEL,UNDERLINE_LOW_TWO_PIXEL
// -1 (do not render underline)
// 
// 
// SWAP_COLORS
// Boolean
// SWAP_COLORS_ON
// false (do not swap colors)
// 
// 
// NUMERIC_SHAPING
// NumericShaper
// none
// null (do not shape digits)
// 
// 
// KERNING
// Integer
// KERNING_ON
// 0 (do not request kerning)
// 
// 
// LIGATURES
// Integer
// LIGATURES_ON
// 0 (do not form optional ligatures)
// 
// 
// TRACKING
// Number
// TRACKING_LOOSE, TRACKING_TIGHT
// 0 (do not add tracking)
// 
// 
final class TextAttribute extends AttributedCharacterIterator.Attribute {
}

object TextAttribute {
    @stub
    // Attribute key for the paint used to render the background of
    // the text.
    def BACKGROUND: TextAttribute = ???

    @stub
    // Attribute key for the embedding level of the text.
    def BIDI_EMBEDDING: TextAttribute = ???

    @stub
    // Attribute key for a user-defined glyph to display in lieu
    // of the font's standard glyph for a character.
    def CHAR_REPLACEMENT: TextAttribute = ???

    @stub
    // Attribute key for the font name.
    def FAMILY: TextAttribute = ???

    @stub
    // Attribute key used to provide the font to use to render text.
    def FONT: TextAttribute = ???

    @stub
    // Attribute key for the paint used to render the text.
    def FOREGROUND: TextAttribute = ???

    @stub
    // Attribute key for input method highlight styles.
    def INPUT_METHOD_HIGHLIGHT: TextAttribute = ???

    @stub
    // Attribute key for input method underlines.
    def INPUT_METHOD_UNDERLINE: TextAttribute = ???

    @stub
    // Attribute key for the justification of a paragraph.
    def JUSTIFICATION: TextAttribute = ???

    @stub
    // Justify the line to the full requested width.
    def JUSTIFICATION_FULL: Float = ???

    @stub
    // Do not allow the line to be justified.
    def JUSTIFICATION_NONE: Float = ???

    @stub
    // Attribute key to request kerning.
    def KERNING: TextAttribute = ???

    @stub
    // Request standard kerning.
    def KERNING_ON: Integer = ???

    @stub
    // Attribute key for enabling optional ligatures.
    def LIGATURES: TextAttribute = ???

    @stub
    // Request standard optional ligatures.
    def LIGATURES_ON: Integer = ???

    @stub
    // Attribute key for converting ASCII decimal digits to other
    // decimal ranges.
    def NUMERIC_SHAPING: TextAttribute = ???

    @stub
    // Attribute key for the posture of a font.
    def POSTURE: TextAttribute = ???

    @stub
    // The standard italic posture.
    def POSTURE_OBLIQUE: Float = ???

    @stub
    // The standard posture, upright.
    def POSTURE_REGULAR: Float = ???

    @stub
    // Attribute key for the run direction of the line.
    def RUN_DIRECTION: TextAttribute = ???

    @stub
    // Left-to-right run direction.
    def RUN_DIRECTION_LTR: Boolean = ???

    @stub
    // Right-to-left run direction.
    def RUN_DIRECTION_RTL: Boolean = ???

    @stub
    // Attribute key for the font size.
    def SIZE: TextAttribute = ???

    @stub
    // Attribute key for strikethrough.
    def STRIKETHROUGH: TextAttribute = ???

    @stub
    // A single strikethrough.
    def STRIKETHROUGH_ON: Boolean = ???

    @stub
    // Attribute key for superscripting and subscripting.
    def SUPERSCRIPT: TextAttribute = ???

    @stub
    // Standard subscript.
    def SUPERSCRIPT_SUB: Integer = ???

    @stub
    // Standard superscript.
    def SUPERSCRIPT_SUPER: Integer = ???

    @stub
    // Attribute key for swapping foreground and background
    // Paints.
    def SWAP_COLORS: TextAttribute = ???

    @stub
    // Swap foreground and background.
    def SWAP_COLORS_ON: Boolean = ???

    @stub
    // Attribute key to control tracking.
    def TRACKING: TextAttribute = ???

    @stub
    // Perform loose tracking.
    def TRACKING_LOOSE: Float = ???

    @stub
    // Perform tight tracking.
    def TRACKING_TIGHT: Float = ???

    @stub
    // Attribute key for the transform of a font.
    def TRANSFORM: TextAttribute = ???

    @stub
    // Attribute key for underline.
    def UNDERLINE: TextAttribute = ???

    @stub
    // Single pixel dashed low underline.
    def UNDERLINE_LOW_DASHED: Integer = ???

    @stub
    // Single pixel dotted low underline.
    def UNDERLINE_LOW_DOTTED: Integer = ???

    @stub
    // Double pixel gray low underline.
    def UNDERLINE_LOW_GRAY: Integer = ???

    @stub
    // Single pixel solid low underline.
    def UNDERLINE_LOW_ONE_PIXEL: Integer = ???

    @stub
    // Double pixel solid low underline.
    def UNDERLINE_LOW_TWO_PIXEL: Integer = ???

    @stub
    // Standard underline.
    def UNDERLINE_ON: Integer = ???

    @stub
    // Attribute key for the weight of a font.
    def WEIGHT: TextAttribute = ???

    @stub
    // The standard bold weight.
    def WEIGHT_BOLD: Float = ???

    @stub
    // A moderately lighter weight than WEIGHT_BOLD.
    def WEIGHT_DEMIBOLD: Float = ???

    @stub
    // An intermediate weight between WEIGHT_LIGHT and
    // WEIGHT_STANDARD.
    def WEIGHT_DEMILIGHT: Float = ???

    @stub
    // The lightest predefined weight.
    def WEIGHT_EXTRA_LIGHT: Float = ???

    @stub
    // An extra heavy weight.
    def WEIGHT_EXTRABOLD: Float = ???

    @stub
    // A moderately heavier weight than WEIGHT_BOLD.
    def WEIGHT_HEAVY: Float = ???

    @stub
    // The standard light weight.
    def WEIGHT_LIGHT: Float = ???

    @stub
    // An intermediate weight between WEIGHT_REGULAR and
    // WEIGHT_BOLD.
    def WEIGHT_MEDIUM: Float = ???

    @stub
    // The standard weight.
    def WEIGHT_REGULAR: Float = ???

    @stub
    // A moderately heavier weight than WEIGHT_REGULAR.
    def WEIGHT_SEMIBOLD: Float = ???

    @stub
    // The heaviest predefined weight.
    def WEIGHT_ULTRABOLD: Float = ???

    @stub
    // Attribute key for the width of a font.
    def WIDTH: TextAttribute = ???

    @stub
    // The most condensed predefined width.
    def WIDTH_CONDENSED: Float = ???

    @stub
    // The most extended predefined width.
    def WIDTH_EXTENDED: Float = ???

    @stub
    // The standard width.
    def WIDTH_REGULAR: Float = ???

    @stub
    // A moderately condensed width.
    def WIDTH_SEMI_CONDENSED: Float = ???
}
