package java.util.concurrent

import java.lang.Object
import java.util.{AbstractCollection, AbstractQueue, Collection, Iterator}
import scala.scalanative.annotation.stub

/** An unbounded blocking queue of
 *  Delayed elements, in which an element can only be taken
 *  when its delay has expired.  The head of the queue is that
 *  Delayed element whose delay expired furthest in the
 *  past.  If no delay has expired there is no head and poll
 *  will return null. Expiration occurs when an element's
 *  getDelay(TimeUnit.NANOSECONDS) method returns a value less
 *  than or equal to zero.  Even though unexpired elements cannot be
 *  removed using take or poll, they are otherwise
 *  treated as normal elements. For example, the size method
 *  returns the count of both expired and unexpired elements.
 *  This queue does not permit null elements.
 * 
 *  This class and its iterator implement all of the
 *  optional methods of the Collection and Iterator interfaces.  The Iterator provided in method iterator() is not guaranteed to traverse the elements of
 *  the DelayQueue in any particular order.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class DelayQueue[E <: Delayed] extends AbstractQueue[E] with BlockingQueue[E] {

    /** Creates a new DelayQueue that is initially empty. */
    @stub
    def this() = ???

    /** Creates a DelayQueue initially containing the elements of the
     *  given collection of Delayed instances.
     */
    @stub
    def this(c: Collection[_ <: E]) = ???

    /** Inserts the specified element into this delay queue. */
    @stub
    def add(e: E): Boolean = ???

    /** Atomically removes all of the elements from this delay queue. */
    @stub
    def clear(): Unit = ???

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

    /** Returns an iterator over all the elements (both expired and
     *  unexpired) in this queue.
     */
    @stub
    def iterator(): Iterator[E] = ???

    /** Inserts the specified element into this delay queue. */
    @stub
    def offer(e: E): Boolean = ???

    /** Inserts the specified element into this delay queue. */
    @stub
    def offer(e: E, timeout: Long, unit: TimeUnit): Boolean = ???

    /** Retrieves, but does not remove, the head of this queue, or
     *  returns null if this queue is empty.
     */
    @stub
    def peek(): E = ???

    /** Retrieves and removes the head of this queue, or returns null
     *  if this queue has no elements with an expired delay.
     */
    @stub
    def poll(): E = ???

    /** Retrieves and removes the head of this queue, waiting if necessary
     *  until an element with an expired delay is available on this queue,
     *  or the specified wait time expires.
     */
    @stub
    def poll(timeout: Long, unit: TimeUnit): E = ???

    /** Inserts the specified element into this delay queue. */
    @stub
    def put(e: E): Unit = ???

    /** Always returns Integer.MAX_VALUE because
     *  a DelayQueue is not capacity constrained.
     */
    @stub
    def remainingCapacity(): Int = ???

    /** Removes a single instance of the specified element from this
     *  queue, if it is present, whether or not it has expired.
     */
    @stub
    def remove(o: Object): Boolean = ???

    /** Returns the number of elements in this collection. */
    @stub
    def size(): Int = ???

    /** Retrieves and removes the head of this queue, waiting if necessary
     *  until an element with an expired delay is available on this queue.
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
}
