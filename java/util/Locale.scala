package java.util

import java.io.Serializable
import java.lang.{Character, Cloneable, Object, String}
import scala.scalanative.annotation.stub

/** A Locale object represents a specific geographical, political,
 *  or cultural region. An operation that requires a Locale to perform
 *  its task is called locale-sensitive and uses the Locale
 *  to tailor information for the user. For example, displaying a number
 *  is a locale-sensitive operation— the number should be formatted
 *  according to the customs and conventions of the user's native country,
 *  region, or culture.
 * 
 *   The Locale class implements IETF BCP 47 which is composed of
 *  RFC 4647 "Matching of Language
 *  Tags" and RFC 5646 "Tags
 *  for Identifying Languages" with support for the LDML (UTS#35, "Unicode
 *  Locale Data Markup Language") BCP 47-compatible extensions for locale data
 *  exchange.
 * 
 *   A Locale object logically consists of the fields
 *  described below.
 * 
 *  
 *    language
 * 
 *    ISO 639 alpha-2 or alpha-3 language code, or registered
 *    language subtags up to 8 alpha letters (for future enhancements).
 *    When a language has both an alpha-2 code and an alpha-3 code, the
 *    alpha-2 code must be used.  You can find a full list of valid
 *    language codes in the IANA Language Subtag Registry (search for
 *    "Type: language").  The language field is case insensitive, but
 *    Locale always canonicalizes to lower case.
 * 
 *    Well-formed language values have the form
 *    [a-zA-Z]{2,8}.  Note that this is not the the full
 *    BCP47 language production, since it excludes extlang.  They are
 *    not needed since modern three-letter language codes replace
 *    them.
 * 
 *    Example: "en" (English), "ja" (Japanese), "kok" (Konkani)
 * 
 *    script
 * 
 *    ISO 15924 alpha-4 script code.  You can find a full list of
 *    valid script codes in the IANA Language Subtag Registry (search
 *    for "Type: script").  The script field is case insensitive, but
 *    Locale always canonicalizes to title case (the first
 *    letter is upper case and the rest of the letters are lower
 *    case).
 * 
 *    Well-formed script values have the form
 *    [a-zA-Z]{4}
 * 
 *    Example: "Latn" (Latin), "Cyrl" (Cyrillic)
 * 
 *    country (region)
 * 
 *    ISO 3166 alpha-2 country code or UN M.49 numeric-3 area code.
 *    You can find a full list of valid country and region codes in the
 *    IANA Language Subtag Registry (search for "Type: region").  The
 *    country (region) field is case insensitive, but
 *    Locale always canonicalizes to upper case.
 * 
 *    Well-formed country/region values have
 *    the form [a-zA-Z]{2} | [0-9]{3}
 * 
 *    Example: "US" (United States), "FR" (France), "029"
 *    (Caribbean)
 * 
 *    variant
 * 
 *    Any arbitrary value used to indicate a variation of a
 *    Locale.  Where there are two or more variant values
 *    each indicating its own semantics, these values should be ordered
 *    by importance, with most important first, separated by
 *    underscore('_').  The variant field is case sensitive.
 * 
 *    Note: IETF BCP 47 places syntactic restrictions on variant
 *    subtags.  Also BCP 47 subtags are strictly used to indicate
 *    additional variations that define a language or its dialects that
 *    are not covered by any combinations of language, script and
 *    region subtags.  You can find a full list of valid variant codes
 *    in the IANA Language Subtag Registry (search for "Type: variant").
 * 
 *    However, the variant field in Locale has
 *    historically been used for any kind of variation, not just
 *    language variations.  For example, some supported variants
 *    available in Java SE Runtime Environments indicate alternative
 *    cultural behaviors such as calendar type or number script.  In
 *    BCP 47 this kind of information, which does not identify the
 *    language, is supported by extension subtags or private use
 *    subtags.
 * 
 *    Well-formed variant values have the form SUBTAG
 *    (('_'|'-') SUBTAG)* where SUBTAG =
 *    [0-9][0-9a-zA-Z]{3} | [0-9a-zA-Z]{5,8}. (Note: BCP 47 only
 *    uses hyphen ('-') as a delimiter, this is more lenient).
 * 
 *    Example: "polyton" (Polytonic Greek), "POSIX"
 * 
 *    extensions
 * 
 *    A map from single character keys to string values, indicating
 *    extensions apart from language identification.  The extensions in
 *    Locale implement the semantics and syntax of BCP 47
 *    extension subtags and private use subtags. The extensions are
 *    case insensitive, but Locale canonicalizes all
 *    extension keys and values to lower case. Note that extensions
 *    cannot have empty values.
 * 
 *    Well-formed keys are single characters from the set
 *    [0-9a-zA-Z].  Well-formed values have the form
 *    SUBTAG ('-' SUBTAG)* where for the key 'x'
 *    SUBTAG = [0-9a-zA-Z]{1,8} and for other keys
 *    SUBTAG = [0-9a-zA-Z]{2,8} (that is, 'x' allows
 *    single-character subtags).
 * 
 *    Example: key="u"/value="ca-japanese" (Japanese Calendar),
 *    key="x"/value="java-1-7"
 *  
 * 
 *  Note: Although BCP 47 requires field values to be registered
 *  in the IANA Language Subtag Registry, the Locale class
 *  does not provide any validation features.  The Builder
 *  only checks if an individual field satisfies the syntactic
 *  requirement (is well-formed), but does not validate the value
 *  itself.  See Locale.Builder for details.
 * 
 *  Unicode locale/language extension
 * 
 *  UTS#35, "Unicode Locale Data Markup Language" defines optional
 *  attributes and keywords to override or refine the default behavior
 *  associated with a locale.  A keyword is represented by a pair of
 *  key and type.  For example, "nu-thai" indicates that Thai local
 *  digits (value:"thai") should be used for formatting numbers
 *  (key:"nu").
 * 
 *  The keywords are mapped to a BCP 47 extension value using the
 *  extension key 'u' (UNICODE_LOCALE_EXTENSION).  The above
 *  example, "nu-thai", becomes the extension "u-nu-thai".code
 * 
 *  Thus, when a Locale object contains Unicode locale
 *  attributes and keywords,
 *  getExtension(UNICODE_LOCALE_EXTENSION) will return a
 *  String representing this information, for example, "nu-thai".  The
 *  Locale class also provides getUnicodeLocaleAttributes(), getUnicodeLocaleKeys(), and
 *  getUnicodeLocaleType(java.lang.String) which allow you to access Unicode
 *  locale attributes and key/type pairs directly.  When represented as
 *  a string, the Unicode Locale Extension lists attributes
 *  alphabetically, followed by key/type sequences with keys listed
 *  alphabetically (the order of subtags comprising a key's type is
 *  fixed when the type is defined)
 * 
 *  A well-formed locale key has the form
 *  [0-9a-zA-Z]{2}.  A well-formed locale type has the
 *  form "" | [0-9a-zA-Z]{3,8} ('-' [0-9a-zA-Z]{3,8})* (it
 *  can be empty, or a series of subtags 3-8 alphanums in length).  A
 *  well-formed locale attribute has the form
 *  [0-9a-zA-Z]{3,8} (it is a single subtag with the same
 *  form as a locale type subtag).
 * 
 *  The Unicode locale extension specifies optional behavior in
 *  locale-sensitive services.  Although the LDML specification defines
 *  various keys and values, actual locale-sensitive service
 *  implementations in a Java Runtime Environment might not support any
 *  particular Unicode locale attributes or key/type pairs.
 * 
 *  Creating a Locale
 * 
 *  There are several different ways to create a Locale
 *  object.
 * 
 *  Builder
 * 
 *  Using Locale.Builder you can construct a Locale object
 *  that conforms to BCP 47 syntax.
 * 
 *  Constructors
 * 
 *  The Locale class provides three constructors:
 *  
 *  
 *      Locale(String language)
 *      Locale(String language, String country)
 *      Locale(String language, String country, String variant)
 *  
 *  
 *  These constructors allow you to create a Locale object
 *  with language, country and variant, but you cannot specify
 *  script or extensions.
 * 
 *  Factory Methods
 * 
 *  The method forLanguageTag(java.lang.String) creates a Locale
 *  object for a well-formed BCP 47 language tag.
 * 
 *  Locale Constants
 * 
 *  The Locale class provides a number of convenient constants
 *  that you can use to create Locale objects for commonly used
 *  locales. For example, the following creates a Locale object
 *  for the United States:
 *  
 *  
 *      Locale.US
 *  
 *  
 * 
 *  Locale Matching
 * 
 *  If an application or a system is internationalized and provides localized
 *  resources for multiple locales, it sometimes needs to find one or more
 *  locales (or language tags) which meet each user's specific preferences. Note
 *  that a term "language tag" is used interchangeably with "locale" in this
 *  locale matching documentation.
 * 
 *  In order to do matching a user's preferred locales to a set of language
 *  tags, RFC 4647 Matching of
 *  Language Tags defines two mechanisms: filtering and lookup.
 *  Filtering is used to get all matching locales, whereas
 *  lookup is to choose the best matching locale.
 *  Matching is done case-insensitively. These matching mechanisms are described
 *  in the following sections.
 * 
 *  A user's preference is called a Language Priority List and is
 *  expressed as a list of language ranges. There are syntactically two types of
 *  language ranges: basic and extended. See
 *  Locale.LanguageRange for details.
 * 
 *  Filtering
 * 
 *  The filtering operation returns all matching language tags. It is defined
 *  in RFC 4647 as follows:
 *  "In filtering, each language range represents the least specific language
 *  tag (that is, the language tag with fewest number of subtags) that is an
 *  acceptable match. All of the language tags in the matching set of tags will
 *  have an equal or greater number of subtags than the language range. Every
 *  non-wildcard subtag in the language range will appear in every one of the
 *  matching language tags."
 * 
 *  There are two types of filtering: filtering for basic language ranges
 *  (called "basic filtering") and filtering for extended language ranges
 *  (called "extended filtering"). They may return different results by what
 *  kind of language ranges are included in the given Language Priority List.
 *  Locale.FilteringMode is a parameter to specify how filtering should
 *  be done.
 * 
 *  Lookup
 * 
 *  The lookup operation returns the best matching language tags. It is
 *  defined in RFC 4647 as follows:
 *  "By contrast with filtering, each language range represents the most
 *  specific tag that is an acceptable match.  The first matching tag found,
 *  according to the user's priority, is considered the closest match and is the
 *  item returned."
 * 
 *  For example, if a Language Priority List consists of two language ranges,
 *  "zh-Hant-TW" and "en-US", in prioritized order, lookup
 *  method progressively searches the language tags below in order to find the
 *  best matching language tag.
 *  
 *  
 *     1. zh-Hant-TW
 *     2. zh-Hant
 *     3. zh
 *     4. en-US
 *     5. en
 *  
 *  
 *  If there is a language tag which matches completely to a language range
 *  above, the language tag is returned.
 * 
 *  "*" is the special language range, and it is ignored in lookup.
 * 
 *  If multiple language tags match as a result of the subtag '*'
 *  included in a language range, the first matching language tag returned by
 *  an Iterator over a Collection of language tags is treated as
 *  the best matching one.
 * 
 *  Use of Locale
 * 
 *  Once you've created a Locale you can query it for information
 *  about itself. Use getCountry to get the country (or region)
 *  code and getLanguage to get the language code.
 *  You can use getDisplayCountry to get the
 *  name of the country suitable for displaying to the user. Similarly,
 *  you can use getDisplayLanguage to get the name of
 *  the language suitable for displaying to the user. Interestingly,
 *  the getDisplayXXX methods are themselves locale-sensitive
 *  and have two versions: one that uses the default
 *  DISPLAY locale and one
 *  that uses the locale specified as an argument.
 * 
 *  The Java Platform provides a number of classes that perform locale-sensitive
 *  operations. For example, the NumberFormat class formats
 *  numbers, currency, and percentages in a locale-sensitive manner. Classes
 *  such as NumberFormat have several convenience methods
 *  for creating a default object of that type. For example, the
 *  NumberFormat class provides these three convenience methods
 *  for creating a default NumberFormat object:
 *  
 *  
 *      NumberFormat.getInstance()
 *      NumberFormat.getCurrencyInstance()
 *      NumberFormat.getPercentInstance()
 *  
 *  
 *  Each of these methods has two variants; one with an explicit locale
 *  and one without; the latter uses the default
 *  FORMAT locale:
 *  
 *  
 *      NumberFormat.getInstance(myLocale)
 *      NumberFormat.getCurrencyInstance(myLocale)
 *      NumberFormat.getPercentInstance(myLocale)
 *  
 *  
 *  A Locale is the mechanism for identifying the kind of object
 *  (NumberFormat) that you would like to get. The locale is
 *  just a mechanism for identifying objects,
 *  not a container for the objects themselves.
 * 
 *  Compatibility
 * 
 *  In order to maintain compatibility with existing usage, Locale's
 *  constructors retain their behavior prior to the Java Runtime
 *  Environment version 1.7.  The same is largely true for the
 *  toString method. Thus Locale objects can continue to
 *  be used as they were. In particular, clients who parse the output
 *  of toString into language, country, and variant fields can continue
 *  to do so (although this is strongly discouraged), although the
 *  variant field will have additional information in it if script or
 *  extensions are present.
 * 
 *  In addition, BCP 47 imposes syntax restrictions that are not
 *  imposed by Locale's constructors. This means that conversions
 *  between some Locales and BCP 47 language tags cannot be made without
 *  losing information. Thus toLanguageTag cannot
 *  represent the state of locales whose language, country, or variant
 *  do not conform to BCP 47.
 * 
 *  Because of these issues, it is recommended that clients migrate
 *  away from constructing non-conforming locales and use the
 *  forLanguageTag and Locale.Builder APIs instead.
 *  Clients desiring a string representation of the complete locale can
 *  then always rely on toLanguageTag for this purpose.
 * 
 *  Special cases
 * 
 *  For compatibility reasons, two
 *  non-conforming locales are treated as special cases.  These are
 *  ja_JP_JP and th_TH_TH. These are ill-formed
 *  in BCP 47 since the variants are too short. To ease migration to BCP 47,
 *  these are treated specially during construction.  These two cases (and only
 *  these) cause a constructor to generate an extension, all other values behave
 *  exactly as they did prior to Java 7.
 * 
 *  Java has used ja_JP_JP to represent Japanese as used in
 *  Japan together with the Japanese Imperial calendar. This is now
 *  representable using a Unicode locale extension, by specifying the
 *  Unicode locale key ca (for "calendar") and type
 *  japanese. When the Locale constructor is called with the
 *  arguments "ja", "JP", "JP", the extension "u-ca-japanese" is
 *  automatically added.
 * 
 *  Java has used th_TH_TH to represent Thai as used in
 *  Thailand together with Thai digits. This is also now representable using
 *  a Unicode locale extension, by specifying the Unicode locale key
 *  nu (for "number") and value thai. When the Locale
 *  constructor is called with the arguments "th", "TH", "TH", the
 *  extension "u-nu-thai" is automatically added.
 * 
 *  Serialization
 * 
 *  During serialization, writeObject writes all fields to the output
 *  stream, including extensions.
 * 
 *  During deserialization, readResolve adds extensions as described
 *  in Special Cases, only
 *  for the two cases th_TH_TH and ja_JP_JP.
 * 
 *  Legacy language codes
 * 
 *  Locale's constructor has always converted three language codes to
 *  their earlier, obsoleted forms: he maps to iw,
 *  yi maps to ji, and id maps to
 *  in.  This continues to be the case, in order to not break
 *  backwards compatibility.
 * 
 *  The APIs added in 1.7 map between the old and new language codes,
 *  maintaining the old codes internal to Locale (so that
 *  getLanguage and toString reflect the old
 *  code), but using the new codes in the BCP 47 language tag APIs (so
 *  that toLanguageTag reflects the new one). This
 *  preserves the equivalence between Locales no matter which code or
 *  API is used to construct them. Java's default resource bundle
 *  lookup mechanism also implements this mapping, so that resources
 *  can be named using either convention, see ResourceBundle.Control.
 * 
 *  Three-letter language/country(region) codes
 * 
 *  The Locale constructors have always specified that the language
 *  and the country param be two characters in length, although in
 *  practice they have accepted any length.  The specification has now
 *  been relaxed to allow language codes of two to eight characters and
 *  country (region) codes of two to three characters, and in
 *  particular, three-letter language codes and three-digit region
 *  codes as specified in the IANA Language Subtag Registry.  For
 *  compatibility, the implementation still does not impose a length
 *  constraint.
 */
