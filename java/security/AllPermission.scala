package java.security

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The AllPermission is a permission that implies all other permissions.
 *  
 *  Note: Granting AllPermission should be done with extreme care,
 *  as it implies all other permissions. Thus, it grants code the ability
 *  to run with security
 *  disabled.  Extreme caution should be taken before granting such
 *  a permission to code.  This permission should be used only during testing,
 *  or in extremely rare cases where an application or applet is
 *  completely trusted and adding the necessary permissions to the policy
 *  is prohibitively cumbersome.
 */
final class AllPermission extends Permission {

    /** Creates a new AllPermission object. */
    @stub
    def this() = ???

    /** Creates a new AllPermission object. */
    @stub
    def this(name: String, actions: String) = ???

    /** Checks two AllPermission objects for equality. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the canonical string representation of the actions. */
    @stub
    def getActions(): String = ???

    /** Returns the hash code value for this object. */
    @stub
    def hashCode(): Int = ???

    /** Checks if the specified permission is "implied" by
     *  this object.
     */
    @stub
    def implies(p: Permission): Boolean = ???

    /** Returns a new PermissionCollection object for storing AllPermission
     *  objects.
     */
    @stub
    def newPermissionCollection(): PermissionCollection = ???
}
