package java.lang

import java.io.Serializable
import scala.scalanative.annotation.stub

/** The Character class wraps a value of the primitive
 *  type char in an object. An object of class
 *  Character contains a single field whose type is
 *  char.
 *  
 *  In addition, this class provides a large number of static methods for
 *  determining a character's category (lowercase letter, digit, etc.)
 *  and for converting characters from uppercase to lowercase and vice
 *  versa.
 * 
 *  Unicode Conformance
 *  
 *  The fields and methods of class Character are defined in terms
 *  of character information from the Unicode Standard, specifically the
 *  UnicodeData file that is part of the Unicode Character Database.
 *  This file specifies properties including name and category for every
 *  assigned Unicode code point or character range. The file is available
 *  from the Unicode Consortium at
 *  http://www.unicode.org.
 *  
 *  The Java SE 8 Platform uses character information from version 6.2
 *  of the Unicode Standard, with two extensions. First, the Java SE 8 Platform
 *  allows an implementation of class Character to use the Japanese Era
 *  code point, U+32FF, from the first version of the Unicode Standard
 *  after 6.2 that assigns the code point. Second, in recognition of the fact
 *  that new currencies appear frequently, the Java SE 8 Platform allows an
 *  implementation of class Character to use the Currency Symbols
 *  block from version 10.0 of the Unicode Standard. Consequently, the
 *  behavior of fields and methods of class Character may vary across
 *  implementations of the Java SE 8 Platform when processing the aforementioned
 *  code points ( outside of version 6.2 ), except for the following methods
 *  that define Java identifiers:
 *  isJavaIdentifierStart(int), isJavaIdentifierStart(char),
 *  isJavaIdentifierPart(int), and isJavaIdentifierPart(char).
 *  Code points in Java identifiers must be drawn from version 6.2 of
 *  the Unicode Standard.
 * 
 *  Unicode Character Representations
 * 
 *  The char data type (and therefore the value that a
 *  Character object encapsulates) are based on the
 *  original Unicode specification, which defined characters as
 *  fixed-width 16-bit entities. The Unicode Standard has since been
 *  changed to allow for characters whose representation requires more
 *  than 16 bits.  The range of legal code points is now
 *  U+0000 to U+10FFFF, known as Unicode scalar value.
 *  (Refer to the 
 *  definition of the U+n notation in the Unicode
 *  Standard.)
 * 
 *  The set of characters from U+0000 to U+FFFF is
 *  sometimes referred to as the Basic Multilingual Plane (BMP).
 *  Characters whose code points are greater
 *  than U+FFFF are called supplementary characters.  The Java
 *  platform uses the UTF-16 representation in char arrays and
 *  in the String and StringBuffer classes. In
 *  this representation, supplementary characters are represented as a pair
 *  of char values, the first from the high-surrogates
 *  range, (\uD800-\uDBFF), the second from the
 *  low-surrogates range (\uDC00-\uDFFF).
 * 
 *  A char value, therefore, represents Basic
 *  Multilingual Plane (BMP) code points, including the surrogate
 *  code points, or code units of the UTF-16 encoding. An
 *  int value represents all Unicode code points,
 *  including supplementary code points. The lower (least significant)
 *  21 bits of int are used to represent Unicode code
 *  points and the upper (most significant) 11 bits must be zero.
 *  Unless otherwise specified, the behavior with respect to
 *  supplementary characters and surrogate char values is
 *  as follows:
 * 
 *  
 *  The methods that only accept a char value cannot support
 *  supplementary characters. They treat char values from the
 *  surrogate ranges as undefined characters. For example,
 *  Character.isLetter('\uD840') returns false, even though
 *  this specific value if followed by any low-surrogate value in a string
 *  would represent a letter.
 * 
 *  The methods that accept an int value support all
 *  Unicode characters, including supplementary characters. For
 *  example, Character.isLetter(0x2F81A) returns
 *  true because the code point value represents a letter
 *  (a CJK ideograph).
 *  
 * 
 *  In the Java SE API documentation, Unicode code point is
 *  used for character values in the range between U+0000 and U+10FFFF,
 *  and Unicode code unit is used for 16-bit
 *  char values that are code units of the UTF-16
 *  encoding. For more information on Unicode terminology, refer to the
 *  Unicode Glossary.
 */
final class Character extends Object with Serializable with Comparable[Character] {

    /** Constructs a newly allocated Character object that
     *  represents the specified char value.
     */
    @stub
    def this(value: Char) = ???

    /** Returns the value of this Character object. */
    @stub
    def charValue(): Char = ???

    /** Compares two Character objects numerically. */
    @stub
    def compareTo(anotherCharacter: Character): Int = ???

    /** Compares this object against the specified object. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns a hash code for this Character; equal to the result
     *  of invoking charValue().
     */
    @stub
    def hashCode(): Int = ???

    /** Returns a String object representing this
     *  Character's value.
     */
    @stub
    def toString(): String = ???
}

object Character {
    /** Instances of this class represent particular subsets of the Unicode
     *  character set.  The only family of subsets defined in the
     *  Character class is Character.UnicodeBlock.
     *  Other portions of the Java API may define other subsets for their
     *  own purposes.
     */
    object Subset extends Object {

        /** Constructs a new Subset instance. */
        @stub
        protected def apply(name: String) = ???

        /** Compares two Subset objects for equality. */
        @stub
        def equals(obj: Any): Boolean = ???

        /** Returns the standard hash code as defined by the
         *  Object.hashCode() method.
         */
        @stub
        def hashCode(): Int = ???

        /** Returns the name of this subset. */
        @stub
        def toString(): String = ???
    }


    /** A family of character subsets representing the character blocks in the
     *  Unicode specification. Character blocks generally define characters
     *  used for a specific script or purpose. A character is contained by
     *  at most one Unicode block.
     */
    final object UnicodeBlock extends Character.Subset {

        /** Constant for the "Aegean Numbers" Unicode character block. */
        @stub
        val AEGEAN_NUMBERS: UnicodeBlock = ???

        /** Constant for the "Alchemical Symbols" Unicode character block. */
        @stub
        val ALCHEMICAL_SYMBOLS: UnicodeBlock = ???

        /** Constant for the "Alphabetic Presentation Forms" Unicode character block. */
        @stub
        val ALPHABETIC_PRESENTATION_FORMS: UnicodeBlock = ???

        /** Constant for the "Ancient Greek Musical Notation" Unicode character
         *  block.
         */
        @stub
        val ANCIENT_GREEK_MUSICAL_NOTATION: UnicodeBlock = ???

        /** Constant for the "Ancient Greek Numbers" Unicode character block. */
        @stub
        val ANCIENT_GREEK_NUMBERS: UnicodeBlock = ???

        /** Constant for the "Ancient Symbols" Unicode character block. */
        @stub
        val ANCIENT_SYMBOLS: UnicodeBlock = ???

        /** Constant for the "Arabic" Unicode character block. */
        @stub
        val ARABIC: UnicodeBlock = ???

        /** Constant for the "Arabic Extended-A" Unicode character block. */
        @stub
        val ARABIC_EXTENDED_A: UnicodeBlock = ???

        /** Constant for the "Arabic Mathematical Alphabetic Symbols" Unicode
         *  character block.
         */
        @stub
        val ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS: UnicodeBlock = ???

        /** Constant for the "Arabic Presentation Forms-A" Unicode character
         *  block.
         */
        @stub
        val ARABIC_PRESENTATION_FORMS_A: UnicodeBlock = ???

        /** Constant for the "Arabic Presentation Forms-B" Unicode character block. */
        @stub
        val ARABIC_PRESENTATION_FORMS_B: UnicodeBlock = ???

        /** Constant for the "Arabic Supplement" Unicode character block. */
        @stub
        val ARABIC_SUPPLEMENT: UnicodeBlock = ???

        /** Constant for the "Armenian" Unicode character block. */
        @stub
        val ARMENIAN: UnicodeBlock = ???

        /** Constant for the "Arrows" Unicode character block. */
        @stub
        val ARROWS: UnicodeBlock = ???

        /** Constant for the "Avestan" Unicode character block. */
        @stub
        val AVESTAN: UnicodeBlock = ???

        /** Constant for the "Balinese" Unicode character block. */
        @stub
        val BALINESE: UnicodeBlock = ???

        /** Constant for the "Bamum" Unicode character block. */
        @stub
        val BAMUM: UnicodeBlock = ???

        /** Constant for the "Bamum Supplement" Unicode character block. */
        @stub
        val BAMUM_SUPPLEMENT: UnicodeBlock = ???

        /** Constant for the "Basic Latin" Unicode character block. */
        @stub
        val BASIC_LATIN: UnicodeBlock = ???

        /** Constant for the "Batak" Unicode character block. */
        @stub
        val BATAK: UnicodeBlock = ???

        /** Constant for the "Bengali" Unicode character block. */
        @stub
        val BENGALI: UnicodeBlock = ???

        /** Constant for the "Block Elements" Unicode character block. */
        @stub
        val BLOCK_ELEMENTS: UnicodeBlock = ???

        /** Constant for the "Bopomofo" Unicode character block. */
        @stub
        val BOPOMOFO: UnicodeBlock = ???

        /** Constant for the "Bopomofo Extended" Unicode character block. */
        @stub
        val BOPOMOFO_EXTENDED: UnicodeBlock = ???

        /** Constant for the "Box Drawing" Unicode character block. */
        @stub
        val BOX_DRAWING: UnicodeBlock = ???

