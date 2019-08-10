package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents a function that accepts a double-valued argument and produces an
 *  int-valued result.  This is the double-to-int primitive
 *  specialization for Function.
 * 
 *  This is a functional interface
 *  whose functional method is applyAsInt(double).
 */
@FunctionalInterface
trait DoubleToIntFunction {

    /** Applies this function to the given argument. */
    @stub
    def applyAsInt(value: Double): Int = ???
}