final class Locale extends Object with Cloneable with Serializable {

    /** Construct a locale from a language code. */
    @stub
    def this(language: String) = ???

    /** Construct a locale from language and country. */
    @stub
    def this(language: String, country: String) = ???

    /** Construct a locale from language, country and variant. */
    @stub
    def this(language: String, country: String, variant: String) = ???

    /** Overrides Cloneable. */
    @stub
    def clone(): Any = ???

    /** Returns true if this Locale is equal to another object. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the country/region code for this locale, which should
     *  either be the empty string, an uppercase ISO 3166 2-letter code,
     *  or a UN M.49 3-digit code.
     */
    @stub
    def getCountry(): String = ???

    /** Returns a name for the locale's country that is appropriate for display to the
     *  user.
     */
    @stub
    def getDisplayCountry(): String = ???

    /** Returns a name for the locale's country that is appropriate for display to the
     *  user.
     */
    @stub
    def getDisplayCountry(inLocale: Locale): String = ???

    /** Returns a name for the locale's language that is appropriate for display to the
     *  user.
     */
    @stub
    def getDisplayLanguage(): String = ???

    /** Returns a name for the locale's language that is appropriate for display to the
     *  user.
     */
    @stub
    def getDisplayLanguage(inLocale: Locale): String = ???

