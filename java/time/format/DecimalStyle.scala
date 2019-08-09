package java.time.format

import java.lang.{Object, String}
import java.util.{Locale, Set}

/** Localized decimal style used in date and time formatting.
 *  
 *  A significant part of dealing with dates and times is the localization.
 *  This class acts as a central point for accessing the information.
 */
final class DecimalStyle extends Object {

    /** Checks if this DecimalStyle is equal to another DecimalStyle. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Gets the character that represents the decimal point. */
    @stub
    def getDecimalSeparator(): Char = ???

    /** Gets the character that represents the negative sign. */
    @stub
    def getNegativeSign(): Char = ???

    /** Gets the character that represents the positive sign. */
    @stub
    def getPositiveSign(): Char = ???

    /** Gets the character that represents zero. */
    @stub
    def getZeroDigit(): Char = ???

    /** A hash code for this DecimalStyle. */
    @stub
    def hashCode(): Int = ???

    /** Returns a string describing this DecimalStyle. */
    @stub
    def toString(): String = ???

    /** Returns a copy of the info with a new character that represents the decimal point. */
    @stub
    def withDecimalSeparator(decimalSeparator: Char): DecimalStyle = ???

    /** Returns a copy of the info with a new character that represents the negative sign. */
    @stub
    def withNegativeSign(negativeSign: Char): DecimalStyle = ???

    /** Returns a copy of the info with a new character that represents the positive sign. */
    @stub
    def withPositiveSign(positiveSign: Char): DecimalStyle = ???
}

object DecimalStyle {
    /** Lists all the locales that are supported. */
    @stub
    def getAvailableLocales(): Set[Locale] = ???

    /** Obtains the DecimalStyle for the specified locale. */
    @stub
    def of(locale: Locale): DecimalStyle = ???

    /** Obtains the DecimalStyle for the default
     *  FORMAT locale.
     */
    @stub
    def ofDefaultLocale(): DecimalStyle = ???
}
