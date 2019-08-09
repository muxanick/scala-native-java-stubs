package java.util

import java.io.Serializable
import java.lang.{Cloneable, Comparable, Integer, Object, String}
import java.time.Instant
import scala.scalanative.annotation.stub

/** The Calendar class is an abstract class that provides methods
 *  for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH,
 *  DAY_OF_MONTH, HOUR, and so on, and for
 *  manipulating the calendar fields, such as getting the date of the next
 *  week. An instant in time can be represented by a millisecond value that is
 *  an offset from the Epoch, January 1, 1970
 *  00:00:00.000 GMT (Gregorian).
 * 
 *  The class also provides additional fields and methods for
 *  implementing a concrete calendar system outside the package. Those
 *  fields and methods are defined as protected.
 * 
 *  
 *  Like other locale-sensitive classes, Calendar provides a
 *  class method, getInstance, for getting a generally useful
 *  object of this type. Calendar's getInstance method
 *  returns a Calendar object whose
 *  calendar fields have been initialized with the current date and time:
 *  
 *  
 *      Calendar rightNow = Calendar.getInstance();
 *  
 *  
 * 
 *  A Calendar object can produce all the calendar field values
 *  needed to implement the date-time formatting for a particular language and
 *  calendar style (for example, Japanese-Gregorian, Japanese-Traditional).
 *  Calendar defines the range of values returned by
 *  certain calendar fields, as well as their meaning.  For example,
 *  the first month of the calendar system has value MONTH ==
 *  JANUARY for all calendars.  Other values are defined by the
 *  concrete subclass, such as ERA.  See individual field
 *  documentation and subclass documentation for details.
 * 
 *  Getting and Setting Calendar Field Values
 * 
 *  The calendar field values can be set by calling the set
 *  methods. Any field values set in a Calendar will not be
 *  interpreted until it needs to calculate its time value (milliseconds from
 *  the Epoch) or values of the calendar fields. Calling the
 *  get, getTimeInMillis, getTime,
 *  add and roll involves such calculation.
 * 
 *  Leniency
 * 
 *  Calendar has two modes for interpreting the calendar
 *  fields, lenient and non-lenient.  When a
 *  Calendar is in lenient mode, it accepts a wider range of
 *  calendar field values than it produces.  When a Calendar
 *  recomputes calendar field values for return by get(), all of
 *  the calendar fields are normalized. For example, a lenient
 *  GregorianCalendar interprets MONTH == JANUARY,
 *  DAY_OF_MONTH == 32 as February 1.
 * 
 *  When a Calendar is in non-lenient mode, it throws an
 *  exception if there is any inconsistency in its calendar fields. For
 *  example, a GregorianCalendar always produces
 *  DAY_OF_MONTH values between 1 and the length of the month. A
 *  non-lenient GregorianCalendar throws an exception upon
 *  calculating its time or calendar field values if any out-of-range field
 *  value has been set.
 * 
 *  First Week
 * 
 *  Calendar defines a locale-specific seven day week using two
 *  parameters: the first day of the week and the minimal days in first week
 *  (from 1 to 7).  These numbers are taken from the locale resource data when a
 *  Calendar is constructed.  They may also be specified explicitly
 *  through the methods for setting their values.
 * 
 *  When setting or getting the WEEK_OF_MONTH or
 *  WEEK_OF_YEAR fields, Calendar must determine the
 *  first week of the month or year as a reference point.  The first week of a
 *  month or year is defined as the earliest seven day period beginning on
 *  getFirstDayOfWeek() and containing at least
 *  getMinimalDaysInFirstWeek() days of that month or year.  Weeks
 *  numbered ..., -1, 0 precede the first week; weeks numbered 2, 3,... follow
 *  it.  Note that the normalized numbering returned by get() may be
 *  different.  For example, a specific Calendar subclass may
 *  designate the week before week 1 of a year as week n of
 *  the previous year.
 * 
 *  Calendar Fields Resolution
 * 
 *  When computing a date and time from the calendar fields, there
 *  may be insufficient information for the computation (such as only
 *  year and month with no day of month), or there may be inconsistent
 *  information (such as Tuesday, July 15, 1996 (Gregorian) -- July 15,
 *  1996 is actually a Monday). Calendar will resolve
 *  calendar field values to determine the date and time in the
 *  following way.
 * 
 *  If there is any conflict in calendar field values,
 *  Calendar gives priorities to calendar fields that have been set
 *  more recently. The following are the default combinations of the
 *  calendar fields. The most recent combination, as determined by the
 *  most recently set single field, will be used.
 * 
 *  For the date fields:
 *  
 *  
 *  YEAR + MONTH + DAY_OF_MONTH
 *  YEAR + MONTH + WEEK_OF_MONTH + DAY_OF_WEEK
 *  YEAR + MONTH + DAY_OF_WEEK_IN_MONTH + DAY_OF_WEEK
 *  YEAR + DAY_OF_YEAR
 *  YEAR + DAY_OF_WEEK + WEEK_OF_YEAR
 *  
 * 
 *  For the time of day fields:
 *  
 *  
 *  HOUR_OF_DAY
 *  AM_PM + HOUR
 *  
 * 
 *  If there are any calendar fields whose values haven't been set in the selected
 *  field combination, Calendar uses their default values. The default
 *  value of each field may vary by concrete calendar systems. For example, in
 *  GregorianCalendar, the default of a field is the same as that
 *  of the start of the Epoch: i.e., YEAR = 1970, MONTH =
 *  JANUARY, DAY_OF_MONTH = 1, etc.
 * 
 *  
 *  Note: There are certain possible ambiguities in
 *  interpretation of certain singular times, which are resolved in the
 *  following ways:
 *  
 *       23:59 is the last minute of the day and 00:00 is the first
 *           minute of the next day. Thus, 23:59 on Dec 31, 1999 < 00:00 on
 *           Jan 1, 2000 < 00:01 on Jan 1, 2000.
 * 
 *       Although historically not precise, midnight also belongs to "am",
 *           and noon belongs to "pm", so on the same day,
 *           12:00 am (midnight) < 12:01 am, and 12:00 pm (noon) < 12:01 pm
 *  
 * 
 *  
 *  The date or time format strings are not part of the definition of a
 *  calendar, as those must be modifiable or overridable by the user at
 *  runtime. Use DateFormat
 *  to format dates.
 * 
 *  Field Manipulation
 * 
 *  The calendar fields can be changed using three methods:
 *  set(), add(), and roll().
 * 
 *  set(f, value) changes calendar field
 *  f to value.  In addition, it sets an
 *  internal member variable to indicate that calendar field f has
 *  been changed. Although calendar field f is changed immediately,
 *  the calendar's time value in milliseconds is not recomputed until the next call to
 *  get(), getTime(), getTimeInMillis(),
 *  add(), or roll() is made. Thus, multiple calls to
 *  set() do not trigger multiple, unnecessary
 *  computations. As a result of changing a calendar field using
 *  set(), other calendar fields may also change, depending on the
 *  calendar field, the calendar field value, and the calendar system. In addition,
 *  get(f) will not necessarily return value set by
 *  the call to the set method
 *  after the calendar fields have been recomputed. The specifics are determined by
 *  the concrete calendar class.
 * 
 *  Example: Consider a GregorianCalendar
 *  originally set to August 31, 1999. Calling set(Calendar.MONTH,
 *  Calendar.SEPTEMBER) sets the date to September 31,
 *  1999. This is a temporary internal representation that resolves to
 *  October 1, 1999 if getTime()is then called. However, a
 *  call to set(Calendar.DAY_OF_MONTH, 30) before the call to
 *  getTime() sets the date to September 30, 1999, since
 *  no recomputation occurs after set() itself.
 * 
 *  add(f, delta) adds delta
 *  to field f.  This is equivalent to calling set(f,
 *  get(f) + delta) with two adjustments:
 * 
 *  
 *    Add rule 1. The value of field f
 *    after the call minus the value of field f before the
 *    call is delta, modulo any overflow that has occurred in
 *    field f. Overflow occurs when a field value exceeds its
 *    range and, as a result, the next larger field is incremented or
 *    decremented and the field value is adjusted back into its range.
 * 
 *    Add rule 2. If a smaller field is expected to be
 *    invariant, but it is impossible for it to be equal to its
 *    prior value because of changes in its minimum or maximum after field
 *    f is changed or other constraints, such as time zone
 *    offset changes, then its value is adjusted to be as close
 *    as possible to its expected value. A smaller field represents a
 *    smaller unit of time. HOUR is a smaller field than
 *    DAY_OF_MONTH. No adjustment is made to smaller fields
 *    that are not expected to be invariant. The calendar system
 *    determines what fields are expected to be invariant.
 *  
 * 
 *  In addition, unlike set(), add() forces
 *  an immediate recomputation of the calendar's milliseconds and all
 *  fields.
 * 
 *  Example: Consider a GregorianCalendar
 *  originally set to August 31, 1999. Calling add(Calendar.MONTH,
 *  13) sets the calendar to September 30, 2000. Add rule
 *  1 sets the MONTH field to September, since
 *  adding 13 months to August gives September of the next year. Since
 *  DAY_OF_MONTH cannot be 31 in September in a
 *  GregorianCalendar, add rule 2 sets the
 *  DAY_OF_MONTH to 30, the closest possible value. Although
 *  it is a smaller field, DAY_OF_WEEK is not adjusted by
 *  rule 2, since it is expected to change when the month changes in a
 *  GregorianCalendar.
 * 
 *  roll(f, delta) adds
 *  delta to field f without changing larger
 *  fields. This is equivalent to calling add(f, delta) with
 *  the following adjustment:
 * 
 *  
 *    Roll rule. Larger fields are unchanged after the
 *    call. A larger field represents a larger unit of
 *    time. DAY_OF_MONTH is a larger field than
 *    HOUR.
 *  
 * 
 *  Example: See GregorianCalendar.roll(int, int).
 * 
 *  Usage model. To motivate the behavior of
 *  add() and roll(), consider a user interface
 *  component with increment and decrement buttons for the month, day, and
 *  year, and an underlying GregorianCalendar. If the
 *  interface reads January 31, 1999 and the user presses the month
 *  increment button, what should it read? If the underlying
 *  implementation uses set(), it might read March 3, 1999. A
 *  better result would be February 28, 1999. Furthermore, if the user
 *  presses the month increment button again, it should read March 31,
 *  1999, not March 28, 1999. By saving the original date and using either
 *  add() or roll(), depending on whether larger
 *  fields should be affected, the user interface can behave as most users
 *  will intuitively expect.
 */
