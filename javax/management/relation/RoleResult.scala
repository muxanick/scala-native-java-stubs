package javax.management.relation

import java.io.Serializable
import java.lang.Object

// Represents the result of a multiple access to several roles of a relation
// (either for reading or writing).
//
// The serialVersionUID of this class is -6304063118040985512L.
class RoleResult extends Object with Serializable {

    @stub
    // Retrieves list of roles successfully accessed.
    def getRoles(): RoleList = ???

    @stub
    // Retrieves list of roles unsuccessfully accessed.
    def getRolesUnresolved(): RoleUnresolvedList = ???

    @stub
    // Sets list of roles successfully accessed.
    def setRoles(list: RoleList): Unit = ???
}
