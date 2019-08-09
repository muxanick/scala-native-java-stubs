package java.util

import java.lang.{Class, Comparable, Object, String}
import java.util.function.{BinaryOperator, DoubleBinaryOperator, IntBinaryOperator, IntFunction, IntToDoubleFunction, IntToLongFunction, IntUnaryOperator, LongBinaryOperator}
import java.util.stream.{DoubleStream, IntStream, LongStream, Stream}

// This class contains various methods for manipulating arrays (such as
// sorting and searching). This class also contains a static factory
// that allows arrays to be viewed as lists.
//
// The methods in this class all throw a NullPointerException,
// if the specified array reference is null, except where noted.
//
// The documentation for the methods contained in this class includes
// briefs description of the implementations. Such descriptions should
// be regarded as implementation notes, rather than parts of the
// specification. Implementors should feel free to substitute other
// algorithms, so long as the specification itself is adhered to. (For
// example, the algorithm used by sort(Object[]) does not have to be
// a MergeSort, but it does have to be stable.)
//
// This class is a member of the
// 
// Java Collections Framework.
class Arrays extends Object {
}

object Arrays {
    @stub
    // Returns a fixed-size list backed by the specified array.
    def List[T]: [T] = ???

    @stub
    // Searches the specified array of bytes for the specified value using the
    // binary search algorithm.
    def binarySearch(a: Array[Byte], key: Byte): Int = ???

    @stub
    // Searches a range of
    // the specified array of bytes for the specified value using the
    // binary search algorithm.
    def binarySearch(a: Array[Byte], fromIndex: Int, toIndex: Int, key: Byte): Int = ???

    @stub
    // Searches the specified array of chars for the specified value using the
    // binary search algorithm.
    def binarySearch(a: Array[Char], key: Char): Int = ???

    @stub
    // Searches a range of
    // the specified array of chars for the specified value using the
    // binary search algorithm.
    def binarySearch(a: Array[Char], fromIndex: Int, toIndex: Int, key: Char): Int = ???

    @stub
    // Searches the specified array of doubles for the specified value using
    // the binary search algorithm.
    def binarySearch(a: Array[double], key: double): Int = ???

    @stub
    // Searches a range of
    // the specified array of doubles for the specified value using
    // the binary search algorithm.
    def binarySearch(a: Array[double], fromIndex: Int, toIndex: Int, key: double): Int = ???

    @stub
    // Searches the specified array of floats for the specified value using
    // the binary search algorithm.
    def binarySearch(a: Array[float], key: float): Int = ???

    @stub
    // Searches a range of
    // the specified array of floats for the specified value using
    // the binary search algorithm.
    def binarySearch(a: Array[float], fromIndex: Int, toIndex: Int, key: float): Int = ???

    @stub
    // Searches the specified array of ints for the specified value using the
    // binary search algorithm.
    def binarySearch(a: Array[Int], key: Int): Int = ???

    @stub
    // Searches a range of
    // the specified array of ints for the specified value using the
    // binary search algorithm.
    def binarySearch(a: Array[Int], fromIndex: Int, toIndex: Int, key: Int): Int = ???

    @stub
    // Searches a range of
    // the specified array of longs for the specified value using the
    // binary search algorithm.
    def binarySearch(a: Array[Long], fromIndex: Int, toIndex: Int, key: Long): Int = ???

    @stub
    // Searches the specified array of longs for the specified value using the
    // binary search algorithm.
    def binarySearch(a: Array[Long], key: Long): Int = ???

    @stub
    // Searches a range of
    // the specified array for the specified object using the binary
    // search algorithm.
    def binarySearch(a: Array[Object], fromIndex: Int, toIndex: Int, key: Object): Int = ???

    @stub
    // Searches the specified array for the specified object using the binary
    // search algorithm.
    def binarySearch(a: Array[Object], key: Object): Int = ???

    @stub
    // Searches a range of
    // the specified array of shorts for the specified value using
    // the binary search algorithm.
    def binarySearch(a: Array[Short], fromIndex: Int, toIndex: Int, key: Short): Int = ???

    @stub
    // Searches the specified array of shorts for the specified value using
    // the binary search algorithm.
    def binarySearch(a: Array[Short], key: Short): Int = ???