        /** Constant for the "Brahmi" Unicode character block. */
        @stub
        val BRAHMI: UnicodeBlock = ???

        /** Constant for the "Braille Patterns" Unicode character block. */
        @stub
        val BRAILLE_PATTERNS: UnicodeBlock = ???

        /** Constant for the "Buginese" Unicode character block. */
        @stub
        val BUGINESE: UnicodeBlock = ???

        /** Constant for the "Buhid" Unicode character block. */
        @stub
        val BUHID: UnicodeBlock = ???

        /** Constant for the "Byzantine Musical Symbols" Unicode character block. */
        @stub
        val BYZANTINE_MUSICAL_SYMBOLS: UnicodeBlock = ???

        /** Constant for the "Carian" Unicode character block. */
        @stub
        val CARIAN: UnicodeBlock = ???

        /** Constant for the "Chakma" Unicode character block. */
        @stub
        val CHAKMA: UnicodeBlock = ???

        /** Constant for the "Cham" Unicode character block. */
        @stub
        val CHAM: UnicodeBlock = ???

        /** Constant for the "Cherokee" Unicode character block. */
        @stub
        val CHEROKEE: UnicodeBlock = ???

        /** Constant for the "CJK Compatibility" Unicode character block. */
        @stub
        val CJK_COMPATIBILITY: UnicodeBlock = ???

        /** Constant for the "CJK Compatibility Forms" Unicode character block. */
        @stub
        val CJK_COMPATIBILITY_FORMS: UnicodeBlock = ???

        /** Constant for the "CJK Compatibility Ideographs" Unicode character
         *  block.
         */
        @stub
        val CJK_COMPATIBILITY_IDEOGRAPHS: UnicodeBlock = ???

        /** Constant for the "CJK Compatibility Ideographs Supplement" Unicode character block. */
        @stub
        val CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT: UnicodeBlock = ???

        /** Constant for the "CJK Radicals Supplement" Unicode character block. */
        @stub
        val CJK_RADICALS_SUPPLEMENT: UnicodeBlock = ???

        /** Constant for the "CJK Strokes" Unicode character block. */
        @stub
        val CJK_STROKES: UnicodeBlock = ???

        /** Constant for the "CJK Symbols and Punctuation" Unicode character block. */
        @stub
        val CJK_SYMBOLS_AND_PUNCTUATION: UnicodeBlock = ???

        /** Constant for the "CJK Unified Ideographs" Unicode character block. */
        @stub
        val CJK_UNIFIED_IDEOGRAPHS: UnicodeBlock = ???

        /** Constant for the "CJK Unified Ideographs Extension A" Unicode character block. */
        @stub
        val CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A: UnicodeBlock = ???

        /** Constant for the "CJK Unified Ideographs Extension B" Unicode
         *  character block.
         */
        @stub
        val CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B: UnicodeBlock = ???

        /** Constant for the "CJK Unified Ideographs Extension C" Unicode
         *  character block.
         */
        @stub
        val CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C: UnicodeBlock = ???

        /** Constant for the "CJK Unified Ideographs Extension D" Unicode
         *  character block.
         */
        @stub
        val CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D: UnicodeBlock = ???

        /** Constant for the "Combining Diacritical Marks" Unicode character block. */
        @stub
        val COMBINING_DIACRITICAL_MARKS: UnicodeBlock = ???

        /** Constant for the "Combining Diacritical Marks Supplement" Unicode
         *  character block.
         */
        @stub
        val COMBINING_DIACRITICAL_MARKS_SUPPLEMENT: UnicodeBlock = ???

        /** Constant for the "Combining Half Marks" Unicode character block. */
        @stub
        val COMBINING_HALF_MARKS: UnicodeBlock = ???

        /** Constant for the "Combining Diacritical Marks for Symbols" Unicode
         *  character block.
         */
        @stub
        val COMBINING_MARKS_FOR_SYMBOLS: UnicodeBlock = ???

        /** Constant for the "Common Indic Number Forms" Unicode character block. */
        @stub
        val COMMON_INDIC_NUMBER_FORMS: UnicodeBlock = ???

        /** Constant for the "Control Pictures" Unicode character block. */
        @stub
        val CONTROL_PICTURES: UnicodeBlock = ???

        /** Constant for the "Coptic" Unicode character block. */
        @stub
        val COPTIC: UnicodeBlock = ???

        /** Constant for the "Counting Rod Numerals" Unicode character block. */
        @stub
        val COUNTING_ROD_NUMERALS: UnicodeBlock = ???

        /** Constant for the "Cuneiform" Unicode character block. */
        @stub
        val CUNEIFORM: UnicodeBlock = ???

        /** Constant for the "Cuneiform Numbers and Punctuation" Unicode
         *  character block.
         */
        @stub
        val CUNEIFORM_NUMBERS_AND_PUNCTUATION: UnicodeBlock = ???

        /** Constant for the "Currency Symbols" Unicode character block. */
        @stub
        val CURRENCY_SYMBOLS: UnicodeBlock = ???

        /** Constant for the "Cypriot Syllabary" Unicode character block. */
        @stub
        val CYPRIOT_SYLLABARY: UnicodeBlock = ???

        /** Constant for the "Cyrillic" Unicode character block. */
        @stub
        val CYRILLIC: UnicodeBlock = ???

        /** Constant for the "Cyrillic Extended-A" Unicode character block. */
        @stub
        val CYRILLIC_EXTENDED_A: UnicodeBlock = ???

        /** Constant for the "Cyrillic Extended-B" Unicode character block. */
        @stub
        val CYRILLIC_EXTENDED_B: UnicodeBlock = ???

        /** Constant for the "Cyrillic Supplementary" Unicode character block. */
        @stub
        val CYRILLIC_SUPPLEMENTARY: UnicodeBlock = ???

        /** Constant for the "Deseret" Unicode character block. */
        @stub
        val DESERET: UnicodeBlock = ???

        /** Constant for the "Devanagari" Unicode character block. */
        @stub
        val DEVANAGARI: UnicodeBlock = ???

        /** Constant for the "Devanagari Extended" Unicode character block. */
        @stub
        val DEVANAGARI_EXTENDED: UnicodeBlock = ???

        /** Constant for the "Dingbats" Unicode character block. */
        @stub
        val DINGBATS: UnicodeBlock = ???

        /** Constant for the "Domino Tiles" Unicode character block. */
        @stub
        val DOMINO_TILES: UnicodeBlock = ???

        /** Constant for the "Egyptian Hieroglyphs" Unicode character block. */
        @stub
        val EGYPTIAN_HIEROGLYPHS: UnicodeBlock = ???

        /** Constant for the "Emoticons" Unicode character block. */
        @stub
        val EMOTICONS: UnicodeBlock = ???

        /** Constant for the "Enclosed Alphanumeric Supplement" Unicode character
         *  block.
         */
        @stub
        val ENCLOSED_ALPHANUMERIC_SUPPLEMENT: UnicodeBlock = ???

        /** Constant for the "Enclosed Alphanumerics" Unicode character block. */
        @stub
        val ENCLOSED_ALPHANUMERICS: UnicodeBlock = ???

        /** Constant for the "Enclosed CJK Letters and Months" Unicode character block. */
        @stub
        val ENCLOSED_CJK_LETTERS_AND_MONTHS: UnicodeBlock = ???

        /** Constant for the "Enclosed Ideographic Supplement" Unicode character
         *  block.
         */
        @stub
        val ENCLOSED_IDEOGRAPHIC_SUPPLEMENT: UnicodeBlock = ???

        /** Constant for the "Ethiopic" Unicode character block. */
        @stub
        val ETHIOPIC: UnicodeBlock = ???

        /** Constant for the "Ethiopic Extended" Unicode character block. */
        @stub
        val ETHIOPIC_EXTENDED: UnicodeBlock = ???

        /** Constant for the "Ethiopic Extended-A" Unicode character block. */
        @stub
        val ETHIOPIC_EXTENDED_A: UnicodeBlock = ???

        /** Constant for the "Ethiopic Supplement" Unicode character block. */
        @stub
        val ETHIOPIC_SUPPLEMENT: UnicodeBlock = ???

        /** Constant for the "General Punctuation" Unicode character block. */
        @stub
        val GENERAL_PUNCTUATION: UnicodeBlock = ???

        /** Constant for the "Geometric Shapes" Unicode character block. */
        @stub
        val GEOMETRIC_SHAPES: UnicodeBlock = ???

        /** Constant for the "Georgian" Unicode character block. */
        @stub
        val GEORGIAN: UnicodeBlock = ???

        /** Constant for the "Georgian Supplement" Unicode character block. */
        @stub
        val GEORGIAN_SUPPLEMENT: UnicodeBlock = ???

        /** Constant for the "Glagolitic" Unicode character block. */
        @stub
        val GLAGOLITIC: UnicodeBlock = ???

        /** Constant for the "Gothic" Unicode character block. */
        @stub
        val GOTHIC: UnicodeBlock = ???

        /** Constant for the "Greek and Coptic" Unicode character block. */
        @stub
        val GREEK: UnicodeBlock = ???

        /** Constant for the "Greek Extended" Unicode character block. */
        @stub
        val GREEK_EXTENDED: UnicodeBlock = ???

        /** Constant for the "Gujarati" Unicode character block. */
        @stub
        val GUJARATI: UnicodeBlock = ???

        /** Constant for the "Gurmukhi" Unicode character block. */
        @stub
        val GURMUKHI: UnicodeBlock = ???

