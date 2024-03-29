package java.math

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Specifies a rounding behavior for numerical operations
 *  capable of discarding precision. Each rounding mode indicates how
 *  the least significant returned digit of a rounded result is to be
 *  calculated.  If fewer digits are returned than the digits needed to
 *  represent the exact numerical result, the discarded digits will be
 *  referred to as the discarded fraction regardless the digits'
 *  contribution to the value of the number.  In other words,
 *  considered as a numerical value, the discarded fraction could have
 *  an absolute value greater than one.
 * 
 *  Each rounding mode description includes a table listing how
 *  different two-digit decimal values would round to a one digit
 *  decimal value under the rounding mode in question.  The result
 *  column in the tables could be gotten by creating a
 *  BigDecimal number with the specified value, forming a
 *  MathContext object with the proper settings
 *  (precision set to 1, and the
 *  roundingMode set to the rounding mode in question), and
 *  calling round on this number with the
 *  proper MathContext.  A summary table showing the results
 *  of these rounding operations for all rounding modes appears below.
 * 
 * 
 *  Summary of Rounding Operations Under Different Rounding Modes
 *  Result of rounding input to one digit with the given
 *                            rounding mode
 *  
 *  Input Number         UP
 *                                            DOWN
 *                                                         CEILING
 *                                                                        FLOOR
 *                                                                                     HALF_UP
 *                                                                                                    HALF_DOWN
 *                                                                                                                     HALF_EVEN
 *                                                                                                                                      UNNECESSARY
 * 
 *  5.5  6  5    6    5  6      5       6       throw ArithmeticException
 *  2.5  3  2    3    2  3      2       2       throw ArithmeticException
 *  1.6  2  1    2    1  2      2       2       throw ArithmeticException
 *  1.1  2  1    2    1  1      1       1       throw ArithmeticException
 *  1.0  1  1    1    1  1      1       1       1
 *  -1.0 -1 -1   -1   -1 -1     -1      -1      -1
 *  -1.1 -2 -1   -1   -2 -1     -1      -1      throw ArithmeticException
 *  -1.6 -2 -1   -1   -2 -2     -2      -2      throw ArithmeticException
 *  -2.5 -3 -2   -2   -3 -3     -2      -2      throw ArithmeticException
 *  -5.5 -6 -5   -5   -6 -6     -5      -6      throw ArithmeticException
 * 
 * 
 * 
 *  This enum is intended to replace the integer-based
 *  enumeration of rounding mode constants in BigDecimal
 *  (BigDecimal.ROUND_UP, BigDecimal.ROUND_DOWN,
 *  etc. ).
 */
class RoundingMode private (name: String, ordinal: Int) extends Enum[RoundingMode](name, ordinal) {
}

object RoundingMode {
    /** Rounding mode to round towards positive infinity. */
    final val CEILING: RoundingMode = new RoundingMode("CEILING", 0)

    /** Rounding mode to round towards zero. */
    final val DOWN: RoundingMode = new RoundingMode("DOWN", 1)

    /** Rounding mode to round towards negative infinity. */
    final val FLOOR: RoundingMode = new RoundingMode("FLOOR", 2)

    /** Rounding mode to round towards "nearest neighbor"
     *  unless both neighbors are equidistant, in which case round
     *  down.
     */
    final val HALF_DOWN: RoundingMode = new RoundingMode("HALF_DOWN", 3)

    /** Rounding mode to round towards the "nearest neighbor"
     *  unless both neighbors are equidistant, in which case, round
     *  towards the even neighbor.
     */
    final val HALF_EVEN: RoundingMode = new RoundingMode("HALF_EVEN", 4)

    /** Rounding mode to round towards "nearest neighbor"
     *  unless both neighbors are equidistant, in which case round up.
     */
    final val HALF_UP: RoundingMode = new RoundingMode("HALF_UP", 5)

    /** Rounding mode to assert that the requested operation has an exact
     *  result, hence no rounding is necessary.
     */
    final val UNNECESSARY: RoundingMode = new RoundingMode("UNNECESSARY", 6)

    /** Rounding mode to round away from zero. */
    final val UP: RoundingMode = new RoundingMode("UP", 7)

    /** Returns the RoundingMode object corresponding to a
     *  legacy integer rounding mode constant in BigDecimal.
     */
    @stub
    def valueOf(rm: Int): RoundingMode = ???

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): RoundingMode = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[RoundingMode] = ???
}