    @stub
    // Searches a range of
    // the specified array for the specified object using the binary
    // search algorithm.
    def Int: [T] = ???

    @stub
    // Searches the specified array for the specified object using the binary
    // search algorithm.
    def Int: [T] = ???

    @stub
    // Copies the specified array, truncating or padding with false (if necessary)
    // so the copy has the specified length.
    def copyOf(original: Array[Boolean], newLength: Int): Array[Boolean] = ???

    @stub
    // Copies the specified array, truncating or padding with zeros (if necessary)
    // so the copy has the specified length.
    def copyOf(original: Array[Byte], newLength: Int): Array[Byte] = ???

    @stub
    // Copies the specified array, truncating or padding with null characters (if necessary)
    // so the copy has the specified length.
    def copyOf(original: Array[Char], newLength: Int): Array[Char] = ???

    @stub
    // Copies the specified array, truncating or padding with zeros (if necessary)
    // so the copy has the specified length.
    def copyOf(original: Array[double], newLength: Int): Array[double] = ???

    @stub
    // Copies the specified array, truncating or padding with zeros (if necessary)
    // so the copy has the specified length.
    def copyOf(original: Array[float], newLength: Int): Array[float] = ???

    @stub
    // Copies the specified array, truncating or padding with zeros (if necessary)
    // so the copy has the specified length.
    def copyOf(original: Array[Int], newLength: Int): Array[Int] = ???

    @stub
    // Copies the specified array, truncating or padding with zeros (if necessary)
    // so the copy has the specified length.
    def copyOf(original: Array[Long], newLength: Int): Array[Long] = ???

    @stub
    // Copies the specified array, truncating or padding with zeros (if necessary)
    // so the copy has the specified length.
    def copyOf(original: Array[Short], newLength: Int): Array[Short] = ???

    @stub
    // Copies the specified array, truncating or padding with nulls (if necessary)
    // so the copy has the specified length.
    def Array[T]: [T] = ???

    @stub
    // Copies the specified array, truncating or padding with nulls (if necessary)
    // so the copy has the specified length.
    def Array[T]: [T, U] = ???

    @stub
    // Copies the specified range of the specified array into a new array.
    def copyOfRange(original: Array[Boolean], from: Int, to: Int): Array[Boolean] = ???

    @stub
    // Copies the specified range of the specified array into a new array.
    def copyOfRange(original: Array[Byte], from: Int, to: Int): Array[Byte] = ???

    @stub
    // Copies the specified range of the specified array into a new array.
    def copyOfRange(original: Array[Char], from: Int, to: Int): Array[Char] = ???

    @stub
    // Copies the specified range of the specified array into a new array.
    def copyOfRange(original: Array[double], from: Int, to: Int): Array[double] = ???

    @stub
    // Copies the specified range of the specified array into a new array.
    def copyOfRange(original: Array[float], from: Int, to: Int): Array[float] = ???

    @stub
    // Copies the specified range of the specified array into a new array.
    def copyOfRange(original: Array[Int], from: Int, to: Int): Array[Int] = ???

    @stub
    // Copies the specified range of the specified array into a new array.
    def copyOfRange(original: Array[Long], from: Int, to: Int): Array[Long] = ???

    @stub
    // Copies the specified range of the specified array into a new array.
    def copyOfRange(original: Array[Short], from: Int, to: Int): Array[Short] = ???

    @stub
    // Copies the specified range of the specified array into a new array.
    def Array[T]: [T] = ???

    @stub
    // Copies the specified range of the specified array into a new array.
    def Array[T]: [T, U] = ???

    @stub
    // Returns true if the two specified arrays are deeply
    // equal to one another.
    def deepEquals(a1: Array[Object], a2: Array[Object]): Boolean = ???

    @stub
    // Returns a hash code based on the "deep contents" of the specified
    // array.
    def deepHashCode(a: Array[Object]): Int = ???

    @stub
    // Returns a string representation of the "deep contents" of the specified
    // array.
    def deepToString(a: Array[Object]): String = ???

    @stub
    // Returns true if the two specified arrays of booleans are
    // equal to one another.
    def equals(a: Array[Boolean], a2: Array[Boolean]): Boolean = ???

    @stub
    // Returns true if the two specified arrays of bytes are
    // equal to one another.
    def equals(a: Array[Byte], a2: Array[Byte]): Boolean = ???

