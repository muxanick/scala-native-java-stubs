package java.util

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class provides a skeletal implementation of the Collection
 *  interface, to minimize the effort required to implement this interface. 
 * 
 *  To implement an unmodifiable collection, the programmer needs only to
 *  extend this class and provide implementations for the iterator and
 *  size methods.  (The iterator returned by the iterator
 *  method must implement hasNext and next.)
 * 
 *  To implement a modifiable collection, the programmer must additionally
 *  override this class's add method (which otherwise throws an
 *  UnsupportedOperationException), and the iterator returned by the
 *  iterator method must additionally implement its remove
 *  method.
 * 
 *  The programmer should generally provide a void (no argument) and
 *  Collection constructor, as per the recommendation in the
 *  Collection interface specification.
 * 
 *  The documentation for each non-abstract method in this class describes its
 *  implementation in detail.  Each of these methods may be overridden if
 *  the collection being implemented admits a more efficient implementation.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
abstract class AbstractCollection[E] extends Object with Collection[E] {

    /** Sole constructor. */
    @stub
    protected def this() = ???

    /** Ensures that this collection contains the specified element (optional
     *  operation).
     */
    def add(e: E): Boolean

    /** Adds all of the elements in the specified collection to this collection
     *  (optional operation).
     */
    def addAll(c: Collection[_ <: E]): Boolean

    /** Removes all of the elements from this collection (optional operation). */
    def clear(): Unit

    /** Returns true if this collection contains the specified element. */
    def contains(o: Object): Boolean

    /** Returns true if this collection contains all of the elements
     *  in the specified collection.
     */
    def containsAll(c: Collection[_]): Boolean

    /** Returns true if this collection contains no elements. */
    def isEmpty(): Boolean

    /** Returns an iterator over the elements contained in this collection. */
    def iterator(): Iterator[E]

    /** Removes a single instance of the specified element from this
     *  collection, if it is present (optional operation).
     */
    def remove(o: Object): Boolean

    /** Removes all of this collection's elements that are also contained in the
     *  specified collection (optional operation).
     */
    def removeAll(c: Collection[_]): Boolean

    /** Retains only the elements in this collection that are contained in the
     *  specified collection (optional operation).
     */
    def retainAll(c: Collection[_]): Boolean

    /** Returns the number of elements in this collection. */
    def size(): Int

    /** Returns an array containing all of the elements in this collection. */
    def toArray(): Array[Object]

    /** Returns an array containing all of the elements in this collection;
     *  the runtime type of the returned array is that of the specified array.
     */
    def toArray[T](a: Array[T]): Array[T]

    /** Returns a string representation of this collection. */
    def toString(): String
}
