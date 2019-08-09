package java.util

import java.io.{Closeable, File, IOException, InputStream}
import java.lang.{Object, Readable, String}
import java.math.{BigDecimal, BigInteger}
import java.nio.channels.ReadableByteChannel
import java.nio.file.Path
import java.util.regex.{MatchResult, Pattern}

/** A simple text scanner which can parse primitive types and strings using
 *  regular expressions.
 * 
 *  A Scanner breaks its input into tokens using a
 *  delimiter pattern, which by default matches whitespace. The resulting
 *  tokens may then be converted into values of different types using the
 *  various next methods.
 * 
 *  For example, this code allows a user to read a number from
 *  System.in:
 *  
 *      Scanner sc = new Scanner(System.in);
 *      int i = sc.nextInt();
 *  
 * 
 *  As another example, this code allows long types to be
 *  assigned from entries in a file myNumbers:
 *  
 *       Scanner sc = new Scanner(new File("myNumbers"));
 *       while (sc.hasNextLong()) {
 *           long aLong = sc.nextLong();
 *       }
 *  
 * 
 *  The scanner can also use delimiters other than whitespace. This
 *  example reads several items in from a string:
 *  
 *      String input = "1 fish 2 fish red fish blue fish";
 *      Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
 *      System.out.println(s.nextInt());
 *      System.out.println(s.nextInt());
 *      System.out.println(s.next());
 *      System.out.println(s.next());
 *      s.close();
 *  
 *  
 *  prints the following output:
 *  
 *      1
 *      2
 *      red
 *      blue
 *  
 * 
 *  The same output can be generated with this code, which uses a regular
 *  expression to parse all four tokens at once:
 *  
 *      String input = "1 fish 2 fish red fish blue fish";
 *      Scanner s = new Scanner(input);
 *      s.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
 *      MatchResult result = s.match();
 *      for (int i=1; i<=result.groupCount(); i++)
 *          System.out.println(result.group(i));
 *      s.close();
 *  
 * 
 *  The default whitespace delimiter used
 *  by a scanner is as recognized by Character.isWhitespace. The reset()
 *  method will reset the value of the scanner's delimiter to the default
 *  whitespace delimiter regardless of whether it was previously changed.
 * 
 *  A scanning operation may block waiting for input.
 * 
 *  The next() and hasNext() methods and their
 *  primitive-type companion methods (such as nextInt() and
 *  hasNextInt()) first skip any input that matches the delimiter
 *  pattern, and then attempt to return the next token. Both hasNext
 *  and next methods may block waiting for further input.  Whether a
 *  hasNext method blocks has no connection to whether or not its
 *  associated next method will block.
 * 
 *   The findInLine(java.lang.String), findWithinHorizon(java.lang.String, int), and skip(java.util.regex.Pattern)
 *  methods operate independently of the delimiter pattern. These methods will
 *  attempt to match the specified pattern with no regard to delimiters in the
 *  input and thus can be used in special circumstances where delimiters are
 *  not relevant. These methods may block waiting for more input.
 * 
 *  When a scanner throws an InputMismatchException, the scanner
 *  will not pass the token that caused the exception, so that it may be
 *  retrieved or skipped via some other method.
 * 
 *  Depending upon the type of delimiting pattern, empty tokens may be
 *  returned. For example, the pattern "\\s+" will return no empty
 *  tokens since it matches multiple instances of the delimiter. The delimiting
 *  pattern "\\s" could return empty tokens since it only passes one
 *  space at a time.
 * 
 *   A scanner can read text from any object which implements the Readable interface.  If an invocation of the underlying
 *  readable's Readable.read(java.nio.CharBuffer) method throws an IOException then the scanner assumes that the end of the input
 *  has been reached.  The most recent IOException thrown by the
 *  underlying readable can be retrieved via the ioException() method.
 * 
 *  When a Scanner is closed, it will close its input source
 *  if the source implements the Closeable interface.
 * 
 *  A Scanner is not safe for multithreaded use without
 *  external synchronization.
 * 
 *  Unless otherwise mentioned, passing a null parameter into
 *  any method of a Scanner will cause a
 *  NullPointerException to be thrown.
 * 
 *  A scanner will default to interpreting numbers as decimal unless a
 *  different radix has been set by using the useRadix(int) method. The
 *  reset() method will reset the value of the scanner's radix to
 *  10 regardless of whether it was previously changed.
 * 
 *   Localized numbers 
 * 
 *   An instance of this class is capable of scanning numbers in the standard
 *  formats as well as in the formats of the scanner's locale. A scanner's
 *  initial locale is the value returned by the Locale.getDefault(Locale.Category.FORMAT) method; it may be changed via the useLocale(java.util.Locale) method. The reset() method will reset the value of the
 *  scanner's locale to the initial locale regardless of whether it was
 *  previously changed.
 * 
 *  The localized formats are defined in terms of the following parameters,
 *  which for a particular locale are taken from that locale's DecimalFormat object, df, and its and
 *  DecimalFormatSymbols object,
 *  dfs.
 * 
 *  
 *      LocalGroupSeparator  
 *          The character used to separate thousands groups,
 *          i.e., dfs.getGroupingSeparator()
 *      LocalDecimalSeparator  
 *          The character used for the decimal point,
 *      i.e., dfs.getDecimalSeparator()
 *      LocalPositivePrefix  
 *          The string that appears before a positive number (may
 *          be empty), i.e., df.getPositivePrefix()
 *      LocalPositiveSuffix  
 *          The string that appears after a positive number (may be
 *          empty), i.e., df.getPositiveSuffix()
 *      LocalNegativePrefix  
 *          The string that appears before a negative number (may
 *          be empty), i.e., df.getNegativePrefix()
 *      LocalNegativeSuffix  
 *          The string that appears after a negative number (may be
 *          empty), i.e., df.getNegativeSuffix()
 *      LocalNaN  
 *          The string that represents not-a-number for
 *          floating-point values,
 *          i.e., dfs.getNaN()
 *      LocalInfinity  
 *          The string that represents infinity for floating-point
 *          values, i.e., dfs.getInfinity()
 *  
 * 
 *   Number syntax 
 * 
 *   The strings that can be parsed as numbers by an instance of this class
 *  are specified in terms of the following regular-expression grammar, where
 *  Rmax is the highest digit in the radix being used (for example, Rmax is 9 in base 10).
 * 
 *  
 *    NonAsciiDigit:
 *        A non-ASCII character c for which
 *             Character.isDigit(c)
 *                         returns true
 * 
 *    Non0Digit:
 *        [1-Rmax] | NonASCIIDigit
 * 
 *    Digit:
 *        [0-Rmax] | NonASCIIDigit
 * 
 *    GroupedNumeral:
 *        ( Non0Digit
 *                    Digit?
 *                    Digit?
 *            ( LocalGroupSeparator
 *                          Digit
 *                          Digit
 *                          Digit )+ )
 * 
 *    Numeral:
 *        ( ( Digit+ )
 *                | GroupedNumeral )
 * 
 *    Integer:
 *        ( [-+]? ( Numeral
 *                                ) )
 *        | LocalPositivePrefix Numeral
 *                       LocalPositiveSuffix
 *        | LocalNegativePrefix Numeral
 *                  LocalNegativeSuffix
 * 
 *    DecimalNumeral:
 *        Numeral
 *        | Numeral
 *                  LocalDecimalSeparator
 *                  Digit*
 *        | LocalDecimalSeparator
 *                  Digit+
 * 
 *    Exponent:
 *        ( [eE] [+-]? Digit+ )
 * 
 *    Decimal:
 *        ( [-+]? DecimalNumeral
 *                          Exponent? )
 *        | LocalPositivePrefix
 *                  DecimalNumeral
 *                  LocalPositiveSuffix
 *                  Exponent?
 *        | LocalNegativePrefix
 *                  DecimalNumeral
 *                  LocalNegativeSuffix
 *                  Exponent?
 * 
 *    HexFloat:
 *        [-+]? 0[xX][0-9a-fA-F]*\.[0-9a-fA-F]+
 *                  ([pP][-+]?[0-9]+)?
 * 
 *    NonNumber:
 *        NaN
 *                           | LocalNan
 *                           | Infinity
 *                           | LocalInfinity
 * 
 *    SignedNonNumber:
 *        ( [-+]? NonNumber )
 *        | LocalPositivePrefix
 *                  NonNumber
 *                  LocalPositiveSuffix
 *        | LocalNegativePrefix
 *                  NonNumber
 *                  LocalNegativeSuffix
 * 
 *    Float:
 *        Decimal
 *            | HexFloat
 *            | SignedNonNumber
 * 
 *  
 *  Whitespace is not significant in the above regular expressions.
 */
