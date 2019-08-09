package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents a function that accepts a double-valued argument and produces a
 *  result.  This is the double-consuming primitive specialization for
 *  Function.
 * 
 *  This is a functional interface
 *  whose functional method is apply(double).
 */
@FunctionalInterface trait DoubleFunction[R] {

    /** Applies this function to the given argument. */
    @stub
    def apply(value: Double): R = ???
}
