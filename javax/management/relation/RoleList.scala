package javax.management.relation

import java.lang.Object
import java.util.{AbstractCollection, AbstractList, ArrayList, Collection, List}
import scala.scalanative.annotation.stub

/** A RoleList represents a list of roles (Role objects). It is used as
 *  parameter when creating a relation, and when trying to set several roles in
 *  a relation (via 'setRoles()' method). It is returned as part of a
 *  RoleResult, to provide roles successfully retrieved.
 */
class RoleList extends ArrayList[Object] {

    /** Constructs an empty RoleList. */
    @stub
    def this() = ???

    /** Constructs an empty RoleList with the initial capacity
     *  specified.
     */
    @stub
    def this(initialCapacity: Int) = ???

    /** Constructs a RoleList containing the elements of the
     *  List specified, in the order in which they are returned by
     *  the List's iterator.
     */
    @stub
    def this(list: List[Role]) = ???

    /** Inserts the specified element at the specified position in this
     *  list.
     */
    @stub
    def add(index: Int, element: Any): Unit = ???

    /** Inserts the role specified as an element at the position specified. */
    @stub
    def add(index: Int, role: Role): Unit = ???

    /** Appends the specified element to the end of this list. */
    @stub
    def add(o: Any): Boolean = ???

    /** Adds the Role specified as the last element of the list. */
    @stub
    def add(role: Role): Unit = ???

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

    /** Inserts all of the elements in the RoleList specified into this
     *  list, starting at the specified position, in the order in which they are
     *  returned by the Iterator of the RoleList specified.
     */
    @stub
    def addAll(index: Int, roleList: RoleList): Boolean = ???

    /** Appends all the elements in the RoleList specified to the end
     *  of the list, in the order in which they are returned by the Iterator of
     *  the RoleList specified.
     */
    @stub
    def addAll(roleList: RoleList): Boolean = ???

    /** Return a view of this list as a List<Role>. */
    @stub
    def asList(): List[Role] = ???

    /** Replaces the element at the specified position in this list with
     *  the specified element.
     */
    @stub
    def set(index: Int, element: Any): Any = ???

    /** Sets the element at the position specified to be the role
     *  specified.
     */
    @stub
    def set(index: Int, role: Role): Unit = ???
}