    /** Returns a name for the locale that is appropriate for display to the
     *  user.
     */
    @stub
    def getDisplayName(): String = ???

    /** Returns a name for the locale that is appropriate for display
     *  to the user.
     */
    @stub
    def getDisplayName(inLocale: Locale): String = ???

    /** Returns a name for the the locale's script that is appropriate for display to
     *  the user.
     */
    @stub
    def getDisplayScript(): String = ???

    /** Returns a name for the locale's script that is appropriate
     *  for display to the user.
     */
    @stub
    def getDisplayScript(inLocale: Locale): String = ???

    /** Returns a name for the locale's variant code that is appropriate for display to the
     *  user.
     */
    @stub
    def getDisplayVariant(): String = ???

    /** Returns a name for the locale's variant code that is appropriate for display to the
     *  user.
     */
    @stub
    def getDisplayVariant(inLocale: Locale): String = ???

    /** Returns the extension (or private use) value associated with
     *  the specified key, or null if there is no extension
     *  associated with the key.
     */
    @stub
    def getExtension(key: Char): String = ???

    /** Returns the set of extension keys associated with this locale, or the
     *  empty set if it has no extensions.
     */
    @stub
    def getExtensionKeys(): Set[Character] = ???

    /** Returns a three-letter abbreviation for this locale's country. */
    @stub
    def getISO3Country(): String = ???

