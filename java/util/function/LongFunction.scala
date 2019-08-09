package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents a function that accepts a long-valued argument and produces a
 *  result.  This is the long-consuming primitive specialization for
 *  Function.
 * 
 *  This is a functional interface
 *  whose functional method is apply(long).
 */
@FunctionalInterface trait LongFunction[R] {

    /** Applies this function to the given argument. */
    @stub
    def apply(value: Long): R = ???
}
