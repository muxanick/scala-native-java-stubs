package javax.management.relation

import java.lang.Object
import java.util.{AbstractCollection, AbstractList, ArrayList, Collection, List}
import scala.scalanative.annotation.stub

/** A RoleUnresolvedList represents a list of RoleUnresolved objects,
 *  representing roles not retrieved from a relation due to a problem
 *  encountered when trying to access (read or write) the roles.
 */
class RoleUnresolvedList extends ArrayList[Object] {

    /** Constructs an empty RoleUnresolvedList. */
    @stub
    def this() = ???

    /** Constructs an empty RoleUnresolvedList with the initial capacity
     *  specified.
     */
    @stub
    def this(initialCapacity: Int) = ???

    /** Constructs a RoleUnresolvedList containing the elements of the
     *  List specified, in the order in which they are returned by
     *  the List's iterator.
     */
    @stub
    def this(list: List[RoleUnresolved]) = ???

    /** Inserts the specified element at the specified position in this
     *  list.
     */
    @stub
    def add(index: Int, element: Object): Unit = ???

    /** Inserts the unresolved role specified as an element at the position
     *  specified.
     */
    @stub
    def add(index: Int, role: RoleUnresolved): Unit = ???

    /** Appends the specified element to the end of this list. */
    @stub
    def add(o: Object): Boolean = ???

    /** Adds the RoleUnresolved specified as the last element of the list. */
    @stub
    def add(role: RoleUnresolved): Unit = ???

    /** Appends all of the elements in the specified collection to the end of
     *  this list, in the order that they are returned by the
     *  specified collection's Iterator.
     */
    @stub
    def addAll(c: Collection[_]): Boolean = ???

    /** Inserts all of the elements in the specified collection into this
     *  list, starting at the specified position.
     */
    @stub
    def addAll(index: Int, c: Collection[_]): Boolean = ???

    /** Inserts all of the elements in the RoleUnresolvedList specified into
     *  this list, starting at the specified position, in the order in which
     *  they are returned by the Iterator of the RoleUnresolvedList specified.
     */
    @stub
    def addAll(index: Int, roleList: RoleUnresolvedList): Boolean = ???

    /** Appends all the elements in the RoleUnresolvedList specified to the end
     *  of the list, in the order in which they are returned by the Iterator of
     *  the RoleUnresolvedList specified.
     */
    @stub
    def addAll(roleList: RoleUnresolvedList): Boolean = ???

    /** Return a view of this list as a List<RoleUnresolved>. */
    @stub
    def asList(): List[RoleUnresolved] = ???

    /** Replaces the element at the specified position in this list with
     *  the specified element.
     */
    @stub
    def set(index: Int, element: Object): Object = ???

    /** Sets the element at the position specified to be the unresolved role
     *  specified.
     */
    @stub
    def set(index: Int, role: RoleUnresolved): Unit = ???
}
