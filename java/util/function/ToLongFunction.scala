package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents a function that produces a long-valued result.  This is the
 *  long-producing primitive specialization for Function.
 * 
 *  This is a functional interface
 *  whose functional method is applyAsLong(Object).
 */
@FunctionalInterface
trait ToLongFunction[T] {

    /** Applies this function to the given argument. */
    @stub
    def applyAsLong(value: T): Long = ???
}
