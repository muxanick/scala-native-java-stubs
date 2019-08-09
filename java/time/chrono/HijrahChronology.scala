package java.time.chrono

import java.io.Serializable
import java.lang.{Long, Object, String}
import java.time.{Clock, Instant, ZoneId}
import java.time.format.ResolverStyle
import java.time.temporal.{ChronoField, TemporalAccessor, TemporalField, ValueRange}
import java.util.{List, Map}
import scala.scalanative.annotation.stub

/** The Hijrah calendar is a lunar calendar supporting Islamic calendars.
 *  
 *  The HijrahChronology follows the rules of the Hijrah calendar system. The Hijrah
 *  calendar has several variants based on differences in when the new moon is
 *  determined to have occurred and where the observation is made.
 *  In some variants the length of each month is
 *  computed algorithmically from the astronomical data for the moon and earth and
 *  in others the length of the month is determined by an authorized sighting
 *  of the new moon. For the algorithmically based calendars the calendar
 *  can project into the future.
 *  For sighting based calendars only historical data from past
 *  sightings is available.
 *  
 *  The length of each month is 29 or 30 days.
 *  Ordinary years have 354 days; leap years have 355 days.
 * 
 *  
 *  CLDR and LDML identify variants:
 *  
 *  
 *  
 *  Chronology ID
 *  Calendar Type
 *  Locale extension, see Locale
 *  Description
 *  
 *  
 *  
 *  
 *  Hijrah-umalqura
 *  islamic-umalqura
 *  ca-islamic-umalqura
 *  Islamic - Umm Al-Qura calendar of Saudi Arabia
 *  
 *  
 *  
 *  Additional variants may be available through Chronology.getAvailableChronologies().
 * 
 *  Example
 *  
 *  Selecting the chronology from the locale uses Chronology.ofLocale(java.util.Locale)
 *  to find the Chronology based on Locale supported BCP 47 extension mechanism
 *  to request a specific calendar ("ca"). For example,
 *  
 *  
 *       Locale locale = Locale.forLanguageTag("en-US-u-ca-islamic-umalqura");
 *       Chronology chrono = Chronology.ofLocale(locale);
 *  
 */
final class HijrahChronology extends AbstractChronology with Serializable {

    /** Obtains a local date in Hijrah calendar system from the
     *  era, year-of-era, month-of-year and day-of-month fields.
     */
    @stub
    def date(era: Era, yearOfEra: Int, month: Int, dayOfMonth: Int): HijrahDate = ???

    /** Obtains a local date in Hijrah calendar system from the
     *  proleptic-year, month-of-year and day-of-month fields.
     */
    @stub
    def date(prolepticYear: Int, month: Int, dayOfMonth: Int): HijrahDate = ???

    /** Obtains a local date in this chronology from another temporal object. */
    @stub
    def date(temporal: TemporalAccessor): HijrahDate = ???

    /** Obtains a local date in the Hijrah calendar system from the epoch-day. */
    @stub
    def dateEpochDay(epochDay: Long): HijrahDate = ???

    /** Obtains the current local date in this chronology from the system clock in the default time-zone. */
    @stub
    def dateNow(): HijrahDate = ???

    /** Obtains the current local date in this chronology from the specified clock. */
    @stub
    def dateNow(clock: Clock): HijrahDate = ???

    /** Obtains the current local date in this chronology from the system clock in the specified time-zone. */
    @stub
    def dateNow(zone: ZoneId): HijrahDate = ???

    /** Obtains a local date in Hijrah calendar system from the
     *  era, year-of-era and day-of-year fields.
     */
    @stub
    def dateYearDay(era: Era, yearOfEra: Int, dayOfYear: Int): HijrahDate = ???

    /** Obtains a local date in Hijrah calendar system from the
     *  proleptic-year and day-of-year fields.
     */
    @stub
    def dateYearDay(prolepticYear: Int, dayOfYear: Int): HijrahDate = ???

    /** Creates the chronology era object from the numeric value. */
    @stub
    def eraOf(eraValue: Int): HijrahEra = ???

    /** Gets the list of eras for the chronology. */
    @stub
    def eras(): List[Era] = ???

    /** Gets the calendar type of the Islamic calendar. */
    @stub
    def getCalendarType(): String = ???

    /** Gets the ID of the chronology. */
    @stub
    def getId(): String = ???

    /** Checks if the specified year is a leap year. */
    @stub
    def isLeapYear(prolepticYear: Long): Boolean = ???

    /** Obtains a local date-time in this chronology from another temporal object. */
    @stub
    def localDateTime(temporal: TemporalAccessor): ChronoLocalDateTime[HijrahDate] = ???

    /** Calculates the proleptic-year given the era and year-of-era. */
    @stub
    def prolepticYear(era: Era, yearOfEra: Int): Int = ???

    /** Gets the range of valid values for the specified field. */
    @stub
    def range(field: ChronoField): ValueRange = ???

    /** Resolves parsed ChronoField values into a date during parsing. */
    @stub
    def resolveDate(fieldValues: Map[TemporalField, Long], resolverStyle: ResolverStyle): HijrahDate = ???

    /** Obtains a ChronoZonedDateTime in this chronology from an Instant. */
    @stub
    def zonedDateTime(instant: Instant, zone: ZoneId): ChronoZonedDateTime[HijrahDate] = ???

    /** Obtains a ChronoZonedDateTime in this chronology from another temporal object. */
    @stub
    def zonedDateTime(temporal: TemporalAccessor): ChronoZonedDateTime[HijrahDate] = ???
}

object HijrahChronology {
    /** Singleton instance of the Islamic Umm Al-Qura calendar of Saudi Arabia. */
    @stub
    val INSTANCE: HijrahChronology = ???
}
