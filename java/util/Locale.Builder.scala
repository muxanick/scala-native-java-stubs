package java.util

import java.lang.{Object, String}

// Builder is used to build instances of Locale
// from values configured by the setters.  Unlike the Locale
// constructors, the Builder checks if a value configured by a
// setter satisfies the syntax requirements defined by the Locale
// class.  A Locale object created by a Builder is
// well-formed and can be transformed to a well-formed IETF BCP 47 language tag
// without losing information.
//
// Note: The Locale class does not provide any
// syntactic restrictions on variant, while BCP 47 requires each variant
// subtag to be 5 to 8 alphanumerics or a single numeric followed by 3
// alphanumerics.  The method setVariant throws
// IllformedLocaleException for a variant that does not satisfy
// this restriction. If it is necessary to support such a variant, use a
// Locale constructor.  However, keep in mind that a Locale
// object created this way might lose the variant information when
// transformed to a BCP 47 language tag.
//
// The following example shows how to create a Locale object
// with the Builder.
// 
// 
//     Locale aLocale = new Builder().setLanguage("sr").setScript("Latn").setRegion("RS").build();
// 
// 
//
// Builders can be reused; clear() resets all
// fields to their default values.
object final Locale.Builder extends Object {

    @stub
    // Adds a unicode locale attribute, if not already present, otherwise
    // has no effect.
    def addUnicodeLocaleAttribute(attribute: String): Locale.Builder = ???

    @stub
    // Returns an instance of Locale created from the fields set
    // on this builder.
    def build(): Locale = ???

    @stub
    // Resets the builder to its initial, empty state.
    def clear(): Locale.Builder = ???

    @stub
    // Resets the extensions to their initial, empty state.
    def clearExtensions(): Locale.Builder = ???

    @stub
    // Removes a unicode locale attribute, if present, otherwise has no
    // effect.
    def removeUnicodeLocaleAttribute(attribute: String): Locale.Builder = ???

    @stub
    // Sets the extension for the given key.
    def setExtension(key: Char, value: String): Locale.Builder = ???

    @stub
    // Sets the language.
    def setLanguage(language: String): Locale.Builder = ???

    @stub
    // Resets the Builder to match the provided IETF BCP 47
    // language tag.
    def setLanguageTag(languageTag: String): Locale.Builder = ???

    @stub
    // Resets the Builder to match the provided
    // locale.
    def setLocale(locale: Locale): Locale.Builder = ???

    @stub
    // Sets the region.
    def setRegion(region: String): Locale.Builder = ???

    @stub
    // Sets the script.
    def setScript(script: String): Locale.Builder = ???

    @stub
    // Sets the Unicode locale keyword type for the given key.
    def setUnicodeLocaleKeyword(key: String, type: String): Locale.Builder = ???
}