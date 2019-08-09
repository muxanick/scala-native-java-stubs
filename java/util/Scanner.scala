package java.util

import java.io.{Closeable, File, IOException, InputStream}
import java.lang.{Object, Readable, String}
import java.math.{BigDecimal, BigInteger}
import java.nio.channels.ReadableByteChannel
import java.nio.file.Path
import java.util.regex.{MatchResult, Pattern}

// A simple text scanner which can parse primitive types and strings using
// regular expressions.
//
// A Scanner breaks its input into tokens using a
// delimiter pattern, which by default matches whitespace. The resulting
// tokens may then be converted into values of different types using the
// various next methods.
//
// For example, this code allows a user to read a number from
// System.in:
// 
//     Scanner sc = new Scanner(System.in);
//     int i = sc.nextInt();
// 
//
// As another example, this code allows long types to be
// assigned from entries in a file myNumbers:
// 
//      Scanner sc = new Scanner(new File("myNumbers"));
//      while (sc.hasNextLong()) {
//          long aLong = sc.nextLong();
//      }
// 
//
// The scanner can also use delimiters other than whitespace. This
// example reads several items in from a string:
// 
//     String input = "1 fish 2 fish red fish blue fish";
//     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
//     System.out.println(s.nextInt());
//     System.out.println(s.nextInt());
//     System.out.println(s.next());
//     System.out.println(s.next());
//     s.close();
// 
// 
// prints the following output:
// 
//     1
//     2
//     red
//     blue
// 
//
// The same output can be generated with this code, which uses a regular
// expression to parse all four tokens at once:
// 
//     String input = "1 fish 2 fish red fish blue fish";
//     Scanner s = new Scanner(input);
//     s.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
//     MatchResult result = s.match();
//     for (int i=1; i<=result.groupCount(); i++)
//         System.out.println(result.group(i));
//     s.close();
// 
//
// The default whitespace delimiter used
// by a scanner is as recognized by Character.isWhitespace. The reset()
// method will reset the value of the scanner's delimiter to the default
// whitespace delimiter regardless of whether it was previously changed.
//
// A scanning operation may block waiting for input.
//
// The next() and hasNext() methods and their
// primitive-type companion methods (such as nextInt() and
// hasNextInt()) first skip any input that matches the delimiter
// pattern, and then attempt to return the next token. Both hasNext
// and next methods may block waiting for further input.  Whether a
// hasNext method blocks has no connection to whether or not its
// associated next method will block.
//
//  The findInLine(java.lang.String), findWithinHorizon(java.lang.String, int), and skip(java.util.regex.Pattern)
// methods operate independently of the delimiter pattern. These methods will
// attempt to match the specified pattern with no regard to delimiters in the
// input and thus can be used in special circumstances where delimiters are
// not relevant. These methods may block waiting for more input.
//
// When a scanner throws an InputMismatchException, the scanner
// will not pass the token that caused the exception, so that it may be
// retrieved or skipped via some other method.
//
// Depending upon the type of delimiting pattern, empty tokens may be
// returned. For example, the pattern "\\s+" will return no empty
// tokens since it matches multiple instances of the delimiter. The delimiting
// pattern "\\s" could return empty tokens since it only passes one
// space at a time.
//
//  A scanner can read text from any object which implements the Readable interface.  If an invocation of the underlying
// readable's Readable.read(java.nio.CharBuffer) method throws an IOException then the scanner assumes that the end of the input
// has been reached.  The most recent IOException thrown by the
// underlying readable can be retrieved via the ioException() method.
//
// When a Scanner is closed, it will close its input source
// if the source implements the Closeable interface.
//
// A Scanner is not safe for multithreaded use without
// external synchronization.
//
// Unless otherwise mentioned, passing a null parameter into
// any method of a Scanner will cause a
// NullPointerException to be thrown.
//
// A scanner will default to interpreting numbers as decimal unless a
// different radix has been set by using the useRadix(int) method. The
// reset() method will reset the value of the scanner's radix to
// 10 regardless of whether it was previously changed.
//
//  Localized numbers 
//
//  An instance of this class is capable of scanning numbers in the standard
// formats as well as in the formats of the scanner's locale. A scanner's
// initial locale is the value returned by the Locale.getDefault(Locale.Category.FORMAT) method; it may be changed via the useLocale(java.util.Locale) method. The reset() method will reset the value of the
// scanner's locale to the initial locale regardless of whether it was
// previously changed.
//
// The localized formats are defined in terms of the following parameters,
// which for a particular locale are taken from that locale's DecimalFormat object, df, and its and
// DecimalFormatSymbols object,
// dfs.
//
// 
//     LocalGroupSeparator  
//         The character used to separate thousands groups,
//         i.e., dfs.getGroupingSeparator()
//     LocalDecimalSeparator  
//         The character used for the decimal point,
//     i.e., dfs.getDecimalSeparator()
//     LocalPositivePrefix  
//         The string that appears before a positive number (may
//         be empty), i.e., df.getPositivePrefix()
//     LocalPositiveSuffix  
//         The string that appears after a positive number (may be
//         empty), i.e., df.getPositiveSuffix()
//     LocalNegativePrefix  
//         The string that appears before a negative number (may
//         be empty), i.e., df.getNegativePrefix()
//     LocalNegativeSuffix  
//         The string that appears after a negative number (may be
//         empty), i.e., df.getNegativeSuffix()
//     LocalNaN  
//         The string that represents not-a-number for
//         floating-point values,
//         i.e., dfs.getNaN()
//     LocalInfinity  
//         The string that represents infinity for floating-point
//         values, i.e., dfs.getInfinity()
// 
//
//  Number syntax 
//
//  The strings that can be parsed as numbers by an instance of this class
// are specified in terms of the following regular-expression grammar, where
// Rmax is the highest digit in the radix being used (for example, Rmax is 9 in base 10).
//
// 
//   NonAsciiDigit:
//       A non-ASCII character c for which
//            Character.isDigit(c)
//                        returns true
//
//   Non0Digit:
//       [1-Rmax] | NonASCIIDigit
//
//   Digit:
//       [0-Rmax] | NonASCIIDigit
//
//   GroupedNumeral:
//       ( Non0Digit
//                   Digit?
//                   Digit?
//           ( LocalGroupSeparator
//                         Digit
//                         Digit
//                         Digit )+ )
//
//   Numeral:
//       ( ( Digit+ )
//               | GroupedNumeral )
//
//   Integer:
//       ( [-+]? ( Numeral
//                               ) )
//       | LocalPositivePrefix Numeral
//                      LocalPositiveSuffix
//       | LocalNegativePrefix Numeral
//                 LocalNegativeSuffix
//
//   DecimalNumeral:
//       Numeral
//       | Numeral
//                 LocalDecimalSeparator
//                 Digit*
//       | LocalDecimalSeparator
//                 Digit+
//
//   Exponent:
//       ( [eE] [+-]? Digit+ )
//
//   Decimal:
//       ( [-+]? DecimalNumeral
//                         Exponent? )
//       | LocalPositivePrefix
//                 DecimalNumeral
//                 LocalPositiveSuffix
//                 Exponent?
//       | LocalNegativePrefix
//                 DecimalNumeral
//                 LocalNegativeSuffix
//                 Exponent?
//
//   HexFloat:
//       [-+]? 0[xX][0-9a-fA-F]*\.[0-9a-fA-F]+
//                 ([pP][-+]?[0-9]+)?
//
//   NonNumber:
//       NaN
//                          | LocalNan
//                          | Infinity
//                          | LocalInfinity
//
//   SignedNonNumber:
//       ( [-+]? NonNumber )
//       | LocalPositivePrefix
//                 NonNumber
//                 LocalPositiveSuffix
//       | LocalNegativePrefix
//                 NonNumber
//                 LocalNegativeSuffix
//
//   Float:
//       Decimal
//           | HexFloat
//           | SignedNonNumber
//
// 
// Whitespace is not significant in the above regular expressions.
final class Scanner extends Object with Iterator[String], with Closeable {

