package java.text

import java.lang.{Number, Object, String, StringBuffer}
import java.math.RoundingMode
import java.util.Currency

/** DecimalFormat is a concrete subclass of
 *  NumberFormat that formats decimal numbers. It has a variety of
 *  features designed to make it possible to parse and format numbers in any
 *  locale, including support for Western, Arabic, and Indic digits.  It also
 *  supports different kinds of numbers, including integers (123), fixed-point
 *  numbers (123.4), scientific notation (1.23E4), percentages (12%), and
 *  currency amounts ($123).  All of these can be localized.
 * 
 *  To obtain a NumberFormat for a specific locale, including the
 *  default locale, call one of NumberFormat's factory methods, such
 *  as getInstance().  In general, do not call the
 *  DecimalFormat constructors directly, since the
 *  NumberFormat factory methods may return subclasses other than
 *  DecimalFormat. If you need to customize the format object, do
 *  something like this:
 * 
 *  
 *  NumberFormat f = NumberFormat.getInstance(loc);
 *  if (f instanceof DecimalFormat) {
 *      ((DecimalFormat) f).setDecimalSeparatorAlwaysShown(true);
 *  }
 *  
 * 
 *  A DecimalFormat comprises a pattern and a set of
 *  symbols.  The pattern may be set directly using
 *  applyPattern(), or indirectly using the API methods.  The
 *  symbols are stored in a DecimalFormatSymbols object.  When using
 *  the NumberFormat factory methods, the pattern and symbols are
 *  read from localized ResourceBundles.
 * 
 *  Patterns
 * 
 *  DecimalFormat patterns have the following syntax:
 *  
 *  Pattern:
 *          PositivePattern
 *          PositivePattern ; NegativePattern
 *  PositivePattern:
 *          Prefixopt Number Suffixopt
 *  NegativePattern:
 *          Prefixopt Number Suffixopt
 *  Prefix:
 *          any Unicode characters except \uFFFE, \uFFFF, and special characters
 *  Suffix:
 *          any Unicode characters except \uFFFE, \uFFFF, and special characters
 *  Number:
 *          Integer Exponentopt
 *          Integer . Fraction Exponentopt
 *  Integer:
 *          MinimumInteger
 *          #
 *          # Integer
 *          # , Integer
 *  MinimumInteger:
 *          0
 *          0 MinimumInteger
 *          0 , MinimumInteger
 *  Fraction:
 *          MinimumFractionopt OptionalFractionopt
 *  MinimumFraction:
 *          0 MinimumFractionopt
 *  OptionalFraction:
 *          # OptionalFractionopt
 *  Exponent:
 *          E MinimumExponent
 *  MinimumExponent:
 *          0 MinimumExponentopt
 *  
 * 
 *  A DecimalFormat pattern contains a positive and negative
 *  subpattern, for example, "#,##0.00;(#,##0.00)".  Each
 *  subpattern has a prefix, numeric part, and suffix. The negative subpattern
 *  is optional; if absent, then the positive subpattern prefixed with the
 *  localized minus sign ('-' in most locales) is used as the
 *  negative subpattern. That is, "0.00" alone is equivalent to
 *  "0.00;-0.00".  If there is an explicit negative subpattern, it
 *  serves only to specify the negative prefix and suffix; the number of digits,
 *  minimal digits, and other characteristics are all the same as the positive
 *  pattern. That means that "#,##0.0#;(#)" produces precisely
 *  the same behavior as "#,##0.0#;(#,##0.0#)".
 * 
 *  The prefixes, suffixes, and various symbols used for infinity, digits,
 *  thousands separators, decimal separators, etc. may be set to arbitrary
 *  values, and they will appear properly during formatting.  However, care must
 *  be taken that the symbols and strings do not conflict, or parsing will be
 *  unreliable.  For example, either the positive and negative prefixes or the
 *  suffixes must be distinct for DecimalFormat.parse() to be able
 *  to distinguish positive from negative values.  (If they are identical, then
 *  DecimalFormat will behave as if no negative subpattern was
 *  specified.)  Another example is that the decimal separator and thousands
 *  separator should be distinct characters, or parsing will be impossible.
 * 
 *  The grouping separator is commonly used for thousands, but in some
 *  countries it separates ten-thousands. The grouping size is a constant number
 *  of digits between the grouping characters, such as 3 for 100,000,000 or 4 for
 *  1,0000,0000.  If you supply a pattern with multiple grouping characters, the
 *  interval between the last one and the end of the integer is the one that is
 *  used. So "#,##,###,####" == "######,####" ==
 *  "##,####,####".
 * 
 *  Special Pattern Characters
 * 
 *  Many characters in a pattern are taken literally; they are matched during
 *  parsing and output unchanged during formatting.  Special characters, on the
 *  other hand, stand for other characters, strings, or classes of characters.
 *  They must be quoted, unless noted otherwise, if they are to appear in the
 *  prefix or suffix as literals.
 * 
 *  The characters listed here are used in non-localized patterns.  Localized
 *  patterns use the corresponding characters taken from this formatter's
 *  DecimalFormatSymbols object instead, and these characters lose
 *  their special status.  Two exceptions are the currency sign and quote, which
 *  are not localized.
 * 
 *  
 *  
 *      
 *           Symbol
 *           Location
 *           Localized?
 *           Meaning
 *      
 *           0
 *           Number
 *           Yes
 *           Digit
 *      
 *           #
 *           Number
 *           Yes
 *           Digit, zero shows as absent
 *      
 *           .
 *           Number
 *           Yes
 *           Decimal separator or monetary decimal separator
 *      
 *           -
 *           Number
 *           Yes
 *           Minus sign
 *      
 *           ,
 *           Number
 *           Yes
 *           Grouping separator
 *      
 *           E
 *           Number
 *           Yes
 *           Separates mantissa and exponent in scientific notation.
 *               Need not be quoted in prefix or suffix.
 *      
 *           ;
 *           Subpattern boundary
 *           Yes
 *           Separates positive and negative subpatterns
 *      
 *           %
 *           Prefix or suffix
 *           Yes
 *           Multiply by 100 and show as percentage
 *      
 *           \u2030
 *           Prefix or suffix
 *           Yes
 *           Multiply by 1000 and show as per mille value
 *      
 *           ¤ (\u00A4)
 *           Prefix or suffix
 *           No
 *           Currency sign, replaced by currency symbol.  If
 *               doubled, replaced by international currency symbol.
 *               If present in a pattern, the monetary decimal separator
 *               is used instead of the decimal separator.
 *      
 *           '
 *           Prefix or suffix
 *           No
 *           Used to quote special characters in a prefix or suffix,
 *               for example, "'#'#" formats 123 to
 *               "#123".  To create a single quote
 *               itself, use two in a row: "# o''clock".
 *  
 *  
 * 
 *  Scientific Notation
 * 
 *  Numbers in scientific notation are expressed as the product of a mantissa
 *  and a power of ten, for example, 1234 can be expressed as 1.234 x 10^3.  The
 *  mantissa is often in the range 1.0 ≤ x < 10.0, but it need not
 *  be.
 *  DecimalFormat can be instructed to format and parse scientific
 *  notation only via a pattern; there is currently no factory method
 *  that creates a scientific notation format.  In a pattern, the exponent
 *  character immediately followed by one or more digit characters indicates
 *  scientific notation.  Example: "0.###E0" formats the number
 *  1234 as "1.234E3".
 * 
 *  
 *  The number of digit characters after the exponent character gives the
 *  minimum exponent digit count.  There is no maximum.  Negative exponents are
 *  formatted using the localized minus sign, not the prefix and suffix
 *  from the pattern.  This allows patterns such as "0.###E0 m/s".
 * 
 *  The minimum and maximum number of integer digits are interpreted
 *  together:
 * 
 *  
 *  If the maximum number of integer digits is greater than their minimum number
 *  and greater than 1, it forces the exponent to be a multiple of the maximum
 *  number of integer digits, and the minimum number of integer digits to be
 *  interpreted as 1.  The most common use of this is to generate
 *  engineering notation, in which the exponent is a multiple of three,
 *  e.g., "##0.#####E0". Using this pattern, the number 12345
 *  formats to "12.345E3", and 123456 formats to
 *  "123.456E3".
 * 
 *  Otherwise, the minimum number of integer digits is achieved by adjusting the
 *  exponent.  Example: 0.00123 formatted with "00.###E0" yields
 *  "12.3E-4".
 *  
 * 
 *  The number of significant digits in the mantissa is the sum of the
 *  minimum integer and maximum fraction digits, and is
 *  unaffected by the maximum integer digits.  For example, 12345 formatted with
 *  "##0.##E0" is "12.3E3". To show all digits, set
 *  the significant digits count to zero.  The number of significant digits
 *  does not affect parsing.
 * 
 *  Exponential patterns may not contain grouping separators.
 *  
 * 
 *  Rounding
 * 
 *  DecimalFormat provides rounding modes defined in
 *  RoundingMode for formatting.  By default, it uses
 *  RoundingMode.HALF_EVEN.
 * 
 *  Digits
 * 
 *  For formatting, DecimalFormat uses the ten consecutive
 *  characters starting with the localized zero digit defined in the
 *  DecimalFormatSymbols object as digits. For parsing, these
 *  digits as well as all Unicode decimal digits, as defined by
 *  Character.digit, are recognized.
 * 
 *  Special Values
 * 
 *  NaN is formatted as a string, which typically has a single character
 *  \uFFFD.  This string is determined by the
 *  DecimalFormatSymbols object.  This is the only value for which
 *  the prefixes and suffixes are not used.
 * 
 *  Infinity is formatted as a string, which typically has a single character
 *  \u221E, with the positive or negative prefixes and suffixes
 *  applied.  The infinity string is determined by the
 *  DecimalFormatSymbols object.
 * 
 *  Negative zero ("-0") parses to
 *  
 *  BigDecimal(0) if isParseBigDecimal() is
 *  true,
 *  Long(0) if isParseBigDecimal() is false
 *      and isParseIntegerOnly() is true,
 *  Double(-0.0) if both isParseBigDecimal()
 *  and isParseIntegerOnly() are false.
 *  
 * 
 *  Synchronization
 * 
 *  
 *  Decimal formats are generally not synchronized.
 *  It is recommended to create separate format instances for each thread.
 *  If multiple threads access a format concurrently, it must be synchronized
 *  externally.
 * 
 *  Example
 * 
 *  
 *  <strong>// Print out a number using the localized number, integer, currency,
 *  // and percent format for each locale</strong>
 *  Locale[] locales = NumberFormat.getAvailableLocales();
 *  double myNumber = -1234.56;
 *  NumberFormat form;
 *  for (int j = 0; j < 4; ++j) {
 *      System.out.println("FORMAT");
 *      for (int i = 0; i < locales.length; ++i) {
 *          if (locales[i].getCountry().length() == 0) {
 *             continue; // Skip language-only locales
 *          }
 *          System.out.print(locales[i].getDisplayName());
 *          switch (j) {
 *          case 0:
 *              form = NumberFormat.getInstance(locales[i]); break;
 *          case 1:
 *              form = NumberFormat.getIntegerInstance(locales[i]); break;
 *          case 2:
 *              form = NumberFormat.getCurrencyInstance(locales[i]); break;
 *          default:
 *              form = NumberFormat.getPercentInstance(locales[i]); break;
 *          }
 *          if (form instanceof DecimalFormat) {
 *              System.out.print(": " + ((DecimalFormat) form).toPattern());
 *          }
 *          System.out.print(" -> " + form.format(myNumber));
 *          try {
 *              System.out.println(" -> " + form.parse(form.format(myNumber)));
 *          } catch (ParseException e) {}
 *      }
 *  }
 *  
 */
