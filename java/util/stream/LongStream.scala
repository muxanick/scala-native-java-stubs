package java.util.stream

import java.lang.Long
import java.util.{LongSummaryStatistics, OptionalDouble, OptionalLong, PrimitiveIterator.OfLong, Spliterator.OfLong}
import java.util.function.{BiConsumer, LongBinaryOperator, LongConsumer, LongFunction, LongPredicate, LongSupplier, LongToDoubleFunction, LongToIntFunction, LongUnaryOperator, ObjLongConsumer, Supplier}
import scala.scalanative.annotation.stub

/** A sequence of primitive long-valued elements supporting sequential and parallel
 *  aggregate operations.  This is the long primitive specialization of
 *  Stream.
 * 
 *  The following example illustrates an aggregate operation using
 *  Stream and LongStream, computing the sum of the weights of the
 *  red widgets:
 * 
 *  
 *      long sum = widgets.stream()
 *                        .filter(w -> w.getColor() == RED)
 *                        .mapToLong(w -> w.getWeight())
 *                        .sum();
 *  
 * 
 *  See the class documentation for Stream and the package documentation
 *  for java.util.stream for additional
 *  specification of streams, stream operations, stream pipelines, and
 *  parallelism.
 */
trait LongStream extends BaseStream[Long, LongStream] {

    /** Returns whether all elements of this stream match the provided predicate. */
    @stub
    def allMatch(predicate: LongPredicate): Boolean = ???

    /** Returns whether any elements of this stream match the provided
     *  predicate.
     */
    @stub
    def anyMatch(predicate: LongPredicate): Boolean = ???

    /** Returns a DoubleStream consisting of the elements of this stream,
     *  converted to double.
     */
    @stub
    def asDoubleStream(): DoubleStream = ???

    /** Returns an OptionalDouble describing the arithmetic mean of elements of
     *  this stream, or an empty optional if this stream is empty.
     */
    @stub
    def average(): OptionalDouble = ???

    /** Returns a Stream consisting of the elements of this stream,
     *  each boxed to a Long.
     */
    @stub
    def boxed(): Stream[Long] = ???

    /** Performs a mutable
     *  reduction operation on the elements of this stream.
     */
    @stub
    def collect[R](supplier: Supplier[R], accumulator: ObjLongConsumer[R], combiner: BiConsumer[R, R]): R = ???

    /** Returns the count of elements in this stream. */
    @stub
    def count(): Long = ???

    /** Returns a stream consisting of the distinct elements of this stream. */
    @stub
    def distinct(): LongStream = ???

    /** Returns a stream consisting of the elements of this stream that match
     *  the given predicate.
     */
    @stub
    def filter(predicate: LongPredicate): LongStream = ???

    /** Returns an OptionalLong describing some element of the stream, or
     *  an empty OptionalLong if the stream is empty.
     */
    @stub
    def findAny(): OptionalLong = ???

    /** Returns an OptionalLong describing the first element of this
     *  stream, or an empty OptionalLong if the stream is empty.
     */
    @stub
    def findFirst(): OptionalLong = ???

    /** Returns a stream consisting of the results of replacing each element of
     *  this stream with the contents of a mapped stream produced by applying
     *  the provided mapping function to each element.
     */
    @stub
    def flatMap(mapper: LongFunction[_ <: LongStream]): LongStream = ???

    /** Performs an action for each element of this stream. */
    @stub
    def forEach(action: LongConsumer): Unit = ???

    /** Performs an action for each element of this stream, guaranteeing that
     *  each element is processed in encounter order for streams that have a
     *  defined encounter order.
     */
    @stub
    def forEachOrdered(action: LongConsumer): Unit = ???

    /** Returns an iterator for the elements of this stream. */
    @stub
    def iterator(): PrimitiveIterator.OfLong = ???

    /** Returns a stream consisting of the elements of this stream, truncated
     *  to be no longer than maxSize in length.
     */
    @stub
    def limit(maxSize: Long): LongStream = ???

    /** Returns a stream consisting of the results of applying the given
     *  function to the elements of this stream.
     */
    @stub
    def map(mapper: LongUnaryOperator): LongStream = ???

    /** Returns a DoubleStream consisting of the results of applying the
     *  given function to the elements of this stream.
     */
    @stub
    def mapToDouble(mapper: LongToDoubleFunction): DoubleStream = ???

    /** Returns an IntStream consisting of the results of applying the
     *  given function to the elements of this stream.
     */
    @stub
    def mapToInt(mapper: LongToIntFunction): IntStream = ???

    /** Returns an object-valued Stream consisting of the results of
     *  applying the given function to the elements of this stream.
     */
    @stub
    def mapToObj[U](mapper: LongFunction[_ <: U]): Stream[U] = ???

