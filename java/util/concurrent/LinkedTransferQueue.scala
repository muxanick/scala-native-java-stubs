package java.util.concurrent

import java.io.Serializable
import java.lang.Object
import java.util.{AbstractCollection, AbstractQueue, Collection, Iterator, Spliterator}
import scala.scalanative.annotation.stub

/** An unbounded TransferQueue based on linked nodes.
 *  This queue orders elements FIFO (first-in-first-out) with respect
 *  to any given producer.  The head of the queue is that
 *  element that has been on the queue the longest time for some
 *  producer.  The tail of the queue is that element that has
 *  been on the queue the shortest time for some producer.
 * 
 *  Beware that, unlike in most collections, the size method
 *  is NOT a constant-time operation. Because of the
 *  asynchronous nature of these queues, determining the current number
 *  of elements requires a traversal of the elements, and so may report
 *  inaccurate results if this collection is modified during traversal.
 *  Additionally, the bulk operations addAll,
 *  removeAll, retainAll, containsAll,
 *  equals, and toArray are not guaranteed
 *  to be performed atomically. For example, an iterator operating
 *  concurrently with an addAll operation might view only some
 *  of the added elements.
 * 
 *  This class and its iterator implement all of the
 *  optional methods of the Collection and Iterator interfaces.
 * 
 *  Memory consistency effects: As with other concurrent
 *  collections, actions in a thread prior to placing an object into a
 *  LinkedTransferQueue
 *  happen-before
 *  actions subsequent to the access or removal of that element from
 *  the LinkedTransferQueue in another thread.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class LinkedTransferQueue[E] extends AbstractQueue[E] with TransferQueue[E] with Serializable {

    /** Creates an initially empty LinkedTransferQueue. */
    @stub
    def this() = ???

    /** Creates a LinkedTransferQueue
     *  initially containing the elements of the given collection,
     *  added in traversal order of the collection's iterator.
     */
    @stub
    def this(c: Collection[_ <: E]) = ???

    /** Inserts the specified element at the tail of this queue. */
    @stub
    def add(e: E): Boolean = ???

    /** Returns true if this queue contains the specified element. */
    @stub
    def contains(o: Object): Boolean = ???

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

    /** Returns an estimate of the number of consumers waiting to
     *  receive elements via BlockingQueue.take() or timed
     *  poll.
     */
    @stub
    def getWaitingConsumerCount(): Int = ???

    /** Returns true if there is at least one consumer waiting
     *  to receive an element via BlockingQueue.take() or
     *  timed poll.
     */
    @stub
    def hasWaitingConsumer(): Boolean = ???

    /** Returns true if this queue contains no elements. */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns an iterator over the elements in this queue in proper sequence. */
    @stub
    def iterator(): Iterator[E] = ???

    /** Inserts the specified element at the tail of this queue. */
    @stub
    def offer(e: E): Boolean = ???

    /** Inserts the specified element at the tail of this queue. */
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

    /** Inserts the specified element at the tail of this queue. */
    @stub
    def put(e: E): Unit = ???

    /** Always returns Integer.MAX_VALUE because a
     *  LinkedTransferQueue is not capacity constrained.
     */
    @stub
    def remainingCapacity(): Int = ???

    /** Removes a single instance of the specified element from this queue,
     *  if it is present.
     */
    @stub
    def remove(o: Object): Boolean = ???

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

    /** Transfers the element to a consumer, waiting if necessary to do so. */
    @stub
    def transfer(e: E): Unit = ???

    /** Transfers the element to a waiting consumer immediately, if possible. */
    @stub
    def tryTransfer(e: E): Boolean = ???

    /** Transfers the element to a consumer if it is possible to do so
     *  before the timeout elapses.
     */
    @stub
    def tryTransfer(e: E, timeout: Long, unit: TimeUnit): Boolean = ???
}
