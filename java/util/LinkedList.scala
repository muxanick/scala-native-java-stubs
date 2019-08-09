package java.util

import java.io.Serializable
import java.lang.{Cloneable, Object}

// Doubly-linked list implementation of the List and Deque
// interfaces.  Implements all optional list operations, and permits all
// elements (including null).
//
// All of the operations perform as could be expected for a doubly-linked
// list.  Operations that index into the list will traverse the list from
// the beginning or the end, whichever is closer to the specified index.
//
// Note that this implementation is not synchronized.
// If multiple threads access a linked list concurrently, and at least
// one of the threads modifies the list structurally, it must be
// synchronized externally.  (A structural modification is any operation
// that adds or deletes one or more elements; merely setting the value of
// an element is not a structural modification.)  This is typically
// accomplished by synchronizing on some object that naturally
// encapsulates the list.
//
// If no such object exists, the list should be "wrapped" using the
// Collections.synchronizedList
// method.  This is best done at creation time, to prevent accidental
// unsynchronized access to the list:
//   List list = Collections.synchronizedList(new LinkedList(...));
//
// The iterators returned by this class's iterator and
// listIterator methods are fail-fast: if the list is
// structurally modified at any time after the iterator is created, in
// any way except through the Iterator's own remove or
// add methods, the iterator will throw a ConcurrentModificationException.  Thus, in the face of concurrent
// modification, the iterator fails quickly and cleanly, rather than
// risking arbitrary, non-deterministic behavior at an undetermined
// time in the future.
//
// Note that the fail-fast behavior of an iterator cannot be guaranteed
// as it is, generally speaking, impossible to make any hard guarantees in the
// presence of unsynchronized concurrent modification.  Fail-fast iterators
// throw ConcurrentModificationException on a best-effort basis.
// Therefore, it would be wrong to write a program that depended on this
// exception for its correctness:   the fail-fast behavior of iterators
// should be used only to detect bugs.
//
// This class is a member of the
// 
// Java Collections Framework.
class LinkedList[E] extends AbstractSequentialList[E] with List[E], with Deque[E], with Cloneable, with Serializable {

    @stub
    // Constructs an empty list.
    def this() = ???

    @stub
    // Appends the specified element to the end of this list.
    def add(e: E): Boolean = ???

    @stub
    // Inserts the specified element at the specified position in this list.
    def add(index: Int, element: E): Unit = ???

    @stub
    // Appends all of the elements in the specified collection to the end of
    // this list, in the order that they are returned by the specified
    // collection's iterator.
    def addAll(c: Collection[_ <: E]): Boolean = ???

    @stub
    // Inserts all of the elements in the specified collection into this
    // list, starting at the specified position.
    def addAll(index: Int, c: Collection[_ <: E]): Boolean = ???

    @stub
    // Inserts the specified element at the beginning of this list.
    def addFirst(e: E): Unit = ???

    @stub
    // Appends the specified element to the end of this list.
    def addLast(e: E): Unit = ???

    @stub
    // Removes all of the elements from this list.
    def clear(): Unit = ???

    @stub
    // Returns a shallow copy of this LinkedList.
    def clone(): Object = ???

    @stub
    // Returns true if this list contains the specified element.
    def contains(o: Object): Boolean = ???

    @stub
    // Returns an iterator over the elements in this deque in reverse
    // sequential order.
    def descendingIterator(): Iterator[E] = ???

    @stub
    // Retrieves, but does not remove, the head (first element) of this list.
    def element(): E = ???

    @stub
    // Returns the element at the specified position in this list.
    def get(index: Int): E = ???

    @stub
    // Returns the first element in this list.
    def getFirst(): E = ???

    @stub
    // Returns the last element in this list.
    def getLast(): E = ???

    @stub
    // Returns the index of the first occurrence of the specified element
    // in this list, or -1 if this list does not contain the element.
    def indexOf(o: Object): Int = ???

    @stub
    // Returns the index of the last occurrence of the specified element
    // in this list, or -1 if this list does not contain the element.
    def lastIndexOf(o: Object): Int = ???

    @stub
    // Returns a list-iterator of the elements in this list (in proper
    // sequence), starting at the specified position in the list.
    def listIterator(index: Int): ListIterator[E] = ???

    @stub
    // Adds the specified element as the tail (last element) of this list.
    def offer(e: E): Boolean = ???

    @stub
    // Inserts the specified element at the front of this list.
    def offerFirst(e: E): Boolean = ???

    @stub
    // Inserts the specified element at the end of this list.
    def offerLast(e: E): Boolean = ???

    @stub
    // Retrieves, but does not remove, the head (first element) of this list.
    def peek(): E = ???

    @stub
    // Retrieves, but does not remove, the first element of this list,
    // or returns null if this list is empty.
    def peekFirst(): E = ???

    @stub
    // Retrieves, but does not remove, the last element of this list,
    // or returns null if this list is empty.
    def peekLast(): E = ???

    @stub
    // Retrieves and removes the head (first element) of this list.
    def poll(): E = ???

    @stub
    // Retrieves and removes the first element of this list,
    // or returns null if this list is empty.
    def pollFirst(): E = ???

    @stub
    // Retrieves and removes the last element of this list,
    // or returns null if this list is empty.
    def pollLast(): E = ???

    @stub
    // Pops an element from the stack represented by this list.
    def pop(): E = ???

    @stub
    // Pushes an element onto the stack represented by this list.
    def push(e: E): Unit = ???

    @stub
    // Retrieves and removes the head (first element) of this list.
    def remove(): E = ???

    @stub
    // Removes the element at the specified position in this list.
    def remove(index: Int): E = ???

    @stub
    // Removes the first occurrence of the specified element from this list,
    // if it is present.
    def remove(o: Object): Boolean = ???

    @stub
    // Removes and returns the first element from this list.
    def removeFirst(): E = ???

    @stub
    // Removes the first occurrence of the specified element in this
    // list (when traversing the list from head to tail).
    def removeFirstOccurrence(o: Object): Boolean = ???

    @stub
    // Removes and returns the last element from this list.
    def removeLast(): E = ???

    @stub
    // Removes the last occurrence of the specified element in this
    // list (when traversing the list from head to tail).
    def removeLastOccurrence(o: Object): Boolean = ???

    @stub
    // Replaces the element at the specified position in this list with the
    // specified element.
    def set(index: Int, element: E): E = ???

    @stub
    // Returns the number of elements in this list.
    def size(): Int = ???

    @stub
    // Creates a late-binding
    // and fail-fast Spliterator over the elements in this
    // list.
    def spliterator(): Spliterator[E] = ???

    @stub
    // Returns an array containing all of the elements in this list
    // in proper sequence (from first to last element).
    def toArray(): Array[Object] = ???
}
