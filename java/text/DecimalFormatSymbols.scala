package java.text

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import java.util.{Currency, Locale}
import scala.scalanative.annotation.stub

/** This class represents the set of symbols (such as the decimal separator,
 *  the grouping separator, and so on) needed by DecimalFormat
 *  to format numbers. DecimalFormat creates for itself an instance of
 *  DecimalFormatSymbols from its locale data.  If you need to change any
 *  of these symbols, you can get the DecimalFormatSymbols object from
 *  your DecimalFormat and modify it.
 */
class DecimalFormatSymbols extends Object with Cloneable with Serializable {

    /** Create a DecimalFormatSymbols object for the default
     *  FORMAT locale.
     */
    @stub
    def this() = ???

    /** Create a DecimalFormatSymbols object for the given locale. */
    @stub
    def this(locale: Locale) = ???

    /** Standard override. */
    @stub
    def clone(): Any = ???

    /** Override equals. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Gets the currency of these DecimalFormatSymbols. */
    @stub
    def getCurrency(): Currency = ???

    /** Returns the currency symbol for the currency of these
     *  DecimalFormatSymbols in their locale.
     */
    @stub
    def getCurrencySymbol(): String = ???

    /** Gets the character used for decimal sign. */
    @stub
    def getDecimalSeparator(): Char = ???

    /** Gets the character used for a digit in a pattern. */
    @stub
    def getDigit(): Char = ???

    /** Returns the string used to separate the mantissa from the exponent. */
    @stub
    def getExponentSeparator(): String = ???

    /** Gets the character used for thousands separator. */
    @stub
    def getGroupingSeparator(): Char = ???

    /** Gets the string used to represent infinity. */
    @stub
    def getInfinity(): String = ???

    /** Returns the ISO 4217 currency code of the currency of these
     *  DecimalFormatSymbols.
     */
    @stub
    def getInternationalCurrencySymbol(): String = ???

    /** Gets the character used to represent minus sign. */
    @stub
    def getMinusSign(): Char = ???

    /** Returns the monetary decimal separator. */
    @stub
    def getMonetaryDecimalSeparator(): Char = ???

    /** Gets the string used to represent "not a number". */
    @stub
    def getNaN(): String = ???

    /** Gets the character used to separate positive and negative subpatterns
     *  in a pattern.
     */
    @stub
    def getPatternSeparator(): Char = ???

    /** Gets the character used for percent sign. */
    @stub
    def getPercent(): Char = ???

    /** Gets the character used for per mille sign. */
    @stub
    def getPerMill(): Char = ???

    /** Gets the character used for zero. */
    @stub
    def getZeroDigit(): Char = ???

    /** Override hashCode. */
    @stub
    def hashCode(): Int = ???

    /** Sets the currency of these DecimalFormatSymbols. */
    @stub
    def setCurrency(currency: Currency): Unit = ???

    /** Sets the currency symbol for the currency of these
     *  DecimalFormatSymbols in their locale.
     */
    @stub
    def setCurrencySymbol(currency: String): Unit = ???

    /** Sets the character used for decimal sign. */
    @stub
    def setDecimalSeparator(decimalSeparator: Char): Unit = ???

    /** Sets the character used for a digit in a pattern. */
    @stub
    def setDigit(digit: Char): Unit = ???

    /** Sets the string used to separate the mantissa from the exponent. */
    @stub
    def setExponentSeparator(exp: String): Unit = ???

    /** Sets the character used for thousands separator. */
    @stub
    def setGroupingSeparator(groupingSeparator: Char): Unit = ???

    /** Sets the string used to represent infinity. */
    @stub
    def setInfinity(infinity: String): Unit = ???

    /** Sets the ISO 4217 currency code of the currency of these
     *  DecimalFormatSymbols.
     */
    @stub
    def setInternationalCurrencySymbol(currencyCode: String): Unit = ???

    /** Sets the character used to represent minus sign. */
    @stub
    def setMinusSign(minusSign: Char): Unit = ???

    /** Sets the monetary decimal separator. */
    @stub
    def setMonetaryDecimalSeparator(sep: Char): Unit = ???

    /** Sets the string used to represent "not a number". */
    @stub
    def setNaN(NaN: String): Unit = ???

    /** Sets the character used to separate positive and negative subpatterns
     *  in a pattern.
     */
    @stub
    def setPatternSeparator(patternSeparator: Char): Unit = ???

    /** Sets the character used for percent sign. */
    @stub
    def setPercent(percent: Char): Unit = ???

    /** Sets the character used for per mille sign. */
    @stub
    def setPerMill(perMill: Char): Unit = ???

    /** Sets the character used for zero. */
    @stub
    def setZeroDigit(zeroDigit: Char): Unit = ???
}

object DecimalFormatSymbols {
    /** Returns an array of all locales for which the
     *  getInstance methods of this class can return
     *  localized instances.
     */
    @stub
    def getAvailableLocales(): Array[Locale] = ???

    /** Gets the DecimalFormatSymbols instance for the default
     *  locale.
     */
    @stub
    def getInstance(): DecimalFormatSymbols = ???

    /** Gets the DecimalFormatSymbols instance for the specified
     *  locale.
     */
    @stub
    def getInstance(locale: Locale): DecimalFormatSymbols = ???
}
