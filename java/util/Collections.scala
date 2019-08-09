package java.util

import java.lang.{Boolean, Class, Comparable, Object}

// This class consists exclusively of static methods that operate on or return
// collections.  It contains polymorphic algorithms that operate on
// collections, "wrappers", which return a new collection backed by a
// specified collection, and a few other odds and ends.
//
// The methods of this class all throw a NullPointerException
// if the collections or class objects provided to them are null.
//
// The documentation for the polymorphic algorithms contained in this class
// generally includes a brief description of the implementation.  Such
// descriptions should be regarded as implementation notes, rather than
// parts of the specification.  Implementors should feel free to
// substitute other algorithms, so long as the specification itself is adhered
// to.  (For example, the algorithm used by sort does not have to be
// a mergesort, but it does have to be stable.)
//
// The "destructive" algorithms contained in this class, that is, the
// algorithms that modify the collection on which they operate, are specified
// to throw UnsupportedOperationException if the collection does not
// support the appropriate mutation primitive(s), such as the set
// method.  These algorithms may, but are not required to, throw this
// exception if an invocation would have no effect on the collection.  For
// example, invoking the sort method on an unmodifiable list that is
// already sorted may or may not throw UnsupportedOperationException.
//
// This class is a member of the
// 
// Java Collections Framework.
class Collections extends Object {
}

object Collections {
    @stub
    // The empty list (immutable).
    def EMPTY_LIST: List = ???

    @stub
    // The empty map (immutable).
    def EMPTY_MAP: Map = ???

    @stub
    // Adds all of the specified elements to the specified collection.
    def Boolean: [T] = ???

    @stub
    // Returns a view of a Deque as a Last-in-first-out (Lifo)
    // Queue.
    def Queue[T]: [T] = ???

    @stub
    // Searches the specified list for the specified object using the binary
    // search algorithm.
    def Int: [T] = ???

    @stub
    // Searches the specified list for the specified object using the binary
    // search algorithm.
    def Int: [T] = ???

    @stub
    // Returns a dynamically typesafe view of the specified collection.
    def Collection[E]: [E] = ???

    @stub
    // Returns a dynamically typesafe view of the specified list.
    def List[E]: [E] = ???

    @stub
    // Returns a dynamically typesafe view of the specified map.
    def Map[K, V]: [K, V] = ???

    @stub
    // Returns a dynamically typesafe view of the specified navigable map.
    def NavigableMap[K, V]: [K, V] = ???

    @stub
    // Returns a dynamically typesafe view of the specified navigable set.
    def NavigableSet[E]: [E] = ???

    @stub
    // Returns a dynamically typesafe view of the specified queue.
    def Queue[E]: [E] = ???

    @stub
    // Returns a dynamically typesafe view of the specified set.
    def Set[E]: [E] = ???

    @stub
    // Returns a dynamically typesafe view of the specified sorted map.
    def SortedMap[K, V]: [K, V] = ???

    @stub
    // Returns a dynamically typesafe view of the specified sorted set.
    def SortedSet[E]: [E] = ???

    @stub
    // Copies all of the elements from one list into another.
    def Unit: [T] = ???

    @stub
    // Returns true if the two specified collections have no
    // elements in common.
    def disjoint(c1: Collection[_], c2: Collection[_]): Boolean = ???

    @stub
    // Returns an enumeration that has no elements.
    def Enumeration[T]: [T] = ???

    @stub
    // Returns an iterator that has no elements.
    def Iterator[T]: [T] = ???

    @stub
    // Returns an empty list (immutable).
    def List[T]: [T] = ???

    @stub
    // Returns a list iterator that has no elements.
    def ListIterator[T]: [T] = ???

    @stub
    // Returns an empty map (immutable).
    def Map[K, V]: [K, V] = ???

    @stub
    // Returns an empty navigable map (immutable).
    def NavigableMap[K, V]: [K, V] = ???

    @stub
    // Returns an empty navigable set (immutable).
    def NavigableSet[E]: [E] = ???

    @stub
    // Returns an empty set (immutable).
    def Set[T]: [T] = ???

    @stub
    // Returns an empty sorted map (immutable).
    def SortedMap[K, V]: [K, V] = ???

    @stub
    // Returns an empty sorted set (immutable).
    def SortedSet[E]: [E] = ???

    @stub
    // Returns an enumeration over the specified collection.
    def Enumeration[T]: [T] = ???

    @stub
    // Replaces all of the elements of the specified list with the specified
    // element.
    def Unit: [T] = ???

    @stub
    // Returns the number of elements in the specified collection equal to the
    // specified object.
    def frequency(c: Collection[_], o: Object): Int = ???

    @stub
    // Returns the starting position of the first occurrence of the specified
    // target list within the specified source list, or -1 if there is no
    // such occurrence.
    def indexOfSubList(source: List[_], target: List[_]): Int = ???

