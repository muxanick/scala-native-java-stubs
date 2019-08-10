package javax.management.modelmbean

import java.lang.{Object, String}
import javax.management.{Descriptor, MBeanAttributeInfo, MBeanConstructorInfo, MBeanNotificationInfo, MBeanOperationInfo}
import scala.scalanative.annotation.stub

/** This interface is implemented by the ModelMBeanInfo for every ModelMBean. An implementation of this interface
 *  must be shipped with every JMX Agent.
 *  
 *  Java resources wishing to be manageable instantiate the ModelMBean using the MBeanServer's
 *  createMBean method.  The resource then sets the ModelMBeanInfo and Descriptors for the ModelMBean
 *  instance. The attributes, operations, and notifications exposed via the ModelMBeanInfo for the
 *  ModelMBean comprise the management interface and are accessible
 *  from MBeans, connectors/adaptors like other MBeans. Through the Descriptors, values and methods in
 *  the managed application can be defined and mapped to attributes and operations of the ModelMBean.
 *  This mapping can be defined during development in a file or dynamically and
 *  programmatically at runtime.
 *  
 *  Every ModelMBean which is instantiated in the MBeanServer becomes manageable:
 *  its attributes, operations, and notifications
 *  become remotely accessible through the connectors/adaptors connected to that MBeanServer.
 *  A Java object cannot be registered in the MBeanServer unless it is a JMX compliant MBean.
 *  By instantiating a ModelMBean, resources are guaranteed that the MBean is valid.
 * 
 *  MBeanException and RuntimeOperationsException must be thrown on every public method.  This allows
 *   for wrapping exceptions from distributed communications (RMI, EJB, etc.)
 */
trait ModelMBeanInfo {

    /** Creates and returns a copy of this object. */
    @stub
    def clone(): Any = ???

    /** Returns a ModelMBeanAttributeInfo requested by name. */
    @stub
    def getAttribute(inName: String): ModelMBeanAttributeInfo = ???

    /** Returns the list of attributes exposed for management. */
    @stub
    def getAttributes(): Array[MBeanAttributeInfo] = ???

    /** Returns the name of the Java class of the MBean described by
     *  this MBeanInfo.
     */
    @stub
    def getClassName(): String = ???

    /** Returns the list of the public constructors  of the MBean. */
    @stub
    def getConstructors(): Array[MBeanConstructorInfo] = ???

    /** Returns a human readable description of the MBean. */
    @stub
    def getDescription(): String = ???

    /** Returns a Descriptor requested by name and descriptorType. */
    @stub
    def getDescriptor(inDescriptorName: String, inDescriptorType: String): Descriptor = ???

    /** Returns a Descriptor array consisting of all
     *  Descriptors for the ModelMBeanInfo of type inDescriptorType.
     */
    @stub
    def getDescriptors(inDescriptorType: String): Array[Descriptor] = ???

    /** Returns the ModelMBean's descriptor which contains MBean wide
     *  policies.
     */
    @stub
    def getMBeanDescriptor(): Descriptor = ???

    /** Returns a ModelMBeanNotificationInfo requested by name. */
    @stub
    def getNotification(inName: String): ModelMBeanNotificationInfo = ???

    /** Returns the list of the notifications emitted by the MBean. */
    @stub
    def getNotifications(): Array[MBeanNotificationInfo] = ???

    /** Returns a ModelMBeanOperationInfo requested by name. */
    @stub
    def getOperation(inName: String): ModelMBeanOperationInfo = ???

    /** Returns the list of operations  of the MBean. */
    @stub
    def getOperations(): Array[MBeanOperationInfo] = ???

    /** Sets descriptors in the info array of type inDescriptorType
     *  for the ModelMBean.
     */
    @stub
    def setDescriptor(inDescriptor: Descriptor, inDescriptorType: String): Unit = ???

    /** Adds or replaces descriptors in the ModelMBeanInfo. */
    @stub
    def setDescriptors(inDescriptors: Array[Descriptor]): Unit = ???

    /** Sets the ModelMBean's descriptor. */
    @stub
    def setMBeanDescriptor(inDescriptor: Descriptor): Unit = ???
}
