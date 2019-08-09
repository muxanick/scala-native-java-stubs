package javax.management.relation

import java.lang.{Integer, String}
import java.util.{List, Map}
import javax.management.ObjectName
import scala.scalanative.annotation.stub

/** This interface has to be implemented by any MBean class expected to
 *  represent a relation managed using the Relation Service.
 *  Simple relations, i.e. having only roles, no properties or methods, can
 *  be created directly by the Relation Service (represented as RelationSupport
 *  objects, internally handled by the Relation Service).
 *  If the user wants to represent more complex relations, involving
 *  properties and/or methods, he has to provide his own class implementing the
 *  Relation interface. This can be achieved either by inheriting from
 *  RelationSupport class, or by implementing the interface (fully or delegation to
 *  a RelationSupport object member).
 *  Specifying such user relation class is to introduce properties and/or
 *  methods. Those have to be exposed for remote management. So this means that
 *  any user relation class must be a MBean class.
 */
trait Relation {

    /** Returns all roles present in the relation. */
    @stub
    def getAllRoles(): RoleResult = ???

    /** Retrieves MBeans referenced in the various roles of the relation. */
    @stub
    def getReferencedMBeans(): Map[ObjectName, List[String]] = ???

    /** Returns relation identifier (used to uniquely identify the relation
     *  inside the Relation Service).
     */
    @stub
    def getRelationId(): String = ???

    /** Returns ObjectName of the Relation Service handling the relation. */
    @stub
    def getRelationServiceName(): ObjectName = ???

    /** Returns name of associated relation type. */
    @stub
    def getRelationTypeName(): String = ???

    /** Retrieves role value for given role name. */
    @stub
    def getRole(roleName: String): List[ObjectName] = ???

    /** Returns the number of MBeans currently referenced in the given role. */
    @stub
    def getRoleCardinality(roleName: String): Integer = ???

    /** Retrieves values of roles with given names. */
    @stub
    def getRoles(roleNameArray: Array[String]): RoleResult = ???

    /** Callback used by the Relation Service when a MBean referenced in a role
     *  is unregistered.
     */
    @stub
    def handleMBeanUnregistration(objectName: ObjectName, roleName: String): Unit = ???

    /** Returns all roles in the relation without checking read mode. */
    @stub
    def retrieveAllRoles(): RoleList = ???

    /** Sets the given role. */
    @stub
    def setRole(role: Role): Unit = ???

    /** Sets the given roles. */
    @stub
    def setRoles(roleList: RoleList): RoleResult = ???
}
