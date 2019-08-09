package java.util

import java.io.Serializable
import java.lang.{Cloneable, Object}
import java.util.function.{Consumer, Predicate, UnaryOperator}
import scala.scalanative.annotation.stub

/** Resizable-array implementation of the List interface.  Implements
 *  all optional list operations, and permits all elements, including
 *  null.  In addition to implementing the List interface,
 *  this class provides methods to manipulate the size of the array that is
 *  used internally to store the list.  (This class is roughly equivalent to
 *  Vector, except that it is unsynchronized.)
 * 
 *  The size, isEmpty, get, set,
 *  iterator, and listIterator operations run in constant
 *  time.  The add operation runs in amortized constant time,
 *  that is, adding n elements requires O(n) time.  All of the other operations
 *  run in linear time (roughly speaking).  The constant factor is low compared
 *  to that for the LinkedList implementation.
 * 
 *  Each ArrayList instance has a capacity.  The capacity is
 *  the size of the array used to store the elements in the list.  It is always
 *  at least as large as the list size.  As elements are added to an ArrayList,
 *  its capacity grows automatically.  The details of the growth policy are not
 *  specified beyond the fact that adding an element has constant amortized
 *  time cost.
 * 
 *  An application can increase the capacity of an ArrayList instance
 *  before adding a large number of elements using the ensureCapacity
 *  operation.  This may reduce the amount of incremental reallocation.
 * 
 *  Note that this implementation is not synchronized.
 *  If multiple threads access an ArrayList instance concurrently,
 *  and at least one of the threads modifies the list structurally, it
 *  must be synchronized externally.  (A structural modification is
 *  any operation that adds or deletes one or more elements, or explicitly
 *  resizes the backing array; merely setting the value of an element is not
 *  a structural modification.)  This is typically accomplished by
 *  synchronizing on some object that naturally encapsulates the list.
 * 
 *  If no such object exists, the list should be "wrapped" using the
 *  Collections.synchronizedList
 *  method.  This is best done at creation time, to prevent accidental
 *  unsynchronized access to the list:
 *    List list = Collections.synchronizedList(new ArrayList(...));
 * 
 *  
 *  The iterators returned by this class's iterator and
 *  listIterator methods are fail-fast:
 *  if the list is structurally modified at any time after the iterator is
 *  created, in any way except through the iterator's own
 *  remove or
 *  add methods, the iterator will throw a
 *  ConcurrentModificationException.  Thus, in the face of
 *  concurrent modification, the iterator fails quickly and cleanly, rather
 *  than risking arbitrary, non-deterministic behavior at an undetermined
 *  time in the future.
 * 
 *  Note that the fail-fast behavior of an iterator cannot be guaranteed
 *  as it is, generally speaking, impossible to make any hard guarantees in the
 *  presence of unsynchronized concurrent modification.  Fail-fast iterators
 *  throw ConcurrentModificationException on a best-effort basis.
 *  Therefore, it would be wrong to write a program that depended on this
 *  exception for its correctness:  the fail-fast behavior of iterators
 *  should be used only to detect bugs.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class ArrayList[E] extends AbstractList[E] with List[E] with RandomAccess with Cloneable with Serializable {

    /** Constructs an empty list with an initial capacity of ten. */
    @stub
    def this() = ???

    /** Constructs a list containing the elements of the specified
     *  collection, in the order they are returned by the collection's
     *  iterator.
     */
    @stub
    def this(c: Collection[_ <: E]) = ???

    /** Constructs an empty list with the specified initial capacity. */
    @stub
    def this(initialCapacity: Int) = ???

    /** Appends the specified element to the end of this list. */
    @stub
    def add(e: E): Boolean = ???

    /** Inserts the specified element at the specified position in this
     *  list.
     */
    @stub
    def add(index: Int, element: E): Unit = ???

    /** Appends all of the elements in the specified collection to the end of
     *  this list, in the order that they are returned by the
     *  specified collection's Iterator.
     */
    @stub
    def addAll(c: Collection[_ <: E]): Boolean = ???

    /** Inserts all of the elements in the specified collection into this
     *  list, starting at the specified position.
     */
    @stub
    def addAll(index: Int, c: Collection[_ <: E]): Boolean = ???

    /** Removes all of the elements from this list. */
    @stub
    def clear(): Unit = ???

    /** Returns a shallow copy of this ArrayList instance. */
    @stub
    def clone(): Object = ???

    /** Returns true if this list contains the specified element. */
    @stub
    def contains(o: Object): Boolean = ???

    /** Increases the capacity of this ArrayList instance, if
     *  necessary, to ensure that it can hold at least the number of elements
     *  specified by the minimum capacity argument.
     */
    @stub
    def ensureCapacity(minCapacity: Int): Unit = ???

    /** Performs the given action for each element of the Iterable
     *  until all elements have been processed or the action throws an
     *  exception.
     */
    @stub
    def forEach(action: Consumer[_ >: E]): Unit = ???

    /** Returns the element at the specified position in this list. */
    @stub
    def get(index: Int): E = ???

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

    /** Removes the element at the specified position in this list. */
    @stub
    def remove(index: Int): E = ???

    /** Removes the first occurrence of the specified element from this list,
     *  if it is present.
     */
    @stub
    def remove(o: Object): Boolean = ???

    /** Removes from this list all of its elements that are contained in the
     *  specified collection.
     */
    @stub
    def removeAll(c: Collection[_]): Boolean = ???

    /** Removes all of the elements of this collection that satisfy the given
     *  predicate.
     */
    @stub
    def removeIf(filter: Predicate[_ >: E]): Boolean = ???

    /** Removes from this list all of the elements whose index is between
     *  fromIndex, inclusive, and toIndex, exclusive.
     */
    @stub
    protected def removeRange(fromIndex: Int, toIndex: Int): Unit = ???

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

    /** Replaces the element at the specified position in this list with
     *  the specified element.
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

    /** Creates a late-binding
     *  and fail-fast Spliterator over the elements in this
     *  list.
     */
    @stub
    def spliterator(): Spliterator[E] = ???

    /** Returns a view of the portion of this list between the specified
     *  fromIndex, inclusive, and toIndex, exclusive.
     */
    @stub
    def subList(fromIndex: Int, toIndex: Int): List[E] = ???

    /** Returns an array containing all of the elements in this list
     *  in proper sequence (from first to last element).
     */
    @stub
    def toArray(): Array[Object] = ???

    /** Returns an array containing all of the elements in this list in proper
     *  sequence (from first to last element); the runtime type of the returned
     *  array is that of the specified array.
     */
    @stub
    def toArray[T](a: Array[T]): Array[T] = ???

    /** Trims the capacity of this ArrayList instance to be the
     *  list's current size.
     */
    @stub
    def trimToSize(): Unit = ???
}
