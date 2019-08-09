package javax.management.openmbean

import java.lang.{Object, String}
import javax.management.{MBeanConstructorInfo, MBeanFeatureInfo}

// Describes a constructor of an Open MBean.
class OpenMBeanConstructorInfoSupport extends MBeanConstructorInfo with OpenMBeanConstructorInfo {

    @stub
    // Constructs an OpenMBeanConstructorInfoSupport
    // instance, which describes the constructor of a class of open
    // MBeans with the specified name, description and
    // signature.
    def this(name: String, description: String, signature: Array[OpenMBeanParameterInfo]) = ???

    @stub
    // Compares the specified obj parameter with this
    // OpenMBeanConstructorInfoSupport instance for
    // equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the hash code value for this OpenMBeanConstructorInfoSupport instance.
    def hashCode(): Int = ???
}
