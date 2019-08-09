package javax.management.relation

import java.lang.{Object, String}
import java.util.{EventObject, List}
import javax.management.{Notification, ObjectName}

// A notification of a change in the Relation Service.
// A RelationNotification notification is sent when a relation is created via
// the Relation Service, or an MBean is added as a relation in the Relation
// Service, or a role is updated in a relation, or a relation is removed from
// the Relation Service.
//
// The serialVersionUID of this class is -6871117877523310399L.
class RelationNotification extends Notification {

    @stub
    // Creates a notification for either a relation creation (RelationSupport
    // object created internally in the Relation Service, or an MBean added as a
    // relation) or for a relation removal from the Relation Service.
    def this(notifType: String, sourceObj: Object, sequence: Long, timeStamp: Long, message: String, id: String, typeName: String, objectName: ObjectName, unregMBeanList: List[ObjectName]) = ???

    @stub
    // Returns the list of ObjectNames of MBeans expected to be unregistered
    // due to a relation removal (only for relation removal).
    def getMBeansToUnregister(): List[ObjectName] = ???

    @stub
    // Returns new value of updated role (only for role update).
    def getNewRoleValue(): List[ObjectName] = ???

    @stub
    // Returns the ObjectName of the
    // created/removed/updated relation.
    def getObjectName(): ObjectName = ???

    @stub
    // Returns old value of updated role (only for role update).
    def getOldRoleValue(): List[ObjectName] = ???

    @stub
    // Returns the relation identifier of created/removed/updated relation.
    def getRelationId(): String = ???

    @stub
    // Returns the relation type name of created/removed/updated relation.
    def getRelationTypeName(): String = ???
}

object RelationNotification {
    @stub
    // Type for the creation of an internal relation.
    def RELATION_BASIC_CREATION: String = ???

    @stub
    // Type for the removal from the Relation Service of an internal relation.
    def RELATION_BASIC_REMOVAL: String = ???

    @stub
    // Type for an update of an internal relation.
    def RELATION_BASIC_UPDATE: String = ???

    @stub
    // Type for the relation MBean added into the Relation Service.
    def RELATION_MBEAN_CREATION: String = ???

    @stub
    // Type for the removal from the Relation Service of a relation MBean.
    def RELATION_MBEAN_REMOVAL: String = ???
}
