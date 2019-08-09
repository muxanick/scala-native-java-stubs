package java.util

import java.io.Serializable
import java.lang.{Cloneable, Object}

// Resizable-array implementation of the Deque interface.  Array
// deques have no capacity restrictions; they grow as necessary to support
// usage.  They are not thread-safe; in the absence of external
// synchronization, they do not support concurrent access by multiple threads.
// Null elements are prohibited.  This class is likely to be faster than
// Stack when used as a stack, and faster than LinkedList
// when used as a queue.
//
// Most ArrayDeque operations run in amortized constant time.
// Exceptions include remove, removeFirstOccurrence, removeLastOccurrence, contains, iterator.remove(), and the bulk operations, all of which run in linear
// time.
//
// The iterators returned by this class's iterator method are
// fail-fast: If the deque is modified at any time after the iterator
// is created, in any way except through the iterator's own remove
// method, the iterator will generally throw a ConcurrentModificationException.  Thus, in the face of concurrent
// modification, the iterator fails quickly and cleanly, rather than risking
// arbitrary, non-deterministic behavior at an undetermined time in the
// future.
//
// Note that the fail-fast behavior of an iterator cannot be guaranteed
// as it is, generally speaking, impossible to make any hard guarantees in the
// presence of unsynchronized concurrent modification.  Fail-fast iterators
// throw ConcurrentModificationException on a best-effort basis.
// Therefore, it would be wrong to write a program that depended on this
// exception for its correctness: the fail-fast behavior of iterators
// should be used only to detect bugs.
//
// This class and its iterator implement all of the
// optional methods of the Collection and Iterator interfaces.
//
// This class is a member of the
// 
// Java Collections Framework.
class ArrayDeque[E] extends AbstractCollection[E] with Deque[E], with Cloneable, with Serializable {

    @stub
    // Constructs an empty array deque with an initial capacity
    // sufficient to hold 16 elements.
    def this() = ???

    @stub
    // Constructs a deque containing the elements of the specified
    // collection, in the order they are returned by the collection's
    // iterator.
    def this(c: Collection[_ <: E]) = ???

    @stub
    // Inserts the specified element at the end of this deque.
    def add(e: E): Boolean = ???

    @stub
    // Inserts the specified element at the front of this deque.
    def addFirst(e: E): Unit = ???

    @stub
    // Inserts the specified element at the end of this deque.
    def addLast(e: E): Unit = ???

    @stub
    // Removes all of the elements from this deque.
    def clear(): Unit = ???

    @stub
    // Returns a copy of this deque.
    def clone(): ArrayDeque[E] = ???

    @stub
    // Returns true if this deque contains the specified element.
    def contains(o: Object): Boolean = ???

    @stub
    // Returns an iterator over the elements in this deque in reverse
    // sequential order.
    def descendingIterator(): Iterator[E] = ???

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
    // Returns true if this deque contains no elements.
    def isEmpty(): Boolean = ???

    @stub
    // Returns an iterator over the elements in this deque.
    def iterator(): Iterator[E] = ???

    @stub
    // Inserts the specified element at the end of this deque.
    def offer(e: E): Boolean = ???

    @stub
    // Inserts the specified element at the front of this deque.
    def offerFirst(e: E): Boolean = ???

    @stub
    // Inserts the specified element at the end of this deque.
    def offerLast(e: E): Boolean = ???

    @stub
    // Retrieves, but does not remove, the head of the queue represented by
    // this deque, or returns null if this deque is empty.
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
    // Retrieves and removes the first element of this deque,
    // or returns null if this deque is empty.
    def pollFirst(): E = ???

    @stub
    // Retrieves and removes the last element of this deque,
    // or returns null if this deque is empty.
    def pollLast(): E = ???

    @stub
    // Pops an element from the stack represented by this deque.
    def pop(): E = ???

    @stub
    // Pushes an element onto the stack represented by this deque.
    def push(e: E): Unit = ???

    @stub
    // Retrieves and removes the head of the queue represented by this deque.
    def remove(): E = ???

    @stub
    // Removes a single instance of the specified element from this deque.
    def remove(o: Object): Boolean = ???

    @stub
    // Retrieves and removes the first element of this deque.
    def removeFirst(): E = ???

    @stub
    // Removes the first occurrence of the specified element in this
    // deque (when traversing the deque from head to tail).
    def removeFirstOccurrence(o: Object): Boolean = ???

    @stub
    // Retrieves and removes the last element of this deque.
    def removeLast(): E = ???

    @stub
    // Removes the last occurrence of the specified element in this
    // deque (when traversing the deque from head to tail).
    def removeLastOccurrence(o: Object): Boolean = ???

    @stub
    // Returns the number of elements in this deque.
    def size(): Int = ???

    @stub
    // Creates a late-binding
    // and fail-fast Spliterator over the elements in this
    // deque.
    def spliterator(): Spliterator[E] = ???

    @stub
    // Returns an array containing all of the elements in this deque
    // in proper sequence (from first to last element).
    def toArray(): Array[Object] = ???
}
