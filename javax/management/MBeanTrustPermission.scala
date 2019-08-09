package javax.management

import java.lang.{Object, String}
import java.security.{BasicPermission, Permission}
import scala.scalanative.annotation.stub

/** This permission represents "trust" in a signer or codebase.
 *  
 *  MBeanTrustPermission contains a target name but no actions list.
 *  A single target name, "register", is defined for this permission.
 *  The target "*" is also allowed, permitting "register" and any future
 *  targets that may be defined.
 *  Only the null value or the empty string are allowed for the action
 *  to allow the policy object to create the permissions specified in
 *  the policy file.
 *  
 *  If a signer, or codesource is granted this permission, then it is
 *  considered a trusted source for MBeans. Only MBeans from trusted
 *  sources may be registered in the MBeanServer.
 */
class MBeanTrustPermission extends BasicPermission {

    /** Create a new MBeanTrustPermission with the given name. */
    @stub
    def this(name: String) = ???

    /** Create a new MBeanTrustPermission with the given name. */
    @stub
    def this(name: String, actions: String) = ???
}
