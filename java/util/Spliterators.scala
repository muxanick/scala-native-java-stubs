package java.util

import java.lang.Object
import scala.scalanative.annotation.stub

/** Static classes and methods for operating on or creating instances of
 *  Spliterator and its primitive specializations
 *  Spliterator.OfInt, Spliterator.OfLong, and
 *  Spliterator.OfDouble.
 */
final class Spliterators extends Object {
}

object Spliterators {
    /** An abstract Spliterator.OfDouble that implements
     *  trySplit to permit limited parallelism.
     * 
     *  To implement a spliterator an extending class need only
     *  implement Spliterator.OfDouble.tryAdvance(java.util.function.DoubleConsumer)
     *  tryAdvance}.  The extending class should override
     *  Spliterator.OfDouble.forEachRemaining(java.util.function.DoubleConsumer) forEach} if
     *  it can provide a more performant implementation.
     */
    abstract object AbstractDoubleSpliterator extends Object with Spliterator.OfDouble {

        /** Creates a spliterator reporting the given estimated size and
         *  characteristics.
         */
        @stub
        protected def apply(est: Long, additionalCharacteristics: Int) = ???

        /** Returns a set of characteristics of this Spliterator and its
         *  elements.
         */
        @stub
        def characteristics(): Int = ???

        /** Returns an estimate of the number of elements that would be
         *  encountered by a Spliterator.forEachRemaining(java.util.function.Consumer<? super T>) traversal, or returns Long.MAX_VALUE if infinite, unknown, or too expensive to compute.
         */
        @stub
        def estimateSize(): Long = ???

        /** If this spliterator can be partitioned, returns a Spliterator
         *  covering elements, that will, upon return from this method, not
         *  be covered by this Spliterator.
         */
        @stub
        def trySplit(): Spliterator.OfDouble = ???
    }


    /** An abstract Spliterator.OfInt that implements trySplit to
     *  permit limited parallelism.
     * 
     *  To implement a spliterator an extending class need only
     *  implement Spliterator.OfInt.tryAdvance(java.util.function.IntConsumer)
     *  tryAdvance}.  The extending class should override
     *  Spliterator.OfInt.forEachRemaining(java.util.function.IntConsumer) forEach} if it
     *  can provide a more performant implementation.
     */
    abstract object AbstractIntSpliterator extends Object with Spliterator.OfInt {

        /** Creates a spliterator reporting the given estimated size and
         *  characteristics.
         */
        @stub
        protected def apply(est: Long, additionalCharacteristics: Int) = ???

        /** Returns a set of characteristics of this Spliterator and its
         *  elements.
         */
        @stub
        def characteristics(): Int = ???

        /** Returns an estimate of the number of elements that would be
         *  encountered by a Spliterator.forEachRemaining(java.util.function.Consumer<? super T>) traversal, or returns Long.MAX_VALUE if infinite, unknown, or too expensive to compute.
         */
        @stub
        def estimateSize(): Long = ???

        /** If this spliterator can be partitioned, returns a Spliterator
         *  covering elements, that will, upon return from this method, not
         *  be covered by this Spliterator.
         */
        @stub
        def trySplit(): Spliterator.OfInt = ???
    }


    /** An abstract Spliterator.OfLong that implements trySplit
     *  to permit limited parallelism.
     * 
     *  To implement a spliterator an extending class need only
     *  implement Spliterator.OfLong.tryAdvance(java.util.function.LongConsumer)
     *  tryAdvance}.  The extending class should override
     *  Spliterator.OfLong.forEachRemaining(java.util.function.LongConsumer) forEach} if it
     *  can provide a more performant implementation.
     */
    abstract object AbstractLongSpliterator extends Object with Spliterator.OfLong {

        /** Creates a spliterator reporting the given estimated size and
         *  characteristics.
         */
        @stub
        protected def apply(est: Long, additionalCharacteristics: Int) = ???

