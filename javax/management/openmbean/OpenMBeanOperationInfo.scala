package javax.management.openmbean

import java.lang.{Object, String}
import javax.management.MBeanParameterInfo

// Describes an operation of an Open MBean.
//
// This interface declares the same methods as the class MBeanOperationInfo.  A class implementing this
// interface (typically OpenMBeanOperationInfoSupport) should
// extend MBeanOperationInfo.
//
// The getSignature() method should return at runtime an
// array of instances of a subclass of MBeanParameterInfo
// which implements the OpenMBeanParameterInfo interface
// (typically OpenMBeanParameterInfoSupport).
trait OpenMBeanOperationInfo {

    @stub
    // Compares the specified obj parameter with this OpenMBeanOperationInfo instance for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns a human readable description of the operation
    // described by this OpenMBeanOperationInfo instance.
    def getDescription(): String = ???

    @stub
    // Returns an int constant qualifying the impact of the
    // operation described by this OpenMBeanOperationInfo
    // instance.
    def getImpact(): Int = ???

    @stub
    // Returns the name of the operation
    // described by this OpenMBeanOperationInfo instance.
    def getName(): String = ???

    @stub
    // Returns the open type of the values returned by the
    // operation described by this OpenMBeanOperationInfo
    // instance.
    def getReturnOpenType(): OpenType[_] = ???

    @stub
    // Returns the fully qualified Java class name of the values
    // returned by the operation described by this
    // OpenMBeanOperationInfo instance.
    def getReturnType(): String = ???

    @stub
    // Returns an array of OpenMBeanParameterInfo instances
    // describing each parameter in the signature of the operation
    // described by this OpenMBeanOperationInfo instance.
    def getSignature(): Array[MBeanParameterInfo] = ???

    @stub
    // Returns the hash code value for this OpenMBeanOperationInfo instance.
    def hashCode(): Int = ???
}