    /** Returns a three-letter abbreviation of this locale's language. */
    @stub
    def getISO3Language(): String = ???

    /** Returns the language code of this Locale. */
    @stub
    def getLanguage(): String = ???

    /** Returns the script for this locale, which should
     *  either be the empty string or an ISO 15924 4-letter script
     *  code.
     */
    @stub
    def getScript(): String = ???

    /** Returns the set of unicode locale attributes associated with
     *  this locale, or the empty set if it has no attributes.
     */
    @stub
    def getUnicodeLocaleAttributes(): Set[String] = ???

    /** Returns the set of Unicode locale keys defined by this locale, or the empty set if
     *  this locale has none.
     */
    @stub
    def getUnicodeLocaleKeys(): Set[String] = ???

    /** Returns the Unicode locale type associated with the specified Unicode locale key
     *  for this locale.
     */
    @stub
    def getUnicodeLocaleType(key: String): String = ???

    /** Returns the variant code for this locale. */
    @stub
    def getVariant(): String = ???

    /** Returns true if this Locale has any 
     *  extensions.
     */
    @stub
    def hasExtensions(): Boolean = ???

    /** Override hashCode. */
    @stub
    def hashCode(): Int = ???

    /** Returns a copy of this Locale with no 
     *  extensions.
     */
    @stub
    def stripExtensions(): Locale = ???

