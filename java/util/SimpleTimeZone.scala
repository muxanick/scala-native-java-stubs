package java.util

import java.lang.{Object, String}

// SimpleTimeZone is a concrete subclass of TimeZone
// that represents a time zone for use with a Gregorian calendar.
// The class holds an offset from GMT, called raw offset, and start
// and end rules for a daylight saving time schedule.  Since it only holds
// single values for each, it cannot handle historical changes in the offset
// from GMT and the daylight saving schedule, except that the setStartYear method can specify the year when the daylight
// saving time schedule starts in effect.
// 
// To construct a SimpleTimeZone with a daylight saving time
// schedule, the schedule can be described with a set of rules,
// start-rule and end-rule. A day when daylight saving time
// starts or ends is specified by a combination of month,
// day-of-month, and day-of-week values. The month
// value is represented by a Calendar MONTH field
// value, such as Calendar.MARCH. The day-of-week value is
// represented by a Calendar DAY_OF_WEEK value,
// such as SUNDAY. The meanings of value combinations
// are as follows.
//
// 
// Exact day of month
// To specify an exact day of month, set the month and
// day-of-month to an exact value, and day-of-week to zero. For
// example, to specify March 1, set the month to MARCH, day-of-month to 1, and day-of-week to 0.
//
// Day of week on or after day of month
// To specify a day of week on or after an exact day of month, set the
// month to an exact month value, day-of-month to the day on
// or after which the rule is applied, and day-of-week to a negative DAY_OF_WEEK field value. For example, to specify the
// second Sunday of April, set month to APRIL,
// day-of-month to 8, and day-of-week to -SUNDAY.
//
// Day of week on or before day of month
// To specify a day of the week on or before an exact day of the month, set
// day-of-month and day-of-week to a negative value. For
// example, to specify the last Wednesday on or before the 21st of March, set
// month to MARCH, day-of-month is -21
// and day-of-week is -WEDNESDAY. 
//
// Last day-of-week of month
// To specify, the last day-of-week of the month, set day-of-week to a
// DAY_OF_WEEK value and day-of-month to
// -1. For example, to specify the last Sunday of October, set month
// to OCTOBER, day-of-week to SUNDAY and day-of-month to -1.  
//
// 
// The time of the day at which daylight saving time starts or ends is
// specified by a millisecond value within the day. There are three kinds of
// modes to specify the time: WALL_TIME, STANDARD_TIME and UTC_TIME. For example, if daylight
// saving time ends
// at 2:00 am in the wall clock time, it can be specified by 7200000
// milliseconds in the WALL_TIME mode. In this case, the wall clock time
// for an end-rule means the same thing as the daylight time.
// 
// The following are examples of parameters for constructing time zone objects.
// 
//      // Base GMT offset: -8:00
//      // DST starts:      at 2:00am in standard time
//      //                  on the first Sunday in April
//      // DST ends:        at 2:00am in daylight time
//      //                  on the last Sunday in October
//      // Save:            1 hour
//      SimpleTimeZone(-28800000,
//                     "America/Los_Angeles",
//                     Calendar.APRIL, 1, -Calendar.SUNDAY,
//                     7200000,
//                     Calendar.OCTOBER, -1, Calendar.SUNDAY,
//                     7200000,
//                     3600000)
//
//      // Base GMT offset: +1:00
//      // DST starts:      at 1:00am in UTC time
//      //                  on the last Sunday in March
//      // DST ends:        at 1:00am in UTC time
//      //                  on the last Sunday in October
//      // Save:            1 hour
//      SimpleTimeZone(3600000,
//                     "Europe/Paris",
//                     Calendar.MARCH, -1, Calendar.SUNDAY,
//                     3600000, SimpleTimeZone.UTC_TIME,
//                     Calendar.OCTOBER, -1, Calendar.SUNDAY,
//                     3600000, SimpleTimeZone.UTC_TIME,
//                     3600000)
// 
// These parameter rules are also applicable to the set rule methods, such as
// setStartRule.
class SimpleTimeZone extends TimeZone {

    @stub
    // Constructs a SimpleTimeZone with the given base time zone offset from GMT
    // and time zone ID with no daylight saving time schedule.
    def this(rawOffset: Int, ID: String) = ???

