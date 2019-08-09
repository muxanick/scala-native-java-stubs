package java.lang

import java.io.Serializable
import scala.scalanative.annotation.stub

/** The abstract class Number is the superclass of platform
 *  classes representing numeric values that are convertible to the
 *  primitive types byte, double, float, int, long, and short.
 * 
 *  The specific semantics of the conversion from the numeric value of
 *  a particular Number implementation to a given primitive
 *  type is defined by the Number implementation in question.
 * 
 *  For platform classes, the conversion is often analogous to a
 *  narrowing primitive conversion or a widening primitive conversion
 *  as defining in The Java™ Language Specification
 *  for converting between primitive types.  Therefore, conversions may
 *  lose information about the overall magnitude of a numeric value, may
 *  lose precision, and may even return a result of a different sign
 *  than the input.
 * 
 *  See the documentation of a given Number implementation for
 *  conversion details.
 */
abstract class Number extends Object with Serializable {

    /**  */
    @stub
    def this() = ???

    /** Returns the value of the specified number as a byte,
     *  which may involve rounding or truncation.
     */
    def byteValue(): Byte

    /** Returns the value of the specified number as a double,
     *  which may involve rounding.
     */
    def doubleValue(): Double

    /** Returns the value of the specified number as a float,
     *  which may involve rounding.
     */
    def floatValue(): Float

    /** Returns the value of the specified number as an int,
     *  which may involve rounding or truncation.
     */
    def intValue(): Int

    /** Returns the value of the specified number as a long,
     *  which may involve rounding or truncation.
     */
    def longValue(): Long

    /** Returns the value of the specified number as a short,
     *  which may involve rounding or truncation.
     */
    def shortValue(): Short
}
