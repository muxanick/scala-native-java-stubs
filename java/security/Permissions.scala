package java.security

import java.io.Serializable
import java.lang.Object
import java.util.Enumeration

// This class represents a heterogeneous collection of Permissions. That is,
// it contains different types of Permission objects, organized into
// PermissionCollections. For example, if any
// java.io.FilePermission objects are added to an instance of
// this class, they are all stored in a single
// PermissionCollection. It is the PermissionCollection returned by a call to
// the newPermissionCollection method in the FilePermission class.
// Similarly, any java.lang.RuntimePermission objects are
// stored in the PermissionCollection returned by a call to the
// newPermissionCollection method in the
// RuntimePermission class. Thus, this class represents a collection of
// PermissionCollections.
//
// When the add method is called to add a Permission, the
// Permission is stored in the appropriate PermissionCollection. If no such
// collection exists yet, the Permission object's class is determined and the
// newPermissionCollection method is called on that class to create
// the PermissionCollection and add it to the Permissions object. If
// newPermissionCollection returns null, then a default
// PermissionCollection that uses a hashtable will be created and used. Each
// hashtable entry stores a Permission object as both the key and the value.
//
//  Enumerations returned via the elements method are
// not fail-fast.  Modifications to a collection should not be
// performed while enumerating over that collection.
final class Permissions extends PermissionCollection with Serializable {

    @stub
    // Adds a permission object to the PermissionCollection for the class the
    // permission belongs to.
    def add(permission: Permission): Unit = ???

    @stub
    // Returns an enumeration of all the Permission objects in all the
    // PermissionCollections in this Permissions object.
    def elements(): Enumeration[Permission] = ???
}
