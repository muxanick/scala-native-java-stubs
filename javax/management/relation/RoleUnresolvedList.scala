package javax.management.relation

import java.lang.Object
import java.util.{AbstractCollection, AbstractList, ArrayList, Collection, List}

// A RoleUnresolvedList represents a list of RoleUnresolved objects,
// representing roles not retrieved from a relation due to a problem
// encountered when trying to access (read or write) the roles.
class RoleUnresolvedList extends ArrayList[Object] {

    @stub
    // Constructs an empty RoleUnresolvedList.
    def this() = ???

    @stub
    // Constructs an empty RoleUnresolvedList with the initial capacity
    // specified.
    def this(initialCapacity: Int) = ???

    @stub
    // Inserts the specified element at the specified position in this
    // list.
    def add(index: Int, element: Object): Unit = ???

    @stub
    // Inserts the unresolved role specified as an element at the position
    // specified.
    def add(index: Int, role: RoleUnresolved): Unit = ???

    @stub
    // Appends the specified element to the end of this list.
    def add(o: Object): Boolean = ???

    @stub
    // Adds the RoleUnresolved specified as the last element of the list.
    def add(role: RoleUnresolved): Unit = ???

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
    // Inserts all of the elements in the RoleUnresolvedList specified into
    // this list, starting at the specified position, in the order in which
    // they are returned by the Iterator of the RoleUnresolvedList specified.
    def addAll(index: Int, roleList: RoleUnresolvedList): Boolean = ???

    @stub
    // Appends all the elements in the RoleUnresolvedList specified to the end
    // of the list, in the order in which they are returned by the Iterator of
    // the RoleUnresolvedList specified.
    def addAll(roleList: RoleUnresolvedList): Boolean = ???

    @stub
    // Return a view of this list as a List<RoleUnresolved>.
    def asList(): List[RoleUnresolved] = ???

    @stub
    // Replaces the element at the specified position in this list with
    // the specified element.
    def set(index: Int, element: Object): Object = ???
}