    @stub
    // Returns true if the two specified arrays of chars are
    // equal to one another.
    def equals(a: Array[Char], a2: Array[Char]): Boolean = ???

    @stub
    // Returns true if the two specified arrays of doubles are
    // equal to one another.
    def equals(a: Array[double], a2: Array[double]): Boolean = ???

    @stub
    // Returns true if the two specified arrays of floats are
    // equal to one another.
    def equals(a: Array[float], a2: Array[float]): Boolean = ???

    @stub
    // Returns true if the two specified arrays of ints are
    // equal to one another.
    def equals(a: Array[Int], a2: Array[Int]): Boolean = ???

    @stub
    // Returns true if the two specified arrays of longs are
    // equal to one another.
    def equals(a: Array[Long], a2: Array[Long]): Boolean = ???

    @stub
    // Returns true if the two specified arrays of Objects are
    // equal to one another.
    def equals(a: Array[Object], a2: Array[Object]): Boolean = ???

    @stub
    // Returns true if the two specified arrays of shorts are
    // equal to one another.
    def equals(a: Array[Short], a2: Array[Short]): Boolean = ???

    @stub
    // Assigns the specified boolean value to each element of the specified
    // array of booleans.
    def fill(a: Array[Boolean], val: Boolean): Unit = ???

    @stub
    // Assigns the specified boolean value to each element of the specified
    // range of the specified array of booleans.
    def fill(a: Array[Boolean], fromIndex: Int, toIndex: Int, val: Boolean): Unit = ???

    @stub
    // Assigns the specified byte value to each element of the specified array
    // of bytes.
    def fill(a: Array[Byte], val: Byte): Unit = ???

    @stub
    // Assigns the specified byte value to each element of the specified
    // range of the specified array of bytes.
    def fill(a: Array[Byte], fromIndex: Int, toIndex: Int, val: Byte): Unit = ???

    @stub
    // Assigns the specified char value to each element of the specified array
    // of chars.
    def fill(a: Array[Char], val: Char): Unit = ???

    @stub
    // Assigns the specified char value to each element of the specified
    // range of the specified array of chars.
    def fill(a: Array[Char], fromIndex: Int, toIndex: Int, val: Char): Unit = ???

    @stub
    // Assigns the specified double value to each element of the specified
    // array of doubles.
    def fill(a: Array[double], val: double): Unit = ???

    @stub
    // Assigns the specified double value to each element of the specified
    // range of the specified array of doubles.
    def fill(a: Array[double], fromIndex: Int, toIndex: Int, val: double): Unit = ???

    @stub
    // Assigns the specified float value to each element of the specified array
    // of floats.
    def fill(a: Array[float], val: float): Unit = ???

    @stub
    // Assigns the specified float value to each element of the specified
    // range of the specified array of floats.
    def fill(a: Array[float], fromIndex: Int, toIndex: Int, val: float): Unit = ???

    @stub
    // Assigns the specified int value to each element of the specified array
    // of ints.
    def fill(a: Array[Int], val: Int): Unit = ???

    @stub
    // Assigns the specified int value to each element of the specified
    // range of the specified array of ints.
    def fill(a: Array[Int], fromIndex: Int, toIndex: Int, val: Int): Unit = ???

    @stub
    // Assigns the specified long value to each element of the specified
    // range of the specified array of longs.
    def fill(a: Array[Long], fromIndex: Int, toIndex: Int, val: Long): Unit = ???

    @stub
    // Assigns the specified long value to each element of the specified array
    // of longs.
    def fill(a: Array[Long], val: Long): Unit = ???

    @stub
    // Assigns the specified Object reference to each element of the specified
    // range of the specified array of Objects.
    def fill(a: Array[Object], fromIndex: Int, toIndex: Int, val: Object): Unit = ???

    @stub
    // Assigns the specified Object reference to each element of the specified
    // array of Objects.
    def fill(a: Array[Object], val: Object): Unit = ???

    @stub
    // Assigns the specified short value to each element of the specified
    // range of the specified array of shorts.
    def fill(a: Array[Short], fromIndex: Int, toIndex: Int, val: Short): Unit = ???

    @stub
    // Assigns the specified short value to each element of the specified array
    // of shorts.
    def fill(a: Array[Short], val: Short): Unit = ???

