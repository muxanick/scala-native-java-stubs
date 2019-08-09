package java.awt.font

import java.lang.{Enum, Object, String}

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
class NumericShaper.Range private (name: String, ordinal: Int) extends Enum[NumericShaper.Range](name, ordinal) {
}

object NumericShaper.Range {
    /** The Arabic range with the Arabic-Indic digits. */
    final val ARABIC = new NumericShaper.Range(ARABIC, 0)

    /** The Balinese range with the Balinese digits. */
    final val BALINESE = new NumericShaper.Range(BALINESE, 1)

    /** The Bengali range with the Bengali digits. */
    final val BENGALI = new NumericShaper.Range(BENGALI, 2)

    /** The Cham range with the Cham digits. */
    final val CHAM = new NumericShaper.Range(CHAM, 3)

    /** The Devanagari range with the Devanagari digits. */
    final val DEVANAGARI = new NumericShaper.Range(DEVANAGARI, 4)

    /** The Arabic range with the Eastern Arabic-Indic digits. */
    final val EASTERN_ARABIC = new NumericShaper.Range(EASTERN_ARABIC, 5)

    /** The Ethiopic range with the Ethiopic digits. */
    final val ETHIOPIC = new NumericShaper.Range(ETHIOPIC, 6)

    /** The Latin (European) range with the Latin (ASCII) digits. */
    final val EUROPEAN = new NumericShaper.Range(EUROPEAN, 7)

    /** The Gujarati range with the Gujarati digits. */
    final val GUJARATI = new NumericShaper.Range(GUJARATI, 8)

    /** The Gurmukhi range with the Gurmukhi digits. */
    final val GURMUKHI = new NumericShaper.Range(GURMUKHI, 9)

    /** The Javanese range with the Javanese digits. */
    final val JAVANESE = new NumericShaper.Range(JAVANESE, 10)

    /** The Kannada range with the Kannada digits. */
    final val KANNADA = new NumericShaper.Range(KANNADA, 11)

    /** The Kayah Li range with the Kayah Li digits. */
    final val KAYAH_LI = new NumericShaper.Range(KAYAH_LI, 12)

    /** The Khmer range with the Khmer digits. */
    final val KHMER = new NumericShaper.Range(KHMER, 13)

    /** The Lao range with the Lao digits. */
    final val LAO = new NumericShaper.Range(LAO, 14)

    /** The Lepcha range with the Lepcha digits. */
    final val LEPCHA = new NumericShaper.Range(LEPCHA, 15)

    /** The Limbu range with the Limbu digits. */
    final val LIMBU = new NumericShaper.Range(LIMBU, 16)

    /** The Malayalam range with the Malayalam digits. */
    final val MALAYALAM = new NumericShaper.Range(MALAYALAM, 17)

    /** The Meetei Mayek range with the Meetei Mayek digits. */
    final val MEETEI_MAYEK = new NumericShaper.Range(MEETEI_MAYEK, 18)

    /** The Mongolian range with the Mongolian digits. */
    final val MONGOLIAN = new NumericShaper.Range(MONGOLIAN, 19)

    /** The Myanmar range with the Myanmar digits. */
    final val MYANMAR = new NumericShaper.Range(MYANMAR, 20)

    /** The Myanmar range with the Myanmar Shan digits. */
    final val MYANMAR_SHAN = new NumericShaper.Range(MYANMAR_SHAN, 21)

    /** The New Tai Lue range with the New Tai Lue digits. */
    final val NEW_TAI_LUE = new NumericShaper.Range(NEW_TAI_LUE, 22)

    /** The N'Ko range with the N'Ko digits. */
    final val NKO = new NumericShaper.Range(NKO, 23)

    /** The Ol Chiki range with the Ol Chiki digits. */
    final val OL_CHIKI = new NumericShaper.Range(OL_CHIKI, 24)

    /** The Oriya range with the Oriya digits. */
    final val ORIYA = new NumericShaper.Range(ORIYA, 25)

    /** The Saurashtra range with the Saurashtra digits. */
    final val SAURASHTRA = new NumericShaper.Range(SAURASHTRA, 26)

    /** The Sundanese range with the Sundanese digits. */
    final val SUNDANESE = new NumericShaper.Range(SUNDANESE, 27)

    /** The Tai Tham Hora range with the Tai Tham Hora digits. */
    final val TAI_THAM_HORA = new NumericShaper.Range(TAI_THAM_HORA, 28)

    /** The Tai Tham Tham range with the Tai Tham Tham digits. */
    final val TAI_THAM_THAM = new NumericShaper.Range(TAI_THAM_THAM, 29)

    /** The Tamil range with the Tamil digits. */
    final val TAMIL = new NumericShaper.Range(TAMIL, 30)

    /** The Telugu range with the Telugu digits. */
    final val TELUGU = new NumericShaper.Range(TELUGU, 31)

    /** The Thai range with the Thai digits. */
    final val THAI = new NumericShaper.Range(THAI, 32)

    /** The Tibetan range with the Tibetan digits. */
    final val TIBETAN = new NumericShaper.Range(TIBETAN, 33)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): NumericShaper.Range = ???
}
