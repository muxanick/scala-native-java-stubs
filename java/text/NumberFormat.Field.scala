package java.text

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Defines constants that are used as attribute keys in the
 *  AttributedCharacterIterator returned
 *  from NumberFormat.formatToCharacterIterator and as
 *  field identifiers in FieldPosition.
 */
object NumberFormat_Field extends Format.Field {

    /** Creates a Field instance with the specified
     *  name.
     */
    @stub
    protected def Field(name: String) = ???

    /** Constant identifying the currency field. */
    @stub
    val CURRENCY: NumberFormat.Field = ???

    /** Constant identifying the decimal separator field. */
    @stub
    val DECIMAL_SEPARATOR: NumberFormat.Field = ???

    /** Constant identifying the exponent field. */
    @stub
    val EXPONENT: NumberFormat.Field = ???

    /** Constant identifying the exponent sign field. */
    @stub
    val EXPONENT_SIGN: NumberFormat.Field = ???

    /** Constant identifying the exponent symbol field. */
    @stub
    val EXPONENT_SYMBOL: NumberFormat.Field = ???

    /** Constant identifying the fraction field. */
    @stub
    val FRACTION: NumberFormat.Field = ???

    /** Constant identifying the grouping separator field. */
    @stub
    val GROUPING_SEPARATOR: NumberFormat.Field = ???

    /** Constant identifying the integer field. */
    @stub
    val INTEGER: NumberFormat.Field = ???

    /** Constant identifying the percent field. */
    @stub
    val PERCENT: NumberFormat.Field = ???

    /** Constant identifying the permille field. */
    @stub
    val PERMILLE: NumberFormat.Field = ???

    /** Constant identifying the sign field. */
    @stub
    val SIGN: NumberFormat.Field = ???

    /** Resolves instances being deserialized to the predefined constants. */
    @stub
    protected def readResolve(): Any = ???
}