    /** Returns a well-formed IETF BCP 47 language tag representing
     *  this locale.
     */
    @stub
    def toLanguageTag(): String = ???

    /** Returns a string representation of this Locale
     *  object, consisting of language, country, variant, script,
     *  and extensions as below:
     *  
     *  language + "_" + country + "_" + (variant + "_#" | "#") + script + "-" + extensions
     *  
     * 
     *  Language is always lower case, country is always upper case, script is always title
     *  case, and extensions are always lower case.
     */
    @stub
    def toString(): String = ???
}

object Locale {
    /** Builder is used to build instances of Locale
     *  from values configured by the setters.
     */
    type Builder = Locale_Builder

    /** Enum for locale categories. */
    type Category = Locale_Category

    /** This enum provides constants to select a filtering mode for locale
     *  matching.
     */
    type FilteringMode = Locale_FilteringMode

    /** This class expresses a Language Range defined in
     *  RFC 4647 Matching of
     *  Language Tags.
     */
    type LanguageRange = Locale_LanguageRange

    /** Useful constant for country. */
    @stub
    val CANADA: Locale = ???

    /** Useful constant for country. */
    @stub
    val CANADA_FRENCH: Locale = ???

    /** Useful constant for country. */
    @stub
    val CHINA: Locale = ???

    /** Useful constant for language. */
    @stub
    val CHINESE: Locale = ???

