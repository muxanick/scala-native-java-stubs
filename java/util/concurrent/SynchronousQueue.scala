package java.util.concurrent

import java.io.Serializable
import java.lang.Object
import java.util.{AbstractCollection, AbstractQueue, Collection, Iterator, Spliterator}

/** A blocking queue in which each insert
 *  operation must wait for a corresponding remove operation by another
 *  thread, and vice versa.  A synchronous queue does not have any
 *  internal capacity, not even a capacity of one.  You cannot
 *  peek at a synchronous queue because an element is only
 *  present when you try to remove it; you cannot insert an element
 *  (using any method) unless another thread is trying to remove it;
 *  you cannot iterate as there is nothing to iterate.  The
 *  head of the queue is the element that the first queued
 *  inserting thread is trying to add to the queue; if there is no such
 *  queued thread then no element is available for removal and
 *  poll() will return null.  For purposes of other
 *  Collection methods (for example contains), a
 *  SynchronousQueue acts as an empty collection.  This queue
 *  does not permit null elements.
 * 
 *  Synchronous queues are similar to rendezvous channels used in
 *  CSP and Ada. They are well suited for handoff designs, in which an
 *  object running in one thread must sync up with an object running
 *  in another thread in order to hand it some information, event, or
 *  task.
 * 
 *  This class supports an optional fairness policy for ordering
 *  waiting producer and consumer threads.  By default, this ordering
 *  is not guaranteed. However, a queue constructed with fairness set
 *  to true grants threads access in FIFO order.
 * 
 *  This class and its iterator implement all of the
 *  optional methods of the Collection and Iterator interfaces.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class SynchronousQueue[E] extends AbstractQueue[E] with BlockingQueue[E] with Serializable {

    /** Creates a SynchronousQueue with nonfair access policy. */
    @stub
    def this() = ???

    /** Does nothing. */
    @stub
    def clear(): Unit = ???

    /** Always returns false. */
    @stub
    def contains(o: Object): Boolean = ???

    /** Returns false unless the given collection is empty. */
    @stub
    def containsAll(c: Collection[_]): Boolean = ???

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

    /** Always returns true. */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns an empty iterator in which hasNext always returns
     *  false.
     */
    @stub
    def iterator(): Iterator[E] = ???

    /** Inserts the specified element into this queue, if another thread is
     *  waiting to receive it.
     */
    @stub
    def offer(e: E): Boolean = ???

    /** Inserts the specified element into this queue, waiting if necessary
     *  up to the specified wait time for another thread to receive it.
     */
    @stub
    def offer(e: E, timeout: Long, unit: TimeUnit): Boolean = ???

    /** Always returns null. */
    @stub
    def peek(): E = ???

    /** Retrieves and removes the head of this queue, if another thread
     *  is currently making an element available.
     */
    @stub
    def poll(): E = ???

    /** Retrieves and removes the head of this queue, waiting
     *  if necessary up to the specified wait time, for another thread
     *  to insert it.
     */
    @stub
    def poll(timeout: Long, unit: TimeUnit): E = ???

    /** Adds the specified element to this queue, waiting if necessary for
     *  another thread to receive it.
     */
    @stub
    def put(e: E): Unit = ???

    /** Always returns zero. */
    @stub
    def remainingCapacity(): Int = ???

    /** Always returns false. */
    @stub
    def remove(o: Object): Boolean = ???

    /** Always returns false. */
    @stub
    def removeAll(c: Collection[_]): Boolean = ???

    /** Always returns false. */
    @stub
    def retainAll(c: Collection[_]): Boolean = ???

    /** Always returns zero. */
    @stub
    def size(): Int = ???

    /** Returns an empty spliterator in which calls to
     *  Spliterator.trySplit() always return null.
     */
    @stub
    def spliterator(): Spliterator[E] = ???

    /** Retrieves and removes the head of this queue, waiting if necessary
     *  for another thread to insert it.
     */
    @stub
    def take(): E = ???

    /** Returns a zero-length array. */
    @stub
    def toArray(): Array[Object] = ???
}
