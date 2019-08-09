package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents a function that accepts a double-valued argument and produces a
 *  long-valued result.  This is the double-to-long primitive
 *  specialization for Function.
 * 
 *  This is a functional interface
 *  whose functional method is applyAsLong(double).
 */
@FunctionalInterface trait DoubleToLongFunction {

    /** Applies this function to the given argument. */
    @stub
    def applyAsLong(value: Double): Long = ???
}