    @stub
    // Constructs a new Scanner that produces values scanned
    // from the specified file.
    def this(source: File) = ???

    @stub
    // Constructs a new Scanner that produces values scanned
    // from the specified file.
    def this(source: File, charsetName: String) = ???

    @stub
    // Constructs a new Scanner that produces values scanned
    // from the specified input stream.
    def this(source: InputStream) = ???

    @stub
    // Constructs a new Scanner that produces values scanned
    // from the specified input stream.
    def this(source: InputStream, charsetName: String) = ???

    @stub
    // Constructs a new Scanner that produces values scanned
    // from the specified file.
    def this(source: Path) = ???

    @stub
    // Constructs a new Scanner that produces values scanned
    // from the specified file.
    def this(source: Path, charsetName: String) = ???

    @stub
    // Constructs a new Scanner that produces values scanned
    // from the specified source.
    def this(source: Readable) = ???

    @stub
    // Constructs a new Scanner that produces values scanned
    // from the specified channel.
    def this(source: ReadableByteChannel) = ???

    @stub
    // Constructs a new Scanner that produces values scanned
    // from the specified channel.
    def this(source: ReadableByteChannel, charsetName: String) = ???

    @stub
    // Closes this scanner.
    def close(): Unit = ???

    @stub
    // Returns the Pattern this Scanner is currently
    // using to match delimiters.
    def delimiter(): Pattern = ???

