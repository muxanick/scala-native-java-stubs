package javax.security.auth

import java.lang.Object
import java.security.{CodeSource, PermissionCollection}

/** 
 *       public ProtectionDomain
 *           (CodeSource cs,
 *            PermissionCollection permissions,
 *            ClassLoader loader,
 *            Principal[] principals)
 *  
 */
PermissionCollection getPermissions ( java.security.ProtectionDomain pd ) {

    /** Deprecated.  */
    @stub
    def getPermissions(subject: Subject, cs: CodeSource): PermissionCollection

    /** Deprecated.  */
    @stub
    def refresh(): Unit
}

object Policy {
    /** Deprecated.  */
    @stub
    def getPolicy(): Policy = ???
}
