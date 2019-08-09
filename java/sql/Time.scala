package java.sql

import java.lang.{Object, String}
import java.time.{Instant, LocalTime}
import java.util.Date

// A thin wrapper around the java.util.Date class that allows the JDBC
// API to identify this as an SQL TIME value. The Time
// class adds formatting and
// parsing operations to support the JDBC escape syntax for time
// values.
// The date components should be set to the "zero epoch"
// value of January 1, 1970 and should not be accessed.
class Time extends Date {

    @stub
    // Deprecated. 
    //Use the constructor that takes a milliseconds value
    //             in place of this constructor
    //
    def this(hour: Int, minute: Int, second: Int) = ???

    @stub
    // Deprecated.  
    def getDate(): Int = ???

    @stub
    // Deprecated.  
    def getDay(): Int = ???

    @stub
    // Deprecated.  
    def getMonth(): Int = ???

    @stub
    // Deprecated.  
    def getYear(): Int = ???

    @stub
    // Deprecated.  
    def setDate(i: Int): Unit = ???

    @stub
    // Deprecated.  
    def setMonth(i: Int): Unit = ???

    @stub
    // Sets a Time object using a milliseconds time value.
    def setTime(time: Long): Unit = ???

    @stub
    // Deprecated.  
    def setYear(i: Int): Unit = ???

    @stub
    // This method always throws an UnsupportedOperationException and should
    // not be used because SQL Time values do not have a date
    // component.
    def toInstant(): Instant = ???

    @stub
    // Converts this Time object to a LocalTime.
    def toLocalTime(): LocalTime = ???

    @stub
    // Formats a time in JDBC time escape format.
    def toString(): String = ???
}

object Time {
    @stub
    // Obtains an instance of Time from a LocalTime object
    // with the same hour, minute and second time value as the given
    // LocalTime.
    def valueOf(time: LocalTime): Time = ???
}