    /** Useful constant for language. */
    @stub
    val ENGLISH: Locale = ???

    /** Useful constant for country. */
    @stub
    val FRANCE: Locale = ???

    /** Useful constant for language. */
    @stub
    val FRENCH: Locale = ???

    /** Useful constant for language. */
    @stub
    val GERMAN: Locale = ???

    /** Useful constant for country. */
    @stub
    val GERMANY: Locale = ???

    /** Useful constant for language. */
    @stub
    val ITALIAN: Locale = ???

    /** Useful constant for country. */
    @stub
    val ITALY: Locale = ???

    /** Useful constant for country. */
    @stub
    val JAPAN: Locale = ???

    /** Useful constant for language. */
    @stub
    val JAPANESE: Locale = ???

    /** Useful constant for country. */
    @stub
    val KOREA: Locale = ???

    /** Useful constant for language. */
    @stub
    val KOREAN: Locale = ???

    /** Useful constant for country. */
    @stub
    val PRC: Locale = ???

    /** The key for the private use extension ('x'). */
    @stub
    val PRIVATE_USE_EXTENSION: Char = ???

    /** Useful constant for the root locale. */
    @stub
    val ROOT: Locale = ???

    /** Useful constant for language. */
    @stub
    val SIMPLIFIED_CHINESE: Locale = ???

    /** Useful constant for country. */
    @stub
    val TAIWAN: Locale = ???

    /** Useful constant for language. */
    @stub
    val TRADITIONAL_CHINESE: Locale = ???

    /** Useful constant for country. */
    @stub
    val UK: Locale = ???

    /** The key for Unicode locale extension ('u'). */
    @stub
    val UNICODE_LOCALE_EXTENSION: Char = ???

    /** Useful constant for country. */
    @stub
    val US: Locale = ???

    /** Returns a list of matching Locale instances using the filtering
     *  mechanism defined in RFC 4647.
     */
    @stub
    def filter(priorityList: List[Locale.LanguageRange], locales: Collection[Locale]): List[Locale] = ???

    /** Returns a list of matching Locale instances using the filtering
     *  mechanism defined in RFC 4647.
     */
    @stub
    def filter(priorityList: List[Locale.LanguageRange], locales: Collection[Locale], mode: Locale.FilteringMode): List[Locale] = ???

    /** Returns a list of matching languages tags using the basic filtering
     *  mechanism defined in RFC 4647.
     */
    @stub
    def filterTags(priorityList: List[Locale.LanguageRange], tags: Collection[String]): List[String] = ???

    /** Returns a list of matching languages tags using the basic filtering
     *  mechanism defined in RFC 4647.
     */
    @stub
    def filterTags(priorityList: List[Locale.LanguageRange], tags: Collection[String], mode: Locale.FilteringMode): List[String] = ???

    /** Returns a locale for the specified IETF BCP 47 language tag string. */
    @stub
    def forLanguageTag(languageTag: String): Locale = ???

    /** Returns an array of all installed locales. */
    @stub
    def getAvailableLocales(): Array[Locale] = ???

    /** Gets the current value of the default locale for this instance
     *  of the Java Virtual Machine.
     */
    @stub
    def getDefault(): Locale = ???

    /** Gets the current value of the default locale for the specified Category
     *  for this instance of the Java Virtual Machine.
     */
    @stub
    def getDefault(category: Locale.Category): Locale = ???

    /** Returns a list of all 2-letter country codes defined in ISO 3166. */
    @stub
    def getISOCountries(): Array[String] = ???

    /** Returns a list of all 2-letter language codes defined in ISO 639. */
    @stub
    def getISOLanguages(): Array[String] = ???

    /** Returns a Locale instance for the best-matching language
     *  tag using the lookup mechanism defined in RFC 4647.
     */
    @stub
    def lookup(priorityList: List[Locale.LanguageRange], locales: Collection[Locale]): Locale = ???

    /** Returns the best-matching language tag using the lookup mechanism
     *  defined in RFC 4647.
     */
    @stub
    def lookupTag(priorityList: List[Locale.LanguageRange], tags: Collection[String]): String = ???

    /** Sets the default locale for the specified Category for this instance
     *  of the Java Virtual Machine.
     */
    @stub
    def setDefault(category: Locale.Category, newLocale: Locale): Unit = ???

    /** Sets the default locale for this instance of the Java Virtual Machine. */
    @stub
    def setDefault(newLocale: Locale): Unit = ???
}