    @stub
    // Returns a hash code based on the contents of the specified array.
    def hashCode(a: Array[Boolean]): Int = ???

    @stub
    // Returns a hash code based on the contents of the specified array.
    def hashCode(a: Array[Byte]): Int = ???

    @stub
    // Returns a hash code based on the contents of the specified array.
    def hashCode(a: Array[Char]): Int = ???

    @stub
    // Returns a hash code based on the contents of the specified array.
    def hashCode(a: Array[double]): Int = ???

    @stub
    // Returns a hash code based on the contents of the specified array.
    def hashCode(a: Array[float]): Int = ???

    @stub
    // Returns a hash code based on the contents of the specified array.
    def hashCode(a: Array[Int]): Int = ???

    @stub
    // Returns a hash code based on the contents of the specified array.
    def hashCode(a: Array[Long]): Int = ???

    @stub
    // Returns a hash code based on the contents of the specified array.
    def hashCode(a: Array[Object]): Int = ???

    @stub
    // Returns a hash code based on the contents of the specified array.
    def hashCode(a: Array[Short]): Int = ???

    @stub
    // Cumulates, in parallel, each element of the given array in place,
    // using the supplied function.
    def parallelPrefix(array: Array[double], op: DoubleBinaryOperator): Unit = ???

    @stub
    // Performs parallelPrefix(double[], DoubleBinaryOperator)
    // for the given subrange of the array.
    def parallelPrefix(array: Array[double], fromIndex: Int, toIndex: Int, op: DoubleBinaryOperator): Unit = ???

    @stub
    // Cumulates, in parallel, each element of the given array in place,
    // using the supplied function.
    def parallelPrefix(array: Array[Int], op: IntBinaryOperator): Unit = ???

    @stub
    // Performs parallelPrefix(int[], IntBinaryOperator)
    // for the given subrange of the array.
    def parallelPrefix(array: Array[Int], fromIndex: Int, toIndex: Int, op: IntBinaryOperator): Unit = ???

    @stub
    // Performs parallelPrefix(long[], LongBinaryOperator)
    // for the given subrange of the array.
    def parallelPrefix(array: Array[Long], fromIndex: Int, toIndex: Int, op: LongBinaryOperator): Unit = ???

    @stub
    // Cumulates, in parallel, each element of the given array in place,
    // using the supplied function.
    def parallelPrefix(array: Array[Long], op: LongBinaryOperator): Unit = ???

    @stub
    // Cumulates, in parallel, each element of the given array in place,
    // using the supplied function.
    def Unit: [T] = ???

    @stub
    // Performs parallelPrefix(Object[], BinaryOperator)
    // for the given subrange of the array.
    def Unit: [T] = ???

    @stub
    // Set all elements of the specified array, in parallel, using the
    // provided generator function to compute each element.
    def parallelSetAll(array: Array[double], generator: IntToDoubleFunction): Unit = ???

    @stub
    // Set all elements of the specified array, in parallel, using the
    // provided generator function to compute each element.
    def parallelSetAll(array: Array[Int], generator: IntUnaryOperator): Unit = ???

    @stub
    // Set all elements of the specified array, in parallel, using the
    // provided generator function to compute each element.
    def parallelSetAll(array: Array[Long], generator: IntToLongFunction): Unit = ???

    @stub
    // Set all elements of the specified array, in parallel, using the
    // provided generator function to compute each element.
    def Unit: [T] = ???

    @stub
    // Sorts the specified array into ascending numerical order.
    def parallelSort(a: Array[Byte]): Unit = ???

    @stub
    // Sorts the specified range of the array into ascending numerical order.
    def parallelSort(a: Array[Byte], fromIndex: Int, toIndex: Int): Unit = ???

    @stub
    // Sorts the specified array into ascending numerical order.
    def parallelSort(a: Array[Char]): Unit = ???

    @stub
    // Sorts the specified range of the array into ascending numerical order.
    def parallelSort(a: Array[Char], fromIndex: Int, toIndex: Int): Unit = ???

    @stub
    // Sorts the specified array into ascending numerical order.
    def parallelSort(a: Array[double]): Unit = ???

