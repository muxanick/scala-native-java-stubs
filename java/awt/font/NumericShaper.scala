package java.awt.font

import java.io.Serializable
import java.lang.{Enum, Object, String}
import java.util.Set
import scala.scalanative.annotation.stub

/** The NumericShaper class is used to convert Latin-1 (European)
 *  digits to other Unicode decimal digits.  Users of this class will
 *  primarily be people who wish to present data using
 *  national digit shapes, but find it more convenient to represent the
 *  data internally using Latin-1 (European) digits.  This does not
 *  interpret the deprecated numeric shape selector character (U+206E).
 *  
 *  Instances of NumericShaper are typically applied
 *  as attributes to text with the
 *  NUMERIC_SHAPING attribute
 *  of the TextAttribute class.
 *  For example, this code snippet causes a TextLayout to
 *  shape European digits to Arabic in an Arabic context:
 *  
 *  Map map = new HashMap();
 *  map.put(TextAttribute.NUMERIC_SHAPING,
 *      NumericShaper.getContextualShaper(NumericShaper.ARABIC));
 *  FontRenderContext frc = ...;
 *  TextLayout layout = new TextLayout(text, map, frc);
 *  layout.draw(g2d, x, y);
 *  
 *  
 *  It is also possible to perform numeric shaping explicitly using instances
 *  of NumericShaper, as this code snippet demonstrates:
 *  
 *  char[] text = ...;
 *  // shape all EUROPEAN digits (except zero) to ARABIC digits
 *  NumericShaper shaper = NumericShaper.getShaper(NumericShaper.ARABIC);
 *  shaper.shape(text, start, count);
 * 
 *  // shape European digits to ARABIC digits if preceding text is Arabic, or
 *  // shape European digits to TAMIL digits if preceding text is Tamil, or
 *  // leave European digits alone if there is no preceding text, or
 *  // preceding text is neither Arabic nor Tamil
 *  NumericShaper shaper =
 *      NumericShaper.getContextualShaper(NumericShaper.ARABIC |
 *                                          NumericShaper.TAMIL,
 *                                        NumericShaper.EUROPEAN);
 *  shaper.shape(text, start, count);
 *  
 * 
 *  Bit mask- and enum-based Unicode ranges
 * 
 *  This class supports two different programming interfaces to
 *  represent Unicode ranges for script-specific digits: bit
 *  mask-based ones, such as NumericShaper.ARABIC, and
 *  enum-based ones, such as NumericShaper.Range.ARABIC.
 *  Multiple ranges can be specified by ORing bit mask-based constants,
 *  such as:
 *  
 *  NumericShaper.ARABIC | NumericShaper.TAMIL
 *  
 *  or creating a Set with the NumericShaper.Range
 *  constants, such as:
 *  
 *  EnumSet.of(NumericShaper.Scirpt.ARABIC, NumericShaper.Range.TAMIL)
 *  
 *  The enum-based ranges are a super set of the bit mask-based ones.
 * 
 *  If the two interfaces are mixed (including serialization),
 *  Unicode range values are mapped to their counterparts where such
 *  mapping is possible, such as NumericShaper.Range.ARABIC
 *  from/to NumericShaper.ARABIC.  If any unmappable range
 *  values are specified, such as NumericShaper.Range.BALINESE,
 *  those ranges are ignored.
 * 
 *  Decimal Digits Precedence
 * 
 *  A Unicode range may have more than one set of decimal digits. If
 *  multiple decimal digits sets are specified for the same Unicode
 *  range, one of the sets will take precedence as follows.
 * 
 *  
 *     
 *        Unicode Range
 *        NumericShaper Constants
 *        Precedence
 *     
 *     
 *        Arabic
 *        NumericShaper.ARABIC
 *            NumericShaper.EASTERN_ARABIC
 *        NumericShaper.EASTERN_ARABIC
 *     
 *     
 *        NumericShaper.Range.ARABIC
 *            NumericShaper.Range.EASTERN_ARABIC
 *        NumericShaper.Range.EASTERN_ARABIC
 *     
 *     
 *        Tai Tham
 *        NumericShaper.Range.TAI_THAM_HORA
 *            NumericShaper.Range.TAI_THAM_THAM
 *        NumericShaper.Range.TAI_THAM_THAM
 *     
 *  
 */
final class NumericShaper extends Object with Serializable {

    /** Returns true if the specified object is an instance of
     *  NumericShaper and shapes identically to this one,
     *  regardless of the range representations, the bit mask or the
     *  enum.
     */
    @stub
    def equals(o: Any): Boolean = ???

    /** Returns an int that ORs together the values for
     *  all the ranges that will be shaped.
     */
    @stub
    def getRanges(): Int = ???

    /** Returns a Set representing all the Unicode ranges in
     *  this NumericShaper that will be shaped.
     */
    @stub
    def getRangeSet(): Set[NumericShaper.Range] = ???

