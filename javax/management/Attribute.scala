package javax.management

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Represents an MBean attribute by associating its name with its value.
 *  The MBean server and other objects use this class to get and set attributes values.
 */
class Attribute extends Object with Serializable {

    /** Constructs an Attribute object which associates the given attribute name with the given value. */
    @stub
    def this(name: String, value: Object) = ???

    /** Compares the current Attribute Object with another Attribute Object. */
    @stub
    def equals(object: Object): Boolean = ???

    /** Returns a String containing the  name of the attribute. */
    @stub
    def getName(): String = ???

    /** Returns an Object that is the value of this attribute. */
    @stub
    def getValue(): Object = ???

    /** Returns a hash code value for this attribute. */
    @stub
    def hashCode(): Int = ???

    /** Returns a String object representing this Attribute's value. */
    @stub
    def toString(): String = ???
}
