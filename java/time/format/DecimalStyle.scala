package java.time.format

import java.lang.{Object, String}
import java.util.{Locale, Set}

// Localized decimal style used in date and time formatting.
// 
// A significant part of dealing with dates and times is the localization.
// This class acts as a central point for accessing the information.
final class DecimalStyle extends Object {

    @stub
    // Checks if this DecimalStyle is equal to another DecimalStyle.
    def equals(obj: Object): Boolean = ???

    @stub
    // Gets the character that represents the decimal point.
    def getDecimalSeparator(): Char = ???

    @stub
    // Gets the character that represents the negative sign.
    def getNegativeSign(): Char = ???

    @stub
    // Gets the character that represents the positive sign.
    def getPositiveSign(): Char = ???

    @stub
    // Gets the character that represents zero.
    def getZeroDigit(): Char = ???

    @stub
    // A hash code for this DecimalStyle.
    def hashCode(): Int = ???

    @stub
    // Returns a string describing this DecimalStyle.
    def toString(): String = ???

    @stub
    // Returns a copy of the info with a new character that represents the decimal point.
    def withDecimalSeparator(decimalSeparator: Char): DecimalStyle = ???

    @stub
    // Returns a copy of the info with a new character that represents the negative sign.
    def withNegativeSign(negativeSign: Char): DecimalStyle = ???

    @stub
    // Returns a copy of the info with a new character that represents the positive sign.
    def withPositiveSign(positiveSign: Char): DecimalStyle = ???
}

object DecimalStyle {
    @stub
    // Lists all the locales that are supported.
    def getAvailableLocales(): Set[Locale] = ???

    @stub
    // Obtains the DecimalStyle for the specified locale.
    def of(locale: Locale): DecimalStyle = ???

    @stub
    // Obtains the DecimalStyle for the default
    // FORMAT locale.
    def ofDefaultLocale(): DecimalStyle = ???
}
