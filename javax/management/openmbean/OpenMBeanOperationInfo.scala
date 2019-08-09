package javax.management.openmbean

import java.lang.{Object, String}
import javax.management.MBeanParameterInfo
import scala.scalanative.annotation.stub

/** Describes an operation of an Open MBean.
 * 
 *  This interface declares the same methods as the class MBeanOperationInfo.  A class implementing this
 *  interface (typically OpenMBeanOperationInfoSupport) should
 *  extend MBeanOperationInfo.
 * 
 *  The getSignature() method should return at runtime an
 *  array of instances of a subclass of MBeanParameterInfo
 *  which implements the OpenMBeanParameterInfo interface
 *  (typically OpenMBeanParameterInfoSupport).
 */
trait OpenMBeanOperationInfo {

    /** Compares the specified obj parameter with this OpenMBeanOperationInfo instance for equality. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns a human readable description of the operation
     *  described by this OpenMBeanOperationInfo instance.
     */
    @stub
    def getDescription(): String = ???

    /** Returns an int constant qualifying the impact of the
     *  operation described by this OpenMBeanOperationInfo
     *  instance.
     */
    @stub
    def getImpact(): Int = ???

    /** Returns the name of the operation
     *  described by this OpenMBeanOperationInfo instance.
     */
    @stub
    def getName(): String = ???

    /** Returns the open type of the values returned by the
     *  operation described by this OpenMBeanOperationInfo
     *  instance.
     */
    @stub
    def getReturnOpenType(): OpenType[_] = ???

    /** Returns the fully qualified Java class name of the values
     *  returned by the operation described by this
     *  OpenMBeanOperationInfo instance.
     */
    @stub
    def getReturnType(): String = ???

    /** Returns an array of OpenMBeanParameterInfo instances
     *  describing each parameter in the signature of the operation
     *  described by this OpenMBeanOperationInfo instance.
     */
    @stub
    def getSignature(): Array[MBeanParameterInfo] = ???

    /** Returns the hash code value for this OpenMBeanOperationInfo instance. */
    @stub
    def hashCode(): Int = ???

    /** Returns a string representation of this OpenMBeanOperationInfo instance. */
    @stub
    def toString(): String = ???
}
