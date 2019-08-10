package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents a function that produces an int-valued result.  This is the
 *  int-producing primitive specialization for Function.
 * 
 *  This is a functional interface
 *  whose functional method is applyAsInt(Object).
 */
@FunctionalInterface
trait ToIntFunction[T] {

    /** Applies this function to the given argument. */
    @stub
    def applyAsInt(value: T): Int = ???
}
