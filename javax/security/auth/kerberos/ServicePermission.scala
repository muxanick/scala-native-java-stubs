package javax.security.auth.kerberos

import java.io.Serializable
import java.lang.{Object, String}
import java.security.Permission

// This class is used to protect Kerberos services and the
// credentials necessary to access those services. There is a one to
// one mapping of a service principal and the credentials necessary
// to access the service. Therefore granting access to a service
// principal implicitly grants access to the credential necessary to
// establish a security context with the service principal. This
// applies regardless of whether the credentials are in a cache
// or acquired via an exchange with the KDC. The credential can
// be either a ticket granting ticket, a service ticket or a secret
// key from a key table.
// 
// A ServicePermission contains a service principal name and
// a list of actions which specify the context the credential can be
// used within.
// 
// The service principal name is the canonical name of the
// KerberosPrincipal supplying the service, that is
// the KerberosPrincipal represents a Kerberos service
// principal. This name is treated in a case sensitive manner.
// An asterisk may appear by itself, to signify any service principal.
// 
// Granting this permission implies that the caller can use a cached
// credential (TGT, service ticket or secret key) within the context
// designated by the action. In the case of the TGT, granting this
// permission also implies that the TGT can be obtained by an
// Authentication Service exchange.
// 
// The possible actions are:
//
// 
//    initiate -              allow the caller to use the credential to
//                            initiate a security context with a service
//                            principal.
//
//    accept -                allow the caller to use the credential to
//                            accept security context as a particular
//                            principal.
// 
//
// For example, to specify the permission to access to the TGT to
// initiate a security context the permission is constructed as follows:
//
// 
//     ServicePermission("krbtgt/EXAMPLE.COM@EXAMPLE.COM", "initiate");
// 
// 
// To obtain a service ticket to initiate a context with the "host"
// service the permission is constructed as follows:
// 
//     ServicePermission("host/foo.example.com@EXAMPLE.COM", "initiate");
// 
// 
// For a Kerberized server the action is "accept". For example, the permission
// necessary to access and use the secret key of the  Kerberized "host"
// service (telnet and the likes)  would be constructed as follows:
//
// 
//     ServicePermission("host/foo.example.com@EXAMPLE.COM", "accept");
// 
final class ServicePermission extends Permission with Serializable {

    @stub
    // Checks two ServicePermission objects for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the canonical string representation of the actions.
    def getActions(): String = ???

    @stub
    // Returns the hash code value for this object.
    def hashCode(): Int = ???

    @stub
    // Checks if this Kerberos service permission object "implies" the
    // specified permission.
    def implies(p: Permission): Boolean = ???
}
