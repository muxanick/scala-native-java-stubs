package java.util.function

import java.lang.FunctionalInterface

// Represents an operation that accepts a single input argument and returns no
// result. Unlike most other functional interfaces, Consumer is expected
// to operate via side-effects.
//
// This is a functional interface
// whose functional method is accept(Object).
@FunctionalInterface trait Consumer[T] {

    @stub
    // Performs this operation on the given argument.
    def accept(t: T): Unit = ???
}
