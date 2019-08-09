package java.text

import java.lang.{Object, String, StringBuffer}
import java.util.Date

/** SimpleDateFormat is a concrete class for formatting and
 *  parsing dates in a locale-sensitive manner. It allows for formatting
 *  (date → text), parsing (text → date), and normalization.
 * 
 *  
 *  SimpleDateFormat allows you to start by choosing
 *  any user-defined patterns for date-time formatting. However, you
 *  are encouraged to create a date-time formatter with either
 *  getTimeInstance, getDateInstance, or
 *  getDateTimeInstance in DateFormat. Each
 *  of these class methods can return a date/time formatter initialized
 *  with a default format pattern. You may modify the format pattern
 *  using the applyPattern methods as desired.
 *  For more information on using these methods, see
 *  DateFormat.
 * 
 *  Date and Time Patterns
 *  
 *  Date and time formats are specified by date and time pattern
 *  strings.
 *  Within date and time pattern strings, unquoted letters from
 *  'A' to 'Z' and from 'a' to
 *  'z' are interpreted as pattern letters representing the
 *  components of a date or time string.
 *  Text can be quoted using single quotes (') to avoid
 *  interpretation.
 *  "''" represents a single quote.
 *  All other characters are not interpreted; they're simply copied into the
 *  output string during formatting or matched against the input string
 *  during parsing.
 *  
 *  The following pattern letters are defined (all other characters from
 *  'A' to 'Z' and from 'a' to
 *  'z' are reserved):
 *  
 *  
 *      
 *          Letter
 *          Date or Time Component
 *          Presentation
 *          Examples
 *      
 *          G
 *          Era designator
 *          Text
 *          AD
 *      
 *          y
 *          Year
 *          Year
 *          1996; 96
 *      
 *          Y
 *          Week year
 *          Year
 *          2009; 09
 *      
 *          M
 *          Month in year (context sensitive)
 *          Month
 *          July; Jul; 07
 *      
 *          L
 *          Month in year (standalone form)
 *          Month
 *          July; Jul; 07
 *      
 *          w
 *          Week in year
 *          Number
 *          27
 *      
 *          W
 *          Week in month
 *          Number
 *          2
 *      
 *          D
 *          Day in year
 *          Number
 *          189
 *      
 *          d
 *          Day in month
 *          Number
 *          10
 *      
 *          F
 *          Day of week in month
 *          Number
 *          2
 *      
 *          E
 *          Day name in week
 *          Text
 *          Tuesday; Tue
 *      
 *          u
 *          Day number of week (1 = Monday, ..., 7 = Sunday)
 *          Number
 *          1
 *      
 *          a
 *          Am/pm marker
 *          Text
 *          PM
 *      
 *          H
 *          Hour in day (0-23)
 *          Number
 *          0
 *      
 *          k
 *          Hour in day (1-24)
 *          Number
 *          24
 *      
 *          K
 *          Hour in am/pm (0-11)
 *          Number
 *          0
 *      
 *          h
 *          Hour in am/pm (1-12)
 *          Number
 *          12
 *      
 *          m
 *          Minute in hour
 *          Number
 *          30
 *      
 *          s
 *          Second in minute
 *          Number
 *          55
 *      
 *          S
 *          Millisecond
 *          Number
 *          978
 *      
 *          z
 *          Time zone
 *          General time zone
 *          Pacific Standard Time; PST; GMT-08:00
 *      
 *          Z
 *          Time zone
 *          RFC 822 time zone
 *          -0800
 *      
 *          X
 *          Time zone
 *          ISO 8601 time zone
 *          -08; -0800;  -08:00
 *  
 *  
 *  Pattern letters are usually repeated, as their number determines the
 *  exact presentation:
 *  
 *  Text:
 *      For formatting, if the number of pattern letters is 4 or more,
 *      the full form is used; otherwise a short or abbreviated form
 *      is used if available.
 *      For parsing, both forms are accepted, independent of the number
 *      of pattern letters.
 *  Number:
 *      For formatting, the number of pattern letters is the minimum
 *      number of digits, and shorter numbers are zero-padded to this amount.
 *      For parsing, the number of pattern letters is ignored unless
 *      it's needed to separate two adjacent fields.
 *  Year:
 *      If the formatter's Calendar is the Gregorian
 *      calendar, the following rules are applied.
 *      
 *      For formatting, if the number of pattern letters is 2, the year
 *          is truncated to 2 digits; otherwise it is interpreted as a
 *          number.
 *      For parsing, if the number of pattern letters is more than 2,
 *          the year is interpreted literally, regardless of the number of
 *          digits. So using the pattern "MM/dd/yyyy", "01/11/12" parses to
 *          Jan 11, 12 A.D.
 *      For parsing with the abbreviated year pattern ("y" or "yy"),
 *          SimpleDateFormat must interpret the abbreviated year
 *          relative to some century.  It does this by adjusting dates to be
 *          within 80 years before and 20 years after the time the SimpleDateFormat
 *          instance is created. For example, using a pattern of "MM/dd/yy" and a
 *          SimpleDateFormat instance created on Jan 1, 1997,  the string
 *          "01/11/12" would be interpreted as Jan 11, 2012 while the string "05/04/64"
 *          would be interpreted as May 4, 1964.
 *          During parsing, only strings consisting of exactly two digits, as defined by
 *          Character.isDigit(char), will be parsed into the default century.
 *          Any other numeric string, such as a one digit string, a three or more digit
 *          string, or a two digit string that isn't all digits (for example, "-1"), is
 *          interpreted literally.  So "01/02/3" or "01/02/003" are parsed, using the
 *          same pattern, as Jan 2, 3 AD.  Likewise, "01/02/-3" is parsed as Jan 2, 4 BC.
 *      
 *      Otherwise, calendar system specific forms are applied.
 *      For both formatting and parsing, if the number of pattern
 *      letters is 4 or more, a calendar specific long form is used. Otherwise, a calendar
 *      specific short or abbreviated form
 *      is used.
 *      
 *      If week year 'Y' is specified and the calendar doesn't support any  week
 *      years, the calendar year ('y') is used instead. The
 *      support of week years can be tested with a call to getCalendar().isWeekDateSupported().
 *  Month:
 *      If the number of pattern letters is 3 or more, the month is
 *      interpreted as text; otherwise,
 *      it is interpreted as a number.
 *      
 *      Letter M produces context-sensitive month names, such as the
 *          embedded form of names. If a DateFormatSymbols has been set
 *          explicitly with constructor SimpleDateFormat(String,
 *          DateFormatSymbols) or method setDateFormatSymbols(DateFormatSymbols), the month names given by
 *          the DateFormatSymbols are used.
 *      Letter L produces the standalone form of month names.
 *      
 *      
 *  General time zone:
 *      Time zones are interpreted as text if they have
 *      names. For time zones representing a GMT offset value, the
 *      following syntax is used:
 *      
 *      GMTOffsetTimeZone:
 *              GMT Sign Hours : Minutes
 *      Sign: one of
 *              + -
 *      Hours:
 *              Digit
 *              Digit Digit
 *      Minutes:
 *              Digit Digit
 *      Digit: one of
 *              0 1 2 3 4 5 6 7 8 9
 *      Hours must be between 0 and 23, and Minutes must be between
 *      00 and 59. The format is locale independent and digits must be taken
 *      from the Basic Latin block of the Unicode standard.
 *      For parsing, RFC 822 time zones are also
 *      accepted.
 *  RFC 822 time zone:
 *      For formatting, the RFC 822 4-digit time zone format is used:
 * 
 *      
 *      RFC822TimeZone:
 *              Sign TwoDigitHours Minutes
 *      TwoDigitHours:
 *              Digit Digit
 *      TwoDigitHours must be between 00 and 23. Other definitions
 *      are as for general time zones.
 * 
 *      For parsing, general time zones are also
 *      accepted.
 *  ISO 8601 Time zone:
 *      The number of pattern letters designates the format for both formatting
 *      and parsing as follows:
 *      
 *      ISO8601TimeZone:
 *              OneLetterISO8601TimeZone
 *              TwoLetterISO8601TimeZone
 *              ThreeLetterISO8601TimeZone
 *      OneLetterISO8601TimeZone:
 *              Sign TwoDigitHours
 *               Z
 *      TwoLetterISO8601TimeZone:
 *              Sign TwoDigitHours Minutes
 *               Z
 *      ThreeLetterISO8601TimeZone:
 *              Sign TwoDigitHours  : Minutes
 *               Z
 *      Other definitions are as for general time zones or
 *      RFC 822 time zones.
 * 
 *      For formatting, if the offset value from GMT is 0, "Z" is
 *      produced. If the number of pattern letters is 1, any fraction of an hour
 *      is ignored. For example, if the pattern is "X" and the time zone is
 *      "GMT+05:30", "+05" is produced.
 * 
 *      For parsing, "Z" is parsed as the UTC time zone designator.
 *      General time zones are not accepted.
 * 
 *      If the number of pattern letters is 4 or more, IllegalArgumentException is thrown when constructing a SimpleDateFormat or applying a
 *      pattern.
 *  
 *  SimpleDateFormat also supports localized date and time
 *  pattern strings. In these strings, the pattern letters described above
 *  may be replaced with other, locale dependent, pattern letters.
 *  SimpleDateFormat does not deal with the localization of text
 *  other than the pattern letters; that's up to the client of the class.
 * 
 *  Examples
 * 
 *  The following examples show how date and time patterns are interpreted in
 *  the U.S. locale. The given date and time are 2001-07-04 12:08:56 local time
 *  in the U.S. Pacific Time time zone.
 *  
 *  
 *      
 *          Date and Time Pattern
 *          Result
 *      
 *          "yyyy.MM.dd G 'at' HH:mm:ss z"
 *          2001.07.04 AD at 12:08:56 PDT
 *      
 *          "EEE, MMM d, ''yy"
 *          Wed, Jul 4, '01
 *      
 *          "h:mm a"
 *          12:08 PM
 *      
 *          "hh 'o''clock' a, zzzz"
 *          12 o'clock PM, Pacific Daylight Time
 *      
 *          "K:mm a, z"
 *          0:08 PM, PDT
 *      
 *          "yyyyy.MMMMM.dd GGG hh:mm aaa"
 *          02001.July.04 AD 12:08 PM
 *      
 *          "EEE, d MMM yyyy HH:mm:ss Z"
 *          Wed, 4 Jul 2001 12:08:56 -0700
 *      
 *          "yyMMddHHmmssZ"
 *          010704120856-0700
 *      
 *          "yyyy-MM-dd'T'HH:mm:ss.SSSZ"
 *          2001-07-04T12:08:56.235-0700
 *      
 *          "yyyy-MM-dd'T'HH:mm:ss.SSSXXX"
 *          2001-07-04T12:08:56.235-07:00
 *      
 *          "YYYY-'W'ww-u"
 *          2001-W27-3
 *  
 *  
 * 
 *  Synchronization
 * 
 *  
 *  Date formats are not synchronized.
 *  It is recommended to create separate format instances for each thread.
 *  If multiple threads access a format concurrently, it must be synchronized
 *  externally.
 */
