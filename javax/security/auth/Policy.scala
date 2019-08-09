package javax.security.auth

import java.lang.Object
import java.security.{CodeSource, PermissionCollection}

// 
//      public ProtectionDomain
//          (CodeSource cs,
//           PermissionCollection permissions,
//           ClassLoader loader,
//           Principal[] principals)
// 
PermissionCollection getPermissions ( java.security.ProtectionDomain pd ) {

    @stub
    // Deprecated. 
    def getPermissions(subject: Subject, cs: CodeSource): PermissionCollection

    @stub
    // Deprecated. 
    def refresh(): Unit
}

object Policy {
    @stub
    // Deprecated. 
    def getPolicy(): Policy = ???
}
