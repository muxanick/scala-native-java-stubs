package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents an operation on a single operand that produces a result of the
 *  same type as its operand.  This is a specialization of Function for
 *  the case where the operand and result are of the same type.
 * 
 *  This is a functional interface
 *  whose functional method is Function.apply(Object).
 */
@FunctionalInterface
trait UnaryOperator[T] extends Function[T, T] {
}

object UnaryOperator {
    /** Returns a unary operator that always returns its input argument. */
    @stub
    def identity[T](): UnaryOperator[T] = ???
}
