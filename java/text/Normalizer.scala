package java.text

import java.lang.{CharSequence, Enum, Object, String}
import scala.scalanative.annotation.stub

/** This class provides the method normalize which transforms Unicode
 *  text into an equivalent composed or decomposed form, allowing for easier
 *  sorting and searching of text.
 *  The normalize method supports the standard normalization forms
 *  described in
 *  
 *  Unicode Standard Annex #15 — Unicode Normalization Forms.
 *  
 *  Characters with accents or other adornments can be encoded in
 *  several different ways in Unicode.  For example, take the character A-acute.
 *  In Unicode, this can be encoded as a single character (the "composed" form):
 * 
 *  
 *       U+00C1    LATIN CAPITAL LETTER A WITH ACUTE
 * 
 *  or as two separate characters (the "decomposed" form):
 * 
 *  
 *       U+0041    LATIN CAPITAL LETTER A
 *       U+0301    COMBINING ACUTE ACCENT
 * 
 *  To a user of your program, however, both of these sequences should be
 *  treated as the same "user-level" character "A with acute accent".  When you
 *  are searching or comparing text, you must ensure that these two sequences are
 *  treated as equivalent.  In addition, you must handle characters with more than
 *  one accent. Sometimes the order of a character's combining accents is
 *  significant, while in other cases accent sequences in different orders are
 *  really equivalent.
 *  
 *  Similarly, the string "ffi" can be encoded as three separate letters:
 * 
 *  
 *       U+0066    LATIN SMALL LETTER F
 *       U+0066    LATIN SMALL LETTER F
 *       U+0069    LATIN SMALL LETTER I
 * 
 *  or as the single character
 * 
 *  
 *       U+FB03    LATIN SMALL LIGATURE FFI
 * 
 *  The ffi ligature is not a distinct semantic character, and strictly speaking
 *  it shouldn't be in Unicode at all, but it was included for compatibility
 *  with existing character sets that already provided it.  The Unicode standard
 *  identifies such characters by giving them "compatibility" decompositions
 *  into the corresponding semantic characters.  When sorting and searching, you
 *  will often want to use these mappings.
 *  
 *  The normalize method helps solve these problems by transforming
 *  text into the canonical composed and decomposed forms as shown in the first
 *  example above. In addition, you can have it perform compatibility
 *  decompositions so that you can treat compatibility characters the same as
 *  their equivalents.
 *  Finally, the normalize method rearranges accents into the
 *  proper canonical order, so that you do not have to worry about accent
 *  rearrangement on your own.
 *  
 *  The W3C generally recommends to exchange texts in NFC.
 *  Note also that most legacy character encodings use only precomposed forms and
 *  often do not encode any combining marks by themselves. For conversion to such
 *  character encodings the Unicode text needs to be normalized to NFC.
 *  For more usage examples, see the Unicode Standard Annex.
 */
final class Normalizer extends Object {
}

object Normalizer {
    /** This enum provides constants of the four Unicode normalization forms
     *  that are described in
     *  
     *  Unicode Standard Annex #15 — Unicode Normalization Forms
     *  and two methods to access them.
     */
    class Form private (name: String, ordinal: Int) extends Enum[Form](name, ordinal) {
    }

    object Form {
        /** Canonical decomposition, followed by canonical composition. */
        final val NFC: Form = new Form("NFC", 0)

        /** Canonical decomposition. */
        final val NFD: Form = new Form("NFD", 1)

        /** Compatibility decomposition, followed by canonical composition. */
        final val NFKC: Form = new Form("NFKC", 2)

        /** Compatibility decomposition. */
        final val NFKD: Form = new Form("NFKD", 3)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): Form = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[Form] = ???
    }


    /** Determines if the given sequence of char values is normalized. */
    @stub
    def isNormalized(src: CharSequence, form: Normalizer.Form): Boolean = ???

    /** Normalize a sequence of char values. */
    @stub
    def normalize(src: CharSequence, form: Normalizer.Form): String = ???
}
