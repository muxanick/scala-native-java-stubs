package javax.management.relation

import java.io.Serializable
import java.lang.{Object, String}
import java.util.List
import javax.management.ObjectName

// Represents an unresolved role: a role not retrieved from a relation due
// to a problem. It provides the role name, value (if problem when trying to
// set the role) and an integer defining the problem (constants defined in
// RoleStatus).
//
// The serialVersionUID of this class is -48350262537070138L.
class RoleUnresolved extends Object with Serializable {

    @stub
    // Clone this object.
    def clone(): Object = ???

    @stub
    // Retrieves problem type.
    def getProblemType(): Int = ???

    @stub
    // Retrieves role name.
    def getRoleName(): String = ???

    @stub
    // Retrieves role value.
    def getRoleValue(): List[ObjectName] = ???

    @stub
    // Sets problem type.
    def setProblemType(pbType: Int): Unit = ???

    @stub
    // Sets role name.
    def setRoleName(name: String): Unit = ???

    @stub
    // Sets role value.
    def setRoleValue(value: List[ObjectName]): Unit = ???
}
