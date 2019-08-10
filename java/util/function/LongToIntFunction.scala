package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents a function that accepts a long-valued argument and produces an
 *  int-valued result.  This is the long-to-int primitive
 *  specialization for Function.
 * 
 *  This is a functional interface
 *  whose functional method is applyAsInt(long).
 */
@FunctionalInterface
trait LongToIntFunction {

    /** Applies this function to the given argument. */
    @stub
    def applyAsInt(value: Long): Int = ???
}
