package java.util.concurrent

import java.io.Serializable
import java.lang.Object
import java.util.{AbstractCollection, AbstractQueue, Collection, Comparator, Iterator, Spliterator}

// An unbounded blocking queue that uses
// the same ordering rules as class PriorityQueue and supplies
// blocking retrieval operations.  While this queue is logically
// unbounded, attempted additions may fail due to resource exhaustion
// (causing OutOfMemoryError). This class does not permit
// null elements.  A priority queue relying on natural ordering also does not permit insertion of
// non-comparable objects (doing so results in
// ClassCastException).
//
// This class and its iterator implement all of the
// optional methods of the Collection and Iterator interfaces.  The Iterator provided in method iterator() is not guaranteed to traverse the elements of
// the PriorityBlockingQueue in any particular order. If you need
// ordered traversal, consider using
// Arrays.sort(pq.toArray()).  Also, method drainTo
// can be used to remove some or all elements in priority
// order and place them in another collection.
//
// Operations on this class make no guarantees about the ordering
// of elements with equal priority. If you need to enforce an
// ordering, you can define custom classes or comparators that use a
// secondary key to break ties in primary priority values.  For
// example, here is a class that applies first-in-first-out
// tie-breaking to comparable elements. To use it, you would insert a
// new FIFOEntry(anEntry) instead of a plain entry object.
//
//   
// class FIFOEntry<E extends Comparable<? super E>>
//     implements Comparable<FIFOEntry<E>> {
//   static final AtomicLong seq = new AtomicLong(0);
//   final long seqNum;
//   final E entry;
//   public FIFOEntry(E entry) {
//     seqNum = seq.getAndIncrement();
//     this.entry = entry;
//   }
//   public E getEntry() { return entry; }
//   public int compareTo(FIFOEntry<E> other) {
//     int res = entry.compareTo(other.entry);
//     if (res == 0 && other.entry != this.entry)
//       res = (seqNum < other.seqNum ? -1 : 1);
//     return res;
//   }
// }
//
// This class is a member of the
// 
// Java Collections Framework.
class PriorityBlockingQueue[E] extends AbstractQueue[E] with BlockingQueue[E], with Serializable {

    @stub
    // Creates a PriorityBlockingQueue with the default
    // initial capacity (11) that orders its elements according to
    // their natural ordering.
    def this() = ???

    @stub
    // Creates a PriorityBlockingQueue containing the elements
    // in the specified collection.
    def this(c: Collection[_ <: E]) = ???

    @stub
    // Creates a PriorityBlockingQueue with the specified
    // initial capacity that orders its elements according to their
    // natural ordering.
    def this(initialCapacity: Int) = ???

    @stub
    // Inserts the specified element into this priority queue.
    def add(e: E): Boolean = ???

    @stub
    // Atomically removes all of the elements from this queue.
    def clear(): Unit = ???

    @stub
    // Returns the comparator used to order the elements in this queue,
    // or null if this queue uses the natural ordering of its elements.
    def comparator(): Comparator[_ >: E] = ???

    @stub
    // Returns true if this queue contains the specified element.
    def contains(o: Object): Boolean = ???

    @stub
    // Removes all available elements from this queue and adds them
    // to the given collection.
    def drainTo(c: Collection[_ >: E]): Int = ???

    @stub
    // Removes at most the given number of available elements from
    // this queue and adds them to the given collection.
    def drainTo(c: Collection[_ >: E], maxElements: Int): Int = ???

    @stub
    // Returns an iterator over the elements in this queue.
    def iterator(): Iterator[E] = ???

    @stub
    // Inserts the specified element into this priority queue.
    def offer(e: E): Boolean = ???

    @stub
    // Inserts the specified element into this priority queue.
    def offer(e: E, timeout: Long, unit: TimeUnit): Boolean = ???

    @stub
    // Retrieves, but does not remove, the head of this queue,
    // or returns null if this queue is empty.
    def peek(): E = ???

    @stub
    // Retrieves and removes the head of this queue,
    // or returns null if this queue is empty.
    def poll(): E = ???

    @stub
    // Retrieves and removes the head of this queue, waiting up to the
    // specified wait time if necessary for an element to become available.
    def poll(timeout: Long, unit: TimeUnit): E = ???

    @stub
    // Inserts the specified element into this priority queue.
    def put(e: E): Unit = ???

    @stub
    // Always returns Integer.MAX_VALUE because
    // a PriorityBlockingQueue is not capacity constrained.
    def remainingCapacity(): Int = ???

    @stub
    // Removes a single instance of the specified element from this queue,
    // if it is present.
    def remove(o: Object): Boolean = ???

    @stub
    // Returns the number of elements in this collection.
    def size(): Int = ???

    @stub
    // Returns a Spliterator over the elements in this queue.
    def spliterator(): Spliterator[E] = ???

    @stub
    // Retrieves and removes the head of this queue, waiting if necessary
    // until an element becomes available.
    def take(): E = ???

    @stub
    // Returns an array containing all of the elements in this queue.
    def toArray(): Array[Object] = ???

    @stub
    // Returns an array containing all of the elements in this queue; the
    // runtime type of the returned array is that of the specified array.
    def Array[T]: [T] = ???
}
