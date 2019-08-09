package javax.management.modelmbean

import java.lang.{Object, String}
import javax.management.{Descriptor, MBeanAttributeInfo, MBeanConstructorInfo, MBeanNotificationInfo, MBeanOperationInfo}

// This interface is implemented by the ModelMBeanInfo for every ModelMBean. An implementation of this interface
// must be shipped with every JMX Agent.
// 
// Java resources wishing to be manageable instantiate the ModelMBean using the MBeanServer's
// createMBean method.  The resource then sets the ModelMBeanInfo and Descriptors for the ModelMBean
// instance. The attributes, operations, and notifications exposed via the ModelMBeanInfo for the
// ModelMBean comprise the management interface and are accessible
// from MBeans, connectors/adaptors like other MBeans. Through the Descriptors, values and methods in
// the managed application can be defined and mapped to attributes and operations of the ModelMBean.
// This mapping can be defined during development in a file or dynamically and
// programmatically at runtime.
// 
// Every ModelMBean which is instantiated in the MBeanServer becomes manageable:
// its attributes, operations, and notifications
// become remotely accessible through the connectors/adaptors connected to that MBeanServer.
// A Java object cannot be registered in the MBeanServer unless it is a JMX compliant MBean.
// By instantiating a ModelMBean, resources are guaranteed that the MBean is valid.
//
// MBeanException and RuntimeOperationsException must be thrown on every public method.  This allows
//  for wrapping exceptions from distributed communications (RMI, EJB, etc.)
trait ModelMBeanInfo {

    @stub
    // Creates and returns a copy of this object.
    def clone(): Object = ???

    @stub
    // Returns a ModelMBeanAttributeInfo requested by name.
    def getAttribute(inName: String): ModelMBeanAttributeInfo = ???

    @stub
    // Returns the list of attributes exposed for management.
    def getAttributes(): Array[MBeanAttributeInfo] = ???

    @stub
    // Returns the name of the Java class of the MBean described by
    // this MBeanInfo.
    def getClassName(): String = ???

    @stub
    // Returns the list of the public constructors  of the MBean.
    def getConstructors(): Array[MBeanConstructorInfo] = ???

    @stub
    // Returns a human readable description of the MBean.
    def getDescription(): String = ???

    @stub
    // Returns a Descriptor requested by name and descriptorType.
    def getDescriptor(inDescriptorName: String, inDescriptorType: String): Descriptor = ???

    @stub
    // Returns a Descriptor array consisting of all
    // Descriptors for the ModelMBeanInfo of type inDescriptorType.
    def getDescriptors(inDescriptorType: String): Array[Descriptor] = ???

    @stub
    // Returns the ModelMBean's descriptor which contains MBean wide
    // policies.
    def getMBeanDescriptor(): Descriptor = ???

    @stub
    // Returns a ModelMBeanNotificationInfo requested by name.
    def getNotification(inName: String): ModelMBeanNotificationInfo = ???

    @stub
    // Returns the list of the notifications emitted by the MBean.
    def getNotifications(): Array[MBeanNotificationInfo] = ???

    @stub
    // Returns a ModelMBeanOperationInfo requested by name.
    def getOperation(inName: String): ModelMBeanOperationInfo = ???

    @stub
    // Returns the list of operations  of the MBean.
    def getOperations(): Array[MBeanOperationInfo] = ???

    @stub
    // Sets descriptors in the info array of type inDescriptorType
    // for the ModelMBean.
    def setDescriptor(inDescriptor: Descriptor, inDescriptorType: String): Unit = ???

    @stub
    // Adds or replaces descriptors in the ModelMBeanInfo.
    def setDescriptors(inDescriptors: Array[Descriptor]): Unit = ???
}
