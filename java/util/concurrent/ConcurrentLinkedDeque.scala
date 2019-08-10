package java.util.concurrent

import java.io.Serializable
import java.lang.Object
import java.util.{AbstractCollection, Collection, Deque, Iterator, Spliterator}
import scala.scalanative.annotation.stub

/** An unbounded concurrent deque based on linked nodes.
 *  Concurrent insertion, removal, and access operations execute safely
 *  across multiple threads.
 *  A ConcurrentLinkedDeque is an appropriate choice when
 *  many threads will share access to a common collection.
 *  Like most other concurrent collection implementations, this class
 *  does not permit the use of null elements.
 * 
 *  Iterators and spliterators are
 *  weakly consistent.
 * 
 *  Beware that, unlike in most collections, the size method
 *  is NOT a constant-time operation. Because of the
 *  asynchronous nature of these deques, determining the current number
 *  of elements requires a traversal of the elements, and so may report
 *  inaccurate results if this collection is modified during traversal.
 *  Additionally, the bulk operations addAll,
 *  removeAll, retainAll, containsAll,
 *  equals, and toArray are not guaranteed
 *  to be performed atomically. For example, an iterator operating
 *  concurrently with an addAll operation might view only some
 *  of the added elements.
 * 
 *  This class and its iterator implement all of the optional
 *  methods of the Deque and Iterator interfaces.
 * 
 *  Memory consistency effects: As with other concurrent collections,
 *  actions in a thread prior to placing an object into a
 *  ConcurrentLinkedDeque
 *  happen-before
 *  actions subsequent to the access or removal of that element from
 *  the ConcurrentLinkedDeque in another thread.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class ConcurrentLinkedDeque[E] extends AbstractCollection[E] with Deque[E] with Serializable {

    /** Constructs an empty deque. */
    @stub
    def this() = ???

    /** Constructs a deque initially containing the elements of
     *  the given collection, added in traversal order of the
     *  collection's iterator.
     */
    @stub
    def this(c: Collection[_ <: E]) = ???

    /** Inserts the specified element at the tail of this deque. */
    @stub
    def add(e: E): Boolean = ???

    /** Appends all of the elements in the specified collection to the end of
     *  this deque, in the order that they are returned by the specified
     *  collection's iterator.
     */
    @stub
    def addAll(c: Collection[_ <: E]): Boolean = ???

    /** Inserts the specified element at the front of this deque. */
    @stub
    def addFirst(e: E): Unit = ???

    /** Inserts the specified element at the end of this deque. */
    @stub
    def addLast(e: E): Unit = ???

    /** Removes all of the elements from this deque. */
    @stub
    def clear(): Unit = ???

    /** Returns true if this deque contains at least one
     *  element e such that o.equals(e).
     */
    @stub
    def contains(o: Any): Boolean = ???

    /** Returns an iterator over the elements in this deque in reverse
     *  sequential order.
     */
    @stub
    def descendingIterator(): Iterator[E] = ???

    /** Retrieves, but does not remove, the head of the queue represented by
     *  this deque (in other words, the first element of this deque).
     */
    @stub
    def element(): E = ???

    /** Retrieves, but does not remove, the first element of this deque. */
    @stub
    def getFirst(): E = ???

    /** Retrieves, but does not remove, the last element of this deque. */
    @stub
    def getLast(): E = ???

    /** Returns true if this collection contains no elements. */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns an iterator over the elements in this deque in proper sequence. */
    @stub
    def iterator(): Iterator[E] = ???

    /** Inserts the specified element at the tail of this deque. */
    @stub
    def offer(e: E): Boolean = ???

    /** Inserts the specified element at the front of this deque. */
    @stub
    def offerFirst(e: E): Boolean = ???

    /** Inserts the specified element at the end of this deque. */
    @stub
    def offerLast(e: E): Boolean = ???

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

    /** Pushes an element onto the stack represented by this deque (in other
     *  words, at the head of this deque) if it is possible to do so
     *  immediately without violating capacity restrictions, throwing an
     *  IllegalStateException if no space is currently available.
     */
    @stub
    def push(e: E): Unit = ???

    /** Retrieves and removes the head of the queue represented by this deque
     *  (in other words, the first element of this deque).
     */
    @stub
    def remove(): E = ???

    /** Removes the first element e such that
     *  o.equals(e), if such an element exists in this deque.
     */
    @stub
    def remove(o: Any): Boolean = ???

    /** Retrieves and removes the first element of this deque. */
    @stub
    def removeFirst(): E = ???

    /** Removes the first element e such that
     *  o.equals(e), if such an element exists in this deque.
     */
    @stub
    def removeFirstOccurrence(o: Any): Boolean = ???

    /** Retrieves and removes the last element of this deque. */
    @stub
    def removeLast(): E = ???

    /** Removes the last element e such that
     *  o.equals(e), if such an element exists in this deque.
     */
    @stub
    def removeLastOccurrence(o: Any): Boolean = ???

    /** Returns the number of elements in this deque. */
    @stub
    def size(): Int = ???

    /** Returns a Spliterator over the elements in this deque. */
    @stub
    def spliterator(): Spliterator[E] = ???

    /** Returns an array containing all of the elements in this deque, in
     *  proper sequence (from first to last element).
     */
    @stub
    def toArray(): Array[Object] = ???

    /** Returns an array containing all of the elements in this deque,
     *  in proper sequence (from first to last element); the runtime
     *  type of the returned array is that of the specified array.
     */
    @stub
    def toArray[T](a: Array[T]): Array[T] = ???
}
