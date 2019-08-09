package java.io

import java.lang.{Class, Object, String}
import scala.scalanative.annotation.stub

/** Serialization's descriptor for classes.  It contains the name and
 *  serialVersionUID of the class.  The ObjectStreamClass for a specific class
 *  loaded in this Java VM can be found/created using the lookup method.
 * 
 *  The algorithm to compute the SerialVersionUID is described in
 *  Object
 *  Serialization Specification, Section 4.6, Stream Unique Identifiers.
 */
class ObjectStreamClass extends Object with Serializable {

    /** Return the class in the local VM that this version is mapped to. */
    @stub
    def forClass(): Class[_] = ???

    /** Get the field of this class by name. */
    @stub
    def getField(name: String): ObjectStreamField = ???

    /** Return an array of the fields of this serializable class. */
    @stub
    def getFields(): Array[ObjectStreamField] = ???

    /** Returns the name of the class described by this descriptor. */
    @stub
    def getName(): String = ???

    /** Return the serialVersionUID for this class. */
    @stub
    def getSerialVersionUID(): Long = ???

    /** Return a string describing this ObjectStreamClass. */
    @stub
    def toString(): String = ???
}

object ObjectStreamClass {
    /** serialPersistentFields value indicating no serializable fields */
    @stub
    val NO_FIELDS: Array[ObjectStreamField] = ???

    /** Find the descriptor for a class that can be serialized. */
    @stub
    def lookup(cl: Class[_]): ObjectStreamClass = ???

    /** Returns the descriptor for any class, regardless of whether it
     *  implements Serializable.
     */
    @stub
    def lookupAny(cl: Class[_]): ObjectStreamClass = ???
}
