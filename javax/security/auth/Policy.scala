package javax.security.auth

import java.lang.Object
import java.security.{CodeSource, PermissionCollection}
import scala.scalanative.annotation.stub

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
    protected def this() = ???

    /** Deprecated.  */
    def getPermissions(subject: Subject, cs: CodeSource): PermissionCollection

    /** Deprecated.  */
    def refresh(): Unit
}

object Policy {
    /** Deprecated.  */
    @stub
    def getPolicy(): Policy = ???

    /** Deprecated.  */
    @stub
    def setPolicy(policy: Policy): Unit = ???
}
