package java.util.stream

import java.lang.Double
import java.util.{DoubleSummaryStatistics, OptionalDouble, PrimitiveIterator.OfDouble, Spliterator.OfDouble}
import java.util.function.{BiConsumer, DoubleBinaryOperator, DoubleConsumer, DoubleFunction, DoublePredicate, DoubleSupplier, DoubleToIntFunction, DoubleToLongFunction, DoubleUnaryOperator, ObjDoubleConsumer, Supplier}
import scala.scalanative.annotation.stub

/** A sequence of primitive double-valued elements supporting sequential and parallel
 *  aggregate operations.  This is the double primitive specialization of
 *  Stream.
 * 
 *  The following example illustrates an aggregate operation using
 *  Stream and DoubleStream, computing the sum of the weights of the
 *  red widgets:
 * 
 *  
 *      double sum = widgets.stream()
 *                          .filter(w -> w.getColor() == RED)
 *                          .mapToDouble(w -> w.getWeight())
 *                          .sum();
 *  
 * 
 *  See the class documentation for Stream and the package documentation
 *  for java.util.stream for additional
 *  specification of streams, stream operations, stream pipelines, and
 *  parallelism.
 */
trait DoubleStream extends BaseStream[Double, DoubleStream] {

    /** Returns whether all elements of this stream match the provided predicate. */
    @stub
    def allMatch(predicate: DoublePredicate): Boolean = ???

    /** Returns whether any elements of this stream match the provided
     *  predicate.
     */
    @stub
    def anyMatch(predicate: DoublePredicate): Boolean = ???

    /** Returns an OptionalDouble describing the arithmetic
     *  mean of elements of this stream, or an empty optional if this
     *  stream is empty.
     */
    @stub
    def average(): OptionalDouble = ???

    /** Returns a Stream consisting of the elements of this stream,
     *  boxed to Double.
     */
    @stub
    def boxed(): Stream[Double] = ???

    /** Performs a mutable
     *  reduction operation on the elements of this stream.
     */
    @stub
    def collect[R](supplier: Supplier[R], accumulator: ObjDoubleConsumer[R], combiner: BiConsumer[R, R]): R = ???

    /** Returns the count of elements in this stream. */
    @stub
    def count(): Long = ???

    /** Returns a stream consisting of the distinct elements of this stream. */
    @stub
    def distinct(): DoubleStream = ???

    /** Returns a stream consisting of the elements of this stream that match
     *  the given predicate.
     */
    @stub
    def filter(predicate: DoublePredicate): DoubleStream = ???

    /** Returns an OptionalDouble describing some element of the stream,
     *  or an empty OptionalDouble if the stream is empty.
     */
    @stub
    def findAny(): OptionalDouble = ???

    /** Returns an OptionalDouble describing the first element of this
     *  stream, or an empty OptionalDouble if the stream is empty.
     */
    @stub
    def findFirst(): OptionalDouble = ???

    /** Returns a stream consisting of the results of replacing each element of
     *  this stream with the contents of a mapped stream produced by applying
     *  the provided mapping function to each element.
     */
    @stub
    def flatMap(mapper: DoubleFunction[_ <: DoubleStream]): DoubleStream = ???

    /** Performs an action for each element of this stream. */
    @stub
    def forEach(action: DoubleConsumer): Unit = ???

    /** Performs an action for each element of this stream, guaranteeing that
     *  each element is processed in encounter order for streams that have a
     *  defined encounter order.
     */
    @stub
    def forEachOrdered(action: DoubleConsumer): Unit = ???

    /** Returns an iterator for the elements of this stream. */
    @stub
    def iterator(): PrimitiveIterator.OfDouble = ???

    /** Returns a stream consisting of the elements of this stream, truncated
     *  to be no longer than maxSize in length.
     */
    @stub
    def limit(maxSize: Long): DoubleStream = ???

    /** Returns a stream consisting of the results of applying the given
     *  function to the elements of this stream.
     */
    @stub
    def map(mapper: DoubleUnaryOperator): DoubleStream = ???

    /** Returns an IntStream consisting of the results of applying the
     *  given function to the elements of this stream.
     */
    @stub
    def mapToInt(mapper: DoubleToIntFunction): IntStream = ???

