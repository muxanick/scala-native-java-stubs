package javax.management

import java.lang.Object
import java.util.{AbstractCollection, AbstractList, ArrayList, Collection, List}
import scala.scalanative.annotation.stub

/** Represents a list of values for attributes of an MBean.  See the
 *  getAttributes and
 *  setAttributes methods of
 *  MBeanServer and MBeanServerConnection.
 * 
 *  For compatibility reasons, it is possible, though
 *  highly discouraged, to add objects to an AttributeList that are
 *  not instances of Attribute.  However, an AttributeList
 *  can be made type-safe, which means that an attempt to add
 *  an object that is not an Attribute will produce an IllegalArgumentException.  An AttributeList becomes type-safe
 *  when the method asList() is called on it.
 */
class AttributeList extends ArrayList[Object] {

    /** Constructs an empty AttributeList. */
    @stub
    def this() = ???

    /** Constructs an AttributeList containing the
     *  elements of the AttributeList specified, in the
     *  order in which they are returned by the
     *  AttributeList's iterator.
     */
    @stub
    def this(list: AttributeList) = ???

    /** Constructs an empty AttributeList with
     *  the initial capacity specified.
     */
    @stub
    def this(initialCapacity: Int) = ???

    /** Constructs an AttributeList containing the elements of the
     *  List specified, in the order in which they are returned by
     *  the List's iterator.
     */
    @stub
    def this(list: List[Attribute]) = ???

    /** Adds the Attribute specified as the last element of the list. */
    @stub
    def add(object: Attribute): Unit = ???

    /** Inserts the attribute specified as an element at the position specified. */
    @stub
    def add(index: Int, object: Attribute): Unit = ???

    /** Inserts the specified element at the specified position in this
     *  list.
     */
    @stub
    def add(index: Int, element: Any): Unit = ???

    /** Appends the specified element to the end of this list. */
    @stub
    def add(element: Any): Boolean = ???

    /** Appends all the elements in the AttributeList specified to
     *  the end of the list, in the order in which they are returned by the
     *  Iterator of the AttributeList specified.
     */
    @stub
    def addAll(list: AttributeList): Boolean = ???

    /** Appends all of the elements in the specified collection to the end of
     *  this list, in the order that they are returned by the
     *  specified collection's Iterator.
     */
    @stub
    def addAll(c: Collection[_]): Boolean = ???

    /** Inserts all of the elements in the AttributeList specified
     *  into this list, starting at the specified position, in the order in which
     *  they are returned by the Iterator of the AttributeList specified.
     */
    @stub
    def addAll(index: Int, list: AttributeList): Boolean = ???

    /** Inserts all of the elements in the specified collection into this
     *  list, starting at the specified position.
     */
    @stub
    def addAll(index: Int, c: Collection[_]): Boolean = ???

    /** Return a view of this list as a List<Attribute>. */
    @stub
    def asList(): List[Attribute] = ???

    /** Sets the element at the position specified to be the attribute specified. */
    @stub
    def set(index: Int, object: Attribute): Unit = ???

    /** Replaces the element at the specified position in this list with
     *  the specified element.
     */
    @stub
    def set(index: Int, element: Any): Any = ???
}
