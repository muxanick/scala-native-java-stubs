package javax.management.remote.rmi

import java.io.Closeable
import java.lang.{Integer, Object, String}
import java.rmi.{MarshalledObject, Remote}
import java.util.Set
import javax.management.{AttributeList, MBeanInfo, ObjectInstance, ObjectName}
import javax.management.remote.NotificationResult
import javax.security.auth.Subject

/** RMI object used to forward an MBeanServer request from a client
 *  to its MBeanServer implementation on the server side.  There is one
 *  Remote object implementing this interface for each remote client
 *  connected to an RMI connector.
 * 
 *  User code does not usually refer to this interface.  It is
 *  specified as part of the public API so that different
 *  implementations of that API will interoperate.
 * 
 *  To ensure that client parameters will be deserialized at the
 *  server side with the correct classloader, client parameters such as
 *  parameters used to invoke a method are wrapped in a MarshalledObject.  An implementation of this interface must first
 *  get the appropriate class loader for the operation and its target,
 *  then deserialize the marshalled parameters with this classloader.
 *  Except as noted, a parameter that is a
 *  MarshalledObject or MarshalledObject[]
 *  must not be null; the behavior is unspecified if it is.
 * 
 *  Class loading aspects are detailed in the
 *  
 *  JMX Specification, version 1.4 PDF document.
 * 
 *  Most methods in this interface parallel methods in the MBeanServerConnection interface.  Where an aspect of the behavior
 *  of a method is not specified here, it is the same as in the
 *  corresponding MBeanServerConnection method.
 */
trait RMIConnection extends Closeable with Remote {

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
}
