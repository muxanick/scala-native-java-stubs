package java.time.temporal

import java.lang.Object
import java.time.{LocalDate, LocalTime, ZoneId, ZoneOffset}
import java.time.chrono.Chronology
import scala.scalanative.annotation.stub

/** Common implementations of TemporalQuery.
 *  
 *  This class provides common implementations of TemporalQuery.
 *  These are defined here as they must be constants, and the definition
 *  of lambdas does not guarantee that. By assigning them once here,
 *  they become 'normal' Java constants.
 *  
 *  Queries are a key tool for extracting information from temporal objects.
 *  They exist to externalize the process of querying, permitting different
 *  approaches, as per the strategy design pattern.
 *  Examples might be a query that checks if the date is the day before February 29th
 *  in a leap year, or calculates the number of days to your next birthday.
 *  
 *  The TemporalField interface provides another mechanism for querying
 *  temporal objects. That interface is limited to returning a long.
 *  By contrast, queries can return any type.
 *  
 *  There are two equivalent ways of using a TemporalQuery.
 *  The first is to invoke the method on this interface directly.
 *  The second is to use TemporalAccessor.query(TemporalQuery):
 *  
 *    // these two lines are equivalent, but the second approach is recommended
 *    temporal = thisQuery.queryFrom(temporal);
 *    temporal = temporal.query(thisQuery);
 *  
 *  It is recommended to use the second approach, query(TemporalQuery),
 *  as it is a lot clearer to read in code.
 *  
 *  The most common implementations are method references, such as
 *  LocalDate::from and ZoneId::from.
 *  Additional common queries are provided to return:
 *  
 *   a Chronology,
 *   a LocalDate,
 *   a LocalTime,
 *   a ZoneOffset,
 *   a precision,
 *   a zone, or
 *   a zoneId.
 *  
 */
final class TemporalQueries extends Object {
}

object TemporalQueries {
    /** A query for the Chronology. */
    @stub
    def chronology(): TemporalQuery[Chronology] = ???

    /** A query for LocalDate returning null if not found. */
    @stub
    def localDate(): TemporalQuery[LocalDate] = ???

    /** A query for LocalTime returning null if not found. */
    @stub
    def localTime(): TemporalQuery[LocalTime] = ???

    /** A query for ZoneOffset returning null if not found. */
    @stub
    def offset(): TemporalQuery[ZoneOffset] = ???

    /** A query for the smallest supported unit. */
    @stub
    def precision(): TemporalQuery[TemporalUnit] = ???

    /** A lenient query for the ZoneId, falling back to the ZoneOffset. */
    @stub
    def zone(): TemporalQuery[ZoneId] = ???

    /** A strict query for the ZoneId. */
    @stub
    def zoneId(): TemporalQuery[ZoneId] = ???
}
