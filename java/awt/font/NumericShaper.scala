package java.awt.font

import java.io.Serializable
import java.lang.Object
import java.util.Set

// The NumericShaper class is used to convert Latin-1 (European)
// digits to other Unicode decimal digits.  Users of this class will
// primarily be people who wish to present data using
// national digit shapes, but find it more convenient to represent the
// data internally using Latin-1 (European) digits.  This does not
// interpret the deprecated numeric shape selector character (U+206E).
// 
// Instances of NumericShaper are typically applied
// as attributes to text with the
// NUMERIC_SHAPING attribute
// of the TextAttribute class.
// For example, this code snippet causes a TextLayout to
// shape European digits to Arabic in an Arabic context:
// 
// Map map = new HashMap();
// map.put(TextAttribute.NUMERIC_SHAPING,
//     NumericShaper.getContextualShaper(NumericShaper.ARABIC));
// FontRenderContext frc = ...;
// TextLayout layout = new TextLayout(text, map, frc);
// layout.draw(g2d, x, y);
// 
// 
// It is also possible to perform numeric shaping explicitly using instances
// of NumericShaper, as this code snippet demonstrates:
// 
// char[] text = ...;
// // shape all EUROPEAN digits (except zero) to ARABIC digits
// NumericShaper shaper = NumericShaper.getShaper(NumericShaper.ARABIC);
// shaper.shape(text, start, count);
//
// // shape European digits to ARABIC digits if preceding text is Arabic, or
// // shape European digits to TAMIL digits if preceding text is Tamil, or
// // leave European digits alone if there is no preceding text, or
// // preceding text is neither Arabic nor Tamil
// NumericShaper shaper =
//     NumericShaper.getContextualShaper(NumericShaper.ARABIC |
//                                         NumericShaper.TAMIL,
//                                       NumericShaper.EUROPEAN);
// shaper.shape(text, start, count);
// 
//
// Bit mask- and enum-based Unicode ranges
//
// This class supports two different programming interfaces to
// represent Unicode ranges for script-specific digits: bit
// mask-based ones, such as NumericShaper.ARABIC, and
// enum-based ones, such as NumericShaper.Range.ARABIC.
// Multiple ranges can be specified by ORing bit mask-based constants,
// such as:
// 
// NumericShaper.ARABIC | NumericShaper.TAMIL
// 
// or creating a Set with the NumericShaper.Range
// constants, such as:
// 
// EnumSet.of(NumericShaper.Scirpt.ARABIC, NumericShaper.Range.TAMIL)
// 
// The enum-based ranges are a super set of the bit mask-based ones.
//
// If the two interfaces are mixed (including serialization),
// Unicode range values are mapped to their counterparts where such
// mapping is possible, such as NumericShaper.Range.ARABIC
// from/to NumericShaper.ARABIC.  If any unmappable range
// values are specified, such as NumericShaper.Range.BALINESE,
// those ranges are ignored.
//
// Decimal Digits Precedence
//
// A Unicode range may have more than one set of decimal digits. If
// multiple decimal digits sets are specified for the same Unicode
// range, one of the sets will take precedence as follows.
//
// 
//    
//       Unicode Range
//       NumericShaper Constants
//       Precedence
//    
//    
//       Arabic
//       NumericShaper.ARABIC
//           NumericShaper.EASTERN_ARABIC
//       NumericShaper.EASTERN_ARABIC
//    
//    
//       NumericShaper.Range.ARABIC
//           NumericShaper.Range.EASTERN_ARABIC
//       NumericShaper.Range.EASTERN_ARABIC
//    
//    
//       Tai Tham
//       NumericShaper.Range.TAI_THAM_HORA
//           NumericShaper.Range.TAI_THAM_THAM
//       NumericShaper.Range.TAI_THAM_THAM
//    
// 
final class NumericShaper extends Object with Serializable {

    @stub
    // Returns true if the specified object is an instance of
    // NumericShaper and shapes identically to this one,
    // regardless of the range representations, the bit mask or the
    // enum.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns an int that ORs together the values for
    // all the ranges that will be shaped.
    def getRanges(): Int = ???