abstract class Calendar extends Object with Serializable with Cloneable with Comparable[Calendar] {

    /** Constructs a Calendar with the default time zone
     *  and the default FORMAT
     *  locale.
     */
    @stub
    protected def this() = ???

    /** Constructs a calendar with the specified time zone and locale. */
    @stub
    protected def this(zone: TimeZone, aLocale: Locale) = ???

    /** True if fields[] are in sync with the currently set time. */
    protected val areFieldsSet: Boolean

    /** The calendar field values for the currently set time for this calendar. */
    protected val fields: Array[Int]

    /** The flags which tell if a specified calendar field for the calendar is set. */
    protected val isSet: Array[Boolean]

    /** True if then the value of time is valid. */
    protected val isTimeSet: Boolean

    /** The currently set time for this calendar, expressed in milliseconds after
     *  January 1, 1970, 0:00:00 GMT.
     */
    protected val time: Long

    /** Adds or subtracts the specified amount of time to the given calendar field,
     *  based on the calendar's rules.
     */
    def add(field: Int, amount: Int): Unit

    /** Returns whether this Calendar represents a time
     *  after the time represented by the specified
     *  Object.
     */
    def after(when: Object): Boolean

    /** Returns whether this Calendar represents a time
     *  before the time represented by the specified
     *  Object.
     */
    def before(when: Object): Boolean

