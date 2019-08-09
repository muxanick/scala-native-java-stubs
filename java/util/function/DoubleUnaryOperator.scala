package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents an operation on a single double-valued operand that produces
 *  a double-valued result.  This is the primitive type specialization of
 *  UnaryOperator for double.
 * 
 *  This is a functional interface
 *  whose functional method is applyAsDouble(double).
 */
@FunctionalInterface trait DoubleUnaryOperator {

    /** Returns a composed operator that first applies this operator to
     *  its input, and then applies the after operator to the result.
     */
    @stub
    val this: default = ???

    /** Applies this operator to the given operand. */
    @stub
    def applyAsDouble(operand: Double): Double = ???

    /** Returns a composed operator that first applies the before
     *  operator to its input, and then applies this operator to the result.
     */
    @stub
    val this: default = ???
}

object DoubleUnaryOperator {
    /** Returns a unary operator that always returns its input argument. */
    @stub
    def identity(): DoubleUnaryOperator = ???
}
