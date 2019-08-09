package javax.management.relation

import java.io.Serializable
import java.lang.{Object, String}
import java.util.List
import javax.management.ObjectName

/** Represents a role: includes a role name and referenced MBeans (via their
 *  ObjectNames). The role value is always represented as an ArrayList
 *  collection (of ObjectNames) to homogenize the access.
 * 
 *  The serialVersionUID of this class is -279985518429862552L.
 */
class Role extends Object with Serializable {

    /** Clone the role object. */
    @stub
    def clone(): Object = ???

    /** Retrieves role name. */
    @stub
    def getRoleName(): String = ???

    /** Retrieves role value. */
    @stub
    def getRoleValue(): List[ObjectName] = ???

    /** Sets role name. */
    @stub
    def setRoleName(roleName: String): Unit = ???

    /** Sets role value. */
    @stub
    def setRoleValue(roleValue: List[ObjectName]): Unit = ???
}

object Role {
    /** Returns a string for the given role value. */
    @stub
    def roleValueToString(roleValue: List[ObjectName]): String = ???
}
