package java.util

import java.io.Serializable
import java.lang.{Cloneable, Object}

/** Resizable-array implementation of the Deque interface.  Array
 *  deques have no capacity restrictions; they grow as necessary to support
 *  usage.  They are not thread-safe; in the absence of external
 *  synchronization, they do not support concurrent access by multiple threads.
 *  Null elements are prohibited.  This class is likely to be faster than
 *  Stack when used as a stack, and faster than LinkedList
 *  when used as a queue.
 * 
 *  Most ArrayDeque operations run in amortized constant time.
 *  Exceptions include remove, removeFirstOccurrence, removeLastOccurrence, contains, iterator.remove(), and the bulk operations, all of which run in linear
 *  time.
 * 
 *  The iterators returned by this class's iterator method are
 *  fail-fast: If the deque is modified at any time after the iterator
 *  is created, in any way except through the iterator's own remove
 *  method, the iterator will generally throw a ConcurrentModificationException.  Thus, in the face of concurrent
 *  modification, the iterator fails quickly and cleanly, rather than risking
 *  arbitrary, non-deterministic behavior at an undetermined time in the
 *  future.
 * 
 *  Note that the fail-fast behavior of an iterator cannot be guaranteed
 *  as it is, generally speaking, impossible to make any hard guarantees in the
 *  presence of unsynchronized concurrent modification.  Fail-fast iterators
 *  throw ConcurrentModificationException on a best-effort basis.
 *  Therefore, it would be wrong to write a program that depended on this
 *  exception for its correctness: the fail-fast behavior of iterators
 *  should be used only to detect bugs.
 * 
 *  This class and its iterator implement all of the
 *  optional methods of the Collection and Iterator interfaces.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class ArrayDeque[E] extends AbstractCollection[E] with Deque[E] with Cloneable with Serializable {

    /** Constructs an empty array deque with an initial capacity
     *  sufficient to hold 16 elements.
     */
    @stub
    def this() = ???

    /** Constructs a deque containing the elements of the specified
     *  collection, in the order they are returned by the collection's
     *  iterator.
     */
    @stub
    def this(c: Collection[_ <: E]) = ???

    /** Inserts the specified element at the end of this deque. */
    @stub
    def add(e: E): Boolean = ???

    /** Inserts the specified element at the front of this deque. */
    @stub
    def addFirst(e: E): Unit = ???

    /** Inserts the specified element at the end of this deque. */
    @stub
    def addLast(e: E): Unit = ???

    /** Removes all of the elements from this deque. */
    @stub
    def clear(): Unit = ???

    /** Returns a copy of this deque. */
    @stub
    def clone(): ArrayDeque[E] = ???

    /** Returns true if this deque contains the specified element. */
    @stub
    def contains(o: Object): Boolean = ???

    /** Returns an iterator over the elements in this deque in reverse
     *  sequential order.
     */
    @stub
    def descendingIterator(): Iterator[E] = ???

    /** Retrieves, but does not remove, the head of the queue represented by
     *  this deque.
     */
    @stub
    def element(): E = ???

    /** Retrieves, but does not remove, the first element of this deque. */
    @stub
    def getFirst(): E = ???

    /** Retrieves, but does not remove, the last element of this deque. */
    @stub
    def getLast(): E = ???

    /** Returns true if this deque contains no elements. */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns an iterator over the elements in this deque. */
    @stub
    def iterator(): Iterator[E] = ???

    /** Inserts the specified element at the end of this deque. */
    @stub
    def offer(e: E): Boolean = ???

    /** Inserts the specified element at the front of this deque. */
    @stub
    def offerFirst(e: E): Boolean = ???

    /** Inserts the specified element at the end of this deque. */
    @stub
    def offerLast(e: E): Boolean = ???

    /** Retrieves, but does not remove, the head of the queue represented by
     *  this deque, or returns null if this deque is empty.
     */
    @stub
    def peek(): E = ???

    /** Retrieves, but does not remove, the first element of this deque,
     *  or returns null if this deque is empty.
     */
    @stub
    def peekFirst(): E = ???

    /** Retrieves, but does not remove, the last element of this deque,
     *  or returns null if this deque is empty.
     */
    @stub
    def peekLast(): E = ???

    /** Retrieves and removes the head of the queue represented by this deque
     *  (in other words, the first element of this deque), or returns
     *  null if this deque is empty.
     */
    @stub
    def poll(): E = ???

    /** Retrieves and removes the first element of this deque,
     *  or returns null if this deque is empty.
     */
    @stub
    def pollFirst(): E = ???

    /** Retrieves and removes the last element of this deque,
     *  or returns null if this deque is empty.
     */
    @stub
    def pollLast(): E = ???

    /** Pops an element from the stack represented by this deque. */
    @stub
    def pop(): E = ???

    /** Pushes an element onto the stack represented by this deque. */
    @stub
    def push(e: E): Unit = ???

    /** Retrieves and removes the head of the queue represented by this deque. */
    @stub
    def remove(): E = ???

    /** Removes a single instance of the specified element from this deque. */
    @stub
    def remove(o: Object): Boolean = ???

    /** Retrieves and removes the first element of this deque. */
    @stub
    def removeFirst(): E = ???

    /** Removes the first occurrence of the specified element in this
     *  deque (when traversing the deque from head to tail).
     */
    @stub
    def removeFirstOccurrence(o: Object): Boolean = ???

    /** Retrieves and removes the last element of this deque. */
    @stub
    def removeLast(): E = ???

    /** Removes the last occurrence of the specified element in this
     *  deque (when traversing the deque from head to tail).
     */
    @stub
    def removeLastOccurrence(o: Object): Boolean = ???

    /** Returns the number of elements in this deque. */
    @stub
    def size(): Int = ???

    /** Creates a late-binding
     *  and fail-fast Spliterator over the elements in this
     *  deque.
     */
    @stub
    def spliterator(): Spliterator[E] = ???

    /** Returns an array containing all of the elements in this deque
     *  in proper sequence (from first to last element).
     */
    @stub
    def toArray(): Array[Object] = ???
}
