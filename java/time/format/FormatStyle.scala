package java.time.format

import java.lang.{Enum, Object, String}

// Enumeration of the style of a localized date, time or date-time formatter.
// 
// These styles are used when obtaining a date-time style from configuration.
// See DateTimeFormatter and DateTimeFormatterBuilder for usage.
class FormatStyle private (name: String, ordinal: Int) extends Enum[FormatStyle](name, ordinal) {
}

object FormatStyle {
    // Full text style, with the most detail.
    final val FULL = new FormatStyle(FULL, 0)

    // Long text style, with lots of detail.
    final val LONG = new FormatStyle(LONG, 1)

    // Medium text style, with some detail.
    final val MEDIUM = new FormatStyle(MEDIUM, 2)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): FormatStyle = ???
}
