package javax.management.relation

import java.lang.{Boolean, Integer, Object, String}
import java.util.{List, Map}
import javax.management.{MBeanNotificationInfo, MBeanRegistration, MBeanServer, Notification, NotificationBroadcasterSupport, NotificationListener, ObjectName}

// The Relation Service is in charge of creating and deleting relation types
// and relations, of handling the consistency and of providing query
// mechanisms.
// It implements the NotificationBroadcaster by extending
// NotificationBroadcasterSupport to send notifications when a relation is
// removed from it.
// It implements the NotificationListener interface to be able to receive
// notifications concerning unregistration of MBeans referenced in relation
// roles and of relation MBeans.
// It implements the MBeanRegistration interface to be able to retrieve
// its ObjectName and MBean Server.
class RelationService extends NotificationBroadcasterSupport with RelationServiceMBean, with MBeanRegistration, with NotificationListener {

    @stub
    // Adds an MBean created by the user (and registered by him in the MBean
    // Server) as a relation in the Relation Service.
    def addRelation(relationObjectName: ObjectName): Unit = ???

    @stub
    // Adds given object as a relation type.
    def addRelationType(relationTypeObj: RelationType): Unit = ???

    @stub
    // Checks if given Role can be read in a relation of the given type.
    def checkRoleReading(roleName: String, relationTypeName: String): Integer = ???

    @stub
    // Checks if given Role can be set in a relation of given type.
    def checkRoleWriting(role: Role, relationTypeName: String, initFlag: Boolean): Integer = ???

    @stub
    // Creates a simple relation (represented by a RelationSupport object) of
    // given relation type, and adds it in the Relation Service.
    def createRelation(relationId: String, relationTypeName: String, roleList: RoleList): Unit = ???

    @stub
    // Creates a relation type (a RelationTypeSupport object) with given
    // role infos (provided by the RoleInfo objects), and adds it in the
    // Relation Service.
    def createRelationType(relationTypeName: String, roleInfoArray: Array[RoleInfo]): Unit = ???

    @stub
    // Retrieves the MBeans associated to given one in a relation.
    def findAssociatedMBeans(mbeanName: ObjectName, relationTypeName: String, roleName: String): Map[ObjectName, List[String]] = ???

    @stub
    // Retrieves the relations where a given MBean is referenced.
    def findReferencingRelations(mbeanName: ObjectName, relationTypeName: String, roleName: String): Map[String, List[String]] = ???

    @stub
    // Returns the relation ids for relations of the given type.
    def findRelationsOfType(relationTypeName: String): List[String] = ???

    @stub
    // Returns all the relation ids for all the relations handled by the
    // Relation Service.
    def getAllRelationIds(): List[String] = ???

    @stub
    // Retrieves names of all known relation types.
    def getAllRelationTypeNames(): List[String] = ???

    @stub
    // Returns all roles present in the relation.
    def getAllRoles(relationId: String): RoleResult = ???

    @stub
    // Returns a NotificationInfo object containing the name of the Java class
    // of the notification and the notification types sent.
    def getNotificationInfo(): Array[MBeanNotificationInfo] = ???

    @stub
    // Returns the flag to indicate if when a notification is received for the
    // unregistration of an MBean referenced in a relation, if an immediate
    // "purge" of the relations (look for the relations no longer valid)
    // has to be performed , or if that will be performed only when the
    // purgeRelations method will be explicitly called.
    def getPurgeFlag(): Boolean = ???

    @stub
    // Retrieves MBeans referenced in the various roles of the relation.
    def getReferencedMBeans(relationId: String): Map[ObjectName, List[String]] = ???

    @stub
    // Returns name of associated relation type for given relation.
    def getRelationTypeName(relationId: String): String = ???

    @stub
    // Retrieves role value for given role name in given relation.
    def getRole(relationId: String, roleName: String): List[ObjectName] = ???

    @stub
    // Retrieves the number of MBeans currently referenced in the given role.
    def getRoleCardinality(relationId: String, roleName: String): Integer = ???

    @stub
    // Retrieves role info for given role name of a given relation type.
    def getRoleInfo(relationTypeName: String, roleInfoName: String): RoleInfo = ???

    @stub
    // Retrieves list of role infos (RoleInfo objects) of a given relation
    // type.
    def getRoleInfos(relationTypeName: String): List[RoleInfo] = ???

    @stub
    // Retrieves values of roles with given names in given relation.
    def getRoles(relationId: String, roleNameArray: Array[String]): RoleResult = ???

    @stub
    // Invoked when a JMX notification occurs.
    def handleNotification(notif: Notification, handback: Object): Unit = ???

    @stub
    // Checks if there is a relation identified in Relation Service with given
    // relation id.
    def hasRelation(relationId: String): Boolean = ???

    @stub
    // Checks if the Relation Service is active.
    def isActive(): Unit = ???

    @stub
    // Returns the relation id associated to the given ObjectName if the
    // MBean has been added as a relation in the Relation Service.
    def isRelation(objectName: ObjectName): String = ???

    @stub
    // If the relation is represented by an MBean (created by the user and
    // added as a relation in the Relation Service), returns the ObjectName of
    // the MBean.
    def isRelationMBean(relationId: String): ObjectName = ???

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
    // Purges the relations.
    def purgeRelations(): Unit = ???

    @stub
    // Removes given relation from the Relation Service.
    def removeRelation(relationId: String): Unit = ???

    @stub
    // Removes given relation type from Relation Service.
    def removeRelationType(relationTypeName: String): Unit = ???

    @stub
    // Sends a notification (RelationNotification) for a relation creation.
    def sendRelationCreationNotification(relationId: String): Unit = ???

    @stub
    // Sends a notification (RelationNotification) for a relation removal.
    def sendRelationRemovalNotification(relationId: String, unregMBeanList: List[ObjectName]): Unit = ???

    @stub
    // Sends a notification (RelationNotification) for a role update in the
    // given relation.
    def sendRoleUpdateNotification(relationId: String, newRole: Role, oldValue: List[ObjectName]): Unit = ???

    @stub
    // Sets the flag to indicate if when a notification is received for the
    // unregistration of an MBean referenced in a relation, if an immediate
    // "purge" of the relations (look for the relations no longer valid)
    // has to be performed , or if that will be performed only when the
    // purgeRelations method will be explicitly called.
    def setPurgeFlag(purgeFlag: Boolean): Unit = ???

    @stub
    // Sets the given role in given relation.
    def setRole(relationId: String, role: Role): Unit = ???

    @stub
    // Sets the given roles in given relation.
    def setRoles(relationId: String, roleList: RoleList): RoleResult = ???
}