class DecimalFormat extends NumberFormat {

    /** Creates a DecimalFormat using the default pattern and symbols
     *  for the default FORMAT locale.
     */
    @stub
    def this() = ???

    /** Creates a DecimalFormat using the given pattern and the symbols
     *  for the default FORMAT locale.
     */
    @stub
    def this(pattern: String) = ???

    /** Apply the given pattern to this Format object. */
    @stub
    def applyLocalizedPattern(pattern: String): Unit = ???

    /** Apply the given pattern to this Format object. */
    @stub
    def applyPattern(pattern: String): Unit = ???

    /** Standard override; no change in semantics. */
    @stub
    def clone(): Object = ???

    /** Overrides equals */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Formats a double to produce a string. */
    @stub
    def format(number: Double, result: StringBuffer, fieldPosition: FieldPosition): StringBuffer = ???

    /** Format a long to produce a string. */
    @stub
    def format(number: Long, result: StringBuffer, fieldPosition: FieldPosition): StringBuffer = ???

    /** Formats a number and appends the resulting text to the given string
     *  buffer.
     */
    @stub
    def format(number: Object, toAppendTo: StringBuffer, pos: FieldPosition): StringBuffer = ???

    /** Formats an Object producing an AttributedCharacterIterator. */
    @stub
    def formatToCharacterIterator(obj: Object): AttributedCharacterIterator = ???

