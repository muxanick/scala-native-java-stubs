package java.security

import java.lang.{ClassLoader, Object, String}
import scala.scalanative.annotation.stub

/** The ProtectionDomain class encapsulates the characteristics of a domain,
 *  which encloses a set of classes whose instances are granted a set
 *  of permissions when being executed on behalf of a given set of Principals.
 *  
 *  A static set of permissions can be bound to a ProtectionDomain when it is
 *  constructed; such permissions are granted to the domain regardless of the
 *  Policy in force. However, to support dynamic security policies, a
 *  ProtectionDomain can also be constructed such that it is dynamically
 *  mapped to a set of permissions by the current Policy whenever a permission
 *  is checked.
 *  
 */
class ProtectionDomain extends Object {

    /** Creates a new ProtectionDomain with the given CodeSource and
     *  Permissions.
     */
    @stub
    def this(codesource: CodeSource, permissions: PermissionCollection) = ???

    /** Creates a new ProtectionDomain qualified by the given CodeSource,
     *  Permissions, ClassLoader and array of Principals.
     */
    @stub
    def this(codesource: CodeSource, permissions: PermissionCollection, classloader: ClassLoader, principals: Array[Principal]) = ???

    /** Returns the ClassLoader of this domain. */
    @stub
    def getClassLoader(): ClassLoader = ???

    /** Returns the CodeSource of this domain. */
    @stub
    def getCodeSource(): CodeSource = ???

    /** Returns the static permissions granted to this domain. */
    @stub
    def getPermissions(): PermissionCollection = ???

    /** Returns an array of principals for this domain. */
    @stub
    def getPrincipals(): Array[Principal] = ???

    /** Check and see if this ProtectionDomain implies the permissions
     *  expressed in the Permission object.
     */
    @stub
    def implies(permission: Permission): Boolean = ???

    /** Convert a ProtectionDomain to a String. */
    @stub
    def toString(): String = ???
}
