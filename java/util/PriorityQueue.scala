package java.util

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** An unbounded priority queue based on a priority heap.
 *  The elements of the priority queue are ordered according to their
 *  natural ordering, or by a Comparator
 *  provided at queue construction time, depending on which constructor is
 *  used.  A priority queue does not permit null elements.
 *  A priority queue relying on natural ordering also does not permit
 *  insertion of non-comparable objects (doing so may result in
 *  ClassCastException).
 * 
 *  The head of this queue is the least element
 *  with respect to the specified ordering.  If multiple elements are
 *  tied for least value, the head is one of those elements -- ties are
 *  broken arbitrarily.  The queue retrieval operations poll,
 *  remove, peek, and element access the
 *  element at the head of the queue.
 * 
 *  A priority queue is unbounded, but has an internal
 *  capacity governing the size of an array used to store the
 *  elements on the queue.  It is always at least as large as the queue
 *  size.  As elements are added to a priority queue, its capacity
 *  grows automatically.  The details of the growth policy are not
 *  specified.
 * 
 *  This class and its iterator implement all of the
 *  optional methods of the Collection and Iterator interfaces.  The Iterator provided in method iterator() is not guaranteed to traverse the elements of
 *  the priority queue in any particular order. If you need ordered
 *  traversal, consider using Arrays.sort(pq.toArray()).
 * 
 *  Note that this implementation is not synchronized.
 *  Multiple threads should not access a PriorityQueue
 *  instance concurrently if any of the threads modifies the queue.
 *  Instead, use the thread-safe PriorityBlockingQueue class.
 * 
 *  Implementation note: this implementation provides
 *  O(log(n)) time for the enqueuing and dequeuing methods
 *  (offer, poll, remove() and add);
 *  linear time for the remove(Object) and contains(Object)
 *  methods; and constant time for the retrieval methods
 *  (peek, element, and size).
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class PriorityQueue[E] extends AbstractQueue[E] with Serializable {

    /** Creates a PriorityQueue with the default initial
     *  capacity (11) that orders its elements according to their
     *  natural ordering.
     */
    @stub
    def this() = ???

    /** Creates a PriorityQueue containing the elements in the
     *  specified collection.
     */
    @stub
    def this(c: Collection[_ <: E]) = ???

    /** Creates a PriorityQueue with the default initial capacity and
     *  whose elements are ordered according to the specified comparator.
     */
    @stub
    def this(comparator: Comparator[_ >: E]) = ???

    /** Creates a PriorityQueue with the specified initial
     *  capacity that orders its elements according to their
     *  natural ordering.
     */
    @stub
    def this(initialCapacity: Int) = ???

    /** Creates a PriorityQueue with the specified initial capacity
     *  that orders its elements according to the specified comparator.
     */
    @stub
    def this(initialCapacity: Int, comparator: Comparator[_ >: E]) = ???

    /** Creates a PriorityQueue containing the elements in the
     *  specified priority queue.
     */
    @stub
    def this(c: PriorityQueue[_ <: E]) = ???

    /** Creates a PriorityQueue containing the elements in the
     *  specified sorted set.
     */
    @stub
    def this(c: SortedSet[_ <: E]) = ???

    /** Inserts the specified element into this priority queue. */
    @stub
    def add(e: E): Boolean = ???

    /** Removes all of the elements from this priority queue. */
    @stub
    def clear(): Unit = ???

    /** Returns the comparator used to order the elements in this
     *  queue, or null if this queue is sorted according to
     *  the natural ordering of its elements.
     */
    @stub
    def comparator(): Comparator[_ >: E] = ???

    /** Returns true if this queue contains the specified element. */
    @stub
    def contains(o: Any): Boolean = ???

    /** Returns an iterator over the elements in this queue. */
    @stub
    def iterator(): Iterator[E] = ???

    /** Inserts the specified element into this priority queue. */
    @stub
    def offer(e: E): Boolean = ???

    /** Retrieves, but does not remove, the head of this queue,
     *  or returns null if this queue is empty.
     */
    @stub
    def peek(): E = ???

    /** Retrieves and removes the head of this queue,
     *  or returns null if this queue is empty.
     */
    @stub
    def poll(): E = ???

    /** Removes a single instance of the specified element from this queue,
     *  if it is present.
     */
    @stub
    def remove(o: Any): Boolean = ???

    /** Returns the number of elements in this collection. */
    @stub
    def size(): Int = ???

    /** Creates a late-binding
     *  and fail-fast Spliterator over the elements in this
     *  queue.
     */
    @stub
    def spliterator(): Spliterator[E] = ???

    /** Returns an array containing all of the elements in this queue. */
    @stub
    def toArray(): Array[Object] = ???

    /** Returns an array containing all of the elements in this queue; the
     *  runtime type of the returned array is that of the specified array.
     */
    @stub
    def toArray[T](a: Array[T]): Array[T] = ???
}
