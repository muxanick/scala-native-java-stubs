package javax.management

import java.lang.{Cloneable, Object, String}
import java.lang.reflect.Method

/** Describes a management operation exposed by an MBean.  Instances of
 *  this class are immutable.  Subclasses may be mutable but this is
 *  not recommended.
 */
class MBeanOperationInfo extends MBeanFeatureInfo with Cloneable {

    /** Constructs an MBeanOperationInfo object. */
    @stub
    def this(description: String, method: Method) = ???

    /** Constructs an MBeanOperationInfo object. */
    @stub
    def this(name: String, description: String, signature: Array[MBeanParameterInfo], type: String, impact: Int) = ???

    /** Returns a shallow clone of this instance. */
    @stub
    def clone(): Object = ???

    /** Compare this MBeanOperationInfo to another. */
    @stub
    def equals(o: Object): Boolean = ???

    /** Returns the impact of the method, one of
     *  INFO, ACTION, ACTION_INFO, UNKNOWN.
     */
    @stub
    def getImpact(): Int = ???

    /** Returns the type of the method's return value. */
    @stub
    def getReturnType(): String = ???

    /** Returns the list of parameters for this operation. */
    @stub
    def getSignature(): Array[MBeanParameterInfo] = ???

    /** Returns a hash code value for the object. */
    @stub
    def hashCode(): Int = ???
}

object MBeanOperationInfo {
    /** Indicates that the operation is write-like: it has an effect but does
     *  not return any information from the MBean.
     */
    @stub
    val ACTION: Int = ???

    /** Indicates that the operation is both read-like and write-like:
     *  it has an effect, and it also returns information from the MBean.
     */
    @stub
    val ACTION_INFO: Int = ???

    /** Indicates that the operation is read-like:
     *  it returns information but does not change any state.
     */
    @stub
    val INFO: Int = ???
}
