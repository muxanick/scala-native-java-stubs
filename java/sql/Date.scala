package java.sql

import java.lang.{Object, String}
import java.time.{Instant, LocalDate}
import java.util.Date

// A thin wrapper around a millisecond value that allows
// JDBC to identify this as an SQL DATE value.  A
// milliseconds value represents the number of milliseconds that
// have passed since January 1, 1970 00:00:00.000 GMT.
// 
// To conform with the definition of SQL DATE, the
// millisecond values wrapped by a java.sql.Date instance
// must be 'normalized' by setting the
// hours, minutes, seconds, and milliseconds to zero in the particular
// time zone with which the instance is associated.
class Date extends Date {

    @stub
    // Deprecated. 
    //instead use the constructor Date(long date)
    //
    def this(year: Int, month: Int, day: Int) = ???

    @stub
    // Deprecated.  
    def getHours(): Int = ???

    @stub
    // Deprecated.  
    def getMinutes(): Int = ???

    @stub
    // Deprecated.  
    def getSeconds(): Int = ???

    @stub
    // Deprecated.  
    def setHours(i: Int): Unit = ???

    @stub
    // Deprecated.  
    def setMinutes(i: Int): Unit = ???

    @stub
    // Deprecated.  
    def setSeconds(i: Int): Unit = ???

    @stub
    // Sets an existing Date object
    // using the given milliseconds time value.
    def setTime(date: Long): Unit = ???

    @stub
    // This method always throws an UnsupportedOperationException and should
    // not be used because SQL Date values do not have a time
    // component.
    def toInstant(): Instant = ???

    @stub
    // Converts this Date object to a LocalDate
    def toLocalDate(): LocalDate = ???

    @stub
    // Formats a date in the date escape format yyyy-mm-dd.
    def toString(): String = ???
}

object Date {
    @stub
    // Obtains an instance of Date from a LocalDate object
    // with the same year, month and day of month value as the given
    // LocalDate.
    def valueOf(date: LocalDate): Date = ???
}
