package javax.management.relation

import java.lang.{Integer, String}
import java.util.{List, Map}
import javax.management.ObjectName

// This interface has to be implemented by any MBean class expected to
// represent a relation managed using the Relation Service.
// Simple relations, i.e. having only roles, no properties or methods, can
// be created directly by the Relation Service (represented as RelationSupport
// objects, internally handled by the Relation Service).
// If the user wants to represent more complex relations, involving
// properties and/or methods, he has to provide his own class implementing the
// Relation interface. This can be achieved either by inheriting from
// RelationSupport class, or by implementing the interface (fully or delegation to
// a RelationSupport object member).
// Specifying such user relation class is to introduce properties and/or
// methods. Those have to be exposed for remote management. So this means that
// any user relation class must be a MBean class.
trait Relation {

    @stub
    // Returns all roles present in the relation.
    def getAllRoles(): RoleResult = ???

    @stub
    // Retrieves MBeans referenced in the various roles of the relation.
    def getReferencedMBeans(): Map[ObjectName, List[String]] = ???

    @stub
    // Returns relation identifier (used to uniquely identify the relation
    // inside the Relation Service).
    def getRelationId(): String = ???

    @stub
    // Returns ObjectName of the Relation Service handling the relation.
    def getRelationServiceName(): ObjectName = ???

    @stub
    // Returns name of associated relation type.
    def getRelationTypeName(): String = ???

    @stub
    // Retrieves role value for given role name.
    def getRole(roleName: String): List[ObjectName] = ???

    @stub
    // Returns the number of MBeans currently referenced in the given role.
    def getRoleCardinality(roleName: String): Integer = ???

    @stub
    // Retrieves values of roles with given names.
    def getRoles(roleNameArray: Array[String]): RoleResult = ???

    @stub
    // Callback used by the Relation Service when a MBean referenced in a role
    // is unregistered.
    def handleMBeanUnregistration(objectName: ObjectName, roleName: String): Unit = ???

    @stub
    // Returns all roles in the relation without checking read mode.
    def retrieveAllRoles(): RoleList = ???

    @stub
    // Sets the given role.
    def setRole(role: Role): Unit = ???
}
