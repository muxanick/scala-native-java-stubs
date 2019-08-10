package java.util

import java.lang.{Double, Integer, Long}
import java.util.function.{Consumer, DoubleConsumer, IntConsumer, LongConsumer}
import scala.scalanative.annotation.stub

/** An object for traversing and partitioning elements of a source.  The source
 *  of elements covered by a Spliterator could be, for example, an array, a
 *  Collection, an IO channel, or a generator function.
 * 
 *  A Spliterator may traverse elements individually (tryAdvance()) or sequentially in bulk
 *  (forEachRemaining()).
 * 
 *  A Spliterator may also partition off some of its elements (using
 *  trySplit()) as another Spliterator, to be used in
 *  possibly-parallel operations.  Operations using a Spliterator that
 *  cannot split, or does so in a highly imbalanced or inefficient
 *  manner, are unlikely to benefit from parallelism.  Traversal
 *  and splitting exhaust elements; each Spliterator is useful for only a single
 *  bulk computation.
 * 
 *  A Spliterator also reports a set of characteristics() of its
 *  structure, source, and elements from among ORDERED,
 *  DISTINCT, SORTED, SIZED, NONNULL,
 *  IMMUTABLE, CONCURRENT, and SUBSIZED. These may
 *  be employed by Spliterator clients to control, specialize or simplify
 *  computation.  For example, a Spliterator for a Collection would
 *  report SIZED, a Spliterator for a Set would report
 *  DISTINCT, and a Spliterator for a SortedSet would also
 *  report SORTED.  Characteristics are reported as a simple unioned bit
 *  set.
 * 
 *  Some characteristics additionally constrain method behavior; for example if
 *  ORDERED, traversal methods must conform to their documented ordering.
 *  New characteristics may be defined in the future, so implementors should not
 *  assign meanings to unlisted values.
 * 
 *  A Spliterator that does not report IMMUTABLE or
 *  CONCURRENT is expected to have a documented policy concerning:
 *  when the spliterator binds to the element source; and detection of
 *  structural interference of the element source detected after binding.  A
 *  late-binding Spliterator binds to the source of elements at the
 *  point of first traversal, first split, or first query for estimated size,
 *  rather than at the time the Spliterator is created.  A Spliterator that is
 *  not late-binding binds to the source of elements at the point of
 *  construction or first invocation of any method.  Modifications made to the
 *  source prior to binding are reflected when the Spliterator is traversed.
 *  After binding a Spliterator should, on a best-effort basis, throw
 *  ConcurrentModificationException if structural interference is
 *  detected.  Spliterators that do this are called fail-fast.  The
 *  bulk traversal method (forEachRemaining()) of a
 *  Spliterator may optimize traversal and check for structural interference
 *  after all elements have been traversed, rather than checking per-element and
 *  failing immediately.
 * 
 *  Spliterators can provide an estimate of the number of remaining elements
 *  via the estimateSize() method.  Ideally, as reflected in characteristic
 *  SIZED, this value corresponds exactly to the number of elements
 *  that would be encountered in a successful traversal.  However, even when not
 *  exactly known, an estimated value value may still be useful to operations
 *  being performed on the source, such as helping to determine whether it is
 *  preferable to split further or traverse the remaining elements sequentially.
 * 
 *  Despite their obvious utility in parallel algorithms, spliterators are not
 *  expected to be thread-safe; instead, implementations of parallel algorithms
 *  using spliterators should ensure that the spliterator is only used by one
 *  thread at a time.  This is generally easy to attain via serial
 *  thread-confinement, which often is a natural consequence of typical
 *  parallel algorithms that work by recursive decomposition.  A thread calling
 *  trySplit() may hand over the returned Spliterator to another thread,
 *  which in turn may traverse or further split that Spliterator.  The behaviour
 *  of splitting and traversal is undefined if two or more threads operate
 *  concurrently on the same spliterator.  If the original thread hands a
 *  spliterator off to another thread for processing, it is best if that handoff
 *  occurs before any elements are consumed with tryAdvance(), as certain guarantees (such as the accuracy of
 *  estimateSize() for SIZED spliterators) are only valid before
 *  traversal has begun.
 * 
 *  Primitive subtype specializations of Spliterator are provided for
 *  int, long, and double values.
 *  The subtype default implementations of
 *  tryAdvance(java.util.function.Consumer)
 *  and forEachRemaining(java.util.function.Consumer) box
 *  primitive values to instances of their corresponding wrapper class.  Such
 *  boxing may undermine any performance advantages gained by using the primitive
 *  specializations.  To avoid boxing, the corresponding primitive-based methods
 *  should be used.  For example,
 *  Spliterator.OfInt.tryAdvance(java.util.function.IntConsumer)
 *  and Spliterator.OfInt.forEachRemaining(java.util.function.IntConsumer)
 *  should be used in preference to
 *  Spliterator.OfInt.tryAdvance(java.util.function.Consumer) and
 *  Spliterator.OfInt.forEachRemaining(java.util.function.Consumer).
 *  Traversal of primitive values using boxing-based methods
 *  tryAdvance() and
 *  forEachRemaining()
 *  does not affect the order in which the values, transformed to boxed values,
 *  are encountered.
 */
