package java.text

import java.lang.{Object, String, StringBuffer}
import java.util.Locale

/** MessageFormat provides a means to produce concatenated
 *  messages in a language-neutral way. Use this to construct messages
 *  displayed for end users.
 * 
 *  
 *  MessageFormat takes a set of objects, formats them, then
 *  inserts the formatted strings into the pattern at the appropriate places.
 * 
 *  
 *  Note:
 *  MessageFormat differs from the other Format
 *  classes in that you create a MessageFormat object with one
 *  of its constructors (not with a getInstance style factory
 *  method). The factory methods aren't necessary because MessageFormat
 *  itself doesn't implement locale specific behavior. Any locale specific
 *  behavior is defined by the pattern that you provide as well as the
 *  subformats used for inserted arguments.
 * 
 *  Patterns and Their Interpretation
 * 
 *  MessageFormat uses patterns of the following form:
 *  
 *  MessageFormatPattern:
 *          String
 *          MessageFormatPattern FormatElement String
 * 
 *  FormatElement:
 *          { ArgumentIndex }
 *          { ArgumentIndex , FormatType }
 *          { ArgumentIndex , FormatType , FormatStyle }
 * 
 *  FormatType: one of 
 *          number date time choice
 * 
 *  FormatStyle:
 *          short
 *          medium
 *          long
 *          full
 *          integer
 *          currency
 *          percent
 *          SubformatPattern
 *  
 * 
 *  Within a String, a pair of single quotes can be used to
 *  quote any arbitrary characters except single quotes. For example,
 *  pattern string "'{0}'" represents string
 *  "{0}", not a FormatElement. A single quote itself
 *  must be represented by doubled single quotes '' throughout a
 *  String.  For example, pattern string "'{''}'" is
 *  interpreted as a sequence of '{ (start of quoting and a
 *  left curly brace), '' (a single quote), and
 *  }' (a right curly brace and end of quoting),
 *  not '{' and '}' (quoted left and
 *  right curly braces): representing string "{'}",
 *  not "{}".
 * 
 *  A SubformatPattern is interpreted by its corresponding
 *  subformat, and subformat-dependent pattern rules apply. For example,
 *  pattern string "{1,number,$'#',##}"
 *  (SubformatPattern with underline) will produce a number format
 *  with the pound-sign quoted, with a result such as: "$#31,45". Refer to each Format subclass documentation for
 *  details.
 * 
 *  Any unmatched quote is treated as closed at the end of the given
 *  pattern. For example, pattern string "'{0}" is treated as
 *  pattern "'{0}'".
 * 
 *  Any curly braces within an unquoted pattern must be balanced. For
 *  example, "ab {0} de" and "ab '}' de" are
 *  valid patterns, but "ab {0'}' de", "ab } de"
 *  and "''{''" are not.
 * 
 *  Warning:The rules for using quotes within message
 *  format patterns unfortunately have shown to be somewhat confusing.
 *  In particular, it isn't always obvious to localizers whether single
 *  quotes need to be doubled or not. Make sure to inform localizers about
 *  the rules, and tell them (for example, by using comments in resource
 *  bundle source files) which strings will be processed by MessageFormat.
 *  Note that localizers may need to use single quotes in translated
 *  strings where the original version doesn't have them.
 *  
 *  
 *  The ArgumentIndex value is a non-negative integer written
 *  using the digits '0' through '9', and represents an index into the
 *  arguments array passed to the format methods
 *  or the result array returned by the parse methods.
 *  
 *  The FormatType and FormatStyle values are used to create
 *  a Format instance for the format element. The following
 *  table shows how the values map to Format instances. Combinations not
 *  shown in the table are illegal. A SubformatPattern must
 *  be a valid pattern string for the Format subclass used.
 * 
 *  
 *     
 *        FormatType
 *        FormatStyle
 *        Subformat Created
 *     
 *        (none)
 *        (none)
 *        null
 *     
 *        number
 *        (none)
 *        NumberFormat.getInstance(getLocale())
 *     
 *        integer
 *        NumberFormat.getIntegerInstance(getLocale())
 *     
 *        currency
 *        NumberFormat.getCurrencyInstance(getLocale())
 *     
 *        percent
 *        NumberFormat.getPercentInstance(getLocale())
 *     
 *        SubformatPattern
 *        new DecimalFormat(subformatPattern, DecimalFormatSymbols.getInstance(getLocale()))
 *     
 *        date
 *        (none)
 *        DateFormat.getDateInstance(DateFormat.DEFAULT, getLocale())
 *     
 *        short
 *        DateFormat.getDateInstance(DateFormat.SHORT, getLocale())
 *     
 *        medium
 *        DateFormat.getDateInstance(DateFormat.DEFAULT, getLocale())
 *     
 *        long
 *        DateFormat.getDateInstance(DateFormat.LONG, getLocale())
 *     
 *        full
 *        DateFormat.getDateInstance(DateFormat.FULL, getLocale())
 *     
 *        SubformatPattern
 *        new SimpleDateFormat(subformatPattern, getLocale())
 *     
 *        time
 *        (none)
 *        DateFormat.getTimeInstance(DateFormat.DEFAULT, getLocale())
 *     
 *        short
 *        DateFormat.getTimeInstance(DateFormat.SHORT, getLocale())
 *     
 *        medium
 *        DateFormat.getTimeInstance(DateFormat.DEFAULT, getLocale())
 *     
 *        long
 *        DateFormat.getTimeInstance(DateFormat.LONG, getLocale())
 *     
 *        full
 *        DateFormat.getTimeInstance(DateFormat.FULL, getLocale())
 *     
 *        SubformatPattern
 *        new SimpleDateFormat(subformatPattern, getLocale())
 *     
 *        choice
 *        SubformatPattern
 *        new ChoiceFormat(subformatPattern)
 *  
 * 
 *  Usage Information
 * 
 *  
 *  Here are some examples of usage.
 *  In real internationalized programs, the message format pattern and other
 *  static strings will, of course, be obtained from resource bundles.
 *  Other parameters will be dynamically determined at runtime.
 *  
 *  The first example uses the static method MessageFormat.format,
 *  which internally creates a MessageFormat for one-time use:
 *  
 *  int planet = 7;
 *  String event = "a disturbance in the Force";
 * 
 *  String result = MessageFormat.format(
 *      "At {1,time} on {1,date}, there was {2} on planet {0,number,integer}.",
 *      planet, new Date(), event);
 *  
 *  The output is:
 *  
 *  At 12:30 PM on Jul 3, 2053, there was a disturbance in the Force on planet 7.
 *  
 * 
 *  
 *  The following example creates a MessageFormat instance that
 *  can be used repeatedly:
 *  
 *  int fileCount = 1273;
 *  String diskName = "MyDisk";
 *  Object[] testArgs = {new Long(fileCount), diskName};
 * 
 *  MessageFormat form = new MessageFormat(
 *      "The disk \"{1}\" contains {0} file(s).");
 * 
 *  System.out.println(form.format(testArgs));
 *  
 *  The output with different values for fileCount:
 *  
 *  The disk "MyDisk" contains 0 file(s).
 *  The disk "MyDisk" contains 1 file(s).
 *  The disk "MyDisk" contains 1,273 file(s).
 *  
 * 
 *  
 *  For more sophisticated patterns, you can use a ChoiceFormat
 *  to produce correct forms for singular and plural:
 *  
 *  MessageFormat form = new MessageFormat("The disk \"{1}\" contains {0}.");
 *  double[] filelimits = {0,1,2};
 *  String[] filepart = {"no files","one file","{0,number} files"};
 *  ChoiceFormat fileform = new ChoiceFormat(filelimits, filepart);
 *  form.setFormatByArgumentIndex(0, fileform);
 * 
 *  int fileCount = 1273;
 *  String diskName = "MyDisk";
 *  Object[] testArgs = {new Long(fileCount), diskName};
 * 
 *  System.out.println(form.format(testArgs));
 *  
 *  The output with different values for fileCount:
 *  
 *  The disk "MyDisk" contains no files.
 *  The disk "MyDisk" contains one file.
 *  The disk "MyDisk" contains 1,273 files.
 *  
 * 
 *  
 *  You can create the ChoiceFormat programmatically, as in the
 *  above example, or by using a pattern. See ChoiceFormat
 *  for more information.
 *  
 *  form.applyPattern(
 *     "There {0,choice,0#are no files|1#is one file|1<are {0,number,integer} files}.");
 *  
 * 
 *  
 *  Note: As we see above, the string produced
 *  by a ChoiceFormat in MessageFormat is treated as special;
 *  occurrences of '{' are used to indicate subformats, and cause recursion.
 *  If you create both a MessageFormat and ChoiceFormat
 *  programmatically (instead of using the string patterns), then be careful not to
 *  produce a format that recurses on itself, which will cause an infinite loop.
 *  
 *  When a single argument is parsed more than once in the string, the last match
 *  will be the final result of the parsing.  For example,
 *  
 *  MessageFormat mf = new MessageFormat("{0,number,#.##}, {0,number,#.#}");
 *  Object[] objs = {new Double(3.1415)};
 *  String result = mf.format( objs );
 *  // result now equals "3.14, 3.1"
 *  objs = null;
 *  objs = mf.parse(result, new ParsePosition(0));
 *  // objs now equals {new Double(3.1)}
 *  
 * 
 *  
 *  Likewise, parsing with a MessageFormat object using patterns containing
 *  multiple occurrences of the same argument would return the last match.  For
 *  example,
 *  
 *  MessageFormat mf = new MessageFormat("{0}, {0}, {0}");
 *  String forParsing = "x, y, z";
 *  Object[] objs = mf.parse(forParsing, new ParsePosition(0));
 *  // result now equals {new String("z")}
 *  
 * 
 *  Synchronization
 * 
 *  
 *  Message formats are not synchronized.
 *  It is recommended to create separate format instances for each thread.
 *  If multiple threads access a format concurrently, it must be synchronized
 *  externally.
 */
