package javax.security.auth.kerberos

import java.io.Serializable
import java.lang.{Object, String}
import java.security.{BasicPermission, Permission}

// This class is used to restrict the usage of the Kerberos
// delegation model, ie: forwardable and proxiable tickets.
// 
// The target name of this Permission specifies a pair of
// kerberos service principals. The first is the subordinate service principal
// being entrusted to use the TGT. The second service principal designates
// the target service the subordinate service principal is to
// interact with on behalf of the initiating KerberosPrincipal. This
// latter service principal is specified to restrict the use of a
// proxiable ticket.
// 
// For example, to specify the "host" service use of a forwardable TGT the
// target permission is specified as follows:
//
// 
//  DelegationPermission("\"host/foo.example.com@EXAMPLE.COM\" \"krbtgt/EXAMPLE.COM@EXAMPLE.COM\"");
// 
// 
// To give the "backup" service a proxiable nfs service ticket the target permission
// might be specified:
//
// 
//  DelegationPermission("\"backup/bar.example.com@EXAMPLE.COM\" \"nfs/home.EXAMPLE.COM@EXAMPLE.COM\"");
// 
final class DelegationPermission extends BasicPermission with Serializable {

    @stub
    // Create a new DelegationPermission
    // with the specified subordinate and target principals.
    def this(principals: String) = ???

    @stub
    // Checks two DelegationPermission objects for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the hash code value for this object.
    def hashCode(): Int = ???

    @stub
    // Checks if this Kerberos delegation permission object "implies" the
    // specified permission.
    def implies(p: Permission): Boolean = ???
}
