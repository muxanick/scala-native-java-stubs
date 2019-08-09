package java.time.chrono

import java.io.Serializable
import java.lang.{Long, Object, String}
import java.time.{Clock, Instant, ZoneId}
import java.time.format.ResolverStyle
import java.time.temporal.{ChronoField, TemporalAccessor, TemporalField, ValueRange}
import java.util.{List, Map}

// The Japanese Imperial calendar system.
// 
// This chronology defines the rules of the Japanese Imperial calendar system.
// This calendar system is primarily used in Japan.
// The Japanese Imperial calendar system is the same as the ISO calendar system
// apart from the era-based year numbering.
// 
// Japan introduced the Gregorian calendar starting with Meiji 6.
// Only Meiji and later eras are supported;
// dates before Meiji 6, January 1 are not supported.
// 
// The supported ChronoField instances are:
// 
// DAY_OF_WEEK
// DAY_OF_MONTH
// DAY_OF_YEAR
// EPOCH_DAY
// MONTH_OF_YEAR
// PROLEPTIC_MONTH
// YEAR_OF_ERA
// YEAR
// ERA
// 
final class JapaneseChronology extends AbstractChronology with Serializable {

    @stub
    // Obtains a local date in Japanese calendar system from the
    // era, year-of-era, month-of-year and day-of-month fields.
    def date(era: Era, yearOfEra: Int, month: Int, dayOfMonth: Int): JapaneseDate = ???

    @stub
    // Obtains a local date in Japanese calendar system from the
    // proleptic-year, month-of-year and day-of-month fields.
    def date(prolepticYear: Int, month: Int, dayOfMonth: Int): JapaneseDate = ???

    @stub
    // Obtains a local date in this chronology from another temporal object.
    def date(temporal: TemporalAccessor): JapaneseDate = ???

    @stub
    // Obtains a local date in the Japanese calendar system from the epoch-day.
    def dateEpochDay(epochDay: Long): JapaneseDate = ???

    @stub
    // Obtains the current local date in this chronology from the system clock in the default time-zone.
    def dateNow(): JapaneseDate = ???

    @stub
    // Obtains the current local date in this chronology from the specified clock.
    def dateNow(clock: Clock): JapaneseDate = ???

    @stub
    // Obtains the current local date in this chronology from the system clock in the specified time-zone.
    def dateNow(zone: ZoneId): JapaneseDate = ???

    @stub
    // Obtains a local date in Japanese calendar system from the
    // era, year-of-era and day-of-year fields.
    def dateYearDay(era: Era, yearOfEra: Int, dayOfYear: Int): JapaneseDate = ???

    @stub
    // Obtains a local date in Japanese calendar system from the
    // proleptic-year and day-of-year fields.
    def dateYearDay(prolepticYear: Int, dayOfYear: Int): JapaneseDate = ???

    @stub
    // Returns the calendar system era object from the given numeric value.
    def eraOf(eraValue: Int): JapaneseEra = ???

    @stub
    // Gets the list of eras for the chronology.
    def eras(): List[Era] = ???

    @stub
    // Gets the calendar type of the underlying calendar system - 'japanese'.
    def getCalendarType(): String = ???

    @stub
    // Gets the ID of the chronology - 'Japanese'.
    def getId(): String = ???

    @stub
    // Checks if the specified year is a leap year.
    def isLeapYear(prolepticYear: Long): Boolean = ???

    @stub
    // Obtains a local date-time in this chronology from another temporal object.
    def localDateTime(temporal: TemporalAccessor): ChronoLocalDateTime[JapaneseDate] = ???

    @stub
    // Calculates the proleptic-year given the era and year-of-era.
    def prolepticYear(era: Era, yearOfEra: Int): Int = ???

    @stub
    // Gets the range of valid values for the specified field.
    def range(field: ChronoField): ValueRange = ???

    @stub
    // Resolves parsed ChronoField values into a date during parsing.
    def resolveDate(fieldValues: Map[TemporalField, Long], resolverStyle: ResolverStyle): JapaneseDate = ???

    @stub
    // Obtains a ChronoZonedDateTime in this chronology from an Instant.
    def zonedDateTime(instant: Instant, zone: ZoneId): ChronoZonedDateTime[JapaneseDate] = ???
}