    /** Sets all the calendar field values and the time value
     *  (millisecond offset from the Epoch) of
     *  this Calendar undefined.
     */
    def clear(): Unit

    /** Sets the given calendar field value and the time value
     *  (millisecond offset from the Epoch) of
     *  this Calendar undefined.
     */
    def clear(field: Int): Unit

    /** Creates and returns a copy of this object. */
    def clone(): Object

    /** Compares the time values (millisecond offsets from the Epoch) represented by two
     *  Calendar objects.
     */
    def compareTo(anotherCalendar: Calendar): Int

    /** Fills in any unset fields in the calendar fields. */
    protected def complete(): Unit

    /** Converts the current millisecond time value time
     *  to calendar field values in fields[].
     */
    protected def computeFields(): Unit

    /** Converts the current calendar field values in fields[]
     *  to the millisecond time value
     *  time.
     */
    protected def computeTime(): Unit

    /** Compares this Calendar to the specified
     *  Object.
     */
    def equals(obj: Object): Boolean

    /** Returns the value of the given calendar field. */
    def get(field: Int): Int

    /** Returns the maximum value that the specified calendar field
     *  could have, given the time value of this
     *  Calendar.
     */
    def getActualMaximum(field: Int): Int

    /** Returns the minimum value that the specified calendar field
     *  could have, given the time value of this Calendar.
     */
    def getActualMinimum(field: Int): Int

