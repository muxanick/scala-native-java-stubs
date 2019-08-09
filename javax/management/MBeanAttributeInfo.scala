package javax.management

import java.lang.{Cloneable, Object, String}
import java.lang.reflect.Method
import scala.scalanative.annotation.stub

/** Describes an MBean attribute exposed for management.  Instances of
 *  this class are immutable.  Subclasses may be mutable but this is
 *  not recommended.
 */
class MBeanAttributeInfo extends MBeanFeatureInfo with Cloneable {

    /** This constructor takes the name of a simple attribute, and Method
     *  objects for reading and writing the attribute.
     */
    @stub
    def this(name: String, description: String, getter: Method, setter: Method) = ???

    /** Constructs an MBeanAttributeInfo object. */
    @stub
    def this(name: String, type: String, description: String, isReadable: Boolean, isWritable: Boolean, isIs: Boolean) = ???

    /** Constructs an MBeanAttributeInfo object. */
    @stub
    def this(name: String, type: String, description: String, isReadable: Boolean, isWritable: Boolean, isIs: Boolean, descriptor: Descriptor) = ???

    /** Returns a shallow clone of this instance. */
    @stub
    def clone(): Object = ???

    /** Compare this MBeanAttributeInfo to another. */
    @stub
    def equals(o: Object): Boolean = ???

    /** Returns the class name of the attribute. */
    @stub
    def getType(): String = ???

    /** Returns a hash code value for the object. */
    @stub
    def hashCode(): Int = ???

    /** Indicates if this attribute has an "is" getter. */
    @stub
    def isIs(): Boolean = ???

    /** Whether the value of the attribute can be read. */
    @stub
    def isReadable(): Boolean = ???

    /** Whether new values can be written to the attribute. */
    @stub
    def isWritable(): Boolean = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???
}
