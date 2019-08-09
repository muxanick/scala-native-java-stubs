package javax.management

import java.lang.{Cloneable, Object, String}
import java.lang.reflect.Method

// Describes a management operation exposed by an MBean.  Instances of
// this class are immutable.  Subclasses may be mutable but this is
// not recommended.
class MBeanOperationInfo extends MBeanFeatureInfo with Cloneable {

    @stub
    // Constructs an MBeanOperationInfo object.
    def this(description: String, method: Method) = ???

    @stub
    // Constructs an MBeanOperationInfo object.
    def this(name: String, description: String, signature: Array[MBeanParameterInfo], type: String, impact: Int) = ???

    @stub
    // Returns a shallow clone of this instance.
    def clone(): Object = ???

    @stub
    // Compare this MBeanOperationInfo to another.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns the impact of the method, one of
    // INFO, ACTION, ACTION_INFO, UNKNOWN.
    def getImpact(): Int = ???

    @stub
    // Returns the type of the method's return value.
    def getReturnType(): String = ???

    @stub
    // Returns the list of parameters for this operation.
    def getSignature(): Array[MBeanParameterInfo] = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???
}

object MBeanOperationInfo {
    @stub
    // Indicates that the operation is write-like: it has an effect but does
    // not return any information from the MBean.
    def ACTION: Int = ???

    @stub
    // Indicates that the operation is both read-like and write-like:
    // it has an effect, and it also returns information from the MBean.
    def ACTION_INFO: Int = ???

    @stub
    // Indicates that the operation is read-like:
    // it returns information but does not change any state.
    def INFO: Int = ???
}
