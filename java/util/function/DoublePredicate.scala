package java.util.function

import java.lang.FunctionalInterface

// Represents a predicate (boolean-valued function) of one double-valued
// argument. This is the double-consuming primitive type specialization
// of Predicate.
//
// This is a functional interface
// whose functional method is test(double).
@FunctionalInterface trait DoublePredicate {

    @stub
    // Returns a composed predicate that represents a short-circuiting logical
    // AND of this predicate and another.
    def this: default = ???

    @stub
    // Returns a predicate that represents the logical negation of this
    // predicate.
    def this: default = ???

    @stub
    // Returns a composed predicate that represents a short-circuiting logical
    // OR of this predicate and another.
    def this: default = ???
}