class SimpleDateFormat extends DateFormat {

    /** Constructs a SimpleDateFormat using the default pattern and
     *  date format symbols for the default
     *  FORMAT locale.
     */
    @stub
    def this() = ???

    /** Constructs a SimpleDateFormat using the given pattern and
     *  the default date format symbols for the default
     *  FORMAT locale.
     */
    @stub
    def this(pattern: String) = ???

    /** Constructs a SimpleDateFormat using the given pattern and
     *  date format symbols.
     */
    @stub
    def this(pattern: String, formatSymbols: DateFormatSymbols) = ???

    /** Applies the given localized pattern string to this date format. */
    @stub
    def applyLocalizedPattern(pattern: String): Unit = ???

    /** Applies the given pattern string to this date format. */
    @stub
    def applyPattern(pattern: String): Unit = ???

    /** Creates a copy of this SimpleDateFormat. */
    @stub
    def clone(): Object = ???

    /** Compares the given object with this SimpleDateFormat for
     *  equality.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Formats the given Date into a date/time string and appends
     *  the result to the given StringBuffer.
     */
    @stub
    def format(date: Date, toAppendTo: StringBuffer, pos: FieldPosition): StringBuffer = ???

    /** Formats an Object producing an AttributedCharacterIterator. */
    @stub
    def formatToCharacterIterator(obj: Object): AttributedCharacterIterator = ???

    /** Returns the beginning date of the 100-year period 2-digit years are interpreted
     *  as being within.
     */
    @stub
    def get2DigitYearStart(): Date = ???

    /** Gets a copy of the date and time format symbols of this date format. */
    @stub
    def getDateFormatSymbols(): DateFormatSymbols = ???

    /** Returns the hash code value for this SimpleDateFormat object. */
    @stub
    def hashCode(): Int = ???

    /** Parses text from a string to produce a Date. */
    @stub
    def parse(text: String, pos: ParsePosition): Date = ???

    /** Sets the 100-year period 2-digit years will be interpreted as being in
     *  to begin on the date the user specifies.
     */
    @stub
    def set2DigitYearStart(startDate: Date): Unit = ???

    /** Sets the date and time format symbols of this date format. */
    @stub
    def setDateFormatSymbols(newFormatSymbols: DateFormatSymbols): Unit = ???

    /** Returns a localized pattern string describing this date format. */
    @stub
    def toLocalizedPattern(): String = ???
}