        /** Constant for the "Halfwidth and Fullwidth Forms" Unicode character
         *  block.
         */
        @stub
        val HALFWIDTH_AND_FULLWIDTH_FORMS: UnicodeBlock = ???

        /** Constant for the "Hangul Compatibility Jamo" Unicode character block. */
        @stub
        val HANGUL_COMPATIBILITY_JAMO: UnicodeBlock = ???

        /** Constant for the "Hangul Jamo" Unicode character block. */
        @stub
        val HANGUL_JAMO: UnicodeBlock = ???

        /** Constant for the "Hangul Jamo Extended-A" Unicode character block. */
        @stub
        val HANGUL_JAMO_EXTENDED_A: UnicodeBlock = ???

        /** Constant for the "Hangul Jamo Extended-B" Unicode character block. */
        @stub
        val HANGUL_JAMO_EXTENDED_B: UnicodeBlock = ???

        /** Constant for the "Hangul Syllables" Unicode character block. */
        @stub
        val HANGUL_SYLLABLES: UnicodeBlock = ???

        /** Constant for the "Hanunoo" Unicode character block. */
        @stub
        val HANUNOO: UnicodeBlock = ???

        /** Constant for the "Hebrew" Unicode character block. */
        @stub
        val HEBREW: UnicodeBlock = ???

        /** Constant for the "High Private Use Surrogates" Unicode character
         *  block.
         */
        @stub
        val HIGH_PRIVATE_USE_SURROGATES: UnicodeBlock = ???

        /** Constant for the "High Surrogates" Unicode character block. */
        @stub
        val HIGH_SURROGATES: UnicodeBlock = ???

        /** Constant for the "Hiragana" Unicode character block. */
        @stub
        val HIRAGANA: UnicodeBlock = ???

        /** Constant for the "Ideographic Description Characters" Unicode character block. */
        @stub
        val IDEOGRAPHIC_DESCRIPTION_CHARACTERS: UnicodeBlock = ???

        /** Constant for the "Imperial Aramaic" Unicode character block. */
        @stub
        val IMPERIAL_ARAMAIC: UnicodeBlock = ???

        /** Constant for the "Inscriptional Pahlavi" Unicode character block. */
        @stub
        val INSCRIPTIONAL_PAHLAVI: UnicodeBlock = ???

        /** Constant for the "Inscriptional Parthian" Unicode character block. */
        @stub
        val INSCRIPTIONAL_PARTHIAN: UnicodeBlock = ???

        /** Constant for the "IPA Extensions" Unicode character block. */
        @stub
        val IPA_EXTENSIONS: UnicodeBlock = ???

        /** Constant for the "Javanese" Unicode character block. */
        @stub
        val JAVANESE: UnicodeBlock = ???

        /** Constant for the "Kaithi" Unicode character block. */
        @stub
        val KAITHI: UnicodeBlock = ???

        /** Constant for the "Kana Supplement" Unicode character block. */
        @stub
        val KANA_SUPPLEMENT: UnicodeBlock = ???

        /** Constant for the "Kanbun" Unicode character block. */
        @stub
        val KANBUN: UnicodeBlock = ???

        /** Constant for the "Kangxi Radicals" Unicode character block. */
        @stub
        val KANGXI_RADICALS: UnicodeBlock = ???

        /** Constant for the "Kannada" Unicode character block. */
        @stub
        val KANNADA: UnicodeBlock = ???

        /** Constant for the "Katakana" Unicode character block. */
        @stub
        val KATAKANA: UnicodeBlock = ???

        /** Constant for the "Katakana Phonetic Extensions" Unicode character
         *  block.
         */
        @stub
        val KATAKANA_PHONETIC_EXTENSIONS: UnicodeBlock = ???

        /** Constant for the "Kayah Li" Unicode character block. */
        @stub
        val KAYAH_LI: UnicodeBlock = ???

        /** Constant for the "Kharoshthi" Unicode character block. */
        @stub
        val KHAROSHTHI: UnicodeBlock = ???

        /** Constant for the "Khmer" Unicode character block. */
        @stub
        val KHMER: UnicodeBlock = ???

        /** Constant for the "Khmer Symbols" Unicode character block. */
        @stub
        val KHMER_SYMBOLS: UnicodeBlock = ???

        /** Constant for the "Lao" Unicode character block. */
        @stub
        val LAO: UnicodeBlock = ???

        /** Constant for the "Latin-1 Supplement" Unicode character block. */
        @stub
        val LATIN_1_SUPPLEMENT: UnicodeBlock = ???

        /** Constant for the "Latin Extended-A" Unicode character block. */
        @stub
        val LATIN_EXTENDED_A: UnicodeBlock = ???

        /** Constant for the "Latin Extended Additional" Unicode character block. */
        @stub
        val LATIN_EXTENDED_ADDITIONAL: UnicodeBlock = ???

        /** Constant for the "Latin Extended-B" Unicode character block. */
        @stub
        val LATIN_EXTENDED_B: UnicodeBlock = ???

        /** Constant for the "Latin Extended-C" Unicode character block. */
        @stub
        val LATIN_EXTENDED_C: UnicodeBlock = ???

        /** Constant for the "Latin Extended-D" Unicode character block. */
        @stub
        val LATIN_EXTENDED_D: UnicodeBlock = ???

        /** Constant for the "Lepcha" Unicode character block. */
        @stub
        val LEPCHA: UnicodeBlock = ???

        /** Constant for the "Letterlike Symbols" Unicode character block. */
        @stub
        val LETTERLIKE_SYMBOLS: UnicodeBlock = ???

        /** Constant for the "Limbu" Unicode character block. */
        @stub
        val LIMBU: UnicodeBlock = ???

        /** Constant for the "Linear B Ideograms" Unicode character block. */
        @stub
        val LINEAR_B_IDEOGRAMS: UnicodeBlock = ???

        /** Constant for the "Linear B Syllabary" Unicode character block. */
        @stub
        val LINEAR_B_SYLLABARY: UnicodeBlock = ???

        /** Constant for the "Lisu" Unicode character block. */
        @stub
        val LISU: UnicodeBlock = ???

        /** Constant for the "Low Surrogates" Unicode character block. */
        @stub
        val LOW_SURROGATES: UnicodeBlock = ???

        /** Constant for the "Lycian" Unicode character block. */
        @stub
        val LYCIAN: UnicodeBlock = ???

        /** Constant for the "Lydian" Unicode character block. */
        @stub
        val LYDIAN: UnicodeBlock = ???

        /** Constant for the "Mahjong Tiles" Unicode character block. */
        @stub
        val MAHJONG_TILES: UnicodeBlock = ???

        /** Constant for the "Malayalam" Unicode character block. */
        @stub
        val MALAYALAM: UnicodeBlock = ???

        /** Constant for the "Mandaic" Unicode character block. */
        @stub
        val MANDAIC: UnicodeBlock = ???

        /** Constant for the "Mathematical Alphanumeric Symbols" Unicode
         *  character block.
         */
        @stub
        val MATHEMATICAL_ALPHANUMERIC_SYMBOLS: UnicodeBlock = ???

        /** Constant for the "Mathematical Operators" Unicode character block. */
        @stub
        val MATHEMATICAL_OPERATORS: UnicodeBlock = ???

        /** Constant for the "Meetei Mayek" Unicode character block. */
        @stub
        val MEETEI_MAYEK: UnicodeBlock = ???

        /** Constant for the "Meetei Mayek Extensions" Unicode character block. */
        @stub
        val MEETEI_MAYEK_EXTENSIONS: UnicodeBlock = ???

        /** Constant for the "Meroitic Cursive" Unicode character block. */
        @stub
        val MEROITIC_CURSIVE: UnicodeBlock = ???

        /** Constant for the "Meroitic Hieroglyphs" Unicode character block. */
        @stub
        val MEROITIC_HIEROGLYPHS: UnicodeBlock = ???

        /** Constant for the "Miao" Unicode character block. */
        @stub
        val MIAO: UnicodeBlock = ???

        /** Constant for the "Miscellaneous Mathematical Symbols-A" Unicode character block. */
        @stub
        val MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A: UnicodeBlock = ???

        /** Constant for the "Miscellaneous Mathematical Symbols-B" Unicode
         *  character block.
         */
        @stub
        val MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B: UnicodeBlock = ???

        /** Constant for the "Miscellaneous Symbols" Unicode character block. */
        @stub
        val MISCELLANEOUS_SYMBOLS: UnicodeBlock = ???

        /** Constant for the "Miscellaneous Symbols and Arrows" Unicode character
         *  block.
         */
        @stub
        val MISCELLANEOUS_SYMBOLS_AND_ARROWS: UnicodeBlock = ???

        /** Constant for the "Miscellaneous Symbols And Pictographs" Unicode
         *  character block.
         */
        @stub
        val MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS: UnicodeBlock = ???

        /** Constant for the "Miscellaneous Technical" Unicode character block. */
        @stub
        val MISCELLANEOUS_TECHNICAL: UnicodeBlock = ???

        /** Constant for the "Modifier Tone Letters" Unicode character block. */
        @stub
        val MODIFIER_TONE_LETTERS: UnicodeBlock = ???

        /** Constant for the "Mongolian" Unicode character block. */
        @stub
        val MONGOLIAN: UnicodeBlock = ???

        /** Constant for the "Musical Symbols" Unicode character block. */
        @stub
        val MUSICAL_SYMBOLS: UnicodeBlock = ???

        /** Constant for the "Myanmar" Unicode character block. */
        @stub
        val MYANMAR: UnicodeBlock = ???