    @stub
    // Sorts the specified range of the array into ascending numerical order.
    def parallelSort(a: Array[double], fromIndex: Int, toIndex: Int): Unit = ???

    @stub
    // Sorts the specified array into ascending numerical order.
    def parallelSort(a: Array[float]): Unit = ???

    @stub
    // Sorts the specified range of the array into ascending numerical order.
    def parallelSort(a: Array[float], fromIndex: Int, toIndex: Int): Unit = ???

    @stub
    // Sorts the specified array into ascending numerical order.
    def parallelSort(a: Array[Int]): Unit = ???

    @stub
    // Sorts the specified range of the array into ascending numerical order.
    def parallelSort(a: Array[Int], fromIndex: Int, toIndex: Int): Unit = ???

    @stub
    // Sorts the specified array into ascending numerical order.
    def parallelSort(a: Array[Long]): Unit = ???

    @stub
    // Sorts the specified range of the array into ascending numerical order.
    def parallelSort(a: Array[Long], fromIndex: Int, toIndex: Int): Unit = ???

    @stub
    // Sorts the specified array into ascending numerical order.
    def parallelSort(a: Array[Short]): Unit = ???

    @stub
    // Sorts the specified range of the array into ascending numerical order.
    def parallelSort(a: Array[Short], fromIndex: Int, toIndex: Int): Unit = ???

    @stub
    // Sorts the specified array of objects into ascending order, according
    // to the natural ordering of its elements.
    def Unit: [T <: Comparable[_ >: T]] = ???

    @stub
    // Sorts the specified array of objects according to the order induced by
    // the specified comparator.
    def Unit: [T] = ???

    @stub
    // Sorts the specified range of the specified array of objects into
    // ascending order, according to the
    // natural ordering of its
    // elements.
    def Unit: [T <: Comparable[_ >: T]] = ???

    @stub
    // Sorts the specified range of the specified array of objects according
    // to the order induced by the specified comparator.
    def Unit: [T] = ???

    @stub
    // Set all elements of the specified array, using the provided
    // generator function to compute each element.
    def setAll(array: Array[double], generator: IntToDoubleFunction): Unit = ???

    @stub
    // Set all elements of the specified array, using the provided
    // generator function to compute each element.
    def setAll(array: Array[Int], generator: IntUnaryOperator): Unit = ???

    @stub
    // Set all elements of the specified array, using the provided
    // generator function to compute each element.
    def setAll(array: Array[Long], generator: IntToLongFunction): Unit = ???

    @stub
    // Set all elements of the specified array, using the provided
    // generator function to compute each element.
    def Unit: [T] = ???

    @stub
    // Sorts the specified array into ascending numerical order.
    def sort(a: Array[Byte]): Unit = ???

    @stub
    // Sorts the specified range of the array into ascending order.
    def sort(a: Array[Byte], fromIndex: Int, toIndex: Int): Unit = ???

    @stub
    // Sorts the specified array into ascending numerical order.
    def sort(a: Array[Char]): Unit = ???

    @stub
    // Sorts the specified range of the array into ascending order.
    def sort(a: Array[Char], fromIndex: Int, toIndex: Int): Unit = ???

    @stub
    // Sorts the specified array into ascending numerical order.
    def sort(a: Array[double]): Unit = ???

    @stub
    // Sorts the specified range of the array into ascending order.
    def sort(a: Array[double], fromIndex: Int, toIndex: Int): Unit = ???

    @stub
    // Sorts the specified array into ascending numerical order.
    def sort(a: Array[float]): Unit = ???

    @stub
    // Sorts the specified range of the array into ascending order.
    def sort(a: Array[float], fromIndex: Int, toIndex: Int): Unit = ???

    @stub
    // Sorts the specified array into ascending numerical order.
    def sort(a: Array[Int]): Unit = ???

    @stub
    // Sorts the specified range of the array into ascending order.
    def sort(a: Array[Int], fromIndex: Int, toIndex: Int): Unit = ???

    @stub
    // Sorts the specified array into ascending numerical order.
    def sort(a: Array[Long]): Unit = ???

    @stub
    // Sorts the specified range of the array into ascending order.
    def sort(a: Array[Long], fromIndex: Int, toIndex: Int): Unit = ???

    @stub
    // Sorts the specified array of objects into ascending order, according
    // to the natural ordering of its elements.
    def sort(a: Array[Object]): Unit = ???

