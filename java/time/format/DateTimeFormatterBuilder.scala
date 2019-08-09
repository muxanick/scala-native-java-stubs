package java.time.format

import java.lang.{Long, Object, String}
import java.time.ZoneId
import java.time.chrono.{ChronoLocalDate, Chronology}
import java.time.temporal.TemporalField
import java.util.{Locale, Map, Set}

// Builder to create date-time formatters.
// 
// This allows a DateTimeFormatter to be created.
// All date-time formatters are created ultimately using this builder.
// 
// The basic elements of date-time can all be added:
// 
// Value - a numeric value
// Fraction - a fractional value including the decimal place. Always use this when
// outputting fractions to ensure that the fraction is parsed correctly
// Text - the textual equivalent for the value
// OffsetId/Offset - the zone offset
// ZoneId - the time-zone id
// ZoneText - the name of the time-zone
// ChronologyId - the chronology id
// ChronologyText - the name of the chronology
// Literal - a text literal
// Nested and Optional - formats can be nested or made optional
// 
// In addition, any of the elements may be decorated by padding, either with spaces or any other character.
// 
// Finally, a shorthand pattern, mostly compatible with java.text.SimpleDateFormat SimpleDateFormat
// can be used, see appendPattern(String).
// In practice, this simply parses the pattern and calls other methods on the builder.
final class DateTimeFormatterBuilder extends Object {

    @stub
    // Appends all the elements of a formatter to the builder.
    def append(formatter: DateTimeFormatter): DateTimeFormatterBuilder = ???

    @stub
    // Appends the chronology ID, such as 'ISO' or 'ThaiBuddhist', to the formatter.
    def appendChronologyId(): DateTimeFormatterBuilder = ???

    @stub
    // Appends the chronology name to the formatter.
    def appendChronologyText(textStyle: TextStyle): DateTimeFormatterBuilder = ???

    @stub
    // Appends the fractional value of a date-time field to the formatter.
    def appendFraction(field: TemporalField, minWidth: Int, maxWidth: Int, decimalPoint: Boolean): DateTimeFormatterBuilder = ???

    @stub
    // Appends an instant using ISO-8601 to the formatter, formatting fractional
    // digits in groups of three.
    def appendInstant(): DateTimeFormatterBuilder = ???

    @stub
    // Appends an instant using ISO-8601 to the formatter with control over
    // the number of fractional digits.
    def appendInstant(fractionalDigits: Int): DateTimeFormatterBuilder = ???

    @stub
    // Appends a character literal to the formatter.
    def appendLiteral(literal: Char): DateTimeFormatterBuilder = ???

    @stub
    // Appends a string literal to the formatter.
    def appendLiteral(literal: String): DateTimeFormatterBuilder = ???

    @stub
    // Appends a localized date-time pattern to the formatter.
    def appendLocalized(dateStyle: FormatStyle, timeStyle: FormatStyle): DateTimeFormatterBuilder = ???

    @stub
    // Appends the localized zone offset, such as 'GMT+01:00', to the formatter.
    def appendLocalizedOffset(style: TextStyle): DateTimeFormatterBuilder = ???

    @stub
    // Appends the zone offset, such as '+01:00', to the formatter.
    def appendOffset(pattern: String, noOffsetText: String): DateTimeFormatterBuilder = ???

    @stub
    // Appends the zone offset, such as '+01:00', to the formatter.
    def appendOffsetId(): DateTimeFormatterBuilder = ???

    @stub
    // Appends a formatter to the builder which will optionally format/parse.
    def appendOptional(formatter: DateTimeFormatter): DateTimeFormatterBuilder = ???

    @stub
    // Appends the elements defined by the specified pattern to the builder.
    def appendPattern(pattern: String): DateTimeFormatterBuilder = ???

    @stub
    // Appends the text of a date-time field to the formatter using the full
    // text style.
    def appendText(field: TemporalField): DateTimeFormatterBuilder = ???

    @stub
    // Appends the text of a date-time field to the formatter using the specified
    // map to supply the text.
    def appendText(field: TemporalField, textLookup: Map[Long, String]): DateTimeFormatterBuilder = ???

