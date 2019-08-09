package java.time.temporal

import scala.scalanative.annotation.stub

/** Framework-level interface defining read-only access to a temporal object,
 *  such as a date, time, offset or some combination of these.
 *  
 *  This is the base interface type for date, time and offset objects.
 *  It is implemented by those classes that can provide information
 *  as fields or queries.
 *  
 *  Most date and time information can be represented as a number.
 *  These are modeled using TemporalField with the number held using
 *  a long to handle large values. Year, month and day-of-month are
 *  simple examples of fields, but they also include instant and offsets.
 *  See ChronoField for the standard set of fields.
 *  
 *  Two pieces of date/time information cannot be represented by numbers,
 *  the chronology and the
 *  time-zone.
 *  These can be accessed via queries using
 *  the static methods defined on TemporalQuery.
 *  
 *  A sub-interface, Temporal, extends this definition to one that also
 *  supports adjustment and manipulation on more complete temporal objects.
 *  
 *  This interface is a framework-level interface that should not be widely
 *  used in application code. Instead, applications should create and pass
 *  around instances of concrete types, such as LocalDate.
 *  There are many reasons for this, part of which is that implementations
 *  of this interface may be in calendar systems other than ISO.
 *  See ChronoLocalDate for a fuller discussion of the issues.
 */
trait TemporalAccessor {

    /** Gets the value of the specified field as an int. */
    @stub
    def get(field: TemporalField): Int = ???

    /** Gets the value of the specified field as a long. */
    @stub
    def getLong(field: TemporalField): Long = ???

    /** Checks if the specified field is supported. */
    @stub
    def isSupported(field: TemporalField): Boolean = ???

    /** Queries this date-time. */
    @stub
    val R: default[R] = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: TemporalField): ValueRange = ???
}
