package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents a function that accepts an int-valued argument and produces a
 *  double-valued result.  This is the int-to-double primitive
 *  specialization for Function.
 * 
 *  This is a functional interface
 *  whose functional method is applyAsDouble(int).
 */
@FunctionalInterface trait IntToDoubleFunction {

    /** Applies this function to the given argument. */
    @stub
    def applyAsDouble(value: Int): Double = ???
}
