package java.util.function

import java.lang.FunctionalInterface

/** Represents a function that accepts one argument and produces a result.
 * 
 *  This is a functional interface
 *  whose functional method is apply(Object).
 */
@FunctionalInterface trait Function[T, R] {

    /** Returns a composed function that first applies this function to
     *  its input, and then applies the after function to the result.
     */
    @stub
    val Function[T, V]: default[V] = ???

    /** Applies this function to the given argument. */
    @stub
    def apply(t: T): R = ???

    /** Returns a composed function that first applies the before
     *  function to its input, and then applies this function to the result.
     */
    @stub
    val Function[V, R]: default[V] = ???
}
