package java.util

import java.lang.{Object, String}
import java.time.ZonedDateTime
import scala.scalanative.annotation.stub

/** GregorianCalendar is a concrete subclass of
 *  Calendar and provides the standard calendar system
 *  used by most of the world.
 * 
 *   GregorianCalendar is a hybrid calendar that
 *  supports both the Julian and Gregorian calendar systems with the
 *  support of a single discontinuity, which corresponds by default to
 *  the Gregorian date when the Gregorian calendar was instituted
 *  (October 15, 1582 in some countries, later in others).  The cutover
 *  date may be changed by the caller by calling setGregorianChange().
 * 
 *  
 *  Historically, in those countries which adopted the Gregorian calendar first,
 *  October 4, 1582 (Julian) was thus followed by October 15, 1582 (Gregorian). This calendar models
 *  this correctly.  Before the Gregorian cutover, GregorianCalendar
 *  implements the Julian calendar.  The only difference between the Gregorian
 *  and the Julian calendar is the leap year rule. The Julian calendar specifies
 *  leap years every four years, whereas the Gregorian calendar omits century
 *  years which are not divisible by 400.
 * 
 *  
 *  GregorianCalendar implements proleptic Gregorian and
 *  Julian calendars. That is, dates are computed by extrapolating the current
 *  rules indefinitely far backward and forward in time. As a result,
 *  GregorianCalendar may be used for all years to generate
 *  meaningful and consistent results. However, dates obtained using
 *  GregorianCalendar are historically accurate only from March 1, 4
 *  AD onward, when modern Julian calendar rules were adopted.  Before this date,
 *  leap year rules were applied irregularly, and before 45 BC the Julian
 *  calendar did not even exist.
 * 
 *  
 *  Prior to the institution of the Gregorian calendar, New Year's Day was
 *  March 25. To avoid confusion, this calendar always uses January 1. A manual
 *  adjustment may be made if desired for dates that are prior to the Gregorian
 *  changeover and which fall between January 1 and March 24.
 * 
 *  Week Of Year and Week Year
 * 
 *  Values calculated for the WEEK_OF_YEAR field range from 1 to 53. The first week of a
 *  calendar year is the earliest seven day period starting on getFirstDayOfWeek() that contains at
 *  least getMinimalDaysInFirstWeek() days from that year. It thus depends
 *  on the values of getMinimalDaysInFirstWeek(), getFirstDayOfWeek(), and the day of the week of January 1. Weeks
 *  between week 1 of one year and week 1 of the following year
 *  (exclusive) are numbered sequentially from 2 to 52 or 53 (except
 *  for year(s) involved in the Julian-Gregorian transition).
 * 
 *  The getFirstDayOfWeek() and getMinimalDaysInFirstWeek() values are initialized using
 *  locale-dependent resources when constructing a GregorianCalendar. The week
 *  determination is compatible with the ISO 8601 standard when getFirstDayOfWeek() is MONDAY and getMinimalDaysInFirstWeek() is 4, which values are used in locales
 *  where the standard is preferred. These values can explicitly be set by
 *  calling setFirstDayOfWeek() and
 *  setMinimalDaysInFirstWeek().
 * 
 *  A week year is in sync with a
 *  WEEK_OF_YEAR cycle. All weeks between the first and last
 *  weeks (inclusive) have the same week year value.
 *  Therefore, the first and last days of a week year may have
 *  different calendar year values.
 * 
 *  For example, January 1, 1998 is a Thursday. If getFirstDayOfWeek() is MONDAY and getMinimalDaysInFirstWeek() is 4 (ISO 8601 standard compatible
 *  setting), then week 1 of 1998 starts on December 29, 1997, and ends
 *  on January 4, 1998. The week year is 1998 for the last three days
 *  of calendar year 1997. If, however, getFirstDayOfWeek() is
 *  SUNDAY, then week 1 of 1998 starts on January 4, 1998, and
 *  ends on January 10, 1998; the first three days of 1998 then are
 *  part of week 53 of 1997 and their week year is 1997.
 * 
 *  Week Of Month
 * 
 *  Values calculated for the WEEK_OF_MONTH field range from 0
 *  to 6.  Week 1 of a month (the days with WEEK_OF_MONTH =
 *  1) is the earliest set of at least
 *  getMinimalDaysInFirstWeek() contiguous days in that month,
 *  ending on the day before getFirstDayOfWeek().  Unlike
 *  week 1 of a year, week 1 of a month may be shorter than 7 days, need
 *  not start on getFirstDayOfWeek(), and will not include days of
 *  the previous month.  Days of a month before week 1 have a
 *  WEEK_OF_MONTH of 0.
 * 
 *  For example, if getFirstDayOfWeek() is SUNDAY
 *  and getMinimalDaysInFirstWeek() is 4, then the first week of
 *  January 1998 is Sunday, January 4 through Saturday, January 10.  These days
 *  have a WEEK_OF_MONTH of 1.  Thursday, January 1 through
 *  Saturday, January 3 have a WEEK_OF_MONTH of 0.  If
 *  getMinimalDaysInFirstWeek() is changed to 3, then January 1
 *  through January 3 have a WEEK_OF_MONTH of 1.
 * 
 *  Default Fields Values
 * 
 *  The clear method sets calendar field(s)
 *  undefined. GregorianCalendar uses the following
 *  default value for each calendar field if its value is undefined.
 * 
 *  
 *    
 *      
 *        Field
 *        
 *        Default Value
 *        
 *      
 *      
 *        
 *               ERA
 *        
 *        
 *               AD
 *        
 *      
 *      
 *        
 *               YEAR
 *        
 *        
 *               1970
 *        
 *      
 *      
 *        
 *               MONTH
 *        
 *        
 *               JANUARY
 *        
 *      
 *      
 *        
 *               DAY_OF_MONTH
 *        
 *        
 *               1
 *        
 *      
 *      
 *        
 *               DAY_OF_WEEK
 *        
 *        
 *               the first day of week
 *        
 *      
 *      
 *        
 *               WEEK_OF_MONTH
 *        
 *        
 *               0
 *        
 *      
 *      
 *        
 *               DAY_OF_WEEK_IN_MONTH
 *        
 *        
 *               1
 *        
 *      
 *      
 *        
 *               AM_PM
 *        
 *        
 *               AM
 *        
 *      
 *      
 *        
 *               HOUR, HOUR_OF_DAY, MINUTE, SECOND, MILLISECOND
 *        
 *        
 *               0
 *        
 *      
 *    
 *  
 *  Default values are not applicable for the fields not listed above.
 * 
 *  
 *  Example:
 *  
 *  
 *  // get the supported ids for GMT-08:00 (Pacific Standard Time)
 *  String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
 *  // if no ids were returned, something is wrong. get out.
 *  if (ids.length == 0)
 *      System.exit(0);
 * 
 *   // begin output
 *  System.out.println("Current Time");
 * 
 *  // create a Pacific Standard Time time zone
 *  SimpleTimeZone pdt = new SimpleTimeZone(-8 * 60 * 60 * 1000, ids[0]);
 * 
 *  // set up rules for Daylight Saving Time
 *  pdt.setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
 *  pdt.setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
 * 
 *  // create a GregorianCalendar with the Pacific Daylight time zone
 *  // and the current date and time
 *  Calendar calendar = new GregorianCalendar(pdt);
 *  Date trialTime = new Date();
 *  calendar.setTime(trialTime);
 * 
 *  // print out a bunch of interesting things
 *  System.out.println("ERA: " + calendar.get(Calendar.ERA));
 *  System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
 *  System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
 *  System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
 *  System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
 *  System.out.println("DATE: " + calendar.get(Calendar.DATE));
 *  System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
 *  System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
 *  System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
 *  System.out.println("DAY_OF_WEEK_IN_MONTH: "
 *                     + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
 *  System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
 *  System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
 *  System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
 *  System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
 *  System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
 *  System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
 *  System.out.println("ZONE_OFFSET: "
 *                     + (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
 *  System.out.println("DST_OFFSET: "
 *                     + (calendar.get(Calendar.DST_OFFSET)/(60*60*1000)));
 * 
 *  System.out.println("Current Time, with hour reset to 3");
 *  calendar.clear(Calendar.HOUR_OF_DAY); // so doesn't override
 *  calendar.set(Calendar.HOUR, 3);
 *  System.out.println("ERA: " + calendar.get(Calendar.ERA));
 *  System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
 *  System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
 *  System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
 *  System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
 *  System.out.println("DATE: " + calendar.get(Calendar.DATE));
 *  System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
 *  System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
 *  System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
 *  System.out.println("DAY_OF_WEEK_IN_MONTH: "
 *                     + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
 *  System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
 *  System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
 *  System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
 *  System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
 *  System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
 *  System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
 *  System.out.println("ZONE_OFFSET: "
 *         + (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000))); // in hours
 *  System.out.println("DST_OFFSET: "
 *         + (calendar.get(Calendar.DST_OFFSET)/(60*60*1000))); // in hours
 *  
 *  
 */
