package java.security

import java.lang.{ClassLoader, Object}

// The ProtectionDomain class encapsulates the characteristics of a domain,
// which encloses a set of classes whose instances are granted a set
// of permissions when being executed on behalf of a given set of Principals.
// 
// A static set of permissions can be bound to a ProtectionDomain when it is
// constructed; such permissions are granted to the domain regardless of the
// Policy in force. However, to support dynamic security policies, a
// ProtectionDomain can also be constructed such that it is dynamically
// mapped to a set of permissions by the current Policy whenever a permission
// is checked.
// 
class ProtectionDomain extends Object {

    @stub
    // Creates a new ProtectionDomain with the given CodeSource and
    // Permissions.
    def this(codesource: CodeSource, permissions: PermissionCollection) = ???

    @stub
    // Returns the ClassLoader of this domain.
    def getClassLoader(): ClassLoader = ???

    @stub
    // Returns the CodeSource of this domain.
    def getCodeSource(): CodeSource = ???

    @stub
    // Returns the static permissions granted to this domain.
    def getPermissions(): PermissionCollection = ???

    @stub
    // Returns an array of principals for this domain.
    def getPrincipals(): Array[Principal] = ???

    @stub
    // Check and see if this ProtectionDomain implies the permissions
    // expressed in the Permission object.
    def implies(permission: Permission): Boolean = ???
}
