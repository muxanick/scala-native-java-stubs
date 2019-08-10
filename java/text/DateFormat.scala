package java.text

import java.lang.{Object, String, StringBuffer}
import java.util.{Calendar, Date, Locale, TimeZone}
import scala.scalanative.annotation.stub

/** DateFormat is an abstract class for date/time formatting subclasses which
 *  formats and parses dates or time in a language-independent manner.
 *  The date/time formatting subclass, such as SimpleDateFormat, allows for
 *  formatting (i.e., date → text), parsing (text → date), and
 *  normalization.  The date is represented as a Date object or
 *  as the milliseconds since January 1, 1970, 00:00:00 GMT.
 * 
 *  DateFormat provides many class methods for obtaining default date/time
 *  formatters based on the default or a given locale and a number of formatting
 *  styles. The formatting styles include FULL, LONG, MEDIUM, and SHORT. More
 *  detail and examples of using these styles are provided in the method
 *  descriptions.
 * 
 *  DateFormat helps you to format and parse dates for any locale.
 *  Your code can be completely independent of the locale conventions for
 *  months, days of the week, or even the calendar format: lunar vs. solar.
 * 
 *  To format a date for the current Locale, use one of the
 *  static factory methods:
 *  
 *  
 *  myString = DateFormat.getDateInstance().format(myDate);
 *  
 *  
 *  If you are formatting multiple dates, it is
 *  more efficient to get the format and use it multiple times so that
 *  the system doesn't have to fetch the information about the local
 *  language and country conventions multiple times.
 *  
 *  
 *  DateFormat df = DateFormat.getDateInstance();
 *  for (int i = 0; i < myDate.length; ++i) {
 *      output.println(df.format(myDate[i]) + "; ");
 *  }
 *  
 *  
 *  To format a date for a different Locale, specify it in the
 *  call to getDateInstance().
 *  
 *  
 *  DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
 *  
 *  
 *  You can use a DateFormat to parse also.
 *  
 *  
 *  myDate = df.parse(myString);
 *  
 *  
 *  Use getDateInstance to get the normal date format for that country.
 *  There are other static factory methods available.
 *  Use getTimeInstance to get the time format for that country.
 *  Use getDateTimeInstance to get a date and time format. You can pass in
 *  different options to these factory methods to control the length of the
 *  result; from SHORT to MEDIUM to LONG to FULL. The exact result depends
 *  on the locale, but generally:
 *  SHORT is completely numeric, such as 12.13.52 or 3:30pm
 *  MEDIUM is longer, such as Jan 12, 1952
 *  LONG is longer, such as January 12, 1952 or 3:30:32pm
 *  FULL is pretty completely specified, such as
 *  Tuesday, April 12, 1952 AD or 3:30:42pm PST.
 *  
 * 
 *  You can also set the time zone on the format if you wish.
 *  If you want even more control over the format or parsing,
 *  (or want to give your users more control),
 *  you can try casting the DateFormat you get from the factory methods
 *  to a SimpleDateFormat. This will work for the majority
 *  of countries; just remember to put it in a try block in case you
 *  encounter an unusual one.
 * 
 *  You can also use forms of the parse and format methods with
 *  ParsePosition and FieldPosition to
 *  allow you to
 *  progressively parse through pieces of a string.
 *  align any particular field, or find out where it is for selection
 *  on the screen.
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
abstract class DateFormat extends Format {

    /** Create a new date format. */
    @stub
    protected def this() = ???

    /** The Calendar instance used for calculating the date-time fields
     *  and the instant of time.
     */
    protected val calendar: Calendar

    /** The number formatter that DateFormat uses to format numbers
     *  in dates and times.
     */
    protected val numberFormat: NumberFormat

    /** Overrides Cloneable */
    def clone(): Any

    /** Overrides equals */
    def equals(obj: Any): Boolean

    /** Formats a Date into a date/time string. */
    def format(date: Date): String

    /** Formats a Date into a date/time string. */
    def format(date: Date, toAppendTo: StringBuffer, fieldPosition: FieldPosition): StringBuffer

    /** Overrides Format. */
    def format(obj: Any, toAppendTo: StringBuffer, fieldPosition: FieldPosition): StringBuffer

    /** Gets the calendar associated with this date/time formatter. */
    def getCalendar(): Calendar

    /** Gets the number formatter which this date/time formatter uses to
     *  format and parse a time.
     */
    def getNumberFormat(): NumberFormat

    /** Gets the time zone. */
    def getTimeZone(): TimeZone

    /** Overrides hashCode */
    def hashCode(): Int

    /** Tell whether date/time parsing is to be lenient. */
    def isLenient(): Boolean

    /** Parses text from the beginning of the given string to produce a date. */
    def parse(source: String): Date

    /** Parse a date/time string according to the given parse position. */
    def parse(source: String, pos: ParsePosition): Date

    /** Parses text from a string to produce a Date. */
    def parseObject(source: String, pos: ParsePosition): Any

    /** Set the calendar to be used by this date format. */
    def setCalendar(newCalendar: Calendar): Unit

    /** Specify whether or not date/time parsing is to be lenient. */
    def setLenient(lenient: Boolean): Unit

    /** Allows you to set the number formatter. */
    def setNumberFormat(newNumberFormat: NumberFormat): Unit

    /** Sets the time zone for the calendar of this DateFormat object. */
    def setTimeZone(zone: TimeZone): Unit
}

