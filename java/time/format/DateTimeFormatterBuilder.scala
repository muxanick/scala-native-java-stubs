package java.time.format

import java.lang.{Long, Object, String}
import java.time.ZoneId
import java.time.chrono.{ChronoLocalDate, Chronology}
import java.time.temporal.TemporalField
import java.util.{Locale, Map, Set}
import scala.scalanative.annotation.stub

/** Builder to create date-time formatters.
 *  
 *  This allows a DateTimeFormatter to be created.
 *  All date-time formatters are created ultimately using this builder.
 *  
 *  The basic elements of date-time can all be added:
 *  
 *  Value - a numeric value
 *  Fraction - a fractional value including the decimal place. Always use this when
 *  outputting fractions to ensure that the fraction is parsed correctly
 *  Text - the textual equivalent for the value
 *  OffsetId/Offset - the zone offset
 *  ZoneId - the time-zone id
 *  ZoneText - the name of the time-zone
 *  ChronologyId - the chronology id
 *  ChronologyText - the name of the chronology
 *  Literal - a text literal
 *  Nested and Optional - formats can be nested or made optional
 *  
 *  In addition, any of the elements may be decorated by padding, either with spaces or any other character.
 *  
 *  Finally, a shorthand pattern, mostly compatible with java.text.SimpleDateFormat SimpleDateFormat
 *  can be used, see appendPattern(String).
 *  In practice, this simply parses the pattern and calls other methods on the builder.
 */
final class DateTimeFormatterBuilder extends Object {

    /** Constructs a new instance of the builder. */
    @stub
    def this() = ???

    /** Appends all the elements of a formatter to the builder. */
    @stub
    def append(formatter: DateTimeFormatter): DateTimeFormatterBuilder = ???

    /** Appends the chronology ID, such as 'ISO' or 'ThaiBuddhist', to the formatter. */
    @stub
    def appendChronologyId(): DateTimeFormatterBuilder = ???

    /** Appends the chronology name to the formatter. */
    @stub
    def appendChronologyText(textStyle: TextStyle): DateTimeFormatterBuilder = ???

    /** Appends the fractional value of a date-time field to the formatter. */
    @stub
    def appendFraction(field: TemporalField, minWidth: Int, maxWidth: Int, decimalPoint: Boolean): DateTimeFormatterBuilder = ???

    /** Appends an instant using ISO-8601 to the formatter, formatting fractional
     *  digits in groups of three.
     */
    @stub
    def appendInstant(): DateTimeFormatterBuilder = ???

    /** Appends an instant using ISO-8601 to the formatter with control over
     *  the number of fractional digits.
     */
    @stub
    def appendInstant(fractionalDigits: Int): DateTimeFormatterBuilder = ???

    /** Appends a character literal to the formatter. */
    @stub
    def appendLiteral(literal: Char): DateTimeFormatterBuilder = ???

    /** Appends a string literal to the formatter. */
    @stub
    def appendLiteral(literal: String): DateTimeFormatterBuilder = ???

    /** Appends a localized date-time pattern to the formatter. */
    @stub
    def appendLocalized(dateStyle: FormatStyle, timeStyle: FormatStyle): DateTimeFormatterBuilder = ???

    /** Appends the localized zone offset, such as 'GMT+01:00', to the formatter. */
    @stub
    def appendLocalizedOffset(style: TextStyle): DateTimeFormatterBuilder = ???

    /** Appends the zone offset, such as '+01:00', to the formatter. */
    @stub
    def appendOffset(pattern: String, noOffsetText: String): DateTimeFormatterBuilder = ???

    /** Appends the zone offset, such as '+01:00', to the formatter. */
    @stub
    def appendOffsetId(): DateTimeFormatterBuilder = ???

    /** Appends a formatter to the builder which will optionally format/parse. */
    @stub
    def appendOptional(formatter: DateTimeFormatter): DateTimeFormatterBuilder = ???

    /** Appends the elements defined by the specified pattern to the builder. */
    @stub
    def appendPattern(pattern: String): DateTimeFormatterBuilder = ???

    /** Appends the text of a date-time field to the formatter using the full
     *  text style.
     */
    @stub
    def appendText(field: TemporalField): DateTimeFormatterBuilder = ???

    /** Appends the text of a date-time field to the formatter using the specified
     *  map to supply the text.
     */
    @stub
    def appendText(field: TemporalField, textLookup: Map[Long, String]): DateTimeFormatterBuilder = ???

