package java.time.chrono

import java.io.Serializable
import java.lang.{Long, Object, String}
import java.time.{Clock, Instant, ZoneId}
import java.time.format.ResolverStyle
import java.time.temporal.{ChronoField, TemporalAccessor, TemporalField, ValueRange}
import java.util.{List, Map}

// The Minguo calendar system.
// 
// This chronology defines the rules of the Minguo calendar system.
// This calendar system is primarily used in the Republic of China, often known as Taiwan.
// Dates are aligned such that 0001-01-01 (Minguo) is 1912-01-01 (ISO).
// 
// The fields are defined as follows:
// 
// era - There are two eras, the current 'Republic' (ERA_ROC) and the previous era (ERA_BEFORE_ROC).
// year-of-era - The year-of-era for the current era increases uniformly from the epoch at year one.
//  For the previous era the year increases from one as time goes backwards.
//  The value for the current era is equal to the ISO proleptic-year minus 1911.
// proleptic-year - The proleptic year is the same as the year-of-era for the
//  current era. For the previous era, years have zero, then negative values.
//  The value is equal to the ISO proleptic-year minus 1911.
// month-of-year - The Minguo month-of-year exactly matches ISO.
// day-of-month - The Minguo day-of-month exactly matches ISO.
// day-of-year - The Minguo day-of-year exactly matches ISO.
// leap-year - The Minguo leap-year pattern exactly matches ISO, such that the two calendars
//  are never out of step.
// 
final class MinguoChronology extends AbstractChronology with Serializable {

    @stub
    // Obtains a local date in Minguo calendar system from the
    // era, year-of-era, month-of-year and day-of-month fields.
    def date(era: Era, yearOfEra: Int, month: Int, dayOfMonth: Int): MinguoDate = ???

    @stub
    // Obtains a local date in Minguo calendar system from the
    // proleptic-year, month-of-year and day-of-month fields.
    def date(prolepticYear: Int, month: Int, dayOfMonth: Int): MinguoDate = ???

    @stub
    // Obtains a local date in this chronology from another temporal object.
    def date(temporal: TemporalAccessor): MinguoDate = ???

    @stub
    // Obtains a local date in the Minguo calendar system from the epoch-day.
    def dateEpochDay(epochDay: Long): MinguoDate = ???

    @stub
    // Obtains the current local date in this chronology from the system clock in the default time-zone.
    def dateNow(): MinguoDate = ???

    @stub
    // Obtains the current local date in this chronology from the specified clock.
    def dateNow(clock: Clock): MinguoDate = ???

    @stub
    // Obtains the current local date in this chronology from the system clock in the specified time-zone.
    def dateNow(zone: ZoneId): MinguoDate = ???

    @stub
    // Obtains a local date in Minguo calendar system from the
    // era, year-of-era and day-of-year fields.
    def dateYearDay(era: Era, yearOfEra: Int, dayOfYear: Int): MinguoDate = ???

    @stub
    // Obtains a local date in Minguo calendar system from the
    // proleptic-year and day-of-year fields.
    def dateYearDay(prolepticYear: Int, dayOfYear: Int): MinguoDate = ???

    @stub
    // Creates the chronology era object from the numeric value.
    def eraOf(eraValue: Int): MinguoEra = ???

    @stub
    // Gets the list of eras for the chronology.
    def eras(): List[Era] = ???

    @stub
    // Gets the calendar type of the underlying calendar system - 'roc'.
    def getCalendarType(): String = ???

    @stub
    // Gets the ID of the chronology - 'Minguo'.
    def getId(): String = ???

    @stub
    // Checks if the specified year is a leap year.
    def isLeapYear(prolepticYear: Long): Boolean = ???

    @stub
    // Obtains a local date-time in this chronology from another temporal object.
    def localDateTime(temporal: TemporalAccessor): ChronoLocalDateTime[MinguoDate] = ???

    @stub
    // Calculates the proleptic-year given the era and year-of-era.
    def prolepticYear(era: Era, yearOfEra: Int): Int = ???

    @stub
    // Gets the range of valid values for the specified field.
    def range(field: ChronoField): ValueRange = ???

    @stub
    // Resolves parsed ChronoField values into a date during parsing.
    def resolveDate(fieldValues: Map[TemporalField, Long], resolverStyle: ResolverStyle): MinguoDate = ???

    @stub
    // Obtains a ChronoZonedDateTime in this chronology from an Instant.
    def zonedDateTime(instant: Instant, zone: ZoneId): ChronoZonedDateTime[MinguoDate] = ???
}
