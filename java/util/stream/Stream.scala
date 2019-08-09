package java.util.stream

import java.lang.Object
import java.util.{Comparator, Optional}
import java.util.function.{BiConsumer, BiFunction, BinaryOperator, Consumer, Function, IntFunction, Predicate, Supplier, ToDoubleFunction, ToIntFunction, ToLongFunction, UnaryOperator}
import scala.scalanative.annotation.stub

/** A sequence of elements supporting sequential and parallel aggregate
 *  operations.  The following example illustrates an aggregate operation using
 *  Stream and IntStream:
 * 
 *  
 *      int sum = widgets.stream()
 *                       .filter(w -> w.getColor() == RED)
 *                       .mapToInt(w -> w.getWeight())
 *                       .sum();
 *  
 * 
 *  In this example, widgets is a Collection<Widget>.  We create
 *  a stream of Widget objects via Collection.stream(),
 *  filter it to produce a stream containing only the red widgets, and then
 *  transform it into a stream of int values representing the weight of
 *  each red widget. Then this stream is summed to produce a total weight.
 * 
 *  In addition to Stream, which is a stream of object references,
 *  there are primitive specializations for IntStream, LongStream,
 *  and DoubleStream, all of which are referred to as "streams" and
 *  conform to the characteristics and restrictions described here.
 * 
 *  To perform a computation, stream
 *  operations are composed into a
 *  stream pipeline.  A stream pipeline consists of a source (which
 *  might be an array, a collection, a generator function, an I/O channel,
 *  etc), zero or more intermediate operations (which transform a
 *  stream into another stream, such as filter(Predicate)), and a
 *  terminal operation (which produces a result or side-effect, such
 *  as count() or forEach(Consumer)).
 *  Streams are lazy; computation on the source data is only performed when the
 *  terminal operation is initiated, and source elements are consumed only
 *  as needed.
 * 
 *  Collections and streams, while bearing some superficial similarities,
 *  have different goals.  Collections are primarily concerned with the efficient
 *  management of, and access to, their elements.  By contrast, streams do not
 *  provide a means to directly access or manipulate their elements, and are
 *  instead concerned with declaratively describing their source and the
 *  computational operations which will be performed in aggregate on that source.
 *  However, if the provided stream operations do not offer the desired
 *  functionality, the BaseStream.iterator() and BaseStream.spliterator() operations
 *  can be used to perform a controlled traversal.
 * 
 *  A stream pipeline, like the "widgets" example above, can be viewed as
 *  a query on the stream source.  Unless the source was explicitly
 *  designed for concurrent modification (such as a ConcurrentHashMap),
 *  unpredictable or erroneous behavior may result from modifying the stream
 *  source while it is being queried.
 * 
 *  Most stream operations accept parameters that describe user-specified
 *  behavior, such as the lambda expression w -> w.getWeight() passed to
 *  mapToInt in the example above.  To preserve correct behavior,
 *  these behavioral parameters:
 *  
 *  must be non-interfering
 *  (they do not modify the stream source); and
 *  in most cases must be stateless
 *  (their result should not depend on any state that might change during execution
 *  of the stream pipeline).
 *  
 * 
 *  Such parameters are always instances of a
 *  functional interface such
 *  as Function, and are often lambda expressions or
 *  method references.  Unless otherwise specified these parameters must be
 *  non-null.
 * 
 *  A stream should be operated on (invoking an intermediate or terminal stream
 *  operation) only once.  This rules out, for example, "forked" streams, where
 *  the same source feeds two or more pipelines, or multiple traversals of the
 *  same stream.  A stream implementation may throw IllegalStateException
 *  if it detects that the stream is being reused. However, since some stream
 *  operations may return their receiver rather than a new stream object, it may
 *  not be possible to detect reuse in all cases.
 * 
 *  Streams have a BaseStream.close() method and implement AutoCloseable,
 *  but nearly all stream instances do not actually need to be closed after use.
 *  Generally, only streams whose source is an IO channel (such as those returned
 *  by Files.lines(Path, Charset)) will require closing.  Most streams
 *  are backed by collections, arrays, or generating functions, which require no
 *  special resource management.  (If a stream does require closing, it can be
 *  declared as a resource in a try-with-resources statement.)
 * 
 *  Stream pipelines may execute either sequentially or in
 *  parallel.  This
 *  execution mode is a property of the stream.  Streams are created
 *  with an initial choice of sequential or parallel execution.  (For example,
 *  Collection.stream() creates a sequential stream,
 *  and Collection.parallelStream() creates
 *  a parallel one.)  This choice of execution mode may be modified by the
 *  BaseStream.sequential() or BaseStream.parallel() methods, and may be queried with
 *  the BaseStream.isParallel() method.
 */
