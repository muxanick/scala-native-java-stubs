package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents an operation on a single int-valued operand that produces
 *  an int-valued result.  This is the primitive type specialization of
 *  UnaryOperator for int.
 * 
 *  This is a functional interface
 *  whose functional method is applyAsInt(int).
 */
@FunctionalInterface trait IntUnaryOperator {

    /** Returns a composed operator that first applies this operator to
     *  its input, and then applies the after operator to the result.
     */
    @stub
    val this: default = ???

    /** Applies this operator to the given operand. */
    @stub
    def applyAsInt(operand: Int): Int = ???

    /** Returns a composed operator that first applies the before
     *  operator to its input, and then applies this operator to the result.
     */
    @stub
    val this: default = ???
}

object IntUnaryOperator {
    /** Returns a unary operator that always returns its input argument. */
    @stub
    def identity(): IntUnaryOperator = ???
}
