package javax.management.openmbean

import java.lang.{Object, String}
import javax.management.{MBeanAttributeInfo, MBeanConstructorInfo, MBeanNotificationInfo, MBeanOperationInfo}

// Describes an Open MBean: an Open MBean is recognized as such if
// its getMBeanInfo() method returns an instance of a class which
// implements the OpenMBeanInfo interface, typically OpenMBeanInfoSupport.
//
// This interface declares the same methods as the class MBeanInfo.  A class implementing this interface
// (typically OpenMBeanInfoSupport) should extend MBeanInfo.
//
// The getAttributes(), getOperations() and
// getConstructors() methods of the implementing class should
// return at runtime an array of instances of a subclass of MBeanAttributeInfo, MBeanOperationInfo or MBeanConstructorInfo respectively which implement the OpenMBeanAttributeInfo, OpenMBeanOperationInfo or OpenMBeanConstructorInfo interface respectively.
trait OpenMBeanInfo {

    @stub
    // Compares the specified obj parameter with this OpenMBeanInfo instance for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns an array of OpenMBeanAttributeInfo instances
    // describing each attribute in the open MBean described by this
    // OpenMBeanInfo instance.
    def getAttributes(): Array[MBeanAttributeInfo] = ???

    @stub
    // Returns the fully qualified Java class name of the open MBean
    // instances this OpenMBeanInfo describes.
    def getClassName(): String = ???

    @stub
    // Returns an array of OpenMBeanConstructorInfo instances
    // describing each constructor in the open MBean described by this
    // OpenMBeanInfo instance.
    def getConstructors(): Array[MBeanConstructorInfo] = ???

    @stub
    // Returns a human readable description of the type of open MBean
    // instances this OpenMBeanInfo describes.
    def getDescription(): String = ???

    @stub
    // Returns an array of MBeanNotificationInfo instances
    // describing each notification emitted by the open MBean
    // described by this OpenMBeanInfo instance.
    def getNotifications(): Array[MBeanNotificationInfo] = ???

    @stub
    // Returns an array of OpenMBeanOperationInfo instances
    // describing each operation in the open MBean described by this
    // OpenMBeanInfo instance.
    def getOperations(): Array[MBeanOperationInfo] = ???

    @stub
    // Returns the hash code value for this OpenMBeanInfo instance.
    def hashCode(): Int = ???
}
