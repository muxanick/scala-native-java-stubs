package java.util.concurrent

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import java.util.{Collection, Comparator, Iterator, List, ListIterator, RandomAccess, Spliterator}
import java.util.function.{Consumer, Predicate, UnaryOperator}
import scala.scalanative.annotation.stub

/** A thread-safe variant of ArrayList in which all mutative
 *  operations (add, set, and so on) are implemented by
 *  making a fresh copy of the underlying array.
 * 
 *  This is ordinarily too costly, but may be more efficient
 *  than alternatives when traversal operations vastly outnumber
 *  mutations, and is useful when you cannot or don't want to
 *  synchronize traversals, yet need to preclude interference among
 *  concurrent threads.  The "snapshot" style iterator method uses a
 *  reference to the state of the array at the point that the iterator
 *  was created. This array never changes during the lifetime of the
 *  iterator, so interference is impossible and the iterator is
 *  guaranteed not to throw ConcurrentModificationException.
 *  The iterator will not reflect additions, removals, or changes to
 *  the list since the iterator was created.  Element-changing
 *  operations on iterators themselves (remove, set, and
 *  add) are not supported. These methods throw
 *  UnsupportedOperationException.
 * 
 *  All elements are permitted, including null.
 * 
 *  Memory consistency effects: As with other concurrent
 *  collections, actions in a thread prior to placing an object into a
 *  CopyOnWriteArrayList
 *  happen-before
 *  actions subsequent to the access or removal of that element from
 *  the CopyOnWriteArrayList in another thread.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class CopyOnWriteArrayList[E] extends Object with List[E] with RandomAccess with Cloneable with Serializable {

    /** Creates an empty list. */
    @stub
    def this() = ???

    /** Creates a list containing the elements of the specified
     *  collection, in the order they are returned by the collection's
     *  iterator.
     */
    @stub
    def this(c: Collection[_ <: E]) = ???

    /** Creates a list holding a copy of the given array. */
    @stub
    def this(toCopyIn: Array[E]) = ???

    /** Appends the specified element to the end of this list. */
    @stub
    def add(e: E): Boolean = ???

    /** Inserts the specified element at the specified position in this
     *  list.
     */
    @stub
    def add(index: Int, element: E): Unit = ???

    /** Appends all of the elements in the specified collection to the end
     *  of this list, in the order that they are returned by the specified
     *  collection's iterator.
     */
    @stub
    def addAll(c: Collection[_ <: E]): Boolean = ???

    /** Inserts all of the elements in the specified collection into this
     *  list, starting at the specified position.
     */
    @stub
    def addAll(index: Int, c: Collection[_ <: E]): Boolean = ???

    /** Appends all of the elements in the specified collection that
     *  are not already contained in this list, to the end of
     *  this list, in the order that they are returned by the
     *  specified collection's iterator.
     */
    @stub
    def addAllAbsent(c: Collection[_ <: E]): Int = ???

    /** Appends the element, if not present. */
    @stub
    def addIfAbsent(e: E): Boolean = ???

    /** Removes all of the elements from this list. */
    @stub
    def clear(): Unit = ???

    /** Returns a shallow copy of this list. */
    @stub
    def clone(): Any = ???

    /** Returns true if this list contains the specified element. */
    @stub
    def contains(o: Any): Boolean = ???

    /** Returns true if this list contains all of the elements of the
     *  specified collection.
     */
    @stub
    def containsAll(c: Collection[_]): Boolean = ???

    /** Compares the specified object with this list for equality. */
    @stub
    def equals(o: Any): Boolean = ???

    /** Performs the given action for each element of the Iterable
     *  until all elements have been processed or the action throws an
     *  exception.
     */
    @stub
    def forEach(action: Consumer[_ >: E]): Unit = ???

    /** Returns the element at the specified position in this list. */
    @stub
    def get(index: Int): E = ???

    /** Returns the hash code value for this list. */
    @stub
    def hashCode(): Int = ???

    /** Returns the index of the first occurrence of the specified element in
     *  this list, searching forwards from index, or returns -1 if
     *  the element is not found.
     */
    @stub
    def indexOf(e: E, index: Int): Int = ???

    /** Returns the index of the first occurrence of the specified element
     *  in this list, or -1 if this list does not contain the element.
     */
    @stub
    def indexOf(o: Any): Int = ???

    /** Returns true if this list contains no elements. */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns an iterator over the elements in this list in proper sequence. */
    @stub
    def iterator(): Iterator[E] = ???

    /** Returns the index of the last occurrence of the specified element in
     *  this list, searching backwards from index, or returns -1 if
     *  the element is not found.
     */
    @stub
    def lastIndexOf(e: E, index: Int): Int = ???

    /** Returns the index of the last occurrence of the specified element
     *  in this list, or -1 if this list does not contain the element.
     */
    @stub
    def lastIndexOf(o: Any): Int = ???

    /** Returns a list iterator over the elements in this list (in proper
     *  sequence).
     */
    @stub
    def listIterator(): ListIterator[E] = ???

    /** Returns a list iterator over the elements in this list (in proper
     *  sequence), starting at the specified position in the list.
     */
    @stub
    def listIterator(index: Int): ListIterator[E] = ???

    /** Removes the element at the specified position in this list. */
    @stub
    def remove(index: Int): E = ???

    /** Removes the first occurrence of the specified element from this list,
     *  if it is present.
     */
    @stub
    def remove(o: Any): Boolean = ???

    /** Removes from this list all of its elements that are contained in
     *  the specified collection.
     */
    @stub
    def removeAll(c: Collection[_]): Boolean = ???

    /** Removes all of the elements of this collection that satisfy the given
     *  predicate.
     */
    @stub
    def removeIf(filter: Predicate[_ >: E]): Boolean = ???

    /** Replaces each element of this list with the result of applying the
     *  operator to that element.
     */
    @stub
    def replaceAll(operator: UnaryOperator[E]): Unit = ???

    /** Retains only the elements in this list that are contained in the
     *  specified collection.
     */
    @stub
    def retainAll(c: Collection[_]): Boolean = ???

    /** Replaces the element at the specified position in this list with the
     *  specified element.
     */
    @stub
    def set(index: Int, element: E): E = ???

    /** Returns the number of elements in this list. */
    @stub
    def size(): Int = ???

    /** Sorts this list according to the order induced by the specified
     *  Comparator.
     */
    @stub
    def sort(c: Comparator[_ >: E]): Unit = ???

    /** Returns a Spliterator over the elements in this list. */
    @stub
    def spliterator(): Spliterator[E] = ???

    /** Returns a view of the portion of this list between
     *  fromIndex, inclusive, and toIndex, exclusive.
     */
    @stub
    def subList(fromIndex: Int, toIndex: Int): List[E] = ???

    /** Returns an array containing all of the elements in this list
     *  in proper sequence (from first to last element).
     */
    @stub
    def toArray(): Array[Object] = ???

    /** Returns an array containing all of the elements in this list in
     *  proper sequence (from first to last element); the runtime type of
     *  the returned array is that of the specified array.
     */
    @stub
    def toArray[T](a: Array[T]): Array[T] = ???

    /** Returns a string representation of this list. */
    @stub
    def toString(): String = ???
}