final class Scanner extends Object with Iterator[String] with Closeable {

    /** Constructs a new Scanner that produces values scanned
     *  from the specified file.
     */
    @stub
    def this(source: File) = ???

    /** Constructs a new Scanner that produces values scanned
     *  from the specified file.
     */
    @stub
    def this(source: File, charsetName: String) = ???

    /** Constructs a new Scanner that produces values scanned
     *  from the specified input stream.
     */
    @stub
    def this(source: InputStream) = ???

    /** Constructs a new Scanner that produces values scanned
     *  from the specified input stream.
     */
    @stub
    def this(source: InputStream, charsetName: String) = ???

    /** Constructs a new Scanner that produces values scanned
     *  from the specified file.
     */
    @stub
    def this(source: Path) = ???

    /** Constructs a new Scanner that produces values scanned
     *  from the specified file.
     */
    @stub
    def this(source: Path, charsetName: String) = ???

    /** Constructs a new Scanner that produces values scanned
     *  from the specified source.
     */
    @stub
    def this(source: Readable) = ???

    /** Constructs a new Scanner that produces values scanned
     *  from the specified channel.
     */
    @stub
    def this(source: ReadableByteChannel) = ???

    /** Constructs a new Scanner that produces values scanned
     *  from the specified channel.
     */
    @stub
    def this(source: ReadableByteChannel, charsetName: String) = ???

