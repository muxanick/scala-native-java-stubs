package java.text

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import java.util.{Currency, Locale}

// This class represents the set of symbols (such as the decimal separator,
// the grouping separator, and so on) needed by DecimalFormat
// to format numbers. DecimalFormat creates for itself an instance of
// DecimalFormatSymbols from its locale data.  If you need to change any
// of these symbols, you can get the DecimalFormatSymbols object from
// your DecimalFormat and modify it.
class DecimalFormatSymbols extends Object with Cloneable, with Serializable {

    @stub
    // Create a DecimalFormatSymbols object for the default
    // FORMAT locale.
    def this() = ???

    @stub
    // Standard override.
    def clone(): Object = ???

    @stub
    // Override equals.
    def equals(obj: Object): Boolean = ???

    @stub
    // Gets the currency of these DecimalFormatSymbols.
    def getCurrency(): Currency = ???

    @stub
    // Returns the currency symbol for the currency of these
    // DecimalFormatSymbols in their locale.
    def getCurrencySymbol(): String = ???

    @stub
    // Gets the character used for decimal sign.
    def getDecimalSeparator(): Char = ???

    @stub
    // Gets the character used for a digit in a pattern.
    def getDigit(): Char = ???

    @stub
    // Returns the string used to separate the mantissa from the exponent.
    def getExponentSeparator(): String = ???

    @stub
    // Gets the character used for thousands separator.
    def getGroupingSeparator(): Char = ???

    @stub
    // Gets the string used to represent infinity.
    def getInfinity(): String = ???

    @stub
    // Returns the ISO 4217 currency code of the currency of these
    // DecimalFormatSymbols.
    def getInternationalCurrencySymbol(): String = ???

    @stub
    // Gets the character used to represent minus sign.
    def getMinusSign(): Char = ???

    @stub
    // Returns the monetary decimal separator.
    def getMonetaryDecimalSeparator(): Char = ???

    @stub
    // Gets the string used to represent "not a number".
    def getNaN(): String = ???

    @stub
    // Gets the character used to separate positive and negative subpatterns
    // in a pattern.
    def getPatternSeparator(): Char = ???

    @stub
    // Gets the character used for percent sign.
    def getPercent(): Char = ???

    @stub
    // Gets the character used for per mille sign.
    def getPerMill(): Char = ???

    @stub
    // Gets the character used for zero.
    def getZeroDigit(): Char = ???

    @stub
    // Override hashCode.
    def hashCode(): Int = ???

    @stub
    // Sets the currency of these DecimalFormatSymbols.
    def setCurrency(currency: Currency): Unit = ???

    @stub
    // Sets the currency symbol for the currency of these
    // DecimalFormatSymbols in their locale.
    def setCurrencySymbol(currency: String): Unit = ???

    @stub
    // Sets the character used for decimal sign.
    def setDecimalSeparator(decimalSeparator: Char): Unit = ???

    @stub
    // Sets the character used for a digit in a pattern.
    def setDigit(digit: Char): Unit = ???

    @stub
    // Sets the string used to separate the mantissa from the exponent.
    def setExponentSeparator(exp: String): Unit = ???

    @stub
    // Sets the character used for thousands separator.
    def setGroupingSeparator(groupingSeparator: Char): Unit = ???

    @stub
    // Sets the string used to represent infinity.
    def setInfinity(infinity: String): Unit = ???

    @stub
    // Sets the ISO 4217 currency code of the currency of these
    // DecimalFormatSymbols.
    def setInternationalCurrencySymbol(currencyCode: String): Unit = ???

    @stub
    // Sets the character used to represent minus sign.
    def setMinusSign(minusSign: Char): Unit = ???

    @stub
    // Sets the monetary decimal separator.
    def setMonetaryDecimalSeparator(sep: Char): Unit = ???

    @stub
    // Sets the string used to represent "not a number".
    def setNaN(NaN: String): Unit = ???

    @stub
    // Sets the character used to separate positive and negative subpatterns
    // in a pattern.
    def setPatternSeparator(patternSeparator: Char): Unit = ???

    @stub
    // Sets the character used for percent sign.
    def setPercent(percent: Char): Unit = ???

    @stub
    // Sets the character used for per mille sign.
    def setPerMill(perMill: Char): Unit = ???
}

object DecimalFormatSymbols {
    @stub
    // Returns an array of all locales for which the
    // getInstance methods of this class can return
    // localized instances.
    def getAvailableLocales(): Array[Locale] = ???

    @stub
    // Gets the DecimalFormatSymbols instance for the default
    // locale.
    def getInstance(): DecimalFormatSymbols = ???

    @stub
    // Gets the DecimalFormatSymbols instance for the specified
    // locale.
    def getInstance(locale: Locale): DecimalFormatSymbols = ???
}
