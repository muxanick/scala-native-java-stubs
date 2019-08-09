package java.time.format

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Enumeration of the style of text formatting and parsing.
 *  
 *  Text styles define three sizes for the formatted text - 'full', 'short' and 'narrow'.
 *  Each of these three sizes is available in both 'standard' and 'stand-alone' variations.
 *  
 *  The difference between the three sizes is obvious in most languages.
 *  For example, in English the 'full' month is 'January', the 'short' month is 'Jan'
 *  and the 'narrow' month is 'J'. Note that the narrow size is often not unique.
 *  For example, 'January', 'June' and 'July' all have the 'narrow' text 'J'.
 *  
 *  The difference between the 'standard' and 'stand-alone' forms is trickier to describe
 *  as there is no difference in English. However, in other languages there is a difference
 *  in the word used when the text is used alone, as opposed to in a complete date.
 *  For example, the word used for a month when used alone in a date picker is different
 *  to the word used for month in association with a day and year in a date.
 */
class TextStyle private (name: String, ordinal: Int) extends Enum[TextStyle](name, ordinal) {
}

object TextStyle {
    /** Full text, typically the full description. */
    final val FULL = new TextStyle(FULL, 0)

    /** Full text for stand-alone use, typically the full description. */
    final val FULL_STANDALONE = new TextStyle(FULL_STANDALONE, 1)

    /** Narrow text, typically a single letter. */
    final val NARROW = new TextStyle(NARROW, 2)

    /** Narrow text for stand-alone use, typically a single letter. */
    final val NARROW_STANDALONE = new TextStyle(NARROW_STANDALONE, 3)

    /** Short text, typically an abbreviation. */
    final val SHORT = new TextStyle(SHORT, 4)

    /** Short text for stand-alone use, typically an abbreviation. */
    final val SHORT_STANDALONE = new TextStyle(SHORT_STANDALONE, 5)

    /** Returns the normal style with the same size. */
    @stub
    def asNormal(): TextStyle = ???

    /** Returns the stand-alone style with the same size. */
    @stub
    def asStandalone(): TextStyle = ???

    /** Returns true if the Style is a stand-alone style. */
    @stub
    def isStandalone(): Boolean = ???

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): TextStyle = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[TextStyle] = ???
}
