package javax.management.relation

import java.io.Serializable
import java.lang.{Object, String}
import java.util.List
import javax.management.ObjectName

// Represents a role: includes a role name and referenced MBeans (via their
// ObjectNames). The role value is always represented as an ArrayList
// collection (of ObjectNames) to homogenize the access.
//
// The serialVersionUID of this class is -279985518429862552L.
class Role extends Object with Serializable {

    @stub
    // Clone the role object.
    def clone(): Object = ???

    @stub
    // Retrieves role name.
    def getRoleName(): String = ???

    @stub
    // Retrieves role value.
    def getRoleValue(): List[ObjectName] = ???

    @stub
    // Sets role name.
    def setRoleName(roleName: String): Unit = ???

    @stub
    // Sets role value.
    def setRoleValue(roleValue: List[ObjectName]): Unit = ???
}

object Role {
    @stub
    // Returns a string for the given role value.
    def roleValueToString(roleValue: List[ObjectName]): String = ???
}
