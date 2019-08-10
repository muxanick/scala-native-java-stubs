package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents a function that accepts an int-valued argument and produces a
 *  result.  This is the int-consuming primitive specialization for
 *  Function.
 * 
 *  This is a functional interface
 *  whose functional method is apply(int).
 */
@FunctionalInterface
trait IntFunction[R] {

    /** Applies this function to the given argument. */
    @stub
    def apply(value: Int): R = ???
}
