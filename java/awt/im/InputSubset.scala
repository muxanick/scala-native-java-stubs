package java.awt.im

import java.lang.{Character.Subset, Object}

/** Defines additional Unicode subsets for use by input methods.  Unlike the
 *  UnicodeBlock subsets defined in the Character.UnicodeBlock class, these constants do not
 *  directly correspond to Unicode code blocks.
 */
final class InputSubset extends Character.Subset {
}

object InputSubset {
    /** Constant for the fullwidth digits included in the Unicode halfwidth and
     *  fullwidth forms character block.
     */
    @stub
    val FULLWIDTH_DIGITS: InputSubset = ???

    /** Constant for the fullwidth ASCII variants subset of the Unicode halfwidth and
     *  fullwidth forms character block.
     */
    @stub
    val FULLWIDTH_LATIN: InputSubset = ???

    /** Constant for the halfwidth katakana subset of the Unicode halfwidth and
     *  fullwidth forms character block.
     */
    @stub
    val HALFWIDTH_KATAKANA: InputSubset = ???

    /** Constant for all Han characters used in writing Korean, including a
     *  subset of the CJK unified ideographs as well as Korean Han characters
     *  that may be defined as surrogate characters.
     */
    @stub
    val HANJA: InputSubset = ???

    /** Constant for all Han characters used in writing Japanese, including a
     *  subset of the CJK unified ideographs as well as Japanese Han characters
     *  that may be defined as surrogate characters.
     */
    @stub
    val KANJI: InputSubset = ???

    /** Constant for all Latin characters, including the characters
     *  in the BASIC_LATIN, LATIN_1_SUPPLEMENT, LATIN_EXTENDED_A,
     *  LATIN_EXTENDED_B Unicode character blocks.
     */
    @stub
    val LATIN: InputSubset = ???

    /** Constant for the digits included in the BASIC_LATIN Unicode character
     *  block.
     */
    @stub
    val LATIN_DIGITS: InputSubset = ???

    /** Constant for all Han characters used in writing Simplified Chinese,
     *  including a subset of the CJK unified ideographs as well as Simplified
     *  Chinese Han characters that may be defined as surrogate characters.
     */
    @stub
    val SIMPLIFIED_HANZI: InputSubset = ???
}
