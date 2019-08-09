package java.util

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import java.util.function.{Consumer, Predicate, UnaryOperator}

// The Vector class implements a growable array of
// objects. Like an array, it contains components that can be
// accessed using an integer index. However, the size of a
// Vector can grow or shrink as needed to accommodate
// adding and removing items after the Vector has been created.
//
// Each vector tries to optimize storage management by maintaining a
// capacity and a capacityIncrement. The
// capacity is always at least as large as the vector
// size; it is usually larger because as components are added to the
// vector, the vector's storage increases in chunks the size of
// capacityIncrement. An application can increase the
// capacity of a vector before inserting a large number of
// components; this reduces the amount of incremental reallocation.
//
// 
// The iterators returned by this class's iterator and
// listIterator methods are fail-fast:
// if the vector is structurally modified at any time after the iterator is
// created, in any way except through the iterator's own
// remove or
// add methods, the iterator will throw a
// ConcurrentModificationException.  Thus, in the face of
// concurrent modification, the iterator fails quickly and cleanly, rather
// than risking arbitrary, non-deterministic behavior at an undetermined
// time in the future.  The Enumerations returned by
// the elements method are not fail-fast.
//
// Note that the fail-fast behavior of an iterator cannot be guaranteed
// as it is, generally speaking, impossible to make any hard guarantees in the
// presence of unsynchronized concurrent modification.  Fail-fast iterators
// throw ConcurrentModificationException on a best-effort basis.
// Therefore, it would be wrong to write a program that depended on this
// exception for its correctness:  the fail-fast behavior of iterators
// should be used only to detect bugs.
//
// As of the Java 2 platform v1.2, this class was retrofitted to
// implement the List interface, making it a member of the
// 
// Java Collections Framework.  Unlike the new collection
// implementations, Vector is synchronized.  If a thread-safe
// implementation is not needed, it is recommended to use ArrayList in place of Vector.
class Vector[E] extends AbstractList[E] with List[E], with RandomAccess, with Cloneable, with Serializable {

    @stub
    // Constructs an empty vector so that its internal data array
    // has size 10 and its standard capacity increment is
    // zero.
    def this() = ???

    @stub
    // Constructs a vector containing the elements of the specified
    // collection, in the order they are returned by the collection's
    // iterator.
    def this(c: Collection[_ <: E]) = ???

    @stub
    // Constructs an empty vector with the specified initial capacity and
    // with its capacity increment equal to zero.
    def this(initialCapacity: Int) = ???

    @stub
    // The amount by which the capacity of the vector is automatically
    // incremented when its size becomes greater than its capacity.
    protected def capacityIncrement: Int = ???

    @stub
    // The number of valid components in this Vector object.
    protected def elementCount: Int = ???

    @stub
    // Appends the specified element to the end of this Vector.
    def add(e: E): Boolean = ???

    @stub
    // Inserts the specified element at the specified position in this Vector.
    def add(index: Int, element: E): Unit = ???

    @stub
    // Appends all of the elements in the specified Collection to the end of
    // this Vector, in the order that they are returned by the specified
    // Collection's Iterator.
    def addAll(c: Collection[_ <: E]): Boolean = ???

    @stub
    // Inserts all of the elements in the specified Collection into this
    // Vector at the specified position.
    def addAll(index: Int, c: Collection[_ <: E]): Boolean = ???

    @stub
    // Adds the specified component to the end of this vector,
    // increasing its size by one.
    def addElement(obj: E): Unit = ???

    @stub
    // Returns the current capacity of this vector.
    def capacity(): Int = ???

    @stub
    // Removes all of the elements from this Vector.
    def clear(): Unit = ???

    @stub
    // Returns a clone of this vector.
    def clone(): Object = ???

    @stub
    // Returns true if this vector contains the specified element.
    def contains(o: Object): Boolean = ???

    @stub
    // Returns true if this Vector contains all of the elements in the
    // specified Collection.
    def containsAll(c: Collection[_]): Boolean = ???

    @stub
    // Copies the components of this vector into the specified array.
    def copyInto(anArray: Array[Object]): Unit = ???

    @stub
    // Returns the component at the specified index.
    def elementAt(index: Int): E = ???

    @stub
    // Returns an enumeration of the components of this vector.
    def elements(): Enumeration[E] = ???

    @stub
    // Increases the capacity of this vector, if necessary, to ensure
    // that it can hold at least the number of components specified by
    // the minimum capacity argument.
    def ensureCapacity(minCapacity: Int): Unit = ???

    @stub
    // Compares the specified Object with this Vector for equality.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns the first component (the item at index 0) of
    // this vector.
    def firstElement(): E = ???

