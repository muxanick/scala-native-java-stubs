package java.nio.file.attribute

import java.lang.{Object, String}

/** An object to lookup user and group principals by name. A UserPrincipal
 *  represents an identity that may be used to determine access rights to objects
 *  in a file system. A GroupPrincipal represents a group identity.
 *  A UserPrincipalLookupService defines methods to lookup identities by
 *  name or group name (which are typically user or account names). Whether names
 *  and group names are case sensitive or not depends on the implementation.
 *  The exact definition of a group is implementation specific but typically a
 *  group represents an identity created for administrative purposes so as to
 *  determine the access rights for the members of the group. In particular it is
 *  implementation specific if the namespace for names and groups is the
 *  same or is distinct. To ensure consistent and correct behavior across
 *  platforms it is recommended that this API be used as if the namespaces are
 *  distinct. In other words, the lookupPrincipalByName should be used to lookup users, and lookupPrincipalByGroupName should be used to
 *  lookup groups.
 */
abstract class UserPrincipalLookupService extends Object {

    /** Lookup a group principal by group name. */
    def lookupPrincipalByGroupName(group: String): GroupPrincipal
}