    /** Appends the text of a date-time field to the formatter. */
    @stub
    def appendText(field: TemporalField, textStyle: TextStyle): DateTimeFormatterBuilder = ???

    /** Appends the value of a date-time field to the formatter using a normal
     *  output style.
     */
    @stub
    def appendValue(field: TemporalField): DateTimeFormatterBuilder = ???

    /** Appends the value of a date-time field to the formatter using a fixed
     *  width, zero-padded approach.
     */
    @stub
    def appendValue(field: TemporalField, width: Int): DateTimeFormatterBuilder = ???

    /** Appends the value of a date-time field to the formatter providing full
     *  control over formatting.
     */
    @stub
    def appendValue(field: TemporalField, minWidth: Int, maxWidth: Int, signStyle: SignStyle): DateTimeFormatterBuilder = ???

    /** Appends the reduced value of a date-time field to the formatter. */
    @stub
    def appendValueReduced(field: TemporalField, width: Int, maxWidth: Int, baseDate: ChronoLocalDate): DateTimeFormatterBuilder = ???

    /** Appends the reduced value of a date-time field to the formatter. */
    @stub
    def appendValueReduced(field: TemporalField, width: Int, maxWidth: Int, baseValue: Int): DateTimeFormatterBuilder = ???

    /** Appends the time-zone ID, such as 'Europe/Paris' or '+02:00', to the formatter. */
    @stub
    def appendZoneId(): DateTimeFormatterBuilder = ???

    /** Appends the time-zone ID, such as 'Europe/Paris' or '+02:00', to
     *  the formatter, using the best available zone ID.
     */
    @stub
    def appendZoneOrOffsetId(): DateTimeFormatterBuilder = ???

    /** Appends the time-zone region ID, such as 'Europe/Paris', to the formatter,
     *  rejecting the zone ID if it is a ZoneOffset.
     */
    @stub
    def appendZoneRegionId(): DateTimeFormatterBuilder = ???

    /** Appends the time-zone name, such as 'British Summer Time', to the formatter. */
    @stub
    def appendZoneText(textStyle: TextStyle): DateTimeFormatterBuilder = ???

    /** Appends the time-zone name, such as 'British Summer Time', to the formatter. */
    @stub
    def appendZoneText(textStyle: TextStyle, preferredZones: Set[ZoneId]): DateTimeFormatterBuilder = ???

    /** Ends an optional section. */
    @stub
    def optionalEnd(): DateTimeFormatterBuilder = ???

    /** Mark the start of an optional section. */
    @stub
    def optionalStart(): DateTimeFormatterBuilder = ???

    /** Causes the next added printer/parser to pad to a fixed width using a space. */
    @stub
    def padNext(padWidth: Int): DateTimeFormatterBuilder = ???

    /** Causes the next added printer/parser to pad to a fixed width. */
    @stub
    def padNext(padWidth: Int, padChar: Char): DateTimeFormatterBuilder = ???

    /** Changes the parse style to be case insensitive for the remainder of the formatter. */
    @stub
    def parseCaseInsensitive(): DateTimeFormatterBuilder = ???

    /** Changes the parse style to be case sensitive for the remainder of the formatter. */
    @stub
    def parseCaseSensitive(): DateTimeFormatterBuilder = ???

    /** Appends a default value for a field to the formatter for use in parsing. */
    @stub
    def parseDefaulting(field: TemporalField, value: Long): DateTimeFormatterBuilder = ???

    /** Changes the parse style to be lenient for the remainder of the formatter. */
    @stub
    def parseLenient(): DateTimeFormatterBuilder = ???

    /** Changes the parse style to be strict for the remainder of the formatter. */
    @stub
    def parseStrict(): DateTimeFormatterBuilder = ???

    /** Completes this builder by creating the DateTimeFormatter
     *  using the default locale.
     */
    @stub
    def toFormatter(): DateTimeFormatter = ???

    /** Completes this builder by creating the DateTimeFormatter
     *  using the specified locale.
     */
    @stub
    def toFormatter(locale: Locale): DateTimeFormatter = ???
}

object DateTimeFormatterBuilder {
    /** Gets the formatting pattern for date and time styles for a locale and chronology. */
    @stub
    def getLocalizedDateTimePattern(dateStyle: FormatStyle, timeStyle: FormatStyle, chrono: Chronology, locale: Locale): String = ???
}
