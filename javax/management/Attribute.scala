package javax.management

import java.io.Serializable
import java.lang.{Object, String}

// Represents an MBean attribute by associating its name with its value.
// The MBean server and other objects use this class to get and set attributes values.
class Attribute extends Object with Serializable {

    @stub
    // Compares the current Attribute Object with another Attribute Object.
    def equals(object: Object): Boolean = ???

    @stub
    // Returns a String containing the  name of the attribute.
    def getName(): String = ???

    @stub
    // Returns an Object that is the value of this attribute.
    def getValue(): Object = ???

    @stub
    // Returns a hash code value for this attribute.
    def hashCode(): Int = ???
}
