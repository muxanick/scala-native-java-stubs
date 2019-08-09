package java.time.chrono

import java.lang.{Comparable, Long, Object, String}
import java.time.{Clock, Instant, ZoneId}
import java.time.format.{ResolverStyle, TextStyle}
import java.time.temporal.{ChronoField, TemporalAccessor, TemporalField, ValueRange}
import java.util.{List, Locale, Map, Set}
import scala.scalanative.annotation.stub

/** A calendar system, used to organize and identify dates.
 *  
 *  The main date and time API is built on the ISO calendar system.
 *  The chronology operates behind the scenes to represent the general concept of a calendar system.
 *  For example, the Japanese, Minguo, Thai Buddhist and others.
 *  
 *  Most other calendar systems also operate on the shared concepts of year, month and day,
 *  linked to the cycles of the Earth around the Sun, and the Moon around the Earth.
 *  These shared concepts are defined by ChronoField and are available
 *  for use by any Chronology implementation:
 *  
 *    LocalDate isoDate = ...
 *    ThaiBuddhistDate thaiDate = ...
 *    int isoYear = isoDate.get(ChronoField.YEAR);
 *    int thaiYear = thaiDate.get(ChronoField.YEAR);
 *  
 *  As shown, although the date objects are in different calendar systems, represented by different
 *  Chronology instances, both can be queried using the same constant on ChronoField.
 *  For a full discussion of the implications of this, see ChronoLocalDate.
 *  In general, the advice is to use the known ISO-based LocalDate, rather than
 *  ChronoLocalDate.
 *  
 *  While a Chronology object typically uses ChronoField and is based on
 *  an era, year-of-era, month-of-year, day-of-month model of a date, this is not required.
 *  A Chronology instance may represent a totally different kind of calendar system,
 *  such as the Mayan.
 *  
 *  In practical terms, the Chronology instance also acts as a factory.
 *  The of(String) method allows an instance to be looked up by identifier,
 *  while the ofLocale(Locale) method allows lookup by locale.
 *  
 *  The Chronology instance provides a set of methods to create ChronoLocalDate instances.
 *  The date classes are used to manipulate specific dates.
 *  
 *   dateNow()
 *   dateNow(clock)
 *   dateNow(zone)
 *   date(yearProleptic, month, day)
 *   date(era, yearOfEra, month, day)
 *   dateYearDay(yearProleptic, dayOfYear)
 *   dateYearDay(era, yearOfEra, dayOfYear)
 *   date(TemporalAccessor)
 *  
 * 
 *  Adding New Calendars
 *  The set of available chronologies can be extended by applications.
 *  Adding a new calendar system requires the writing of an implementation of
 *  Chronology, ChronoLocalDate and Era.
 *  The majority of the logic specific to the calendar system will be in the
 *  ChronoLocalDate implementation.
 *  The Chronology implementation acts as a factory.
 *  
 *  To permit the discovery of additional chronologies, the ServiceLoader
 *  is used. A file must be added to the META-INF/services directory with the
 *  name 'java.time.chrono.Chronology' listing the implementation classes.
 *  See the ServiceLoader for more details on service loading.
 *  For lookup by id or calendarType, the system provided calendars are found
 *  first followed by application provided calendars.
 *  
 *  Each chronology must define a chronology ID that is unique within the system.
 *  If the chronology represents a calendar system defined by the
 *  CLDR specification then the calendar type is the concatenation of the
 *  CLDR type and, if applicable, the CLDR variant,
 */
trait Chronology extends Comparable[Chronology] {

    /** Compares this chronology to another chronology. */
    @stub
    def compareTo(other: Chronology): Int = ???

    /** Obtains a local date in this chronology from the era, year-of-era,
     *  month-of-year and day-of-month fields.
     */
    @stub
    val ChronoLocalDate: default = ???

    /** Obtains a local date in this chronology from the proleptic-year,
     *  month-of-year and day-of-month fields.
     */
    @stub
    def date(prolepticYear: Int, month: Int, dayOfMonth: Int): ChronoLocalDate = ???

    /** Obtains a local date in this chronology from another temporal object. */
    @stub
    def date(temporal: TemporalAccessor): ChronoLocalDate = ???

    /** Obtains a local date in this chronology from the epoch-day. */
    @stub
    def dateEpochDay(epochDay: Long): ChronoLocalDate = ???

    /** Obtains the current local date in this chronology from the system clock in the default time-zone. */
    @stub
    val ChronoLocalDate: default = ???

    /** Obtains the current local date in this chronology from the specified clock. */
    @stub
    val ChronoLocalDate: default = ???

    /** Obtains the current local date in this chronology from the system clock in the specified time-zone. */
    @stub
    val ChronoLocalDate: default = ???

    /** Obtains a local date in this chronology from the era, year-of-era and
     *  day-of-year fields.
     */
    @stub
    val ChronoLocalDate: default = ???

    /** Obtains a local date in this chronology from the proleptic-year and
     *  day-of-year fields.
     */
    @stub
    def dateYearDay(prolepticYear: Int, dayOfYear: Int): ChronoLocalDate = ???

    /** Checks if this chronology is equal to another chronology. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Creates the chronology era object from the numeric value. */
    @stub
    def eraOf(eraValue: Int): Era = ???

    /** Gets the list of eras for the chronology. */
    @stub
    def eras(): List[Era] = ???

    /** Gets the calendar type of the calendar system. */
    @stub
    def getCalendarType(): String = ???

    /** Gets the textual representation of this chronology. */
    @stub
    val String: default = ???

    /** Gets the ID of the chronology. */
    @stub
    def getId(): String = ???

    /** A hash code for this chronology. */
    @stub
    def hashCode(): Int = ???

    /** Checks if the specified year is a leap year. */
    @stub
    def isLeapYear(prolepticYear: Long): Boolean = ???

    /** Obtains a local date-time in this chronology from another temporal object. */
    @stub
    val ChronoLocalDateTime[_ <: ChronoLocalDate]: default = ???

    /** Obtains a period for this chronology based on years, months and days. */
    @stub
    val ChronoPeriod: default = ???

    /** Calculates the proleptic-year given the era and year-of-era. */
    @stub
    def prolepticYear(era: Era, yearOfEra: Int): Int = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: ChronoField): ValueRange = ???

    /** Resolves parsed ChronoField values into a date during parsing. */
    @stub
    def resolveDate(fieldValues: Map[TemporalField, Long], resolverStyle: ResolverStyle): ChronoLocalDate = ???

    /** Outputs this chronology as a String. */
    @stub
    def toString(): String = ???

    /** Obtains a ChronoZonedDateTime in this chronology from an Instant. */
    @stub
    val ChronoZonedDateTime[_ <: ChronoLocalDate]: default = ???

    /** Obtains a ChronoZonedDateTime in this chronology from another temporal object. */
    @stub
    val ChronoZonedDateTime[_ <: ChronoLocalDate]: default = ???
}

object Chronology {
    /** Obtains an instance of Chronology from a temporal object. */
    @stub
    def from(temporal: TemporalAccessor): Chronology = ???

    /** Returns the available chronologies. */
    @stub
    def getAvailableChronologies(): Set[Chronology] = ???

    /** Obtains an instance of Chronology from a chronology ID or
     *  calendar system type.
     */
    @stub
    def of(id: String): Chronology = ???

    /** Obtains an instance of Chronology from a locale. */
    @stub
    def ofLocale(locale: Locale): Chronology = ???
}
