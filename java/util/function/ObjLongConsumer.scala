package java.util.function

import java.lang.FunctionalInterface

// Represents an operation that accepts an object-valued and a
// long-valued argument, and returns no result.  This is the
// (reference, long) specialization of BiConsumer.
// Unlike most other functional interfaces, ObjLongConsumer is
// expected to operate via side-effects.
//
// This is a functional interface
// whose functional method is accept(Object, long).
@FunctionalInterface trait ObjLongConsumer[T] {
}
