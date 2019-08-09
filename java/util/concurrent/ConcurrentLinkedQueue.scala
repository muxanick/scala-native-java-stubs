package java.util.concurrent

import java.io.Serializable
import java.lang.Object
import java.util.{AbstractCollection, AbstractQueue, Collection, Iterator, Queue, Spliterator}

// An unbounded thread-safe queue based on linked nodes.
// This queue orders elements FIFO (first-in-first-out).
// The head of the queue is that element that has been on the
// queue the longest time.
// The tail of the queue is that element that has been on the
// queue the shortest time. New elements
// are inserted at the tail of the queue, and the queue retrieval
// operations obtain elements at the head of the queue.
// A ConcurrentLinkedQueue is an appropriate choice when
// many threads will share access to a common collection.
// Like most other concurrent collection implementations, this class
// does not permit the use of null elements.
//
// This implementation employs an efficient non-blocking
// algorithm based on one described in  Simple,
// Fast, and Practical Non-Blocking and Blocking Concurrent Queue
// Algorithms by Maged M. Michael and Michael L. Scott.
//
// Iterators are weakly consistent, returning elements
// reflecting the state of the queue at some point at or since the
// creation of the iterator.  They do not throw ConcurrentModificationException, and may proceed concurrently
// with other operations.  Elements contained in the queue since the creation
// of the iterator will be returned exactly once.
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
// This class and its iterator implement all of the optional
// methods of the Queue and Iterator interfaces.
//
// Memory consistency effects: As with other concurrent
// collections, actions in a thread prior to placing an object into a
// ConcurrentLinkedQueue
// happen-before
// actions subsequent to the access or removal of that element from
// the ConcurrentLinkedQueue in another thread.
//
// This class is a member of the
// 
// Java Collections Framework.
class ConcurrentLinkedQueue[E] extends AbstractQueue[E] with Queue[E], with Serializable {

    @stub
    // Creates a ConcurrentLinkedQueue that is initially empty.
    def this() = ???

    @stub
    // Inserts the specified element at the tail of this queue.
    def add(e: E): Boolean = ???

    @stub
    // Appends all of the elements in the specified collection to the end of
    // this queue, in the order that they are returned by the specified
    // collection's iterator.
    def addAll(c: Collection[_ <: E]): Boolean = ???

    @stub
    // Returns true if this queue contains the specified element.
    def contains(o: Object): Boolean = ???

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
    // Retrieves, but does not remove, the head of this queue,
    // or returns null if this queue is empty.
    def peek(): E = ???

    @stub
    // Retrieves and removes the head of this queue,
    // or returns null if this queue is empty.
    def poll(): E = ???

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
    // Returns an array containing all of the elements in this queue, in
    // proper sequence.
    def toArray(): Array[Object] = ???
}
