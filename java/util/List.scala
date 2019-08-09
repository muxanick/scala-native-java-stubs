package java.util

import java.lang.Object
import java.util.function.UnaryOperator
import scala.scalanative.annotation.stub

/** An ordered collection (also known as a sequence).  The user of this
 *  interface has precise control over where in the list each element is
 *  inserted.  The user can access elements by their integer index (position in
 *  the list), and search for elements in the list.
 * 
 *  Unlike sets, lists typically allow duplicate elements.  More formally,
 *  lists typically allow pairs of elements e1 and e2
 *  such that e1.equals(e2), and they typically allow multiple
 *  null elements if they allow null elements at all.  It is not inconceivable
 *  that someone might wish to implement a list that prohibits duplicates, by
 *  throwing runtime exceptions when the user attempts to insert them, but we
 *  expect this usage to be rare.
 * 
 *  The List interface places additional stipulations, beyond those
 *  specified in the Collection interface, on the contracts of the
 *  iterator, add, remove, equals, and
 *  hashCode methods.  Declarations for other inherited methods are
 *  also included here for convenience.
 * 
 *  The List interface provides four methods for positional (indexed)
 *  access to list elements.  Lists (like Java arrays) are zero based.  Note
 *  that these operations may execute in time proportional to the index value
 *  for some implementations (the LinkedList class, for
 *  example). Thus, iterating over the elements in a list is typically
 *  preferable to indexing through it if the caller does not know the
 *  implementation.
 * 
 *  The List interface provides a special iterator, called a
 *  ListIterator, that allows element insertion and replacement, and
 *  bidirectional access in addition to the normal operations that the
 *  Iterator interface provides.  A method is provided to obtain a
 *  list iterator that starts at a specified position in the list.
 * 
 *  The List interface provides two methods to search for a specified
 *  object.  From a performance standpoint, these methods should be used with
 *  caution.  In many implementations they will perform costly linear
 *  searches.
 * 
 *  The List interface provides two methods to efficiently insert and
 *  remove multiple elements at an arbitrary point in the list.
 * 
 *  Note: While it is permissible for lists to contain themselves as elements,
 *  extreme caution is advised: the equals and hashCode
 *  methods are no longer well defined on such a list.
 * 
 *  Some list implementations have restrictions on the elements that
 *  they may contain.  For example, some implementations prohibit null elements,
 *  and some have restrictions on the types of their elements.  Attempting to
 *  add an ineligible element throws an unchecked exception, typically
 *  NullPointerException or ClassCastException.  Attempting
 *  to query the presence of an ineligible element may throw an exception,
 *  or it may simply return false; some implementations will exhibit the former
 *  behavior and some will exhibit the latter.  More generally, attempting an
 *  operation on an ineligible element whose completion would not result in
 *  the insertion of an ineligible element into the list may throw an
 *  exception or it may succeed, at the option of the implementation.
 *  Such exceptions are marked as "optional" in the specification for this
 *  interface.
 * 
 *  This interface is a member of the
 *  
 *  Java Collections Framework.
 */
trait List[E] extends Collection[E] {

    /** Appends the specified element to the end of this list (optional
     *  operation).
     */
    @stub
    def add(e: E): Boolean = ???

    /** Inserts the specified element at the specified position in this list
     *  (optional operation).
     */
    @stub
    def add(index: Int, element: E): Unit = ???

    /** Appends all of the elements in the specified collection to the end of
     *  this list, in the order that they are returned by the specified
     *  collection's iterator (optional operation).
     */
    @stub
    def addAll(c: Collection[_ <: E]): Boolean = ???

    /** Inserts all of the elements in the specified collection into this
     *  list at the specified position (optional operation).
     */
    @stub
    def addAll(index: Int, c: Collection[_ <: E]): Boolean = ???

    /** Removes all of the elements from this list (optional operation). */
    @stub
    def clear(): Unit = ???

    /** Returns true if this list contains the specified element. */
    @stub
    def contains(o: Object): Boolean = ???

    /** Returns true if this list contains all of the elements of the
     *  specified collection.
     */
    @stub
    def containsAll(c: Collection[_]): Boolean = ???

    /** Compares the specified object with this list for equality. */
    @stub
    def equals(o: Object): Boolean = ???

    /** Returns the element at the specified position in this list. */
    @stub
    def get(index: Int): E = ???

    /** Returns the hash code value for this list. */
    @stub
    def hashCode(): Int = ???

    /** Returns the index of the first occurrence of the specified element
     *  in this list, or -1 if this list does not contain the element.
     */
    @stub
    def indexOf(o: Object): Int = ???

    /** Returns true if this list contains no elements. */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns an iterator over the elements in this list in proper sequence. */
    @stub
    def iterator(): Iterator[E] = ???

    /** Returns the index of the last occurrence of the specified element
     *  in this list, or -1 if this list does not contain the element.
     */
    @stub
    def lastIndexOf(o: Object): Int = ???

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

    /** Removes the element at the specified position in this list (optional
     *  operation).
     */
    @stub
    def remove(index: Int): E = ???

    /** Removes the first occurrence of the specified element from this list,
     *  if it is present (optional operation).
     */
    @stub
    def remove(o: Object): Boolean = ???

    /** Removes from this list all of its elements that are contained in the
     *  specified collection (optional operation).
     */
    @stub
    def removeAll(c: Collection[_]): Boolean = ???

    /** Replaces each element of this list with the result of applying the
     *  operator to that element.
     */
    @stub
    def replaceAll(operator: UnaryOperator[E]): Unit = ???

    /** Retains only the elements in this list that are contained in the
     *  specified collection (optional operation).
     */
    @stub
    def retainAll(c: Collection[_]): Boolean = ???

    /** Replaces the element at the specified position in this list with the
     *  specified element (optional operation).
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

    /** Creates a Spliterator over the elements in this list. */
    @stub
    def spliterator(): Spliterator[E] = ???

    /** Returns a view of the portion of this list between the specified
     *  fromIndex, inclusive, and toIndex, exclusive.
     */
    @stub
    def subList(fromIndex: Int, toIndex: Int): List[E] = ???

    /** Returns an array containing all of the elements in this list in proper
     *  sequence (from first to last element).
     */
    @stub
    def toArray(): Array[Object] = ???

    /** Returns an array containing all of the elements in this list in
     *  proper sequence (from first to last element); the runtime type of
     *  the returned array is that of the specified array.
     */
    @stub
    def toArray[T](a: Array[T]): Array[T] = ???
}
