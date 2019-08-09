package java.io

import java.lang.{Class, Comparable, Object, String}
import scala.scalanative.annotation.stub

/** A description of a Serializable field from a Serializable class.  An array
 *  of ObjectStreamFields is used to declare the Serializable fields of a class.
 */
class ObjectStreamField extends Object with Comparable[Object] {

    /** Create a Serializable field with the specified type. */
    @stub
    def this(name: String, type: Class[_]) = ???

    /** Creates an ObjectStreamField representing a serializable field with the
     *  given name and type.
     */
    @stub
    def this(name: String, type: Class[_], unshared: Boolean) = ???

    /** Compare this field with another ObjectStreamField. */
    @stub
    def compareTo(obj: Object): Int = ???

    /** Get the name of this field. */
    @stub
    def getName(): String = ???

    /** Offset of field within instance data. */
    @stub
    def getOffset(): Int = ???

    /** Get the type of the field. */
    @stub
    def getType(): Class[_] = ???

    /** Returns character encoding of field type. */
    @stub
    def getTypeCode(): Char = ???

    /** Return the JVM type signature. */
    @stub
    def getTypeString(): String = ???

    /** Return true if this field has a primitive type. */
    @stub
    def isPrimitive(): Boolean = ???

    /** Returns boolean value indicating whether or not the serializable field
     *  represented by this ObjectStreamField instance is unshared.
     */
    @stub
    def isUnshared(): Boolean = ???

    /** Offset within instance data. */
    @stub
    protected def setOffset(offset: Int): Unit = ???

    /** Return a string that describes this field. */
    @stub
    def toString(): String = ???
}
