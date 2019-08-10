package javax.management

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Used to represent the object name of an MBean and its class name.
 *  If the MBean is a Dynamic MBean the class name should be retrieved from
 *  the MBeanInfo it provides.
 */
class ObjectInstance extends Object with Serializable {

    /** Allows an object instance to be created given an object name and
     *  the full class name, including the package name.
     */
    @stub
    def this(objectName: ObjectName, className: String) = ???

    /** Allows an object instance to be created given a string representation of
     *  an object name and the full class name, including the package name.
     */
    @stub
    def this(objectName: String, className: String) = ???

    /** Compares the current object instance with another object instance. */
    @stub
    def equals(object: Any): Boolean = ???

    /** Returns the class part. */
    @stub
    def getClassName(): String = ???

    /** Returns the object name part. */
    @stub
    def getObjectName(): ObjectName = ???

    /** Returns a hash code value for the object. */
    @stub
    def hashCode(): Int = ???

    /** Returns a string representing this ObjectInstance object. */
    @stub
    def toString(): String = ???
}
