package java.util.concurrent

import java.io.Serializable
import java.lang.{Object, String}
import java.util.{AbstractCollection, AbstractQueue, Collection, Iterator, Spliterator}
import scala.scalanative.annotation.stub

/** An optionally-bounded blocking deque based on
 *  linked nodes.
 * 
 *  The optional capacity bound constructor argument serves as a
 *  way to prevent excessive expansion. The capacity, if unspecified,
 *  is equal to Integer.MAX_VALUE.  Linked nodes are
 *  dynamically created upon each insertion unless this would bring the
 *  deque above capacity.
 * 
 *  Most operations run in constant time (ignoring time spent
 *  blocking).  Exceptions include remove,
 *  removeFirstOccurrence, removeLastOccurrence, contains, iterator.remove(), and the bulk
 *  operations, all of which run in linear time.
 * 
 *  This class and its iterator implement all of the
 *  optional methods of the Collection and Iterator interfaces.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class LinkedBlockingDeque[E] extends AbstractQueue[E] with BlockingDeque[E] with Serializable {

    /** Creates a LinkedBlockingDeque with a capacity of
     *  Integer.MAX_VALUE.
     */
    @stub
    def this() = ???

    /** Creates a LinkedBlockingDeque with a capacity of
     *  Integer.MAX_VALUE, initially containing the elements of
     *  the given collection, added in traversal order of the
     *  collection's iterator.
     */
    @stub
    def this(c: Collection[_ <: E]) = ???

    /** Creates a LinkedBlockingDeque with the given (fixed) capacity. */
    @stub
    def this(capacity: Int) = ???

    /** Inserts the specified element at the end of this deque unless it would
     *  violate capacity restrictions.
     */
    @stub
    def add(e: E): Boolean = ???

    /** Inserts the specified element at the front of this deque if it is
     *  possible to do so immediately without violating capacity restrictions,
     *  throwing an IllegalStateException if no space is currently
     *  available.
     */
    @stub
    def addFirst(e: E): Unit = ???

    /** Inserts the specified element at the end of this deque if it is
     *  possible to do so immediately without violating capacity restrictions,
     *  throwing an IllegalStateException if no space is currently
     *  available.
     */
    @stub
    def addLast(e: E): Unit = ???

    /** Atomically removes all of the elements from this deque. */
    @stub
    def clear(): Unit = ???

    /** Returns true if this deque contains the specified element. */
    @stub
    def contains(o: Object): Boolean = ???

    /** Returns an iterator over the elements in this deque in reverse
     *  sequential order.
     */
    @stub
    def descendingIterator(): Iterator[E] = ???

    /** Removes all available elements from this queue and adds them
     *  to the given collection.
     */
    @stub
    def drainTo(c: Collection[_ >: E]): Int = ???

    /** Removes at most the given number of available elements from
     *  this queue and adds them to the given collection.
     */
    @stub
    def drainTo(c: Collection[_ >: E], maxElements: Int): Int = ???

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

    /** Returns an iterator over the elements in this deque in proper sequence. */
    @stub
    def iterator(): Iterator[E] = ???

    /** Inserts the specified element into the queue represented by this deque
     *  (in other words, at the tail of this deque) if it is possible to do so
     *  immediately without violating capacity restrictions, returning
     *  true upon success and false if no space is currently
     *  available.
     */
    @stub
    def offer(e: E): Boolean = ???

    /** Inserts the specified element into the queue represented by this deque
     *  (in other words, at the tail of this deque), waiting up to the
     *  specified wait time if necessary for space to become available.
     */
    @stub
    def offer(e: E, timeout: Long, unit: TimeUnit): Boolean = ???

    /** Inserts the specified element at the front of this deque if it is
     *  possible to do so immediately without violating capacity restrictions,
     *  returning true upon success and false if no space is
     *  currently available.
     */
    @stub
    def offerFirst(e: E): Boolean = ???

    /** Inserts the specified element at the front of this deque,
     *  waiting up to the specified wait time if necessary for space to
     *  become available.
     */
    @stub
    def offerFirst(e: E, timeout: Long, unit: TimeUnit): Boolean = ???

    /** Inserts the specified element at the end of this deque if it is
     *  possible to do so immediately without violating capacity restrictions,
     *  returning true upon success and false if no space is
     *  currently available.
     */
    @stub
    def offerLast(e: E): Boolean = ???

    /** Inserts the specified element at the end of this deque,
     *  waiting up to the specified wait time if necessary for space to
     *  become available.
     */
    @stub
    def offerLast(e: E, timeout: Long, unit: TimeUnit): Boolean = ???

    /** Retrieves, but does not remove, the head of the queue represented by
     *  this deque (in other words, the first element of this deque), or
     *  returns null if this deque is empty.
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

    /** Retrieves and removes the head of the queue represented by this deque
     *  (in other words, the first element of this deque), waiting up to the
     *  specified wait time if necessary for an element to become available.
     */
    @stub
    def poll(timeout: Long, unit: TimeUnit): E = ???

    /** Retrieves and removes the first element of this deque,
     *  or returns null if this deque is empty.
     */
    @stub
    def pollFirst(): E = ???

    /** Retrieves and removes the first element of this deque, waiting
     *  up to the specified wait time if necessary for an element to
     *  become available.
     */
    @stub
    def pollFirst(timeout: Long, unit: TimeUnit): E = ???

    /** Retrieves and removes the last element of this deque,
     *  or returns null if this deque is empty.
     */
    @stub
    def pollLast(): E = ???

    /** Retrieves and removes the last element of this deque, waiting
     *  up to the specified wait time if necessary for an element to
     *  become available.
     */
    @stub
    def pollLast(timeout: Long, unit: TimeUnit): E = ???

    /** Pops an element from the stack represented by this deque. */
    @stub
    def pop(): E = ???

    /** Pushes an element onto the stack represented by this deque (in other
     *  words, at the head of this deque) if it is possible to do so
     *  immediately without violating capacity restrictions, throwing an
     *  IllegalStateException if no space is currently available.
     */
    @stub
    def push(e: E): Unit = ???

    /** Inserts the specified element into the queue represented by this deque
     *  (in other words, at the tail of this deque), waiting if necessary for
     *  space to become available.
     */
    @stub
    def put(e: E): Unit = ???

    /** Inserts the specified element at the front of this deque,
     *  waiting if necessary for space to become available.
     */
    @stub
    def putFirst(e: E): Unit = ???

    /** Inserts the specified element at the end of this deque,
     *  waiting if necessary for space to become available.
     */
    @stub
    def putLast(e: E): Unit = ???

    /** Returns the number of additional elements that this deque can ideally
     *  (in the absence of memory or resource constraints) accept without
     *  blocking.
     */
    @stub
    def remainingCapacity(): Int = ???

    /** Retrieves and removes the head of the queue represented by this deque. */
    @stub
    def remove(): E = ???

    /** Removes the first occurrence of the specified element from this deque. */
    @stub
    def remove(o: Object): Boolean = ???

    /** Retrieves and removes the first element of this deque. */
    @stub
    def removeFirst(): E = ???

    /** Removes the first occurrence of the specified element from this deque. */
    @stub
    def removeFirstOccurrence(o: Object): Boolean = ???

    /** Retrieves and removes the last element of this deque. */
    @stub
    def removeLast(): E = ???

    /** Removes the last occurrence of the specified element from this deque. */
    @stub
    def removeLastOccurrence(o: Object): Boolean = ???

    /** Returns the number of elements in this deque. */
    @stub
    def size(): Int = ???

    /** Returns a Spliterator over the elements in this deque. */
    @stub
    def spliterator(): Spliterator[E] = ???

    /** Retrieves and removes the head of the queue represented by this deque
     *  (in other words, the first element of this deque), waiting if
     *  necessary until an element becomes available.
     */
    @stub
    def take(): E = ???

    /** Retrieves and removes the first element of this deque, waiting
     *  if necessary until an element becomes available.
     */
    @stub
    def takeFirst(): E = ???

    /** Retrieves and removes the last element of this deque, waiting
     *  if necessary until an element becomes available.
     */
    @stub
    def takeLast(): E = ???

    /** Returns an array containing all of the elements in this deque, in
     *  proper sequence (from first to last element).
     */
    @stub
    def toArray(): Array[Object] = ???

    /** Returns an array containing all of the elements in this deque, in
     *  proper sequence; the runtime type of the returned array is that of
     *  the specified array.
     */
    @stub
    def toArray[T](a: Array[T]): Array[T] = ???

    /** Returns a string representation of this collection. */
    @stub
    def toString(): String = ???
}
