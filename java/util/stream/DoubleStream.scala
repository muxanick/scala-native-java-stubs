package java.util.stream

import java.lang.Double
import java.util.{DoubleSummaryStatistics, OptionalDouble, PrimitiveIterator.OfDouble, Spliterator.OfDouble}
import java.util.function.{BiConsumer, DoubleBinaryOperator, DoubleConsumer, DoubleFunction, DoublePredicate, DoubleSupplier, DoubleToIntFunction, DoubleToLongFunction, DoubleUnaryOperator, ObjDoubleConsumer, Supplier}

// A sequence of primitive double-valued elements supporting sequential and parallel
// aggregate operations.  This is the double primitive specialization of
// Stream.
//
// The following example illustrates an aggregate operation using
// Stream and DoubleStream, computing the sum of the weights of the
// red widgets:
//
// 
//     double sum = widgets.stream()
//                         .filter(w -> w.getColor() == RED)
//                         .mapToDouble(w -> w.getWeight())
//                         .sum();
// 
//
// See the class documentation for Stream and the package documentation
// for java.util.stream for additional
// specification of streams, stream operations, stream pipelines, and
// parallelism.
trait DoubleStream extends BaseStream[Double, DoubleStream] {

    @stub
    // Returns whether all elements of this stream match the provided predicate.
    def allMatch(predicate: DoublePredicate): Boolean = ???

    @stub
    // Returns whether any elements of this stream match the provided
    // predicate.
    def anyMatch(predicate: DoublePredicate): Boolean = ???

    @stub
    // Returns an OptionalDouble describing the arithmetic
    // mean of elements of this stream, or an empty optional if this
    // stream is empty.
    def average(): OptionalDouble = ???

    @stub
    // Returns a Stream consisting of the elements of this stream,
    // boxed to Double.
    def boxed(): Stream[Double] = ???

    @stub
    // Performs a mutable
    // reduction operation on the elements of this stream.
    def R: [R] = ???

    @stub
    // Returns the count of elements in this stream.
    def count(): Long = ???

    @stub
    // Returns a stream consisting of the distinct elements of this stream.
    def distinct(): DoubleStream = ???

    @stub
    // Returns a stream consisting of the elements of this stream that match
    // the given predicate.
    def filter(predicate: DoublePredicate): DoubleStream = ???

    @stub
    // Returns an OptionalDouble describing some element of the stream,
    // or an empty OptionalDouble if the stream is empty.
    def findAny(): OptionalDouble = ???

    @stub
    // Returns an OptionalDouble describing the first element of this
    // stream, or an empty OptionalDouble if the stream is empty.
    def findFirst(): OptionalDouble = ???

    @stub
    // Returns a stream consisting of the results of replacing each element of
    // this stream with the contents of a mapped stream produced by applying
    // the provided mapping function to each element.
    def flatMap(mapper: DoubleFunction[_ <: DoubleStream]): DoubleStream = ???

    @stub
    // Performs an action for each element of this stream.
    def forEach(action: DoubleConsumer): Unit = ???

    @stub
    // Performs an action for each element of this stream, guaranteeing that
    // each element is processed in encounter order for streams that have a
    // defined encounter order.
    def forEachOrdered(action: DoubleConsumer): Unit = ???

    @stub
    // Returns an iterator for the elements of this stream.
    def iterator(): PrimitiveIterator.OfDouble = ???

    @stub
    // Returns a stream consisting of the elements of this stream, truncated
    // to be no longer than maxSize in length.
    def limit(maxSize: Long): DoubleStream = ???

    @stub
    // Returns a stream consisting of the results of applying the given
    // function to the elements of this stream.
    def map(mapper: DoubleUnaryOperator): DoubleStream = ???

    @stub
    // Returns an IntStream consisting of the results of applying the
    // given function to the elements of this stream.
    def mapToInt(mapper: DoubleToIntFunction): IntStream = ???

    @stub
    // Returns a LongStream consisting of the results of applying the
    // given function to the elements of this stream.
    def mapToLong(mapper: DoubleToLongFunction): LongStream = ???

    @stub
    // Returns an object-valued Stream consisting of the results of
    // applying the given function to the elements of this stream.
    def Stream[U]: [U] = ???

    @stub
    // Returns an OptionalDouble describing the maximum element of this
    // stream, or an empty OptionalDouble if this stream is empty.
    def max(): OptionalDouble = ???

    @stub
    // Returns an OptionalDouble describing the minimum element of this
    // stream, or an empty OptionalDouble if this stream is empty.
    def min(): OptionalDouble = ???

    @stub
    // Returns whether no elements of this stream match the provided predicate.
    def noneMatch(predicate: DoublePredicate): Boolean = ???

    @stub
    // Returns an equivalent stream that is parallel.
    def parallel(): DoubleStream = ???

    @stub
    // Returns a stream consisting of the elements of this stream, additionally
    // performing the provided action on each element as elements are consumed
    // from the resulting stream.
    def peek(action: DoubleConsumer): DoubleStream = ???

    @stub
    // Performs a reduction on the
    // elements of this stream, using an
    // associative accumulation
    // function, and returns an OptionalDouble describing the reduced
    // value, if any.
    def reduce(op: DoubleBinaryOperator): OptionalDouble = ???

    @stub
    // Performs a reduction on the
    // elements of this stream, using the provided identity value and an
    // associative
    // accumulation function, and returns the reduced value.
    def reduce(identity: double, op: DoubleBinaryOperator): double = ???

    @stub
    // Returns an equivalent stream that is sequential.
    def sequential(): DoubleStream = ???

    @stub
    // Returns a stream consisting of the remaining elements of this stream
    // after discarding the first n elements of the stream.
    def skip(n: Long): DoubleStream = ???

    @stub
    // Returns a stream consisting of the elements of this stream in sorted
    // order.
    def sorted(): DoubleStream = ???

    @stub
    // Returns a spliterator for the elements of this stream.
    def spliterator(): Spliterator.OfDouble = ???

    @stub
    // Returns the sum of elements in this stream.
    def sum(): double = ???

    @stub
    // Returns a DoubleSummaryStatistics describing various summary data
    // about the elements of this stream.
    def summaryStatistics(): DoubleSummaryStatistics = ???
}

object DoubleStream {
    @stub
    // Returns a builder for a DoubleStream.
    def builder(): DoubleStream.Builder = ???

    @stub
    // Creates a lazily concatenated stream whose elements are all the
    // elements of the first stream followed by all the elements of the
    // second stream.
    def concat(a: DoubleStream, b: DoubleStream): DoubleStream = ???

    @stub
    // Returns an empty sequential DoubleStream.
    def empty(): DoubleStream = ???

    @stub
    // Returns an infinite sequential unordered stream where each element is
    // generated by the provided DoubleSupplier.
    def generate(s: DoubleSupplier): DoubleStream = ???

    @stub
    // Returns an infinite sequential ordered DoubleStream produced by iterative
    // application of a function f to an initial element seed,
    // producing a Stream consisting of seed, f(seed),
    // f(f(seed)), etc.
    def iterate(seed: double, f: DoubleUnaryOperator): DoubleStream = ???

    @stub
    // Returns a sequential ordered stream whose elements are the specified values.
    def of(values: double...): DoubleStream = ???

    @stub
    // Returns a sequential DoubleStream containing a single element.
    def of(t: double): DoubleStream = ???
}
