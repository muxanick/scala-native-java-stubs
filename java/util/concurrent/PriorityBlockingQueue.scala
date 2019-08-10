package java.util.concurrent

import java.io.Serializable
import java.lang.{Object, String}
import java.util.{AbstractCollection, AbstractQueue, Collection, Comparator, Iterator, Spliterator}
import scala.scalanative.annotation.stub

/** An unbounded blocking queue that uses
 *  the same ordering rules as class PriorityQueue and supplies
 *  blocking retrieval operations.  While this queue is logically
 *  unbounded, attempted additions may fail due to resource exhaustion
 *  (causing OutOfMemoryError). This class does not permit
 *  null elements.  A priority queue relying on natural ordering also does not permit insertion of
 *  non-comparable objects (doing so results in
 *  ClassCastException).
 * 
 *  This class and its iterator implement all of the
 *  optional methods of the Collection and Iterator interfaces.  The Iterator provided in method iterator() is not guaranteed to traverse the elements of
 *  the PriorityBlockingQueue in any particular order. If you need
 *  ordered traversal, consider using
 *  Arrays.sort(pq.toArray()).  Also, method drainTo
 *  can be used to remove some or all elements in priority
 *  order and place them in another collection.
 * 
 *  Operations on this class make no guarantees about the ordering
 *  of elements with equal priority. If you need to enforce an
 *  ordering, you can define custom classes or comparators that use a
 *  secondary key to break ties in primary priority values.  For
 *  example, here is a class that applies first-in-first-out
 *  tie-breaking to comparable elements. To use it, you would insert a
 *  new FIFOEntry(anEntry) instead of a plain entry object.
 * 
 *    
 *  class FIFOEntry<E extends Comparable<? super E>>
 *      implements Comparable<FIFOEntry<E>> {
 *    static final AtomicLong seq = new AtomicLong(0);
 *    final long seqNum;
 *    final E entry;
 *    public FIFOEntry(E entry) {
 *      seqNum = seq.getAndIncrement();
 *      this.entry = entry;
 *    }
 *    public E getEntry() { return entry; }
 *    public int compareTo(FIFOEntry<E> other) {
 *      int res = entry.compareTo(other.entry);
 *      if (res == 0 && other.entry != this.entry)
 *        res = (seqNum < other.seqNum ? -1 : 1);
 *      return res;
 *    }
 *  }
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class PriorityBlockingQueue[E] extends AbstractQueue[E] with BlockingQueue[E] with Serializable {

    /** Creates a PriorityBlockingQueue with the default
     *  initial capacity (11) that orders its elements according to
     *  their natural ordering.
     */
    @stub
    def this() = ???

    /** Creates a PriorityBlockingQueue containing the elements
     *  in the specified collection.
     */
    @stub
    def this(c: Collection[_ <: E]) = ???

    /** Creates a PriorityBlockingQueue with the specified
     *  initial capacity that orders its elements according to their
     *  natural ordering.
     */
    @stub
    def this(initialCapacity: Int) = ???

    /** Creates a PriorityBlockingQueue with the specified initial
     *  capacity that orders its elements according to the specified
     *  comparator.
     */
    @stub
    def this(initialCapacity: Int, comparator: Comparator[_ >: E]) = ???

    /** Inserts the specified element into this priority queue. */
    @stub
    def add(e: E): Boolean = ???

    /** Atomically removes all of the elements from this queue. */
    @stub
    def clear(): Unit = ???

    /** Returns the comparator used to order the elements in this queue,
     *  or null if this queue uses the natural ordering of its elements.
     */
    @stub
    def comparator(): Comparator[_ >: E] = ???

    /** Returns true if this queue contains the specified element. */
    @stub
    def contains(o: Any): Boolean = ???

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

    /** Returns an iterator over the elements in this queue. */
    @stub
    def iterator(): Iterator[E] = ???

    /** Inserts the specified element into this priority queue. */
    @stub
    def offer(e: E): Boolean = ???

    /** Inserts the specified element into this priority queue. */
    @stub
    def offer(e: E, timeout: Long, unit: TimeUnit): Boolean = ???

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

    /** Retrieves and removes the head of this queue, waiting up to the
     *  specified wait time if necessary for an element to become available.
     */
    @stub
    def poll(timeout: Long, unit: TimeUnit): E = ???

    /** Inserts the specified element into this priority queue. */
    @stub
    def put(e: E): Unit = ???

    /** Always returns Integer.MAX_VALUE because
     *  a PriorityBlockingQueue is not capacity constrained.
     */
    @stub
    def remainingCapacity(): Int = ???

    /** Removes a single instance of the specified element from this queue,
     *  if it is present.
     */
    @stub
    def remove(o: Any): Boolean = ???

    /** Returns the number of elements in this collection. */
    @stub
    def size(): Int = ???

    /** Returns a Spliterator over the elements in this queue. */
    @stub
    def spliterator(): Spliterator[E] = ???

    /** Retrieves and removes the head of this queue, waiting if necessary
     *  until an element becomes available.
     */
    @stub
    def take(): E = ???

    /** Returns an array containing all of the elements in this queue. */
    @stub
    def toArray(): Array[Object] = ???

    /** Returns an array containing all of the elements in this queue; the
     *  runtime type of the returned array is that of the specified array.
     */
    @stub
    def toArray[T](a: Array[T]): Array[T] = ???

    /** Returns a string representation of this collection. */
    @stub
    def toString(): String = ???
}
