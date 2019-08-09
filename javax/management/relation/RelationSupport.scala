package javax.management.relation

import java.lang.{Boolean, Integer, Object, String}
import java.util.{List, Map}
import javax.management.{MBeanRegistration, MBeanServer, ObjectName}

/** A RelationSupport object is used internally by the Relation Service to
 *  represent simple relations (only roles, no properties or methods), with an
 *  unlimited number of roles, of any relation type. As internal representation,
 *  it is not exposed to the user.
 *  RelationSupport class conforms to the design patterns of standard MBean. So
 *  the user can decide to instantiate a RelationSupport object himself as
 *  a MBean (as it follows the MBean design patterns), to register it in the
 *  MBean Server, and then to add it in the Relation Service.
 *  The user can also, when creating his own MBean relation class, have it
 *  extending RelationSupport, to retrieve the implementations of required
 *  interfaces (see below).
 *  It is also possible to have in a user relation MBean class a member
 *  being a RelationSupport object, and to implement the required interfaces by
 *  delegating all to this member.
 *   RelationSupport implements the Relation interface (to be handled by the
 *  Relation Service).
 *  It implements also the MBeanRegistration interface to be able to retrieve
 *  the MBean Server where it is registered (if registered as a MBean) to access
 *  to its Relation Service.
 */
class RelationSupport extends Object with RelationSupportMBean with MBeanRegistration {

    /** Creates a RelationSupport object. */
    @stub
    def this(relationId: String, relationServiceName: ObjectName, relationServiceMBeanServer: MBeanServer, relationTypeName: String, list: RoleList) = ???

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

    /** Returns an internal flag specifying if the object is still handled by
     *  the Relation Service.
     */
    @stub
    def isInRelationService(): Boolean = ???

    /** Allows the MBean to perform any operations needed after having been
     *  unregistered in the MBean server.
     */
    @stub
    def postDeregister(): Unit = ???

    /** Allows the MBean to perform any operations needed after having been
     *  registered in the MBean server or after the registration has failed.
     */
    @stub
    def postRegister(registrationDone: Boolean): Unit = ???

    /** Allows the MBean to perform any operations it needs before
     *  being unregistered by the MBean server.
     */
    @stub
    def preDeregister(): Unit = ???

    /** Allows the MBean to perform any operations it needs before
     *  being registered in the MBean Server.
     */
    @stub
    def preRegister(server: MBeanServer, name: ObjectName): ObjectName = ???

    /** Returns all roles in the relation without checking read mode. */
    @stub
    def retrieveAllRoles(): RoleList = ???

    /** Specifies whether this relation is handled by the Relation
     *  Service.
     */
    @stub
    def setRelationServiceManagementFlag(flag: Boolean): Unit = ???

    /** Sets the given role. */
    @stub
    def setRole(role: Role): Unit = ???
}