        /** Constant for the "Myanmar Extended-A" Unicode character block. */
        @stub
        val MYANMAR_EXTENDED_A: UnicodeBlock = ???

        /** Constant for the "New Tai Lue" Unicode character block. */
        @stub
        val NEW_TAI_LUE: UnicodeBlock = ???

        /** Constant for the "NKo" Unicode character block. */
        @stub
        val NKO: UnicodeBlock = ???

        /** Constant for the "Number Forms" Unicode character block. */
        @stub
        val NUMBER_FORMS: UnicodeBlock = ???

        /** Constant for the "Ogham" Unicode character block. */
        @stub
        val OGHAM: UnicodeBlock = ???

        /** Constant for the "Ol Chiki" Unicode character block. */
        @stub
        val OL_CHIKI: UnicodeBlock = ???

        /** Constant for the "Old Italic" Unicode character block. */
        @stub
        val OLD_ITALIC: UnicodeBlock = ???

        /** Constant for the "Old Persian" Unicode character block. */
        @stub
        val OLD_PERSIAN: UnicodeBlock = ???

        /** Constant for the "Old South Arabian" Unicode character block. */
        @stub
        val OLD_SOUTH_ARABIAN: UnicodeBlock = ???

        /** Constant for the "Old Turkic" Unicode character block. */
        @stub
        val OLD_TURKIC: UnicodeBlock = ???

        /** Constant for the "Optical Character Recognition" Unicode character block. */
        @stub
        val OPTICAL_CHARACTER_RECOGNITION: UnicodeBlock = ???

        /** Constant for the "Oriya" Unicode character block. */
        @stub
        val ORIYA: UnicodeBlock = ???

        /** Constant for the "Osmanya" Unicode character block. */
        @stub
        val OSMANYA: UnicodeBlock = ???

        /** Constant for the "Phags-pa" Unicode character block. */
        @stub
        val PHAGS_PA: UnicodeBlock = ???

        /** Constant for the "Phaistos Disc" Unicode character block. */
        @stub
        val PHAISTOS_DISC: UnicodeBlock = ???

        /** Constant for the "Phoenician" Unicode character block. */
        @stub
        val PHOENICIAN: UnicodeBlock = ???

        /** Constant for the "Phonetic Extensions" Unicode character block. */
        @stub
        val PHONETIC_EXTENSIONS: UnicodeBlock = ???

        /** Constant for the "Phonetic Extensions Supplement" Unicode character
         *  block.
         */
        @stub
        val PHONETIC_EXTENSIONS_SUPPLEMENT: UnicodeBlock = ???

        /** Constant for the "Playing Cards" Unicode character block. */
        @stub
        val PLAYING_CARDS: UnicodeBlock = ???

        /** Constant for the "Private Use Area" Unicode character block. */
        @stub
        val PRIVATE_USE_AREA: UnicodeBlock = ???

        /** Constant for the "Rejang" Unicode character block. */
        @stub
        val REJANG: UnicodeBlock = ???

        /** Constant for the "Rumi Numeral Symbols" Unicode character block. */
        @stub
        val RUMI_NUMERAL_SYMBOLS: UnicodeBlock = ???

        /** Constant for the "Runic" Unicode character block. */
        @stub
        val RUNIC: UnicodeBlock = ???

        /** Constant for the "Samaritan" Unicode character block. */
        @stub
        val SAMARITAN: UnicodeBlock = ???

        /** Constant for the "Saurashtra" Unicode character block. */
        @stub
        val SAURASHTRA: UnicodeBlock = ???

        /** Constant for the "Sharada" Unicode character block. */
        @stub
        val SHARADA: UnicodeBlock = ???

        /** Constant for the "Shavian" Unicode character block. */
        @stub
        val SHAVIAN: UnicodeBlock = ???

        /** Constant for the "Sinhala" Unicode character block. */
        @stub
        val SINHALA: UnicodeBlock = ???

        /** Constant for the "Small Form Variants" Unicode character block. */
        @stub
        val SMALL_FORM_VARIANTS: UnicodeBlock = ???

        /** Constant for the "Sora Sompeng" Unicode character block. */
        @stub
        val SORA_SOMPENG: UnicodeBlock = ???

        /** Constant for the "Spacing Modifier Letters" Unicode character block. */
        @stub
        val SPACING_MODIFIER_LETTERS: UnicodeBlock = ???

        /** Constant for the "Specials" Unicode character block. */
        @stub
        val SPECIALS: UnicodeBlock = ???

        /** Constant for the "Sundanese" Unicode character block. */
        @stub
        val SUNDANESE: UnicodeBlock = ???

        /** Constant for the "Sundanese Supplement" Unicode character block. */
        @stub
        val SUNDANESE_SUPPLEMENT: UnicodeBlock = ???

        /** Constant for the "Superscripts and Subscripts" Unicode character
         *  block.
         */
        @stub
        val SUPERSCRIPTS_AND_SUBSCRIPTS: UnicodeBlock = ???

        /** Constant for the "Supplemental Arrows-A" Unicode character block. */
        @stub
        val SUPPLEMENTAL_ARROWS_A: UnicodeBlock = ???

        /** Constant for the "Supplemental Arrows-B" Unicode character block. */
        @stub
        val SUPPLEMENTAL_ARROWS_B: UnicodeBlock = ???

        /** Constant for the "Supplemental Mathematical Operators" Unicode
         *  character block.
         */
        @stub
        val SUPPLEMENTAL_MATHEMATICAL_OPERATORS: UnicodeBlock = ???

        /** Constant for the "Supplemental Punctuation" Unicode character block. */
        @stub
        val SUPPLEMENTAL_PUNCTUATION: UnicodeBlock = ???

        /** Constant for the "Supplementary Private Use Area-A" Unicode character
         *  block.
         */
        @stub
        val SUPPLEMENTARY_PRIVATE_USE_AREA_A: UnicodeBlock = ???

        /** Constant for the "Supplementary Private Use Area-B" Unicode character
         *  block.
         */
        @stub
        val SUPPLEMENTARY_PRIVATE_USE_AREA_B: UnicodeBlock = ???

        /** Deprecated. 
         * As of J2SE 5, use HIGH_SURROGATES,
         *              HIGH_PRIVATE_USE_SURROGATES, and
         *              LOW_SURROGATES. These new constants match
         *              the block definitions of the Unicode Standard.
         *              The of(char) and of(int) methods
         *              return the new constants, not SURROGATES_AREA.
         * 
         */
        @stub
        val SURROGATES_AREA: UnicodeBlock = ???

        /** Constant for the "Syloti Nagri" Unicode character block. */
        @stub
        val SYLOTI_NAGRI: UnicodeBlock = ???

        /** Constant for the "Syriac" Unicode character block. */
        @stub
        val SYRIAC: UnicodeBlock = ???

        /** Constant for the "Tagalog" Unicode character block. */
        @stub
        val TAGALOG: UnicodeBlock = ???

        /** Constant for the "Tagbanwa" Unicode character block. */
        @stub
        val TAGBANWA: UnicodeBlock = ???

        /** Constant for the "Tags" Unicode character block. */
        @stub
        val TAGS: UnicodeBlock = ???

        /** Constant for the "Tai Le" Unicode character block. */
        @stub
        val TAI_LE: UnicodeBlock = ???

        /** Constant for the "Tai Tham" Unicode character block. */
        @stub
        val TAI_THAM: UnicodeBlock = ???

        /** Constant for the "Tai Viet" Unicode character block. */
        @stub
        val TAI_VIET: UnicodeBlock = ???

        /** Constant for the "Tai Xuan Jing Symbols" Unicode character block. */
        @stub
        val TAI_XUAN_JING_SYMBOLS: UnicodeBlock = ???

        /** Constant for the "Takri" Unicode character block. */
        @stub
        val TAKRI: UnicodeBlock = ???

        /** Constant for the "Tamil" Unicode character block. */
        @stub
        val TAMIL: UnicodeBlock = ???

        /** Constant for the "Telugu" Unicode character block. */
        @stub
        val TELUGU: UnicodeBlock = ???

        /** Constant for the "Thaana" Unicode character block. */
        @stub
        val THAANA: UnicodeBlock = ???

        /** Constant for the "Thai" Unicode character block. */
        @stub
        val THAI: UnicodeBlock = ???

        /** Constant for the "Tibetan" Unicode character block. */
        @stub
        val TIBETAN: UnicodeBlock = ???

        /** Constant for the "Tifinagh" Unicode character block. */
        @stub
        val TIFINAGH: UnicodeBlock = ???

        /** Constant for the "Transport And Map Symbols" Unicode character block. */
        @stub
        val TRANSPORT_AND_MAP_SYMBOLS: UnicodeBlock = ???

        /** Constant for the "Ugaritic" Unicode character block. */
        @stub
        val UGARITIC: UnicodeBlock = ???

        /** Constant for the "Unified Canadian Aboriginal Syllabics" Unicode character block. */
        @stub
        val UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS: UnicodeBlock = ???

        /** Constant for the "Unified Canadian Aboriginal Syllabics Extended"
         *  Unicode character block.
         */
        @stub
        val UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED: UnicodeBlock = ???

        /** Constant for the "Vai" Unicode character block. */
        @stub
        val VAI: UnicodeBlock = ???

        /** Constant for the "Variation Selectors" Unicode character block. */
        @stub
        val VARIATION_SELECTORS: UnicodeBlock = ???

