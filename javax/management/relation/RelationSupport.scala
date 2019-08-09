package javax.management.relation

import java.lang.{Boolean, Integer, Object, String}
import java.util.{List, Map}
import javax.management.{MBeanRegistration, MBeanServer, ObjectName}

// A RelationSupport object is used internally by the Relation Service to
// represent simple relations (only roles, no properties or methods), with an
// unlimited number of roles, of any relation type. As internal representation,
// it is not exposed to the user.
// RelationSupport class conforms to the design patterns of standard MBean. So
// the user can decide to instantiate a RelationSupport object himself as
// a MBean (as it follows the MBean design patterns), to register it in the
// MBean Server, and then to add it in the Relation Service.
// The user can also, when creating his own MBean relation class, have it
// extending RelationSupport, to retrieve the implementations of required
// interfaces (see below).
// It is also possible to have in a user relation MBean class a member
// being a RelationSupport object, and to implement the required interfaces by
// delegating all to this member.
//  RelationSupport implements the Relation interface (to be handled by the
// Relation Service).
// It implements also the MBeanRegistration interface to be able to retrieve
// the MBean Server where it is registered (if registered as a MBean) to access
// to its Relation Service.
class RelationSupport extends Object with RelationSupportMBean, with MBeanRegistration {

    @stub
    // Creates a RelationSupport object.
    def this(relationId: String, relationServiceName: ObjectName, relationServiceMBeanServer: MBeanServer, relationTypeName: String, list: RoleList) = ???

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
    // Returns an internal flag specifying if the object is still handled by
    // the Relation Service.
    def isInRelationService(): Boolean = ???

    @stub
    // Allows the MBean to perform any operations needed after having been
    // unregistered in the MBean server.
    def postDeregister(): Unit = ???

    @stub
    // Allows the MBean to perform any operations needed after having been
    // registered in the MBean server or after the registration has failed.
    def postRegister(registrationDone: Boolean): Unit = ???

    @stub
    // Allows the MBean to perform any operations it needs before
    // being unregistered by the MBean server.
    def preDeregister(): Unit = ???

    @stub
    // Allows the MBean to perform any operations it needs before
    // being registered in the MBean Server.
    def preRegister(server: MBeanServer, name: ObjectName): ObjectName = ???

    @stub
    // Returns all roles in the relation without checking read mode.
    def retrieveAllRoles(): RoleList = ???

    @stub
    // Specifies whether this relation is handled by the Relation
    // Service.
    def setRelationServiceManagementFlag(flag: Boolean): Unit = ???

    @stub
    // Sets the given role.
    def setRole(role: Role): Unit = ???
}
