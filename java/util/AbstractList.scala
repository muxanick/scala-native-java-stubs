package java.util

import java.lang.Object

// This class provides a skeletal implementation of the List
// interface to minimize the effort required to implement this interface
// backed by a "random access" data store (such as an array).  For sequential
// access data (such as a linked list), AbstractSequentialList should
// be used in preference to this class.
//
// To implement an unmodifiable list, the programmer needs only to extend
// this class and provide implementations for the get(int) and
// size() methods.
//
// To implement a modifiable list, the programmer must additionally
// override the set(int, E) method (which otherwise
// throws an UnsupportedOperationException).  If the list is
// variable-size the programmer must additionally override the
// add(int, E) and remove(int) methods.
//
// The programmer should generally provide a void (no argument) and collection
// constructor, as per the recommendation in the Collection interface
// specification.
//
// Unlike the other abstract collection implementations, the programmer does
// not have to provide an iterator implementation; the iterator and
// list iterator are implemented by this class, on top of the "random access"
// methods:
// get(int),
// set(int, E),
// add(int, E) and
// remove(int).
//
// The documentation for each non-abstract method in this class describes its
// implementation in detail.  Each of these methods may be overridden if the
// collection being implemented admits a more efficient implementation.
//
// This class is a member of the
// 
// Java Collections Framework.
abstract class AbstractList[E] extends AbstractCollection[E] with List[E] {

    // Appends the specified element to the end of this list (optional
    // operation).
    def add(e: E): Boolean

    // Inserts the specified element at the specified position in this list
    // (optional operation).
    def add(index: Int, element: E): Unit

    // Inserts all of the elements in the specified collection into this
    // list at the specified position (optional operation).
    def addAll(index: Int, c: Collection[_ <: E]): Boolean

    // Removes all of the elements from this list (optional operation).
    def clear(): Unit

    // Compares the specified object with this list for equality.
    def equals(o: Object): Boolean

    // Returns the element at the specified position in this list.
    def get(index: Int): E

    // Returns the hash code value for this list.
    def hashCode(): Int

    // Returns the index of the first occurrence of the specified element
    // in this list, or -1 if this list does not contain the element.
    def indexOf(o: Object): Int

    // Returns an iterator over the elements in this list in proper sequence.
    def iterator(): Iterator[E]

    // Returns the index of the last occurrence of the specified element
    // in this list, or -1 if this list does not contain the element.
    def lastIndexOf(o: Object): Int

    // Returns a list iterator over the elements in this list (in proper
    // sequence).
    def listIterator(): ListIterator[E]

    // Returns a list iterator over the elements in this list (in proper
    // sequence), starting at the specified position in the list.
    def listIterator(index: Int): ListIterator[E]

    // Removes the element at the specified position in this list (optional
    // operation).
    def remove(index: Int): E

    // Removes from this list all of the elements whose index is between
    // fromIndex, inclusive, and toIndex, exclusive.
    protected def removeRange(fromIndex: Int, toIndex: Int): Unit

    // Replaces the element at the specified position in this list with the
    // specified element (optional operation).
    def set(index: Int, element: E): E
}