    @stub
    // Attempts to find the next occurrence of the specified pattern ignoring
    // delimiters.
    def findInLine(pattern: Pattern): String = ???

    @stub
    // Attempts to find the next occurrence of a pattern constructed from the
    // specified string, ignoring delimiters.
    def findInLine(pattern: String): String = ???

    @stub
    // Attempts to find the next occurrence of the specified pattern.
    def findWithinHorizon(pattern: Pattern, horizon: Int): String = ???

    @stub
    // Attempts to find the next occurrence of a pattern constructed from the
    // specified string, ignoring delimiters.
    def findWithinHorizon(pattern: String, horizon: Int): String = ???

    @stub
    // Returns true if this scanner has another token in its input.
    def hasNext(): Boolean = ???

    @stub
    // Returns true if the next complete token matches the specified pattern.
    def hasNext(pattern: Pattern): Boolean = ???

    @stub
    // Returns true if the next token matches the pattern constructed from the
    // specified string.
    def hasNext(pattern: String): Boolean = ???

    @stub
    // Returns true if the next token in this scanner's input can be
    // interpreted as a BigDecimal using the
    // nextBigDecimal() method.
    def hasNextBigDecimal(): Boolean = ???

    @stub
    // Returns true if the next token in this scanner's input can be
    // interpreted as a BigInteger in the default radix using the
    // nextBigInteger() method.
    def hasNextBigInteger(): Boolean = ???

    @stub
    // Returns true if the next token in this scanner's input can be
    // interpreted as a BigInteger in the specified radix using
    // the nextBigInteger() method.
    def hasNextBigInteger(radix: Int): Boolean = ???

    @stub
    // Returns true if the next token in this scanner's input can be
    // interpreted as a boolean value using a case insensitive pattern
    // created from the string "true|false".
    def hasNextBoolean(): Boolean = ???

    @stub
    // Returns true if the next token in this scanner's input can be
    // interpreted as a byte value in the default radix using the
    // nextByte() method.
    def hasNextByte(): Boolean = ???

    @stub
    // Returns true if the next token in this scanner's input can be
    // interpreted as a byte value in the specified radix using the
    // nextByte() method.
    def hasNextByte(radix: Int): Boolean = ???

    @stub
    // Returns true if the next token in this scanner's input can be
    // interpreted as a double value using the nextDouble()
    // method.
    def hasNextDouble(): Boolean = ???

    @stub
    // Returns true if the next token in this scanner's input can be
    // interpreted as a float value using the nextFloat()
    // method.
    def hasNextFloat(): Boolean = ???

    @stub
    // Returns true if the next token in this scanner's input can be
    // interpreted as an int value in the default radix using the
    // nextInt() method.
    def hasNextInt(): Boolean = ???

    @stub
    // Returns true if the next token in this scanner's input can be
    // interpreted as an int value in the specified radix using the
    // nextInt() method.
    def hasNextInt(radix: Int): Boolean = ???

