package java.util

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import java.time.ZoneId

// TimeZone represents a time zone offset, and also figures out daylight
// savings.
//
// 
// Typically, you get a TimeZone using getDefault
// which creates a TimeZone based on the time zone where the program
// is running. For example, for a program running in Japan, getDefault
// creates a TimeZone object based on Japanese Standard Time.
//
// 
// You can also get a TimeZone using getTimeZone
// along with a time zone ID. For instance, the time zone ID for the
// U.S. Pacific Time zone is "America/Los_Angeles". So, you can get a
// U.S. Pacific Time TimeZone object with:
// 
// TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
// 
// You can use the getAvailableIDs method to iterate through
// all the supported time zone IDs. You can then choose a
// supported ID to get a TimeZone.
// If the time zone you want is not represented by one of the
// supported IDs, then a custom time zone ID can be specified to
// produce a TimeZone. The syntax of a custom time zone ID is:
//
// 
// CustomID:
//         GMT Sign Hours : Minutes
//         GMT Sign Hours Minutes
//         GMT Sign Hours
// Sign: one of
//         + -
// Hours:
//         Digit
//         Digit Digit
// Minutes:
//         Digit Digit
// Digit: one of
//         0 1 2 3 4 5 6 7 8 9
// 
//
// Hours must be between 0 to 23 and Minutes must be
// between 00 to 59.  For example, "GMT+10" and "GMT+0010" mean ten
// hours and ten minutes ahead of GMT, respectively.
// 
// The format is locale independent and digits must be taken from the
// Basic Latin block of the Unicode standard. No daylight saving time
// transition schedule can be specified with a custom time zone ID. If
// the specified string doesn't match the syntax, "GMT"
// is used.
// 
// When creating a TimeZone, the specified custom time
// zone ID is normalized in the following syntax:
// 
// NormalizedCustomID:
//         GMT Sign TwoDigitHours : Minutes
// Sign: one of
//         + -
// TwoDigitHours:
//         Digit Digit
// Minutes:
//         Digit Digit
// Digit: one of
//         0 1 2 3 4 5 6 7 8 9
// 
// For example, TimeZone.getTimeZone("GMT-8").getID() returns "GMT-08:00".
//
// Three-letter time zone IDs
//
// For compatibility with JDK 1.1.x, some other three-letter time zone IDs
// (such as "PST", "CTT", "AST") are also supported. However, their
// use is deprecated because the same abbreviation is often used
// for multiple time zones (for example, "CST" could be U.S. "Central Standard
// Time" and "China Standard Time"), and the Java platform can then only
// recognize one of them.
abstract class TimeZone extends Object with Serializable, with Cloneable {

    // Creates a copy of this TimeZone.
    def clone(): Object

    // Returns a long standard time name of this TimeZone suitable for
    // presentation to the user in the default locale.
    def getDisplayName(): String

    // Returns a name in the specified style of this TimeZone
    // suitable for presentation to the user in the default locale.
    def getDisplayName(daylight: Boolean, style: Int): String

    // Returns a name in the specified style of this TimeZone
    // suitable for presentation to the user in the specified locale.
    def getDisplayName(daylight: Boolean, style: Int, locale: Locale): String

    // Returns a long standard time name of this TimeZone suitable for
    // presentation to the user in the specified locale.
    def getDisplayName(locale: Locale): String

    // Returns the amount of time to be added to local standard time
    // to get local wall clock time.
    def getDSTSavings(): Int

    // Gets the ID of this time zone.
    def getID(): String

    // Gets the time zone offset, for current date, modified in case of
    // daylight savings.
    def getOffset(era: Int, year: Int, month: Int, day: Int, dayOfWeek: Int, milliseconds: Int): Int

    // Returns the offset of this time zone from UTC at the specified
    // date.
    def getOffset(date: Long): Int

    // Returns the amount of time in milliseconds to add to UTC to get
    // standard time in this time zone.
    def getRawOffset(): Int

    // Returns true if this zone has the same rule and offset as another zone.
    def hasSameRules(other: TimeZone): Boolean

    // Queries if the given date is in Daylight Saving Time in
    // this time zone.
    def inDaylightTime(date: Date): Boolean

    // Returns true if this TimeZone is currently in
    // Daylight Saving Time, or if a transition from Standard Time to
    // Daylight Saving Time occurs at any future time.
    def observesDaylightTime(): Boolean

    // Sets the time zone ID.
    def setID(ID: String): Unit

    // Sets the base time zone offset to GMT.
    def setRawOffset(offsetMillis: Int): Unit

    // Converts this TimeZone object to a ZoneId.
    def toZoneId(): ZoneId
}

object TimeZone {
    @stub
    // A style specifier for getDisplayName() indicating
    // a long name, such as "Pacific Standard Time."
    def LONG: Int = ???

    @stub
    // Gets all the available IDs supported.
    def getAvailableIDs(): Array[String] = ???

    @stub
    // Gets the available IDs according to the given time zone offset in milliseconds.
    def getAvailableIDs(rawOffset: Int): Array[String] = ???

    @stub
    // Gets the default TimeZone of the Java virtual machine.
    def getDefault(): TimeZone = ???

    @stub
    // Gets the TimeZone for the given ID.
    def getTimeZone(ID: String): TimeZone = ???

    @stub
    // Gets the TimeZone for the given zoneId.
    def getTimeZone(zoneId: ZoneId): TimeZone = ???

    @stub
    // Sets the TimeZone that is returned by the getDefault
    // method.
    def setDefault(zone: TimeZone): Unit = ???
}
