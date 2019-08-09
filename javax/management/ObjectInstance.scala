package javax.management

import java.io.Serializable
import java.lang.{Object, String}

// Used to represent the object name of an MBean and its class name.
// If the MBean is a Dynamic MBean the class name should be retrieved from
// the MBeanInfo it provides.
class ObjectInstance extends Object with Serializable {

    @stub
    // Allows an object instance to be created given an object name and
    // the full class name, including the package name.
    def this(objectName: ObjectName, className: String) = ???

    @stub
    // Compares the current object instance with another object instance.
    def equals(object: Object): Boolean = ???

    @stub
    // Returns the class part.
    def getClassName(): String = ???

    @stub
    // Returns the object name part.
    def getObjectName(): ObjectName = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???
}