trait Spliterator[T] {

    /** Returns a set of characteristics of this Spliterator and its
     *  elements.
     */
    @stub
    def characteristics(): Int = ???

    /** Returns an estimate of the number of elements that would be
     *  encountered by a forEachRemaining(java.util.function.Consumer<? super T>) traversal, or returns Long.MAX_VALUE if infinite, unknown, or too expensive to compute.
     */
    @stub
    def estimateSize(): Long = ???

    /** Performs the given action for each remaining element, sequentially in
     *  the current thread, until all elements have been processed or the action
     *  throws an exception.
     */
    @stub
    def forEachRemaining(action: Consumer[_ >: T]): Unit = ???

    /** If this Spliterator's source is SORTED by a Comparator,
     *  returns that Comparator.
     */
    @stub
    def getComparator(): Comparator[_ >: T] = ???

    /** Convenience method that returns estimateSize() if this
     *  Spliterator is SIZED, else -1.
     */
    @stub
    def getExactSizeIfKnown(): Long = ???

    /** Returns true if this Spliterator's characteristics() contain all of the given characteristics. */
    @stub
    def hasCharacteristics(characteristics: Int): Boolean = ???

    /** If a remaining element exists, performs the given action on it,
     *  returning true; else returns false.
     */
    @stub
    def tryAdvance(action: Consumer[_ >: T]): Boolean = ???

    /** If this spliterator can be partitioned, returns a Spliterator
     *  covering elements, that will, upon return from this method, not
     *  be covered by this Spliterator.
     */
    @stub
    def trySplit(): Spliterator[T] = ???
}

object Spliterator {
    /** A Spliterator specialized for double values. */
    trait OfDouble extends Spliterator.OfPrimitive[Double, DoubleConsumer, Spliterator.OfDouble] {

        /** Performs the given action for each remaining element, sequentially in
         *  the current thread, until all elements have been processed or the action
         *  throws an exception.
         */
        @stub
        def forEachRemaining(action: Consumer[_ >: Double]): Unit = ???

        /** Performs the given action for each remaining element, sequentially in
         *  the current thread, until all elements have been processed or the
         *  action throws an exception.
         */
        @stub
        def forEachRemaining(action: DoubleConsumer): Unit = ???

        /** If a remaining element exists, performs the given action on it,
         *  returning true; else returns false.
         */
        @stub
        def tryAdvance(action: Consumer[_ >: Double]): Boolean = ???

        /** If a remaining element exists, performs the given action on it,
         *  returning true; else returns false.
         */
        @stub
        def tryAdvance(action: DoubleConsumer): Boolean = ???

        /** If this spliterator can be partitioned, returns a Spliterator
         *  covering elements, that will, upon return from this method, not
         *  be covered by this Spliterator.
         */
        @stub
        def trySplit(): OfDouble = ???
    }


    /** A Spliterator specialized for int values. */
    trait OfInt extends Spliterator.OfPrimitive[Integer, IntConsumer, Spliterator.OfInt] {

        /** Performs the given action for each remaining element, sequentially in
         *  the current thread, until all elements have been processed or the action
         *  throws an exception.
         */
        @stub
        def forEachRemaining(action: Consumer[_ >: Integer]): Unit = ???

