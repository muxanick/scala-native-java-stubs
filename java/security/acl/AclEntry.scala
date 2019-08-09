package java.security.acl

import java.lang.{Cloneable, Object}
import java.security.Principal
import java.util.Enumeration

// This is the interface used for representing one entry in an Access
// Control List (ACL).
//
// An ACL can be thought of as a data structure with multiple ACL entry
// objects. Each ACL entry object contains a set of permissions associated
// with a particular principal. (A principal represents an entity such as
// an individual user or a group). Additionally, each ACL entry is specified
// as being either positive or negative. If positive, the permissions are
// to be granted to the associated principal. If negative, the permissions
// are to be denied. Each principal can have at most one positive ACL entry
// and one negative entry; that is, multiple positive or negative ACL
// entries are not allowed for any principal.
//
// Note: ACL entries are by default positive. An entry becomes a
// negative entry only if the
// setNegativePermissions
// method is called on it.
trait AclEntry extends Cloneable {

    @stub
    // Adds the specified permission to this ACL entry.
    def addPermission(permission: Permission): Boolean = ???

    @stub
    // Checks if the specified permission is part of the
    // permission set in this entry.
    def checkPermission(permission: Permission): Boolean = ???

    @stub
    // Clones this ACL entry.
    def clone(): Object = ???

    @stub
    // Returns the principal for which permissions are granted or denied by
    // this ACL entry.
    def getPrincipal(): Principal = ???

    @stub
    // Returns true if this is a negative ACL entry (one denying the
    // associated principal the set of permissions in the entry), false
    // otherwise.
    def isNegative(): Boolean = ???

    @stub
    // Returns an enumeration of the permissions in this ACL entry.
    def permissions(): Enumeration[Permission] = ???

    @stub
    // Removes the specified permission from this ACL entry.
    def removePermission(permission: Permission): Boolean = ???

    @stub
    // Sets this ACL entry to be a negative one.
    def setNegativePermissions(): Unit = ???

    @stub
    // Specifies the principal for which permissions are granted or denied
    // by this ACL entry.
    def setPrincipal(user: Principal): Boolean = ???
}
