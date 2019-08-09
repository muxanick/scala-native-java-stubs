package java.util

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** SimpleTimeZone is a concrete subclass of TimeZone
 *  that represents a time zone for use with a Gregorian calendar.
 *  The class holds an offset from GMT, called raw offset, and start
 *  and end rules for a daylight saving time schedule.  Since it only holds
 *  single values for each, it cannot handle historical changes in the offset
 *  from GMT and the daylight saving schedule, except that the setStartYear method can specify the year when the daylight
 *  saving time schedule starts in effect.
 *  
 *  To construct a SimpleTimeZone with a daylight saving time
 *  schedule, the schedule can be described with a set of rules,
 *  start-rule and end-rule. A day when daylight saving time
 *  starts or ends is specified by a combination of month,
 *  day-of-month, and day-of-week values. The month
 *  value is represented by a Calendar MONTH field
 *  value, such as Calendar.MARCH. The day-of-week value is
 *  represented by a Calendar DAY_OF_WEEK value,
 *  such as SUNDAY. The meanings of value combinations
 *  are as follows.
 * 
 *  
 *  Exact day of month
 *  To specify an exact day of month, set the month and
 *  day-of-month to an exact value, and day-of-week to zero. For
 *  example, to specify March 1, set the month to MARCH, day-of-month to 1, and day-of-week to 0.
 * 
 *  Day of week on or after day of month
 *  To specify a day of week on or after an exact day of month, set the
 *  month to an exact month value, day-of-month to the day on
 *  or after which the rule is applied, and day-of-week to a negative DAY_OF_WEEK field value. For example, to specify the
 *  second Sunday of April, set month to APRIL,
 *  day-of-month to 8, and day-of-week to -SUNDAY.
 * 
 *  Day of week on or before day of month
 *  To specify a day of the week on or before an exact day of the month, set
 *  day-of-month and day-of-week to a negative value. For
 *  example, to specify the last Wednesday on or before the 21st of March, set
 *  month to MARCH, day-of-month is -21
 *  and day-of-week is -WEDNESDAY. 
 * 
 *  Last day-of-week of month
 *  To specify, the last day-of-week of the month, set day-of-week to a
 *  DAY_OF_WEEK value and day-of-month to
 *  -1. For example, to specify the last Sunday of October, set month
 *  to OCTOBER, day-of-week to SUNDAY and day-of-month to -1.  
 * 
 *  
 *  The time of the day at which daylight saving time starts or ends is
 *  specified by a millisecond value within the day. There are three kinds of
 *  modes to specify the time: WALL_TIME, STANDARD_TIME and UTC_TIME. For example, if daylight
 *  saving time ends
 *  at 2:00 am in the wall clock time, it can be specified by 7200000
 *  milliseconds in the WALL_TIME mode. In this case, the wall clock time
 *  for an end-rule means the same thing as the daylight time.
 *  
 *  The following are examples of parameters for constructing time zone objects.
 *  
 *       // Base GMT offset: -8:00
 *       // DST starts:      at 2:00am in standard time
 *       //                  on the first Sunday in April
 *       // DST ends:        at 2:00am in daylight time
 *       //                  on the last Sunday in October
 *       // Save:            1 hour
 *       SimpleTimeZone(-28800000,
 *                      "America/Los_Angeles",
 *                      Calendar.APRIL, 1, -Calendar.SUNDAY,
 *                      7200000,
 *                      Calendar.OCTOBER, -1, Calendar.SUNDAY,
 *                      7200000,
 *                      3600000)
 * 
 *       // Base GMT offset: +1:00
 *       // DST starts:      at 1:00am in UTC time
 *       //                  on the last Sunday in March
 *       // DST ends:        at 1:00am in UTC time
 *       //                  on the last Sunday in October
 *       // Save:            1 hour
 *       SimpleTimeZone(3600000,
 *                      "Europe/Paris",
 *                      Calendar.MARCH, -1, Calendar.SUNDAY,
 *                      3600000, SimpleTimeZone.UTC_TIME,
 *                      Calendar.OCTOBER, -1, Calendar.SUNDAY,
 *                      3600000, SimpleTimeZone.UTC_TIME,
 *                      3600000)
 *  
 *  These parameter rules are also applicable to the set rule methods, such as
 *  setStartRule.
 */
class SimpleTimeZone extends TimeZone {

    /** Constructs a SimpleTimeZone with the given base time zone offset from GMT
     *  and time zone ID with no daylight saving time schedule.
     */
    @stub
    def this(rawOffset: Int, ID: String) = ???

    /** Constructs a SimpleTimeZone with the given base time zone offset from
     *  GMT, time zone ID, and rules for starting and ending the daylight
     *  time.
     */
    @stub
    def this(rawOffset: Int, ID: String, startMonth: Int, startDay: Int, startDayOfWeek: Int, startTime: Int, endMonth: Int, endDay: Int, endDayOfWeek: Int, endTime: Int) = ???

