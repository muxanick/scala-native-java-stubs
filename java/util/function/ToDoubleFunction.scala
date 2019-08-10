package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents a function that produces a double-valued result.  This is the
 *  double-producing primitive specialization for Function.
 * 
 *  This is a functional interface
 *  whose functional method is applyAsDouble(Object).
 */
@FunctionalInterface
trait ToDoubleFunction[T] {

    /** Applies this function to the given argument. */
    @stub
    def applyAsDouble(value: T): Double = ???
}
