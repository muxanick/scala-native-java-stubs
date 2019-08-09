package java.nio.file.attribute

import java.lang.{Object, String}
import java.util.Set

// An entry in an access control list (ACL).
//
//  The ACL entry represented by this class is based on the ACL model
// specified in RFC 3530:
// Network File System (NFS) version 4 Protocol. Each entry has four
// components as follows:
//
// 
//     The type component determines if the entry
//    grants or denies access. 
//
//     The principal component, sometimes called the
//    "who" component, is a UserPrincipal corresponding to the identity
//    that the entry grants or denies access
//    
//
//     The permissions component is a set of
//    permissions
//    
//
//     The flags component is a set of flags to indicate how entries are inherited and propagated 
// 
//
//  ACL entries are created using an associated AclEntry.Builder object by
// invoking its build method.
//
//  ACL entries are immutable and are safe for use by multiple concurrent
// threads.
final class AclEntry extends Object {

    @stub
    // Compares the specified object with this ACL entry for equality.
    def equals(ob: Object): Boolean = ???

    @stub
    // Returns a copy of the flags component.
    def flags(): Set[AclEntryFlag] = ???

    @stub
    // Returns the hash-code value for this ACL entry.
    def hashCode(): Int = ???

    @stub
    // Returns a copy of the permissions component.
    def permissions(): Set[AclEntryPermission] = ???

    @stub
    // Returns the principal component.
    def principal(): UserPrincipal = ???

    @stub
    // Returns the string representation of this ACL entry.
    def toString(): String = ???
}

object AclEntry {
    @stub
    // Constructs a new builder.
    def newBuilder(): AclEntry.Builder = ???

    @stub
    // Constructs a new builder with the components of an existing ACL entry.
    def newBuilder(entry: AclEntry): AclEntry.Builder = ???
}
