package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents a function that accepts a long-valued argument and produces a
 *  double-valued result.  This is the long-to-double primitive
 *  specialization for Function.
 * 
 *  This is a functional interface
 *  whose functional method is applyAsDouble(long).
 */
@FunctionalInterface
trait LongToDoubleFunction {

    /** Applies this function to the given argument. */
    @stub
    def applyAsDouble(value: Long): Double = ???
}