        /** Constant for the "Variation Selectors Supplement" Unicode character
         *  block.
         */
        @stub
        val VARIATION_SELECTORS_SUPPLEMENT: UnicodeBlock = ???

        /** Constant for the "Vedic Extensions" Unicode character block. */
        @stub
        val VEDIC_EXTENSIONS: UnicodeBlock = ???

        /** Constant for the "Vertical Forms" Unicode character block. */
        @stub
        val VERTICAL_FORMS: UnicodeBlock = ???

        /** Constant for the "Yi Radicals" Unicode character block. */
        @stub
        val YI_RADICALS: UnicodeBlock = ???

        /** Constant for the "Yi Syllables" Unicode character block. */
        @stub
        val YI_SYLLABLES: UnicodeBlock = ???

        /** Constant for the "Yijing Hexagram Symbols" Unicode character block. */
        @stub
        val YIJING_HEXAGRAM_SYMBOLS: UnicodeBlock = ???

        /** Returns the UnicodeBlock with the given name. */
        @stub
        def forName(blockName: String): UnicodeBlock = ???

        /** Returns the object representing the Unicode block containing the
         *  given character, or null if the character is not a
         *  member of a defined block.
         */
        @stub
        def of(c: Char): UnicodeBlock = ???

        /** Returns the object representing the Unicode block
         *  containing the given character (Unicode code point), or
         *  null if the character is not a member of a
         *  defined block.
         */
        @stub
        def of(codePoint: Int): UnicodeBlock = ???
    }


    /** A family of character subsets representing the character scripts
     *  defined in the 
     *  Unicode Standard Annex #24: Script Names. Every Unicode
     *  character is assigned to a single Unicode script, either a specific
     *  script, such as Latin, or
     *  one of the following three special values,
     *  Inherited,
     *  Common or
     *  Unknown.
     */
    class UnicodeScript private (name: String, ordinal: Int) extends Enum[UnicodeScript](name, ordinal) {
    }

    object UnicodeScript {
        /** Unicode script "Arabic". */
        final val ARABIC: UnicodeScript = new UnicodeScript("ARABIC", 0)

        /** Unicode script "Armenian". */
        final val ARMENIAN: UnicodeScript = new UnicodeScript("ARMENIAN", 1)

        /** Unicode script "Avestan". */
        final val AVESTAN: UnicodeScript = new UnicodeScript("AVESTAN", 2)

        /** Unicode script "Balinese". */
        final val BALINESE: UnicodeScript = new UnicodeScript("BALINESE", 3)

        /** Unicode script "Bamum". */
        final val BAMUM: UnicodeScript = new UnicodeScript("BAMUM", 4)

        /** Unicode script "Batak". */
        final val BATAK: UnicodeScript = new UnicodeScript("BATAK", 5)

        /** Unicode script "Bengali". */
        final val BENGALI: UnicodeScript = new UnicodeScript("BENGALI", 6)

        /** Unicode script "Bopomofo". */
        final val BOPOMOFO: UnicodeScript = new UnicodeScript("BOPOMOFO", 7)

        /** Unicode script "Brahmi". */
        final val BRAHMI: UnicodeScript = new UnicodeScript("BRAHMI", 8)

        /** Unicode script "Braille". */
        final val BRAILLE: UnicodeScript = new UnicodeScript("BRAILLE", 9)

        /** Unicode script "Buginese". */
        final val BUGINESE: UnicodeScript = new UnicodeScript("BUGINESE", 10)

        /** Unicode script "Buhid". */
        final val BUHID: UnicodeScript = new UnicodeScript("BUHID", 11)

        /** Unicode script "Canadian_Aboriginal". */
        final val CANADIAN_ABORIGINAL: UnicodeScript = new UnicodeScript("CANADIAN_ABORIGINAL", 12)

        /** Unicode script "Carian". */
        final val CARIAN: UnicodeScript = new UnicodeScript("CARIAN", 13)

        /** Unicode script "Chakma". */
        final val CHAKMA: UnicodeScript = new UnicodeScript("CHAKMA", 14)

        /** Unicode script "Cham". */
        final val CHAM: UnicodeScript = new UnicodeScript("CHAM", 15)

        /** Unicode script "Cherokee". */
        final val CHEROKEE: UnicodeScript = new UnicodeScript("CHEROKEE", 16)

        /** Unicode script "Common". */
        final val COMMON: UnicodeScript = new UnicodeScript("COMMON", 17)

        /** Unicode script "Coptic". */
        final val COPTIC: UnicodeScript = new UnicodeScript("COPTIC", 18)

        /** Unicode script "Cuneiform". */
        final val CUNEIFORM: UnicodeScript = new UnicodeScript("CUNEIFORM", 19)

        /** Unicode script "Cypriot". */
        final val CYPRIOT: UnicodeScript = new UnicodeScript("CYPRIOT", 20)

        /** Unicode script "Cyrillic". */
        final val CYRILLIC: UnicodeScript = new UnicodeScript("CYRILLIC", 21)

        /** Unicode script "Deseret". */
        final val DESERET: UnicodeScript = new UnicodeScript("DESERET", 22)

        /** Unicode script "Devanagari". */
        final val DEVANAGARI: UnicodeScript = new UnicodeScript("DEVANAGARI", 23)

        /** Unicode script "Egyptian_Hieroglyphs". */
        final val EGYPTIAN_HIEROGLYPHS: UnicodeScript = new UnicodeScript("EGYPTIAN_HIEROGLYPHS", 24)

        /** Unicode script "Ethiopic". */
        final val ETHIOPIC: UnicodeScript = new UnicodeScript("ETHIOPIC", 25)

        /** Unicode script "Georgian". */
        final val GEORGIAN: UnicodeScript = new UnicodeScript("GEORGIAN", 26)

        /** Unicode script "Glagolitic". */
        final val GLAGOLITIC: UnicodeScript = new UnicodeScript("GLAGOLITIC", 27)

        /** Unicode script "Gothic". */
        final val GOTHIC: UnicodeScript = new UnicodeScript("GOTHIC", 28)

        /** Unicode script "Greek". */
        final val GREEK: UnicodeScript = new UnicodeScript("GREEK", 29)

        /** Unicode script "Gujarati". */
        final val GUJARATI: UnicodeScript = new UnicodeScript("GUJARATI", 30)

        /** Unicode script "Gurmukhi". */
        final val GURMUKHI: UnicodeScript = new UnicodeScript("GURMUKHI", 31)

        /** Unicode script "Han". */
        final val HAN: UnicodeScript = new UnicodeScript("HAN", 32)

        /** Unicode script "Hangul". */
        final val HANGUL: UnicodeScript = new UnicodeScript("HANGUL", 33)

        /** Unicode script "Hanunoo". */
        final val HANUNOO: UnicodeScript = new UnicodeScript("HANUNOO", 34)

        /** Unicode script "Hebrew". */
        final val HEBREW: UnicodeScript = new UnicodeScript("HEBREW", 35)

        /** Unicode script "Hiragana". */
        final val HIRAGANA: UnicodeScript = new UnicodeScript("HIRAGANA", 36)

        /** Unicode script "Imperial_Aramaic". */
        final val IMPERIAL_ARAMAIC: UnicodeScript = new UnicodeScript("IMPERIAL_ARAMAIC", 37)

        /** Unicode script "Inherited". */
        final val INHERITED: UnicodeScript = new UnicodeScript("INHERITED", 38)

        /** Unicode script "Inscriptional_Pahlavi". */
        final val INSCRIPTIONAL_PAHLAVI: UnicodeScript = new UnicodeScript("INSCRIPTIONAL_PAHLAVI", 39)

        /** Unicode script "Inscriptional_Parthian". */
        final val INSCRIPTIONAL_PARTHIAN: UnicodeScript = new UnicodeScript("INSCRIPTIONAL_PARTHIAN", 40)

        /** Unicode script "Javanese". */
        final val JAVANESE: UnicodeScript = new UnicodeScript("JAVANESE", 41)

        /** Unicode script "Kaithi". */
        final val KAITHI: UnicodeScript = new UnicodeScript("KAITHI", 42)

        /** Unicode script "Kannada". */
        final val KANNADA: UnicodeScript = new UnicodeScript("KANNADA", 43)

        /** Unicode script "Katakana". */
        final val KATAKANA: UnicodeScript = new UnicodeScript("KATAKANA", 44)

        /** Unicode script "Kayah_Li". */
        final val KAYAH_LI: UnicodeScript = new UnicodeScript("KAYAH_LI", 45)

        /** Unicode script "Kharoshthi". */
        final val KHAROSHTHI: UnicodeScript = new UnicodeScript("KHAROSHTHI", 46)

        /** Unicode script "Khmer". */
        final val KHMER: UnicodeScript = new UnicodeScript("KHMER", 47)

        /** Unicode script "Lao". */
        final val LAO: UnicodeScript = new UnicodeScript("LAO", 48)

        /** Unicode script "Latin". */
        final val LATIN: UnicodeScript = new UnicodeScript("LATIN", 49)

        /** Unicode script "Lepcha". */
        final val LEPCHA: UnicodeScript = new UnicodeScript("LEPCHA", 50)

        /** Unicode script "Limbu". */
        final val LIMBU: UnicodeScript = new UnicodeScript("LIMBU", 51)

        /** Unicode script "Linear_B". */
        final val LINEAR_B: UnicodeScript = new UnicodeScript("LINEAR_B", 52)

        /** Unicode script "Lisu". */
        final val LISU: UnicodeScript = new UnicodeScript("LISU", 53)

