package javax.management

import java.lang.{Cloneable, Object, String}
import java.lang.reflect.Constructor

// Describes a constructor exposed by an MBean.  Instances of this
// class are immutable.  Subclasses may be mutable but this is not
// recommended.
class MBeanConstructorInfo extends MBeanFeatureInfo with Cloneable {

    @stub
    // Constructs an MBeanConstructorInfo object.
    def this(description: String, constructor: Constructor[_]) = ???

    @stub
    // Constructs an MBeanConstructorInfo object.
    def this(name: String, description: String, signature: Array[MBeanParameterInfo]) = ???

    @stub
    // Returns a shallow clone of this instance.
    def clone(): Object = ???

    @stub
    // Compare this MBeanConstructorInfo to another.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns the list of parameters for this constructor.
    def getSignature(): Array[MBeanParameterInfo] = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???
}
