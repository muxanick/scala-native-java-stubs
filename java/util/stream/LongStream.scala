package java.util.stream

import java.lang.Long
import java.util.{LongSummaryStatistics, OptionalDouble, OptionalLong, PrimitiveIterator.OfLong, Spliterator.OfLong}
import java.util.function.{BiConsumer, LongBinaryOperator, LongConsumer, LongFunction, LongPredicate, LongSupplier, LongToDoubleFunction, LongToIntFunction, LongUnaryOperator, ObjLongConsumer, Supplier}

// A sequence of primitive long-valued elements supporting sequential and parallel
// aggregate operations.  This is the long primitive specialization of
// Stream.
//
// The following example illustrates an aggregate operation using
// Stream and LongStream, computing the sum of the weights of the
// red widgets:
//
// 
//     long sum = widgets.stream()
//                       .filter(w -> w.getColor() == RED)
//                       .mapToLong(w -> w.getWeight())
//                       .sum();
// 
//
// See the class documentation for Stream and the package documentation
// for java.util.stream for additional
// specification of streams, stream operations, stream pipelines, and
// parallelism.
trait LongStream extends BaseStream[Long, LongStream] {

    @stub
    // Returns whether all elements of this stream match the provided predicate.
    def allMatch(predicate: LongPredicate): Boolean = ???

    @stub
    // Returns whether any elements of this stream match the provided
    // predicate.
    def anyMatch(predicate: LongPredicate): Boolean = ???

    @stub
    // Returns a DoubleStream consisting of the elements of this stream,
    // converted to double.
    def asDoubleStream(): DoubleStream = ???

    @stub
    // Returns an OptionalDouble describing the arithmetic mean of elements of
    // this stream, or an empty optional if this stream is empty.
    def average(): OptionalDouble = ???

    @stub
    // Returns a Stream consisting of the elements of this stream,
    // each boxed to a Long.
    def boxed(): Stream[Long] = ???

    @stub
    // Performs a mutable
    // reduction operation on the elements of this stream.
    def R: [R] = ???

    @stub
    // Returns the count of elements in this stream.
    def count(): Long = ???

    @stub
    // Returns a stream consisting of the distinct elements of this stream.
    def distinct(): LongStream = ???

    @stub
    // Returns a stream consisting of the elements of this stream that match
    // the given predicate.
    def filter(predicate: LongPredicate): LongStream = ???

    @stub
    // Returns an OptionalLong describing some element of the stream, or
    // an empty OptionalLong if the stream is empty.
    def findAny(): OptionalLong = ???

    @stub
    // Returns an OptionalLong describing the first element of this
    // stream, or an empty OptionalLong if the stream is empty.
    def findFirst(): OptionalLong = ???

    @stub
    // Returns a stream consisting of the results of replacing each element of
    // this stream with the contents of a mapped stream produced by applying
    // the provided mapping function to each element.
    def flatMap(mapper: LongFunction[_ <: LongStream]): LongStream = ???

    @stub
    // Performs an action for each element of this stream.
    def forEach(action: LongConsumer): Unit = ???

    @stub
    // Performs an action for each element of this stream, guaranteeing that
    // each element is processed in encounter order for streams that have a
    // defined encounter order.
    def forEachOrdered(action: LongConsumer): Unit = ???

    @stub
    // Returns an iterator for the elements of this stream.
    def iterator(): PrimitiveIterator.OfLong = ???

    @stub
    // Returns a stream consisting of the elements of this stream, truncated
    // to be no longer than maxSize in length.
    def limit(maxSize: Long): LongStream = ???

    @stub
    // Returns a stream consisting of the results of applying the given
    // function to the elements of this stream.
    def map(mapper: LongUnaryOperator): LongStream = ???

    @stub
    // Returns a DoubleStream consisting of the results of applying the
    // given function to the elements of this stream.
    def mapToDouble(mapper: LongToDoubleFunction): DoubleStream = ???

