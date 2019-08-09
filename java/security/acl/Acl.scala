package java.security.acl

import java.lang.String
import java.security.Principal
import java.util.Enumeration

// Interface representing an Access Control List (ACL).  An Access
// Control List is a data structure used to guard access to
// resources.
//
// An ACL can be thought of as a data structure with multiple ACL
// entries.  Each ACL entry, of interface type AclEntry, contains a
// set of permissions associated with a particular principal. (A
// principal represents an entity such as an individual user or a
// group). Additionally, each ACL entry is specified as being either
// positive or negative. If positive, the permissions are to be
// granted to the associated principal. If negative, the permissions
// are to be denied.
//
// The ACL Entries in each ACL observe the following rules:
//
//  Each principal can have at most one positive ACL entry and
// one negative entry; that is, multiple positive or negative ACL
// entries are not allowed for any principal.  Each entry specifies
// the set of permissions that are to be granted (if positive) or
// denied (if negative).
//
// If there is no entry for a particular principal, then the
// principal is considered to have a null (empty) permission set.
//
// If there is a positive entry that grants a principal a
// particular permission, and a negative entry that denies the
// principal the same permission, the result is as though the
// permission was never granted or denied.
//
// Individual permissions always override permissions of the
// group(s) to which the individual belongs. That is, individual
// negative permissions (specific denial of permissions) override the
// groups' positive permissions. And individual positive permissions
// override the groups' negative permissions.
//
// 
//
// The java.security.acl  package provides the
// interfaces to the ACL and related data structures (ACL entries,
// groups, permissions, etc.), and the sun.security.acl 
// classes provide a default implementation of the interfaces. For
// example, java.security.acl.Acl  provides the
// interface to an ACL and the sun.security.acl.AclImpl 
// class provides the default implementation of the interface.
//
// The java.security.acl.Acl  interface extends the
// java.security.acl.Owner  interface. The Owner
// interface is used to maintain a list of owners for each ACL.  Only
// owners are allowed to modify an ACL. For example, only an owner can
// call the ACL's addEntry method to add a new ACL entry
// to the ACL.
trait Acl extends Owner {

    @stub
    // Adds an ACL entry to this ACL.
    def addEntry(caller: Principal, entry: AclEntry): Boolean = ???

    @stub
    // Checks whether or not the specified principal has the specified
    // permission.
    def checkPermission(principal: Principal, permission: Permission): Boolean = ???

    @stub
    // Returns an enumeration of the entries in this ACL.
    def entries(): Enumeration[AclEntry] = ???

    @stub
    // Returns the name of this ACL.
    def getName(): String = ???

    @stub
    // Returns an enumeration for the set of allowed permissions for the
    // specified principal (representing an entity such as an individual or
    // a group).
    def getPermissions(user: Principal): Enumeration[Permission] = ???

    @stub
    // Removes an ACL entry from this ACL.
    def removeEntry(caller: Principal, entry: AclEntry): Boolean = ???

    @stub
    // Sets the name of this ACL.
    def setName(caller: Principal, name: String): Unit = ???
}
