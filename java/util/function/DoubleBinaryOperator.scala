package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents an operation upon two double-valued operands and producing a
 *  double-valued result.   This is the primitive type specialization of
 *  BinaryOperator for double.
 * 
 *  This is a functional interface
 *  whose functional method is applyAsDouble(double, double).
 */
@FunctionalInterface
trait DoubleBinaryOperator {

    /** Applies this operator to the given operands. */
    @stub
    def applyAsDouble(left: Double, right: Double): Double = ???
}
