package javax.security.auth.kerberos

import java.io.Serializable
import java.lang.{Object, String}
import java.security.{BasicPermission, Permission, PermissionCollection}
import scala.scalanative.annotation.stub

/** This class is used to restrict the usage of the Kerberos
 *  delegation model, ie: forwardable and proxiable tickets.
 *  
 *  The target name of this Permission specifies a pair of
 *  kerberos service principals. The first is the subordinate service principal
 *  being entrusted to use the TGT. The second service principal designates
 *  the target service the subordinate service principal is to
 *  interact with on behalf of the initiating KerberosPrincipal. This
 *  latter service principal is specified to restrict the use of a
 *  proxiable ticket.
 *  
 *  For example, to specify the "host" service use of a forwardable TGT the
 *  target permission is specified as follows:
 * 
 *  
 *   DelegationPermission("\"host/foo.example.com@EXAMPLE.COM\" \"krbtgt/EXAMPLE.COM@EXAMPLE.COM\"");
 *  
 *  
 *  To give the "backup" service a proxiable nfs service ticket the target permission
 *  might be specified:
 * 
 *  
 *   DelegationPermission("\"backup/bar.example.com@EXAMPLE.COM\" \"nfs/home.EXAMPLE.COM@EXAMPLE.COM\"");
 *  
 */
final class DelegationPermission extends BasicPermission with Serializable {

    /** Create a new DelegationPermission
     *  with the specified subordinate and target principals.
     */
    @stub
    def this(principals: String) = ???

    /** Create a new DelegationPermission
     *  with the specified subordinate and target principals.
     */
    @stub
    def this(principals: String, actions: String) = ???

    /** Checks two DelegationPermission objects for equality. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the hash code value for this object. */
    @stub
    def hashCode(): Int = ???

    /** Checks if this Kerberos delegation permission object "implies" the
     *  specified permission.
     */
    @stub
    def implies(p: Permission): Boolean = ???

    /** Returns a PermissionCollection object for storing
     *  DelegationPermission objects.
     */
    @stub
    def newPermissionCollection(): PermissionCollection = ???
}