    /** Returns a LongStream consisting of the results of applying the
     *  given function to the elements of this stream.
     */
    @stub
    def mapToLong(mapper: DoubleToLongFunction): LongStream = ???

    /** Returns an object-valued Stream consisting of the results of
     *  applying the given function to the elements of this stream.
     */
    @stub
    def mapToObj[U](mapper: DoubleFunction[_ <: U]): Stream[U] = ???

    /** Returns an OptionalDouble describing the maximum element of this
     *  stream, or an empty OptionalDouble if this stream is empty.
     */
    @stub
    def max(): OptionalDouble = ???

    /** Returns an OptionalDouble describing the minimum element of this
     *  stream, or an empty OptionalDouble if this stream is empty.
     */
    @stub
    def min(): OptionalDouble = ???

    /** Returns whether no elements of this stream match the provided predicate. */
    @stub
    def noneMatch(predicate: DoublePredicate): Boolean = ???

    /** Returns an equivalent stream that is parallel. */
    @stub
    def parallel(): DoubleStream = ???

    /** Returns a stream consisting of the elements of this stream, additionally
     *  performing the provided action on each element as elements are consumed
     *  from the resulting stream.
     */
    @stub
    def peek(action: DoubleConsumer): DoubleStream = ???

    /** Performs a reduction on the
     *  elements of this stream, using an
     *  associative accumulation
     *  function, and returns an OptionalDouble describing the reduced
     *  value, if any.
     */
    @stub
    def reduce(op: DoubleBinaryOperator): OptionalDouble = ???

    /** Performs a reduction on the
     *  elements of this stream, using the provided identity value and an
     *  associative
     *  accumulation function, and returns the reduced value.
     */
    @stub
    def reduce(identity: Double, op: DoubleBinaryOperator): Double = ???

    /** Returns an equivalent stream that is sequential. */
    @stub
    def sequential(): DoubleStream = ???

    /** Returns a stream consisting of the remaining elements of this stream
     *  after discarding the first n elements of the stream.
     */
    @stub
    def skip(n: Long): DoubleStream = ???

    /** Returns a stream consisting of the elements of this stream in sorted
     *  order.
     */
    @stub
    def sorted(): DoubleStream = ???

    /** Returns a spliterator for the elements of this stream. */
    @stub
    def spliterator(): Spliterator.OfDouble = ???

    /** Returns the sum of elements in this stream. */
    @stub
    def sum(): Double = ???

    /** Returns a DoubleSummaryStatistics describing various summary data
     *  about the elements of this stream.
     */
    @stub
    def summaryStatistics(): DoubleSummaryStatistics = ???

    /** Returns an array containing the elements of this stream. */
    @stub
    def toArray(): Array[Double] = ???
}

object DoubleStream {
    /** A mutable builder for a DoubleStream. */
    @stub
    val DoubleStream.Builder: trait = ???

    /** Returns a builder for a DoubleStream. */
    @stub
    def builder(): DoubleStream.Builder = ???

    /** Creates a lazily concatenated stream whose elements are all the
     *  elements of the first stream followed by all the elements of the
     *  second stream.
     */
    @stub
    def concat(a: DoubleStream, b: DoubleStream): DoubleStream = ???

    /** Returns an empty sequential DoubleStream. */
    @stub
    def empty(): DoubleStream = ???

    /** Returns an infinite sequential unordered stream where each element is
     *  generated by the provided DoubleSupplier.
     */
    @stub
    def generate(s: DoubleSupplier): DoubleStream = ???

    /** Returns an infinite sequential ordered DoubleStream produced by iterative
     *  application of a function f to an initial element seed,
     *  producing a Stream consisting of seed, f(seed),
     *  f(f(seed)), etc.
     */
    @stub
    def iterate(seed: Double, f: DoubleUnaryOperator): DoubleStream = ???

    /** Returns a sequential ordered stream whose elements are the specified values. */
    @stub
    def of(values: double*): DoubleStream = ???

    /** Returns a sequential DoubleStream containing a single element. */
    @stub
    def of(t: Double): DoubleStream = ???
}
