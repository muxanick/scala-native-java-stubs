package javax.swing

import java.lang.{Object, String}
import java.util.Enumeration

/** This class loosely implements the java.util.Vector
 *  API, in that it implements the 1.1.x version of
 *  java.util.Vector, has no collection class support,
 *  and notifies the ListDataListeners when changes occur.
 *  Presently it delegates to a Vector,
 *  in a future release it will be a real Collection implementation.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class DefaultListModel[E] extends AbstractListModel[E] {

    /** Inserts the specified element at the specified position in this list. */
    @stub
    def add(index: Int, element: E): Unit = ???

    /** Adds the specified component to the end of this list. */
    @stub
    def addElement(element: E): Unit = ???

    /** Returns the current capacity of this list. */
    @stub
    def capacity(): Int = ???

    /** Removes all of the elements from this list. */
    @stub
    def clear(): Unit = ???

    /** Tests whether the specified object is a component in this list. */
    @stub
    def contains(elem: Object): Boolean = ???

    /** Copies the components of this list into the specified array. */
    @stub
    def copyInto(anArray: Array[Object]): Unit = ???

    /** Returns the component at the specified index. */
    @stub
    def elementAt(index: Int): E = ???

    /** Returns an enumeration of the components of this list. */
    @stub
    def elements(): Enumeration[E] = ???

    /** Increases the capacity of this list, if necessary, to ensure
     *  that it can hold at least the number of components specified by
     *  the minimum capacity argument.
     */
    @stub
    def ensureCapacity(minCapacity: Int): Unit = ???

    /** Returns the first component of this list. */
    @stub
    def firstElement(): E = ???

    /** Returns the element at the specified position in this list. */
    @stub
    def get(index: Int): E = ???

    /** Returns the component at the specified index. */
    @stub
    def getElementAt(index: Int): E = ???

    /** Returns the number of components in this list. */
    @stub
    def getSize(): Int = ???

    /** Searches for the first occurrence of elem. */
    @stub
    def indexOf(elem: Object): Int = ???

    /** Searches for the first occurrence of elem, beginning
     *  the search at index.
     */
    @stub
    def indexOf(elem: Object, index: Int): Int = ???

    /** Inserts the specified element as a component in this list at the
     *  specified index.
     */
    @stub
    def insertElementAt(element: E, index: Int): Unit = ???

    /** Tests whether this list has any components. */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns the last component of the list. */
    @stub
    def lastElement(): E = ???

    /** Returns the index of the last occurrence of elem. */
    @stub
    def lastIndexOf(elem: Object): Int = ???

    /** Searches backwards for elem, starting from the
     *  specified index, and returns an index to it.
     */
    @stub
    def lastIndexOf(elem: Object, index: Int): Int = ???

    /** Removes the element at the specified position in this list. */
    @stub
    def remove(index: Int): E = ???

    /** Removes all components from this list and sets its size to zero. */
    @stub
    def removeAllElements(): Unit = ???

    /** Removes the first (lowest-indexed) occurrence of the argument
     *  from this list.
     */
    @stub
    def removeElement(obj: Object): Boolean = ???

    /** Deletes the component at the specified index. */
    @stub
    def removeElementAt(index: Int): Unit = ???

    /** Deletes the components at the specified range of indexes. */
    @stub
    def removeRange(fromIndex: Int, toIndex: Int): Unit = ???

    /** Replaces the element at the specified position in this list with the
     *  specified element.
     */
    @stub
    def set(index: Int, element: E): E = ???

    /** Sets the component at the specified index of this
     *  list to be the specified element.
     */
    @stub
    def setElementAt(element: E, index: Int): Unit = ???

    /** Sets the size of this list. */
    @stub
    def setSize(newSize: Int): Unit = ???

    /** Returns the number of components in this list. */
    @stub
    def size(): Int = ???

    /** Returns an array containing all of the elements in this list in the
     *  correct order.
     */
    @stub
    def toArray(): Array[Object] = ???

    /** Returns a string that displays and identifies this
     *  object's properties.
     */
    @stub
    def toString(): String = ???
}
