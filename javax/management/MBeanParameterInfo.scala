package javax.management

import java.lang.{Cloneable, Object, String}

// Describes an argument of an operation exposed by an MBean.
// Instances of this class are immutable.  Subclasses may be mutable
// but this is not recommended.
class MBeanParameterInfo extends MBeanFeatureInfo with Cloneable {

    @stub
    // Constructs an MBeanParameterInfo object.
    def this(name: String, type: String, description: String) = ???

    @stub
    // Returns a shallow clone of this instance.
    def clone(): Object = ???

    @stub
    // Compare this MBeanParameterInfo to another.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns the type or class name of the data.
    def getType(): String = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???
}
