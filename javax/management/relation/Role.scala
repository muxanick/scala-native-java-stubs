package javax.management.relation

import java.io.Serializable
import java.lang.{Object, String}
import java.util.List
import javax.management.ObjectName
import scala.scalanative.annotation.stub

/** Represents a role: includes a role name and referenced MBeans (via their
 *  ObjectNames). The role value is always represented as an ArrayList
 *  collection (of ObjectNames) to homogenize the access.
 * 
 *  The serialVersionUID of this class is -279985518429862552L.
 */
class Role extends Object with Serializable {

    /** Make a new Role object. */
    @stub
    def this(roleName: String, roleValue: List[ObjectName]) = ???

    /** Clone the role object. */
    @stub
    def clone(): Any = ???

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

    /** Returns a string describing the role. */
    @stub
    def toString(): String = ???
}

object Role {
    /** Returns a string for the given role value. */
    @stub
    def roleValueToString(roleValue: List[ObjectName]): String = ???
}
