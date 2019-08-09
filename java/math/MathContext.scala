package java.math

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Immutable objects which encapsulate the context settings which
 *  describe certain rules for numerical operators, such as those
 *  implemented by the BigDecimal class.
 * 
 *  The base-independent settings are:
 *  
 *  precision:
 *  the number of digits to be used for an operation; results are
 *  rounded to this precision
 * 
 *  roundingMode:
 *  a RoundingMode object which specifies the algorithm to be
 *  used for rounding.
 *  
 */
final class MathContext extends Object with Serializable {

    /** Constructs a new MathContext with the specified
     *  precision and the HALF_UP rounding
     *  mode.
     */
    @stub
    def this(setPrecision: Int) = ???

    /** Constructs a new MathContext with a specified
     *  precision and rounding mode.
     */
    @stub
    def this(setPrecision: Int, setRoundingMode: RoundingMode) = ???

    /** Constructs a new MathContext from a string. */
    @stub
    def this(val: String) = ???

    /** Compares this MathContext with the specified
     *  Object for equality.
     */
    @stub
    def equals(x: Object): Boolean = ???

    /** Returns the precision setting. */
    @stub
    def getPrecision(): Int = ???

    /** Returns the roundingMode setting. */
    @stub
    def getRoundingMode(): RoundingMode = ???

    /** Returns the hash code for this MathContext. */
    @stub
    def hashCode(): Int = ???

    /** Returns the string representation of this MathContext. */
    @stub
    def toString(): String = ???
}

object MathContext {
    /** A MathContext object with a precision setting
     *   matching the IEEE 754R Decimal128 format, 34 digits, and a
     *   rounding mode of HALF_EVEN, the
     *   IEEE 754R default.
     */
    @stub
    val DECIMAL128: MathContext = ???

    /** A MathContext object with a precision setting
     *   matching the IEEE 754R Decimal32 format, 7 digits, and a
     *   rounding mode of HALF_EVEN, the
     *   IEEE 754R default.
     */
    @stub
    val DECIMAL32: MathContext = ???

    /** A MathContext object with a precision setting
     *   matching the IEEE 754R Decimal64 format, 16 digits, and a
     *   rounding mode of HALF_EVEN, the
     *   IEEE 754R default.
     */
    @stub
    val DECIMAL64: MathContext = ???

    /** A MathContext object whose settings have the values
     *   required for unlimited precision arithmetic.
     */
    @stub
    val UNLIMITED: MathContext = ???
}
