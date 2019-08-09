package javax.management.modelmbean

import java.lang.{Object, String}
import javax.management.{Descriptor, MBeanInfo}

// This class represents the meta data for ModelMBeans.  Descriptors have been
// added on the meta data objects.
// 
// Java resources wishing to be manageable instantiate the ModelMBean using the
// MBeanServer's createMBean method.  The resource then sets the ModelMBeanInfo
// and Descriptors for the ModelMBean instance. The attributes and operations
// exposed via the ModelMBeanInfo for the ModelMBean are accessible
// from MBeans, connectors/adaptors like other MBeans. Through the Descriptors,
// values and methods in the managed application can be defined and mapped to
// attributes and operations of the ModelMBean.
// This mapping can be defined during development in a file or dynamically and
// programmatically at runtime.
// 
// Every ModelMBean which is instantiated in the MBeanServer becomes manageable:
// its attributes and operations
// become remotely accessible through the connectors/adaptors connected to that
// MBeanServer.
// A Java object cannot be registered in the MBeanServer unless it is a JMX
// compliant MBean.
// By instantiating a ModelMBean, resources are guaranteed that the MBean is
// valid.
//
// MBeanException and RuntimeOperationsException must be thrown on every public
// method.  This allows for wrapping exceptions from distributed
// communications (RMI, EJB, etc.)
//
// The serialVersionUID of this class is
// -1935722590756516193L.
class ModelMBeanInfoSupport extends MBeanInfo with ModelMBeanInfo {

    @stub
    // Constructs a ModelMBeanInfoSupport which is a duplicate of the given
    // ModelMBeanInfo.
    def this(mbi: ModelMBeanInfo) = ???

    @stub
    // Creates a ModelMBeanInfoSupport with the provided information,
    // but the descriptor is a default.
    def this(className: String, description: String, attributes: Array[ModelMBeanAttributeInfo], constructors: Array[ModelMBeanConstructorInfo], operations: Array[ModelMBeanOperationInfo], notifications: Array[ModelMBeanNotificationInfo]) = ???

    @stub
    // Returns a shallow clone of this instance.
    def clone(): Object = ???

    @stub
    // Returns a ModelMBeanAttributeInfo requested by name.
    def getAttribute(inName: String): ModelMBeanAttributeInfo = ???

    @stub
    // Returns the ModelMBeanConstructorInfo requested by name.
    def getConstructor(inName: String): ModelMBeanConstructorInfo = ???

    @stub
    // Get the descriptor of this MBeanInfo.
    def getDescriptor(): Descriptor = ???

    @stub
    // Returns a Descriptor requested by name.
    def getDescriptor(inDescriptorName: String): Descriptor = ???

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
    // Returns a ModelMBeanOperationInfo requested by name.
    def getOperation(inName: String): ModelMBeanOperationInfo = ???

    @stub
    // Sets descriptors in the info array of type inDescriptorType
    // for the ModelMBean.
    def setDescriptor(inDescriptor: Descriptor, inDescriptorType: String): Unit = ???

    @stub
    // Adds or replaces descriptors in the ModelMBeanInfo.
    def setDescriptors(inDescriptors: Array[Descriptor]): Unit = ???
}
