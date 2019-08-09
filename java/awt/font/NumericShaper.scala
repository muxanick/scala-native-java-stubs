package java.awt.font

import java.io.Serializable
import java.lang.{Object, String}
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
    def equals(o: Object): Boolean = ???

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
     *  script having its own decimal digits.
     */
    @stub
    object Range extends NumericShaper.Range

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
