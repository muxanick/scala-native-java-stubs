package javax.management.openmbean

import java.lang.{Object, String}
import javax.management.{Descriptor, MBeanInfo, MBeanNotificationInfo}
import scala.scalanative.annotation.stub

/** The OpenMBeanInfoSupport class describes the management
 *  information of an open MBean: it is a subclass of MBeanInfo, and it implements the OpenMBeanInfo interface.  Note that an open MBean is
 *  recognized as such if its getMBeanInfo() method returns an
 *  instance of a class which implements the OpenMBeanInfo interface,
 *  typically OpenMBeanInfoSupport.
 */
class OpenMBeanInfoSupport extends MBeanInfo with OpenMBeanInfo {

    /** Constructs an OpenMBeanInfoSupport instance, which
     *  describes a class of open MBeans with the specified className, description, openAttributes, openConstructors , openOperations and notifications.
     */
    @stub
    def this(className: String, description: String, openAttributes: Array[OpenMBeanAttributeInfo], openConstructors: Array[OpenMBeanConstructorInfo], openOperations: Array[OpenMBeanOperationInfo], notifications: Array[MBeanNotificationInfo]) = ???

    /** Constructs an OpenMBeanInfoSupport instance, which
     *  describes a class of open MBeans with the specified className, description, openAttributes, openConstructors , openOperations, notifications, and descriptor.
     */
    @stub
    def this(className: String, description: String, openAttributes: Array[OpenMBeanAttributeInfo], openConstructors: Array[OpenMBeanConstructorInfo], openOperations: Array[OpenMBeanOperationInfo], notifications: Array[MBeanNotificationInfo], descriptor: Descriptor) = ???

    /** Compares the specified obj parameter with this
     *  OpenMBeanInfoSupport instance for equality.
     */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the hash code value for this OpenMBeanInfoSupport instance. */
    @stub
    def hashCode(): Int = ???

    /** Returns a string representation of this OpenMBeanInfoSupport instance. */
    @stub
    def toString(): String = ???
}
