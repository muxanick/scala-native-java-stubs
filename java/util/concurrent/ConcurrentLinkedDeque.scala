package java.util.concurrent

import java.io.Serializable
import java.lang.Object
import java.util.{AbstractCollection, Collection, Deque, Iterator, Spliterator}

// An unbounded concurrent deque based on linked nodes.
// Concurrent insertion, removal, and access operations execute safely
// across multiple threads.
// A ConcurrentLinkedDeque is an appropriate choice when
// many threads will share access to a common collection.
// Like most other concurrent collection implementations, this class
// does not permit the use of null elements.
//
// Iterators and spliterators are
// weakly consistent.
//
// Beware that, unlike in most collections, the size method
// is NOT a constant-time operation. Because of the
// asynchronous nature of these deques, determining the current number
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
// methods of the Deque and Iterator interfaces.
//
// Memory consistency effects: As with other concurrent collections,
// actions in a thread prior to placing an object into a
// ConcurrentLinkedDeque
// happen-before
// actions subsequent to the access or removal of that element from
// the ConcurrentLinkedDeque in another thread.
//
// This class is a member of the
// 
// Java Collections Framework.
class ConcurrentLinkedDeque[E] extends AbstractCollection[E] with Deque[E], with Serializable {

    @stub
    // Constructs an empty deque.
    def this() = ???

    @stub
    // Inserts the specified element at the tail of this deque.
    def add(e: E): Boolean = ???

    @stub
    // Appends all of the elements in the specified collection to the end of
    // this deque, in the order that they are returned by the specified
    // collection's iterator.
    def addAll(c: Collection[_ <: E]): Boolean = ???

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
    // Returns true if this deque contains at least one
    // element e such that o.equals(e).
    def contains(o: Object): Boolean = ???

    @stub
    // Returns an iterator over the elements in this deque in reverse
    // sequential order.
    def descendingIterator(): Iterator[E] = ???

    @stub
    // Retrieves, but does not remove, the head of the queue represented by
    // this deque (in other words, the first element of this deque).
    def element(): E = ???

    @stub
    // Retrieves, but does not remove, the first element of this deque.
    def getFirst(): E = ???

    @stub
    // Retrieves, but does not remove, the last element of this deque.
    def getLast(): E = ???

    @stub
    // Returns true if this collection contains no elements.
    def isEmpty(): Boolean = ???

    @stub
    // Returns an iterator over the elements in this deque in proper sequence.
    def iterator(): Iterator[E] = ???

    @stub
    // Inserts the specified element at the tail of this deque.
    def offer(e: E): Boolean = ???

    @stub
    // Inserts the specified element at the front of this deque.
    def offerFirst(e: E): Boolean = ???

    @stub
    // Inserts the specified element at the end of this deque.
    def offerLast(e: E): Boolean = ???

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
    // Pushes an element onto the stack represented by this deque (in other
    // words, at the head of this deque) if it is possible to do so
    // immediately without violating capacity restrictions, throwing an
    // IllegalStateException if no space is currently available.
    def push(e: E): Unit = ???

    @stub
    // Retrieves and removes the head of the queue represented by this deque
    // (in other words, the first element of this deque).
    def remove(): E = ???

    @stub
    // Removes the first element e such that
    // o.equals(e), if such an element exists in this deque.
    def remove(o: Object): Boolean = ???

    @stub
    // Retrieves and removes the first element of this deque.
    def removeFirst(): E = ???

    @stub
    // Removes the first element e such that
    // o.equals(e), if such an element exists in this deque.
    def removeFirstOccurrence(o: Object): Boolean = ???

    @stub
    // Retrieves and removes the last element of this deque.
    def removeLast(): E = ???

    @stub
    // Removes the last element e such that
    // o.equals(e), if such an element exists in this deque.
    def removeLastOccurrence(o: Object): Boolean = ???

    @stub
    // Returns the number of elements in this deque.
    def size(): Int = ???

    @stub
    // Returns a Spliterator over the elements in this deque.
    def spliterator(): Spliterator[E] = ???

    @stub
    // Returns an array containing all of the elements in this deque, in
    // proper sequence (from first to last element).
    def toArray(): Array[Object] = ???
}
