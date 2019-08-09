package java.text

import java.lang.{Number, Object, String, StringBuffer}
import java.math.RoundingMode
import java.util.{Currency, Locale}

// NumberFormat is the abstract base class for all number
// formats. This class provides the interface for formatting and parsing
// numbers. NumberFormat also provides methods for determining
// which locales have number formats, and what their names are.
//
// 
// NumberFormat helps you to format and parse numbers for any locale.
// Your code can be completely independent of the locale conventions for
// decimal points, thousands-separators, or even the particular decimal
// digits used, or whether the number format is even decimal.
//
// 
// To format a number for the current Locale, use one of the factory
// class methods:
// 
// 
// myString = NumberFormat.getInstance().format(myNumber);
// 
// 
// If you are formatting multiple numbers, it is
// more efficient to get the format and use it multiple times so that
// the system doesn't have to fetch the information about the local
// language and country conventions multiple times.
// 
// 
// NumberFormat nf = NumberFormat.getInstance();
// for (int i = 0; i < myNumber.length; ++i) {
//     output.println(nf.format(myNumber[i]) + "; ");
// }
// 
// 
// To format a number for a different Locale, specify it in the
// call to getInstance.
// 
// 
// NumberFormat nf = NumberFormat.getInstance(Locale.FRENCH);
// 
// 
// You can also use a NumberFormat to parse numbers:
// 
// 
// myNumber = nf.parse(myString);
// 
// 
// Use getInstance or getNumberInstance to get the
// normal number format. Use getIntegerInstance to get an
// integer number format. Use getCurrencyInstance to get the
// currency number format. And use getPercentInstance to get a
// format for displaying percentages. With this format, a fraction like
// 0.53 is displayed as 53%.
//
// 
// You can also control the display of numbers with such methods as
// setMinimumFractionDigits.
// If you want even more control over the format or parsing,
// or want to give your users more control,
// you can try casting the NumberFormat you get from the factory methods
// to a DecimalFormat. This will work for the vast majority
// of locales; just remember to put it in a try block in case you
// encounter an unusual one.
//
// 
// NumberFormat and DecimalFormat are designed such that some controls
// work for formatting and others work for parsing.  The following is
// the detailed description for each these control methods,
// 
// setParseIntegerOnly : only affects parsing, e.g.
// if true,  "3456.78" → 3456 (and leaves the parse position just after index 6)
// if false, "3456.78" → 3456.78 (and leaves the parse position just after index 8)
// This is independent of formatting.  If you want to not show a decimal point
// where there might be no digits after the decimal point, use
// setDecimalSeparatorAlwaysShown.
// 
// setDecimalSeparatorAlwaysShown : only affects formatting, and only where
// there might be no digits after the decimal point, such as with a pattern
// like "#,##0.##", e.g.,
// if true,  3456.00 → "3,456."
// if false, 3456.00 → "3456"
// This is independent of parsing.  If you want parsing to stop at the decimal
// point, use setParseIntegerOnly.
//
// 
// You can also use forms of the parse and format
// methods with ParsePosition and FieldPosition to
// allow you to:
// 
//  progressively parse through pieces of a string
//  align the decimal point and other areas
// 
// For example, you can align numbers in two ways:
// 
//  If you are using a monospaced font with spacing for alignment,
//      you can pass the FieldPosition in your format call, with
//      field = INTEGER_FIELD. On output,
//      getEndIndex will be set to the offset between the
//      last character of the integer and the decimal. Add
//      (desiredSpaceCount - getEndIndex) spaces at the front of the string.
//
//  If you are using proportional fonts,
//      instead of padding with spaces, measure the width
//      of the string in pixels from the start to getEndIndex.
//      Then move the pen by
//      (desiredPixelWidth - widthToAlignmentPoint) before drawing the text.
//      It also works where there is no decimal, but possibly additional
//      characters at the end, e.g., with parentheses in negative
//      numbers: "(12)" for -12.
// 
//
// Synchronization
//
// 
// Number formats are generally not synchronized.
// It is recommended to create separate format instances for each thread.
// If multiple threads access a format concurrently, it must be synchronized
// externally.
abstract class NumberFormat extends Format {

    // Overrides Cloneable.
    def clone(): Object

    // Overrides equals.
    def equals(obj: Object): Boolean

    // Specialization of format.
    def format(number: double): String

