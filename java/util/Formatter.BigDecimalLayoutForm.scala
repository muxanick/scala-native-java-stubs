package java.util

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Enum for BigDecimal formatting. */
class Formatter.BigDecimalLayoutForm private (name: String, ordinal: Int) extends Enum[Formatter.BigDecimalLayoutForm](name, ordinal) {
}

object Formatter.BigDecimalLayoutForm {
    /** Format the BigDecimal as a decimal number. */
    final val DECIMAL_FLOAT = new Formatter.BigDecimalLayoutForm(DECIMAL_FLOAT, 0)

    /** Format the BigDecimal in computerized scientific notation. */
    final val SCIENTIFIC = new Formatter.BigDecimalLayoutForm(SCIENTIFIC, 1)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): Formatter.BigDecimalLayoutForm = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[Formatter.BigDecimalLayoutForm] = ???
}
