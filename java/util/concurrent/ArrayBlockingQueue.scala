package java.util.concurrent

import java.io.Serializable
import java.lang.{Object, String}
import java.util.{AbstractCollection, AbstractQueue, Collection, Iterator, Spliterator}
import scala.scalanative.annotation.stub

/** A bounded blocking queue backed by an
 *  array.  This queue orders elements FIFO (first-in-first-out).  The
 *  head of the queue is that element that has been on the
 *  queue the longest time.  The tail of the queue is that
 *  element that has been on the queue the shortest time. New elements
 *  are inserted at the tail of the queue, and the queue retrieval
 *  operations obtain elements at the head of the queue.
 * 
 *  This is a classic "bounded buffer", in which a
 *  fixed-sized array holds elements inserted by producers and
 *  extracted by consumers.  Once created, the capacity cannot be
 *  changed.  Attempts to put an element into a full queue
 *  will result in the operation blocking; attempts to take an
 *  element from an empty queue will similarly block.
 * 
 *  This class supports an optional fairness policy for ordering
 *  waiting producer and consumer threads.  By default, this ordering
 *  is not guaranteed. However, a queue constructed with fairness set
 *  to true grants threads access in FIFO order. Fairness
 *  generally decreases throughput but reduces variability and avoids
 *  starvation.
 * 
 *  This class and its iterator implement all of the
 *  optional methods of the Collection and Iterator interfaces.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class ArrayBlockingQueue[E] extends AbstractQueue[E] with BlockingQueue[E] with Serializable {

    /** Creates an ArrayBlockingQueue with the given (fixed)
     *  capacity and default access policy.
     */
    @stub
    def this(capacity: Int) = ???

    /** Creates an ArrayBlockingQueue with the given (fixed)
     *  capacity and the specified access policy.
     */
    @stub
    def this(capacity: Int, fair: Boolean) = ???

    /** Creates an ArrayBlockingQueue with the given (fixed)
     *  capacity, the specified access policy and initially containing the
     *  elements of the given collection,
     *  added in traversal order of the collection's iterator.
     */
    @stub
    def this(capacity: Int, fair: Boolean, c: Collection[_ <: E]) = ???

    /** Inserts the specified element at the tail of this queue if it is
     *  possible to do so immediately without exceeding the queue's capacity,
     *  returning true upon success and throwing an
     *  IllegalStateException if this queue is full.
     */
    @stub
    def add(e: E): Boolean = ???

    /** Atomically removes all of the elements from this queue. */
    @stub
    def clear(): Unit = ???

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

    /** Returns an iterator over the elements in this queue in proper sequence. */
    @stub
    def iterator(): Iterator[E] = ???

    /** Inserts the specified element at the tail of this queue if it is
     *  possible to do so immediately without exceeding the queue's capacity,
     *  returning true upon success and false if this queue
     *  is full.
     */
    @stub
    def offer(e: E): Boolean = ???

    /** Inserts the specified element at the tail of this queue, waiting
     *  up to the specified wait time for space to become available if
     *  the queue is full.
     */
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

    /** Inserts the specified element at the tail of this queue, waiting
     *  for space to become available if the queue is full.
     */
    @stub
    def put(e: E): Unit = ???

    /** Returns the number of additional elements that this queue can ideally
     *  (in the absence of memory or resource constraints) accept without
     *  blocking.
     */
    @stub
    def remainingCapacity(): Int = ???

    /** Removes a single instance of the specified element from this queue,
     *  if it is present.
     */
    @stub
    def remove(o: Any): Boolean = ???

    /** Returns the number of elements in this queue. */
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

    /** Returns an array containing all of the elements in this queue, in
     *  proper sequence.
     */
    @stub
    def toArray(): Array[Object] = ???

    /** Returns an array containing all of the elements in this queue, in
     *  proper sequence; the runtime type of the returned array is that of
     *  the specified array.
     */
    @stub
    def toArray[T](a: Array[T]): Array[T] = ???

    /** Returns a string representation of this collection. */
    @stub
    def toString(): String = ???
}