    @stub
    // Appends the text of a date-time field to the formatter.
    def appendText(field: TemporalField, textStyle: TextStyle): DateTimeFormatterBuilder = ???

    @stub
    // Appends the value of a date-time field to the formatter using a normal
    // output style.
    def appendValue(field: TemporalField): DateTimeFormatterBuilder = ???

    @stub
    // Appends the value of a date-time field to the formatter using a fixed
    // width, zero-padded approach.
    def appendValue(field: TemporalField, width: Int): DateTimeFormatterBuilder = ???

    @stub
    // Appends the value of a date-time field to the formatter providing full
    // control over formatting.
    def appendValue(field: TemporalField, minWidth: Int, maxWidth: Int, signStyle: SignStyle): DateTimeFormatterBuilder = ???

    @stub
    // Appends the reduced value of a date-time field to the formatter.
    def appendValueReduced(field: TemporalField, width: Int, maxWidth: Int, baseDate: ChronoLocalDate): DateTimeFormatterBuilder = ???

    @stub
    // Appends the reduced value of a date-time field to the formatter.
    def appendValueReduced(field: TemporalField, width: Int, maxWidth: Int, baseValue: Int): DateTimeFormatterBuilder = ???

    @stub
    // Appends the time-zone ID, such as 'Europe/Paris' or '+02:00', to the formatter.
    def appendZoneId(): DateTimeFormatterBuilder = ???

    @stub
    // Appends the time-zone ID, such as 'Europe/Paris' or '+02:00', to
    // the formatter, using the best available zone ID.
    def appendZoneOrOffsetId(): DateTimeFormatterBuilder = ???

    @stub
    // Appends the time-zone region ID, such as 'Europe/Paris', to the formatter,
    // rejecting the zone ID if it is a ZoneOffset.
    def appendZoneRegionId(): DateTimeFormatterBuilder = ???

    @stub
    // Appends the time-zone name, such as 'British Summer Time', to the formatter.
    def appendZoneText(textStyle: TextStyle): DateTimeFormatterBuilder = ???

    @stub
    // Appends the time-zone name, such as 'British Summer Time', to the formatter.
    def appendZoneText(textStyle: TextStyle, preferredZones: Set[ZoneId]): DateTimeFormatterBuilder = ???

    @stub
    // Ends an optional section.
    def optionalEnd(): DateTimeFormatterBuilder = ???

    @stub
    // Mark the start of an optional section.
    def optionalStart(): DateTimeFormatterBuilder = ???

    @stub
    // Causes the next added printer/parser to pad to a fixed width using a space.
    def padNext(padWidth: Int): DateTimeFormatterBuilder = ???

    @stub
    // Causes the next added printer/parser to pad to a fixed width.
    def padNext(padWidth: Int, padChar: Char): DateTimeFormatterBuilder = ???

    @stub
    // Changes the parse style to be case insensitive for the remainder of the formatter.
    def parseCaseInsensitive(): DateTimeFormatterBuilder = ???

    @stub
    // Changes the parse style to be case sensitive for the remainder of the formatter.
    def parseCaseSensitive(): DateTimeFormatterBuilder = ???

    @stub
    // Appends a default value for a field to the formatter for use in parsing.
    def parseDefaulting(field: TemporalField, value: Long): DateTimeFormatterBuilder = ???

    @stub
    // Changes the parse style to be lenient for the remainder of the formatter.
    def parseLenient(): DateTimeFormatterBuilder = ???

    @stub
    // Changes the parse style to be strict for the remainder of the formatter.
    def parseStrict(): DateTimeFormatterBuilder = ???

    @stub
    // Completes this builder by creating the DateTimeFormatter
    // using the default locale.
    def toFormatter(): DateTimeFormatter = ???
}

object DateTimeFormatterBuilder {
    @stub
    // Gets the formatting pattern for date and time styles for a locale and chronology.
    def getLocalizedDateTimePattern(dateStyle: FormatStyle, timeStyle: FormatStyle, chrono: Chronology, locale: Locale): String = ???
}