    /** Returns the calendar type of this Calendar. */
    def getCalendarType(): String

    /** Returns the string representation of the calendar
     *  field value in the given style and
     *  locale.
     */
    def getDisplayName(field: Int, style: Int, locale: Locale): String

    /** Returns a Map containing all names of the calendar
     *  field in the given style and
     *  locale and their corresponding field values.
     */
    def getDisplayNames(field: Int, style: Int, locale: Locale): Map[String, Integer]

    /** Gets what the first day of the week is; e.g., SUNDAY in the U.S.,
     *  MONDAY in France.
     */
    def getFirstDayOfWeek(): Int

    /** Returns the highest minimum value for the given calendar field
     *  of this Calendar instance.
     */
    def getGreatestMinimum(field: Int): Int

    /** Returns the lowest maximum value for the given calendar field
     *  of this Calendar instance.
     */
    def getLeastMaximum(field: Int): Int

    /** Returns the maximum value for the given calendar field of this
     *  Calendar instance.
     */
    def getMaximum(field: Int): Int

    /** Gets what the minimal days required in the first week of the year are;
     *  e.g., if the first week is defined as one that contains the first day
     *  of the first month of a year, this method returns 1.
     */
    def getMinimalDaysInFirstWeek(): Int

    /** Returns the minimum value for the given calendar field of this
     *  Calendar instance.
     */
    def getMinimum(field: Int): Int

    /** Returns a Date object representing this
     *  Calendar's time value (millisecond offset from the Epoch").
     */
    def getTime(): Date

    /** Returns this Calendar's time value in milliseconds. */
    def getTimeInMillis(): Long

    /** Gets the time zone. */
    def getTimeZone(): TimeZone

    /** Returns the number of weeks in the week year represented by this
     *  Calendar.
     */
    def getWeeksInWeekYear(): Int

    /** Returns the week year represented by this Calendar. */
    def getWeekYear(): Int

    /** Returns a hash code for this calendar. */
    def hashCode(): Int

    /** Returns the value of the given calendar field. */
    protected def internalGet(field: Int): Int

    /** Tells whether date/time interpretation is to be lenient. */
    def isLenient(): Boolean

    /** Determines if the given calendar field has a value set,
     *  including cases that the value has been set by internal fields
     *  calculations triggered by a get method call.
     */
    def isSet(field: Int): Boolean

    /** Returns whether this Calendar supports week dates. */
    def isWeekDateSupported(): Boolean

    /** Adds or subtracts (up/down) a single unit of time on the given time
     *  field without changing larger fields.
     */
    def roll(field: Int, up: Boolean): Unit

    /** Adds the specified (signed) amount to the specified calendar field
     *  without changing larger fields.
     */
    def roll(field: Int, amount: Int): Unit

    /** Sets the given calendar field to the given value. */
    def set(field: Int, value: Int): Unit

    /** Sets the values for the calendar fields YEAR,
     *  MONTH, and DAY_OF_MONTH.
     */
    def set(year: Int, month: Int, date: Int): Unit

    /** Sets the values for the calendar fields YEAR,
     *  MONTH, DAY_OF_MONTH,
     *  HOUR_OF_DAY, and MINUTE.
     */
    def set(year: Int, month: Int, date: Int, hourOfDay: Int, minute: Int): Unit

    /** Sets the values for the fields YEAR, MONTH,
     *  DAY_OF_MONTH, HOUR_OF_DAY, MINUTE, and
     *  SECOND.
     */
    def set(year: Int, month: Int, date: Int, hourOfDay: Int, minute: Int, second: Int): Unit

    /** Sets what the first day of the week is; e.g., SUNDAY in the U.S.,
     *  MONDAY in France.
     */
    def setFirstDayOfWeek(value: Int): Unit

    /** Specifies whether or not date/time interpretation is to be lenient. */
    def setLenient(lenient: Boolean): Unit

    /** Sets what the minimal days required in the first week of the year are;
     *  For example, if the first week is defined as one that contains the first
     *  day of the first month of a year, call this method with value 1.
     */
    def setMinimalDaysInFirstWeek(value: Int): Unit

    /** Sets this Calendar's time with the given Date. */
    def setTime(date: Date): Unit

    /** Sets this Calendar's current time from the given long value. */
    def setTimeInMillis(millis: Long): Unit

