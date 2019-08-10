package java.lang

import scala.scalanative.annotation.stub

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
class Character_UnicodeScript private (name: String, ordinal: Int) extends Enum[Character.UnicodeScript](name, ordinal) {
}

object Character_UnicodeScript {
    /** Unicode script "Arabic". */
    final val ARABIC = new Character.UnicodeScript(ARABIC, 0)

    /** Unicode script "Armenian". */
    final val ARMENIAN = new Character.UnicodeScript(ARMENIAN, 1)

    /** Unicode script "Avestan". */
    final val AVESTAN = new Character.UnicodeScript(AVESTAN, 2)

    /** Unicode script "Balinese". */
    final val BALINESE = new Character.UnicodeScript(BALINESE, 3)

    /** Unicode script "Bamum". */
    final val BAMUM = new Character.UnicodeScript(BAMUM, 4)

    /** Unicode script "Batak". */
    final val BATAK = new Character.UnicodeScript(BATAK, 5)

    /** Unicode script "Bengali". */
    final val BENGALI = new Character.UnicodeScript(BENGALI, 6)

    /** Unicode script "Bopomofo". */
    final val BOPOMOFO = new Character.UnicodeScript(BOPOMOFO, 7)

    /** Unicode script "Brahmi". */
    final val BRAHMI = new Character.UnicodeScript(BRAHMI, 8)

    /** Unicode script "Braille". */
    final val BRAILLE = new Character.UnicodeScript(BRAILLE, 9)

    /** Unicode script "Buginese". */
    final val BUGINESE = new Character.UnicodeScript(BUGINESE, 10)

    /** Unicode script "Buhid". */
    final val BUHID = new Character.UnicodeScript(BUHID, 11)

    /** Unicode script "Canadian_Aboriginal". */
    final val CANADIAN_ABORIGINAL = new Character.UnicodeScript(CANADIAN_ABORIGINAL, 12)

    /** Unicode script "Carian". */
    final val CARIAN = new Character.UnicodeScript(CARIAN, 13)

    /** Unicode script "Chakma". */
    final val CHAKMA = new Character.UnicodeScript(CHAKMA, 14)

    /** Unicode script "Cham". */
    final val CHAM = new Character.UnicodeScript(CHAM, 15)

    /** Unicode script "Cherokee". */
    final val CHEROKEE = new Character.UnicodeScript(CHEROKEE, 16)

    /** Unicode script "Common". */
    final val COMMON = new Character.UnicodeScript(COMMON, 17)

    /** Unicode script "Coptic". */
    final val COPTIC = new Character.UnicodeScript(COPTIC, 18)

    /** Unicode script "Cuneiform". */
    final val CUNEIFORM = new Character.UnicodeScript(CUNEIFORM, 19)

    /** Unicode script "Cypriot". */
    final val CYPRIOT = new Character.UnicodeScript(CYPRIOT, 20)

    /** Unicode script "Cyrillic". */
    final val CYRILLIC = new Character.UnicodeScript(CYRILLIC, 21)

    /** Unicode script "Deseret". */
    final val DESERET = new Character.UnicodeScript(DESERET, 22)

    /** Unicode script "Devanagari". */
    final val DEVANAGARI = new Character.UnicodeScript(DEVANAGARI, 23)

    /** Unicode script "Egyptian_Hieroglyphs". */
    final val EGYPTIAN_HIEROGLYPHS = new Character.UnicodeScript(EGYPTIAN_HIEROGLYPHS, 24)

    /** Unicode script "Ethiopic". */
    final val ETHIOPIC = new Character.UnicodeScript(ETHIOPIC, 25)

    /** Unicode script "Georgian". */
    final val GEORGIAN = new Character.UnicodeScript(GEORGIAN, 26)

    /** Unicode script "Glagolitic". */
    final val GLAGOLITIC = new Character.UnicodeScript(GLAGOLITIC, 27)

    /** Unicode script "Gothic". */
    final val GOTHIC = new Character.UnicodeScript(GOTHIC, 28)

    /** Unicode script "Greek". */
    final val GREEK = new Character.UnicodeScript(GREEK, 29)

    /** Unicode script "Gujarati". */
    final val GUJARATI = new Character.UnicodeScript(GUJARATI, 30)

    /** Unicode script "Gurmukhi". */
    final val GURMUKHI = new Character.UnicodeScript(GURMUKHI, 31)

    /** Unicode script "Han". */
    final val HAN = new Character.UnicodeScript(HAN, 32)

    /** Unicode script "Hangul". */
    final val HANGUL = new Character.UnicodeScript(HANGUL, 33)

    /** Unicode script "Hanunoo". */
    final val HANUNOO = new Character.UnicodeScript(HANUNOO, 34)