    @stub
    // Returns an IntStream consisting of the results of applying the
    // given function to the elements of this stream.
    def mapToInt(mapper: LongToIntFunction): IntStream = ???

    @stub
    // Returns an object-valued Stream consisting of the results of
    // applying the given function to the elements of this stream.
    def Stream[U]: [U] = ???

    @stub
    // Returns an OptionalLong describing the maximum element of this
    // stream, or an empty optional if this stream is empty.
    def max(): OptionalLong = ???

    @stub
    // Returns an OptionalLong describing the minimum element of this
    // stream, or an empty optional if this stream is empty.
    def min(): OptionalLong = ???

    @stub
    // Returns whether no elements of this stream match the provided predicate.
    def noneMatch(predicate: LongPredicate): Boolean = ???

    @stub
    // Returns an equivalent stream that is parallel.
    def parallel(): LongStream = ???

    @stub
    // Returns a stream consisting of the elements of this stream, additionally
    // performing the provided action on each element as elements are consumed
    // from the resulting stream.
    def peek(action: LongConsumer): LongStream = ???

    @stub
    // Performs a reduction on the
    // elements of this stream, using an
    // associative accumulation
    // function, and returns an OptionalLong describing the reduced value,
    // if any.
    def reduce(op: LongBinaryOperator): OptionalLong = ???

    @stub
    // Performs a reduction on the
    // elements of this stream, using the provided identity value and an
    // associative
    // accumulation function, and returns the reduced value.
    def reduce(identity: Long, op: LongBinaryOperator): Long = ???

    @stub
    // Returns an equivalent stream that is sequential.
    def sequential(): LongStream = ???

    @stub
    // Returns a stream consisting of the remaining elements of this stream
    // after discarding the first n elements of the stream.
    def skip(n: Long): LongStream = ???

    @stub
    // Returns a stream consisting of the elements of this stream in sorted
    // order.
    def sorted(): LongStream = ???

    @stub
    // Returns a spliterator for the elements of this stream.
    def spliterator(): Spliterator.OfLong = ???

    @stub
    // Returns the sum of elements in this stream.
    def sum(): Long = ???

    @stub
    // Returns a LongSummaryStatistics describing various summary data
    // about the elements of this stream.
    def summaryStatistics(): LongSummaryStatistics = ???
}

object LongStream {
    @stub
    // Returns a builder for a LongStream.
    def builder(): LongStream.Builder = ???

    @stub
    // Creates a lazily concatenated stream whose elements are all the
    // elements of the first stream followed by all the elements of the
    // second stream.
    def concat(a: LongStream, b: LongStream): LongStream = ???

    @stub
    // Returns an empty sequential LongStream.
    def empty(): LongStream = ???

    @stub
    // Returns an infinite sequential unordered stream where each element is
    // generated by the provided LongSupplier.
    def generate(s: LongSupplier): LongStream = ???

    @stub
    // Returns an infinite sequential ordered LongStream produced by iterative
    // application of a function f to an initial element seed,
    // producing a Stream consisting of seed, f(seed),
    // f(f(seed)), etc.
    def iterate(seed: Long, f: LongUnaryOperator): LongStream = ???

    @stub
    // Returns a sequential ordered stream whose elements are the specified values.
    def of(values: long...): LongStream = ???

    @stub
    // Returns a sequential LongStream containing a single element.
    def of(t: Long): LongStream = ???

    @stub
    // Returns a sequential ordered LongStream from startInclusive
    // (inclusive) to endExclusive (exclusive) by an incremental step of
    // 1.
    def range(startInclusive: Long, endExclusive: Long): LongStream = ???

    @stub
    // Returns a sequential ordered LongStream from startInclusive
    // (inclusive) to endInclusive (inclusive) by an incremental step of
    // 1.
    def rangeClosed(startInclusive: Long, endInclusive: Long): LongStream = ???
}