class MessageFormat extends Format {

    /** Constructs a MessageFormat for the default
     *  FORMAT locale and the
     *  specified pattern.
     */
    @stub
    def this(pattern: String) = ???

    /** Sets the pattern used by this message format. */
    @stub
    def applyPattern(pattern: String): Unit = ???

    /** Creates and returns a copy of this object. */
    @stub
    def clone(): Object = ???

    /** Equality comparison between two message format objects */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Formats an array of objects and appends the MessageFormat's
     *  pattern, with format elements replaced by the formatted objects, to the
     *  provided StringBuffer.
     */
    @stub
    def format(arguments: Array[Object], result: StringBuffer, pos: FieldPosition): StringBuffer = ???

    /** Formats an array of objects and appends the MessageFormat's
     *  pattern, with format elements replaced by the formatted objects, to the
     *  provided StringBuffer.
     */
    @stub
    def format(arguments: Object, result: StringBuffer, pos: FieldPosition): StringBuffer = ???

    /** Formats an array of objects and inserts them into the
     *  MessageFormat's pattern, producing an
     *  AttributedCharacterIterator.
     */
    @stub
    def formatToCharacterIterator(arguments: Object): AttributedCharacterIterator = ???

    /** Gets the formats used for the format elements in the
     *  previously set pattern string.
     */
    @stub
    def getFormats(): Array[Format] = ???

