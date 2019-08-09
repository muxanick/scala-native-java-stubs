package java.time.chrono

import java.io.Serializable
import java.lang.{Long, Object, String}
import java.time.{Clock, Instant, LocalDate, LocalDateTime, Period, ZoneId, ZonedDateTime}
import java.time.format.ResolverStyle
import java.time.temporal.{ChronoField, TemporalAccessor, TemporalField, ValueRange}
import java.util.{List, Map}

/** The ISO calendar system.
 *  
 *  This chronology defines the rules of the ISO calendar system.
 *  This calendar system is based on the ISO-8601 standard, which is the
 *  de facto world calendar.
 *  
 *  The fields are defined as follows:
 *  
 *  era - There are two eras, 'Current Era' (CE) and 'Before Current Era' (BCE).
 *  year-of-era - The year-of-era is the same as the proleptic-year for the current CE era.
 *   For the BCE era before the ISO epoch the year increases from 1 upwards as time goes backwards.
 *  proleptic-year - The proleptic year is the same as the year-of-era for the
 *   current era. For the previous era, years have zero, then negative values.
 *  month-of-year - There are 12 months in an ISO year, numbered from 1 to 12.
 *  day-of-month - There are between 28 and 31 days in each of the ISO month, numbered from 1 to 31.
 *   Months 4, 6, 9 and 11 have 30 days, Months 1, 3, 5, 7, 8, 10 and 12 have 31 days.
 *   Month 2 has 28 days, or 29 in a leap year.
 *  day-of-year - There are 365 days in a standard ISO year and 366 in a leap year.
 *   The days are numbered from 1 to 365 or 1 to 366.
 *  leap-year - Leap years occur every 4 years, except where the year is divisble by 100 and not divisble by 400.
 *  
 */
final class IsoChronology extends AbstractChronology with Serializable {

    /** Obtains an ISO local date from the era, year-of-era, month-of-year
     *  and day-of-month fields.
     */
    @stub
    def date(era: Era, yearOfEra: Int, month: Int, dayOfMonth: Int): LocalDate = ???

    /** Obtains an ISO local date from the proleptic-year, month-of-year
     *  and day-of-month fields.
     */
    @stub
    def date(prolepticYear: Int, month: Int, dayOfMonth: Int): LocalDate = ???

    /** Obtains an ISO local date from another date-time object. */
    @stub
    def date(temporal: TemporalAccessor): LocalDate = ???

    /** Obtains an ISO local date from the epoch-day. */
    @stub
    def dateEpochDay(epochDay: Long): LocalDate = ???

    /** Obtains the current ISO local date from the system clock in the default time-zone. */
    @stub
    def dateNow(): LocalDate = ???

    /** Obtains the current ISO local date from the specified clock. */
    @stub
    def dateNow(clock: Clock): LocalDate = ???

    /** Obtains the current ISO local date from the system clock in the specified time-zone. */
    @stub
    def dateNow(zone: ZoneId): LocalDate = ???

    /** Obtains an ISO local date from the era, year-of-era and day-of-year fields. */
    @stub
    def dateYearDay(era: Era, yearOfEra: Int, dayOfYear: Int): LocalDate = ???

    /** Obtains an ISO local date from the proleptic-year and day-of-year fields. */
    @stub
    def dateYearDay(prolepticYear: Int, dayOfYear: Int): LocalDate = ???

    /** Creates the chronology era object from the numeric value. */
    @stub
    def eraOf(eraValue: Int): IsoEra = ???

    /** Gets the list of eras for the chronology. */
    @stub
    def eras(): List[Era] = ???

    /** Gets the calendar type of the underlying calendar system - 'iso8601'. */
    @stub
    def getCalendarType(): String = ???

    /** Gets the ID of the chronology - 'ISO'. */
    @stub
    def getId(): String = ???

    /** Checks if the year is a leap year, according to the ISO proleptic
     *  calendar system rules.
     */
    @stub
    def isLeapYear(prolepticYear: Long): Boolean = ???

    /** Obtains an ISO local date-time from another date-time object. */
    @stub
    def localDateTime(temporal: TemporalAccessor): LocalDateTime = ???

    /** Obtains a period for this chronology based on years, months and days. */
    @stub
    def period(years: Int, months: Int, days: Int): Period = ???

    /** Calculates the proleptic-year given the era and year-of-era. */
    @stub
    def prolepticYear(era: Era, yearOfEra: Int): Int = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: ChronoField): ValueRange = ???

    /** Resolves parsed ChronoField values into a date during parsing. */
    @stub
    def resolveDate(fieldValues: Map[TemporalField, Long], resolverStyle: ResolverStyle): LocalDate = ???

    /** Obtains an ISO zoned date-time in this chronology from an Instant. */
    @stub
    def zonedDateTime(instant: Instant, zone: ZoneId): ZonedDateTime = ???
}
