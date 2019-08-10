package java.util

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import java.util.function.{Consumer, Predicate, UnaryOperator}
import scala.scalanative.annotation.stub

/** The Vector class implements a growable array of
 *  objects. Like an array, it contains components that can be
 *  accessed using an integer index. However, the size of a
 *  Vector can grow or shrink as needed to accommodate
 *  adding and removing items after the Vector has been created.
 * 
 *  Each vector tries to optimize storage management by maintaining a
 *  capacity and a capacityIncrement. The
 *  capacity is always at least as large as the vector
 *  size; it is usually larger because as components are added to the
 *  vector, the vector's storage increases in chunks the size of
 *  capacityIncrement. An application can increase the
 *  capacity of a vector before inserting a large number of
 *  components; this reduces the amount of incremental reallocation.
 * 
 *  
 *  The iterators returned by this class's iterator and
 *  listIterator methods are fail-fast:
 *  if the vector is structurally modified at any time after the iterator is
 *  created, in any way except through the iterator's own
 *  remove or
 *  add methods, the iterator will throw a
 *  ConcurrentModificationException.  Thus, in the face of
 *  concurrent modification, the iterator fails quickly and cleanly, rather
 *  than risking arbitrary, non-deterministic behavior at an undetermined
 *  time in the future.  The Enumerations returned by
 *  the elements method are not fail-fast.
 * 
 *  Note that the fail-fast behavior of an iterator cannot be guaranteed
 *  as it is, generally speaking, impossible to make any hard guarantees in the
 *  presence of unsynchronized concurrent modification.  Fail-fast iterators
 *  throw ConcurrentModificationException on a best-effort basis.
 *  Therefore, it would be wrong to write a program that depended on this
 *  exception for its correctness:  the fail-fast behavior of iterators
 *  should be used only to detect bugs.
 * 
 *  As of the Java 2 platform v1.2, this class was retrofitted to
 *  implement the List interface, making it a member of the
 *  
 *  Java Collections Framework.  Unlike the new collection
 *  implementations, Vector is synchronized.  If a thread-safe
 *  implementation is not needed, it is recommended to use ArrayList in place of Vector.
 */
class Vector[E] extends AbstractList[E] with List[E] with RandomAccess with Cloneable with Serializable {

    /** Constructs an empty vector so that its internal data array
     *  has size 10 and its standard capacity increment is
     *  zero.
     */
    @stub
    def this() = ???

    /** Constructs a vector containing the elements of the specified
     *  collection, in the order they are returned by the collection's
     *  iterator.
     */
    @stub
    def this(c: Collection[_ <: E]) = ???

    /** Constructs an empty vector with the specified initial capacity and
     *  with its capacity increment equal to zero.
     */
    @stub
    def this(initialCapacity: Int) = ???

    /** Constructs an empty vector with the specified initial capacity and
     *  capacity increment.
     */
    @stub
    def this(initialCapacity: Int, capacityIncrement: Int) = ???

    /** The amount by which the capacity of the vector is automatically
     *  incremented when its size becomes greater than its capacity.
     */
    @stub
    protected val capacityIncrement: Int = ???

    /** The number of valid components in this Vector object. */
    @stub
    protected val elementCount: Int = ???

    /** The array buffer into which the components of the vector are
     *  stored.
     */
    @stub
    protected val elementData: Array[Object] = ???

    /** Appends the specified element to the end of this Vector. */
    @stub
    def add(e: E): Boolean = ???

    /** Inserts the specified element at the specified position in this Vector. */
    @stub
    def add(index: Int, element: E): Unit = ???

    /** Appends all of the elements in the specified Collection to the end of
     *  this Vector, in the order that they are returned by the specified
     *  Collection's Iterator.
     */
    @stub
    def addAll(c: Collection[_ <: E]): Boolean = ???

    /** Inserts all of the elements in the specified Collection into this
     *  Vector at the specified position.
     */
    @stub
    def addAll(index: Int, c: Collection[_ <: E]): Boolean = ???

    /** Adds the specified component to the end of this vector,
     *  increasing its size by one.
     */
    @stub
    def addElement(obj: E): Unit = ???

    /** Returns the current capacity of this vector. */
    @stub
    def capacity(): Int = ???

    /** Removes all of the elements from this Vector. */
    @stub
    def clear(): Unit = ???

    /** Returns a clone of this vector. */
    @stub
    def clone(): Any = ???

    /** Returns true if this vector contains the specified element. */
    @stub
    def contains(o: Any): Boolean = ???

    /** Returns true if this Vector contains all of the elements in the
     *  specified Collection.
     */
    @stub
    def containsAll(c: Collection[_]): Boolean = ???

    /** Copies the components of this vector into the specified array. */
    @stub
    def copyInto(anArray: Array[Object]): Unit = ???

    /** Returns the component at the specified index. */
    @stub
    def elementAt(index: Int): E = ???

    /** Returns an enumeration of the components of this vector. */
    @stub
    def elements(): Enumeration[E] = ???

    /** Increases the capacity of this vector, if necessary, to ensure
     *  that it can hold at least the number of components specified by
     *  the minimum capacity argument.
     */
    @stub
    def ensureCapacity(minCapacity: Int): Unit = ???

    /** Compares the specified Object with this Vector for equality. */
    @stub
    def equals(o: Any): Boolean = ???