    /** Returns a hash code for this shaper. */
    @stub
    def hashCode(): Int = ???

    /** Returns a boolean indicating whether or not
     *  this shaper shapes contextually.
     */
    @stub
    def isContextual(): Boolean = ???

    /** Converts the digits in the text that occur between start and
     *  start + count.
     */
    @stub
    def shape(text: Array[Char], start: Int, count: Int): Unit = ???

    /** Converts the digits in the text that occur between start and
     *  start + count, using the provided context.
     */
    @stub
    def shape(text: Array[Char], start: Int, count: Int, context: Int): Unit = ???

    /** Converts the digits in the text that occur between start and start + count, using the provided context. */
    @stub
    def shape(text: Array[Char], start: Int, count: Int, context: NumericShaper.Range): Unit = ???

    /** Returns a String that describes this shaper. */
    @stub
    def toString(): String = ???
}

object NumericShaper {
    /** A NumericShaper.Range represents a Unicode range of a
     *  script having its own decimal digits. For example, the THAI range has the Thai digits, THAI DIGIT
     *  ZERO (U+0E50) to THAI DIGIT NINE (U+0E59).
     * 
     *  The Range enum replaces the traditional bit
     *  mask-based values (e.g., NumericShaper.ARABIC), and
     *  supports more Unicode ranges than the bit mask-based ones. For
     *  example, the following code using the bit mask:
     *  
     *  NumericShaper.getContextualShaper(NumericShaper.ARABIC |
     *                                      NumericShaper.TAMIL,
     *                                    NumericShaper.EUROPEAN);
     *  
     *  can be written using this enum as:
     *  
     *  NumericShaper.getContextualShaper(EnumSet.of(
     *                                      NumericShaper.Range.ARABIC,
     *                                      NumericShaper.Range.TAMIL),
     *                                    NumericShaper.Range.EUROPEAN);
     *  
     */
    class Range private (name: String, ordinal: Int) extends Enum[Range](name, ordinal) {
    }

    object Range {
        /** The Arabic range with the Arabic-Indic digits. */
        final val ARABIC: Range = new Range("ARABIC", 0)

        /** The Balinese range with the Balinese digits. */
        final val BALINESE: Range = new Range("BALINESE", 1)

        /** The Bengali range with the Bengali digits. */
        final val BENGALI: Range = new Range("BENGALI", 2)

        /** The Cham range with the Cham digits. */
        final val CHAM: Range = new Range("CHAM", 3)

        /** The Devanagari range with the Devanagari digits. */
        final val DEVANAGARI: Range = new Range("DEVANAGARI", 4)

        /** The Arabic range with the Eastern Arabic-Indic digits. */
        final val EASTERN_ARABIC: Range = new Range("EASTERN_ARABIC", 5)

        /** The Ethiopic range with the Ethiopic digits. */
        final val ETHIOPIC: Range = new Range("ETHIOPIC", 6)

        /** The Latin (European) range with the Latin (ASCII) digits. */
        final val EUROPEAN: Range = new Range("EUROPEAN", 7)

        /** The Gujarati range with the Gujarati digits. */
        final val GUJARATI: Range = new Range("GUJARATI", 8)

        /** The Gurmukhi range with the Gurmukhi digits. */
        final val GURMUKHI: Range = new Range("GURMUKHI", 9)

        /** The Javanese range with the Javanese digits. */
        final val JAVANESE: Range = new Range("JAVANESE", 10)

        /** The Kannada range with the Kannada digits. */
        final val KANNADA: Range = new Range("KANNADA", 11)

        /** The Kayah Li range with the Kayah Li digits. */
        final val KAYAH_LI: Range = new Range("KAYAH_LI", 12)

        /** The Khmer range with the Khmer digits. */
        final val KHMER: Range = new Range("KHMER", 13)

        /** The Lao range with the Lao digits. */
        final val LAO: Range = new Range("LAO", 14)

        /** The Lepcha range with the Lepcha digits. */
        final val LEPCHA: Range = new Range("LEPCHA", 15)

        /** The Limbu range with the Limbu digits. */
        final val LIMBU: Range = new Range("LIMBU", 16)

        /** The Malayalam range with the Malayalam digits. */
        final val MALAYALAM: Range = new Range("MALAYALAM", 17)

        /** The Meetei Mayek range with the Meetei Mayek digits. */
        final val MEETEI_MAYEK: Range = new Range("MEETEI_MAYEK", 18)

        /** The Mongolian range with the Mongolian digits. */
        final val MONGOLIAN: Range = new Range("MONGOLIAN", 19)

        /** The Myanmar range with the Myanmar digits. */
        final val MYANMAR: Range = new Range("MYANMAR", 20)

        /** The Myanmar range with the Myanmar Shan digits. */
        final val MYANMAR_SHAN: Range = new Range("MYANMAR_SHAN", 21)

        /** The New Tai Lue range with the New Tai Lue digits. */
        final val NEW_TAI_LUE: Range = new Range("NEW_TAI_LUE", 22)

