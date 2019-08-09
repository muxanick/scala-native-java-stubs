package java.util.function

import java.lang.FunctionalInterface
import java.util.Comparator

/** Represents an operation upon two operands of the same type, producing a result
 *  of the same type as the operands.  This is a specialization of
 *  BiFunction for the case where the operands and the result are all of
 *  the same type.
 * 
 *  This is a functional interface
 *  whose functional method is BiFunction.apply(Object, Object).
 */
@FunctionalInterface trait BinaryOperator[T] extends BiFunction[T, T, T] {
}

object BinaryOperator {
    /** Returns a BinaryOperator which returns the greater of two elements
     *  according to the specified Comparator.
     */
    @stub
    def maxBy[T](comparator: Comparator[_ >: T]): BinaryOperator[T] = ???
}
