package java.rmi

import java.lang.{Deprecated, Object, SecurityManager}
import scala.scalanative.annotation.stub

/** RMISecurityManager implements a policy identical to the policy
 *  implemented by SecurityManager. RMI applications
 *  should use the SecurityManager class or another appropriate
 *  SecurityManager implementation instead of this class. RMI's class
 *  loader will download classes from remote locations only if a security
 *  manager has been set.
 */
@Deprecated class RMISecurityManager extends SecurityManager {

    /** Deprecated.  */
    @stub
    def this() = ???
}
