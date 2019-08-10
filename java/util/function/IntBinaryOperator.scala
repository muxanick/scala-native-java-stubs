package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents an operation upon two int-valued operands and producing an
 *  int-valued result.   This is the primitive type specialization of
 *  BinaryOperator for int.
 * 
 *  This is a functional interface
 *  whose functional method is applyAsInt(int, int).
 */
@FunctionalInterface
trait IntBinaryOperator {

    /** Applies this operator to the given operands. */
    @stub
    def applyAsInt(left: Int, right: Int): Int = ???
}
