package javax.management.openmbean

import java.lang.{Object, String}
import javax.management.{MBeanFeatureInfo, MBeanOperationInfo}

/** Describes an operation of an Open MBean. */
class OpenMBeanOperationInfoSupport extends MBeanOperationInfo with OpenMBeanOperationInfo {

    /** Constructs an OpenMBeanOperationInfoSupport
     *  instance, which describes the operation of a class of open
     *  MBeans, with the specified name, description,
     *  signature, returnOpenType and impact.
     */
    @stub
    def this(name: String, description: String, signature: Array[OpenMBeanParameterInfo], returnOpenType: OpenType[_], impact: Int) = ???

    /** Compares the specified obj parameter with this
     *  OpenMBeanOperationInfoSupport instance for
     *  equality.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the open type of the values returned by the
     *  operation described by this OpenMBeanOperationInfo
     *  instance.
     */
    @stub
    def getReturnOpenType(): OpenType[_] = ???

    /** Returns the hash code value for this OpenMBeanOperationInfoSupport instance. */
    @stub
    def hashCode(): Int = ???
}
