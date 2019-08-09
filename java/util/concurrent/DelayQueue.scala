package java.util.concurrent

import java.lang.Object
import java.util.{AbstractCollection, AbstractQueue, Collection, Iterator}

// An unbounded blocking queue of
// Delayed elements, in which an element can only be taken
// when its delay has expired.  The head of the queue is that
// Delayed element whose delay expired furthest in the
// past.  If no delay has expired there is no head and poll
// will return null. Expiration occurs when an element's
// getDelay(TimeUnit.NANOSECONDS) method returns a value less
// than or equal to zero.  Even though unexpired elements cannot be
// removed using take or poll, they are otherwise
// treated as normal elements. For example, the size method
// returns the count of both expired and unexpired elements.
// This queue does not permit null elements.
//
// This class and its iterator implement all of the
// optional methods of the Collection and Iterator interfaces.  The Iterator provided in method iterator() is not guaranteed to traverse the elements of
// the DelayQueue in any particular order.
//
// This class is a member of the
// 
// Java Collections Framework.
class DelayQueue[E <: Delayed] extends AbstractQueue[E] with BlockingQueue[E] {

    @stub
    // Creates a new DelayQueue that is initially empty.
    def this() = ???

    @stub
    // Inserts the specified element into this delay queue.
    def add(e: E): Boolean = ???

    @stub
    // Atomically removes all of the elements from this delay queue.
    def clear(): Unit = ???

    @stub
    // Removes all available elements from this queue and adds them
    // to the given collection.
    def drainTo(c: Collection[_ >: E]): Int = ???

    @stub
    // Removes at most the given number of available elements from
    // this queue and adds them to the given collection.
    def drainTo(c: Collection[_ >: E], maxElements: Int): Int = ???

    @stub
    // Returns an iterator over all the elements (both expired and
    // unexpired) in this queue.
    def iterator(): Iterator[E] = ???

    @stub
    // Inserts the specified element into this delay queue.
    def offer(e: E): Boolean = ???

    @stub
    // Inserts the specified element into this delay queue.
    def offer(e: E, timeout: Long, unit: TimeUnit): Boolean = ???

    @stub
    // Retrieves, but does not remove, the head of this queue, or
    // returns null if this queue is empty.
    def peek(): E = ???

    @stub
    // Retrieves and removes the head of this queue, or returns null
    // if this queue has no elements with an expired delay.
    def poll(): E = ???

    @stub
    // Retrieves and removes the head of this queue, waiting if necessary
    // until an element with an expired delay is available on this queue,
    // or the specified wait time expires.
    def poll(timeout: Long, unit: TimeUnit): E = ???

    @stub
    // Inserts the specified element into this delay queue.
    def put(e: E): Unit = ???

    @stub
    // Always returns Integer.MAX_VALUE because
    // a DelayQueue is not capacity constrained.
    def remainingCapacity(): Int = ???

    @stub
    // Removes a single instance of the specified element from this
    // queue, if it is present, whether or not it has expired.
    def remove(o: Object): Boolean = ???

    @stub
    // Returns the number of elements in this collection.
    def size(): Int = ???

    @stub
    // Retrieves and removes the head of this queue, waiting if necessary
    // until an element with an expired delay is available on this queue.
    def take(): E = ???

    @stub
    // Returns an array containing all of the elements in this queue.
    def toArray(): Array[Object] = ???
}
