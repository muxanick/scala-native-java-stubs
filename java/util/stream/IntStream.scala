package java.util.stream

import java.lang.Integer
import java.util.{IntSummaryStatistics, OptionalDouble, OptionalInt, PrimitiveIterator.OfInt, Spliterator.OfInt}
import java.util.function.{BiConsumer, IntBinaryOperator, IntConsumer, IntFunction, IntPredicate, IntSupplier, IntToDoubleFunction, IntToLongFunction, IntUnaryOperator, ObjIntConsumer, Supplier}

// A sequence of primitive int-valued elements supporting sequential and parallel
// aggregate operations.  This is the int primitive specialization of
// Stream.
//
// The following example illustrates an aggregate operation using
// Stream and IntStream, computing the sum of the weights of the
// red widgets:
//
// 
//     int sum = widgets.stream()
//                      .filter(w -> w.getColor() == RED)
//                      .mapToInt(w -> w.getWeight())
//                      .sum();
// 
//
// See the class documentation for Stream and the package documentation
// for java.util.stream for additional
// specification of streams, stream operations, stream pipelines, and
// parallelism.
trait IntStream extends BaseStream[Integer, IntStream] {

    @stub
    // Returns whether all elements of this stream match the provided predicate.
    def allMatch(predicate: IntPredicate): Boolean = ???

    @stub
    // Returns whether any elements of this stream match the provided
    // predicate.
    def anyMatch(predicate: IntPredicate): Boolean = ???

    @stub
    // Returns a DoubleStream consisting of the elements of this stream,
    // converted to double.
    def asDoubleStream(): DoubleStream = ???

    @stub
    // Returns a LongStream consisting of the elements of this stream,
    // converted to long.
    def asLongStream(): LongStream = ???

    @stub
    // Returns an OptionalDouble describing the arithmetic mean of elements of
    // this stream, or an empty optional if this stream is empty.
    def average(): OptionalDouble = ???

    @stub
    // Returns a Stream consisting of the elements of this stream,
    // each boxed to an Integer.
    def boxed(): Stream[Integer] = ???

    @stub
    // Performs a mutable
    // reduction operation on the elements of this stream.
    def R: [R] = ???

    @stub
    // Returns the count of elements in this stream.
    def count(): Long = ???

    @stub
    // Returns a stream consisting of the distinct elements of this stream.
    def distinct(): IntStream = ???

    @stub
    // Returns a stream consisting of the elements of this stream that match
    // the given predicate.
    def filter(predicate: IntPredicate): IntStream = ???

    @stub
    // Returns an OptionalInt describing some element of the stream, or
    // an empty OptionalInt if the stream is empty.
    def findAny(): OptionalInt = ???

    @stub
    // Returns an OptionalInt describing the first element of this
    // stream, or an empty OptionalInt if the stream is empty.
    def findFirst(): OptionalInt = ???

    @stub
    // Returns a stream consisting of the results of replacing each element of
    // this stream with the contents of a mapped stream produced by applying
    // the provided mapping function to each element.
    def flatMap(mapper: IntFunction[_ <: IntStream]): IntStream = ???

    @stub
    // Performs an action for each element of this stream.
    def forEach(action: IntConsumer): Unit = ???

    @stub
    // Performs an action for each element of this stream, guaranteeing that
    // each element is processed in encounter order for streams that have a
    // defined encounter order.
    def forEachOrdered(action: IntConsumer): Unit = ???

    @stub
    // Returns an iterator for the elements of this stream.
    def iterator(): PrimitiveIterator.OfInt = ???

    @stub
    // Returns a stream consisting of the elements of this stream, truncated
    // to be no longer than maxSize in length.
    def limit(maxSize: Long): IntStream = ???

    @stub
    // Returns a stream consisting of the results of applying the given
    // function to the elements of this stream.
    def map(mapper: IntUnaryOperator): IntStream = ???

