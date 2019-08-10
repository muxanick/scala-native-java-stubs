package javax.management.relation

import java.lang.{Boolean, Integer, Object, String}
import java.util.{List, Map}
import javax.management.{MBeanNotificationInfo, MBeanRegistration, MBeanServer, Notification, NotificationBroadcasterSupport, NotificationListener, ObjectName}
import scala.scalanative.annotation.stub

/** The Relation Service is in charge of creating and deleting relation types
 *  and relations, of handling the consistency and of providing query
 *  mechanisms.
 *  It implements the NotificationBroadcaster by extending
 *  NotificationBroadcasterSupport to send notifications when a relation is
 *  removed from it.
 *  It implements the NotificationListener interface to be able to receive
 *  notifications concerning unregistration of MBeans referenced in relation
 *  roles and of relation MBeans.
 *  It implements the MBeanRegistration interface to be able to retrieve
 *  its ObjectName and MBean Server.
 */
class RelationService extends NotificationBroadcasterSupport with RelationServiceMBean with MBeanRegistration with NotificationListener {

    /** Constructor. */
    @stub
    def this(immediatePurgeFlag: Boolean) = ???

    /** Adds an MBean created by the user (and registered by him in the MBean
     *  Server) as a relation in the Relation Service.
     */
    @stub
    def addRelation(relationObjectName: ObjectName): Unit = ???

    /** Adds given object as a relation type. */
    @stub
    def addRelationType(relationTypeObj: RelationType): Unit = ???

    /** Checks if given Role can be read in a relation of the given type. */
    @stub
    def checkRoleReading(roleName: String, relationTypeName: String): Integer = ???

    /** Checks if given Role can be set in a relation of given type. */
    @stub
    def checkRoleWriting(role: Role, relationTypeName: String, initFlag: Boolean): Integer = ???

    /** Creates a simple relation (represented by a RelationSupport object) of
     *  given relation type, and adds it in the Relation Service.
     */
    @stub
    def createRelation(relationId: String, relationTypeName: String, roleList: RoleList): Unit = ???

    /** Creates a relation type (a RelationTypeSupport object) with given
     *  role infos (provided by the RoleInfo objects), and adds it in the
     *  Relation Service.
     */
    @stub
    def createRelationType(relationTypeName: String, roleInfoArray: Array[RoleInfo]): Unit = ???

    /** Retrieves the MBeans associated to given one in a relation. */
    @stub
    def findAssociatedMBeans(mbeanName: ObjectName, relationTypeName: String, roleName: String): Map[ObjectName, List[String]] = ???

    /** Retrieves the relations where a given MBean is referenced. */
    @stub
    def findReferencingRelations(mbeanName: ObjectName, relationTypeName: String, roleName: String): Map[String, List[String]] = ???

    /** Returns the relation ids for relations of the given type. */
    @stub
    def findRelationsOfType(relationTypeName: String): List[String] = ???

    /** Returns all the relation ids for all the relations handled by the
     *  Relation Service.
     */
    @stub
    def getAllRelationIds(): List[String] = ???

    /** Retrieves names of all known relation types. */
    @stub
    def getAllRelationTypeNames(): List[String] = ???

    /** Returns all roles present in the relation. */
    @stub
    def getAllRoles(relationId: String): RoleResult = ???

    /** Returns a NotificationInfo object containing the name of the Java class
     *  of the notification and the notification types sent.
     */
    @stub
    def getNotificationInfo(): Array[MBeanNotificationInfo] = ???

    /** Returns the flag to indicate if when a notification is received for the
     *  unregistration of an MBean referenced in a relation, if an immediate
     *  "purge" of the relations (look for the relations no longer valid)
     *  has to be performed , or if that will be performed only when the
     *  purgeRelations method will be explicitly called.
     */
    @stub
    def getPurgeFlag(): Boolean = ???

    /** Retrieves MBeans referenced in the various roles of the relation. */
    @stub
    def getReferencedMBeans(relationId: String): Map[ObjectName, List[String]] = ???

    /** Returns name of associated relation type for given relation. */
    @stub
    def getRelationTypeName(relationId: String): String = ???

    /** Retrieves role value for given role name in given relation. */
    @stub
    def getRole(relationId: String, roleName: String): List[ObjectName] = ???

    /** Retrieves the number of MBeans currently referenced in the given role. */
    @stub
    def getRoleCardinality(relationId: String, roleName: String): Integer = ???

    /** Retrieves role info for given role name of a given relation type. */
    @stub
    def getRoleInfo(relationTypeName: String, roleInfoName: String): RoleInfo = ???

    /** Retrieves list of role infos (RoleInfo objects) of a given relation
     *  type.
     */
    @stub
    def getRoleInfos(relationTypeName: String): List[RoleInfo] = ???

    /** Retrieves values of roles with given names in given relation. */
    @stub
    def getRoles(relationId: String, roleNameArray: Array[String]): RoleResult = ???

    /** Invoked when a JMX notification occurs. */
    @stub
    def handleNotification(notif: Notification, handback: Any): Unit = ???

    /** Checks if there is a relation identified in Relation Service with given
     *  relation id.
     */
    @stub
    def hasRelation(relationId: String): Boolean = ???

    /** Checks if the Relation Service is active. */
    @stub
    def isActive(): Unit = ???

    /** Returns the relation id associated to the given ObjectName if the
     *  MBean has been added as a relation in the Relation Service.
     */
    @stub
    def isRelation(objectName: ObjectName): String = ???

    /** If the relation is represented by an MBean (created by the user and
     *  added as a relation in the Relation Service), returns the ObjectName of
     *  the MBean.
     */
    @stub
    def isRelationMBean(relationId: String): ObjectName = ???

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

    /** Purges the relations. */
    @stub
    def purgeRelations(): Unit = ???

    /** Removes given relation from the Relation Service. */
    @stub
    def removeRelation(relationId: String): Unit = ???

    /** Removes given relation type from Relation Service. */
    @stub
    def removeRelationType(relationTypeName: String): Unit = ???

    /** Sends a notification (RelationNotification) for a relation creation. */
    @stub
    def sendRelationCreationNotification(relationId: String): Unit = ???

    /** Sends a notification (RelationNotification) for a relation removal. */
    @stub
    def sendRelationRemovalNotification(relationId: String, unregMBeanList: List[ObjectName]): Unit = ???

    /** Sends a notification (RelationNotification) for a role update in the
     *  given relation.
     */
    @stub
    def sendRoleUpdateNotification(relationId: String, newRole: Role, oldValue: List[ObjectName]): Unit = ???

    /** Sets the flag to indicate if when a notification is received for the
     *  unregistration of an MBean referenced in a relation, if an immediate
     *  "purge" of the relations (look for the relations no longer valid)
     *  has to be performed , or if that will be performed only when the
     *  purgeRelations method will be explicitly called.
     */
    @stub
    def setPurgeFlag(purgeFlag: Boolean): Unit = ???

    /** Sets the given role in given relation. */
    @stub
    def setRole(relationId: String, role: Role): Unit = ???

    /** Sets the given roles in given relation. */
    @stub
    def setRoles(relationId: String, roleList: RoleList): RoleResult = ???

    /** Handles update of the Relation Service role map for the update of given
     *  role in given relation.
     */
    @stub
    def updateRoleMap(relationId: String, newRole: Role, oldValue: List[ObjectName]): Unit = ???
}
