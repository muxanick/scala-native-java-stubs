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
     */
    type AbstractDoubleSpliterator = Spliterators_AbstractDoubleSpliterator

    /** An abstract Spliterator.OfInt that implements trySplit to
     *  permit limited parallelism.
     */
    type AbstractIntSpliterator = Spliterators_AbstractIntSpliterator

    /** An abstract Spliterator.OfLong that implements trySplit
     *  to permit limited parallelism.
     */
    type AbstractLongSpliterator = Spliterators_AbstractLongSpliterator

    /** An abstract Spliterator that implements trySplit to
     *  permit limited parallelism.
     */
    type AbstractSpliterator[T] = Spliterators_AbstractSpliterator[T]

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
