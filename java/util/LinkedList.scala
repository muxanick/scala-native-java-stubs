package java.util

import java.io.Serializable
import java.lang.{Cloneable, Object}

/** Doubly-linked list implementation of the List and Deque
 *  interfaces.  Implements all optional list operations, and permits all
 *  elements (including null).
 * 
 *  All of the operations perform as could be expected for a doubly-linked
 *  list.  Operations that index into the list will traverse the list from
 *  the beginning or the end, whichever is closer to the specified index.
 * 
 *  Note that this implementation is not synchronized.
 *  If multiple threads access a linked list concurrently, and at least
 *  one of the threads modifies the list structurally, it must be
 *  synchronized externally.  (A structural modification is any operation
 *  that adds or deletes one or more elements; merely setting the value of
 *  an element is not a structural modification.)  This is typically
 *  accomplished by synchronizing on some object that naturally
 *  encapsulates the list.
 * 
 *  If no such object exists, the list should be "wrapped" using the
 *  Collections.synchronizedList
 *  method.  This is best done at creation time, to prevent accidental
 *  unsynchronized access to the list:
 *    List list = Collections.synchronizedList(new LinkedList(...));
 * 
 *  The iterators returned by this class's iterator and
 *  listIterator methods are fail-fast: if the list is
 *  structurally modified at any time after the iterator is created, in
 *  any way except through the Iterator's own remove or
 *  add methods, the iterator will throw a ConcurrentModificationException.  Thus, in the face of concurrent
 *  modification, the iterator fails quickly and cleanly, rather than
 *  risking arbitrary, non-deterministic behavior at an undetermined
 *  time in the future.
 * 
 *  Note that the fail-fast behavior of an iterator cannot be guaranteed
 *  as it is, generally speaking, impossible to make any hard guarantees in the
 *  presence of unsynchronized concurrent modification.  Fail-fast iterators
 *  throw ConcurrentModificationException on a best-effort basis.
 *  Therefore, it would be wrong to write a program that depended on this
 *  exception for its correctness:   the fail-fast behavior of iterators
 *  should be used only to detect bugs.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class LinkedList[E] extends AbstractSequentialList[E] with List[E] with Deque[E] with Cloneable with Serializable {

    /** Constructs an empty list. */
    @stub
    def this() = ???

    /** Appends the specified element to the end of this list. */
    @stub
    def add(e: E): Boolean = ???

    /** Inserts the specified element at the specified position in this list. */
    @stub
    def add(index: Int, element: E): Unit = ???

    /** Appends all of the elements in the specified collection to the end of
     *  this list, in the order that they are returned by the specified
     *  collection's iterator.
     */
    @stub
    def addAll(c: Collection[_ <: E]): Boolean = ???

    /** Inserts all of the elements in the specified collection into this
     *  list, starting at the specified position.
     */
    @stub
    def addAll(index: Int, c: Collection[_ <: E]): Boolean = ???

    /** Inserts the specified element at the beginning of this list. */
    @stub
    def addFirst(e: E): Unit = ???

    /** Appends the specified element to the end of this list. */
    @stub
    def addLast(e: E): Unit = ???

    /** Removes all of the elements from this list. */
    @stub
    def clear(): Unit = ???

    /** Returns a shallow copy of this LinkedList. */
    @stub
    def clone(): Object = ???

    /** Returns true if this list contains the specified element. */
    @stub
    def contains(o: Object): Boolean = ???

    /** Returns an iterator over the elements in this deque in reverse
     *  sequential order.
     */
    @stub
    def descendingIterator(): Iterator[E] = ???

    /** Retrieves, but does not remove, the head (first element) of this list. */
    @stub
    def element(): E = ???

    /** Returns the element at the specified position in this list. */
    @stub
    def get(index: Int): E = ???

    /** Returns the first element in this list. */
    @stub
    def getFirst(): E = ???

    /** Returns the last element in this list. */
    @stub
    def getLast(): E = ???

    /** Returns the index of the first occurrence of the specified element
     *  in this list, or -1 if this list does not contain the element.
     */
    @stub
    def indexOf(o: Object): Int = ???

    /** Returns the index of the last occurrence of the specified element
     *  in this list, or -1 if this list does not contain the element.
     */
    @stub
    def lastIndexOf(o: Object): Int = ???

    /** Returns a list-iterator of the elements in this list (in proper
     *  sequence), starting at the specified position in the list.
     */
    @stub
    def listIterator(index: Int): ListIterator[E] = ???

    /** Adds the specified element as the tail (last element) of this list. */
    @stub
    def offer(e: E): Boolean = ???

    /** Inserts the specified element at the front of this list. */
    @stub
    def offerFirst(e: E): Boolean = ???

    /** Inserts the specified element at the end of this list. */
    @stub
    def offerLast(e: E): Boolean = ???

    /** Retrieves, but does not remove, the head (first element) of this list. */
    @stub
    def peek(): E = ???

    /** Retrieves, but does not remove, the first element of this list,
     *  or returns null if this list is empty.
     */
    @stub
    def peekFirst(): E = ???

    /** Retrieves, but does not remove, the last element of this list,
     *  or returns null if this list is empty.
     */
    @stub
    def peekLast(): E = ???

    /** Retrieves and removes the head (first element) of this list. */
    @stub
    def poll(): E = ???

    /** Retrieves and removes the first element of this list,
     *  or returns null if this list is empty.
     */
    @stub
    def pollFirst(): E = ???

    /** Retrieves and removes the last element of this list,
     *  or returns null if this list is empty.
     */
    @stub
    def pollLast(): E = ???

    /** Pops an element from the stack represented by this list. */
    @stub
    def pop(): E = ???

    /** Pushes an element onto the stack represented by this list. */
    @stub
    def push(e: E): Unit = ???

    /** Retrieves and removes the head (first element) of this list. */
    @stub
    def remove(): E = ???

    /** Removes the element at the specified position in this list. */
    @stub
    def remove(index: Int): E = ???

    /** Removes the first occurrence of the specified element from this list,
     *  if it is present.
     */
    @stub
    def remove(o: Object): Boolean = ???

    /** Removes and returns the first element from this list. */
    @stub
    def removeFirst(): E = ???

    /** Removes the first occurrence of the specified element in this
     *  list (when traversing the list from head to tail).
     */
    @stub
    def removeFirstOccurrence(o: Object): Boolean = ???

    /** Removes and returns the last element from this list. */
    @stub
    def removeLast(): E = ???

    /** Removes the last occurrence of the specified element in this
     *  list (when traversing the list from head to tail).
     */
    @stub
    def removeLastOccurrence(o: Object): Boolean = ???

    /** Replaces the element at the specified position in this list with the
     *  specified element.
     */
    @stub
    def set(index: Int, element: E): E = ???

    /** Returns the number of elements in this list. */
    @stub
    def size(): Int = ???

    /** Creates a late-binding
     *  and fail-fast Spliterator over the elements in this
     *  list.
     */
    @stub
    def spliterator(): Spliterator[E] = ???

    /** Returns an array containing all of the elements in this list
     *  in proper sequence (from first to last element).
     */
    @stub
    def toArray(): Array[Object] = ???
}
