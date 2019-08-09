package java.util

import java.lang.{Object, String}

/** Builder is used to build instances of Locale
 *  from values configured by the setters.  Unlike the Locale
 *  constructors, the Builder checks if a value configured by a
 *  setter satisfies the syntax requirements defined by the Locale
 *  class.  A Locale object created by a Builder is
 *  well-formed and can be transformed to a well-formed IETF BCP 47 language tag
 *  without losing information.
 * 
 *  Note: The Locale class does not provide any
 *  syntactic restrictions on variant, while BCP 47 requires each variant
 *  subtag to be 5 to 8 alphanumerics or a single numeric followed by 3
 *  alphanumerics.  The method setVariant throws
 *  IllformedLocaleException for a variant that does not satisfy
 *  this restriction. If it is necessary to support such a variant, use a
 *  Locale constructor.  However, keep in mind that a Locale
 *  object created this way might lose the variant information when
 *  transformed to a BCP 47 language tag.
 * 
 *  The following example shows how to create a Locale object
 *  with the Builder.
 *  
 *  
 *      Locale aLocale = new Builder().setLanguage("sr").setScript("Latn").setRegion("RS").build();
 *  
 *  
 * 
 *  Builders can be reused; clear() resets all
 *  fields to their default values.
 */
final object Locale.Builder extends Object {

    /** Adds a unicode locale attribute, if not already present, otherwise
     *  has no effect.
     */
    @stub
    def addUnicodeLocaleAttribute(attribute: String): Locale.Builder = ???

    /** Returns an instance of Locale created from the fields set
     *  on this builder.
     */
    @stub
    def build(): Locale = ???

    /** Resets the builder to its initial, empty state. */
    @stub
    def clear(): Locale.Builder = ???

    /** Resets the extensions to their initial, empty state. */
    @stub
    def clearExtensions(): Locale.Builder = ???

    /** Removes a unicode locale attribute, if present, otherwise has no
     *  effect.
     */
    @stub
    def removeUnicodeLocaleAttribute(attribute: String): Locale.Builder = ???

    /** Sets the extension for the given key. */
    @stub
    def setExtension(key: Char, value: String): Locale.Builder = ???

    /** Sets the language. */
    @stub
    def setLanguage(language: String): Locale.Builder = ???

    /** Resets the Builder to match the provided IETF BCP 47
     *  language tag.
     */
    @stub
    def setLanguageTag(languageTag: String): Locale.Builder = ???

    /** Resets the Builder to match the provided
     *  locale.
     */
    @stub
    def setLocale(locale: Locale): Locale.Builder = ???

    /** Sets the region. */
    @stub
    def setRegion(region: String): Locale.Builder = ???

    /** Sets the script. */
    @stub
    def setScript(script: String): Locale.Builder = ???

    /** Sets the Unicode locale keyword type for the given key. */
    @stub
    def setUnicodeLocaleKeyword(key: String, type: String): Locale.Builder = ???
}
