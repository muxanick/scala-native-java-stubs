package java.util.stream

import java.lang.Object
import java.util.{Spliterator, Spliterator.OfDouble, Spliterator.OfInt, Spliterator.OfLong}
import java.util.function.Supplier

// Low-level utility methods for creating and manipulating streams.
//
// This class is mostly for library writers presenting stream views
// of data structures; most static stream methods intended for end users are in
// the various Stream classes.
final class StreamSupport extends Object {
}

object StreamSupport {
    @stub
    // Creates a new sequential or parallel DoubleStream from a
    // Spliterator.OfDouble.
    def doubleStream(spliterator: Spliterator.OfDouble, parallel: Boolean): DoubleStream = ???

    @stub
    // Creates a new sequential or parallel DoubleStream from a
    // Supplier of Spliterator.OfDouble.
    def doubleStream(supplier: Supplier[_ <: Spliterator.OfDouble], characteristics: Int, parallel: Boolean): DoubleStream = ???

    @stub
    // Creates a new sequential or parallel IntStream from a
    // Spliterator.OfInt.
    def intStream(spliterator: Spliterator.OfInt, parallel: Boolean): IntStream = ???

    @stub
    // Creates a new sequential or parallel IntStream from a
    // Supplier of Spliterator.OfInt.
    def intStream(supplier: Supplier[_ <: Spliterator.OfInt], characteristics: Int, parallel: Boolean): IntStream = ???

    @stub
    // Creates a new sequential or parallel LongStream from a
    // Spliterator.OfLong.
    def longStream(spliterator: Spliterator.OfLong, parallel: Boolean): LongStream = ???

    @stub
    // Creates a new sequential or parallel LongStream from a
    // Supplier of Spliterator.OfLong.
    def longStream(supplier: Supplier[_ <: Spliterator.OfLong], characteristics: Int, parallel: Boolean): LongStream = ???

    @stub
    // Creates a new sequential or parallel Stream from a
    // Spliterator.
    def Stream[T]: [T] = ???
}