    @stub
    // Returns the starting position of the last occurrence of the specified
    // target list within the specified source list, or -1 if there is no such
    // occurrence.
    def lastIndexOfSubList(source: List[_], target: List[_]): Int = ???

    @stub
    // Returns an array list containing the elements returned by the
    // specified enumeration in the order they are returned by the
    // enumeration.
    def ArrayList[T]: [T] = ???

    @stub
    // Returns the maximum element of the given collection, according to the
    // natural ordering of its elements.
    def T: [T <: Object, with, Comparable[_ >: T]] = ???

    @stub
    // Returns the maximum element of the given collection, according to the
    // order induced by the specified comparator.
    def T: [T] = ???

    @stub
    // Returns the minimum element of the given collection, according to the
    // natural ordering of its elements.
    def T: [T <: Object, with, Comparable[_ >: T]] = ???

    @stub
    // Returns the minimum element of the given collection, according to the
    // order induced by the specified comparator.
    def T: [T] = ???

    @stub
    // Returns an immutable list consisting of n copies of the
    // specified object.
    def List[T]: [T] = ???

    @stub
    // Returns a set backed by the specified map.
    def Set[E]: [E] = ???

    @stub
    // Replaces all occurrences of one specified value in a list with another.
    def Boolean: [T] = ???

    @stub
    // Reverses the order of the elements in the specified list.
    def reverse(list: List[_]): Unit = ???

    @stub
    // Returns a comparator that imposes the reverse of the natural
    // ordering on a collection of objects that implement the
    // Comparable interface.
    def Comparator[T]: [T] = ???

    @stub
    // Returns a comparator that imposes the reverse ordering of the specified
    // comparator.
    def Comparator[T]: [T] = ???

    @stub
    // Rotates the elements in the specified list by the specified distance.
    def rotate(list: List[_], distance: Int): Unit = ???

    @stub
    // Randomly permutes the specified list using a default source of
    // randomness.
    def shuffle(list: List[_]): Unit = ???

    @stub
    // Randomly permute the specified list using the specified source of
    // randomness.
    def shuffle(list: List[_], rnd: Random): Unit = ???

    @stub
    // Returns an immutable set containing only the specified object.
    def Set[T]: [T] = ???

    @stub
    // Returns an immutable list containing only the specified object.
    def List[T]: [T] = ???

    @stub
    // Returns an immutable map, mapping only the specified key to the
    // specified value.
    def Map[K, V]: [K, V] = ???

    @stub
    // Sorts the specified list into ascending order, according to the
    // natural ordering of its elements.
    def Unit: [T <: Comparable[_ >: T]] = ???

    @stub
    // Sorts the specified list according to the order induced by the
    // specified comparator.
    def Unit: [T] = ???

    @stub
    // Swaps the elements at the specified positions in the specified list.
    def swap(list: List[_], i: Int, j: Int): Unit = ???

    @stub
    // Returns a synchronized (thread-safe) collection backed by the specified
    // collection.
    def Collection[T]: [T] = ???

    @stub
    // Returns a synchronized (thread-safe) list backed by the specified
    // list.
    def List[T]: [T] = ???

    @stub
    // Returns a synchronized (thread-safe) map backed by the specified
    // map.
    def Map[K, V]: [K, V] = ???

    @stub
    // Returns a synchronized (thread-safe) navigable map backed by the
    // specified navigable map.
    def NavigableMap[K, V]: [K, V] = ???

    @stub
    // Returns a synchronized (thread-safe) navigable set backed by the
    // specified navigable set.
    def NavigableSet[T]: [T] = ???

    @stub
    // Returns a synchronized (thread-safe) set backed by the specified
    // set.
    def Set[T]: [T] = ???

    @stub
    // Returns a synchronized (thread-safe) sorted map backed by the specified
    // sorted map.
    def SortedMap[K, V]: [K, V] = ???

    @stub
    // Returns a synchronized (thread-safe) sorted set backed by the specified
    // sorted set.
    def SortedSet[T]: [T] = ???

    @stub
    // Returns an unmodifiable view of the specified collection.
    def Collection[T]: [T] = ???

    @stub
    // Returns an unmodifiable view of the specified list.
    def List[T]: [T] = ???

    @stub
    // Returns an unmodifiable view of the specified map.
    def Map[K, V]: [K, V] = ???

    @stub
    // Returns an unmodifiable view of the specified navigable map.
    def NavigableMap[K, V]: [K, V] = ???

    @stub
    // Returns an unmodifiable view of the specified navigable set.
    def NavigableSet[T]: [T] = ???

    @stub
    // Returns an unmodifiable view of the specified set.
    def Set[T]: [T] = ???

    @stub
    // Returns an unmodifiable view of the specified sorted map.
    def SortedMap[K, V]: [K, V] = ???
}