        /** Unicode script "Lycian". */
        final val LYCIAN: UnicodeScript = new UnicodeScript("LYCIAN", 54)

        /** Unicode script "Lydian". */
        final val LYDIAN: UnicodeScript = new UnicodeScript("LYDIAN", 55)

        /** Unicode script "Malayalam". */
        final val MALAYALAM: UnicodeScript = new UnicodeScript("MALAYALAM", 56)

        /** Unicode script "Mandaic". */
        final val MANDAIC: UnicodeScript = new UnicodeScript("MANDAIC", 57)

        /** Unicode script "Meetei_Mayek". */
        final val MEETEI_MAYEK: UnicodeScript = new UnicodeScript("MEETEI_MAYEK", 58)

        /** Unicode script "Meroitic Cursive". */
        final val MEROITIC_CURSIVE: UnicodeScript = new UnicodeScript("MEROITIC_CURSIVE", 59)

        /** Unicode script "Meroitic Hieroglyphs". */
        final val MEROITIC_HIEROGLYPHS: UnicodeScript = new UnicodeScript("MEROITIC_HIEROGLYPHS", 60)

        /** Unicode script "Miao". */
        final val MIAO: UnicodeScript = new UnicodeScript("MIAO", 61)

        /** Unicode script "Mongolian". */
        final val MONGOLIAN: UnicodeScript = new UnicodeScript("MONGOLIAN", 62)

        /** Unicode script "Myanmar". */
        final val MYANMAR: UnicodeScript = new UnicodeScript("MYANMAR", 63)

        /** Unicode script "New_Tai_Lue". */
        final val NEW_TAI_LUE: UnicodeScript = new UnicodeScript("NEW_TAI_LUE", 64)

        /** Unicode script "Nko". */
        final val NKO: UnicodeScript = new UnicodeScript("NKO", 65)

        /** Unicode script "Ogham". */
        final val OGHAM: UnicodeScript = new UnicodeScript("OGHAM", 66)

        /** Unicode script "Ol_Chiki". */
        final val OL_CHIKI: UnicodeScript = new UnicodeScript("OL_CHIKI", 67)

        /** Unicode script "Old_Italic". */
        final val OLD_ITALIC: UnicodeScript = new UnicodeScript("OLD_ITALIC", 68)

        /** Unicode script "Old_Persian". */
        final val OLD_PERSIAN: UnicodeScript = new UnicodeScript("OLD_PERSIAN", 69)

        /** Unicode script "Old_South_Arabian". */
        final val OLD_SOUTH_ARABIAN: UnicodeScript = new UnicodeScript("OLD_SOUTH_ARABIAN", 70)

        /** Unicode script "Old_Turkic". */
        final val OLD_TURKIC: UnicodeScript = new UnicodeScript("OLD_TURKIC", 71)

        /** Unicode script "Oriya". */
        final val ORIYA: UnicodeScript = new UnicodeScript("ORIYA", 72)

        /** Unicode script "Osmanya". */
        final val OSMANYA: UnicodeScript = new UnicodeScript("OSMANYA", 73)

        /** Unicode script "Phags_Pa". */
        final val PHAGS_PA: UnicodeScript = new UnicodeScript("PHAGS_PA", 74)

        /** Unicode script "Phoenician". */
        final val PHOENICIAN: UnicodeScript = new UnicodeScript("PHOENICIAN", 75)

        /** Unicode script "Rejang". */
        final val REJANG: UnicodeScript = new UnicodeScript("REJANG", 76)

        /** Unicode script "Runic". */
        final val RUNIC: UnicodeScript = new UnicodeScript("RUNIC", 77)

        /** Unicode script "Samaritan". */
        final val SAMARITAN: UnicodeScript = new UnicodeScript("SAMARITAN", 78)

        /** Unicode script "Saurashtra". */
        final val SAURASHTRA: UnicodeScript = new UnicodeScript("SAURASHTRA", 79)

        /** Unicode script "Sharada". */
        final val SHARADA: UnicodeScript = new UnicodeScript("SHARADA", 80)

        /** Unicode script "Shavian". */
        final val SHAVIAN: UnicodeScript = new UnicodeScript("SHAVIAN", 81)

        /** Unicode script "Sinhala". */
        final val SINHALA: UnicodeScript = new UnicodeScript("SINHALA", 82)

        /** Unicode script "Sora Sompeng". */
        final val SORA_SOMPENG: UnicodeScript = new UnicodeScript("SORA_SOMPENG", 83)

        /** Unicode script "Sundanese". */
        final val SUNDANESE: UnicodeScript = new UnicodeScript("SUNDANESE", 84)

        /** Unicode script "Syloti_Nagri". */
        final val SYLOTI_NAGRI: UnicodeScript = new UnicodeScript("SYLOTI_NAGRI", 85)

        /** Unicode script "Syriac". */
        final val SYRIAC: UnicodeScript = new UnicodeScript("SYRIAC", 86)

        /** Unicode script "Tagalog". */
        final val TAGALOG: UnicodeScript = new UnicodeScript("TAGALOG", 87)

        /** Unicode script "Tagbanwa". */
        final val TAGBANWA: UnicodeScript = new UnicodeScript("TAGBANWA", 88)

        /** Unicode script "Tai_Le". */
        final val TAI_LE: UnicodeScript = new UnicodeScript("TAI_LE", 89)

        /** Unicode script "Tai_Tham". */
        final val TAI_THAM: UnicodeScript = new UnicodeScript("TAI_THAM", 90)

        /** Unicode script "Tai_Viet". */
        final val TAI_VIET: UnicodeScript = new UnicodeScript("TAI_VIET", 91)

        /** Unicode script "Takri". */
        final val TAKRI: UnicodeScript = new UnicodeScript("TAKRI", 92)

        /** Unicode script "Tamil". */
        final val TAMIL: UnicodeScript = new UnicodeScript("TAMIL", 93)

        /** Unicode script "Telugu". */
        final val TELUGU: UnicodeScript = new UnicodeScript("TELUGU", 94)

        /** Unicode script "Thaana". */
        final val THAANA: UnicodeScript = new UnicodeScript("THAANA", 95)

        /** Unicode script "Thai". */
        final val THAI: UnicodeScript = new UnicodeScript("THAI", 96)

        /** Unicode script "Tibetan". */
        final val TIBETAN: UnicodeScript = new UnicodeScript("TIBETAN", 97)

        /** Unicode script "Tifinagh". */
        final val TIFINAGH: UnicodeScript = new UnicodeScript("TIFINAGH", 98)

        /** Unicode script "Ugaritic". */
        final val UGARITIC: UnicodeScript = new UnicodeScript("UGARITIC", 99)

        /** Unicode script "Unknown". */
        final val UNKNOWN: UnicodeScript = new UnicodeScript("UNKNOWN", 100)

        /** Unicode script "Vai". */
        final val VAI: UnicodeScript = new UnicodeScript("VAI", 101)

        /** Unicode script "Yi". */
        final val YI: UnicodeScript = new UnicodeScript("YI", 102)

        /** Returns the UnicodeScript constant with the given Unicode script
         *  name or the script name alias.
         */
        @stub
        def forName(scriptName: String): UnicodeScript = ???

