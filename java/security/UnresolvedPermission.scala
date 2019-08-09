package java.security

import java.io.Serializable
import java.lang.{Object, String}
import java.security.cert.Certificate

/** The UnresolvedPermission class is used to hold Permissions that
 *  were "unresolved" when the Policy was initialized.
 *  An unresolved permission is one whose actual Permission class
 *  does not yet exist at the time the Policy is initialized (see below).
 * 
 *  The policy for a Java runtime (specifying
 *  which permissions are available for code from various principals)
 *  is represented by a Policy object.
 *  Whenever a Policy is initialized or refreshed, Permission objects of
 *  appropriate classes are created for all permissions
 *  allowed by the Policy.
 * 
 *  Many permission class types
 *  referenced by the policy configuration are ones that exist
 *  locally (i.e., ones that can be found on CLASSPATH).
 *  Objects for such permissions can be instantiated during
 *  Policy initialization. For example, it is always possible
 *  to instantiate a java.io.FilePermission, since the
 *  FilePermission class is found on the CLASSPATH.
 * 
 *  Other permission classes may not yet exist during Policy
 *  initialization. For example, a referenced permission class may
 *  be in a JAR file that will later be loaded.
 *  For each such class, an UnresolvedPermission is instantiated.
 *  Thus, an UnresolvedPermission is essentially a "placeholder"
 *  containing information about the permission.
 * 
 *  Later, when code calls AccessController.checkPermission
 *  on a permission of a type that was previously unresolved,
 *  but whose class has since been loaded, previously-unresolved
 *  permissions of that type are "resolved". That is,
 *  for each such UnresolvedPermission, a new object of
 *  the appropriate class type is instantiated, based on the
 *  information in the UnresolvedPermission.
 * 
 *   To instantiate the new class, UnresolvedPermission assumes
 *  the class provides a zero, one, and/or two-argument constructor.
 *  The zero-argument constructor would be used to instantiate
 *  a permission without a name and without actions.
 *  A one-arg constructor is assumed to take a String
 *  name as input, and a two-arg constructor is assumed to take a
 *  String name and String actions
 *  as input.  UnresolvedPermission may invoke a
 *  constructor with a null name and/or actions.
 *  If an appropriate permission constructor is not available,
 *  the UnresolvedPermission is ignored and the relevant permission
 *  will not be granted to executing code.
 * 
 *   The newly created permission object replaces the
 *  UnresolvedPermission, which is removed.
 * 
 *   Note that the getName method for an
 *  UnresolvedPermission returns the
 *  type (class name) for the underlying permission
 *  that has not been resolved.
 */
final class UnresolvedPermission extends Permission with Serializable {

    /** Checks two UnresolvedPermission objects for equality. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the canonical string representation of the actions,
     *  which currently is the empty string "", since there are no actions for
     *  an UnresolvedPermission.
     */
    @stub
    def getActions(): String = ???

    /** Get the actions for the underlying permission that
     *  has not been resolved.
     */
    @stub
    def getUnresolvedActions(): String = ???

    /** Get the signer certificates (without any supporting chain)
     *  for the underlying permission that has not been resolved.
     */
    @stub
    def getUnresolvedCerts(): Array[Certificate] = ???

    /** Get the target name of the underlying permission that
     *  has not been resolved.
     */
    @stub
    def getUnresolvedName(): String = ???

    /** Get the type (class name) of the underlying permission that
     *  has not been resolved.
     */
    @stub
    def getUnresolvedType(): String = ???

    /** Returns the hash code value for this object. */
    @stub
    def hashCode(): Int = ???

    /** This method always returns false for unresolved permissions. */
    @stub
    def implies(p: Permission): Boolean = ???

    /** Returns a new PermissionCollection object for storing
     *  UnresolvedPermission  objects.
     */
    @stub
    def newPermissionCollection(): PermissionCollection = ???
}
