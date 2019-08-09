package javax.management.openmbean

import java.lang.{Object, String}
import javax.management.{MBeanConstructorInfo, MBeanFeatureInfo}

/** Describes a constructor of an Open MBean. */
class OpenMBeanConstructorInfoSupport extends MBeanConstructorInfo with OpenMBeanConstructorInfo {

    /** Constructs an OpenMBeanConstructorInfoSupport
     *  instance, which describes the constructor of a class of open
     *  MBeans with the specified name, description and
     *  signature.
     */
    @stub
    def this(name: String, description: String, signature: Array[OpenMBeanParameterInfo]) = ???

    /** Compares the specified obj parameter with this
     *  OpenMBeanConstructorInfoSupport instance for
     *  equality.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the hash code value for this OpenMBeanConstructorInfoSupport instance. */
    @stub
    def hashCode(): Int = ???
}
