package javax.management.relation

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** Represents the result of a multiple access to several roles of a relation
 *  (either for reading or writing).
 * 
 *  The serialVersionUID of this class is -6304063118040985512L.
 */
class RoleResult extends Object with Serializable {

    /** Constructor. */
    @stub
    def this(list: RoleList, unresolvedList: RoleUnresolvedList) = ???

    /** Retrieves list of roles successfully accessed. */
    @stub
    def getRoles(): RoleList = ???

    /** Retrieves list of roles unsuccessfully accessed. */
    @stub
    def getRolesUnresolved(): RoleUnresolvedList = ???

    /** Sets list of roles successfully accessed. */
    @stub
    def setRoles(list: RoleList): Unit = ???

    /** Sets list of roles unsuccessfully accessed. */
    @stub
    def setRolesUnresolved(unresolvedList: RoleUnresolvedList): Unit = ???
}