    /** Gets the currency used by this decimal format when formatting
     *  currency values.
     */
    @stub
    def getCurrency(): Currency = ???

    /** Returns a copy of the decimal format symbols, which is generally not
     *  changed by the programmer or user.
     */
    @stub
    def getDecimalFormatSymbols(): DecimalFormatSymbols = ???

    /** Return the grouping size. */
    @stub
    def getGroupingSize(): Int = ???

    /** Gets the maximum number of digits allowed in the fraction portion of a
     *  number.
     */
    @stub
    def getMaximumFractionDigits(): Int = ???

    /** Gets the maximum number of digits allowed in the integer portion of a
     *  number.
     */
    @stub
    def getMaximumIntegerDigits(): Int = ???

    /** Gets the minimum number of digits allowed in the fraction portion of a
     *  number.
     */
    @stub
    def getMinimumFractionDigits(): Int = ???

    /** Gets the minimum number of digits allowed in the integer portion of a
     *  number.
     */
    @stub
    def getMinimumIntegerDigits(): Int = ???

    /** Gets the multiplier for use in percent, per mille, and similar
     *  formats.
     */
    @stub
    def getMultiplier(): Int = ???

    /** Get the negative prefix. */
    @stub
    def getNegativePrefix(): String = ???

    /** Get the negative suffix. */
    @stub
    def getNegativeSuffix(): String = ???

