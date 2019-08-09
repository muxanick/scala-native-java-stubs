package javax.management

import java.lang.{Cloneable, Object, String}
import java.lang.reflect.Method

// Describes an MBean attribute exposed for management.  Instances of
// this class are immutable.  Subclasses may be mutable but this is
// not recommended.
class MBeanAttributeInfo extends MBeanFeatureInfo with Cloneable {

    @stub
    // This constructor takes the name of a simple attribute, and Method
    // objects for reading and writing the attribute.
    def this(name: String, description: String, getter: Method, setter: Method) = ???

    @stub
    // Constructs an MBeanAttributeInfo object.
    def this(name: String, type: String, description: String, isReadable: Boolean, isWritable: Boolean, isIs: Boolean) = ???

    @stub
    // Returns a shallow clone of this instance.
    def clone(): Object = ???

    @stub
    // Compare this MBeanAttributeInfo to another.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns the class name of the attribute.
    def getType(): String = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???

    @stub
    // Indicates if this attribute has an "is" getter.
    def isIs(): Boolean = ???

    @stub
    // Whether the value of the attribute can be read.
    def isReadable(): Boolean = ???

    @stub
    // Whether new values can be written to the attribute.
    def isWritable(): Boolean = ???
}