    /** Unicode script "Hebrew". */
    final val HEBREW = new Character.UnicodeScript(HEBREW, 35)

    /** Unicode script "Hiragana". */
    final val HIRAGANA = new Character.UnicodeScript(HIRAGANA, 36)

    /** Unicode script "Imperial_Aramaic". */
    final val IMPERIAL_ARAMAIC = new Character.UnicodeScript(IMPERIAL_ARAMAIC, 37)

    /** Unicode script "Inherited". */
    final val INHERITED = new Character.UnicodeScript(INHERITED, 38)

    /** Unicode script "Inscriptional_Pahlavi". */
    final val INSCRIPTIONAL_PAHLAVI = new Character.UnicodeScript(INSCRIPTIONAL_PAHLAVI, 39)

    /** Unicode script "Inscriptional_Parthian". */
    final val INSCRIPTIONAL_PARTHIAN = new Character.UnicodeScript(INSCRIPTIONAL_PARTHIAN, 40)

    /** Unicode script "Javanese". */
    final val JAVANESE = new Character.UnicodeScript(JAVANESE, 41)

    /** Unicode script "Kaithi". */
    final val KAITHI = new Character.UnicodeScript(KAITHI, 42)

    /** Unicode script "Kannada". */
    final val KANNADA = new Character.UnicodeScript(KANNADA, 43)

    /** Unicode script "Katakana". */
    final val KATAKANA = new Character.UnicodeScript(KATAKANA, 44)

    /** Unicode script "Kayah_Li". */
    final val KAYAH_LI = new Character.UnicodeScript(KAYAH_LI, 45)

    /** Unicode script "Kharoshthi". */
    final val KHAROSHTHI = new Character.UnicodeScript(KHAROSHTHI, 46)

    /** Unicode script "Khmer". */
    final val KHMER = new Character.UnicodeScript(KHMER, 47)

    /** Unicode script "Lao". */
    final val LAO = new Character.UnicodeScript(LAO, 48)

    /** Unicode script "Latin". */
    final val LATIN = new Character.UnicodeScript(LATIN, 49)

    /** Unicode script "Lepcha". */
    final val LEPCHA = new Character.UnicodeScript(LEPCHA, 50)

    /** Unicode script "Limbu". */
    final val LIMBU = new Character.UnicodeScript(LIMBU, 51)

    /** Unicode script "Linear_B". */
    final val LINEAR_B = new Character.UnicodeScript(LINEAR_B, 52)

    /** Unicode script "Lisu". */
    final val LISU = new Character.UnicodeScript(LISU, 53)

    /** Unicode script "Lycian". */
    final val LYCIAN = new Character.UnicodeScript(LYCIAN, 54)

    /** Unicode script "Lydian". */
    final val LYDIAN = new Character.UnicodeScript(LYDIAN, 55)

    /** Unicode script "Malayalam". */
    final val MALAYALAM = new Character.UnicodeScript(MALAYALAM, 56)

    /** Unicode script "Mandaic". */
    final val MANDAIC = new Character.UnicodeScript(MANDAIC, 57)

    /** Unicode script "Meetei_Mayek". */
    final val MEETEI_MAYEK = new Character.UnicodeScript(MEETEI_MAYEK, 58)

    /** Unicode script "Meroitic Cursive". */
    final val MEROITIC_CURSIVE = new Character.UnicodeScript(MEROITIC_CURSIVE, 59)

    /** Unicode script "Meroitic Hieroglyphs". */
    final val MEROITIC_HIEROGLYPHS = new Character.UnicodeScript(MEROITIC_HIEROGLYPHS, 60)

    /** Unicode script "Miao". */
    final val MIAO = new Character.UnicodeScript(MIAO, 61)

    /** Unicode script "Mongolian". */
    final val MONGOLIAN = new Character.UnicodeScript(MONGOLIAN, 62)

    /** Unicode script "Myanmar". */
    final val MYANMAR = new Character.UnicodeScript(MYANMAR, 63)

    /** Unicode script "New_Tai_Lue". */
    final val NEW_TAI_LUE = new Character.UnicodeScript(NEW_TAI_LUE, 64)

    /** Unicode script "Nko". */
    final val NKO = new Character.UnicodeScript(NKO, 65)

    /** Unicode script "Ogham". */
    final val OGHAM = new Character.UnicodeScript(OGHAM, 66)

    /** Unicode script "Ol_Chiki". */
    final val OL_CHIKI = new Character.UnicodeScript(OL_CHIKI, 67)

    /** Unicode script "Old_Italic". */
    final val OLD_ITALIC = new Character.UnicodeScript(OLD_ITALIC, 68)

    /** Unicode script "Old_Persian". */
    final val OLD_PERSIAN = new Character.UnicodeScript(OLD_PERSIAN, 69)