    @stub
    // Returns a Set representing all the Unicode ranges in
    // this NumericShaper that will be shaped.
    def getRangeSet(): Set[NumericShaper.Range] = ???

    @stub
    // Returns a hash code for this shaper.
    def hashCode(): Int = ???

    @stub
    // Returns a boolean indicating whether or not
    // this shaper shapes contextually.
    def isContextual(): Boolean = ???

    @stub
    // Converts the digits in the text that occur between start and
    // start + count.
    def shape(text: Array[Char], start: Int, count: Int): Unit = ???

    @stub
    // Converts the digits in the text that occur between start and
    // start + count, using the provided context.
    def shape(text: Array[Char], start: Int, count: Int, context: Int): Unit = ???

    @stub
    // Converts the digits in the text that occur between start and start + count, using the provided context.
    def shape(text: Array[Char], start: Int, count: Int, context: NumericShaper.Range): Unit = ???
}

object NumericShaper {
    @stub
    // Identifies all ranges, for full contextual shaping.
    def ALL_RANGES: Int = ???

    @stub
    // Identifies the ARABIC range and decimal base.
    def ARABIC: Int = ???

    @stub
    // Identifies the BENGALI range and decimal base.
    def BENGALI: Int = ???

    @stub
    // Identifies the DEVANAGARI range and decimal base.
    def DEVANAGARI: Int = ???

    @stub
    // Identifies the ARABIC range and ARABIC_EXTENDED decimal base.
    def EASTERN_ARABIC: Int = ???

    @stub
    // Identifies the ETHIOPIC range and decimal base.
    def ETHIOPIC: Int = ???

    @stub
    // Identifies the Latin-1 (European) and extended range, and
    //  Latin-1 (European) decimal base.
    def EUROPEAN: Int = ???

    @stub
    // Identifies the GUJARATI range and decimal base.
    def GUJARATI: Int = ???

    @stub
    // Identifies the GURMUKHI range and decimal base.
    def GURMUKHI: Int = ???

    @stub
    // Identifies the KANNADA range and decimal base.
    def KANNADA: Int = ???

    @stub
    // Identifies the KHMER range and decimal base.
    def KHMER: Int = ???

    @stub
    // Identifies the LAO range and decimal base.
    def LAO: Int = ???

    @stub
    // Identifies the MALAYALAM range and decimal base.
    def MALAYALAM: Int = ???

    @stub
    // Identifies the MONGOLIAN range and decimal base.
    def MONGOLIAN: Int = ???

    @stub
    // Identifies the MYANMAR range and decimal base.
    def MYANMAR: Int = ???

    @stub
    // Identifies the ORIYA range and decimal base.
    def ORIYA: Int = ???

    @stub
    // Identifies the TAMIL range and decimal base.
    def TAMIL: Int = ???

    @stub
    // Identifies the TELUGU range and decimal base.
    def TELUGU: Int = ???

    @stub
    // Identifies the THAI range and decimal base.
    def THAI: Int = ???

    @stub
    // Returns a contextual shaper for the provided unicode range(s).
    def getContextualShaper(ranges: Int): NumericShaper = ???

    @stub
    // Returns a contextual shaper for the provided unicode range(s).
    def getContextualShaper(ranges: Int, defaultContext: Int): NumericShaper = ???

    @stub
    // Returns a contextual shaper for the provided Unicode
    // range(s).
    def getContextualShaper(ranges: Set[NumericShaper.Range]): NumericShaper = ???

    @stub
    // Returns a contextual shaper for the provided Unicode range(s).
    def getContextualShaper(ranges: Set[NumericShaper.Range], defaultContext: NumericShaper.Range): NumericShaper = ???

    @stub
    // Returns a shaper for the provided unicode range.
    def getShaper(singleRange: Int): NumericShaper = ???

    @stub
    // Returns a shaper for the provided Unicode
    // range.
    def getShaper(singleRange: NumericShaper.Range): NumericShaper = ???
}
