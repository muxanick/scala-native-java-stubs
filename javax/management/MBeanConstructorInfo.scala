package javax.management

import java.lang.{Cloneable, Object, String}
import java.lang.reflect.Constructor
import scala.scalanative.annotation.stub

/** Describes a constructor exposed by an MBean.  Instances of this
 *  class are immutable.  Subclasses may be mutable but this is not
 *  recommended.
 */
class MBeanConstructorInfo extends MBeanFeatureInfo with Cloneable {

    /** Constructs an MBeanConstructorInfo object. */
    @stub
    def this(description: String, constructor: Constructor[_]) = ???

    /** Constructs an MBeanConstructorInfo object. */
    @stub
    def this(name: String, description: String, signature: Array[MBeanParameterInfo]) = ???

    /** Constructs an MBeanConstructorInfo object. */
    @stub
    def this(name: String, description: String, signature: Array[MBeanParameterInfo], descriptor: Descriptor) = ???

    /** Returns a shallow clone of this instance. */
    @stub
    def clone(): Any = ???

    /** Compare this MBeanConstructorInfo to another. */
    @stub
    def equals(o: Any): Boolean = ???

    /** Returns the list of parameters for this constructor. */
    @stub
    def getSignature(): Array[MBeanParameterInfo] = ???

    /** Returns a hash code value for the object. */
    @stub
    def hashCode(): Int = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???
}
