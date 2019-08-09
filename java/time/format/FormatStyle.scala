package java.time.format

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Enumeration of the style of a localized date, time or date-time formatter.
 *  
 *  These styles are used when obtaining a date-time style from configuration.
 *  See DateTimeFormatter and DateTimeFormatterBuilder for usage.
 */
class FormatStyle private (name: String, ordinal: Int) extends Enum[FormatStyle](name, ordinal) {
}

object FormatStyle {
    /** Full text style, with the most detail. */
    final val FULL = new FormatStyle(FULL, 0)

    /** Long text style, with lots of detail. */
    final val LONG = new FormatStyle(LONG, 1)

    /** Medium text style, with some detail. */
    final val MEDIUM = new FormatStyle(MEDIUM, 2)

    /** Short text style, typically numeric. */
    final val SHORT = new FormatStyle(SHORT, 3)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): FormatStyle = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[FormatStyle] = ???
}
