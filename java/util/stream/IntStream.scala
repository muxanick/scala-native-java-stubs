package java.util.stream

import java.lang.Integer
import java.util.{IntSummaryStatistics, OptionalDouble, OptionalInt, PrimitiveIterator.OfInt, Spliterator.OfInt}
import java.util.function.{BiConsumer, IntBinaryOperator, IntConsumer, IntFunction, IntPredicate, IntSupplier, IntToDoubleFunction, IntToLongFunction, IntUnaryOperator, ObjIntConsumer, Supplier}
import scala.scalanative.annotation.stub

/** A sequence of primitive int-valued elements supporting sequential and parallel
 *  aggregate operations.  This is the int primitive specialization of
 *  Stream.
 * 
 *  The following example illustrates an aggregate operation using
 *  Stream and IntStream, computing the sum of the weights of the
 *  red widgets:
 * 
 *  
 *      int sum = widgets.stream()
 *                       .filter(w -> w.getColor() == RED)
 *                       .mapToInt(w -> w.getWeight())
 *                       .sum();
 *  
 * 
 *  See the class documentation for Stream and the package documentation
 *  for java.util.stream for additional
 *  specification of streams, stream operations, stream pipelines, and
 *  parallelism.
 */
trait IntStream extends BaseStream[Integer, IntStream] {

    /** Returns whether all elements of this stream match the provided predicate. */
    @stub
    def allMatch(predicate: IntPredicate): Boolean = ???

    /** Returns whether any elements of this stream match the provided
     *  predicate.
     */
    @stub
    def anyMatch(predicate: IntPredicate): Boolean = ???

    /** Returns a DoubleStream consisting of the elements of this stream,
     *  converted to double.
     */
    @stub
    def asDoubleStream(): DoubleStream = ???

    /** Returns a LongStream consisting of the elements of this stream,
     *  converted to long.
     */
    @stub
    def asLongStream(): LongStream = ???

    /** Returns an OptionalDouble describing the arithmetic mean of elements of
     *  this stream, or an empty optional if this stream is empty.
     */
    @stub
    def average(): OptionalDouble = ???

    /** Returns a Stream consisting of the elements of this stream,
     *  each boxed to an Integer.
     */
    @stub
    def boxed(): Stream[Integer] = ???

    /** Performs a mutable
     *  reduction operation on the elements of this stream.
     */
    @stub
    def collect[R](supplier: Supplier[R], accumulator: ObjIntConsumer[R], combiner: BiConsumer[R, R]): R = ???

    /** Returns the count of elements in this stream. */
    @stub
    def count(): Long = ???

    /** Returns a stream consisting of the distinct elements of this stream. */
    @stub
    def distinct(): IntStream = ???

    /** Returns a stream consisting of the elements of this stream that match
     *  the given predicate.
     */
    @stub
    def filter(predicate: IntPredicate): IntStream = ???

    /** Returns an OptionalInt describing some element of the stream, or
     *  an empty OptionalInt if the stream is empty.
     */
    @stub
    def findAny(): OptionalInt = ???

    /** Returns an OptionalInt describing the first element of this
     *  stream, or an empty OptionalInt if the stream is empty.
     */
    @stub
    def findFirst(): OptionalInt = ???

    /** Returns a stream consisting of the results of replacing each element of
     *  this stream with the contents of a mapped stream produced by applying
     *  the provided mapping function to each element.
     */
    @stub
    def flatMap(mapper: IntFunction[_ <: IntStream]): IntStream = ???

    /** Performs an action for each element of this stream. */
    @stub
    def forEach(action: IntConsumer): Unit = ???

    /** Performs an action for each element of this stream, guaranteeing that
     *  each element is processed in encounter order for streams that have a
     *  defined encounter order.
     */
    @stub
    def forEachOrdered(action: IntConsumer): Unit = ???

    /** Returns an iterator for the elements of this stream. */
    @stub
    def iterator(): PrimitiveIterator.OfInt = ???

    /** Returns a stream consisting of the elements of this stream, truncated
     *  to be no longer than maxSize in length.
     */
    @stub
    def limit(maxSize: Long): IntStream = ???

    /** Returns a stream consisting of the results of applying the given
     *  function to the elements of this stream.
     */
    @stub
    def map(mapper: IntUnaryOperator): IntStream = ???

    /** Returns a DoubleStream consisting of the results of applying the
     *  given function to the elements of this stream.
     */
    @stub
    def mapToDouble(mapper: IntToDoubleFunction): DoubleStream = ???

