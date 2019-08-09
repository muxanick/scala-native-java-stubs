package java.util.function

import java.lang.FunctionalInterface

// Represents an operation on a single long-valued operand that produces
// a long-valued result.  This is the primitive type specialization of
// UnaryOperator for long.
//
// This is a functional interface
// whose functional method is applyAsLong(long).
@FunctionalInterface trait LongUnaryOperator {

    @stub
    // Returns a composed operator that first applies this operator to
    // its input, and then applies the after operator to the result.
    def this: default = ???

    @stub
    // Applies this operator to the given operand.
    def applyAsLong(operand: Long): Long = ???

    @stub
    // Returns a composed operator that first applies the before
    // operator to its input, and then applies this operator to the result.
    def this: default = ???
}
