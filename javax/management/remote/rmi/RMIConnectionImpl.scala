package javax.management.remote.rmi

import java.lang.{Integer, Object, String}
import java.rmi.MarshalledObject
import java.rmi.server.Unreferenced
import java.util.Set
import javax.management.{AttributeList, MBeanInfo, ObjectInstance, ObjectName}
import javax.management.remote.NotificationResult
import javax.security.auth.Subject

// Implementation of the RMIConnection interface.  User
// code will not usually reference this class.
class RMIConnectionImpl extends Object with RMIConnection, with Unreferenced {

    @stub
    // Handles the method MBeanServerConnection.addNotificationListener(ObjectName,
    // ObjectName, NotificationFilter, Object).
    def addNotificationListener(name: ObjectName, listener: ObjectName, filter: MarshalledObject, handback: MarshalledObject, delegationSubject: Subject): Unit = ???

    @stub
    // Handles the method MBeanServerConnection.addNotificationListener(ObjectName,
    // NotificationListener, NotificationFilter, Object).
    def addNotificationListeners(names: Array[ObjectName], filters: Array[MarshalledObject], delegationSubjects: Array[Subject]): Array[Integer] = ???

    @stub
    // Closes this connection.
    def close(): Unit = ???

    @stub
    // Handles the method MBeanServerConnection.createMBean(String,
    // ObjectName, Object[], String[]).
    def createMBean(className: String, name: ObjectName, params: MarshalledObject, signature: Array[String], delegationSubject: Subject): ObjectInstance = ???

    @stub
    // Handles the method MBeanServerConnection.createMBean(String,
    // ObjectName, ObjectName, Object[], String[]).
    def createMBean(className: String, name: ObjectName, loaderName: ObjectName, params: MarshalledObject, signature: Array[String], delegationSubject: Subject): ObjectInstance = ???

    @stub
    // Handles the method MBeanServerConnection.createMBean(String,
    // ObjectName, ObjectName).
    def createMBean(className: String, name: ObjectName, loaderName: ObjectName, delegationSubject: Subject): ObjectInstance = ???

    @stub
    // Handles the method MBeanServerConnection.createMBean(String,
    // ObjectName).
    def createMBean(className: String, name: ObjectName, delegationSubject: Subject): ObjectInstance = ???

    @stub
    // Retrieves notifications from the connector server.
    def fetchNotifications(clientSequenceNumber: Long, maxNotifications: Int, timeout: Long): NotificationResult = ???

    @stub
    // Handles the method MBeanServerConnection.getAttribute(ObjectName,
    // String).
    def getAttribute(name: ObjectName, attribute: String, delegationSubject: Subject): Object = ???

    @stub
    // Handles the method MBeanServerConnection.getAttributes(ObjectName,
    // String[]).
    def getAttributes(name: ObjectName, attributes: Array[String], delegationSubject: Subject): AttributeList = ???

    @stub
    // Returns the connection ID.
    def getConnectionId(): String = ???

    @stub
    // Handles the method
    // MBeanServerConnection.getDefaultDomain().
    def getDefaultDomain(delegationSubject: Subject): String = ???

    @stub
    // Handles the method
    // MBeanServerConnection.getDomains().
    def getDomains(delegationSubject: Subject): Array[String] = ???

    @stub
    // Handles the method
    // MBeanServerConnection.getMBeanCount().
    def getMBeanCount(delegationSubject: Subject): Integer = ???

    @stub
    // Handles the method
    // MBeanServerConnection.getMBeanInfo(ObjectName).
    def getMBeanInfo(name: ObjectName, delegationSubject: Subject): MBeanInfo = ???

    @stub
    // Handles the method
    // MBeanServerConnection.getObjectInstance(ObjectName).
    def getObjectInstance(name: ObjectName, delegationSubject: Subject): ObjectInstance = ???

    @stub
    // Handles the method MBeanServerConnection.invoke(ObjectName,
    // String, Object[], String[]).
    def invoke(name: ObjectName, operationName: String, params: MarshalledObject, signature: Array[String], delegationSubject: Subject): Object = ???

    @stub
    // Handles the method MBeanServerConnection.isInstanceOf(ObjectName,
    // String).
    def isInstanceOf(name: ObjectName, className: String, delegationSubject: Subject): Boolean = ???

    @stub
    // Handles the method
    // MBeanServerConnection.isRegistered(ObjectName).
    def isRegistered(name: ObjectName, delegationSubject: Subject): Boolean = ???

    @stub
    // Handles the method MBeanServerConnection.queryMBeans(ObjectName,
    // QueryExp).
    def queryMBeans(name: ObjectName, query: MarshalledObject, delegationSubject: Subject): Set[ObjectInstance] = ???

    @stub
    // Handles the method MBeanServerConnection.queryNames(ObjectName,
    // QueryExp).
    def queryNames(name: ObjectName, query: MarshalledObject, delegationSubject: Subject): Set[ObjectName] = ???

    @stub
    // Handles the method MBeanServerConnection.removeNotificationListener(ObjectName,
    // ObjectName, NotificationFilter, Object).
    def removeNotificationListener(name: ObjectName, listener: ObjectName, filter: MarshalledObject, handback: MarshalledObject, delegationSubject: Subject): Unit = ???

    @stub
    // Handles the method MBeanServerConnection.removeNotificationListener(ObjectName,
    // ObjectName).
    def removeNotificationListener(name: ObjectName, listener: ObjectName, delegationSubject: Subject): Unit = ???

    @stub
    // Handles the
    // removeNotificationListener(ObjectName, NotificationListener) and
    // removeNotificationListener(ObjectName, NotificationListener, NotificationFilter, Object) methods.
    def removeNotificationListeners(name: ObjectName, listenerIDs: Array[Integer], delegationSubject: Subject): Unit = ???

    @stub
    // Handles the method MBeanServerConnection.setAttribute(ObjectName,
    // Attribute).
    def setAttribute(name: ObjectName, attribute: MarshalledObject, delegationSubject: Subject): Unit = ???

    @stub
    // Handles the method MBeanServerConnection.setAttributes(ObjectName,
    // AttributeList).
    def setAttributes(name: ObjectName, attributes: MarshalledObject, delegationSubject: Subject): AttributeList = ???

    @stub
    // Returns a string representation of this object.
    def toString(): String = ???

    @stub
    // Called by the RMI runtime sometime after the runtime determines that
    // the reference list, the list of clients referencing the remote object,
    // becomes empty.
    def unreferenced(): Unit = ???
}