    /** Closes this scanner. */
    @stub
    def close(): Unit = ???

    /** Returns the Pattern this Scanner is currently
     *  using to match delimiters.
     */
    @stub
    def delimiter(): Pattern = ???

    /** Attempts to find the next occurrence of the specified pattern ignoring
     *  delimiters.
     */
    @stub
    def findInLine(pattern: Pattern): String = ???

    /** Attempts to find the next occurrence of a pattern constructed from the
     *  specified string, ignoring delimiters.
     */
    @stub
    def findInLine(pattern: String): String = ???

    /** Attempts to find the next occurrence of the specified pattern. */
    @stub
    def findWithinHorizon(pattern: Pattern, horizon: Int): String = ???

    /** Attempts to find the next occurrence of a pattern constructed from the
     *  specified string, ignoring delimiters.
     */
    @stub
    def findWithinHorizon(pattern: String, horizon: Int): String = ???

    /** Returns true if this scanner has another token in its input. */
    @stub
    def hasNext(): Boolean = ???

    /** Returns true if the next complete token matches the specified pattern. */
    @stub
    def hasNext(pattern: Pattern): Boolean = ???

    /** Returns true if the next token matches the pattern constructed from the
     *  specified string.
     */
    @stub
    def hasNext(pattern: String): Boolean = ???

    /** Returns true if the next token in this scanner's input can be
     *  interpreted as a BigDecimal using the
     *  nextBigDecimal() method.
     */
    @stub
    def hasNextBigDecimal(): Boolean = ???

    /** Returns true if the next token in this scanner's input can be
     *  interpreted as a BigInteger in the default radix using the
     *  nextBigInteger() method.
     */
    @stub
    def hasNextBigInteger(): Boolean = ???

    /** Returns true if the next token in this scanner's input can be
     *  interpreted as a BigInteger in the specified radix using
     *  the nextBigInteger() method.
     */
    @stub
    def hasNextBigInteger(radix: Int): Boolean = ???

    /** Returns true if the next token in this scanner's input can be
     *  interpreted as a boolean value using a case insensitive pattern
     *  created from the string "true|false".
     */
    @stub
    def hasNextBoolean(): Boolean = ???

    /** Returns true if the next token in this scanner's input can be
     *  interpreted as a byte value in the default radix using the
     *  nextByte() method.
     */
    @stub
    def hasNextByte(): Boolean = ???

    /** Returns true if the next token in this scanner's input can be
     *  interpreted as a byte value in the specified radix using the
     *  nextByte() method.
     */
    @stub
    def hasNextByte(radix: Int): Boolean = ???

    /** Returns true if the next token in this scanner's input can be
     *  interpreted as a double value using the nextDouble()
     *  method.
     */
    @stub
    def hasNextDouble(): Boolean = ???

    /** Returns true if the next token in this scanner's input can be
     *  interpreted as a float value using the nextFloat()
     *  method.
     */
    @stub
    def hasNextFloat(): Boolean = ???

    /** Returns true if the next token in this scanner's input can be
     *  interpreted as an int value in the default radix using the
     *  nextInt() method.
     */
    @stub
    def hasNextInt(): Boolean = ???

