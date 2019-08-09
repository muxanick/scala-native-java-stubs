package java.nio.file.attribute

import java.lang.Object
import java.util.Set

/** A builder of AclEntry objects.
 * 
 *   A Builder object is obtained by invoking one of the newBuilder methods defined by the AclEntry
 *  class.
 * 
 *   Builder objects are mutable and are not safe for use by multiple
 *  concurrent threads without appropriate synchronization.
 */
final object AclEntry.Builder extends Object {

    /** Constructs an AclEntry from the components of this builder. */
    @stub
    def build(): AclEntry = ???

    /** Sets the flags component of this builder. */
    @stub
    def setFlags(flags: AclEntryFlag*): AclEntry.Builder = ???

    /** Sets the flags component of this builder. */
    @stub
    def setFlags(flags: Set[AclEntryFlag]): AclEntry.Builder = ???

    /** Sets the permissions component of this builder. */
    @stub
    def setPermissions(perms: AclEntryPermission*): AclEntry.Builder = ???

    /** Sets the permissions component of this builder. */
    @stub
    def setPermissions(perms: Set[AclEntryPermission]): AclEntry.Builder = ???

    /** Sets the principal component of this builder. */
    @stub
    def setPrincipal(who: UserPrincipal): AclEntry.Builder = ???
}
