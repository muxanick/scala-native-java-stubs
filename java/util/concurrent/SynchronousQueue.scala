package java.util.concurrent

import java.io.Serializable
import java.lang.Object
import java.util.{AbstractCollection, AbstractQueue, Collection, Iterator, Spliterator}

// A blocking queue in which each insert
// operation must wait for a corresponding remove operation by another
// thread, and vice versa.  A synchronous queue does not have any
// internal capacity, not even a capacity of one.  You cannot
// peek at a synchronous queue because an element is only
// present when you try to remove it; you cannot insert an element
// (using any method) unless another thread is trying to remove it;
// you cannot iterate as there is nothing to iterate.  The
// head of the queue is the element that the first queued
// inserting thread is trying to add to the queue; if there is no such
// queued thread then no element is available for removal and
// poll() will return null.  For purposes of other
// Collection methods (for example contains), a
// SynchronousQueue acts as an empty collection.  This queue
// does not permit null elements.
//
// Synchronous queues are similar to rendezvous channels used in
// CSP and Ada. They are well suited for handoff designs, in which an
// object running in one thread must sync up with an object running
// in another thread in order to hand it some information, event, or
// task.
//
// This class supports an optional fairness policy for ordering
// waiting producer and consumer threads.  By default, this ordering
// is not guaranteed. However, a queue constructed with fairness set
// to true grants threads access in FIFO order.
//
// This class and its iterator implement all of the
// optional methods of the Collection and Iterator interfaces.
//
// This class is a member of the
// 
// Java Collections Framework.
class SynchronousQueue[E] extends AbstractQueue[E] with BlockingQueue[E], with Serializable {

    @stub
    // Creates a SynchronousQueue with nonfair access policy.
    def this() = ???

    @stub
    // Does nothing.
    def clear(): Unit = ???

    @stub
    // Always returns false.
    def contains(o: Object): Boolean = ???

    @stub
    // Returns false unless the given collection is empty.
    def containsAll(c: Collection[_]): Boolean = ???

    @stub
    // Removes all available elements from this queue and adds them
    // to the given collection.
    def drainTo(c: Collection[_ >: E]): Int = ???

    @stub
    // Removes at most the given number of available elements from
    // this queue and adds them to the given collection.
    def drainTo(c: Collection[_ >: E], maxElements: Int): Int = ???

    @stub
    // Always returns true.
    def isEmpty(): Boolean = ???

    @stub
    // Returns an empty iterator in which hasNext always returns
    // false.
    def iterator(): Iterator[E] = ???

    @stub
    // Inserts the specified element into this queue, if another thread is
    // waiting to receive it.
    def offer(e: E): Boolean = ???

    @stub
    // Inserts the specified element into this queue, waiting if necessary
    // up to the specified wait time for another thread to receive it.
    def offer(e: E, timeout: Long, unit: TimeUnit): Boolean = ???

    @stub
    // Always returns null.
    def peek(): E = ???

    @stub
    // Retrieves and removes the head of this queue, if another thread
    // is currently making an element available.
    def poll(): E = ???

    @stub
    // Retrieves and removes the head of this queue, waiting
    // if necessary up to the specified wait time, for another thread
    // to insert it.
    def poll(timeout: Long, unit: TimeUnit): E = ???

    @stub
    // Adds the specified element to this queue, waiting if necessary for
    // another thread to receive it.
    def put(e: E): Unit = ???

    @stub
    // Always returns zero.
    def remainingCapacity(): Int = ???

    @stub
    // Always returns false.
    def remove(o: Object): Boolean = ???

    @stub
    // Always returns false.
    def removeAll(c: Collection[_]): Boolean = ???

    @stub
    // Always returns false.
    def retainAll(c: Collection[_]): Boolean = ???

    @stub
    // Always returns zero.
    def size(): Int = ???

    @stub
    // Returns an empty spliterator in which calls to
    // Spliterator.trySplit() always return null.
    def spliterator(): Spliterator[E] = ???

    @stub
    // Retrieves and removes the head of this queue, waiting if necessary
    // for another thread to insert it.
    def take(): E = ???

    @stub
    // Returns a zero-length array.
    def toArray(): Array[Object] = ???
}