    /** Sets the time zone with the given time zone value. */
    def setTimeZone(value: TimeZone): Unit

    /** Sets the date of this Calendar with the the given date
     *  specifiers - week year, week of year, and day of week.
     */
    def setWeekDate(weekYear: Int, weekOfYear: Int, dayOfWeek: Int): Unit

    /** Converts this object to an Instant. */
    def toInstant(): Instant

    /** Return a string representation of this calendar. */
    def toString(): String
}

object Calendar {
    /** Calendar.Builder is used for creating a Calendar from
     *  various date-time parameters.
     */
    @stub
    object Builder extends Calendar.Builder

    /** A style specifier for getDisplayNames indicating names in all styles, such as
     *  "January" and "Jan".
     */
    @stub
    val ALL_STYLES: Int = ???

    /** Value of the AM_PM field indicating the
     *  period of the day from midnight to just before noon.
     */
    @stub
    val AM: Int = ???

    /** Field number for get and set indicating
     *  whether the HOUR is before or after noon.
     */
    @stub
    val AM_PM: Int = ???

    /** Value of the MONTH field indicating the
     *  fourth month of the year in the Gregorian and Julian calendars.
     */
    @stub
    val APRIL: Int = ???

    /** Value of the MONTH field indicating the
     *  eighth month of the year in the Gregorian and Julian calendars.
     */
    @stub
    val AUGUST: Int = ???

    /** Field number for get and set indicating the
     *  day of the month.
     */
    @stub
    val DATE: Int = ???

    /** Field number for get and set indicating the
     *  day of the month.
     */
    @stub
    val DAY_OF_MONTH: Int = ???

    /** Field number for get and set indicating the day
     *  of the week.
     */
    @stub
    val DAY_OF_WEEK: Int = ???

    /** Field number for get and set indicating the
     *  ordinal number of the day of the week within the current month.
     */
    @stub
    val DAY_OF_WEEK_IN_MONTH: Int = ???

    /** Field number for get and set indicating the day
     *  number within the current year.
     */
    @stub
    val DAY_OF_YEAR: Int = ???

    /** Value of the MONTH field indicating the
     *  twelfth month of the year in the Gregorian and Julian calendars.
     */
    @stub
    val DECEMBER: Int = ???

    /** Field number for get and set indicating the
     *  daylight saving offset in milliseconds.
     */
    @stub
    val DST_OFFSET: Int = ???

    /** Field number for get and set indicating the
     *  era, e.g., AD or BC in the Julian calendar.
     */
    @stub
    val ERA: Int = ???

    /** Value of the MONTH field indicating the
     *  second month of the year in the Gregorian and Julian calendars.
     */
    @stub
    val FEBRUARY: Int = ???

    /** The number of distinct fields recognized by get and set. */
    @stub
    val FIELD_COUNT: Int = ???

    /** Value of the DAY_OF_WEEK field indicating
     *  Friday.
     */
    @stub
    val FRIDAY: Int = ???

    /** Field number for get and set indicating the
     *  hour of the morning or afternoon.
     */
    @stub
    val HOUR: Int = ???

    /** Field number for get and set indicating the
     *  hour of the day.
     */
    @stub
    val HOUR_OF_DAY: Int = ???

    /** Value of the MONTH field indicating the
     *  first month of the year in the Gregorian and Julian calendars.
     */
    @stub
    val JANUARY: Int = ???

    /** Value of the MONTH field indicating the
     *  seventh month of the year in the Gregorian and Julian calendars.
     */
    @stub
    val JULY: Int = ???

    /** Value of the MONTH field indicating the
     *  sixth month of the year in the Gregorian and Julian calendars.
     */
    @stub
    val JUNE: Int = ???

    /** A style specifier for getDisplayName and getDisplayNames equivalent to LONG_FORMAT. */
    @stub
    val LONG: Int = ???

    /** A style specifier for getDisplayName and getDisplayNames indicating a long name used for format. */
    @stub
    val LONG_FORMAT: Int = ???

    /** A style specifier for getDisplayName and getDisplayNames indicating a long name used independently,
     *  such as a month name as calendar headers.
     */
    @stub
    val LONG_STANDALONE: Int = ???

    /** Value of the MONTH field indicating the
     *  third month of the year in the Gregorian and Julian calendars.
     */
    @stub
    val MARCH: Int = ???

