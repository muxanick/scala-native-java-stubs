package javax.management.remote.rmi

import java.lang.{Integer, Object, String}
import java.rmi.MarshalledObject
import java.rmi.server.{RemoteObject, RemoteStub}
import java.util.Set
import javax.management.{AttributeList, MBeanInfo, ObjectInstance, ObjectName}
import javax.management.remote.NotificationResult
import javax.security.auth.Subject

/** 
 * See Also:
 * Serialized Form
 * 
 */
final class RMIConnectionImpl_Stub extends RemoteStub with RMIConnection {

    /** Handles the method MBeanServerConnection.addNotificationListener(ObjectName,
     *  ObjectName, NotificationFilter, Object).
     */
    @stub
    def addNotificationListener($param_ObjectName_1: ObjectName, $param_ObjectName_2: ObjectName, $param_MarshalledObject_3: MarshalledObject, $param_MarshalledObject_4: MarshalledObject, $param_Subject_5: Subject): Unit = ???

    /** Handles the method MBeanServerConnection.addNotificationListener(ObjectName,
     *  NotificationListener, NotificationFilter, Object).
     */
    @stub
    def addNotificationListeners($param_arrayOf_ObjectName_1: Array[ObjectName], $param_arrayOf_MarshalledObject_2: Array[MarshalledObject], $param_arrayOf_Subject_3: Array[Subject]): Array[Integer] = ???

    /** Closes this connection. */
    @stub
    def close(): Unit = ???

    /** Handles the method MBeanServerConnection.createMBean(String,
     *  ObjectName, Object[], String[]).
     */
    @stub
    def createMBean($param_String_1: String, $param_ObjectName_2: ObjectName, $param_MarshalledObject_3: MarshalledObject, $param_arrayOf_String_4: Array[String], $param_Subject_5: Subject): ObjectInstance = ???

    /** Handles the method MBeanServerConnection.createMBean(String,
     *  ObjectName, ObjectName, Object[], String[]).
     */
    @stub
    def createMBean($param_String_1: String, $param_ObjectName_2: ObjectName, $param_ObjectName_3: ObjectName, $param_MarshalledObject_4: MarshalledObject, $param_arrayOf_String_5: Array[String], $param_Subject_6: Subject): ObjectInstance = ???

    /** Handles the method MBeanServerConnection.createMBean(String,
     *  ObjectName, ObjectName).
     */
    @stub
    def createMBean($param_String_1: String, $param_ObjectName_2: ObjectName, $param_ObjectName_3: ObjectName, $param_Subject_4: Subject): ObjectInstance = ???

    /** Handles the method MBeanServerConnection.createMBean(String,
     *  ObjectName).
     */
    @stub
    def createMBean($param_String_1: String, $param_ObjectName_2: ObjectName, $param_Subject_3: Subject): ObjectInstance = ???

    /** Retrieves notifications from the connector server. */
    @stub
    def fetchNotifications($param_long_1: Long, $param_int_2: Int, $param_long_3: Long): NotificationResult = ???

    /** Handles the method MBeanServerConnection.getAttribute(ObjectName,
     *  String).
     */
    @stub
    def getAttribute($param_ObjectName_1: ObjectName, $param_String_2: String, $param_Subject_3: Subject): Object = ???

    /** Handles the method MBeanServerConnection.getAttributes(ObjectName,
     *  String[]).
     */
    @stub
    def getAttributes($param_ObjectName_1: ObjectName, $param_arrayOf_String_2: Array[String], $param_Subject_3: Subject): AttributeList = ???

    /** Returns the connection ID. */
    @stub
    def getConnectionId(): String = ???

    /** Handles the method
     *  MBeanServerConnection.getDefaultDomain().
     */
    @stub
    def getDefaultDomain($param_Subject_1: Subject): String = ???

    /** Handles the method
     *  MBeanServerConnection.getDomains().
     */
    @stub
    def getDomains($param_Subject_1: Subject): Array[String] = ???

    /** Handles the method
     *  MBeanServerConnection.getMBeanCount().
     */
    @stub
    def getMBeanCount($param_Subject_1: Subject): Integer = ???

    /** Handles the method
     *  MBeanServerConnection.getMBeanInfo(ObjectName).
     */
    @stub
    def getMBeanInfo($param_ObjectName_1: ObjectName, $param_Subject_2: Subject): MBeanInfo = ???

    /** Handles the method
     *  MBeanServerConnection.getObjectInstance(ObjectName).
     */
    @stub
    def getObjectInstance($param_ObjectName_1: ObjectName, $param_Subject_2: Subject): ObjectInstance = ???

    /** Handles the method MBeanServerConnection.invoke(ObjectName,
     *  String, Object[], String[]).
     */
    @stub
    def invoke($param_ObjectName_1: ObjectName, $param_String_2: String, $param_MarshalledObject_3: MarshalledObject, $param_arrayOf_String_4: Array[String], $param_Subject_5: Subject): Object = ???

    /** Handles the method MBeanServerConnection.isInstanceOf(ObjectName,
     *  String).
     */
    @stub
    def isInstanceOf($param_ObjectName_1: ObjectName, $param_String_2: String, $param_Subject_3: Subject): Boolean = ???

    /** Handles the method
     *  MBeanServerConnection.isRegistered(ObjectName).
     */
    @stub
    def isRegistered($param_ObjectName_1: ObjectName, $param_Subject_2: Subject): Boolean = ???

    /** Handles the method MBeanServerConnection.queryMBeans(ObjectName,
     *  QueryExp).
     */
    @stub
    def queryMBeans($param_ObjectName_1: ObjectName, $param_MarshalledObject_2: MarshalledObject, $param_Subject_3: Subject): Set = ???

    /** Handles the method MBeanServerConnection.queryNames(ObjectName,
     *  QueryExp).
     */
    @stub
    def queryNames($param_ObjectName_1: ObjectName, $param_MarshalledObject_2: MarshalledObject, $param_Subject_3: Subject): Set = ???

    /** Handles the method MBeanServerConnection.removeNotificationListener(ObjectName,
     *  ObjectName, NotificationFilter, Object).
     */
    @stub
    def removeNotificationListener($param_ObjectName_1: ObjectName, $param_ObjectName_2: ObjectName, $param_MarshalledObject_3: MarshalledObject, $param_MarshalledObject_4: MarshalledObject, $param_Subject_5: Subject): Unit = ???

    /** Handles the method MBeanServerConnection.removeNotificationListener(ObjectName,
     *  ObjectName).
     */
    @stub
    def removeNotificationListener($param_ObjectName_1: ObjectName, $param_ObjectName_2: ObjectName, $param_Subject_3: Subject): Unit = ???

    /** Handles the
     *  removeNotificationListener(ObjectName, NotificationListener) and
     *  removeNotificationListener(ObjectName, NotificationListener, NotificationFilter, Object) methods.
     */
    @stub
    def removeNotificationListeners($param_ObjectName_1: ObjectName, $param_arrayOf_Integer_2: Array[Integer], $param_Subject_3: Subject): Unit = ???

    /** Handles the method MBeanServerConnection.setAttribute(ObjectName,
     *  Attribute).
     */
    @stub
    def setAttribute($param_ObjectName_1: ObjectName, $param_MarshalledObject_2: MarshalledObject, $param_Subject_3: Subject): Unit = ???

    /** Handles the method MBeanServerConnection.setAttributes(ObjectName,
     *  AttributeList).
     */
    @stub
    def setAttributes($param_ObjectName_1: ObjectName, $param_MarshalledObject_2: MarshalledObject, $param_Subject_3: Subject): AttributeList = ???
}
