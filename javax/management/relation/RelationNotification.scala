package javax.management.relation

import java.lang.{Object, String}
import java.util.{EventObject, List}
import javax.management.{Notification, ObjectName}
import scala.scalanative.annotation.stub

/** A notification of a change in the Relation Service.
 *  A RelationNotification notification is sent when a relation is created via
 *  the Relation Service, or an MBean is added as a relation in the Relation
 *  Service, or a role is updated in a relation, or a relation is removed from
 *  the Relation Service.
 * 
 *  The serialVersionUID of this class is -6871117877523310399L.
 */
class RelationNotification extends Notification {

    /** Creates a notification for either a relation creation (RelationSupport
     *  object created internally in the Relation Service, or an MBean added as a
     *  relation) or for a relation removal from the Relation Service.
     */
    @stub
    def this(notifType: String, sourceObj: Any, sequence: Long, timeStamp: Long, message: String, id: String, typeName: String, objectName: ObjectName, unregMBeanList: List[ObjectName]) = ???

    /** Creates a notification for a role update in a relation. */
    @stub
    def this(notifType: String, sourceObj: Any, sequence: Long, timeStamp: Long, message: String, id: String, typeName: String, objectName: ObjectName, name: String, newValue: List[ObjectName], oldValue: List[ObjectName]) = ???

    /** Returns the list of ObjectNames of MBeans expected to be unregistered
     *  due to a relation removal (only for relation removal).
     */
    @stub
    def getMBeansToUnregister(): List[ObjectName] = ???

    /** Returns new value of updated role (only for role update). */
    @stub
    def getNewRoleValue(): List[ObjectName] = ???

    /** Returns the ObjectName of the
     *  created/removed/updated relation.
     */
    @stub
    def getObjectName(): ObjectName = ???

    /** Returns old value of updated role (only for role update). */
    @stub
    def getOldRoleValue(): List[ObjectName] = ???

    /** Returns the relation identifier of created/removed/updated relation. */
    @stub
    def getRelationId(): String = ???

    /** Returns the relation type name of created/removed/updated relation. */
    @stub
    def getRelationTypeName(): String = ???

    /** Returns name of updated role of updated relation (only for role update). */
    @stub
    def getRoleName(): String = ???
}

object RelationNotification {
    /** Type for the creation of an internal relation. */
    @stub
    val RELATION_BASIC_CREATION: String = ???

    /** Type for the removal from the Relation Service of an internal relation. */
    @stub
    val RELATION_BASIC_REMOVAL: String = ???

    /** Type for an update of an internal relation. */
    @stub
    val RELATION_BASIC_UPDATE: String = ???

    /** Type for the relation MBean added into the Relation Service. */
    @stub
    val RELATION_MBEAN_CREATION: String = ???

    /** Type for the removal from the Relation Service of a relation MBean. */
    @stub
    val RELATION_MBEAN_REMOVAL: String = ???

    /** Type for the update of a relation MBean. */
    @stub
    val RELATION_MBEAN_UPDATE: String = ???
}