        /** Returns the enum constant representing the Unicode script of which
         *  the given character (Unicode code point) is assigned to.
         */
        @stub
        def of(codePoint: Int): UnicodeScript = ???

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): UnicodeScript = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[UnicodeScript] = ???
    }


    /** The number of bytes used to represent a char value in unsigned
     *  binary form.
     */
    @stub
    val BYTES: Int = ???

    /** General category "Mc" in the Unicode specification. */
    @stub
    val COMBINING_SPACING_MARK: Byte = ???

    /** General category "Pc" in the Unicode specification. */
    @stub
    val CONNECTOR_PUNCTUATION: Byte = ???

    /** General category "Cc" in the Unicode specification. */
    @stub
    val CONTROL: Byte = ???

    /** General category "Sc" in the Unicode specification. */
    @stub
    val CURRENCY_SYMBOL: Byte = ???

    /** General category "Pd" in the Unicode specification. */
    @stub
    val DASH_PUNCTUATION: Byte = ???

    /** General category "Nd" in the Unicode specification. */
    @stub
    val DECIMAL_DIGIT_NUMBER: Byte = ???

    /** Weak bidirectional character type "AN" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_ARABIC_NUMBER: Byte = ???

    /** Weak bidirectional character type "BN" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_BOUNDARY_NEUTRAL: Byte = ???

    /** Weak bidirectional character type "CS" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_COMMON_NUMBER_SEPARATOR: Byte = ???

    /** Weak bidirectional character type "EN" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_EUROPEAN_NUMBER: Byte = ???

    /** Weak bidirectional character type "ES" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_EUROPEAN_NUMBER_SEPARATOR: Byte = ???

    /** Weak bidirectional character type "ET" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_EUROPEAN_NUMBER_TERMINATOR: Byte = ???

    /** Strong bidirectional character type "L" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_LEFT_TO_RIGHT: Byte = ???

    /** Strong bidirectional character type "LRE" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_LEFT_TO_RIGHT_EMBEDDING: Byte = ???

    /** Strong bidirectional character type "LRO" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_LEFT_TO_RIGHT_OVERRIDE: Byte = ???

    /** Weak bidirectional character type "NSM" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_NONSPACING_MARK: Byte = ???

    /** Neutral bidirectional character type "ON" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_OTHER_NEUTRALS: Byte = ???

    /** Neutral bidirectional character type "B" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_PARAGRAPH_SEPARATOR: Byte = ???

    /** Weak bidirectional character type "PDF" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_POP_DIRECTIONAL_FORMAT: Byte = ???

    /** Strong bidirectional character type "R" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_RIGHT_TO_LEFT: Byte = ???

    /** Strong bidirectional character type "AL" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC: Byte = ???

    /** Strong bidirectional character type "RLE" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_RIGHT_TO_LEFT_EMBEDDING: Byte = ???

    /** Strong bidirectional character type "RLO" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_RIGHT_TO_LEFT_OVERRIDE: Byte = ???

    /** Neutral bidirectional character type "S" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_SEGMENT_SEPARATOR: Byte = ???

    /** Undefined bidirectional character type. */
    @stub
    val DIRECTIONALITY_UNDEFINED: Byte = ???

    /** Neutral bidirectional character type "WS" in the Unicode specification. */
    @stub
    val DIRECTIONALITY_WHITESPACE: Byte = ???

    /** General category "Me" in the Unicode specification. */
    @stub
    val ENCLOSING_MARK: Byte = ???

    /** General category "Pe" in the Unicode specification. */
    @stub
    val END_PUNCTUATION: Byte = ???

    /** General category "Pf" in the Unicode specification. */
    @stub
    val FINAL_QUOTE_PUNCTUATION: Byte = ???

    /** General category "Cf" in the Unicode specification. */
    @stub
    val FORMAT: Byte = ???

    /** General category "Pi" in the Unicode specification. */
    @stub
    val INITIAL_QUOTE_PUNCTUATION: Byte = ???

    /** General category "Nl" in the Unicode specification. */
    @stub
    val LETTER_NUMBER: Byte = ???

    /** General category "Zl" in the Unicode specification. */
    @stub
    val LINE_SEPARATOR: Byte = ???

    /** General category "Ll" in the Unicode specification. */
    @stub
    val LOWERCASE_LETTER: Byte = ???

    /** General category "Sm" in the Unicode specification. */
    @stub
    val MATH_SYMBOL: Byte = ???

    /** The maximum value of a
     *  
     *  Unicode code point, constant U+10FFFF.
     */
    @stub
    val MAX_CODE_POINT: Int = ???

    /** The maximum value of a
     *  
     *  Unicode high-surrogate code unit
     *  in the UTF-16 encoding, constant '\uDBFF'.
     */
    @stub
    val MAX_HIGH_SURROGATE: Char = ???

    /** The maximum value of a
     *  
     *  Unicode low-surrogate code unit
     *  in the UTF-16 encoding, constant '\uDFFF'.
     */
    @stub
    val MAX_LOW_SURROGATE: Char = ???

    /** The maximum radix available for conversion to and from strings. */
    @stub
    val MAX_RADIX: Int = ???

    /** The maximum value of a Unicode surrogate code unit in the
     *  UTF-16 encoding, constant '\uDFFF'.
     */
    @stub
    val MAX_SURROGATE: Char = ???

    /** The constant value of this field is the largest value of type
     *  char, '\uFFFF'.
     */
    @stub
    val MAX_VALUE: Char = ???

    /** The minimum value of a
     *  
     *  Unicode code point, constant U+0000.
     */
    @stub
    val MIN_CODE_POINT: Int = ???

    /** The minimum value of a
     *  
     *  Unicode high-surrogate code unit
     *  in the UTF-16 encoding, constant '\uD800'.
     */
    @stub
    val MIN_HIGH_SURROGATE: Char = ???

    /** The minimum value of a
     *  
     *  Unicode low-surrogate code unit
     *  in the UTF-16 encoding, constant '\uDC00'.
     */
    @stub
    val MIN_LOW_SURROGATE: Char = ???

    /** The minimum radix available for conversion to and from strings. */
    @stub
    val MIN_RADIX: Int = ???

    /** The minimum value of a
     *  
     *  Unicode supplementary code point, constant U+10000.
     */
    @stub
    val MIN_SUPPLEMENTARY_CODE_POINT: Int = ???

    /** The minimum value of a Unicode surrogate code unit in the
     *  UTF-16 encoding, constant '\uD800'.
     */
    @stub
    val MIN_SURROGATE: Char = ???

    /** The constant value of this field is the smallest value of type
     *  char, '\u0000'.
     */
    @stub
    val MIN_VALUE: Char = ???

    /** General category "Lm" in the Unicode specification. */
    @stub
    val MODIFIER_LETTER: Byte = ???

    /** General category "Sk" in the Unicode specification. */
    @stub
    val MODIFIER_SYMBOL: Byte = ???

    /** General category "Mn" in the Unicode specification. */
    @stub
    val NON_SPACING_MARK: Byte = ???

    /** General category "Lo" in the Unicode specification. */
    @stub
    val OTHER_LETTER: Byte = ???

    /** General category "No" in the Unicode specification. */
    @stub
    val OTHER_NUMBER: Byte = ???

    /** General category "Po" in the Unicode specification. */
    @stub
    val OTHER_PUNCTUATION: Byte = ???

    /** General category "So" in the Unicode specification. */
    @stub
    val OTHER_SYMBOL: Byte = ???

    /** General category "Zp" in the Unicode specification. */
    @stub
    val PARAGRAPH_SEPARATOR: Byte = ???

    /** General category "Co" in the Unicode specification. */
    @stub
    val PRIVATE_USE: Byte = ???

    /** The number of bits used to represent a char value in unsigned
     *  binary form, constant 16.
     */
    @stub
    val SIZE: Int = ???

    /** General category "Zs" in the Unicode specification. */
    @stub
    val SPACE_SEPARATOR: Byte = ???

    /** General category "Ps" in the Unicode specification. */
    @stub
    val START_PUNCTUATION: Byte = ???

    /** General category "Cs" in the Unicode specification. */
    @stub
    val SURROGATE: Byte = ???

    /** General category "Lt" in the Unicode specification. */
    @stub
    val TITLECASE_LETTER: Byte = ???

    /** The Class instance representing the primitive type
     *  char.
     */
    @stub
    val TYPE: Class[Character] = ???

    /** General category "Cn" in the Unicode specification. */
    @stub
    val UNASSIGNED: Byte = ???

    /** General category "Lu" in the Unicode specification. */
    @stub
    val UPPERCASE_LETTER: Byte = ???

    /** Determines the number of char values needed to
     *  represent the specified character (Unicode code point).
     */
    @stub
    def charCount(codePoint: Int): Int = ???

    /** Returns the code point at the given index of the
     *  char array.
     */
    @stub
    def codePointAt(a: Array[Char], index: Int): Int = ???

    /** Returns the code point at the given index of the
     *  char array, where only array elements with
     *  index less than limit can be used.
     */
    @stub
    def codePointAt(a: Array[Char], index: Int, limit: Int): Int = ???

    /** Returns the code point at the given index of the
     *  CharSequence.
     */
    @stub
    def codePointAt(seq: CharSequence, index: Int): Int = ???

    /** Returns the code point preceding the given index of the
     *  char array.
     */
    @stub
    def codePointBefore(a: Array[Char], index: Int): Int = ???

    /** Returns the code point preceding the given index of the
     *  char array, where only array elements with
     *  index greater than or equal to start
     *  can be used.
     */
    @stub
    def codePointBefore(a: Array[Char], index: Int, start: Int): Int = ???

    /** Returns the code point preceding the given index of the
     *  CharSequence.
     */
    @stub
    def codePointBefore(seq: CharSequence, index: Int): Int = ???

    /** Returns the number of Unicode code points in a subarray of the
     *  char array argument.
     */
    @stub
    def codePointCount(a: Array[Char], offset: Int, count: Int): Int = ???

    /** Returns the number of Unicode code points in the text range of
     *  the specified char sequence.
     */
    @stub
    def codePointCount(seq: CharSequence, beginIndex: Int, endIndex: Int): Int = ???

    /** Compares two char values numerically. */
    @stub
    def compare(x: Char, y: Char): Int = ???

    /** Returns the numeric value of the character ch in the
     *  specified radix.
     */
    @stub
    def digit(ch: Char, radix: Int): Int = ???

    /** Returns the numeric value of the specified character (Unicode
     *  code point) in the specified radix.
     */
    @stub
    def digit(codePoint: Int, radix: Int): Int = ???

    /** Determines the character representation for a specific digit in
     *  the specified radix.
     */
    @stub
    def forDigit(digit: Int, radix: Int): Char = ???

    /** Returns the Unicode directionality property for the given
     *  character.
     */
    @stub
    def getDirectionality(ch: Char): Byte = ???

    /** Returns the Unicode directionality property for the given
     *  character (Unicode code point).
     */
    @stub
    def getDirectionality(codePoint: Int): Byte = ???

    /** Returns the Unicode name of the specified character
     *  codePoint, or null if the code point is
     *  unassigned.
     */
    @stub
    def getName(codePoint: Int): String = ???

    /** Returns the int value that the specified Unicode
     *  character represents.
     */
    @stub
    def getNumericValue(ch: Char): Int = ???

    /** Returns the int value that the specified
     *  character (Unicode code point) represents.
     */
    @stub
    def getNumericValue(codePoint: Int): Int = ???

    /** Returns a value indicating a character's general category. */
    @stub
    def getType(ch: Char): Int = ???

    /** Returns a value indicating a character's general category. */
    @stub
    def getType(codePoint: Int): Int = ???

    /** Returns a hash code for a char value; compatible with
     *  Character.hashCode().
     */
    @stub
    def hashCode(value: Char): Int = ???

    /** Returns the leading surrogate (a
     *  
     *  high surrogate code unit) of the
     *  
     *  surrogate pair
     *  representing the specified supplementary character (Unicode
     *  code point) in the UTF-16 encoding.
     */
    @stub
    def highSurrogate(codePoint: Int): Char = ???

    /** Determines if the specified character (Unicode code point) is an alphabet. */
    @stub
    def isAlphabetic(codePoint: Int): Boolean = ???

    /** Determines whether the specified character (Unicode code point)
     *  is in the Basic Multilingual Plane (BMP).
     */
    @stub
    def isBmpCodePoint(codePoint: Int): Boolean = ???

    /** Determines if a character is defined in Unicode. */
    @stub
    def isDefined(ch: Char): Boolean = ???

    /** Determines if a character (Unicode code point) is defined in Unicode. */
    @stub
    def isDefined(codePoint: Int): Boolean = ???

    /** Determines if the specified character is a digit. */
    @stub
    def isDigit(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) is a digit. */
    @stub
    def isDigit(codePoint: Int): Boolean = ???

    /** Determines if the given char value is a
     *  
     *  Unicode high-surrogate code unit
     *  (also known as leading-surrogate code unit).
     */
    @stub
    def isHighSurrogate(ch: Char): Boolean = ???

    /** Determines if the specified character should be regarded as
     *  an ignorable character in a Java identifier or a Unicode identifier.
     */
    @stub
    def isIdentifierIgnorable(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) should be regarded as
     *  an ignorable character in a Java identifier or a Unicode identifier.
     */
    @stub
    def isIdentifierIgnorable(codePoint: Int): Boolean = ???

    /** Determines if the specified character (Unicode code point) is a CJKV
     *  (Chinese, Japanese, Korean and Vietnamese) ideograph, as defined by
     *  the Unicode Standard.
     */
    @stub
    def isIdeographic(codePoint: Int): Boolean = ???

    /** Determines if the specified character is an ISO control
     *  character.
     */
    @stub
    def isISOControl(ch: Char): Boolean = ???

    /** Determines if the referenced character (Unicode code point) is an ISO control
     *  character.
     */
    @stub
    def isISOControl(codePoint: Int): Boolean = ???

    /** Determines if the specified character may be part of a Java
     *  identifier as other than the first character.
     */
    @stub
    def isJavaIdentifierPart(ch: Char): Boolean = ???

    /** Determines if the character (Unicode code point) may be part of a Java
     *  identifier as other than the first character.
     */
    @stub
    def isJavaIdentifierPart(codePoint: Int): Boolean = ???

    /** Determines if the specified character is
     *  permissible as the first character in a Java identifier.
     */
    @stub
    def isJavaIdentifierStart(ch: Char): Boolean = ???

    /** Determines if the character (Unicode code point) is
     *  permissible as the first character in a Java identifier.
     */
    @stub
    def isJavaIdentifierStart(codePoint: Int): Boolean = ???

    /** Deprecated. 
     * Replaced by isJavaIdentifierStart(char).
     * 
     */
    @stub
    def isJavaLetter(ch: Char): Boolean = ???

    /** Deprecated. 
     * Replaced by isJavaIdentifierPart(char).
     * 
     */
    @stub
    def isJavaLetterOrDigit(ch: Char): Boolean = ???

    /** Determines if the specified character is a letter. */
    @stub
    def isLetter(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) is a letter. */
    @stub
    def isLetter(codePoint: Int): Boolean = ???

    /** Determines if the specified character is a letter or digit. */
    @stub
    def isLetterOrDigit(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) is a letter or digit. */
    @stub
    def isLetterOrDigit(codePoint: Int): Boolean = ???

    /** Determines if the specified character is a lowercase character. */
    @stub
    def isLowerCase(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) is a
     *  lowercase character.
     */
    @stub
    def isLowerCase(codePoint: Int): Boolean = ???

    /** Determines if the given char value is a
     *  
     *  Unicode low-surrogate code unit
     *  (also known as trailing-surrogate code unit).
     */
    @stub
    def isLowSurrogate(ch: Char): Boolean = ???

    /** Determines whether the character is mirrored according to the
     *  Unicode specification.
     */
    @stub
    def isMirrored(ch: Char): Boolean = ???

    /** Determines whether the specified character (Unicode code point)
     *  is mirrored according to the Unicode specification.
     */
    @stub
    def isMirrored(codePoint: Int): Boolean = ???

    /** Deprecated. 
     * Replaced by isWhitespace(char).
     * 
     */
    @stub
    def isSpace(ch: Char): Boolean = ???

    /** Determines if the specified character is a Unicode space character. */
    @stub
    def isSpaceChar(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) is a
     *  Unicode space character.
     */
    @stub
    def isSpaceChar(codePoint: Int): Boolean = ???

    /** Determines whether the specified character (Unicode code point)
     *  is in the supplementary character range.
     */
    @stub
    def isSupplementaryCodePoint(codePoint: Int): Boolean = ???

    /** Determines if the given char value is a Unicode
     *  surrogate code unit.
     */
    @stub
    def isSurrogate(ch: Char): Boolean = ???

    /** Determines whether the specified pair of char
     *  values is a valid
     *  
     *  Unicode surrogate pair.
     */
    @stub
    def isSurrogatePair(high: Char, low: Char): Boolean = ???

    /** Determines if the specified character is a titlecase character. */
    @stub
    def isTitleCase(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) is a titlecase character. */
    @stub
    def isTitleCase(codePoint: Int): Boolean = ???

    /** Determines if the specified character may be part of a Unicode
     *  identifier as other than the first character.
     */
    @stub
    def isUnicodeIdentifierPart(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) may be part of a Unicode
     *  identifier as other than the first character.
     */
    @stub
    def isUnicodeIdentifierPart(codePoint: Int): Boolean = ???

    /** Determines if the specified character is permissible as the
     *  first character in a Unicode identifier.
     */
    @stub
    def isUnicodeIdentifierStart(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) is permissible as the
     *  first character in a Unicode identifier.
     */
    @stub
    def isUnicodeIdentifierStart(codePoint: Int): Boolean = ???

    /** Determines if the specified character is an uppercase character. */
    @stub
    def isUpperCase(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) is an uppercase character. */
    @stub
    def isUpperCase(codePoint: Int): Boolean = ???

    /** Determines whether the specified code point is a valid
     *  
     *  Unicode code point value.
     */
    @stub
    def isValidCodePoint(codePoint: Int): Boolean = ???

    /** Determines if the specified character is white space according to Java. */
    @stub
    def isWhitespace(ch: Char): Boolean = ???

    /** Determines if the specified character (Unicode code point) is
     *  white space according to Java.
     */
    @stub
    def isWhitespace(codePoint: Int): Boolean = ???

    /** Returns the trailing surrogate (a
     *  
     *  low surrogate code unit) of the
     *  
     *  surrogate pair
     *  representing the specified supplementary character (Unicode
     *  code point) in the UTF-16 encoding.
     */
    @stub
    def lowSurrogate(codePoint: Int): Char = ???

    /** Returns the index within the given char subarray
     *  that is offset from the given index by
     *  codePointOffset code points.
     */
    @stub
    def offsetByCodePoints(a: Array[Char], start: Int, count: Int, index: Int, codePointOffset: Int): Int = ???

    /** Returns the index within the given char sequence that is offset
     *  from the given index by codePointOffset
     *  code points.
     */
    @stub
    def offsetByCodePoints(seq: CharSequence, index: Int, codePointOffset: Int): Int = ???

    /** Returns the value obtained by reversing the order of the bytes in the
     *  specified char value.
     */
    @stub
    def reverseBytes(ch: Char): Char = ???

    /** Converts the specified character (Unicode code point) to its
     *  UTF-16 representation stored in a char array.
     */
    @stub
    def toChars(codePoint: Int): Array[Char] = ???

    /** Converts the specified character (Unicode code point) to its
     *  UTF-16 representation.
     */
    @stub
    def toChars(codePoint: Int, dst: Array[Char], dstIndex: Int): Int = ???

    /** Converts the specified surrogate pair to its supplementary code
     *  point value.
     */
    @stub
    def toCodePoint(high: Char, low: Char): Int = ???

    /** Converts the character argument to lowercase using case
     *  mapping information from the UnicodeData file.
     */
    @stub
    def toLowerCase(ch: Char): Char = ???

    /** Converts the character (Unicode code point) argument to
     *  lowercase using case mapping information from the UnicodeData
     *  file.
     */
    @stub
    def toLowerCase(codePoint: Int): Int = ???

    /** Returns a String object representing the
     *  specified char.
     */
    @stub
    def toString(c: Char): String = ???

    /** Converts the character argument to titlecase using case mapping
     *  information from the UnicodeData file.
     */
    @stub
    def toTitleCase(ch: Char): Char = ???

    /** Converts the character (Unicode code point) argument to titlecase using case mapping
     *  information from the UnicodeData file.
     */
    @stub
    def toTitleCase(codePoint: Int): Int = ???

    /** Converts the character argument to uppercase using case mapping
     *  information from the UnicodeData file.
     */
    @stub
    def toUpperCase(ch: Char): Char = ???

    /** Converts the character (Unicode code point) argument to
     *  uppercase using case mapping information from the UnicodeData
     *  file.
     */
    @stub
    def toUpperCase(codePoint: Int): Int = ???

    /** Returns a Character instance representing the specified
     *  char value.
     */
    @stub
    def valueOf(c: Char): Character = ???
}
