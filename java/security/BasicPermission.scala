package java.security

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The BasicPermission class extends the Permission class, and
 *  can be used as the base class for permissions that want to
 *  follow the same naming convention as BasicPermission.
 *  
 *  The name for a BasicPermission is the name of the given permission
 *  (for example, "exit",
 *  "setFactory", "print.queueJob", etc). The naming
 *  convention follows the  hierarchical property naming convention.
 *  An asterisk may appear by itself, or if immediately preceded by a "."
 *  may appear at the end of the name, to signify a wildcard match.
 *  For example, "*" and "java.*" signify a wildcard match, while "*java", "a*b",
 *  and "java*" do not.
 *  
 *  The action string (inherited from Permission) is unused.
 *  Thus, BasicPermission is commonly used as the base class for
 *  "named" permissions
 *  (ones that contain a name but no actions list; you either have the
 *  named permission or you don't.)
 *  Subclasses may implement actions on top of BasicPermission,
 *  if desired.
 *  
 */
abstract class BasicPermission extends Permission with Serializable {

    /** Creates a new BasicPermission with the specified name. */
    @stub
    def this(name: String) = ???

    /** Creates a new BasicPermission object with the specified name. */
    @stub
    def this(name: String, actions: String) = ???

    /** Checks two BasicPermission objects for equality. */
    def equals(obj: Object): Boolean

    /** Returns the canonical string representation of the actions,
     *  which currently is the empty string "", since there are no actions for
     *  a BasicPermission.
     */
    def getActions(): String

    /** Returns the hash code value for this object. */
    def hashCode(): Int

    /** Checks if the specified permission is "implied" by
     *  this object.
     */
    def implies(p: Permission): Boolean

    /** Returns a new PermissionCollection object for storing BasicPermission
     *  objects.
     */
    def newPermissionCollection(): PermissionCollection
}