    @stub
    // Sorts the specified range of the specified array of objects into
    // ascending order, according to the
    // natural ordering of its
    // elements.
    def sort(a: Array[Object], fromIndex: Int, toIndex: Int): Unit = ???

    @stub
    // Sorts the specified array into ascending numerical order.
    def sort(a: Array[Short]): Unit = ???

    @stub
    // Sorts the specified range of the array into ascending order.
    def sort(a: Array[Short], fromIndex: Int, toIndex: Int): Unit = ???

    @stub
    // Sorts the specified array of objects according to the order induced by
    // the specified comparator.
    def Unit: [T] = ???

    @stub
    // Sorts the specified range of the specified array of objects according
    // to the order induced by the specified comparator.
    def Unit: [T] = ???

    @stub
    // Returns a Spliterator.OfDouble covering all of the specified
    // array.
    def spliterator(array: Array[double]): Spliterator.OfDouble = ???

    @stub
    // Returns a Spliterator.OfDouble covering the specified range of
    // the specified array.
    def spliterator(array: Array[double], startInclusive: Int, endExclusive: Int): Spliterator.OfDouble = ???

    @stub
    // Returns a Spliterator.OfInt covering all of the specified array.
    def spliterator(array: Array[Int]): Spliterator.OfInt = ???

    @stub
    // Returns a Spliterator.OfInt covering the specified range of the
    // specified array.
    def spliterator(array: Array[Int], startInclusive: Int, endExclusive: Int): Spliterator.OfInt = ???

    @stub
    // Returns a Spliterator.OfLong covering all of the specified array.
    def spliterator(array: Array[Long]): Spliterator.OfLong = ???

    @stub
    // Returns a Spliterator.OfLong covering the specified range of the
    // specified array.
    def spliterator(array: Array[Long], startInclusive: Int, endExclusive: Int): Spliterator.OfLong = ???

    @stub
    // Returns a Spliterator covering all of the specified array.
    def Spliterator[T]: [T] = ???

    @stub
    // Returns a Spliterator covering the specified range of the
    // specified array.
    def Spliterator[T]: [T] = ???

    @stub
    // Returns a sequential DoubleStream with the specified array as its
    // source.
    def stream(array: Array[double]): DoubleStream = ???

    @stub
    // Returns a sequential DoubleStream with the specified range of the
    // specified array as its source.
    def stream(array: Array[double], startInclusive: Int, endExclusive: Int): DoubleStream = ???

    @stub
    // Returns a sequential IntStream with the specified array as its
    // source.
    def stream(array: Array[Int]): IntStream = ???

    @stub
    // Returns a sequential IntStream with the specified range of the
    // specified array as its source.
    def stream(array: Array[Int], startInclusive: Int, endExclusive: Int): IntStream = ???

    @stub
    // Returns a sequential LongStream with the specified array as its
    // source.
    def stream(array: Array[Long]): LongStream = ???

    @stub
    // Returns a sequential LongStream with the specified range of the
    // specified array as its source.
    def stream(array: Array[Long], startInclusive: Int, endExclusive: Int): LongStream = ???

    @stub
    // Returns a sequential Stream with the specified array as its
    // source.
    def Stream[T]: [T] = ???

    @stub
    // Returns a sequential Stream with the specified range of the
    // specified array as its source.
    def Stream[T]: [T] = ???

    @stub
    // Returns a string representation of the contents of the specified array.
    def toString(a: Array[Boolean]): String = ???

    @stub
    // Returns a string representation of the contents of the specified array.
    def toString(a: Array[Byte]): String = ???

    @stub
    // Returns a string representation of the contents of the specified array.
    def toString(a: Array[Char]): String = ???

    @stub
    // Returns a string representation of the contents of the specified array.
    def toString(a: Array[double]): String = ???

    @stub
    // Returns a string representation of the contents of the specified array.
    def toString(a: Array[float]): String = ???

    @stub
    // Returns a string representation of the contents of the specified array.
    def toString(a: Array[Int]): String = ???

    @stub
    // Returns a string representation of the contents of the specified array.
    def toString(a: Array[Long]): String = ???

    @stub
    // Returns a string representation of the contents of the specified array.
    def toString(a: Array[Object]): String = ???
}
