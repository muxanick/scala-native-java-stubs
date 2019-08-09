package javax.management

import scala.scalanative.annotation.stub

/** This interface is used to gain access to descriptors of the Descriptor class
 *  which are associated with a JMX component, i.e. MBean, MBeanInfo,
 *  MBeanAttributeInfo, MBeanNotificationInfo,
 *  MBeanOperationInfo, MBeanParameterInfo.
 *  
 *  ModelMBeans make extensive use of this interface in ModelMBeanInfo classes.
 */
trait DescriptorAccess extends DescriptorRead {

    /** Sets Descriptor (full replace). */
    @stub
    def setDescriptor(inDescriptor: Descriptor): Unit = ???
}
