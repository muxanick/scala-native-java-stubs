package java.util

import java.lang.{Class, Comparable, Object, String}
import java.util.function.{BinaryOperator, DoubleBinaryOperator, IntBinaryOperator, IntFunction, IntToDoubleFunction, IntToLongFunction, IntUnaryOperator, LongBinaryOperator}
import java.util.stream.{DoubleStream, IntStream, LongStream, Stream}
import scala.scalanative.annotation.stub

/** This class contains various methods for manipulating arrays (such as
 *  sorting and searching). This class also contains a static factory
 *  that allows arrays to be viewed as lists.
 * 
 *  The methods in this class all throw a NullPointerException,
 *  if the specified array reference is null, except where noted.
 * 
 *  The documentation for the methods contained in this class includes
 *  briefs description of the implementations. Such descriptions should
 *  be regarded as implementation notes, rather than parts of the
 *  specification. Implementors should feel free to substitute other
 *  algorithms, so long as the specification itself is adhered to. (For
 *  example, the algorithm used by sort(Object[]) does not have to be
 *  a MergeSort, but it does have to be stable.)
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class Arrays extends Object {
}

object Arrays {
    /** Returns a fixed-size list backed by the specified array. */
    @stub
    def asList[T](a: T*): List[T] = ???

    /** Searches the specified array of bytes for the specified value using the
     *  binary search algorithm.
     */
    @stub
    def binarySearch(a: Array[Byte], key: Byte): Int = ???

    /** Searches a range of
     *  the specified array of bytes for the specified value using the
     *  binary search algorithm.
     */
    @stub
    def binarySearch(a: Array[Byte], fromIndex: Int, toIndex: Int, key: Byte): Int = ???

    /** Searches the specified array of chars for the specified value using the
     *  binary search algorithm.
     */
    @stub
    def binarySearch(a: Array[Char], key: Char): Int = ???

    /** Searches a range of
     *  the specified array of chars for the specified value using the
     *  binary search algorithm.
     */
    @stub
    def binarySearch(a: Array[Char], fromIndex: Int, toIndex: Int, key: Char): Int = ???

    /** Searches the specified array of doubles for the specified value using
     *  the binary search algorithm.
     */
    @stub
    def binarySearch(a: Array[Double], key: Double): Int = ???

    /** Searches a range of
     *  the specified array of doubles for the specified value using
     *  the binary search algorithm.
     */
    @stub
    def binarySearch(a: Array[Double], fromIndex: Int, toIndex: Int, key: Double): Int = ???

    /** Searches the specified array of floats for the specified value using
     *  the binary search algorithm.
     */
    @stub
    def binarySearch(a: Array[Float], key: Float): Int = ???

    /** Searches a range of
     *  the specified array of floats for the specified value using
     *  the binary search algorithm.
     */
    @stub
    def binarySearch(a: Array[Float], fromIndex: Int, toIndex: Int, key: Float): Int = ???

    /** Searches the specified array of ints for the specified value using the
     *  binary search algorithm.
     */
    @stub
    def binarySearch(a: Array[Int], key: Int): Int = ???

    /** Searches a range of
     *  the specified array of ints for the specified value using the
     *  binary search algorithm.
     */
    @stub
    def binarySearch(a: Array[Int], fromIndex: Int, toIndex: Int, key: Int): Int = ???

    /** Searches a range of
     *  the specified array of longs for the specified value using the
     *  binary search algorithm.
     */
    @stub
    def binarySearch(a: Array[Long], fromIndex: Int, toIndex: Int, key: Long): Int = ???

    /** Searches the specified array of longs for the specified value using the
     *  binary search algorithm.
     */
    @stub
    def binarySearch(a: Array[Long], key: Long): Int = ???

    /** Searches a range of
     *  the specified array for the specified object using the binary
     *  search algorithm.
     */
    @stub
    def binarySearch(a: Array[Object], fromIndex: Int, toIndex: Int, key: Object): Int = ???

    /** Searches the specified array for the specified object using the binary
     *  search algorithm.
     */
    @stub
    def binarySearch(a: Array[Object], key: Object): Int = ???

    /** Searches a range of
     *  the specified array of shorts for the specified value using
     *  the binary search algorithm.
     */
    @stub
    def binarySearch(a: Array[Short], fromIndex: Int, toIndex: Int, key: Short): Int = ???

    /** Searches the specified array of shorts for the specified value using
     *  the binary search algorithm.
     */
    @stub
    def binarySearch(a: Array[Short], key: Short): Int = ???

    /** Searches a range of
     *  the specified array for the specified object using the binary
     *  search algorithm.
     */
    @stub
    def binarySearch[T](a: Array[T], fromIndex: Int, toIndex: Int, key: T, c: Comparator[_ >: T]): Int = ???

    /** Searches the specified array for the specified object using the binary
     *  search algorithm.
     */
    @stub
    def binarySearch[T](a: Array[T], key: T, c: Comparator[_ >: T]): Int = ???

    /** Copies the specified array, truncating or padding with false (if necessary)
     *  so the copy has the specified length.
     */
    @stub
    def copyOf(original: Array[Boolean], newLength: Int): Array[Boolean] = ???

    /** Copies the specified array, truncating or padding with zeros (if necessary)
     *  so the copy has the specified length.
     */
    @stub
    def copyOf(original: Array[Byte], newLength: Int): Array[Byte] = ???

    /** Copies the specified array, truncating or padding with null characters (if necessary)
     *  so the copy has the specified length.
     */
    @stub
    def copyOf(original: Array[Char], newLength: Int): Array[Char] = ???

    /** Copies the specified array, truncating or padding with zeros (if necessary)
     *  so the copy has the specified length.
     */
    @stub
    def copyOf(original: Array[Double], newLength: Int): Array[Double] = ???

    /** Copies the specified array, truncating or padding with zeros (if necessary)
     *  so the copy has the specified length.
     */
    @stub
    def copyOf(original: Array[Float], newLength: Int): Array[Float] = ???

    /** Copies the specified array, truncating or padding with zeros (if necessary)
     *  so the copy has the specified length.
     */
    @stub
    def copyOf(original: Array[Int], newLength: Int): Array[Int] = ???

    /** Copies the specified array, truncating or padding with zeros (if necessary)
     *  so the copy has the specified length.
     */
    @stub
    def copyOf(original: Array[Long], newLength: Int): Array[Long] = ???

    /** Copies the specified array, truncating or padding with zeros (if necessary)
     *  so the copy has the specified length.
     */
    @stub
    def copyOf(original: Array[Short], newLength: Int): Array[Short] = ???

    /** Copies the specified array, truncating or padding with nulls (if necessary)
     *  so the copy has the specified length.
     */
    @stub
    def copyOf[T](original: Array[T], newLength: Int): Array[T] = ???

    /** Copies the specified array, truncating or padding with nulls (if necessary)
     *  so the copy has the specified length.
     */
    @stub
    def copyOf[T, U](original: Array[U], newLength: Int, newType: Class[_ <: Array[T]]): Array[T] = ???

    /** Copies the specified range of the specified array into a new array. */
    @stub
    def copyOfRange(original: Array[Boolean], from: Int, to: Int): Array[Boolean] = ???

    /** Copies the specified range of the specified array into a new array. */
    @stub
    def copyOfRange(original: Array[Byte], from: Int, to: Int): Array[Byte] = ???

    /** Copies the specified range of the specified array into a new array. */
    @stub
    def copyOfRange(original: Array[Char], from: Int, to: Int): Array[Char] = ???

    /** Copies the specified range of the specified array into a new array. */
    @stub
    def copyOfRange(original: Array[Double], from: Int, to: Int): Array[Double] = ???

    /** Copies the specified range of the specified array into a new array. */
    @stub
    def copyOfRange(original: Array[Float], from: Int, to: Int): Array[Float] = ???

    /** Copies the specified range of the specified array into a new array. */
    @stub
    def copyOfRange(original: Array[Int], from: Int, to: Int): Array[Int] = ???

    /** Copies the specified range of the specified array into a new array. */
    @stub
    def copyOfRange(original: Array[Long], from: Int, to: Int): Array[Long] = ???

    /** Copies the specified range of the specified array into a new array. */
    @stub
    def copyOfRange(original: Array[Short], from: Int, to: Int): Array[Short] = ???

    /** Copies the specified range of the specified array into a new array. */
    @stub
    def copyOfRange[T](original: Array[T], from: Int, to: Int): Array[T] = ???

    /** Copies the specified range of the specified array into a new array. */
    @stub
    def copyOfRange[T, U](original: Array[U], from: Int, to: Int, newType: Class[_ <: Array[T]]): Array[T] = ???

    /** Returns true if the two specified arrays are deeply
     *  equal to one another.
     */
    @stub
    def deepEquals(a1: Array[Object], a2: Array[Object]): Boolean = ???

    /** Returns a hash code based on the "deep contents" of the specified
     *  array.
     */
    @stub
    def deepHashCode(a: Array[Object]): Int = ???

    /** Returns a string representation of the "deep contents" of the specified
     *  array.
     */
    @stub
    def deepToString(a: Array[Object]): String = ???

    /** Returns true if the two specified arrays of booleans are
     *  equal to one another.
     */
    @stub
    def equals(a: Array[Boolean], a2: Array[Boolean]): Boolean = ???

    /** Returns true if the two specified arrays of bytes are
     *  equal to one another.
     */
    @stub
    def equals(a: Array[Byte], a2: Array[Byte]): Boolean = ???

    /** Returns true if the two specified arrays of chars are
     *  equal to one another.
     */
    @stub
    def equals(a: Array[Char], a2: Array[Char]): Boolean = ???

    /** Returns true if the two specified arrays of doubles are
     *  equal to one another.
     */
    @stub
    def equals(a: Array[Double], a2: Array[Double]): Boolean = ???

    /** Returns true if the two specified arrays of floats are
     *  equal to one another.
     */
    @stub
    def equals(a: Array[Float], a2: Array[Float]): Boolean = ???

    /** Returns true if the two specified arrays of ints are
     *  equal to one another.
     */
    @stub
    def equals(a: Array[Int], a2: Array[Int]): Boolean = ???

    /** Returns true if the two specified arrays of longs are
     *  equal to one another.
     */
    @stub
    def equals(a: Array[Long], a2: Array[Long]): Boolean = ???

    /** Returns true if the two specified arrays of Objects are
     *  equal to one another.
     */
    @stub
    def equals(a: Array[Object], a2: Array[Object]): Boolean = ???

    /** Returns true if the two specified arrays of shorts are
     *  equal to one another.
     */
    @stub
    def equals(a: Array[Short], a2: Array[Short]): Boolean = ???

    /** Assigns the specified boolean value to each element of the specified
     *  array of booleans.
     */
    @stub
    def fill(a: Array[Boolean], val: Boolean): Unit = ???

    /** Assigns the specified boolean value to each element of the specified
     *  range of the specified array of booleans.
     */
    @stub
    def fill(a: Array[Boolean], fromIndex: Int, toIndex: Int, val: Boolean): Unit = ???

    /** Assigns the specified byte value to each element of the specified array
     *  of bytes.
     */
    @stub
    def fill(a: Array[Byte], val: Byte): Unit = ???

    /** Assigns the specified byte value to each element of the specified
     *  range of the specified array of bytes.
     */
    @stub
    def fill(a: Array[Byte], fromIndex: Int, toIndex: Int, val: Byte): Unit = ???

    /** Assigns the specified char value to each element of the specified array
     *  of chars.
     */
    @stub
    def fill(a: Array[Char], val: Char): Unit = ???

    /** Assigns the specified char value to each element of the specified
     *  range of the specified array of chars.
     */
    @stub
    def fill(a: Array[Char], fromIndex: Int, toIndex: Int, val: Char): Unit = ???

    /** Assigns the specified double value to each element of the specified
     *  array of doubles.
     */
    @stub
    def fill(a: Array[Double], val: Double): Unit = ???

    /** Assigns the specified double value to each element of the specified
     *  range of the specified array of doubles.
     */
    @stub
    def fill(a: Array[Double], fromIndex: Int, toIndex: Int, val: Double): Unit = ???

    /** Assigns the specified float value to each element of the specified array
     *  of floats.
     */
    @stub
    def fill(a: Array[Float], val: Float): Unit = ???

    /** Assigns the specified float value to each element of the specified
     *  range of the specified array of floats.
     */
    @stub
    def fill(a: Array[Float], fromIndex: Int, toIndex: Int, val: Float): Unit = ???

    /** Assigns the specified int value to each element of the specified array
     *  of ints.
     */
    @stub
    def fill(a: Array[Int], val: Int): Unit = ???

    /** Assigns the specified int value to each element of the specified
     *  range of the specified array of ints.
     */
    @stub
    def fill(a: Array[Int], fromIndex: Int, toIndex: Int, val: Int): Unit = ???

    /** Assigns the specified long value to each element of the specified
     *  range of the specified array of longs.
     */
    @stub
    def fill(a: Array[Long], fromIndex: Int, toIndex: Int, val: Long): Unit = ???

    /** Assigns the specified long value to each element of the specified array
     *  of longs.
     */
    @stub
    def fill(a: Array[Long], val: Long): Unit = ???

    /** Assigns the specified Object reference to each element of the specified
     *  range of the specified array of Objects.
     */
    @stub
    def fill(a: Array[Object], fromIndex: Int, toIndex: Int, val: Object): Unit = ???

    /** Assigns the specified Object reference to each element of the specified
     *  array of Objects.
     */
    @stub
    def fill(a: Array[Object], val: Object): Unit = ???

    /** Assigns the specified short value to each element of the specified
     *  range of the specified array of shorts.
     */
    @stub
    def fill(a: Array[Short], fromIndex: Int, toIndex: Int, val: Short): Unit = ???

    /** Assigns the specified short value to each element of the specified array
     *  of shorts.
     */
    @stub
    def fill(a: Array[Short], val: Short): Unit = ???

    /** Returns a hash code based on the contents of the specified array. */
    @stub
    def hashCode(a: Array[Boolean]): Int = ???

    /** Returns a hash code based on the contents of the specified array. */
    @stub
    def hashCode(a: Array[Byte]): Int = ???

    /** Returns a hash code based on the contents of the specified array. */
    @stub
    def hashCode(a: Array[Char]): Int = ???

    /** Returns a hash code based on the contents of the specified array. */
    @stub
    def hashCode(a: Array[Double]): Int = ???

    /** Returns a hash code based on the contents of the specified array. */
    @stub
    def hashCode(a: Array[Float]): Int = ???

    /** Returns a hash code based on the contents of the specified array. */
    @stub
    def hashCode(a: Array[Int]): Int = ???

    /** Returns a hash code based on the contents of the specified array. */
    @stub
    def hashCode(a: Array[Long]): Int = ???

    /** Returns a hash code based on the contents of the specified array. */
    @stub
    def hashCode(a: Array[Object]): Int = ???

    /** Returns a hash code based on the contents of the specified array. */
    @stub
    def hashCode(a: Array[Short]): Int = ???

    /** Cumulates, in parallel, each element of the given array in place,
     *  using the supplied function.
     */
    @stub
    def parallelPrefix(array: Array[Double], op: DoubleBinaryOperator): Unit = ???

    /** Performs parallelPrefix(double[], DoubleBinaryOperator)
     *  for the given subrange of the array.
     */
    @stub
    def parallelPrefix(array: Array[Double], fromIndex: Int, toIndex: Int, op: DoubleBinaryOperator): Unit = ???

    /** Cumulates, in parallel, each element of the given array in place,
     *  using the supplied function.
     */
    @stub
    def parallelPrefix(array: Array[Int], op: IntBinaryOperator): Unit = ???

    /** Performs parallelPrefix(int[], IntBinaryOperator)
     *  for the given subrange of the array.
     */
    @stub
    def parallelPrefix(array: Array[Int], fromIndex: Int, toIndex: Int, op: IntBinaryOperator): Unit = ???

    /** Performs parallelPrefix(long[], LongBinaryOperator)
     *  for the given subrange of the array.
     */
    @stub
    def parallelPrefix(array: Array[Long], fromIndex: Int, toIndex: Int, op: LongBinaryOperator): Unit = ???

    /** Cumulates, in parallel, each element of the given array in place,
     *  using the supplied function.
     */
    @stub
    def parallelPrefix(array: Array[Long], op: LongBinaryOperator): Unit = ???

    /** Cumulates, in parallel, each element of the given array in place,
     *  using the supplied function.
     */
    @stub
    def parallelPrefix[T](array: Array[T], op: BinaryOperator[T]): Unit = ???

    /** Performs parallelPrefix(Object[], BinaryOperator)
     *  for the given subrange of the array.
     */
    @stub
    def parallelPrefix[T](array: Array[T], fromIndex: Int, toIndex: Int, op: BinaryOperator[T]): Unit = ???

    /** Set all elements of the specified array, in parallel, using the
     *  provided generator function to compute each element.
     */
    @stub
    def parallelSetAll(array: Array[Double], generator: IntToDoubleFunction): Unit = ???

    /** Set all elements of the specified array, in parallel, using the
     *  provided generator function to compute each element.
     */
    @stub
    def parallelSetAll(array: Array[Int], generator: IntUnaryOperator): Unit = ???

    /** Set all elements of the specified array, in parallel, using the
     *  provided generator function to compute each element.
     */
    @stub
    def parallelSetAll(array: Array[Long], generator: IntToLongFunction): Unit = ???

    /** Set all elements of the specified array, in parallel, using the
     *  provided generator function to compute each element.
     */
    @stub
    def parallelSetAll[T](array: Array[T], generator: IntFunction[_ <: T]): Unit = ???

    /** Sorts the specified array into ascending numerical order. */
    @stub
    def parallelSort(a: Array[Byte]): Unit = ???

    /** Sorts the specified range of the array into ascending numerical order. */
    @stub
    def parallelSort(a: Array[Byte], fromIndex: Int, toIndex: Int): Unit = ???

    /** Sorts the specified array into ascending numerical order. */
    @stub
    def parallelSort(a: Array[Char]): Unit = ???

    /** Sorts the specified range of the array into ascending numerical order. */
    @stub
    def parallelSort(a: Array[Char], fromIndex: Int, toIndex: Int): Unit = ???

    /** Sorts the specified array into ascending numerical order. */
    @stub
    def parallelSort(a: Array[Double]): Unit = ???

    /** Sorts the specified range of the array into ascending numerical order. */
    @stub
    def parallelSort(a: Array[Double], fromIndex: Int, toIndex: Int): Unit = ???

    /** Sorts the specified array into ascending numerical order. */
    @stub
    def parallelSort(a: Array[Float]): Unit = ???

    /** Sorts the specified range of the array into ascending numerical order. */
    @stub
    def parallelSort(a: Array[Float], fromIndex: Int, toIndex: Int): Unit = ???

    /** Sorts the specified array into ascending numerical order. */
    @stub
    def parallelSort(a: Array[Int]): Unit = ???

    /** Sorts the specified range of the array into ascending numerical order. */
    @stub
    def parallelSort(a: Array[Int], fromIndex: Int, toIndex: Int): Unit = ???

    /** Sorts the specified array into ascending numerical order. */
    @stub
    def parallelSort(a: Array[Long]): Unit = ???

    /** Sorts the specified range of the array into ascending numerical order. */
    @stub
    def parallelSort(a: Array[Long], fromIndex: Int, toIndex: Int): Unit = ???

    /** Sorts the specified array into ascending numerical order. */
    @stub
    def parallelSort(a: Array[Short]): Unit = ???

    /** Sorts the specified range of the array into ascending numerical order. */
    @stub
    def parallelSort(a: Array[Short], fromIndex: Int, toIndex: Int): Unit = ???

    /** Sorts the specified array of objects into ascending order, according
     *  to the natural ordering of its elements.
     */
    @stub
    def parallelSort[T <: Comparable[_ >: T]](a: Array[T]): Unit = ???

    /** Sorts the specified array of objects according to the order induced by
     *  the specified comparator.
     */
    @stub
    def parallelSort[T](a: Array[T], cmp: Comparator[_ >: T]): Unit = ???

    /** Sorts the specified range of the specified array of objects into
     *  ascending order, according to the
     *  natural ordering of its
     *  elements.
     */
    @stub
    def parallelSort[T <: Comparable[_ >: T]](a: Array[T], fromIndex: Int, toIndex: Int): Unit = ???

    /** Sorts the specified range of the specified array of objects according
     *  to the order induced by the specified comparator.
     */
    @stub
    def parallelSort[T](a: Array[T], fromIndex: Int, toIndex: Int, cmp: Comparator[_ >: T]): Unit = ???

    /** Set all elements of the specified array, using the provided
     *  generator function to compute each element.
     */
    @stub
    def setAll(array: Array[Double], generator: IntToDoubleFunction): Unit = ???

    /** Set all elements of the specified array, using the provided
     *  generator function to compute each element.
     */
    @stub
    def setAll(array: Array[Int], generator: IntUnaryOperator): Unit = ???

    /** Set all elements of the specified array, using the provided
     *  generator function to compute each element.
     */
    @stub
    def setAll(array: Array[Long], generator: IntToLongFunction): Unit = ???

    /** Set all elements of the specified array, using the provided
     *  generator function to compute each element.
     */
    @stub
    def setAll[T](array: Array[T], generator: IntFunction[_ <: T]): Unit = ???

    /** Sorts the specified array into ascending numerical order. */
    @stub
    def sort(a: Array[Byte]): Unit = ???

    /** Sorts the specified range of the array into ascending order. */
    @stub
    def sort(a: Array[Byte], fromIndex: Int, toIndex: Int): Unit = ???

    /** Sorts the specified array into ascending numerical order. */
    @stub
    def sort(a: Array[Char]): Unit = ???

    /** Sorts the specified range of the array into ascending order. */
    @stub
    def sort(a: Array[Char], fromIndex: Int, toIndex: Int): Unit = ???

    /** Sorts the specified array into ascending numerical order. */
    @stub
    def sort(a: Array[Double]): Unit = ???

    /** Sorts the specified range of the array into ascending order. */
    @stub
    def sort(a: Array[Double], fromIndex: Int, toIndex: Int): Unit = ???

    /** Sorts the specified array into ascending numerical order. */
    @stub
    def sort(a: Array[Float]): Unit = ???

    /** Sorts the specified range of the array into ascending order. */
    @stub
    def sort(a: Array[Float], fromIndex: Int, toIndex: Int): Unit = ???

    /** Sorts the specified array into ascending numerical order. */
    @stub
    def sort(a: Array[Int]): Unit = ???

    /** Sorts the specified range of the array into ascending order. */
    @stub
    def sort(a: Array[Int], fromIndex: Int, toIndex: Int): Unit = ???

    /** Sorts the specified array into ascending numerical order. */
    @stub
    def sort(a: Array[Long]): Unit = ???

    /** Sorts the specified range of the array into ascending order. */
    @stub
    def sort(a: Array[Long], fromIndex: Int, toIndex: Int): Unit = ???

    /** Sorts the specified array of objects into ascending order, according
     *  to the natural ordering of its elements.
     */
    @stub
    def sort(a: Array[Object]): Unit = ???

    /** Sorts the specified range of the specified array of objects into
     *  ascending order, according to the
     *  natural ordering of its
     *  elements.
     */
    @stub
    def sort(a: Array[Object], fromIndex: Int, toIndex: Int): Unit = ???

    /** Sorts the specified array into ascending numerical order. */
    @stub
    def sort(a: Array[Short]): Unit = ???

    /** Sorts the specified range of the array into ascending order. */
    @stub
    def sort(a: Array[Short], fromIndex: Int, toIndex: Int): Unit = ???

    /** Sorts the specified array of objects according to the order induced by
     *  the specified comparator.
     */
    @stub
    def sort[T](a: Array[T], c: Comparator[_ >: T]): Unit = ???

    /** Sorts the specified range of the specified array of objects according
     *  to the order induced by the specified comparator.
     */
    @stub
    def sort[T](a: Array[T], fromIndex: Int, toIndex: Int, c: Comparator[_ >: T]): Unit = ???

    /** Returns a Spliterator.OfDouble covering all of the specified
     *  array.
     */
    @stub
    def spliterator(array: Array[Double]): Spliterator.OfDouble = ???

    /** Returns a Spliterator.OfDouble covering the specified range of
     *  the specified array.
     */
    @stub
    def spliterator(array: Array[Double], startInclusive: Int, endExclusive: Int): Spliterator.OfDouble = ???

    /** Returns a Spliterator.OfInt covering all of the specified array. */
    @stub
    def spliterator(array: Array[Int]): Spliterator.OfInt = ???

    /** Returns a Spliterator.OfInt covering the specified range of the
     *  specified array.
     */
    @stub
    def spliterator(array: Array[Int], startInclusive: Int, endExclusive: Int): Spliterator.OfInt = ???

    /** Returns a Spliterator.OfLong covering all of the specified array. */
    @stub
    def spliterator(array: Array[Long]): Spliterator.OfLong = ???

    /** Returns a Spliterator.OfLong covering the specified range of the
     *  specified array.
     */
    @stub
    def spliterator(array: Array[Long], startInclusive: Int, endExclusive: Int): Spliterator.OfLong = ???

    /** Returns a Spliterator covering all of the specified array. */
    @stub
    def spliterator[T](array: Array[T]): Spliterator[T] = ???

    /** Returns a Spliterator covering the specified range of the
     *  specified array.
     */
    @stub
    def spliterator[T](array: Array[T], startInclusive: Int, endExclusive: Int): Spliterator[T] = ???

    /** Returns a sequential DoubleStream with the specified array as its
     *  source.
     */
    @stub
    def stream(array: Array[Double]): DoubleStream = ???

    /** Returns a sequential DoubleStream with the specified range of the
     *  specified array as its source.
     */
    @stub
    def stream(array: Array[Double], startInclusive: Int, endExclusive: Int): DoubleStream = ???

    /** Returns a sequential IntStream with the specified array as its
     *  source.
     */
    @stub
    def stream(array: Array[Int]): IntStream = ???

    /** Returns a sequential IntStream with the specified range of the
     *  specified array as its source.
     */
    @stub
    def stream(array: Array[Int], startInclusive: Int, endExclusive: Int): IntStream = ???

    /** Returns a sequential LongStream with the specified array as its
     *  source.
     */
    @stub
    def stream(array: Array[Long]): LongStream = ???

    /** Returns a sequential LongStream with the specified range of the
     *  specified array as its source.
     */
    @stub
    def stream(array: Array[Long], startInclusive: Int, endExclusive: Int): LongStream = ???

    /** Returns a sequential Stream with the specified array as its
     *  source.
     */
    @stub
    def stream[T](array: Array[T]): Stream[T] = ???

    /** Returns a sequential Stream with the specified range of the
     *  specified array as its source.
     */
    @stub
    def stream[T](array: Array[T], startInclusive: Int, endExclusive: Int): Stream[T] = ???

    /** Returns a string representation of the contents of the specified array. */
    @stub
    def toString(a: Array[Boolean]): String = ???

    /** Returns a string representation of the contents of the specified array. */
    @stub
    def toString(a: Array[Byte]): String = ???

    /** Returns a string representation of the contents of the specified array. */
    @stub
    def toString(a: Array[Char]): String = ???

    /** Returns a string representation of the contents of the specified array. */
    @stub
    def toString(a: Array[Double]): String = ???

    /** Returns a string representation of the contents of the specified array. */
    @stub
    def toString(a: Array[Float]): String = ???

    /** Returns a string representation of the contents of the specified array. */
    @stub
    def toString(a: Array[Int]): String = ???

    /** Returns a string representation of the contents of the specified array. */
    @stub
    def toString(a: Array[Long]): String = ???

    /** Returns a string representation of the contents of the specified array. */
    @stub
    def toString(a: Array[Object]): String = ???

    /** Returns a string representation of the contents of the specified array. */
    @stub
    def toString(a: Array[Short]): String = ???
}
