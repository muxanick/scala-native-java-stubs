package javax.management.openmbean

import java.lang.Object

// Describes an attribute of an open MBean.
//
// This interface declares the same methods as the class MBeanAttributeInfo.  A class implementing this
// interface (typically OpenMBeanAttributeInfoSupport) should
// extend MBeanAttributeInfo.
trait OpenMBeanAttributeInfo extends OpenMBeanParameterInfo {

    @stub
    // Compares the specified obj parameter with this OpenMBeanAttributeInfo instance for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the hash code value for this OpenMBeanAttributeInfo instance.
    def hashCode(): Int = ???

    @stub
    // Returns true if the attribute described by this OpenMBeanAttributeInfo instance
    // is accessed through a isXXX getter (applies only to boolean and Boolean values),
    // false otherwise.
    def isIs(): Boolean = ???

    @stub
    // Returns true if the attribute described by this OpenMBeanAttributeInfo instance is readable,
    // false otherwise.
    def isReadable(): Boolean = ???

    @stub
    // Returns true if the attribute described by this OpenMBeanAttributeInfo instance is writable,
    // false otherwise.
    def isWritable(): Boolean = ???
}