    @stub
    // Constructs a SimpleTimeZone with the given base time zone offset from
    // GMT, time zone ID, and rules for starting and ending the daylight
    // time.
    def this(rawOffset: Int, ID: String, startMonth: Int, startDay: Int, startDayOfWeek: Int, startTime: Int, endMonth: Int, endDay: Int, endDayOfWeek: Int, endTime: Int) = ???

    @stub
    // Constructs a SimpleTimeZone with the given base time zone offset from
    // GMT, time zone ID, and rules for starting and ending the daylight
    // time.
    def this(rawOffset: Int, ID: String, startMonth: Int, startDay: Int, startDayOfWeek: Int, startTime: Int, endMonth: Int, endDay: Int, endDayOfWeek: Int, endTime: Int, dstSavings: Int) = ???

    @stub
    // Returns a clone of this SimpleTimeZone instance.
    def clone(): Object = ???

    @stub
    // Compares the equality of two SimpleTimeZone objects.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the amount of time in milliseconds that the clock is
    // advanced during daylight saving time.
    def getDSTSavings(): Int = ???

    @stub
    // Returns the difference in milliseconds between local time and
    // UTC, taking into account both the raw offset and the effect of
    // daylight saving, for the specified date and time.
    def getOffset(era: Int, year: Int, month: Int, day: Int, dayOfWeek: Int, millis: Int): Int = ???

    @stub
    // Returns the offset of this time zone from UTC at the given
    // time.
    def getOffset(date: Long): Int = ???

    @stub
    // Gets the GMT offset for this time zone.
    def getRawOffset(): Int = ???

    @stub
    // Generates the hash code for the SimpleDateFormat object.
    def hashCode(): Int = ???

    @stub
    // Returns true if this zone has the same rules and offset as another zone.
    def hasSameRules(other: TimeZone): Boolean = ???

    @stub
    // Queries if the given date is in daylight saving time.
    def inDaylightTime(date: Date): Boolean = ???

    @stub
    // Returns true if this SimpleTimeZone observes
    // Daylight Saving Time.
    def observesDaylightTime(): Boolean = ???

    @stub
    // Sets the amount of time in milliseconds that the clock is advanced
    // during daylight saving time.
    def setDSTSavings(millisSavedDuringDST: Int): Unit = ???

    @stub
    // Sets the daylight saving time end rule to a fixed date within a month.
    def setEndRule(endMonth: Int, endDay: Int, endTime: Int): Unit = ???

    @stub
    // Sets the daylight saving time end rule.
    def setEndRule(endMonth: Int, endDay: Int, endDayOfWeek: Int, endTime: Int): Unit = ???

    @stub
    // Sets the daylight saving time end rule to a weekday before or after the given date within
    // a month, e.g., the first Monday on or after the 8th.
    def setEndRule(endMonth: Int, endDay: Int, endDayOfWeek: Int, endTime: Int, after: Boolean): Unit = ???

    @stub
    // Sets the base time zone offset to GMT.
    def setRawOffset(offsetMillis: Int): Unit = ???

    @stub
    // Sets the daylight saving time start rule to a fixed date within a month.
    def setStartRule(startMonth: Int, startDay: Int, startTime: Int): Unit = ???

    @stub
    // Sets the daylight saving time start rule.
    def setStartRule(startMonth: Int, startDay: Int, startDayOfWeek: Int, startTime: Int): Unit = ???

    @stub
    // Sets the daylight saving time start rule to a weekday before or after the given date within
    // a month, e.g., the first Monday on or after the 8th.
    def setStartRule(startMonth: Int, startDay: Int, startDayOfWeek: Int, startTime: Int, after: Boolean): Unit = ???

    @stub
    // Sets the daylight saving time starting year.
    def setStartYear(year: Int): Unit = ???

    @stub
    // Returns a string representation of this time zone.
    def toString(): String = ???
}

object SimpleTimeZone {
    @stub
    // Constant for a mode of start or end time specified as standard time.
    def STANDARD_TIME: Int = ???

    @stub
    // Constant for a mode of start or end time specified as UTC.
    def UTC_TIME: Int = ???
}