    /** Returns the first component (the item at index 0) of
     *  this vector.
     */
    @stub
    def firstElement(): E = ???

    /** Performs the given action for each element of the Iterable
     *  until all elements have been processed or the action throws an
     *  exception.
     */
    @stub
    def forEach(action: Consumer[_ >: E]): Unit = ???

    /** Returns the element at the specified position in this Vector. */
    @stub
    def get(index: Int): E = ???

    /** Returns the hash code value for this Vector. */
    @stub
    def hashCode(): Int = ???

    /** Returns the index of the first occurrence of the specified element
     *  in this vector, or -1 if this vector does not contain the element.
     */
    @stub
    def indexOf(o: Any): Int = ???

    /** Returns the index of the first occurrence of the specified element in
     *  this vector, searching forwards from index, or returns -1 if
     *  the element is not found.
     */
    @stub
    def indexOf(o: Any, index: Int): Int = ???

    /** Inserts the specified object as a component in this vector at the
     *  specified index.
     */
    @stub
    def insertElementAt(obj: E, index: Int): Unit = ???

    /** Tests if this vector has no components. */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns an iterator over the elements in this list in proper sequence. */
    @stub
    def iterator(): Iterator[E] = ???

    /** Returns the last component of the vector. */
    @stub
    def lastElement(): E = ???

    /** Returns the index of the last occurrence of the specified element
     *  in this vector, or -1 if this vector does not contain the element.
     */
    @stub
    def lastIndexOf(o: Any): Int = ???

    /** Returns the index of the last occurrence of the specified element in
     *  this vector, searching backwards from index, or returns -1 if
     *  the element is not found.
     */
    @stub
    def lastIndexOf(o: Any, index: Int): Int = ???

    /** Returns a list iterator over the elements in this list (in proper
     *  sequence).
     */
    @stub
    def listIterator(): ListIterator[E] = ???

    /** Returns a list iterator over the elements in this list (in proper
     *  sequence), starting at the specified position in the list.
     */
    @stub
    def listIterator(index: Int): ListIterator[E] = ???

    /** Removes the element at the specified position in this Vector. */
    @stub
    def remove(index: Int): E = ???

    /** Removes the first occurrence of the specified element in this Vector
     *  If the Vector does not contain the element, it is unchanged.
     */
    @stub
    def remove(o: Any): Boolean = ???

    /** Removes from this Vector all of its elements that are contained in the
     *  specified Collection.
     */
    @stub
    def removeAll(c: Collection[_]): Boolean = ???

    /** Removes all components from this vector and sets its size to zero. */
    @stub
    def removeAllElements(): Unit = ???

    /** Removes the first (lowest-indexed) occurrence of the argument
     *  from this vector.
     */
    @stub
    def removeElement(obj: Any): Boolean = ???

    /** Deletes the component at the specified index. */
    @stub
    def removeElementAt(index: Int): Unit = ???

    /** Removes all of the elements of this collection that satisfy the given
     *  predicate.
     */
    @stub
    def removeIf(filter: Predicate[_ >: E]): Boolean = ???

    /** Removes from this list all of the elements whose index is between
     *  fromIndex, inclusive, and toIndex, exclusive.
     */
    @stub
    protected def removeRange(fromIndex: Int, toIndex: Int): Unit = ???

    /** Replaces each element of this list with the result of applying the
     *  operator to that element.
     */
    @stub
    def replaceAll(operator: UnaryOperator[E]): Unit = ???

    /** Retains only the elements in this Vector that are contained in the
     *  specified Collection.
     */
    @stub
    def retainAll(c: Collection[_]): Boolean = ???

    /** Replaces the element at the specified position in this Vector with the
     *  specified element.
     */
    @stub
    def set(index: Int, element: E): E = ???

    /** Sets the component at the specified index of this
     *  vector to be the specified object.
     */
    @stub
    def setElementAt(obj: E, index: Int): Unit = ???

    /** Sets the size of this vector. */
    @stub
    def setSize(newSize: Int): Unit = ???

    /** Returns the number of components in this vector. */
    @stub
    def size(): Int = ???

    /** Sorts this list according to the order induced by the specified
     *  Comparator.
     */
    @stub
    def sort(c: Comparator[_ >: E]): Unit = ???

    /** Creates a late-binding
     *  and fail-fast Spliterator over the elements in this
     *  list.
     */
    @stub
    def spliterator(): Spliterator[E] = ???

    /** Returns a view of the portion of this List between fromIndex,
     *  inclusive, and toIndex, exclusive.
     */
    @stub
    def subList(fromIndex: Int, toIndex: Int): List[E] = ???

    /** Returns an array containing all of the elements in this Vector
     *  in the correct order.
     */
    @stub
    def toArray(): Array[Object] = ???

    /** Returns an array containing all of the elements in this Vector in the
     *  correct order; the runtime type of the returned array is that of the
     *  specified array.
     */
    @stub
    def toArray[T](a: Array[T]): Array[T] = ???

    /** Returns a string representation of this Vector, containing
     *  the String representation of each element.
     */
    @stub
    def toString(): String = ???

    /** Trims the capacity of this vector to be the vector's current
     *  size.
     */
    @stub
    def trimToSize(): Unit = ???
}