    /** Unicode script "Old_South_Arabian". */
    final val OLD_SOUTH_ARABIAN = new Character.UnicodeScript(OLD_SOUTH_ARABIAN, 70)

    /** Unicode script "Old_Turkic". */
    final val OLD_TURKIC = new Character.UnicodeScript(OLD_TURKIC, 71)

    /** Unicode script "Oriya". */
    final val ORIYA = new Character.UnicodeScript(ORIYA, 72)

    /** Unicode script "Osmanya". */
    final val OSMANYA = new Character.UnicodeScript(OSMANYA, 73)

    /** Unicode script "Phags_Pa". */
    final val PHAGS_PA = new Character.UnicodeScript(PHAGS_PA, 74)

    /** Unicode script "Phoenician". */
    final val PHOENICIAN = new Character.UnicodeScript(PHOENICIAN, 75)

    /** Unicode script "Rejang". */
    final val REJANG = new Character.UnicodeScript(REJANG, 76)

    /** Unicode script "Runic". */
    final val RUNIC = new Character.UnicodeScript(RUNIC, 77)

    /** Unicode script "Samaritan". */
    final val SAMARITAN = new Character.UnicodeScript(SAMARITAN, 78)

    /** Unicode script "Saurashtra". */
    final val SAURASHTRA = new Character.UnicodeScript(SAURASHTRA, 79)

    /** Unicode script "Sharada". */
    final val SHARADA = new Character.UnicodeScript(SHARADA, 80)

    /** Unicode script "Shavian". */
    final val SHAVIAN = new Character.UnicodeScript(SHAVIAN, 81)

    /** Unicode script "Sinhala". */
    final val SINHALA = new Character.UnicodeScript(SINHALA, 82)

    /** Unicode script "Sora Sompeng". */
    final val SORA_SOMPENG = new Character.UnicodeScript(SORA_SOMPENG, 83)

    /** Unicode script "Sundanese". */
    final val SUNDANESE = new Character.UnicodeScript(SUNDANESE, 84)

    /** Unicode script "Syloti_Nagri". */
    final val SYLOTI_NAGRI = new Character.UnicodeScript(SYLOTI_NAGRI, 85)

    /** Unicode script "Syriac". */
    final val SYRIAC = new Character.UnicodeScript(SYRIAC, 86)

    /** Unicode script "Tagalog". */
    final val TAGALOG = new Character.UnicodeScript(TAGALOG, 87)

    /** Unicode script "Tagbanwa". */
    final val TAGBANWA = new Character.UnicodeScript(TAGBANWA, 88)

    /** Unicode script "Tai_Le". */
    final val TAI_LE = new Character.UnicodeScript(TAI_LE, 89)

    /** Unicode script "Tai_Tham". */
    final val TAI_THAM = new Character.UnicodeScript(TAI_THAM, 90)

    /** Unicode script "Tai_Viet". */
    final val TAI_VIET = new Character.UnicodeScript(TAI_VIET, 91)

    /** Unicode script "Takri". */
    final val TAKRI = new Character.UnicodeScript(TAKRI, 92)

    /** Unicode script "Tamil". */
    final val TAMIL = new Character.UnicodeScript(TAMIL, 93)

    /** Unicode script "Telugu". */
    final val TELUGU = new Character.UnicodeScript(TELUGU, 94)

    /** Unicode script "Thaana". */
    final val THAANA = new Character.UnicodeScript(THAANA, 95)

    /** Unicode script "Thai". */
    final val THAI = new Character.UnicodeScript(THAI, 96)

    /** Unicode script "Tibetan". */
    final val TIBETAN = new Character.UnicodeScript(TIBETAN, 97)

    /** Unicode script "Tifinagh". */
    final val TIFINAGH = new Character.UnicodeScript(TIFINAGH, 98)

    /** Unicode script "Ugaritic". */
    final val UGARITIC = new Character.UnicodeScript(UGARITIC, 99)

    /** Unicode script "Unknown". */
    final val UNKNOWN = new Character.UnicodeScript(UNKNOWN, 100)

    /** Unicode script "Vai". */
    final val VAI = new Character.UnicodeScript(VAI, 101)

    /** Unicode script "Yi". */
    final val YI = new Character.UnicodeScript(YI, 102)

    /** Returns the UnicodeScript constant with the given Unicode script
     *  name or the script name alias.
     */
    @stub
    def forName(scriptName: String): Character.UnicodeScript = ???

    /** Returns the enum constant representing the Unicode script of which
     *  the given character (Unicode code point) is assigned to.
     */
    @stub
    def of(codePoint: Int): Character.UnicodeScript = ???

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): Character.UnicodeScript = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[Character.UnicodeScript] = ???
}