    @stub
    // Returns a DoubleStream consisting of the results of applying the
    // given function to the elements of this stream.
    def mapToDouble(mapper: IntToDoubleFunction): DoubleStream = ???

    @stub
    // Returns a LongStream consisting of the results of applying the
    // given function to the elements of this stream.
    def mapToLong(mapper: IntToLongFunction): LongStream = ???

    @stub
    // Returns an object-valued Stream consisting of the results of
    // applying the given function to the elements of this stream.
    def Stream[U]: [U] = ???

    @stub
    // Returns an OptionalInt describing the maximum element of this
    // stream, or an empty optional if this stream is empty.
    def max(): OptionalInt = ???

    @stub
    // Returns an OptionalInt describing the minimum element of this
    // stream, or an empty optional if this stream is empty.
    def min(): OptionalInt = ???

    @stub
    // Returns whether no elements of this stream match the provided predicate.
    def noneMatch(predicate: IntPredicate): Boolean = ???

    @stub
    // Returns an equivalent stream that is parallel.
    def parallel(): IntStream = ???

    @stub
    // Returns a stream consisting of the elements of this stream, additionally
    // performing the provided action on each element as elements are consumed
    // from the resulting stream.
    def peek(action: IntConsumer): IntStream = ???

    @stub
    // Performs a reduction on the
    // elements of this stream, using an
    // associative accumulation
    // function, and returns an OptionalInt describing the reduced value,
    // if any.
    def reduce(op: IntBinaryOperator): OptionalInt = ???

    @stub
    // Performs a reduction on the
    // elements of this stream, using the provided identity value and an
    // associative
    // accumulation function, and returns the reduced value.
    def reduce(identity: Int, op: IntBinaryOperator): Int = ???

    @stub
    // Returns an equivalent stream that is sequential.
    def sequential(): IntStream = ???

    @stub
    // Returns a stream consisting of the remaining elements of this stream
    // after discarding the first n elements of the stream.
    def skip(n: Long): IntStream = ???

    @stub
    // Returns a stream consisting of the elements of this stream in sorted
    // order.
    def sorted(): IntStream = ???

    @stub
    // Returns a spliterator for the elements of this stream.
    def spliterator(): Spliterator.OfInt = ???

    @stub
    // Returns the sum of elements in this stream.
    def sum(): Int = ???

    @stub
    // Returns an IntSummaryStatistics describing various
    // summary data about the elements of this stream.
    def summaryStatistics(): IntSummaryStatistics = ???
}

object IntStream {
    @stub
    // Returns a builder for an IntStream.
    def builder(): IntStream.Builder = ???

    @stub
    // Creates a lazily concatenated stream whose elements are all the
    // elements of the first stream followed by all the elements of the
    // second stream.
    def concat(a: IntStream, b: IntStream): IntStream = ???

    @stub
    // Returns an empty sequential IntStream.
    def empty(): IntStream = ???

    @stub
    // Returns an infinite sequential unordered stream where each element is
    // generated by the provided IntSupplier.
    def generate(s: IntSupplier): IntStream = ???

    @stub
    // Returns an infinite sequential ordered IntStream produced by iterative
    // application of a function f to an initial element seed,
    // producing a Stream consisting of seed, f(seed),
    // f(f(seed)), etc.
    def iterate(seed: Int, f: IntUnaryOperator): IntStream = ???

    @stub
    // Returns a sequential ordered stream whose elements are the specified values.
    def of(values: int...): IntStream = ???

    @stub
    // Returns a sequential IntStream containing a single element.
    def of(t: Int): IntStream = ???

    @stub
    // Returns a sequential ordered IntStream from startInclusive
    // (inclusive) to endExclusive (exclusive) by an incremental step of
    // 1.
    def range(startInclusive: Int, endExclusive: Int): IntStream = ???

    @stub
    // Returns a sequential ordered IntStream from startInclusive
    // (inclusive) to endInclusive (inclusive) by an incremental step of
    // 1.
    def rangeClosed(startInclusive: Int, endInclusive: Int): IntStream = ???
}
