package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents a function that accepts two arguments and produces a result.
 *  This is the two-arity specialization of Function.
 * 
 *  This is a functional interface
 *  whose functional method is apply(Object, Object).
 */
@FunctionalInterface
trait BiFunction[T, U, R] {

    /** Returns a composed function that first applies this function to
     *  its input, and then applies the after function to the result.
     */
    @stub
    val BiFunction[T, U, V]: default[V] = ???

    /** Applies this function to the given arguments. */
    @stub
    def apply(t: T, u: U): R = ???
}
