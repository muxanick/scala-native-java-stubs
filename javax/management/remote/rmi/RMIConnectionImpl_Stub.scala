package javax.management.remote.rmi

import java.lang.{Integer, Object, String}
import java.rmi.MarshalledObject
import java.rmi.server.{RemoteObject, RemoteStub}
import java.util.Set
import javax.management.{AttributeList, MBeanInfo, ObjectInstance, ObjectName}
import javax.management.remote.NotificationResult
import javax.security.auth.Subject

// 
//See Also:
//Serialized Form
//
final class RMIConnectionImpl_Stub extends RemoteStub with RMIConnection {

    @stub
    // Handles the method MBeanServerConnection.addNotificationListener(ObjectName,
    // ObjectName, NotificationFilter, Object).
    def addNotificationListener($param_ObjectName_1: ObjectName, $param_ObjectName_2: ObjectName, $param_MarshalledObject_3: MarshalledObject, $param_MarshalledObject_4: MarshalledObject, $param_Subject_5: Subject): Unit = ???

    @stub
    // Handles the method MBeanServerConnection.addNotificationListener(ObjectName,
    // NotificationListener, NotificationFilter, Object).
    def addNotificationListeners($param_arrayOf_ObjectName_1: Array[ObjectName], $param_arrayOf_MarshalledObject_2: Array[MarshalledObject], $param_arrayOf_Subject_3: Array[Subject]): Array[Integer] = ???

    @stub
    // Closes this connection.
    def close(): Unit = ???

    @stub
    // Handles the method MBeanServerConnection.createMBean(String,
    // ObjectName, Object[], String[]).
    def createMBean($param_String_1: String, $param_ObjectName_2: ObjectName, $param_MarshalledObject_3: MarshalledObject, $param_arrayOf_String_4: Array[String], $param_Subject_5: Subject): ObjectInstance = ???

    @stub
    // Handles the method MBeanServerConnection.createMBean(String,
    // ObjectName, ObjectName, Object[], String[]).
    def createMBean($param_String_1: String, $param_ObjectName_2: ObjectName, $param_ObjectName_3: ObjectName, $param_MarshalledObject_4: MarshalledObject, $param_arrayOf_String_5: Array[String], $param_Subject_6: Subject): ObjectInstance = ???

    @stub
    // Handles the method MBeanServerConnection.createMBean(String,
    // ObjectName, ObjectName).
    def createMBean($param_String_1: String, $param_ObjectName_2: ObjectName, $param_ObjectName_3: ObjectName, $param_Subject_4: Subject): ObjectInstance = ???

    @stub
    // Handles the method MBeanServerConnection.createMBean(String,
    // ObjectName).
    def createMBean($param_String_1: String, $param_ObjectName_2: ObjectName, $param_Subject_3: Subject): ObjectInstance = ???

    @stub
    // Retrieves notifications from the connector server.
    def fetchNotifications($param_long_1: Long, $param_int_2: Int, $param_long_3: Long): NotificationResult = ???

    @stub
    // Handles the method MBeanServerConnection.getAttribute(ObjectName,
    // String).
    def getAttribute($param_ObjectName_1: ObjectName, $param_String_2: String, $param_Subject_3: Subject): Object = ???

    @stub
    // Handles the method MBeanServerConnection.getAttributes(ObjectName,
    // String[]).
    def getAttributes($param_ObjectName_1: ObjectName, $param_arrayOf_String_2: Array[String], $param_Subject_3: Subject): AttributeList = ???

    @stub
    // Returns the connection ID.
    def getConnectionId(): String = ???

    @stub
    // Handles the method
    // MBeanServerConnection.getDefaultDomain().
    def getDefaultDomain($param_Subject_1: Subject): String = ???

    @stub
    // Handles the method
    // MBeanServerConnection.getDomains().
    def getDomains($param_Subject_1: Subject): Array[String] = ???

    @stub
    // Handles the method
    // MBeanServerConnection.getMBeanCount().
    def getMBeanCount($param_Subject_1: Subject): Integer = ???

    @stub
    // Handles the method
    // MBeanServerConnection.getMBeanInfo(ObjectName).
    def getMBeanInfo($param_ObjectName_1: ObjectName, $param_Subject_2: Subject): MBeanInfo = ???

    @stub
    // Handles the method
    // MBeanServerConnection.getObjectInstance(ObjectName).
    def getObjectInstance($param_ObjectName_1: ObjectName, $param_Subject_2: Subject): ObjectInstance = ???

    @stub
    // Handles the method MBeanServerConnection.invoke(ObjectName,
    // String, Object[], String[]).
    def invoke($param_ObjectName_1: ObjectName, $param_String_2: String, $param_MarshalledObject_3: MarshalledObject, $param_arrayOf_String_4: Array[String], $param_Subject_5: Subject): Object = ???

    @stub
    // Handles the method MBeanServerConnection.isInstanceOf(ObjectName,
    // String).
    def isInstanceOf($param_ObjectName_1: ObjectName, $param_String_2: String, $param_Subject_3: Subject): Boolean = ???

    @stub
    // Handles the method
    // MBeanServerConnection.isRegistered(ObjectName).
    def isRegistered($param_ObjectName_1: ObjectName, $param_Subject_2: Subject): Boolean = ???

    @stub
    // Handles the method MBeanServerConnection.queryMBeans(ObjectName,
    // QueryExp).
    def queryMBeans($param_ObjectName_1: ObjectName, $param_MarshalledObject_2: MarshalledObject, $param_Subject_3: Subject): Set = ???

    @stub
    // Handles the method MBeanServerConnection.queryNames(ObjectName,
    // QueryExp).
    def queryNames($param_ObjectName_1: ObjectName, $param_MarshalledObject_2: MarshalledObject, $param_Subject_3: Subject): Set = ???

    @stub
    // Handles the method MBeanServerConnection.removeNotificationListener(ObjectName,
    // ObjectName, NotificationFilter, Object).
    def removeNotificationListener($param_ObjectName_1: ObjectName, $param_ObjectName_2: ObjectName, $param_MarshalledObject_3: MarshalledObject, $param_MarshalledObject_4: MarshalledObject, $param_Subject_5: Subject): Unit = ???

    @stub
    // Handles the method MBeanServerConnection.removeNotificationListener(ObjectName,
    // ObjectName).
    def removeNotificationListener($param_ObjectName_1: ObjectName, $param_ObjectName_2: ObjectName, $param_Subject_3: Subject): Unit = ???

    @stub
    // Handles the
    // removeNotificationListener(ObjectName, NotificationListener) and
    // removeNotificationListener(ObjectName, NotificationListener, NotificationFilter, Object) methods.
    def removeNotificationListeners($param_ObjectName_1: ObjectName, $param_arrayOf_Integer_2: Array[Integer], $param_Subject_3: Subject): Unit = ???

    @stub
    // Handles the method MBeanServerConnection.setAttribute(ObjectName,
    // Attribute).
    def setAttribute($param_ObjectName_1: ObjectName, $param_MarshalledObject_2: MarshalledObject, $param_Subject_3: Subject): Unit = ???

    @stub
    // Handles the method MBeanServerConnection.setAttributes(ObjectName,
    // AttributeList).
    def setAttributes($param_ObjectName_1: ObjectName, $param_MarshalledObject_2: MarshalledObject, $param_Subject_3: Subject): AttributeList = ???
}