    /** Returns true if the next token in this scanner's input can be
     *  interpreted as an int value in the specified radix using the
     *  nextInt() method.
     */
    @stub
    def hasNextInt(radix: Int): Boolean = ???

    /** Returns true if there is another line in the input of this scanner. */
    @stub
    def hasNextLine(): Boolean = ???

    /** Returns true if the next token in this scanner's input can be
     *  interpreted as a long value in the default radix using the
     *  nextLong() method.
     */
    @stub
    def hasNextLong(): Boolean = ???

    /** Returns true if the next token in this scanner's input can be
     *  interpreted as a long value in the specified radix using the
     *  nextLong() method.
     */
    @stub
    def hasNextLong(radix: Int): Boolean = ???

    /** Returns true if the next token in this scanner's input can be
     *  interpreted as a short value in the default radix using the
     *  nextShort() method.
     */
    @stub
    def hasNextShort(): Boolean = ???

    /** Returns true if the next token in this scanner's input can be
     *  interpreted as a short value in the specified radix using the
     *  nextShort() method.
     */
    @stub
    def hasNextShort(radix: Int): Boolean = ???

    /** Returns the IOException last thrown by this
     *  Scanner's underlying Readable.
     */
    @stub
    def ioException(): IOException = ???

    /** Returns this scanner's locale. */
    @stub
    def locale(): Locale = ???

    /** Returns the match result of the last scanning operation performed
     *  by this scanner.
     */
    @stub
    def match(): MatchResult = ???

    /** Finds and returns the next complete token from this scanner. */
    @stub
    def next(): String = ???

    /** Returns the next token if it matches the specified pattern. */
    @stub
    def next(pattern: Pattern): String = ???

    /** Returns the next token if it matches the pattern constructed from the
     *  specified string.
     */
    @stub
    def next(pattern: String): String = ???

    /** Scans the next token of the input as a BigDecimal. */
    @stub
    def nextBigDecimal(): BigDecimal = ???

    /** Scans the next token of the input as a BigInteger. */
    @stub
    def nextBigInteger(): BigInteger = ???

    /** Scans the next token of the input as a BigInteger. */
    @stub
    def nextBigInteger(radix: Int): BigInteger = ???

    /** Scans the next token of the input into a boolean value and returns
     *  that value.
     */
    @stub
    def nextBoolean(): Boolean = ???

    /** Scans the next token of the input as a byte. */
    @stub
    def nextByte(): Byte = ???

    /** Scans the next token of the input as a byte. */
    @stub
    def nextByte(radix: Int): Byte = ???

    /** Scans the next token of the input as a double. */
    @stub
    def nextDouble(): Double = ???

    /** Scans the next token of the input as a float. */
    @stub
    def nextFloat(): Float = ???

    /** Scans the next token of the input as an int. */
    @stub
    def nextInt(): Int = ???

    /** Scans the next token of the input as an int. */
    @stub
    def nextInt(radix: Int): Int = ???

    /** Advances this scanner past the current line and returns the input
     *  that was skipped.
     */
    @stub
    def nextLine(): String = ???

    /** Scans the next token of the input as a long. */
    @stub
    def nextLong(): Long = ???

    /** Scans the next token of the input as a long. */
    @stub
    def nextLong(radix: Int): Long = ???

    /** Scans the next token of the input as a short. */
    @stub
    def nextShort(): Short = ???

    /** Scans the next token of the input as a short. */
    @stub
    def nextShort(radix: Int): Short = ???

    /** Returns this scanner's default radix. */
    @stub
    def radix(): Int = ???

    /** The remove operation is not supported by this implementation of
     *  Iterator.
     */
    @stub
    def remove(): Unit = ???

    /** Resets this scanner. */
    @stub
    def reset(): Scanner = ???

    /** Skips input that matches the specified pattern, ignoring delimiters. */
    @stub
    def skip(pattern: Pattern): Scanner = ???

    /** Skips input that matches a pattern constructed from the specified
     *  string.
     */
    @stub
    def skip(pattern: String): Scanner = ???

    /** Returns the string representation of this Scanner. */
    @stub
    def toString(): String = ???

    /** Sets this scanner's delimiting pattern to the specified pattern. */
    @stub
    def useDelimiter(pattern: Pattern): Scanner = ???

    /** Sets this scanner's delimiting pattern to a pattern constructed from
     *  the specified String.
     */
    @stub
    def useDelimiter(pattern: String): Scanner = ???

    /** Sets this scanner's locale to the specified locale. */
    @stub
    def useLocale(locale: Locale): Scanner = ???
}
