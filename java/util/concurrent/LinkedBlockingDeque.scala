package java.util.concurrent

import java.io.Serializable
import java.lang.Object
import java.util.{AbstractCollection, AbstractQueue, Collection, Iterator, Spliterator}

// An optionally-bounded blocking deque based on
// linked nodes.
//
// The optional capacity bound constructor argument serves as a
// way to prevent excessive expansion. The capacity, if unspecified,
// is equal to Integer.MAX_VALUE.  Linked nodes are
// dynamically created upon each insertion unless this would bring the
// deque above capacity.
//
// Most operations run in constant time (ignoring time spent
// blocking).  Exceptions include remove,
// removeFirstOccurrence, removeLastOccurrence, contains, iterator.remove(), and the bulk
// operations, all of which run in linear time.
//
// This class and its iterator implement all of the
// optional methods of the Collection and Iterator interfaces.
//
// This class is a member of the
// 
// Java Collections Framework.
class LinkedBlockingDeque[E] extends AbstractQueue[E] with BlockingDeque[E], with Serializable {

    @stub
    // Creates a LinkedBlockingDeque with a capacity of
    // Integer.MAX_VALUE.
    def this() = ???

    @stub
    // Creates a LinkedBlockingDeque with a capacity of
    // Integer.MAX_VALUE, initially containing the elements of
    // the given collection, added in traversal order of the
    // collection's iterator.
    def this(c: Collection[_ <: E]) = ???

    @stub
    // Inserts the specified element at the end of this deque unless it would
    // violate capacity restrictions.
    def add(e: E): Boolean = ???

    @stub
    // Inserts the specified element at the front of this deque if it is
    // possible to do so immediately without violating capacity restrictions,
    // throwing an IllegalStateException if no space is currently
    // available.
    def addFirst(e: E): Unit = ???

    @stub
    // Inserts the specified element at the end of this deque if it is
    // possible to do so immediately without violating capacity restrictions,
    // throwing an IllegalStateException if no space is currently
    // available.
    def addLast(e: E): Unit = ???

    @stub
    // Atomically removes all of the elements from this deque.
    def clear(): Unit = ???

    @stub
    // Returns true if this deque contains the specified element.
    def contains(o: Object): Boolean = ???

    @stub
    // Returns an iterator over the elements in this deque in reverse
    // sequential order.
    def descendingIterator(): Iterator[E] = ???

    @stub
    // Removes all available elements from this queue and adds them
    // to the given collection.
    def drainTo(c: Collection[_ >: E]): Int = ???

    @stub
    // Removes at most the given number of available elements from
    // this queue and adds them to the given collection.
    def drainTo(c: Collection[_ >: E], maxElements: Int): Int = ???

    @stub
    // Retrieves, but does not remove, the head of the queue represented by
    // this deque.
    def element(): E = ???

    @stub
    // Retrieves, but does not remove, the first element of this deque.
    def getFirst(): E = ???

    @stub
    // Retrieves, but does not remove, the last element of this deque.
    def getLast(): E = ???

    @stub
    // Returns an iterator over the elements in this deque in proper sequence.
    def iterator(): Iterator[E] = ???

    @stub
    // Inserts the specified element into the queue represented by this deque
    // (in other words, at the tail of this deque) if it is possible to do so
    // immediately without violating capacity restrictions, returning
    // true upon success and false if no space is currently
    // available.
    def offer(e: E): Boolean = ???

    @stub
    // Inserts the specified element into the queue represented by this deque
    // (in other words, at the tail of this deque), waiting up to the
    // specified wait time if necessary for space to become available.
    def offer(e: E, timeout: Long, unit: TimeUnit): Boolean = ???

    @stub
    // Inserts the specified element at the front of this deque if it is
    // possible to do so immediately without violating capacity restrictions,
    // returning true upon success and false if no space is
    // currently available.
    def offerFirst(e: E): Boolean = ???

    @stub
    // Inserts the specified element at the front of this deque,
    // waiting up to the specified wait time if necessary for space to
    // become available.
    def offerFirst(e: E, timeout: Long, unit: TimeUnit): Boolean = ???

    @stub
    // Inserts the specified element at the end of this deque if it is
    // possible to do so immediately without violating capacity restrictions,
    // returning true upon success and false if no space is
    // currently available.
    def offerLast(e: E): Boolean = ???