    /** Gets the formats used for the values passed into
     *  format methods or returned from parse
     *  methods.
     */
    @stub
    def getFormatsByArgumentIndex(): Array[Format] = ???

    /** Gets the locale that's used when creating or comparing subformats. */
    @stub
    def getLocale(): Locale = ???

    /** Generates a hash code for the message format object. */
    @stub
    def hashCode(): Int = ???

    /** Parses text from the beginning of the given string to produce an object
     *  array.
     */
    @stub
    def parse(source: String): Array[Object] = ???

    /** Parses the string. */
    @stub
    def parse(source: String, pos: ParsePosition): Array[Object] = ???

    /** Parses text from a string to produce an object array. */
    @stub
    def parseObject(source: String, pos: ParsePosition): Object = ???

    /** Sets the format to use for the format element with the given
     *  format element index within the previously set pattern string.
     */
    @stub
    def setFormat(formatElementIndex: Int, newFormat: Format): Unit = ???

    /** Sets the format to use for the format elements within the
     *  previously set pattern string that use the given argument
     *  index.
     */
    @stub
    def setFormatByArgumentIndex(argumentIndex: Int, newFormat: Format): Unit = ???

    /** Sets the formats to use for the format elements in the
     *  previously set pattern string.
     */
    @stub
    def setFormats(newFormats: Array[Format]): Unit = ???

    /** Sets the formats to use for the values passed into
     *  format methods or returned from parse
     *  methods.
     */
    @stub
    def setFormatsByArgumentIndex(newFormats: Array[Format]): Unit = ???

    /** Sets the locale to be used when creating or comparing subformats. */
    @stub
    def setLocale(locale: Locale): Unit = ???
}

object MessageFormat {
    /** Creates a MessageFormat with the given pattern and uses it
     *  to format the given arguments.
     */
    @stub
    def format(pattern: String, arguments: Object*): String = ???
}
