package javax.management.relation

import java.io.Serializable
import java.lang.{Object, String}
import java.util.List
import javax.management.ObjectName

/** Represents an unresolved role: a role not retrieved from a relation due
 *  to a problem. It provides the role name, value (if problem when trying to
 *  set the role) and an integer defining the problem (constants defined in
 *  RoleStatus).
 * 
 *  The serialVersionUID of this class is -48350262537070138L.
 */
class RoleUnresolved extends Object with Serializable {

    /** Clone this object. */
    @stub
    def clone(): Object = ???

    /** Retrieves problem type. */
    @stub
    def getProblemType(): Int = ???

    /** Retrieves role name. */
    @stub
    def getRoleName(): String = ???

    /** Retrieves role value. */
    @stub
    def getRoleValue(): List[ObjectName] = ???

    /** Sets problem type. */
    @stub
    def setProblemType(pbType: Int): Unit = ???

    /** Sets role name. */
    @stub
    def setRoleName(name: String): Unit = ???

    /** Sets role value. */
    @stub
    def setRoleValue(value: List[ObjectName]): Unit = ???
}
