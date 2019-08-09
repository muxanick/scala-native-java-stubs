package java.util

import java.lang.{Enum, Object, String}

/** Enum for BigDecimal formatting. */
class Formatter.BigDecimalLayoutForm private (name: String, ordinal: Int) extends Enum[Formatter.BigDecimalLayoutForm](name, ordinal) {
}

object Formatter.BigDecimalLayoutForm {
    /** Format the BigDecimal as a decimal number. */
    final val DECIMAL_FLOAT = new Formatter.BigDecimalLayoutForm(DECIMAL_FLOAT, 0)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): Formatter.BigDecimalLayoutForm = ???
}