object DateFormat {
    /** Defines constants that are used as attribute keys in the
     *  AttributedCharacterIterator returned
     *  from DateFormat.formatToCharacterIterator and as
     *  field identifiers in FieldPosition.
     */
    type Field = DateFormat_Field

    /** Useful constant for AM_PM field alignment. */
    @stub
    val AM_PM_FIELD: Int = ???

    /** Useful constant for DATE field alignment. */
    @stub
    val DATE_FIELD: Int = ???

    /** Useful constant for DAY_OF_WEEK field alignment. */
    @stub
    val DAY_OF_WEEK_FIELD: Int = ???

    /** Useful constant for DAY_OF_WEEK_IN_MONTH field alignment. */
    @stub
    val DAY_OF_WEEK_IN_MONTH_FIELD: Int = ???

    /** Useful constant for DAY_OF_YEAR field alignment. */
    @stub
    val DAY_OF_YEAR_FIELD: Int = ???

    /** Constant for default style pattern. */
    @stub
    val DEFAULT: Int = ???

    /** Useful constant for ERA field alignment. */
    @stub
    val ERA_FIELD: Int = ???

    /** Constant for full style pattern. */
    @stub
    val FULL: Int = ???

    /** Useful constant for zero-based HOUR_OF_DAY field alignment. */
    @stub
    val HOUR_OF_DAY0_FIELD: Int = ???

    /** Useful constant for one-based HOUR_OF_DAY field alignment. */
    @stub
    val HOUR_OF_DAY1_FIELD: Int = ???

    /** Useful constant for zero-based HOUR field alignment. */
    @stub
    val HOUR0_FIELD: Int = ???

    /** Useful constant for one-based HOUR field alignment. */
    @stub
    val HOUR1_FIELD: Int = ???

    /** Constant for long style pattern. */
    @stub
    val LONG: Int = ???

    /** Constant for medium style pattern. */
    @stub
    val MEDIUM: Int = ???

    /** Useful constant for MILLISECOND field alignment. */
    @stub
    val MILLISECOND_FIELD: Int = ???

    /** Useful constant for MINUTE field alignment. */
    @stub
    val MINUTE_FIELD: Int = ???

    /** Useful constant for MONTH field alignment. */
    @stub
    val MONTH_FIELD: Int = ???

    /** Useful constant for SECOND field alignment. */
    @stub
    val SECOND_FIELD: Int = ???

    /** Constant for short style pattern. */
    @stub
    val SHORT: Int = ???

    /** Useful constant for TIMEZONE field alignment. */
    @stub
    val TIMEZONE_FIELD: Int = ???

    /** Useful constant for WEEK_OF_MONTH field alignment. */
    @stub
    val WEEK_OF_MONTH_FIELD: Int = ???

    /** Useful constant for WEEK_OF_YEAR field alignment. */
    @stub
    val WEEK_OF_YEAR_FIELD: Int = ???

    /** Useful constant for YEAR field alignment. */
    @stub
    val YEAR_FIELD: Int = ???

    /** Returns an array of all locales for which the
     *  get*Instance methods of this class can return
     *  localized instances.
     */
    @stub
    def getAvailableLocales(): Array[Locale] = ???

    /** Gets the date formatter with the default formatting style
     *  for the default FORMAT locale.
     */
    @stub
    def getDateInstance(): DateFormat = ???

    /** Gets the date formatter with the given formatting style
     *  for the default FORMAT locale.
     */
    @stub
    def getDateInstance(style: Int): DateFormat = ???

    /** Gets the date formatter with the given formatting style
     *  for the given locale.
     */
    @stub
    def getDateInstance(style: Int, aLocale: Locale): DateFormat = ???

    /** Gets the date/time formatter with the default formatting style
     *  for the default FORMAT locale.
     */
    @stub
    def getDateTimeInstance(): DateFormat = ???

    /** Gets the date/time formatter with the given date and time
     *  formatting styles for the default FORMAT locale.
     */
    @stub
    def getDateTimeInstance(dateStyle: Int, timeStyle: Int): DateFormat = ???

    /** Gets the date/time formatter with the given formatting styles
     *  for the given locale.
     */
    @stub
    def getDateTimeInstance(dateStyle: Int, timeStyle: Int, aLocale: Locale): DateFormat = ???

    /** Get a default date/time formatter that uses the SHORT style for both the
     *  date and the time.
     */
    @stub
    def getInstance(): DateFormat = ???

    /** Gets the time formatter with the default formatting style
     *  for the default FORMAT locale.
     */
    @stub
    def getTimeInstance(): DateFormat = ???

    /** Gets the time formatter with the given formatting style
     *  for the default FORMAT locale.
     */
    @stub
    def getTimeInstance(style: Int): DateFormat = ???

    /** Gets the time formatter with the given formatting style
     *  for the given locale.
     */
    @stub
    def getTimeInstance(style: Int, aLocale: Locale): DateFormat = ???
}
