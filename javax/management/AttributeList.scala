package javax.management

import java.lang.Object
import java.util.{AbstractCollection, AbstractList, ArrayList, Collection, List}

// Represents a list of values for attributes of an MBean.  See the
// getAttributes and
// setAttributes methods of
// MBeanServer and MBeanServerConnection.
//
// For compatibility reasons, it is possible, though
// highly discouraged, to add objects to an AttributeList that are
// not instances of Attribute.  However, an AttributeList
// can be made type-safe, which means that an attempt to add
// an object that is not an Attribute will produce an IllegalArgumentException.  An AttributeList becomes type-safe
// when the method asList() is called on it.
class AttributeList extends ArrayList[Object] {

    @stub
    // Constructs an empty AttributeList.
    def this() = ???

    @stub
    // Constructs an AttributeList containing the
    // elements of the AttributeList specified, in the
    // order in which they are returned by the
    // AttributeList's iterator.
    def this(list: AttributeList) = ???

    @stub
    // Constructs an empty AttributeList with
    // the initial capacity specified.
    def this(initialCapacity: Int) = ???

    @stub
    // Adds the Attribute specified as the last element of the list.
    def add(object: Attribute): Unit = ???

    @stub
    // Inserts the attribute specified as an element at the position specified.
    def add(index: Int, object: Attribute): Unit = ???

    @stub
    // Inserts the specified element at the specified position in this
    // list.
    def add(index: Int, element: Object): Unit = ???

    @stub
    // Appends the specified element to the end of this list.
    def add(element: Object): Boolean = ???

    @stub
    // Appends all the elements in the AttributeList specified to
    // the end of the list, in the order in which they are returned by the
    // Iterator of the AttributeList specified.
    def addAll(list: AttributeList): Boolean = ???

    @stub
    // Appends all of the elements in the specified collection to the end of
    // this list, in the order that they are returned by the
    // specified collection's Iterator.
    def addAll(c: Collection[_]): Boolean = ???

    @stub
    // Inserts all of the elements in the AttributeList specified
    // into this list, starting at the specified position, in the order in which
    // they are returned by the Iterator of the AttributeList specified.
    def addAll(index: Int, list: AttributeList): Boolean = ???

    @stub
    // Inserts all of the elements in the specified collection into this
    // list, starting at the specified position.
    def addAll(index: Int, c: Collection[_]): Boolean = ???

    @stub
    // Return a view of this list as a List<Attribute>.
    def asList(): List[Attribute] = ???

    @stub
    // Sets the element at the position specified to be the attribute specified.
    def set(index: Int, object: Attribute): Unit = ???
}
