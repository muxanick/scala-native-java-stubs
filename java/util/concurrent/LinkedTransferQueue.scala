package java.util.concurrent

import java.io.Serializable
import java.lang.Object
import java.util.{AbstractCollection, AbstractQueue, Collection, Iterator, Spliterator}

// An unbounded TransferQueue based on linked nodes.
// This queue orders elements FIFO (first-in-first-out) with respect
// to any given producer.  The head of the queue is that
// element that has been on the queue the longest time for some
// producer.  The tail of the queue is that element that has
// been on the queue the shortest time for some producer.
//
// Beware that, unlike in most collections, the size method
// is NOT a constant-time operation. Because of the
// asynchronous nature of these queues, determining the current number
// of elements requires a traversal of the elements, and so may report
// inaccurate results if this collection is modified during traversal.
// Additionally, the bulk operations addAll,
// removeAll, retainAll, containsAll,
// equals, and toArray are not guaranteed
// to be performed atomically. For example, an iterator operating
// concurrently with an addAll operation might view only some
// of the added elements.
//
// This class and its iterator implement all of the
// optional methods of the Collection and Iterator interfaces.
//
// Memory consistency effects: As with other concurrent
// collections, actions in a thread prior to placing an object into a
// LinkedTransferQueue
// happen-before
// actions subsequent to the access or removal of that element from
// the LinkedTransferQueue in another thread.
//
// This class is a member of the
// 
// Java Collections Framework.
class LinkedTransferQueue[E] extends AbstractQueue[E] with TransferQueue[E], with Serializable {

    @stub
    // Creates an initially empty LinkedTransferQueue.
    def this() = ???

    @stub
    // Inserts the specified element at the tail of this queue.
    def add(e: E): Boolean = ???

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
    // Returns an estimate of the number of consumers waiting to
    // receive elements via BlockingQueue.take() or timed
    // poll.
    def getWaitingConsumerCount(): Int = ???

    @stub
    // Returns true if there is at least one consumer waiting
    // to receive an element via BlockingQueue.take() or
    // timed poll.
    def hasWaitingConsumer(): Boolean = ???

    @stub
    // Returns true if this queue contains no elements.
    def isEmpty(): Boolean = ???

    @stub
    // Returns an iterator over the elements in this queue in proper sequence.
    def iterator(): Iterator[E] = ???

    @stub
    // Inserts the specified element at the tail of this queue.
    def offer(e: E): Boolean = ???

    @stub
    // Inserts the specified element at the tail of this queue.
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
    // Inserts the specified element at the tail of this queue.
    def put(e: E): Unit = ???

    @stub
    // Always returns Integer.MAX_VALUE because a
    // LinkedTransferQueue is not capacity constrained.
    def remainingCapacity(): Int = ???

    @stub
    // Removes a single instance of the specified element from this queue,
    // if it is present.
    def remove(o: Object): Boolean = ???

    @stub
    // Returns the number of elements in this queue.
    def size(): Int = ???

    @stub
    // Returns a Spliterator over the elements in this queue.
    def spliterator(): Spliterator[E] = ???

    @stub
    // Retrieves and removes the head of this queue, waiting if necessary
    // until an element becomes available.
    def take(): E = ???

    @stub
    // Transfers the element to a consumer, waiting if necessary to do so.
    def transfer(e: E): Unit = ???

    @stub
    // Transfers the element to a waiting consumer immediately, if possible.
    def tryTransfer(e: E): Boolean = ???
}
