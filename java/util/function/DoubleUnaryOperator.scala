package java.util.function

import java.lang.FunctionalInterface

// Represents an operation on a single double-valued operand that produces
// a double-valued result.  This is the primitive type specialization of
// UnaryOperator for double.
//
// This is a functional interface
// whose functional method is applyAsDouble(double).
@FunctionalInterface trait DoubleUnaryOperator {

    @stub
    // Returns a composed operator that first applies this operator to
    // its input, and then applies the after operator to the result.
    def this: default = ???

    @stub
    // Applies this operator to the given operand.
    def applyAsDouble(operand: double): double = ???

    @stub
    // Returns a composed operator that first applies the before
    // operator to its input, and then applies this operator to the result.
    def this: default = ???
}
