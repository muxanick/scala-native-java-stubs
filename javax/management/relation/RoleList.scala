package javax.management.relation

import java.lang.Object
import java.util.{AbstractCollection, AbstractList, ArrayList, Collection, List}

// A RoleList represents a list of roles (Role objects). It is used as
// parameter when creating a relation, and when trying to set several roles in
// a relation (via 'setRoles()' method). It is returned as part of a
// RoleResult, to provide roles successfully retrieved.
class RoleList extends ArrayList[Object] {

    @stub
    // Constructs an empty RoleList.
    def this() = ???

    @stub
    // Constructs an empty RoleList with the initial capacity
    // specified.
    def this(initialCapacity: Int) = ???

    @stub
    // Inserts the specified element at the specified position in this
    // list.
    def add(index: Int, element: Object): Unit = ???

    @stub
    // Inserts the role specified as an element at the position specified.
    def add(index: Int, role: Role): Unit = ???

    @stub
    // Appends the specified element to the end of this list.
    def add(o: Object): Boolean = ???

    @stub
    // Adds the Role specified as the last element of the list.
    def add(role: Role): Unit = ???

    @stub
    // Appends all of the elements in the specified collection to the end of
    // this list, in the order that they are returned by the
    // specified collection's Iterator.
    def addAll(c: Collection[_]): Boolean = ???

    @stub
    // Inserts all of the elements in the specified collection into this
    // list, starting at the specified position.
    def addAll(index: Int, c: Collection[_]): Boolean = ???

    @stub
    // Inserts all of the elements in the RoleList specified into this
    // list, starting at the specified position, in the order in which they are
    // returned by the Iterator of the RoleList specified.
    def addAll(index: Int, roleList: RoleList): Boolean = ???

    @stub
    // Appends all the elements in the RoleList specified to the end
    // of the list, in the order in which they are returned by the Iterator of
    // the RoleList specified.
    def addAll(roleList: RoleList): Boolean = ???

    @stub
    // Return a view of this list as a List<Role>.
    def asList(): List[Role] = ???

    @stub
    // Replaces the element at the specified position in this list with
    // the specified element.
    def set(index: Int, element: Object): Object = ???
}
