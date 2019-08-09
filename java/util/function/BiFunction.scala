package java.util.function

import java.lang.FunctionalInterface

// Represents a function that accepts two arguments and produces a result.
// This is the two-arity specialization of Function.
//
// This is a functional interface
// whose functional method is apply(Object, Object).
@FunctionalInterface trait BiFunction[T, U, R] {

    @stub
    // Returns a composed function that first applies this function to
    // its input, and then applies the after function to the result.
    def BiFunction[T, U, V]: default[V] = ???
}
