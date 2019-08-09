package java.util.function

import java.lang.{FunctionalInterface, Object}

// Represents a predicate (boolean-valued function) of one argument.
//
// This is a functional interface
// whose functional method is test(Object).
@FunctionalInterface trait Predicate[T] {

    @stub
    // Returns a composed predicate that represents a short-circuiting logical
    // AND of this predicate and another.
    def Predicate[T]: default = ???

    @stub
    // Returns a predicate that represents the logical negation of this
    // predicate.
    def Predicate[T]: default = ???

    @stub
    // Returns a composed predicate that represents a short-circuiting logical
    // OR of this predicate and another.
    def Predicate[T]: default = ???
}

object Predicate {
    @stub
    // Returns a predicate that tests if two arguments are equal according
    // to Objects.equals(Object, Object).
    def Predicate[T]: [T] = ???
}
