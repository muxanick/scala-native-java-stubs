package java.util.function

import java.lang.FunctionalInterface

// Represents an operation that accepts a single double-valued argument and
// returns no result.  This is the primitive type specialization of
// Consumer for double.  Unlike most other functional interfaces,
// DoubleConsumer is expected to operate via side-effects.
//
// This is a functional interface
// whose functional method is accept(double).
@FunctionalInterface trait DoubleConsumer {

    @stub
    // Performs this operation on the given argument.
    def accept(value: double): Unit = ???
}
