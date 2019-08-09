package javax.management.openmbean

import java.lang.{Object, String}
import javax.management.{MBeanFeatureInfo, MBeanOperationInfo}

// Describes an operation of an Open MBean.
class OpenMBeanOperationInfoSupport extends MBeanOperationInfo with OpenMBeanOperationInfo {

    @stub
    // Constructs an OpenMBeanOperationInfoSupport
    // instance, which describes the operation of a class of open
    // MBeans, with the specified name, description,
    // signature, returnOpenType and impact.
    def this(name: String, description: String, signature: Array[OpenMBeanParameterInfo], returnOpenType: OpenType[_], impact: Int) = ???

    @stub
    // Compares the specified obj parameter with this
    // OpenMBeanOperationInfoSupport instance for
    // equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the open type of the values returned by the
    // operation described by this OpenMBeanOperationInfo
    // instance.
    def getReturnOpenType(): OpenType[_] = ???

    @stub
    // Returns the hash code value for this OpenMBeanOperationInfoSupport instance.
    def hashCode(): Int = ???
}
