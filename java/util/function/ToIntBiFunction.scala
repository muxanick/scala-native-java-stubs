package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents a function that accepts two arguments and produces an int-valued
 *  result.  This is the int-producing primitive specialization for
 *  BiFunction.
 * 
 *  This is a functional interface
 *  whose functional method is applyAsInt(Object, Object).
 */
@FunctionalInterface
trait ToIntBiFunction[T, U] {

    /** Applies this function to the given arguments. */
    @stub
    def applyAsInt(t: T, u: U): Int = ???
}
