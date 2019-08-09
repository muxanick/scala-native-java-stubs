package java.time.chrono

import java.io.Serializable
import java.lang.{Long, Object, String}
import java.time.{Clock, Instant, ZoneId}
import java.time.format.ResolverStyle
import java.time.temporal.{ChronoField, TemporalAccessor, TemporalField, ValueRange}
import java.util.{List, Map}

// The Thai Buddhist calendar system.
// 
// This chronology defines the rules of the Thai Buddhist calendar system.
// This calendar system is primarily used in Thailand.
// Dates are aligned such that 2484-01-01 (Buddhist) is 1941-01-01 (ISO).
// 
// The fields are defined as follows:
// 
// era - There are two eras, the current 'Buddhist' (ERA_BE) and the previous era (ERA_BEFORE_BE).
// year-of-era - The year-of-era for the current era increases uniformly from the epoch at year one.
//  For the previous era the year increases from one as time goes backwards.
//  The value for the current era is equal to the ISO proleptic-year plus 543.
// proleptic-year - The proleptic year is the same as the year-of-era for the
//  current era. For the previous era, years have zero, then negative values.
//  The value is equal to the ISO proleptic-year plus 543.
// month-of-year - The ThaiBuddhist month-of-year exactly matches ISO.
// day-of-month - The ThaiBuddhist day-of-month exactly matches ISO.
// day-of-year - The ThaiBuddhist day-of-year exactly matches ISO.
// leap-year - The ThaiBuddhist leap-year pattern exactly matches ISO, such that the two calendars
//  are never out of step.
// 
final class ThaiBuddhistChronology extends AbstractChronology with Serializable {

    @stub
    // Obtains a local date in Thai Buddhist calendar system from the
    // era, year-of-era, month-of-year and day-of-month fields.
    def date(era: Era, yearOfEra: Int, month: Int, dayOfMonth: Int): ThaiBuddhistDate = ???

    @stub
    // Obtains a local date in Thai Buddhist calendar system from the
    // proleptic-year, month-of-year and day-of-month fields.
    def date(prolepticYear: Int, month: Int, dayOfMonth: Int): ThaiBuddhistDate = ???

    @stub
    // Obtains a local date in this chronology from another temporal object.
    def date(temporal: TemporalAccessor): ThaiBuddhistDate = ???

    @stub
    // Obtains a local date in the Thai Buddhist calendar system from the epoch-day.
    def dateEpochDay(epochDay: Long): ThaiBuddhistDate = ???

    @stub
    // Obtains the current local date in this chronology from the system clock in the default time-zone.
    def dateNow(): ThaiBuddhistDate = ???

    @stub
    // Obtains the current local date in this chronology from the specified clock.
    def dateNow(clock: Clock): ThaiBuddhistDate = ???

    @stub
    // Obtains the current local date in this chronology from the system clock in the specified time-zone.
    def dateNow(zone: ZoneId): ThaiBuddhistDate = ???

    @stub
    // Obtains a local date in Thai Buddhist calendar system from the
    // era, year-of-era and day-of-year fields.
    def dateYearDay(era: Era, yearOfEra: Int, dayOfYear: Int): ThaiBuddhistDate = ???

    @stub
    // Obtains a local date in Thai Buddhist calendar system from the
    // proleptic-year and day-of-year fields.
    def dateYearDay(prolepticYear: Int, dayOfYear: Int): ThaiBuddhistDate = ???

    @stub
    // Creates the chronology era object from the numeric value.
    def eraOf(eraValue: Int): ThaiBuddhistEra = ???

    @stub
    // Gets the list of eras for the chronology.
    def eras(): List[Era] = ???

    @stub
    // Gets the calendar type of the underlying calendar system - 'buddhist'.
    def getCalendarType(): String = ???

    @stub
    // Gets the ID of the chronology - 'ThaiBuddhist'.
    def getId(): String = ???

    @stub
    // Checks if the specified year is a leap year.
    def isLeapYear(prolepticYear: Long): Boolean = ???

    @stub
    // Obtains a local date-time in this chronology from another temporal object.
    def localDateTime(temporal: TemporalAccessor): ChronoLocalDateTime[ThaiBuddhistDate] = ???

    @stub
    // Calculates the proleptic-year given the era and year-of-era.
    def prolepticYear(era: Era, yearOfEra: Int): Int = ???

    @stub
    // Gets the range of valid values for the specified field.
    def range(field: ChronoField): ValueRange = ???

    @stub
    // Resolves parsed ChronoField values into a date during parsing.
    def resolveDate(fieldValues: Map[TemporalField, Long], resolverStyle: ResolverStyle): ThaiBuddhistDate = ???

    @stub
    // Obtains a ChronoZonedDateTime in this chronology from an Instant.
    def zonedDateTime(instant: Instant, zone: ZoneId): ChronoZonedDateTime[ThaiBuddhistDate] = ???
}
