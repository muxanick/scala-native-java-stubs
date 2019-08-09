package javax.management.remote.rmi

import java.lang.{Integer, Object, String}
import java.rmi.MarshalledObject
import java.rmi.server.Unreferenced
import java.util.Set
import javax.management.{AttributeList, MBeanInfo, ObjectInstance, ObjectName}
import javax.management.remote.NotificationResult
import javax.security.auth.Subject

/** Implementation of the RMIConnection interface.  User
 *  code will not usually reference this class.
 */
class RMIConnectionImpl extends Object with RMIConnection with Unreferenced {

    /** Handles the method MBeanServerConnection.addNotificationListener(ObjectName,
     *  ObjectName, NotificationFilter, Object).
     */
    @stub
    def addNotificationListener(name: ObjectName, listener: ObjectName, filter: MarshalledObject, handback: MarshalledObject, delegationSubject: Subject): Unit = ???

    /** Handles the method MBeanServerConnection.addNotificationListener(ObjectName,
     *  NotificationListener, NotificationFilter, Object).
     */
    @stub
    def addNotificationListeners(names: Array[ObjectName], filters: Array[MarshalledObject], delegationSubjects: Array[Subject]): Array[Integer] = ???

    /** Closes this connection. */
    @stub
    def close(): Unit = ???

    /** Handles the method MBeanServerConnection.createMBean(String,
     *  ObjectName, Object[], String[]).
     */
    @stub
    def createMBean(className: String, name: ObjectName, params: MarshalledObject, signature: Array[String], delegationSubject: Subject): ObjectInstance = ???

    /** Handles the method MBeanServerConnection.createMBean(String,
     *  ObjectName, ObjectName, Object[], String[]).
     */
    @stub
    def createMBean(className: String, name: ObjectName, loaderName: ObjectName, params: MarshalledObject, signature: Array[String], delegationSubject: Subject): ObjectInstance = ???

    /** Handles the method MBeanServerConnection.createMBean(String,
     *  ObjectName, ObjectName).
     */
    @stub
    def createMBean(className: String, name: ObjectName, loaderName: ObjectName, delegationSubject: Subject): ObjectInstance = ???

    /** Handles the method MBeanServerConnection.createMBean(String,
     *  ObjectName).
     */
    @stub
    def createMBean(className: String, name: ObjectName, delegationSubject: Subject): ObjectInstance = ???

    /** Retrieves notifications from the connector server. */
    @stub
    def fetchNotifications(clientSequenceNumber: Long, maxNotifications: Int, timeout: Long): NotificationResult = ???

    /** Handles the method MBeanServerConnection.getAttribute(ObjectName,
     *  String).
     */
    @stub
    def getAttribute(name: ObjectName, attribute: String, delegationSubject: Subject): Object = ???

    /** Handles the method MBeanServerConnection.getAttributes(ObjectName,
     *  String[]).
     */
    @stub
    def getAttributes(name: ObjectName, attributes: Array[String], delegationSubject: Subject): AttributeList = ???

    /** Returns the connection ID. */
    @stub
    def getConnectionId(): String = ???

    /** Handles the method
     *  MBeanServerConnection.getDefaultDomain().
     */
    @stub
    def getDefaultDomain(delegationSubject: Subject): String = ???

    /** Handles the method
     *  MBeanServerConnection.getDomains().
     */
    @stub
    def getDomains(delegationSubject: Subject): Array[String] = ???

    /** Handles the method
     *  MBeanServerConnection.getMBeanCount().
     */
    @stub
    def getMBeanCount(delegationSubject: Subject): Integer = ???

    /** Handles the method
     *  MBeanServerConnection.getMBeanInfo(ObjectName).
     */
    @stub
    def getMBeanInfo(name: ObjectName, delegationSubject: Subject): MBeanInfo = ???

    /** Handles the method
     *  MBeanServerConnection.getObjectInstance(ObjectName).
     */
    @stub
    def getObjectInstance(name: ObjectName, delegationSubject: Subject): ObjectInstance = ???

    /** Handles the method MBeanServerConnection.invoke(ObjectName,
     *  String, Object[], String[]).
     */
    @stub
    def invoke(name: ObjectName, operationName: String, params: MarshalledObject, signature: Array[String], delegationSubject: Subject): Object = ???

    /** Handles the method MBeanServerConnection.isInstanceOf(ObjectName,
     *  String).
     */
    @stub
    def isInstanceOf(name: ObjectName, className: String, delegationSubject: Subject): Boolean = ???

    /** Handles the method
     *  MBeanServerConnection.isRegistered(ObjectName).
     */
    @stub
    def isRegistered(name: ObjectName, delegationSubject: Subject): Boolean = ???

    /** Handles the method MBeanServerConnection.queryMBeans(ObjectName,
     *  QueryExp).
     */
    @stub
    def queryMBeans(name: ObjectName, query: MarshalledObject, delegationSubject: Subject): Set[ObjectInstance] = ???

    /** Handles the method MBeanServerConnection.queryNames(ObjectName,
     *  QueryExp).
     */
    @stub
    def queryNames(name: ObjectName, query: MarshalledObject, delegationSubject: Subject): Set[ObjectName] = ???

    /** Handles the method MBeanServerConnection.removeNotificationListener(ObjectName,
     *  ObjectName, NotificationFilter, Object).
     */
    @stub
    def removeNotificationListener(name: ObjectName, listener: ObjectName, filter: MarshalledObject, handback: MarshalledObject, delegationSubject: Subject): Unit = ???

    /** Handles the method MBeanServerConnection.removeNotificationListener(ObjectName,
     *  ObjectName).
     */
    @stub
    def removeNotificationListener(name: ObjectName, listener: ObjectName, delegationSubject: Subject): Unit = ???

    /** Handles the
     *  removeNotificationListener(ObjectName, NotificationListener) and
     *  removeNotificationListener(ObjectName, NotificationListener, NotificationFilter, Object) methods.
     */
    @stub
    def removeNotificationListeners(name: ObjectName, listenerIDs: Array[Integer], delegationSubject: Subject): Unit = ???

    /** Handles the method MBeanServerConnection.setAttribute(ObjectName,
     *  Attribute).
     */
    @stub
    def setAttribute(name: ObjectName, attribute: MarshalledObject, delegationSubject: Subject): Unit = ???

    /** Handles the method MBeanServerConnection.setAttributes(ObjectName,
     *  AttributeList).
     */
    @stub
    def setAttributes(name: ObjectName, attributes: MarshalledObject, delegationSubject: Subject): AttributeList = ???

    /** Returns a string representation of this object. */
    @stub
    def toString(): String = ???

    /** Called by the RMI runtime sometime after the runtime determines that
     *  the reference list, the list of clients referencing the remote object,
     *  becomes empty.
     */
    @stub
    def unreferenced(): Unit = ???
}
