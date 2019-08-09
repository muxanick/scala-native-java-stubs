package java.util.function

import java.lang.FunctionalInterface

// Represents an operation that accepts a single long-valued argument and
// returns no result.  This is the primitive type specialization of
// Consumer for long.  Unlike most other functional interfaces,
// LongConsumer is expected to operate via side-effects.
//
// This is a functional interface
// whose functional method is accept(long).
@FunctionalInterface trait LongConsumer {

    @stub
    // Performs this operation on the given argument.
    def accept(value: Long): Unit = ???
}
