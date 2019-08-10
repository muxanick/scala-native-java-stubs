package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents a function that accepts two arguments and produces a long-valued
 *  result.  This is the long-producing primitive specialization for
 *  BiFunction.
 * 
 *  This is a functional interface
 *  whose functional method is applyAsLong(Object, Object).
 */
@FunctionalInterface
trait ToLongBiFunction[T, U] {

    /** Applies this function to the given arguments. */
    @stub
    def applyAsLong(t: T, u: U): Long = ???
}