trait Stream[T] extends BaseStream[T, Stream[T]] {

    /** Returns whether all elements of this stream match the provided predicate. */
    @stub
    def allMatch(predicate: Predicate[_ >: T]): Boolean = ???

    /** Returns whether any elements of this stream match the provided
     *  predicate.
     */
    @stub
    def anyMatch(predicate: Predicate[_ >: T]): Boolean = ???

    /** Performs a mutable
     *  reduction operation on the elements of this stream using a
     *  Collector.
     */
    @stub
    def collect[R, A](collector: Collector[_ >: T, A, R]): R = ???

    /** Performs a mutable
     *  reduction operation on the elements of this stream.
     */
    @stub
    def collect[R](supplier: Supplier[R], accumulator: BiConsumer[R, _ >: T], combiner: BiConsumer[R, R]): R = ???

    /** Returns the count of elements in this stream. */
    @stub
    def count(): Long = ???

    /** Returns a stream consisting of the distinct elements (according to
     *  Object.equals(Object)) of this stream.
     */
    @stub
    def distinct(): Stream[T] = ???

    /** Returns a stream consisting of the elements of this stream that match
     *  the given predicate.
     */
    @stub
    def filter(predicate: Predicate[_ >: T]): Stream[T] = ???

    /** Returns an Optional describing some element of the stream, or an
     *  empty Optional if the stream is empty.
     */
    @stub
    def findAny(): Optional[T] = ???

    /** Returns an Optional describing the first element of this stream,
     *  or an empty Optional if the stream is empty.
     */
    @stub
    def findFirst(): Optional[T] = ???

    /** Returns a stream consisting of the results of replacing each element of
     *  this stream with the contents of a mapped stream produced by applying
     *  the provided mapping function to each element.
     */
    @stub
    def flatMap[R](mapper: Function[_ >: T, _ <: Stream[_ <: R]]): Stream[R] = ???

    /** Returns an DoubleStream consisting of the results of replacing
     *  each element of this stream with the contents of a mapped stream produced
     *  by applying the provided mapping function to each element.
     */
    @stub
    def flatMapToDouble(mapper: Function[_ >: T, _ <: DoubleStream]): DoubleStream = ???

    /** Returns an IntStream consisting of the results of replacing each
     *  element of this stream with the contents of a mapped stream produced by
     *  applying the provided mapping function to each element.
     */
    @stub
    def flatMapToInt(mapper: Function[_ >: T, _ <: IntStream]): IntStream = ???

    /** Returns an LongStream consisting of the results of replacing each
     *  element of this stream with the contents of a mapped stream produced by
     *  applying the provided mapping function to each element.
     */
    @stub
    def flatMapToLong(mapper: Function[_ >: T, _ <: LongStream]): LongStream = ???

    /** Performs an action for each element of this stream. */
    @stub
    def forEach(action: Consumer[_ >: T]): Unit = ???

    /** Performs an action for each element of this stream, in the encounter
     *  order of the stream if the stream has a defined encounter order.
     */
    @stub
    def forEachOrdered(action: Consumer[_ >: T]): Unit = ???

    /** Returns a stream consisting of the elements of this stream, truncated
     *  to be no longer than maxSize in length.
     */
    @stub
    def limit(maxSize: Long): Stream[T] = ???

    /** Returns a stream consisting of the results of applying the given
     *  function to the elements of this stream.
     */
    @stub
    def map[R](mapper: Function[_ >: T, _ <: R]): Stream[R] = ???

    /** Returns a DoubleStream consisting of the results of applying the
     *  given function to the elements of this stream.
     */
    @stub
    def mapToDouble(mapper: ToDoubleFunction[_ >: T]): DoubleStream = ???

