package java.util.concurrent

import java.io.Serializable
import java.lang.{Cloneable, Object}
import java.util.{Collection, Comparator, Iterator, List, ListIterator, RandomAccess, Spliterator}
import java.util.function.{Consumer, Predicate, UnaryOperator}

// A thread-safe variant of ArrayList in which all mutative
// operations (add, set, and so on) are implemented by
// making a fresh copy of the underlying array.
//
// This is ordinarily too costly, but may be more efficient
// than alternatives when traversal operations vastly outnumber
// mutations, and is useful when you cannot or don't want to
// synchronize traversals, yet need to preclude interference among
// concurrent threads.  The "snapshot" style iterator method uses a
// reference to the state of the array at the point that the iterator
// was created. This array never changes during the lifetime of the
// iterator, so interference is impossible and the iterator is
// guaranteed not to throw ConcurrentModificationException.
// The iterator will not reflect additions, removals, or changes to
// the list since the iterator was created.  Element-changing
// operations on iterators themselves (remove, set, and
// add) are not supported. These methods throw
// UnsupportedOperationException.
//
// All elements are permitted, including null.
//
// Memory consistency effects: As with other concurrent
// collections, actions in a thread prior to placing an object into a
// CopyOnWriteArrayList
// happen-before
// actions subsequent to the access or removal of that element from
// the CopyOnWriteArrayList in another thread.
//
// This class is a member of the
// 
// Java Collections Framework.
class CopyOnWriteArrayList[E] extends Object with List[E], with RandomAccess, with Cloneable, with Serializable {

    @stub
    // Creates an empty list.
    def this() = ???

    @stub
    // Creates a list containing the elements of the specified
    // collection, in the order they are returned by the collection's
    // iterator.
    def this(c: Collection[_ <: E]) = ???

    @stub
    // Appends the specified element to the end of this list.
    def add(e: E): Boolean = ???

    @stub
    // Inserts the specified element at the specified position in this
    // list.
    def add(index: Int, element: E): Unit = ???

    @stub
    // Appends all of the elements in the specified collection to the end
    // of this list, in the order that they are returned by the specified
    // collection's iterator.
    def addAll(c: Collection[_ <: E]): Boolean = ???

    @stub
    // Inserts all of the elements in the specified collection into this
    // list, starting at the specified position.
    def addAll(index: Int, c: Collection[_ <: E]): Boolean = ???

    @stub
    // Appends all of the elements in the specified collection that
    // are not already contained in this list, to the end of
    // this list, in the order that they are returned by the
    // specified collection's iterator.
    def addAllAbsent(c: Collection[_ <: E]): Int = ???

    @stub
    // Appends the element, if not present.
    def addIfAbsent(e: E): Boolean = ???

    @stub
    // Removes all of the elements from this list.
    def clear(): Unit = ???

    @stub
    // Returns a shallow copy of this list.
    def clone(): Object = ???

    @stub
    // Returns true if this list contains the specified element.
    def contains(o: Object): Boolean = ???

    @stub
    // Returns true if this list contains all of the elements of the
    // specified collection.
    def containsAll(c: Collection[_]): Boolean = ???

    @stub
    // Compares the specified object with this list for equality.
    def equals(o: Object): Boolean = ???

    @stub
    // Performs the given action for each element of the Iterable
    // until all elements have been processed or the action throws an
    // exception.
    def forEach(action: Consumer[_ >: E]): Unit = ???

    @stub
    // Returns the element at the specified position in this list.
    def get(index: Int): E = ???

    @stub
    // Returns the hash code value for this list.
    def hashCode(): Int = ???

    @stub
    // Returns the index of the first occurrence of the specified element in
    // this list, searching forwards from index, or returns -1 if
    // the element is not found.
    def indexOf(e: E, index: Int): Int = ???

    @stub
    // Returns the index of the first occurrence of the specified element
    // in this list, or -1 if this list does not contain the element.
    def indexOf(o: Object): Int = ???

    @stub
    // Returns true if this list contains no elements.
    def isEmpty(): Boolean = ???

    @stub
    // Returns an iterator over the elements in this list in proper sequence.
    def iterator(): Iterator[E] = ???

    @stub
    // Returns the index of the last occurrence of the specified element in
    // this list, searching backwards from index, or returns -1 if
    // the element is not found.
    def lastIndexOf(e: E, index: Int): Int = ???

    @stub
    // Returns the index of the last occurrence of the specified element
    // in this list, or -1 if this list does not contain the element.
    def lastIndexOf(o: Object): Int = ???

    @stub
    // Returns a list iterator over the elements in this list (in proper
    // sequence).
    def listIterator(): ListIterator[E] = ???

    @stub
    // Returns a list iterator over the elements in this list (in proper
    // sequence), starting at the specified position in the list.
    def listIterator(index: Int): ListIterator[E] = ???

    @stub
    // Removes the element at the specified position in this list.
    def remove(index: Int): E = ???

    @stub
    // Removes the first occurrence of the specified element from this list,
    // if it is present.
    def remove(o: Object): Boolean = ???

    @stub
    // Removes from this list all of its elements that are contained in
    // the specified collection.
    def removeAll(c: Collection[_]): Boolean = ???

    @stub
    // Removes all of the elements of this collection that satisfy the given
    // predicate.
    def removeIf(filter: Predicate[_ >: E]): Boolean = ???

    @stub
    // Replaces each element of this list with the result of applying the
    // operator to that element.
    def replaceAll(operator: UnaryOperator[E]): Unit = ???

    @stub
    // Retains only the elements in this list that are contained in the
    // specified collection.
    def retainAll(c: Collection[_]): Boolean = ???

    @stub
    // Replaces the element at the specified position in this list with the
    // specified element.
    def set(index: Int, element: E): E = ???

    @stub
    // Returns the number of elements in this list.
    def size(): Int = ???

    @stub
    // Sorts this list according to the order induced by the specified
    // Comparator.
    def sort(c: Comparator[_ >: E]): Unit = ???

    @stub
    // Returns a Spliterator over the elements in this list.
    def spliterator(): Spliterator[E] = ???

    @stub
    // Returns a view of the portion of this list between
    // fromIndex, inclusive, and toIndex, exclusive.
    def subList(fromIndex: Int, toIndex: Int): List[E] = ???

    @stub
    // Returns an array containing all of the elements in this list
    // in proper sequence (from first to last element).
    def toArray(): Array[Object] = ???

    @stub
    // Returns an array containing all of the elements in this list in
    // proper sequence (from first to last element); the runtime type of
    // the returned array is that of the specified array.
    def Array[T]: [T] = ???
}