class GregorianCalendar extends Calendar {

    /** Constructs a default GregorianCalendar using the current time
     *  in the default time zone with the default
     *  FORMAT locale.
     */
    @stub
    def this() = ???

    /** Constructs a GregorianCalendar with the given date set
     *  in the default time zone with the default locale.
     */
    @stub
    def this(year: Int, month: Int, dayOfMonth: Int) = ???

    /** Constructs a GregorianCalendar with the given date
     *  and time set for the default time zone with the default locale.
     */
    @stub
    def this(year: Int, month: Int, dayOfMonth: Int, hourOfDay: Int, minute: Int) = ???

    /** Constructs a GregorianCalendar with the given date
     *  and time set for the default time zone with the default locale.
     */
    @stub
    def this(year: Int, month: Int, dayOfMonth: Int, hourOfDay: Int, minute: Int, second: Int) = ???

    /** Constructs a GregorianCalendar based on the current time
     *  in the default time zone with the given locale.
     */
    @stub
    def this(aLocale: Locale) = ???

    /** Constructs a GregorianCalendar based on the current time
     *  in the given time zone with the default
     *  FORMAT locale.
     */
    @stub
    def this(zone: TimeZone) = ???

    /** Constructs a GregorianCalendar based on the current time
     *  in the given time zone with the given locale.
     */
    @stub
    def this(zone: TimeZone, aLocale: Locale) = ???