    /** Returns an IntStream consisting of the results of applying the
     *  given function to the elements of this stream.
     */
    @stub
    def mapToInt(mapper: ToIntFunction[_ >: T]): IntStream = ???

    /** Returns a LongStream consisting of the results of applying the
     *  given function to the elements of this stream.
     */
    @stub
    def mapToLong(mapper: ToLongFunction[_ >: T]): LongStream = ???

    /** Returns the maximum element of this stream according to the provided
     *  Comparator.
     */
    @stub
    def max(comparator: Comparator[_ >: T]): Optional[T] = ???

    /** Returns the minimum element of this stream according to the provided
     *  Comparator.
     */
    @stub
    def min(comparator: Comparator[_ >: T]): Optional[T] = ???

    /** Returns whether no elements of this stream match the provided predicate. */
    @stub
    def noneMatch(predicate: Predicate[_ >: T]): Boolean = ???

    /** Returns a stream consisting of the elements of this stream, additionally
     *  performing the provided action on each element as elements are consumed
     *  from the resulting stream.
     */
    @stub
    def peek(action: Consumer[_ >: T]): Stream[T] = ???

    /** Performs a reduction on the
     *  elements of this stream, using an
     *  associative accumulation
     *  function, and returns an Optional describing the reduced value,
     *  if any.
     */
    @stub
    def reduce(accumulator: BinaryOperator[T]): Optional[T] = ???

    /** Performs a reduction on the
     *  elements of this stream, using the provided identity value and an
     *  associative
     *  accumulation function, and returns the reduced value.
     */
    @stub
    def reduce(identity: T, accumulator: BinaryOperator[T]): T = ???

    /** Performs a reduction on the
     *  elements of this stream, using the provided identity, accumulation and
     *  combining functions.
     */
    @stub
    def reduce[U](identity: U, accumulator: BiFunction[U, _ >: T, U], combiner: BinaryOperator[U]): U = ???

    /** Returns a stream consisting of the remaining elements of this stream
     *  after discarding the first n elements of the stream.
     */
    @stub
    def skip(n: Long): Stream[T] = ???

    /** Returns a stream consisting of the elements of this stream, sorted
     *  according to natural order.
     */
    @stub
    def sorted(): Stream[T] = ???

    /** Returns a stream consisting of the elements of this stream, sorted
     *  according to the provided Comparator.
     */
    @stub
    def sorted(comparator: Comparator[_ >: T]): Stream[T] = ???

    /** Returns an array containing the elements of this stream. */
    @stub
    def toArray(): Array[Object] = ???

    /** Returns an array containing the elements of this stream, using the
     *  provided generator function to allocate the returned array, as
     *  well as any additional arrays that might be required for a partitioned
     *  execution or for resizing.
     */
    @stub
    def toArray[A](generator: IntFunction[Array[A]]): Array[A] = ???
}

object Stream {
    /** A mutable builder for a Stream. */
    @stub
    val Stream.Builder[T]: trait = ???

    /** Returns a builder for a Stream. */
    @stub
    def builder[T](): Stream.Builder[T] = ???

    /** Creates a lazily concatenated stream whose elements are all the
     *  elements of the first stream followed by all the elements of the
     *  second stream.
     */
    @stub
    def concat[T](a: Stream[_ <: T], b: Stream[_ <: T]): Stream[T] = ???

    /** Returns an empty sequential Stream. */
    @stub
    def empty[T](): Stream[T] = ???

    /** Returns an infinite sequential unordered stream where each element is
     *  generated by the provided Supplier.
     */
    @stub
    def generate[T](s: Supplier[T]): Stream[T] = ???

    /** Returns an infinite sequential ordered Stream produced by iterative
     *  application of a function f to an initial element seed,
     *  producing a Stream consisting of seed, f(seed),
     *  f(f(seed)), etc.
     */
    @stub
    def iterate[T](seed: T, f: UnaryOperator[T]): Stream[T] = ???

    /** Returns a sequential ordered stream whose elements are the specified values. */
    @stub
    def of[T](values: T*): Stream[T] = ???

    /** Returns a sequential Stream containing a single element. */
    @stub
    def of[T](t: T): Stream[T] = ???
}