    /** Returns a LongStream consisting of the results of applying the
     *  given function to the elements of this stream.
     */
    @stub
    def mapToLong(mapper: IntToLongFunction): LongStream = ???

    /** Returns an object-valued Stream consisting of the results of
     *  applying the given function to the elements of this stream.
     */
    @stub
    def mapToObj[U](mapper: IntFunction[_ <: U]): Stream[U] = ???

    /** Returns an OptionalInt describing the maximum element of this
     *  stream, or an empty optional if this stream is empty.
     */
    @stub
    def max(): OptionalInt = ???

    /** Returns an OptionalInt describing the minimum element of this
     *  stream, or an empty optional if this stream is empty.
     */
    @stub
    def min(): OptionalInt = ???

    /** Returns whether no elements of this stream match the provided predicate. */
    @stub
    def noneMatch(predicate: IntPredicate): Boolean = ???

    /** Returns an equivalent stream that is parallel. */
    @stub
    def parallel(): IntStream = ???

    /** Returns a stream consisting of the elements of this stream, additionally
     *  performing the provided action on each element as elements are consumed
     *  from the resulting stream.
     */
    @stub
    def peek(action: IntConsumer): IntStream = ???

    /** Performs a reduction on the
     *  elements of this stream, using an
     *  associative accumulation
     *  function, and returns an OptionalInt describing the reduced value,
     *  if any.
     */
    @stub
    def reduce(op: IntBinaryOperator): OptionalInt = ???

    /** Performs a reduction on the
     *  elements of this stream, using the provided identity value and an
     *  associative
     *  accumulation function, and returns the reduced value.
     */
    @stub
    def reduce(identity: Int, op: IntBinaryOperator): Int = ???

    /** Returns an equivalent stream that is sequential. */
    @stub
    def sequential(): IntStream = ???

    /** Returns a stream consisting of the remaining elements of this stream
     *  after discarding the first n elements of the stream.
     */
    @stub
    def skip(n: Long): IntStream = ???

    /** Returns a stream consisting of the elements of this stream in sorted
     *  order.
     */
    @stub
    def sorted(): IntStream = ???

    /** Returns a spliterator for the elements of this stream. */
    @stub
    def spliterator(): Spliterator.OfInt = ???

    /** Returns the sum of elements in this stream. */
    @stub
    def sum(): Int = ???

    /** Returns an IntSummaryStatistics describing various
     *  summary data about the elements of this stream.
     */
    @stub
    def summaryStatistics(): IntSummaryStatistics = ???

    /** Returns an array containing the elements of this stream. */
    @stub
    def toArray(): Array[Int] = ???
}

object IntStream {
    /** A mutable builder for an IntStream. */
    @stub
    trait Builder extends IntStream.Builder

    /** Returns a builder for an IntStream. */
    @stub
    def builder(): IntStream.Builder = ???

    /** Creates a lazily concatenated stream whose elements are all the
     *  elements of the first stream followed by all the elements of the
     *  second stream.
     */
    @stub
    def concat(a: IntStream, b: IntStream): IntStream = ???

    /** Returns an empty sequential IntStream. */
    @stub
    def empty(): IntStream = ???

    /** Returns an infinite sequential unordered stream where each element is
     *  generated by the provided IntSupplier.
     */
    @stub
    def generate(s: IntSupplier): IntStream = ???

    /** Returns an infinite sequential ordered IntStream produced by iterative
     *  application of a function f to an initial element seed,
     *  producing a Stream consisting of seed, f(seed),
     *  f(f(seed)), etc.
     */
    @stub
    def iterate(seed: Int, f: IntUnaryOperator): IntStream = ???

    /** Returns a sequential ordered stream whose elements are the specified values. */
    @stub
    def of(values: int*): IntStream = ???

    /** Returns a sequential IntStream containing a single element. */
    @stub
    def of(t: Int): IntStream = ???

    /** Returns a sequential ordered IntStream from startInclusive
     *  (inclusive) to endExclusive (exclusive) by an incremental step of
     *  1.
     */
    @stub
    def range(startInclusive: Int, endExclusive: Int): IntStream = ???

    /** Returns a sequential ordered IntStream from startInclusive
     *  (inclusive) to endInclusive (inclusive) by an incremental step of
     *  1.
     */
    @stub
    def rangeClosed(startInclusive: Int, endInclusive: Int): IntStream = ???
}