    /** Get the positive prefix. */
    @stub
    def getPositivePrefix(): String = ???

    /** Get the positive suffix. */
    @stub
    def getPositiveSuffix(): String = ???

    /** Gets the RoundingMode used in this DecimalFormat. */
    @stub
    def getRoundingMode(): RoundingMode = ???

    /** Overrides hashCode */
    @stub
    def hashCode(): Int = ???

    /** Allows you to get the behavior of the decimal separator with integers. */
    @stub
    def isDecimalSeparatorAlwaysShown(): Boolean = ???

    /** Returns whether the parse(java.lang.String, java.text.ParsePosition)
     *  method returns BigDecimal.
     */
    @stub
    def isParseBigDecimal(): Boolean = ???

    /** Parses text from a string to produce a Number. */
    @stub
    def parse(text: String, pos: ParsePosition): Number = ???

    /** Sets the currency used by this number format when formatting
     *  currency values.
     */
    @stub
    def setCurrency(currency: Currency): Unit = ???

    /** Sets the decimal format symbols, which is generally not changed
     *  by the programmer or user.
     */
    @stub
    def setDecimalFormatSymbols(newSymbols: DecimalFormatSymbols): Unit = ???

    /** Allows you to set the behavior of the decimal separator with integers. */
    @stub
    def setDecimalSeparatorAlwaysShown(newValue: Boolean): Unit = ???

    /** Set the grouping size. */
    @stub
    def setGroupingSize(newValue: Int): Unit = ???

    /** Set whether or not grouping will be used in this format. */
    @stub
    def setGroupingUsed(newValue: Boolean): Unit = ???

    /** Sets the maximum number of digits allowed in the fraction portion of a
     *  number.
     */
    @stub
    def setMaximumFractionDigits(newValue: Int): Unit = ???

    /** Sets the maximum number of digits allowed in the integer portion of a
     *  number.
     */
    @stub
    def setMaximumIntegerDigits(newValue: Int): Unit = ???

    /** Sets the minimum number of digits allowed in the fraction portion of a
     *  number.
     */
    @stub
    def setMinimumFractionDigits(newValue: Int): Unit = ???

    /** Sets the minimum number of digits allowed in the integer portion of a
     *  number.
     */
    @stub
    def setMinimumIntegerDigits(newValue: Int): Unit = ???

    /** Sets the multiplier for use in percent, per mille, and similar
     *  formats.
     */
    @stub
    def setMultiplier(newValue: Int): Unit = ???

    /** Set the negative prefix. */
    @stub
    def setNegativePrefix(newValue: String): Unit = ???

    /** Set the negative suffix. */
    @stub
    def setNegativeSuffix(newValue: String): Unit = ???

    /** Sets whether the parse(java.lang.String, java.text.ParsePosition)
     *  method returns BigDecimal.
     */
    @stub
    def setParseBigDecimal(newValue: Boolean): Unit = ???

    /** Set the positive prefix. */
    @stub
    def setPositivePrefix(newValue: String): Unit = ???

    /** Set the positive suffix. */
    @stub
    def setPositiveSuffix(newValue: String): Unit = ???

    /** Sets the RoundingMode used in this DecimalFormat. */
    @stub
    def setRoundingMode(roundingMode: RoundingMode): Unit = ???

    /** Synthesizes a localized pattern string that represents the current
     *  state of this Format object.
     */
    @stub
    def toLocalizedPattern(): String = ???
}
