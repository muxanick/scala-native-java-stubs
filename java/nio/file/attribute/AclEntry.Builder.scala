package java.nio.file.attribute

import java.lang.Object
import java.util.Set

// A builder of AclEntry objects.
//
//  A Builder object is obtained by invoking one of the newBuilder methods defined by the AclEntry
// class.
//
//  Builder objects are mutable and are not safe for use by multiple
// concurrent threads without appropriate synchronization.
object final AclEntry.Builder extends Object {

    @stub
    // Constructs an AclEntry from the components of this builder.
    def build(): AclEntry = ???

    @stub
    // Sets the flags component of this builder.
    def setFlags(flags: AclEntryFlag*): AclEntry.Builder = ???

    @stub
    // Sets the flags component of this builder.
    def setFlags(flags: Set[AclEntryFlag]): AclEntry.Builder = ???

    @stub
    // Sets the permissions component of this builder.
    def setPermissions(perms: AclEntryPermission*): AclEntry.Builder = ???

    @stub
    // Sets the permissions component of this builder.
    def setPermissions(perms: Set[AclEntryPermission]): AclEntry.Builder = ???

    @stub
    // Sets the principal component of this builder.
    def setPrincipal(who: UserPrincipal): AclEntry.Builder = ???
}
