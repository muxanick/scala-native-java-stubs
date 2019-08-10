package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents a function that accepts an int-valued argument and produces a
 *  long-valued result.  This is the int-to-long primitive
 *  specialization for Function.
 * 
 *  This is a functional interface
 *  whose functional method is applyAsLong(int).
 */
@FunctionalInterface
trait IntToLongFunction {

    /** Applies this function to the given argument. */
    @stub
    def applyAsLong(value: Int): Long = ???
}
