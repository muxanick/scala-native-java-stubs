package javax.management.remote.rmi

import java.io.Closeable
import java.lang.{Integer, Object, String}
import java.rmi.{MarshalledObject, Remote}
import java.util.Set
import javax.management.{AttributeList, MBeanInfo, ObjectInstance, ObjectName}
import javax.management.remote.NotificationResult
import javax.security.auth.Subject

// RMI object used to forward an MBeanServer request from a client
// to its MBeanServer implementation on the server side.  There is one
// Remote object implementing this interface for each remote client
// connected to an RMI connector.
//
// User code does not usually refer to this interface.  It is
// specified as part of the public API so that different
// implementations of that API will interoperate.
//
// To ensure that client parameters will be deserialized at the
// server side with the correct classloader, client parameters such as
// parameters used to invoke a method are wrapped in a MarshalledObject.  An implementation of this interface must first
// get the appropriate class loader for the operation and its target,
// then deserialize the marshalled parameters with this classloader.
// Except as noted, a parameter that is a
// MarshalledObject or MarshalledObject[]
// must not be null; the behavior is unspecified if it is.
//
// Class loading aspects are detailed in the
// 
// JMX Specification, version 1.4 PDF document.
//
// Most methods in this interface parallel methods in the MBeanServerConnection interface.  Where an aspect of the behavior
// of a method is not specified here, it is the same as in the
// corresponding MBeanServerConnection method.
trait RMIConnection extends Closeable , Remote {

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
}