    /** Adds the specified (signed) amount of time to the given calendar field,
     *  based on the calendar's rules.
     */
    @stub
    def add(field: Int, amount: Int): Unit = ???

    /** Creates and returns a copy of this object. */
    @stub
    def clone(): Any = ???

    /** Converts the time value (millisecond offset from the Epoch) to calendar field values. */
    @stub
    protected def computeFields(): Unit = ???

    /** Converts calendar field values to the time value (millisecond
     *  offset from the Epoch).
     */
    @stub
    protected def computeTime(): Unit = ???

    /** Compares this GregorianCalendar to the specified
     *  Object.
     */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the maximum value that this calendar field could have,
     *  taking into consideration the given time value and the current
     *  values of the
     *  getFirstDayOfWeek,
     *  getMinimalDaysInFirstWeek,
     *  getGregorianChange and
     *  getTimeZone methods.
     */
    @stub
    def getActualMaximum(field: Int): Int = ???

    /** Returns the minimum value that this calendar field could have,
     *  taking into consideration the given time value and the current
     *  values of the
     *  getFirstDayOfWeek,
     *  getMinimalDaysInFirstWeek,
     *  getGregorianChange and
     *  getTimeZone methods.
     */
    @stub
    def getActualMinimum(field: Int): Int = ???

    /** Returns "gregory" as the calendar type. */
    @stub
    def getCalendarType(): String = ???

    /** Returns the highest minimum value for the given calendar field
     *  of this GregorianCalendar instance.
     */
    @stub
    def getGreatestMinimum(field: Int): Int = ???

    /** Gets the Gregorian Calendar change date. */
    @stub
    def getGregorianChange(): Date = ???

    /** Returns the lowest maximum value for the given calendar field
     *  of this GregorianCalendar instance.
     */
    @stub
    def getLeastMaximum(field: Int): Int = ???

    /** Returns the maximum value for the given calendar field of this
     *  GregorianCalendar instance.
     */
    @stub
    def getMaximum(field: Int): Int = ???

    /** Returns the minimum value for the given calendar field of this
     *  GregorianCalendar instance.
     */
    @stub
    def getMinimum(field: Int): Int = ???

    /** Gets the time zone. */
    @stub
    def getTimeZone(): TimeZone = ???

    /** Returns the number of weeks in the week year
     *  represented by this GregorianCalendar.
     */
    @stub
    def getWeeksInWeekYear(): Int = ???

    /** Returns the week year represented by this
     *  GregorianCalendar.
     */
    @stub
    def getWeekYear(): Int = ???

    /** Generates the hash code for this GregorianCalendar object. */
    @stub
    def hashCode(): Int = ???

    /** Determines if the given year is a leap year. */
    @stub
    def isLeapYear(year: Int): Boolean = ???

    /** Returns true indicating this GregorianCalendar
     *  supports week dates.
     */
    @stub
    def isWeekDateSupported(): Boolean = ???

    /** Adds or subtracts (up/down) a single unit of time on the given time
     *  field without changing larger fields.
     */
    @stub
    def roll(field: Int, up: Boolean): Unit = ???

    /** Adds a signed amount to the specified calendar field without changing larger fields. */
    @stub
    def roll(field: Int, amount: Int): Unit = ???

    /** Sets the GregorianCalendar change date. */
    @stub
    def setGregorianChange(date: Date): Unit = ???

    /** Sets the time zone with the given time zone value. */
    @stub
    def setTimeZone(zone: TimeZone): Unit = ???

    /** Sets this GregorianCalendar to the date given by the
     *  date specifiers - weekYear,
     *  weekOfYear, and dayOfWeek.
     */
    @stub
    def setWeekDate(weekYear: Int, weekOfYear: Int, dayOfWeek: Int): Unit = ???

    /** Converts this object to a ZonedDateTime that represents
     *  the same point on the time-line as this GregorianCalendar.
     */
    @stub
    def toZonedDateTime(): ZonedDateTime = ???
}

object GregorianCalendar {
    /** Value of the ERA field indicating
     *  the common era (Anno Domini), also known as CE.
     */
    @stub
    val AD: Int = ???

    /** Value of the ERA field indicating
     *  the period before the common era (before Christ), also known as BCE.
     */
    @stub
    val BC: Int = ???

    /** Obtains an instance of GregorianCalendar with the default locale
     *  from a ZonedDateTime object.
     */
    @stub
    def from(zdt: ZonedDateTime): GregorianCalendar = ???
}