        /** Returns a set of characteristics of this Spliterator and its
         *  elements.
         */
        @stub
        def characteristics(): Int = ???

        /** Returns an estimate of the number of elements that would be
         *  encountered by a Spliterator.forEachRemaining(java.util.function.Consumer<? super T>) traversal, or returns Long.MAX_VALUE if infinite, unknown, or too expensive to compute.
         */
        @stub
        def estimateSize(): Long = ???

        /** If this spliterator can be partitioned, returns a Spliterator
         *  covering elements, that will, upon return from this method, not
         *  be covered by this Spliterator.
         */
        @stub
        def trySplit(): Spliterator.OfLong = ???
    }


    /** An abstract Spliterator that implements trySplit to
     *  permit limited parallelism.
     * 
     *  An extending class need only
     *  implement tryAdvance.
     *  The extending class should override
     *  forEach if it can
     *  provide a more performant implementation.
     */
    abstract object AbstractSpliterator[T] extends Object with Spliterator[T] {

        /** Creates a spliterator reporting the given estimated size and
         *  additionalCharacteristics.
         */
        @stub
        protected def apply(est: Long, additionalCharacteristics: Int) = ???

        /** Returns a set of characteristics of this Spliterator and its
         *  elements.
         */
        @stub
        def characteristics(): Int = ???

        /** Returns an estimate of the number of elements that would be
         *  encountered by a Spliterator.forEachRemaining(java.util.function.Consumer<? super T>) traversal, or returns Long.MAX_VALUE if infinite, unknown, or too expensive to compute.
         */
        @stub
        def estimateSize(): Long = ???

        /** If this spliterator can be partitioned, returns a Spliterator
         *  covering elements, that will, upon return from this method, not
         *  be covered by this Spliterator.
         */
        @stub
        def trySplit(): Spliterator[T] = ???
    }


    /** Creates an empty Spliterator.OfDouble */
    @stub
    def emptyDoubleSpliterator(): Spliterator.OfDouble = ???

    /** Creates an empty Spliterator.OfInt */
    @stub
    def emptyIntSpliterator(): Spliterator.OfInt = ???

    /** Creates an empty Spliterator.OfLong */
    @stub
    def emptyLongSpliterator(): Spliterator.OfLong = ???

    /** Creates an empty Spliterator */
    @stub
    def emptySpliterator[T](): Spliterator[T] = ???

    /** Creates an PrimitiveIterator.OfDouble from a
     *  Spliterator.OfDouble.
     */
    @stub
    def iterator(spliterator: Spliterator.OfDouble): PrimitiveIterator.OfDouble = ???

    /** Creates an PrimitiveIterator.OfInt from a
     *  Spliterator.OfInt.
     */
    @stub
    def iterator(spliterator: Spliterator.OfInt): PrimitiveIterator.OfInt = ???

    /** Creates an PrimitiveIterator.OfLong from a
     *  Spliterator.OfLong.
     */
    @stub
    def iterator(spliterator: Spliterator.OfLong): PrimitiveIterator.OfLong = ???

    /** Creates an Iterator from a Spliterator. */
    @stub
    def iterator[T](spliterator: Spliterator[_ <: T]): Iterator[T] = ???

    /** Creates a Spliterator using the given collection's
     *  Collection.iterator() as the source of elements, and
     *  reporting its Collection.size() as its initial size.
     */
    @stub
    def spliterator[T](c: Collection[_ <: T], characteristics: Int): Spliterator[T] = ???

    /** Creates a Spliterator.OfDouble covering the elements of a given array,
     *  using a customized set of spliterator characteristics.
     */
    @stub
    def spliterator(array: Array[Double], additionalCharacteristics: Int): Spliterator.OfDouble = ???

    /** Creates a Spliterator.OfDouble covering a range of elements of a
     *  given array, using a customized set of spliterator characteristics.
     */
    @stub
    def spliterator(array: Array[Double], fromIndex: Int, toIndex: Int, additionalCharacteristics: Int): Spliterator.OfDouble = ???

