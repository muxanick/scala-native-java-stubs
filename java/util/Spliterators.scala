package java.util

import java.lang.Object

// Static classes and methods for operating on or creating instances of
// Spliterator and its primitive specializations
// Spliterator.OfInt, Spliterator.OfLong, and
// Spliterator.OfDouble.
final class Spliterators extends Object {
}

object Spliterators {
    @stub
    // An abstract Spliterator.OfDouble that implements
    // trySplit to permit limited parallelism.
    def Spliterators.AbstractDoubleSpliterator: class = ???

    @stub
    // An abstract Spliterator.OfInt that implements trySplit to
    // permit limited parallelism.
    def Spliterators.AbstractIntSpliterator: class = ???

    @stub
    // An abstract Spliterator.OfLong that implements trySplit
    // to permit limited parallelism.
    def Spliterators.AbstractLongSpliterator: class = ???

    @stub
    // Creates an empty Spliterator.OfDouble
    def emptyDoubleSpliterator(): Spliterator.OfDouble = ???

    @stub
    // Creates an empty Spliterator.OfInt
    def emptyIntSpliterator(): Spliterator.OfInt = ???

    @stub
    // Creates an empty Spliterator.OfLong
    def emptyLongSpliterator(): Spliterator.OfLong = ???

    @stub
    // Creates an empty Spliterator
    def Spliterator[T]: [T] = ???

    @stub
    // Creates an PrimitiveIterator.OfDouble from a
    // Spliterator.OfDouble.
    def iterator(spliterator: Spliterator.OfDouble): PrimitiveIterator.OfDouble = ???

    @stub
    // Creates an PrimitiveIterator.OfInt from a
    // Spliterator.OfInt.
    def iterator(spliterator: Spliterator.OfInt): PrimitiveIterator.OfInt = ???

    @stub
    // Creates an PrimitiveIterator.OfLong from a
    // Spliterator.OfLong.
    def iterator(spliterator: Spliterator.OfLong): PrimitiveIterator.OfLong = ???

    @stub
    // Creates an Iterator from a Spliterator.
    def Iterator[T]: [T] = ???

    @stub
    // Creates a Spliterator using the given collection's
    // Collection.iterator() as the source of elements, and
    // reporting its Collection.size() as its initial size.
    def Spliterator[T]: [T] = ???

    @stub
    // Creates a Spliterator.OfDouble covering the elements of a given array,
    // using a customized set of spliterator characteristics.
    def spliterator(array: Array[double], additionalCharacteristics: Int): Spliterator.OfDouble = ???

    @stub
    // Creates a Spliterator.OfDouble covering a range of elements of a
    // given array, using a customized set of spliterator characteristics.
    def spliterator(array: Array[double], fromIndex: Int, toIndex: Int, additionalCharacteristics: Int): Spliterator.OfDouble = ???

    @stub
    // Creates a Spliterator.OfInt covering the elements of a given array,
    // using a customized set of spliterator characteristics.
    def spliterator(array: Array[Int], additionalCharacteristics: Int): Spliterator.OfInt = ???

    @stub
    // Creates a Spliterator.OfInt covering a range of elements of a
    // given array, using a customized set of spliterator characteristics.
    def spliterator(array: Array[Int], fromIndex: Int, toIndex: Int, additionalCharacteristics: Int): Spliterator.OfInt = ???

    @stub
    // Creates a Spliterator using a given Iterator
    // as the source of elements, and with a given initially reported size.
    def Spliterator[T]: [T] = ???

    @stub
    // Creates a Spliterator.OfLong covering the elements of a given array,
    // using a customized set of spliterator characteristics.
    def spliterator(array: Array[Long], additionalCharacteristics: Int): Spliterator.OfLong = ???

    @stub
    // Creates a Spliterator.OfLong covering a range of elements of a
    // given array, using a customized set of spliterator characteristics.
    def spliterator(array: Array[Long], fromIndex: Int, toIndex: Int, additionalCharacteristics: Int): Spliterator.OfLong = ???

    @stub
    // Creates a Spliterator covering the elements of a given array,
    // using a customized set of spliterator characteristics.
    def Spliterator[T]: [T] = ???

    @stub
    // Creates a Spliterator covering a range of elements of a given
    // array, using a customized set of spliterator characteristics.
    def Spliterator[T]: [T] = ???

    @stub
    // Creates a Spliterator.OfDouble using a given
    // DoubleStream.DoubleIterator as the source of elements, and with a
    // given initially reported size.
    def spliterator(iterator: PrimitiveIterator.OfDouble, size: Long, characteristics: Int): Spliterator.OfDouble = ???

    @stub
    // Creates a Spliterator.OfInt using a given
    // IntStream.IntIterator as the source of elements, and with a given
    // initially reported size.
    def spliterator(iterator: PrimitiveIterator.OfInt, size: Long, characteristics: Int): Spliterator.OfInt = ???

    @stub
    // Creates a Spliterator.OfLong using a given
    // LongStream.LongIterator as the source of elements, and with a
    // given initially reported size.
    def spliterator(iterator: PrimitiveIterator.OfLong, size: Long, characteristics: Int): Spliterator.OfLong = ???

    @stub
    // Creates a Spliterator using a given Iterator
    // as the source of elements, with no initial size estimate.
    def Spliterator[T]: [T] = ???

    @stub
    // Creates a Spliterator.OfDouble using a given
    // DoubleStream.DoubleIterator as the source of elements, with no
    // initial size estimate.
    def spliteratorUnknownSize(iterator: PrimitiveIterator.OfDouble, characteristics: Int): Spliterator.OfDouble = ???

    @stub
    // Creates a Spliterator.OfInt using a given
    // IntStream.IntIterator as the source of elements, with no initial
    // size estimate.
    def spliteratorUnknownSize(iterator: PrimitiveIterator.OfInt, characteristics: Int): Spliterator.OfInt = ???
}
