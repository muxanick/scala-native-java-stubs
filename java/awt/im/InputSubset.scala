package java.awt.im

import java.lang.{Character.Subset, Object}

// Defines additional Unicode subsets for use by input methods.  Unlike the
// UnicodeBlock subsets defined in the Character.UnicodeBlock class, these constants do not
// directly correspond to Unicode code blocks.
final class InputSubset extends Character.Subset {
}

object InputSubset {
    @stub
    // Constant for the fullwidth digits included in the Unicode halfwidth and
    // fullwidth forms character block.
    def FULLWIDTH_DIGITS: InputSubset = ???

    @stub
    // Constant for the fullwidth ASCII variants subset of the Unicode halfwidth and
    // fullwidth forms character block.
    def FULLWIDTH_LATIN: InputSubset = ???

    @stub
    // Constant for the halfwidth katakana subset of the Unicode halfwidth and
    // fullwidth forms character block.
    def HALFWIDTH_KATAKANA: InputSubset = ???

    @stub
    // Constant for all Han characters used in writing Korean, including a
    // subset of the CJK unified ideographs as well as Korean Han characters
    // that may be defined as surrogate characters.
    def HANJA: InputSubset = ???

    @stub
    // Constant for all Han characters used in writing Japanese, including a
    // subset of the CJK unified ideographs as well as Japanese Han characters
    // that may be defined as surrogate characters.
    def KANJI: InputSubset = ???

    @stub
    // Constant for all Latin characters, including the characters
    // in the BASIC_LATIN, LATIN_1_SUPPLEMENT, LATIN_EXTENDED_A,
    // LATIN_EXTENDED_B Unicode character blocks.
    def LATIN: InputSubset = ???

    @stub
    // Constant for the digits included in the BASIC_LATIN Unicode character
    // block.
    def LATIN_DIGITS: InputSubset = ???

    @stub
    // Constant for all Han characters used in writing Simplified Chinese,
    // including a subset of the CJK unified ideographs as well as Simplified
    // Chinese Han characters that may be defined as surrogate characters.
    def SIMPLIFIED_HANZI: InputSubset = ???
}
