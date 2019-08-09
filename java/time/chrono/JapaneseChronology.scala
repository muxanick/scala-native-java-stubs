package java.time.chrono

import java.io.Serializable
import java.lang.{Long, Object, String}
import java.time.{Clock, Instant, ZoneId}
import java.time.format.ResolverStyle
import java.time.temporal.{ChronoField, TemporalAccessor, TemporalField, ValueRange}
import java.util.{List, Map}

/** The Japanese Imperial calendar system.
 *  
 *  This chronology defines the rules of the Japanese Imperial calendar system.
 *  This calendar system is primarily used in Japan.
 *  The Japanese Imperial calendar system is the same as the ISO calendar system
 *  apart from the era-based year numbering.
 *  
 *  Japan introduced the Gregorian calendar starting with Meiji 6.
 *  Only Meiji and later eras are supported;
 *  dates before Meiji 6, January 1 are not supported.
 *  
 *  The supported ChronoField instances are:
 *  
 *  DAY_OF_WEEK
 *  DAY_OF_MONTH
 *  DAY_OF_YEAR
 *  EPOCH_DAY
 *  MONTH_OF_YEAR
 *  PROLEPTIC_MONTH
 *  YEAR_OF_ERA
 *  YEAR
 *  ERA
 *  
 */
final class JapaneseChronology extends AbstractChronology with Serializable {

    /** Obtains a local date in Japanese calendar system from the
     *  era, year-of-era, month-of-year and day-of-month fields.
     */
    @stub
    def date(era: Era, yearOfEra: Int, month: Int, dayOfMonth: Int): JapaneseDate = ???

    /** Obtains a local date in Japanese calendar system from the
     *  proleptic-year, month-of-year and day-of-month fields.
     */
    @stub
    def date(prolepticYear: Int, month: Int, dayOfMonth: Int): JapaneseDate = ???

    /** Obtains a local date in this chronology from another temporal object. */
    @stub
    def date(temporal: TemporalAccessor): JapaneseDate = ???

    /** Obtains a local date in the Japanese calendar system from the epoch-day. */
    @stub
    def dateEpochDay(epochDay: Long): JapaneseDate = ???

    /** Obtains the current local date in this chronology from the system clock in the default time-zone. */
    @stub
    def dateNow(): JapaneseDate = ???

    /** Obtains the current local date in this chronology from the specified clock. */
    @stub
    def dateNow(clock: Clock): JapaneseDate = ???

    /** Obtains the current local date in this chronology from the system clock in the specified time-zone. */
    @stub
    def dateNow(zone: ZoneId): JapaneseDate = ???

    /** Obtains a local date in Japanese calendar system from the
     *  era, year-of-era and day-of-year fields.
     */
    @stub
    def dateYearDay(era: Era, yearOfEra: Int, dayOfYear: Int): JapaneseDate = ???

    /** Obtains a local date in Japanese calendar system from the
     *  proleptic-year and day-of-year fields.
     */
    @stub
    def dateYearDay(prolepticYear: Int, dayOfYear: Int): JapaneseDate = ???

    /** Returns the calendar system era object from the given numeric value. */
    @stub
    def eraOf(eraValue: Int): JapaneseEra = ???

    /** Gets the list of eras for the chronology. */
    @stub
    def eras(): List[Era] = ???

    /** Gets the calendar type of the underlying calendar system - 'japanese'. */
    @stub
    def getCalendarType(): String = ???

    /** Gets the ID of the chronology - 'Japanese'. */
    @stub
    def getId(): String = ???

    /** Checks if the specified year is a leap year. */
    @stub
    def isLeapYear(prolepticYear: Long): Boolean = ???

    /** Obtains a local date-time in this chronology from another temporal object. */
    @stub
    def localDateTime(temporal: TemporalAccessor): ChronoLocalDateTime[JapaneseDate] = ???

    /** Calculates the proleptic-year given the era and year-of-era. */
    @stub
    def prolepticYear(era: Era, yearOfEra: Int): Int = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: ChronoField): ValueRange = ???

    /** Resolves parsed ChronoField values into a date during parsing. */
    @stub
    def resolveDate(fieldValues: Map[TemporalField, Long], resolverStyle: ResolverStyle): JapaneseDate = ???

    /** Obtains a ChronoZonedDateTime in this chronology from an Instant. */
    @stub
    def zonedDateTime(instant: Instant, zone: ZoneId): ChronoZonedDateTime[JapaneseDate] = ???
}
