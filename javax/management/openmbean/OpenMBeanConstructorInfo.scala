package javax.management.openmbean

import java.lang.{Object, String}
import javax.management.MBeanParameterInfo

/** Describes a constructor of an Open MBean.
 * 
 *  This interface declares the same methods as the class MBeanConstructorInfo.  A class implementing this
 *  interface (typically OpenMBeanConstructorInfoSupport)
 *  should extend MBeanConstructorInfo.
 * 
 *  The getSignature() method should return at runtime an
 *  array of instances of a subclass of MBeanParameterInfo
 *  which implements the OpenMBeanParameterInfo interface
 *  (typically OpenMBeanParameterInfoSupport).
 */
trait OpenMBeanConstructorInfo {

    /** Compares the specified obj parameter with this OpenMBeanConstructorInfo instance for equality. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns a human readable description of the constructor
     *  described by this OpenMBeanConstructorInfo instance.
     */
    @stub
    def getDescription(): String = ???

    /** Returns the name of the constructor
     *  described by this OpenMBeanConstructorInfo instance.
     */
    @stub
    def getName(): String = ???

    /** Returns an array of OpenMBeanParameterInfo instances
     *  describing each parameter in the signature of the constructor
     *  described by this OpenMBeanConstructorInfo instance.
     */
    @stub
    def getSignature(): Array[MBeanParameterInfo] = ???

    /** Returns the hash code value for this OpenMBeanConstructorInfo instance. */
    @stub
    def hashCode(): Int = ???
}
