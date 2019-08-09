package javax.management.modelmbean

import java.lang.{Object, String}
import javax.management.{Descriptor, MBeanInfo}
import scala.scalanative.annotation.stub

/** This class represents the meta data for ModelMBeans.  Descriptors have been
 *  added on the meta data objects.
 *  
 *  Java resources wishing to be manageable instantiate the ModelMBean using the
 *  MBeanServer's createMBean method.  The resource then sets the ModelMBeanInfo
 *  and Descriptors for the ModelMBean instance. The attributes and operations
 *  exposed via the ModelMBeanInfo for the ModelMBean are accessible
 *  from MBeans, connectors/adaptors like other MBeans. Through the Descriptors,
 *  values and methods in the managed application can be defined and mapped to
 *  attributes and operations of the ModelMBean.
 *  This mapping can be defined during development in a file or dynamically and
 *  programmatically at runtime.
 *  
 *  Every ModelMBean which is instantiated in the MBeanServer becomes manageable:
 *  its attributes and operations
 *  become remotely accessible through the connectors/adaptors connected to that
 *  MBeanServer.
 *  A Java object cannot be registered in the MBeanServer unless it is a JMX
 *  compliant MBean.
 *  By instantiating a ModelMBean, resources are guaranteed that the MBean is
 *  valid.
 * 
 *  MBeanException and RuntimeOperationsException must be thrown on every public
 *  method.  This allows for wrapping exceptions from distributed
 *  communications (RMI, EJB, etc.)
 * 
 *  The serialVersionUID of this class is
 *  -1935722590756516193L.
 */
class ModelMBeanInfoSupport extends MBeanInfo with ModelMBeanInfo {

    /** Constructs a ModelMBeanInfoSupport which is a duplicate of the given
     *  ModelMBeanInfo.
     */
    @stub
    def this(mbi: ModelMBeanInfo) = ???

    /** Creates a ModelMBeanInfoSupport with the provided information,
     *  but the descriptor is a default.
     */
    @stub
    def this(className: String, description: String, attributes: Array[ModelMBeanAttributeInfo], constructors: Array[ModelMBeanConstructorInfo], operations: Array[ModelMBeanOperationInfo], notifications: Array[ModelMBeanNotificationInfo]) = ???

    /** Creates a ModelMBeanInfoSupport with the provided information
     *  and the descriptor given in parameter.
     */
    @stub
    def this(className: String, description: String, attributes: Array[ModelMBeanAttributeInfo], constructors: Array[ModelMBeanConstructorInfo], operations: Array[ModelMBeanOperationInfo], notifications: Array[ModelMBeanNotificationInfo], mbeandescriptor: Descriptor) = ???

    /** Returns a shallow clone of this instance. */
    @stub
    def clone(): Object = ???

    /** Returns a ModelMBeanAttributeInfo requested by name. */
    @stub
    def getAttribute(inName: String): ModelMBeanAttributeInfo = ???

    /** Returns the ModelMBeanConstructorInfo requested by name. */
    @stub
    def getConstructor(inName: String): ModelMBeanConstructorInfo = ???

    /** Get the descriptor of this MBeanInfo. */
    @stub
    def getDescriptor(): Descriptor = ???

    /** Returns a Descriptor requested by name. */
    @stub
    def getDescriptor(inDescriptorName: String): Descriptor = ???

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

    /** Returns a ModelMBeanOperationInfo requested by name. */
    @stub
    def getOperation(inName: String): ModelMBeanOperationInfo = ???

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
    def setMBeanDescriptor(inMBeanDescriptor: Descriptor): Unit = ???
}
