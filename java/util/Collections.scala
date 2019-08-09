package java.util

import java.lang.{Boolean, Class, Comparable, Object}
import scala.scalanative.annotation.stub

/** This class consists exclusively of static methods that operate on or return
 *  collections.  It contains polymorphic algorithms that operate on
 *  collections, "wrappers", which return a new collection backed by a
 *  specified collection, and a few other odds and ends.
 * 
 *  The methods of this class all throw a NullPointerException
 *  if the collections or class objects provided to them are null.
 * 
 *  The documentation for the polymorphic algorithms contained in this class
 *  generally includes a brief description of the implementation.  Such
 *  descriptions should be regarded as implementation notes, rather than
 *  parts of the specification.  Implementors should feel free to
 *  substitute other algorithms, so long as the specification itself is adhered
 *  to.  (For example, the algorithm used by sort does not have to be
 *  a mergesort, but it does have to be stable.)
 * 
 *  The "destructive" algorithms contained in this class, that is, the
 *  algorithms that modify the collection on which they operate, are specified
 *  to throw UnsupportedOperationException if the collection does not
 *  support the appropriate mutation primitive(s), such as the set
 *  method.  These algorithms may, but are not required to, throw this
 *  exception if an invocation would have no effect on the collection.  For
 *  example, invoking the sort method on an unmodifiable list that is
 *  already sorted may or may not throw UnsupportedOperationException.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class Collections extends Object {
}

object Collections {
    /** The empty list (immutable). */
    @stub
    val EMPTY_LIST: List = ???

    /** The empty map (immutable). */
    @stub
    val EMPTY_MAP: Map = ???

    /** The empty set (immutable). */
    @stub
    val EMPTY_SET: Set = ???

    /** Adds all of the specified elements to the specified collection. */
    @stub
    def addAll[T](c: Collection[_ >: T], elements: T*): Boolean = ???

    /** Returns a view of a Deque as a Last-in-first-out (Lifo)
     *  Queue.
     */
    @stub
    def asLifoQueue[T](deque: Deque[T]): Queue[T] = ???

    /** Searches the specified list for the specified object using the binary
     *  search algorithm.
     */
    @stub
    def binarySearch[T](list: List[_ <: Comparable[_ >: T]], key: T): Int = ???

    /** Searches the specified list for the specified object using the binary
     *  search algorithm.
     */
    @stub
    def binarySearch[T](list: List[_ <: T], key: T, c: Comparator[_ >: T]): Int = ???

    /** Returns a dynamically typesafe view of the specified collection. */
    @stub
    def checkedCollection[E](c: Collection[E], type: Class[E]): Collection[E] = ???

    /** Returns a dynamically typesafe view of the specified list. */
    @stub
    def checkedList[E](list: List[E], type: Class[E]): List[E] = ???

    /** Returns a dynamically typesafe view of the specified map. */
    @stub
    def checkedMap[K, V](m: Map[K, V], keyType: Class[K], valueType: Class[V]): Map[K, V] = ???

    /** Returns a dynamically typesafe view of the specified navigable map. */
    @stub
    def checkedNavigableMap[K, V](m: NavigableMap[K, V], keyType: Class[K], valueType: Class[V]): NavigableMap[K, V] = ???

    /** Returns a dynamically typesafe view of the specified navigable set. */
    @stub
    def checkedNavigableSet[E](s: NavigableSet[E], type: Class[E]): NavigableSet[E] = ???

    /** Returns a dynamically typesafe view of the specified queue. */
    @stub
    def checkedQueue[E](queue: Queue[E], type: Class[E]): Queue[E] = ???

    /** Returns a dynamically typesafe view of the specified set. */
    @stub
    def checkedSet[E](s: Set[E], type: Class[E]): Set[E] = ???

    /** Returns a dynamically typesafe view of the specified sorted map. */
    @stub
    def checkedSortedMap[K, V](m: SortedMap[K, V], keyType: Class[K], valueType: Class[V]): SortedMap[K, V] = ???

    /** Returns a dynamically typesafe view of the specified sorted set. */
    @stub
    def checkedSortedSet[E](s: SortedSet[E], type: Class[E]): SortedSet[E] = ???

    /** Copies all of the elements from one list into another. */
    @stub
    def copy[T](dest: List[_ >: T], src: List[_ <: T]): Unit = ???

    /** Returns true if the two specified collections have no
     *  elements in common.
     */
    @stub
    def disjoint(c1: Collection[_], c2: Collection[_]): Boolean = ???

    /** Returns an enumeration that has no elements. */
    @stub
    def emptyEnumeration[T](): Enumeration[T] = ???

    /** Returns an iterator that has no elements. */
    @stub
    def emptyIterator[T](): Iterator[T] = ???

    /** Returns an empty list (immutable). */
    @stub
    def emptyList[T](): List[T] = ???

    /** Returns a list iterator that has no elements. */
    @stub
    def emptyListIterator[T](): ListIterator[T] = ???

    /** Returns an empty map (immutable). */
    @stub
    def emptyMap[K, V](): Map[K, V] = ???

    /** Returns an empty navigable map (immutable). */
    @stub
    def emptyNavigableMap[K, V](): NavigableMap[K, V] = ???

    /** Returns an empty navigable set (immutable). */
    @stub
    def emptyNavigableSet[E](): NavigableSet[E] = ???

    /** Returns an empty set (immutable). */
    @stub
    def emptySet[T](): Set[T] = ???

    /** Returns an empty sorted map (immutable). */
    @stub
    def emptySortedMap[K, V](): SortedMap[K, V] = ???

    /** Returns an empty sorted set (immutable). */
    @stub
    def emptySortedSet[E](): SortedSet[E] = ???

    /** Returns an enumeration over the specified collection. */
    @stub
    def enumeration[T](c: Collection[T]): Enumeration[T] = ???

    /** Replaces all of the elements of the specified list with the specified
     *  element.
     */
    @stub
    def fill[T](list: List[_ >: T], obj: T): Unit = ???

    /** Returns the number of elements in the specified collection equal to the
     *  specified object.
     */
    @stub
    def frequency(c: Collection[_], o: Object): Int = ???

    /** Returns the starting position of the first occurrence of the specified
     *  target list within the specified source list, or -1 if there is no
     *  such occurrence.
     */
    @stub
    def indexOfSubList(source: List[_], target: List[_]): Int = ???

    /** Returns the starting position of the last occurrence of the specified
     *  target list within the specified source list, or -1 if there is no such
     *  occurrence.
     */
    @stub
    def lastIndexOfSubList(source: List[_], target: List[_]): Int = ???

    /** Returns an array list containing the elements returned by the
     *  specified enumeration in the order they are returned by the
     *  enumeration.
     */
    @stub
    def list[T](e: Enumeration[T]): ArrayList[T] = ???

    /** Returns the maximum element of the given collection, according to the
     *  natural ordering of its elements.
     */
    @stub
    def max[T <: Object, with, Comparable[_ >: T]](coll: Collection[_ <: T]): T = ???

    /** Returns the maximum element of the given collection, according to the
     *  order induced by the specified comparator.
     */
    @stub
    def max[T](coll: Collection[_ <: T], comp: Comparator[_ >: T]): T = ???

    /** Returns the minimum element of the given collection, according to the
     *  natural ordering of its elements.
     */
    @stub
    def min[T <: Object, with, Comparable[_ >: T]](coll: Collection[_ <: T]): T = ???

    /** Returns the minimum element of the given collection, according to the
     *  order induced by the specified comparator.
     */
    @stub
    def min[T](coll: Collection[_ <: T], comp: Comparator[_ >: T]): T = ???

    /** Returns an immutable list consisting of n copies of the
     *  specified object.
     */
    @stub
    def nCopies[T](n: Int, o: T): List[T] = ???

    /** Returns a set backed by the specified map. */
    @stub
    def newSetFromMap[E](map: Map[E, Boolean]): Set[E] = ???

    /** Replaces all occurrences of one specified value in a list with another. */
    @stub
    def replaceAll[T](list: List[T], oldVal: T, newVal: T): Boolean = ???

    /** Reverses the order of the elements in the specified list. */
    @stub
    def reverse(list: List[_]): Unit = ???

    /** Returns a comparator that imposes the reverse of the natural
     *  ordering on a collection of objects that implement the
     *  Comparable interface.
     */
    @stub
    def reverseOrder[T](): Comparator[T] = ???

    /** Returns a comparator that imposes the reverse ordering of the specified
     *  comparator.
     */
    @stub
    def reverseOrder[T](cmp: Comparator[T]): Comparator[T] = ???

    /** Rotates the elements in the specified list by the specified distance. */
    @stub
    def rotate(list: List[_], distance: Int): Unit = ???

    /** Randomly permutes the specified list using a default source of
     *  randomness.
     */
    @stub
    def shuffle(list: List[_]): Unit = ???

    /** Randomly permute the specified list using the specified source of
     *  randomness.
     */
    @stub
    def shuffle(list: List[_], rnd: Random): Unit = ???

    /** Returns an immutable set containing only the specified object. */
    @stub
    def singleton[T](o: T): Set[T] = ???

    /** Returns an immutable list containing only the specified object. */
    @stub
    def singletonList[T](o: T): List[T] = ???

    /** Returns an immutable map, mapping only the specified key to the
     *  specified value.
     */
    @stub
    def singletonMap[K, V](key: K, value: V): Map[K, V] = ???

    /** Sorts the specified list into ascending order, according to the
     *  natural ordering of its elements.
     */
    @stub
    def sort[T <: Comparable[_ >: T]](list: List[T]): Unit = ???

    /** Sorts the specified list according to the order induced by the
     *  specified comparator.
     */
    @stub
    def sort[T](list: List[T], c: Comparator[_ >: T]): Unit = ???

    /** Swaps the elements at the specified positions in the specified list. */
    @stub
    def swap(list: List[_], i: Int, j: Int): Unit = ???

    /** Returns a synchronized (thread-safe) collection backed by the specified
     *  collection.
     */
    @stub
    def synchronizedCollection[T](c: Collection[T]): Collection[T] = ???

    /** Returns a synchronized (thread-safe) list backed by the specified
     *  list.
     */
    @stub
    def synchronizedList[T](list: List[T]): List[T] = ???

    /** Returns a synchronized (thread-safe) map backed by the specified
     *  map.
     */
    @stub
    def synchronizedMap[K, V](m: Map[K, V]): Map[K, V] = ???

    /** Returns a synchronized (thread-safe) navigable map backed by the
     *  specified navigable map.
     */
    @stub
    def synchronizedNavigableMap[K, V](m: NavigableMap[K, V]): NavigableMap[K, V] = ???

    /** Returns a synchronized (thread-safe) navigable set backed by the
     *  specified navigable set.
     */
    @stub
    def synchronizedNavigableSet[T](s: NavigableSet[T]): NavigableSet[T] = ???

    /** Returns a synchronized (thread-safe) set backed by the specified
     *  set.
     */
    @stub
    def synchronizedSet[T](s: Set[T]): Set[T] = ???

    /** Returns a synchronized (thread-safe) sorted map backed by the specified
     *  sorted map.
     */
    @stub
    def synchronizedSortedMap[K, V](m: SortedMap[K, V]): SortedMap[K, V] = ???

    /** Returns a synchronized (thread-safe) sorted set backed by the specified
     *  sorted set.
     */
    @stub
    def synchronizedSortedSet[T](s: SortedSet[T]): SortedSet[T] = ???

    /** Returns an unmodifiable view of the specified collection. */
    @stub
    def unmodifiableCollection[T](c: Collection[_ <: T]): Collection[T] = ???

    /** Returns an unmodifiable view of the specified list. */
    @stub
    def unmodifiableList[T](list: List[_ <: T]): List[T] = ???

    /** Returns an unmodifiable view of the specified map. */
    @stub
    def unmodifiableMap[K, V](m: Map[_ <: K, _ <: V]): Map[K, V] = ???

    /** Returns an unmodifiable view of the specified navigable map. */
    @stub
    def unmodifiableNavigableMap[K, V](m: NavigableMap[K, _ <: V]): NavigableMap[K, V] = ???

    /** Returns an unmodifiable view of the specified navigable set. */
    @stub
    def unmodifiableNavigableSet[T](s: NavigableSet[T]): NavigableSet[T] = ???

    /** Returns an unmodifiable view of the specified set. */
    @stub
    def unmodifiableSet[T](s: Set[_ <: T]): Set[T] = ???

    /** Returns an unmodifiable view of the specified sorted map. */
    @stub
    def unmodifiableSortedMap[K, V](m: SortedMap[K, _ <: V]): SortedMap[K, V] = ???

    /** Returns an unmodifiable view of the specified sorted set. */
    @stub
    def unmodifiableSortedSet[T](s: SortedSet[T]): SortedSet[T] = ???
}
