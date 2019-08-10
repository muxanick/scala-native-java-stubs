package javax.management

import java.lang.{Cloneable, Object, String}
import scala.scalanative.annotation.stub

/** Describes an argument of an operation exposed by an MBean.
 *  Instances of this class are immutable.  Subclasses may be mutable
 *  but this is not recommended.
 */
class MBeanParameterInfo extends MBeanFeatureInfo with Cloneable {

    /** Constructs an MBeanParameterInfo object. */
    @stub
    def this(name: String, type: String, description: String) = ???

    /** Constructs an MBeanParameterInfo object. */
    @stub
    def this(name: String, type: String, description: String, descriptor: Descriptor) = ???

    /** Returns a shallow clone of this instance. */
    @stub
    def clone(): Any = ???

    /** Compare this MBeanParameterInfo to another. */
    @stub
    def equals(o: Any): Boolean = ???

    /** Returns the type or class name of the data. */
    @stub
    def getType(): String = ???

    /** Returns a hash code value for the object. */
    @stub
    def hashCode(): Int = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???
}