    /** Constructs a SimpleTimeZone with the given base time zone offset from
     *  GMT, time zone ID, and rules for starting and ending the daylight
     *  time.
     */
    @stub
    def this(rawOffset: Int, ID: String, startMonth: Int, startDay: Int, startDayOfWeek: Int, startTime: Int, endMonth: Int, endDay: Int, endDayOfWeek: Int, endTime: Int, dstSavings: Int) = ???

    /** Constructs a SimpleTimeZone with the given base time zone offset from
     *  GMT, time zone ID, and rules for starting and ending the daylight
     *  time.
     */
    @stub
    def this(rawOffset: Int, ID: String, startMonth: Int, startDay: Int, startDayOfWeek: Int, startTime: Int, startTimeMode: Int, endMonth: Int, endDay: Int, endDayOfWeek: Int, endTime: Int, endTimeMode: Int, dstSavings: Int) = ???

    /** Returns a clone of this SimpleTimeZone instance. */
    @stub
    def clone(): Object = ???

    /** Compares the equality of two SimpleTimeZone objects. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the amount of time in milliseconds that the clock is
     *  advanced during daylight saving time.
     */
    @stub
    def getDSTSavings(): Int = ???

    /** Returns the difference in milliseconds between local time and
     *  UTC, taking into account both the raw offset and the effect of
     *  daylight saving, for the specified date and time.
     */
    @stub
    def getOffset(era: Int, year: Int, month: Int, day: Int, dayOfWeek: Int, millis: Int): Int = ???

    /** Returns the offset of this time zone from UTC at the given
     *  time.
     */
    @stub
    def getOffset(date: Long): Int = ???

    /** Gets the GMT offset for this time zone. */
    @stub
    def getRawOffset(): Int = ???

    /** Generates the hash code for the SimpleDateFormat object. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if this zone has the same rules and offset as another zone. */
    @stub
    def hasSameRules(other: TimeZone): Boolean = ???

    /** Queries if the given date is in daylight saving time. */
    @stub
    def inDaylightTime(date: Date): Boolean = ???

    /** Returns true if this SimpleTimeZone observes
     *  Daylight Saving Time.
     */
    @stub
    def observesDaylightTime(): Boolean = ???

    /** Sets the amount of time in milliseconds that the clock is advanced
     *  during daylight saving time.
     */
    @stub
    def setDSTSavings(millisSavedDuringDST: Int): Unit = ???

    /** Sets the daylight saving time end rule to a fixed date within a month. */
    @stub
    def setEndRule(endMonth: Int, endDay: Int, endTime: Int): Unit = ???

    /** Sets the daylight saving time end rule. */
    @stub
    def setEndRule(endMonth: Int, endDay: Int, endDayOfWeek: Int, endTime: Int): Unit = ???

    /** Sets the daylight saving time end rule to a weekday before or after the given date within
     *  a month, e.g., the first Monday on or after the 8th.
     */
    @stub
    def setEndRule(endMonth: Int, endDay: Int, endDayOfWeek: Int, endTime: Int, after: Boolean): Unit = ???

    /** Sets the base time zone offset to GMT. */
    @stub
    def setRawOffset(offsetMillis: Int): Unit = ???

    /** Sets the daylight saving time start rule to a fixed date within a month. */
    @stub
    def setStartRule(startMonth: Int, startDay: Int, startTime: Int): Unit = ???

    /** Sets the daylight saving time start rule. */
    @stub
    def setStartRule(startMonth: Int, startDay: Int, startDayOfWeek: Int, startTime: Int): Unit = ???

    /** Sets the daylight saving time start rule to a weekday before or after the given date within
     *  a month, e.g., the first Monday on or after the 8th.
     */
    @stub
    def setStartRule(startMonth: Int, startDay: Int, startDayOfWeek: Int, startTime: Int, after: Boolean): Unit = ???

    /** Sets the daylight saving time starting year. */
    @stub
    def setStartYear(year: Int): Unit = ???

    /** Returns a string representation of this time zone. */
    @stub
    def toString(): String = ???

    /** Queries if this time zone uses daylight saving time. */
    @stub
    def useDaylightTime(): Boolean = ???
}

object SimpleTimeZone {
    /** Constant for a mode of start or end time specified as standard time. */
    @stub
    val STANDARD_TIME: Int = ???

    /** Constant for a mode of start or end time specified as UTC. */
    @stub
    val UTC_TIME: Int = ???

    /** Constant for a mode of start or end time specified as wall clock
     *  time.
     */
    @stub
    val WALL_TIME: Int = ???
}