        /** The N'Ko range with the N'Ko digits. */
        final val NKO: Range = new Range("NKO", 23)

        /** The Ol Chiki range with the Ol Chiki digits. */
        final val OL_CHIKI: Range = new Range("OL_CHIKI", 24)

        /** The Oriya range with the Oriya digits. */
        final val ORIYA: Range = new Range("ORIYA", 25)

        /** The Saurashtra range with the Saurashtra digits. */
        final val SAURASHTRA: Range = new Range("SAURASHTRA", 26)

        /** The Sundanese range with the Sundanese digits. */
        final val SUNDANESE: Range = new Range("SUNDANESE", 27)

        /** The Tai Tham Hora range with the Tai Tham Hora digits. */
        final val TAI_THAM_HORA: Range = new Range("TAI_THAM_HORA", 28)

        /** The Tai Tham Tham range with the Tai Tham Tham digits. */
        final val TAI_THAM_THAM: Range = new Range("TAI_THAM_THAM", 29)

        /** The Tamil range with the Tamil digits. */
        final val TAMIL: Range = new Range("TAMIL", 30)

        /** The Telugu range with the Telugu digits. */
        final val TELUGU: Range = new Range("TELUGU", 31)

        /** The Thai range with the Thai digits. */
        final val THAI: Range = new Range("THAI", 32)

        /** The Tibetan range with the Tibetan digits. */
        final val TIBETAN: Range = new Range("TIBETAN", 33)

        /** The Vai range with the Vai digits. */
        final val VAI: Range = new Range("VAI", 34)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): Range = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[Range] = ???
    }


    /** Identifies all ranges, for full contextual shaping. */
    @stub
    val ALL_RANGES: Int = ???

    /** Identifies the ARABIC range and decimal base. */
    @stub
    val ARABIC: Int = ???

    /** Identifies the BENGALI range and decimal base. */
    @stub
    val BENGALI: Int = ???

    /** Identifies the DEVANAGARI range and decimal base. */
    @stub
    val DEVANAGARI: Int = ???

    /** Identifies the ARABIC range and ARABIC_EXTENDED decimal base. */
    @stub
    val EASTERN_ARABIC: Int = ???

    /** Identifies the ETHIOPIC range and decimal base. */
    @stub
    val ETHIOPIC: Int = ???

    /** Identifies the Latin-1 (European) and extended range, and
     *   Latin-1 (European) decimal base.
     */
    @stub
    val EUROPEAN: Int = ???

    /** Identifies the GUJARATI range and decimal base. */
    @stub
    val GUJARATI: Int = ???

    /** Identifies the GURMUKHI range and decimal base. */
    @stub
    val GURMUKHI: Int = ???

    /** Identifies the KANNADA range and decimal base. */
    @stub
    val KANNADA: Int = ???

    /** Identifies the KHMER range and decimal base. */
    @stub
    val KHMER: Int = ???

    /** Identifies the LAO range and decimal base. */
    @stub
    val LAO: Int = ???

    /** Identifies the MALAYALAM range and decimal base. */
    @stub
    val MALAYALAM: Int = ???

    /** Identifies the MONGOLIAN range and decimal base. */
    @stub
    val MONGOLIAN: Int = ???

    /** Identifies the MYANMAR range and decimal base. */
    @stub
    val MYANMAR: Int = ???

    /** Identifies the ORIYA range and decimal base. */
    @stub
    val ORIYA: Int = ???

    /** Identifies the TAMIL range and decimal base. */
    @stub
    val TAMIL: Int = ???

    /** Identifies the TELUGU range and decimal base. */
    @stub
    val TELUGU: Int = ???

    /** Identifies the THAI range and decimal base. */
    @stub
    val THAI: Int = ???

    /** Identifies the TIBETAN range and decimal base. */
    @stub
    val TIBETAN: Int = ???

    /** Returns a contextual shaper for the provided unicode range(s). */
    @stub
    def getContextualShaper(ranges: Int): NumericShaper = ???

    /** Returns a contextual shaper for the provided unicode range(s). */
    @stub
    def getContextualShaper(ranges: Int, defaultContext: Int): NumericShaper = ???

    /** Returns a contextual shaper for the provided Unicode
     *  range(s).
     */
    @stub
    def getContextualShaper(ranges: Set[NumericShaper.Range]): NumericShaper = ???

    /** Returns a contextual shaper for the provided Unicode range(s). */
    @stub
    def getContextualShaper(ranges: Set[NumericShaper.Range], defaultContext: NumericShaper.Range): NumericShaper = ???

    /** Returns a shaper for the provided unicode range. */
    @stub
    def getShaper(singleRange: Int): NumericShaper = ???

    /** Returns a shaper for the provided Unicode
     *  range.
     */
    @stub
    def getShaper(singleRange: NumericShaper.Range): NumericShaper = ???
}
