package java.time.chrono

import java.lang.{Comparable, Long, Object, String}
import java.time.{Clock, Instant, ZoneId}
import java.time.format.{ResolverStyle, TextStyle}
import java.time.temporal.{ChronoField, TemporalAccessor, TemporalField, ValueRange}
import java.util.{List, Locale, Map, Set}

// A calendar system, used to organize and identify dates.
// 
// The main date and time API is built on the ISO calendar system.
// The chronology operates behind the scenes to represent the general concept of a calendar system.
// For example, the Japanese, Minguo, Thai Buddhist and others.
// 
// Most other calendar systems also operate on the shared concepts of year, month and day,
// linked to the cycles of the Earth around the Sun, and the Moon around the Earth.
// These shared concepts are defined by ChronoField and are available
// for use by any Chronology implementation:
// 
//   LocalDate isoDate = ...
//   ThaiBuddhistDate thaiDate = ...
//   int isoYear = isoDate.get(ChronoField.YEAR);
//   int thaiYear = thaiDate.get(ChronoField.YEAR);
// 
// As shown, although the date objects are in different calendar systems, represented by different
// Chronology instances, both can be queried using the same constant on ChronoField.
// For a full discussion of the implications of this, see ChronoLocalDate.
// In general, the advice is to use the known ISO-based LocalDate, rather than
// ChronoLocalDate.
// 
// While a Chronology object typically uses ChronoField and is based on
// an era, year-of-era, month-of-year, day-of-month model of a date, this is not required.
// A Chronology instance may represent a totally different kind of calendar system,
// such as the Mayan.
// 
// In practical terms, the Chronology instance also acts as a factory.
// The of(String) method allows an instance to be looked up by identifier,
// while the ofLocale(Locale) method allows lookup by locale.
// 
// The Chronology instance provides a set of methods to create ChronoLocalDate instances.
// The date classes are used to manipulate specific dates.
// 
//  dateNow()
//  dateNow(clock)
//  dateNow(zone)
//  date(yearProleptic, month, day)
//  date(era, yearOfEra, month, day)
//  dateYearDay(yearProleptic, dayOfYear)
//  dateYearDay(era, yearOfEra, dayOfYear)
//  date(TemporalAccessor)
// 
//
// Adding New Calendars
// The set of available chronologies can be extended by applications.
// Adding a new calendar system requires the writing of an implementation of
// Chronology, ChronoLocalDate and Era.
// The majority of the logic specific to the calendar system will be in the
// ChronoLocalDate implementation.
// The Chronology implementation acts as a factory.
// 
// To permit the discovery of additional chronologies, the ServiceLoader
// is used. A file must be added to the META-INF/services directory with the
// name 'java.time.chrono.Chronology' listing the implementation classes.
// See the ServiceLoader for more details on service loading.
// For lookup by id or calendarType, the system provided calendars are found
// first followed by application provided calendars.
// 
// Each chronology must define a chronology ID that is unique within the system.
// If the chronology represents a calendar system defined by the
// CLDR specification then the calendar type is the concatenation of the
// CLDR type and, if applicable, the CLDR variant,
trait Chronology extends Comparable[Chronology] {

    @stub
    // Compares this chronology to another chronology.
    def compareTo(other: Chronology): Int = ???

    @stub
    // Obtains a local date in this chronology from the era, year-of-era,
    // month-of-year and day-of-month fields.
    def ChronoLocalDate: default = ???

    @stub
    // Obtains a local date in this chronology from the proleptic-year,
    // month-of-year and day-of-month fields.
    def date(prolepticYear: Int, month: Int, dayOfMonth: Int): ChronoLocalDate = ???

    @stub
    // Obtains a local date in this chronology from another temporal object.
    def date(temporal: TemporalAccessor): ChronoLocalDate = ???

    @stub
    // Obtains a local date in this chronology from the epoch-day.
    def dateEpochDay(epochDay: Long): ChronoLocalDate = ???

    @stub
    // Obtains the current local date in this chronology from the system clock in the default time-zone.
    def ChronoLocalDate: default = ???

    @stub
    // Obtains the current local date in this chronology from the specified clock.
    def ChronoLocalDate: default = ???

    @stub
    // Obtains the current local date in this chronology from the system clock in the specified time-zone.
    def ChronoLocalDate: default = ???

    @stub
    // Obtains a local date in this chronology from the era, year-of-era and
    // day-of-year fields.
    def ChronoLocalDate: default = ???

    @stub
    // Obtains a local date in this chronology from the proleptic-year and
    // day-of-year fields.
    def dateYearDay(prolepticYear: Int, dayOfYear: Int): ChronoLocalDate = ???

    @stub
    // Checks if this chronology is equal to another chronology.
    def equals(obj: Object): Boolean = ???

    @stub
    // Creates the chronology era object from the numeric value.
    def eraOf(eraValue: Int): Era = ???

    @stub
    // Gets the list of eras for the chronology.
    def eras(): List[Era] = ???

    @stub
    // Gets the calendar type of the calendar system.
    def getCalendarType(): String = ???

    @stub
    // Gets the textual representation of this chronology.
    def String: default = ???

    @stub
    // Gets the ID of the chronology.
    def getId(): String = ???

    @stub
    // A hash code for this chronology.
    def hashCode(): Int = ???

    @stub
    // Checks if the specified year is a leap year.
    def isLeapYear(prolepticYear: Long): Boolean = ???

    @stub
    // Obtains a local date-time in this chronology from another temporal object.
    def ChronoLocalDateTime[_ <: ChronoLocalDate]: default = ???

    @stub
    // Obtains a period for this chronology based on years, months and days.
    def ChronoPeriod: default = ???

    @stub
    // Calculates the proleptic-year given the era and year-of-era.
    def prolepticYear(era: Era, yearOfEra: Int): Int = ???

    @stub
    // Gets the range of valid values for the specified field.
    def range(field: ChronoField): ValueRange = ???

    @stub
    // Resolves parsed ChronoField values into a date during parsing.
    def resolveDate(fieldValues: Map[TemporalField, Long], resolverStyle: ResolverStyle): ChronoLocalDate = ???

    @stub
    // Outputs this chronology as a String.
    def toString(): String = ???

    @stub
    // Obtains a ChronoZonedDateTime in this chronology from an Instant.
    def ChronoZonedDateTime[_ <: ChronoLocalDate]: default = ???
}

object Chronology {
    @stub
    // Obtains an instance of Chronology from a temporal object.
    def from(temporal: TemporalAccessor): Chronology = ???

    @stub
    // Returns the available chronologies.
    def getAvailableChronologies(): Set[Chronology] = ???

    @stub
    // Obtains an instance of Chronology from a chronology ID or
    // calendar system type.
    def of(id: String): Chronology = ???

    @stub
    // Obtains an instance of Chronology from a locale.
    def ofLocale(locale: Locale): Chronology = ???
}