    // Specialization of format.
    def format(number: double, toAppendTo: StringBuffer, pos: FieldPosition): StringBuffer

    // Specialization of format.
    def format(number: Long): String

    // Specialization of format.
    def format(number: Long, toAppendTo: StringBuffer, pos: FieldPosition): StringBuffer

    // Formats a number and appends the resulting text to the given string
    // buffer.
    def format(number: Object, toAppendTo: StringBuffer, pos: FieldPosition): StringBuffer

    // Gets the currency used by this number format when formatting
    // currency values.
    def getCurrency(): Currency

    // Returns the maximum number of digits allowed in the fraction portion of a
    // number.
    def getMaximumFractionDigits(): Int

    // Returns the maximum number of digits allowed in the integer portion of a
    // number.
    def getMaximumIntegerDigits(): Int

    // Returns the minimum number of digits allowed in the fraction portion of a
    // number.
    def getMinimumFractionDigits(): Int

    // Returns the minimum number of digits allowed in the integer portion of a
    // number.
    def getMinimumIntegerDigits(): Int

    // Gets the RoundingMode used in this NumberFormat.
    def getRoundingMode(): RoundingMode

    // Overrides hashCode.
    def hashCode(): Int

    // Returns true if grouping is used in this format.
    def isGroupingUsed(): Boolean

    // Returns true if this format will parse numbers as integers only.
    def isParseIntegerOnly(): Boolean

    // Parses text from the beginning of the given string to produce a number.
    def parse(source: String): Number

    // Returns a Long if possible (e.g., within the range [Long.MIN_VALUE,
    // Long.MAX_VALUE] and with no decimals), otherwise a Double.
    def parse(source: String, parsePosition: ParsePosition): Number

    // Parses text from a string to produce a Number.
    def parseObject(source: String, pos: ParsePosition): Object

    // Sets the currency used by this number format when formatting
    // currency values.
    def setCurrency(currency: Currency): Unit

    // Set whether or not grouping will be used in this format.
    def setGroupingUsed(newValue: Boolean): Unit

    // Sets the maximum number of digits allowed in the fraction portion of a
    // number.
    def setMaximumFractionDigits(newValue: Int): Unit

    // Sets the maximum number of digits allowed in the integer portion of a
    // number.
    def setMaximumIntegerDigits(newValue: Int): Unit

    // Sets the minimum number of digits allowed in the fraction portion of a
    // number.
    def setMinimumFractionDigits(newValue: Int): Unit

    // Sets the minimum number of digits allowed in the integer portion of a
    // number.
    def setMinimumIntegerDigits(newValue: Int): Unit

    // Sets whether or not numbers should be parsed as integers only.
    def setParseIntegerOnly(value: Boolean): Unit
}

object NumberFormat {
    @stub
    // Field constant used to construct a FieldPosition object.
    def FRACTION_FIELD: Int = ???

    @stub
    // Returns an array of all locales for which the
    // get*Instance methods of this class can return
    // localized instances.
    def getAvailableLocales(): Array[Locale] = ???

    @stub
    // Returns a currency format for the current default
    // FORMAT locale.
    def getCurrencyInstance(): NumberFormat = ???

    @stub
    // Returns a currency format for the specified locale.
    def getCurrencyInstance(inLocale: Locale): NumberFormat = ???

    @stub
    // Returns a general-purpose number format for the current default
    // FORMAT locale.
    def getInstance(): NumberFormat = ???

    @stub
    // Returns a general-purpose number format for the specified locale.
    def getInstance(inLocale: Locale): NumberFormat = ???

    @stub
    // Returns an integer number format for the current default
    // FORMAT locale.
    def getIntegerInstance(): NumberFormat = ???

    @stub
    // Returns an integer number format for the specified locale.
    def getIntegerInstance(inLocale: Locale): NumberFormat = ???

    @stub
    // Returns a general-purpose number format for the current default
    // FORMAT locale.
    def getNumberInstance(): NumberFormat = ???

    @stub
    // Returns a general-purpose number format for the specified locale.
    def getNumberInstance(inLocale: Locale): NumberFormat = ???

    @stub
    // Returns a percentage format for the current default
    // FORMAT locale.
    def getPercentInstance(): NumberFormat = ???

    @stub
    // Returns a percentage format for the specified locale.
    def getPercentInstance(inLocale: Locale): NumberFormat = ???
}