    /** Creates a Spliterator.OfInt covering the elements of a given array,
     *  using a customized set of spliterator characteristics.
     */
    @stub
    def spliterator(array: Array[Int], additionalCharacteristics: Int): Spliterator.OfInt = ???

    /** Creates a Spliterator.OfInt covering a range of elements of a
     *  given array, using a customized set of spliterator characteristics.
     */
    @stub
    def spliterator(array: Array[Int], fromIndex: Int, toIndex: Int, additionalCharacteristics: Int): Spliterator.OfInt = ???

    /** Creates a Spliterator using a given Iterator
     *  as the source of elements, and with a given initially reported size.
     */
    @stub
    def spliterator[T](iterator: Iterator[_ <: T], size: Long, characteristics: Int): Spliterator[T] = ???

    /** Creates a Spliterator.OfLong covering the elements of a given array,
     *  using a customized set of spliterator characteristics.
     */
    @stub
    def spliterator(array: Array[Long], additionalCharacteristics: Int): Spliterator.OfLong = ???

    /** Creates a Spliterator.OfLong covering a range of elements of a
     *  given array, using a customized set of spliterator characteristics.
     */
    @stub
    def spliterator(array: Array[Long], fromIndex: Int, toIndex: Int, additionalCharacteristics: Int): Spliterator.OfLong = ???

    /** Creates a Spliterator covering the elements of a given array,
     *  using a customized set of spliterator characteristics.
     */
    @stub
    def spliterator[T](array: Array[Object], additionalCharacteristics: Int): Spliterator[T] = ???

    /** Creates a Spliterator covering a range of elements of a given
     *  array, using a customized set of spliterator characteristics.
     */
    @stub
    def spliterator[T](array: Array[Object], fromIndex: Int, toIndex: Int, additionalCharacteristics: Int): Spliterator[T] = ???

    /** Creates a Spliterator.OfDouble using a given
     *  DoubleStream.DoubleIterator as the source of elements, and with a
     *  given initially reported size.
     */
    @stub
    def spliterator(iterator: PrimitiveIterator.OfDouble, size: Long, characteristics: Int): Spliterator.OfDouble = ???

    /** Creates a Spliterator.OfInt using a given
     *  IntStream.IntIterator as the source of elements, and with a given
     *  initially reported size.
     */
    @stub
    def spliterator(iterator: PrimitiveIterator.OfInt, size: Long, characteristics: Int): Spliterator.OfInt = ???

    /** Creates a Spliterator.OfLong using a given
     *  LongStream.LongIterator as the source of elements, and with a
     *  given initially reported size.
     */
    @stub
    def spliterator(iterator: PrimitiveIterator.OfLong, size: Long, characteristics: Int): Spliterator.OfLong = ???

    /** Creates a Spliterator using a given Iterator
     *  as the source of elements, with no initial size estimate.
     */
    @stub
    def spliteratorUnknownSize[T](iterator: Iterator[_ <: T], characteristics: Int): Spliterator[T] = ???

    /** Creates a Spliterator.OfDouble using a given
     *  DoubleStream.DoubleIterator as the source of elements, with no
     *  initial size estimate.
     */
    @stub
    def spliteratorUnknownSize(iterator: PrimitiveIterator.OfDouble, characteristics: Int): Spliterator.OfDouble = ???

    /** Creates a Spliterator.OfInt using a given
     *  IntStream.IntIterator as the source of elements, with no initial
     *  size estimate.
     */
    @stub
    def spliteratorUnknownSize(iterator: PrimitiveIterator.OfInt, characteristics: Int): Spliterator.OfInt = ???

    /** Creates a Spliterator.OfLong using a given
     *  LongStream.LongIterator as the source of elements, with no
     *  initial size estimate.
     */
    @stub
    def spliteratorUnknownSize(iterator: PrimitiveIterator.OfLong, characteristics: Int): Spliterator.OfLong = ???
}
