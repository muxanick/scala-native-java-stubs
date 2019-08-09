package javax.swing

import java.lang.{Object, String}
import java.util.Enumeration

// This class loosely implements the java.util.Vector
// API, in that it implements the 1.1.x version of
// java.util.Vector, has no collection class support,
// and notifies the ListDataListeners when changes occur.
// Presently it delegates to a Vector,
// in a future release it will be a real Collection implementation.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class DefaultListModel[E] extends AbstractListModel[E] {

    @stub
    // Inserts the specified element at the specified position in this list.
    def add(index: Int, element: E): Unit = ???

    @stub
    // Adds the specified component to the end of this list.
    def addElement(element: E): Unit = ???

    @stub
    // Returns the current capacity of this list.
    def capacity(): Int = ???

    @stub
    // Removes all of the elements from this list.
    def clear(): Unit = ???

    @stub
    // Tests whether the specified object is a component in this list.
    def contains(elem: Object): Boolean = ???

    @stub
    // Copies the components of this list into the specified array.
    def copyInto(anArray: Array[Object]): Unit = ???

    @stub
    // Returns the component at the specified index.
    def elementAt(index: Int): E = ???

    @stub
    // Returns an enumeration of the components of this list.
    def elements(): Enumeration[E] = ???

    @stub
    // Increases the capacity of this list, if necessary, to ensure
    // that it can hold at least the number of components specified by
    // the minimum capacity argument.
    def ensureCapacity(minCapacity: Int): Unit = ???

    @stub
    // Returns the first component of this list.
    def firstElement(): E = ???

    @stub
    // Returns the element at the specified position in this list.
    def get(index: Int): E = ???

    @stub
    // Returns the component at the specified index.
    def getElementAt(index: Int): E = ???

    @stub
    // Returns the number of components in this list.
    def getSize(): Int = ???

    @stub
    // Searches for the first occurrence of elem.
    def indexOf(elem: Object): Int = ???

    @stub
    // Searches for the first occurrence of elem, beginning
    // the search at index.
    def indexOf(elem: Object, index: Int): Int = ???

    @stub
    // Inserts the specified element as a component in this list at the
    // specified index.
    def insertElementAt(element: E, index: Int): Unit = ???

    @stub
    // Tests whether this list has any components.
    def isEmpty(): Boolean = ???

    @stub
    // Returns the last component of the list.
    def lastElement(): E = ???

    @stub
    // Returns the index of the last occurrence of elem.
    def lastIndexOf(elem: Object): Int = ???

    @stub
    // Searches backwards for elem, starting from the
    // specified index, and returns an index to it.
    def lastIndexOf(elem: Object, index: Int): Int = ???

    @stub
    // Removes the element at the specified position in this list.
    def remove(index: Int): E = ???

    @stub
    // Removes all components from this list and sets its size to zero.
    def removeAllElements(): Unit = ???

    @stub
    // Removes the first (lowest-indexed) occurrence of the argument
    // from this list.
    def removeElement(obj: Object): Boolean = ???

    @stub
    // Deletes the component at the specified index.
    def removeElementAt(index: Int): Unit = ???

    @stub
    // Deletes the components at the specified range of indexes.
    def removeRange(fromIndex: Int, toIndex: Int): Unit = ???

    @stub
    // Replaces the element at the specified position in this list with the
    // specified element.
    def set(index: Int, element: E): E = ???

    @stub
    // Sets the component at the specified index of this
    // list to be the specified element.
    def setElementAt(element: E, index: Int): Unit = ???

    @stub
    // Sets the size of this list.
    def setSize(newSize: Int): Unit = ???

    @stub
    // Returns the number of components in this list.
    def size(): Int = ???

    @stub
    // Returns an array containing all of the elements in this list in the
    // correct order.
    def toArray(): Array[Object] = ???

    @stub
    // Returns a string that displays and identifies this
    // object's properties.
    def toString(): String = ???
}