    /** Value of the MONTH field indicating the
     *  fifth month of the year in the Gregorian and Julian calendars.
     */
    @stub
    val MAY: Int = ???

    /** Field number for get and set indicating the
     *  millisecond within the second.
     */
    @stub
    val MILLISECOND: Int = ???

    /** Field number for get and set indicating the
     *  minute within the hour.
     */
    @stub
    val MINUTE: Int = ???

    /** Value of the DAY_OF_WEEK field indicating
     *  Monday.
     */
    @stub
    val MONDAY: Int = ???

    /** Field number for get and set indicating the
     *  month.
     */
    @stub
    val MONTH: Int = ???

    /** A style specifier for getDisplayName and getDisplayNames indicating a narrow name used for format. */
    @stub
    val NARROW_FORMAT: Int = ???

    /** A style specifier for getDisplayName and getDisplayNames indicating a narrow name independently. */
    @stub
    val NARROW_STANDALONE: Int = ???

    /** Value of the MONTH field indicating the
     *  eleventh month of the year in the Gregorian and Julian calendars.
     */
    @stub
    val NOVEMBER: Int = ???

    /** Value of the MONTH field indicating the
     *  tenth month of the year in the Gregorian and Julian calendars.
     */
    @stub
    val OCTOBER: Int = ???

    /** Value of the AM_PM field indicating the
     *  period of the day from noon to just before midnight.
     */
    @stub
    val PM: Int = ???

    /** Value of the DAY_OF_WEEK field indicating
     *  Saturday.
     */
    @stub
    val SATURDAY: Int = ???

    /** Field number for get and set indicating the
     *  second within the minute.
     */
    @stub
    val SECOND: Int = ???

    /** Value of the MONTH field indicating the
     *  ninth month of the year in the Gregorian and Julian calendars.
     */
    @stub
    val SEPTEMBER: Int = ???

    /** A style specifier for getDisplayName and getDisplayNames equivalent to SHORT_FORMAT. */
    @stub
    val SHORT: Int = ???

    /** A style specifier for getDisplayName and getDisplayNames indicating a short name used for format. */
    @stub
    val SHORT_FORMAT: Int = ???

    /** A style specifier for getDisplayName and getDisplayNames indicating a short name used independently,
     *  such as a month abbreviation as calendar headers.
     */
    @stub
    val SHORT_STANDALONE: Int = ???

    /** Value of the DAY_OF_WEEK field indicating
     *  Sunday.
     */
    @stub
    val SUNDAY: Int = ???

    /** Value of the DAY_OF_WEEK field indicating
     *  Thursday.
     */
    @stub
    val THURSDAY: Int = ???

    /** Value of the DAY_OF_WEEK field indicating
     *  Tuesday.
     */
    @stub
    val TUESDAY: Int = ???

    /** Value of the MONTH field indicating the
     *  thirteenth month of the year.
     */
    @stub
    val UNDECIMBER: Int = ???

    /** Value of the DAY_OF_WEEK field indicating
     *  Wednesday.
     */
    @stub
    val WEDNESDAY: Int = ???

    /** Field number for get and set indicating the
     *  week number within the current month.
     */
    @stub
    val WEEK_OF_MONTH: Int = ???

    /** Field number for get and set indicating the
     *  week number within the current year.
     */
    @stub
    val WEEK_OF_YEAR: Int = ???

    /** Field number for get and set indicating the
     *  year.
     */
    @stub
    val YEAR: Int = ???

    /** Field number for get and set
     *  indicating the raw offset from GMT in milliseconds.
     */
    @stub
    val ZONE_OFFSET: Int = ???

    /** Returns an unmodifiable Set containing all calendar types
     *  supported by Calendar in the runtime environment.
     */
    @stub
    def getAvailableCalendarTypes(): Set[String] = ???

    /** Returns an array of all locales for which the getInstance
     *  methods of this class can return localized instances.
     */
    @stub
    def getAvailableLocales(): Array[Locale] = ???

    /** Gets a calendar using the default time zone and locale. */
    @stub
    def getInstance(): Calendar = ???

    /** Gets a calendar using the default time zone and specified locale. */
    @stub
    def getInstance(aLocale: Locale): Calendar = ???

    /** Gets a calendar using the specified time zone and default locale. */
    @stub
    def getInstance(zone: TimeZone): Calendar = ???

    /** Gets a calendar with the specified time zone and locale. */
    @stub
    def getInstance(zone: TimeZone, aLocale: Locale): Calendar = ???
}