    @stub
    // Returns true if there is another line in the input of this scanner.
    def hasNextLine(): Boolean = ???

    @stub
    // Returns true if the next token in this scanner's input can be
    // interpreted as a long value in the default radix using the
    // nextLong() method.
    def hasNextLong(): Boolean = ???

    @stub
    // Returns true if the next token in this scanner's input can be
    // interpreted as a long value in the specified radix using the
    // nextLong() method.
    def hasNextLong(radix: Int): Boolean = ???

    @stub
    // Returns true if the next token in this scanner's input can be
    // interpreted as a short value in the default radix using the
    // nextShort() method.
    def hasNextShort(): Boolean = ???

    @stub
    // Returns true if the next token in this scanner's input can be
    // interpreted as a short value in the specified radix using the
    // nextShort() method.
    def hasNextShort(radix: Int): Boolean = ???

    @stub
    // Returns the IOException last thrown by this
    // Scanner's underlying Readable.
    def ioException(): IOException = ???

    @stub
    // Returns this scanner's locale.
    def locale(): Locale = ???

    @stub
    // Returns the match result of the last scanning operation performed
    // by this scanner.
    def match(): MatchResult = ???

    @stub
    // Finds and returns the next complete token from this scanner.
    def next(): String = ???

    @stub
    // Returns the next token if it matches the specified pattern.
    def next(pattern: Pattern): String = ???

    @stub
    // Returns the next token if it matches the pattern constructed from the
    // specified string.
    def next(pattern: String): String = ???

    @stub
    // Scans the next token of the input as a BigDecimal.
    def nextBigDecimal(): BigDecimal = ???

    @stub
    // Scans the next token of the input as a BigInteger.
    def nextBigInteger(): BigInteger = ???

    @stub
    // Scans the next token of the input as a BigInteger.
    def nextBigInteger(radix: Int): BigInteger = ???

    @stub
    // Scans the next token of the input into a boolean value and returns
    // that value.
    def nextBoolean(): Boolean = ???

    @stub
    // Scans the next token of the input as a byte.
    def nextByte(): Byte = ???

    @stub
    // Scans the next token of the input as a byte.
    def nextByte(radix: Int): Byte = ???

    @stub
    // Scans the next token of the input as a double.
    def nextDouble(): double = ???

    @stub
    // Scans the next token of the input as a float.
    def nextFloat(): float = ???

    @stub
    // Scans the next token of the input as an int.
    def nextInt(): Int = ???

    @stub
    // Scans the next token of the input as an int.
    def nextInt(radix: Int): Int = ???

    @stub
    // Advances this scanner past the current line and returns the input
    // that was skipped.
    def nextLine(): String = ???

    @stub
    // Scans the next token of the input as a long.
    def nextLong(): Long = ???

    @stub
    // Scans the next token of the input as a long.
    def nextLong(radix: Int): Long = ???

    @stub
    // Scans the next token of the input as a short.
    def nextShort(): Short = ???

    @stub
    // Scans the next token of the input as a short.
    def nextShort(radix: Int): Short = ???

    @stub
    // Returns this scanner's default radix.
    def radix(): Int = ???

    @stub
    // The remove operation is not supported by this implementation of
    // Iterator.
    def remove(): Unit = ???

    @stub
    // Resets this scanner.
    def reset(): Scanner = ???

    @stub
    // Skips input that matches the specified pattern, ignoring delimiters.
    def skip(pattern: Pattern): Scanner = ???

    @stub
    // Skips input that matches a pattern constructed from the specified
    // string.
    def skip(pattern: String): Scanner = ???

    @stub
    // Returns the string representation of this Scanner.
    def toString(): String = ???

    @stub
    // Sets this scanner's delimiting pattern to the specified pattern.
    def useDelimiter(pattern: Pattern): Scanner = ???

    @stub
    // Sets this scanner's delimiting pattern to a pattern constructed from
    // the specified String.
    def useDelimiter(pattern: String): Scanner = ???

    @stub
    // Sets this scanner's locale to the specified locale.
    def useLocale(locale: Locale): Scanner = ???
}