        /** Performs the given action for each remaining element, sequentially in
         *  the current thread, until all elements have been processed or the
         *  action throws an exception.
         */
        @stub
        def forEachRemaining(action: IntConsumer): Unit = ???

        /** If a remaining element exists, performs the given action on it,
         *  returning true; else returns false.
         */
        @stub
        def tryAdvance(action: Consumer[_ >: Integer]): Boolean = ???

        /** If a remaining element exists, performs the given action on it,
         *  returning true; else returns false.
         */
        @stub
        def tryAdvance(action: IntConsumer): Boolean = ???

        /** If this spliterator can be partitioned, returns a Spliterator
         *  covering elements, that will, upon return from this method, not
         *  be covered by this Spliterator.
         */
        @stub
        def trySplit(): OfInt = ???
    }


    /** A Spliterator specialized for long values. */
    trait OfLong extends Spliterator.OfPrimitive[Long, LongConsumer, Spliterator.OfLong] {

        /** Performs the given action for each remaining element, sequentially in
         *  the current thread, until all elements have been processed or the action
         *  throws an exception.
         */
        @stub
        def forEachRemaining(action: Consumer[_ >: Long]): Unit = ???

        /** Performs the given action for each remaining element, sequentially in
         *  the current thread, until all elements have been processed or the
         *  action throws an exception.
         */
        @stub
        def forEachRemaining(action: LongConsumer): Unit = ???

        /** If a remaining element exists, performs the given action on it,
         *  returning true; else returns false.
         */
        @stub
        def tryAdvance(action: Consumer[_ >: Long]): Boolean = ???

        /** If a remaining element exists, performs the given action on it,
         *  returning true; else returns false.
         */
        @stub
        def tryAdvance(action: LongConsumer): Boolean = ???

        /** If this spliterator can be partitioned, returns a Spliterator
         *  covering elements, that will, upon return from this method, not
         *  be covered by this Spliterator.
         */
        @stub
        def trySplit(): OfLong = ???
    }


    /** A Spliterator specialized for primitive values. */
    trait OfPrimitive[T, T_CONS, T_SPLITR <: OfPrimitive[T, T_CONS, T_SPLITR]] extends Spliterator[T] {

        /** Performs the given action for each remaining element, sequentially in
         *  the current thread, until all elements have been processed or the
         *  action throws an exception.
         */
        @stub
        def forEachRemaining(action: T_CONS): Unit = ???

        /** If a remaining element exists, performs the given action on it,
         *  returning true; else returns false.
         */
        @stub
        def tryAdvance(action: T_CONS): Boolean = ???

        /** If this spliterator can be partitioned, returns a Spliterator
         *  covering elements, that will, upon return from this method, not
         *  be covered by this Spliterator.
         */
        @stub
        def trySplit(): T_SPLITR = ???
    }


    /** Characteristic value signifying that the element source may be safely
     *  concurrently modified (allowing additions, replacements, and/or removals)
     *  by multiple threads without external synchronization.
     */
    @stub
    val CONCURRENT: Int = ???

    /** Characteristic value signifying that, for each pair of
     *  encountered elements x, y, !x.equals(y).
     */
    @stub
    val DISTINCT: Int = ???

    /** Characteristic value signifying that the element source cannot be
     *  structurally modified; that is, elements cannot be added, replaced, or
     *  removed, so such changes cannot occur during traversal.
     */
    @stub
    val IMMUTABLE: Int = ???

    /** Characteristic value signifying that the source guarantees that
     *  encountered elements will not be null.
     */
    @stub
    val NONNULL: Int = ???

    /** Characteristic value signifying that an encounter order is defined for
     *  elements.
     */
    @stub
    val ORDERED: Int = ???

    /** Characteristic value signifying that the value returned from
     *  estimateSize() prior to traversal or splitting represents a
     *  finite size that, in the absence of structural source modification,
     *  represents an exact count of the number of elements that would be
     *  encountered by a complete traversal.
     */
    @stub
    val SIZED: Int = ???

    /** Characteristic value signifying that encounter order follows a defined
     *  sort order.
     */
    @stub
    val SORTED: Int = ???

    /** Characteristic value signifying that all Spliterators resulting from
     *  trySplit() will be both SIZED and SUBSIZED.
     */
    @stub
    val SUBSIZED: Int = ???
}
