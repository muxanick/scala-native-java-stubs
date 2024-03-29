package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents an operation upon two long-valued operands and producing a
 *  long-valued result.   This is the primitive type specialization of
 *  BinaryOperator for long.
 * 
 *  This is a functional interface
 *  whose functional method is applyAsLong(long, long).
 */
@FunctionalInterface
trait LongBinaryOperator {

    /** Applies this operator to the given operands. */
    @stub
    def applyAsLong(left: Long, right: Long): Long = ???
}
