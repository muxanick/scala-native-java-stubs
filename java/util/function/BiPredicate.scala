package java.util.function

import java.lang.FunctionalInterface

// Represents a predicate (boolean-valued function) of two arguments.  This is
// the two-arity specialization of Predicate.
//
// This is a functional interface
// whose functional method is test(Object, Object).
@FunctionalInterface trait BiPredicate[T, U] {

    @stub
    // Returns a composed predicate that represents a short-circuiting logical
    // AND of this predicate and another.
    def BiPredicate[T, U]: default = ???

    @stub
    // Returns a predicate that represents the logical negation of this
    // predicate.
    def BiPredicate[T, U]: default = ???

    @stub
    // Returns a composed predicate that represents a short-circuiting logical
    // OR of this predicate and another.
    def BiPredicate[T, U]: default = ???
}