    @stub
    // Performs the given action for each element of the Iterable
    // until all elements have been processed or the action throws an
    // exception.
    def forEach(action: Consumer[_ >: E]): Unit = ???

    @stub
    // Returns the element at the specified position in this Vector.
    def get(index: Int): E = ???

    @stub
    // Returns the hash code value for this Vector.
    def hashCode(): Int = ???

    @stub
    // Returns the index of the first occurrence of the specified element
    // in this vector, or -1 if this vector does not contain the element.
    def indexOf(o: Object): Int = ???

    @stub
    // Returns the index of the first occurrence of the specified element in
    // this vector, searching forwards from index, or returns -1 if
    // the element is not found.
    def indexOf(o: Object, index: Int): Int = ???

    @stub
    // Inserts the specified object as a component in this vector at the
    // specified index.
    def insertElementAt(obj: E, index: Int): Unit = ???

    @stub
    // Tests if this vector has no components.
    def isEmpty(): Boolean = ???

    @stub
    // Returns an iterator over the elements in this list in proper sequence.
    def iterator(): Iterator[E] = ???

    @stub
    // Returns the last component of the vector.
    def lastElement(): E = ???

    @stub
    // Returns the index of the last occurrence of the specified element
    // in this vector, or -1 if this vector does not contain the element.
    def lastIndexOf(o: Object): Int = ???

    @stub
    // Returns the index of the last occurrence of the specified element in
    // this vector, searching backwards from index, or returns -1 if
    // the element is not found.
    def lastIndexOf(o: Object, index: Int): Int = ???

    @stub
    // Returns a list iterator over the elements in this list (in proper
    // sequence).
    def listIterator(): ListIterator[E] = ???

    @stub
    // Returns a list iterator over the elements in this list (in proper
    // sequence), starting at the specified position in the list.
    def listIterator(index: Int): ListIterator[E] = ???

    @stub
    // Removes the element at the specified position in this Vector.
    def remove(index: Int): E = ???

    @stub
    // Removes the first occurrence of the specified element in this Vector
    // If the Vector does not contain the element, it is unchanged.
    def remove(o: Object): Boolean = ???

    @stub
    // Removes from this Vector all of its elements that are contained in the
    // specified Collection.
    def removeAll(c: Collection[_]): Boolean = ???

    @stub
    // Removes all components from this vector and sets its size to zero.
    def removeAllElements(): Unit = ???

    @stub
    // Removes the first (lowest-indexed) occurrence of the argument
    // from this vector.
    def removeElement(obj: Object): Boolean = ???

    @stub
    // Deletes the component at the specified index.
    def removeElementAt(index: Int): Unit = ???

    @stub
    // Removes all of the elements of this collection that satisfy the given
    // predicate.
    def removeIf(filter: Predicate[_ >: E]): Boolean = ???

    @stub
    // Removes from this list all of the elements whose index is between
    // fromIndex, inclusive, and toIndex, exclusive.
    protected def removeRange(fromIndex: Int, toIndex: Int): Unit = ???

    @stub
    // Replaces each element of this list with the result of applying the
    // operator to that element.
    def replaceAll(operator: UnaryOperator[E]): Unit = ???

    @stub
    // Retains only the elements in this Vector that are contained in the
    // specified Collection.
    def retainAll(c: Collection[_]): Boolean = ???

    @stub
    // Replaces the element at the specified position in this Vector with the
    // specified element.
    def set(index: Int, element: E): E = ???

    @stub
    // Sets the component at the specified index of this
    // vector to be the specified object.
    def setElementAt(obj: E, index: Int): Unit = ???

    @stub
    // Sets the size of this vector.
    def setSize(newSize: Int): Unit = ???

    @stub
    // Returns the number of components in this vector.
    def size(): Int = ???

    @stub
    // Sorts this list according to the order induced by the specified
    // Comparator.
    def sort(c: Comparator[_ >: E]): Unit = ???

    @stub
    // Creates a late-binding
    // and fail-fast Spliterator over the elements in this
    // list.
    def spliterator(): Spliterator[E] = ???

    @stub
    // Returns a view of the portion of this List between fromIndex,
    // inclusive, and toIndex, exclusive.
    def subList(fromIndex: Int, toIndex: Int): List[E] = ???

    @stub
    // Returns an array containing all of the elements in this Vector
    // in the correct order.
    def toArray(): Array[Object] = ???

    @stub
    // Returns an array containing all of the elements in this Vector in the
    // correct order; the runtime type of the returned array is that of the
    // specified array.
    def Array[T]: [T] = ???

    @stub
    // Returns a string representation of this Vector, containing
    // the String representation of each element.
    def toString(): String = ???
}
