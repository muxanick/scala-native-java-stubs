package java.util.function

import java.lang.FunctionalInterface

// Represents an operation on a single int-valued operand that produces
// an int-valued result.  This is the primitive type specialization of
// UnaryOperator for int.
//
// This is a functional interface
// whose functional method is applyAsInt(int).
@FunctionalInterface trait IntUnaryOperator {

    @stub
    // Returns a composed operator that first applies this operator to
    // its input, and then applies the after operator to the result.
    def this: default = ???

    @stub
    // Applies this operator to the given operand.
    def applyAsInt(operand: Int): Int = ???

    @stub
    // Returns a composed operator that first applies the before
    // operator to its input, and then applies this operator to the result.
    def this: default = ???
}