    @stub
    // Inserts the specified element at the end of this deque,
    // waiting up to the specified wait time if necessary for space to
    // become available.
    def offerLast(e: E, timeout: Long, unit: TimeUnit): Boolean = ???

    @stub
    // Retrieves, but does not remove, the head of the queue represented by
    // this deque (in other words, the first element of this deque), or
    // returns null if this deque is empty.
    def peek(): E = ???

    @stub
    // Retrieves, but does not remove, the first element of this deque,
    // or returns null if this deque is empty.
    def peekFirst(): E = ???

    @stub
    // Retrieves, but does not remove, the last element of this deque,
    // or returns null if this deque is empty.
    def peekLast(): E = ???

    @stub
    // Retrieves and removes the head of the queue represented by this deque
    // (in other words, the first element of this deque), or returns
    // null if this deque is empty.
    def poll(): E = ???

    @stub
    // Retrieves and removes the head of the queue represented by this deque
    // (in other words, the first element of this deque), waiting up to the
    // specified wait time if necessary for an element to become available.
    def poll(timeout: Long, unit: TimeUnit): E = ???

    @stub
    // Retrieves and removes the first element of this deque,
    // or returns null if this deque is empty.
    def pollFirst(): E = ???

    @stub
    // Retrieves and removes the first element of this deque, waiting
    // up to the specified wait time if necessary for an element to
    // become available.
    def pollFirst(timeout: Long, unit: TimeUnit): E = ???

    @stub
    // Retrieves and removes the last element of this deque,
    // or returns null if this deque is empty.
    def pollLast(): E = ???

    @stub
    // Retrieves and removes the last element of this deque, waiting
    // up to the specified wait time if necessary for an element to
    // become available.
    def pollLast(timeout: Long, unit: TimeUnit): E = ???

    @stub
    // Pops an element from the stack represented by this deque.
    def pop(): E = ???

    @stub
    // Pushes an element onto the stack represented by this deque (in other
    // words, at the head of this deque) if it is possible to do so
    // immediately without violating capacity restrictions, throwing an
    // IllegalStateException if no space is currently available.
    def push(e: E): Unit = ???

    @stub
    // Inserts the specified element into the queue represented by this deque
    // (in other words, at the tail of this deque), waiting if necessary for
    // space to become available.
    def put(e: E): Unit = ???

    @stub
    // Inserts the specified element at the front of this deque,
    // waiting if necessary for space to become available.
    def putFirst(e: E): Unit = ???

    @stub
    // Inserts the specified element at the end of this deque,
    // waiting if necessary for space to become available.
    def putLast(e: E): Unit = ???

    @stub
    // Returns the number of additional elements that this deque can ideally
    // (in the absence of memory or resource constraints) accept without
    // blocking.
    def remainingCapacity(): Int = ???

    @stub
    // Retrieves and removes the head of the queue represented by this deque.
    def remove(): E = ???

    @stub
    // Removes the first occurrence of the specified element from this deque.
    def remove(o: Object): Boolean = ???

    @stub
    // Retrieves and removes the first element of this deque.
    def removeFirst(): E = ???

    @stub
    // Removes the first occurrence of the specified element from this deque.
    def removeFirstOccurrence(o: Object): Boolean = ???

    @stub
    // Retrieves and removes the last element of this deque.
    def removeLast(): E = ???

    @stub
    // Removes the last occurrence of the specified element from this deque.
    def removeLastOccurrence(o: Object): Boolean = ???

    @stub
    // Returns the number of elements in this deque.
    def size(): Int = ???

    @stub
    // Returns a Spliterator over the elements in this deque.
    def spliterator(): Spliterator[E] = ???

    @stub
    // Retrieves and removes the head of the queue represented by this deque
    // (in other words, the first element of this deque), waiting if
    // necessary until an element becomes available.
    def take(): E = ???

    @stub
    // Retrieves and removes the first element of this deque, waiting
    // if necessary until an element becomes available.
    def takeFirst(): E = ???

    @stub
    // Retrieves and removes the last element of this deque, waiting
    // if necessary until an element becomes available.
    def takeLast(): E = ???

    @stub
    // Returns an array containing all of the elements in this deque, in
    // proper sequence (from first to last element).
    def toArray(): Array[Object] = ???

    @stub
    // Returns an array containing all of the elements in this deque, in
    // proper sequence; the runtime type of the returned array is that of
    // the specified array.
    def Array[T]: [T] = ???
}
