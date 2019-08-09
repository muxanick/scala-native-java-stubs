package java.util

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class expresses a Language Range defined in
 *  RFC 4647 Matching of
 *  Language Tags. A language range is an identifier which is used to
 *  select language tag(s) meeting specific requirements by using the
 *  mechanisms described in Locale
 *  Matching. A list which represents a user's preferences and consists
 *  of language ranges is called a Language Priority List.
 * 
 *  There are two types of language ranges: basic and extended. In RFC
 *  4647, the syntax of language ranges is expressed in
 *  ABNF as follows:
 *  
 *  
 *      basic-language-range    = (1*8ALPHA *("-" 1*8alphanum)) / "*"
 *      extended-language-range = (1*8ALPHA / "*")
 *                                *("-" (1*8alphanum / "*"))
 *      alphanum                = ALPHA / DIGIT
 *  
 *  
 *  For example, "en" (English), "ja-JP" (Japanese, Japan),
 *  "*" (special language range which matches any language tag) are
 *  basic language ranges, whereas "*-CH" (any languages,
 *  Switzerland), "es-*" (Spanish, any regions), and
 *  "zh-Hant-*" (Traditional Chinese, any regions) are extended
 *  language ranges.
 */
final object Locale.LanguageRange extends Object {

    /** Constructs a LanguageRange using the given range. */
    @stub
    def LanguageRange(range: String) = ???

    /** Constructs a LanguageRange using the given range and
     *  weight.
     */
    @stub
    def LanguageRange(range: String, weight: Double) = ???

    /** A constant holding the maximum value of weight, 1.0, which indicates
     *  that the language range is a good fit for the user.
     */
    @stub
    val MAX_WEIGHT: Double = ???

    /** A constant holding the minimum value of weight, 0.0, which indicates
     *  that the language range is not a good fit for the user.
     */
    @stub
    val MIN_WEIGHT: Double = ???

    /** Compares this object to the specified object. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the language range of this LanguageRange. */
    @stub
    def getRange(): String = ???

    /** Returns the weight of this LanguageRange. */
    @stub
    def getWeight(): Double = ???

    /** Returns a hash code value for the object. */
    @stub
    def hashCode(): Int = ???

    /** Generates a new customized Language Priority List using the given
     *  priorityList and map.
     */
    @stub
    def mapEquivalents(priorityList: List[Locale.LanguageRange], map: Map[String, List[String]]): List[Locale.LanguageRange] = ???

    /** Parses the given ranges to generate a Language Priority List. */
    @stub
    def parse(ranges: String): List[Locale.LanguageRange] = ???

    /** Parses the given ranges to generate a Language Priority
     *  List, and then customizes the list using the given map.
     */
    @stub
    def parse(ranges: String, map: Map[String, List[String]]): List[Locale.LanguageRange] = ???
}