    /** Returns an OptionalLong describing the maximum element of this
     *  stream, or an empty optional if this stream is empty.
     */
    @stub
    def max(): OptionalLong = ???

    /** Returns an OptionalLong describing the minimum element of this
     *  stream, or an empty optional if this stream is empty.
     */
    @stub
    def min(): OptionalLong = ???

    /** Returns whether no elements of this stream match the provided predicate. */
    @stub
    def noneMatch(predicate: LongPredicate): Boolean = ???

    /** Returns an equivalent stream that is parallel. */
    @stub
    def parallel(): LongStream = ???

    /** Returns a stream consisting of the elements of this stream, additionally
     *  performing the provided action on each element as elements are consumed
     *  from the resulting stream.
     */
    @stub
    def peek(action: LongConsumer): LongStream = ???

    /** Performs a reduction on the
     *  elements of this stream, using an
     *  associative accumulation
     *  function, and returns an OptionalLong describing the reduced value,
     *  if any.
     */
    @stub
    def reduce(op: LongBinaryOperator): OptionalLong = ???

    /** Performs a reduction on the
     *  elements of this stream, using the provided identity value and an
     *  associative
     *  accumulation function, and returns the reduced value.
     */
    @stub
    def reduce(identity: Long, op: LongBinaryOperator): Long = ???

    /** Returns an equivalent stream that is sequential. */
    @stub
    def sequential(): LongStream = ???

    /** Returns a stream consisting of the remaining elements of this stream
     *  after discarding the first n elements of the stream.
     */
    @stub
    def skip(n: Long): LongStream = ???

    /** Returns a stream consisting of the elements of this stream in sorted
     *  order.
     */
    @stub
    def sorted(): LongStream = ???

    /** Returns a spliterator for the elements of this stream. */
    @stub
    def spliterator(): Spliterator.OfLong = ???

    /** Returns the sum of elements in this stream. */
    @stub
    def sum(): Long = ???

    /** Returns a LongSummaryStatistics describing various summary data
     *  about the elements of this stream.
     */
    @stub
    def summaryStatistics(): LongSummaryStatistics = ???

    /** Returns an array containing the elements of this stream. */
    @stub
    def toArray(): Array[Long] = ???
}

object LongStream {
    /** A mutable builder for a LongStream.
     * 
     *  A stream builder has a lifecycle, which starts in a building
     *  phase, during which elements can be added, and then transitions to a built
     *  phase, after which elements may not be added.  The built phase begins
     *  begins when the build() method is called, which creates an
     *  ordered stream whose elements are the elements that were added to the
     *  stream builder, in the order they were added.
     */
    trait Builder extends LongConsumer {

        /** Adds an element to the stream being built. */
        @stub
        def accept(t: Long): Unit = ???

        /** Adds an element to the stream being built. */
        @stub
        def add(t: Long): Builder = ???

        /** Builds the stream, transitioning this builder to the built state. */
        @stub
        def build(): LongStream = ???
    }


    /** Returns a builder for a LongStream. */
    @stub
    def builder(): LongStream.Builder = ???

    /** Creates a lazily concatenated stream whose elements are all the
     *  elements of the first stream followed by all the elements of the
     *  second stream.
     */
    @stub
    def concat(a: LongStream, b: LongStream): LongStream = ???

    /** Returns an empty sequential LongStream. */
    @stub
    def empty(): LongStream = ???

    /** Returns an infinite sequential unordered stream where each element is
     *  generated by the provided LongSupplier.
     */
    @stub
    def generate(s: LongSupplier): LongStream = ???

    /** Returns an infinite sequential ordered LongStream produced by iterative
     *  application of a function f to an initial element seed,
     *  producing a Stream consisting of seed, f(seed),
     *  f(f(seed)), etc.
     */
    @stub
    def iterate(seed: Long, f: LongUnaryOperator): LongStream = ???

    /** Returns a sequential ordered stream whose elements are the specified values. */
    @stub
    def of(values: long*): LongStream = ???

    /** Returns a sequential LongStream containing a single element. */
    @stub
    def of(t: Long): LongStream = ???

    /** Returns a sequential ordered LongStream from startInclusive
     *  (inclusive) to endExclusive (exclusive) by an incremental step of
     *  1.
     */
    @stub
    def range(startInclusive: Long, endExclusive: Long): LongStream = ???

    /** Returns a sequential ordered LongStream from startInclusive
     *  (inclusive) to endInclusive (inclusive) by an incremental step of
     *  1.
     */
    @stub
    def rangeClosed(startInclusive: Long, endInclusive: Long): LongStream = ???
}
