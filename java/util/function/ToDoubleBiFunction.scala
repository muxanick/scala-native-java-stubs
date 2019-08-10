package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents a function that accepts two arguments and produces a double-valued
 *  result.  This is the double-producing primitive specialization for
 *  BiFunction.
 * 
 *  This is a functional interface
 *  whose functional method is applyAsDouble(Object, Object).
 */
@FunctionalInterface
trait ToDoubleBiFunction[T, U] {

    /** Applies this function to the given arguments. */
    @stub
    def applyAsDouble(t: T, u: U): Double = ???
}
