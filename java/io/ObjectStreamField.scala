package java.io

import java.lang.{Class, Comparable, Object, String}

// A description of a Serializable field from a Serializable class.  An array
// of ObjectStreamFields is used to declare the Serializable fields of a class.
class ObjectStreamField extends Object with Comparable[Object] {

    @stub
    // Create a Serializable field with the specified type.
    def this(name: String, type: Class[_]) = ???

    @stub
    // Compare this field with another ObjectStreamField.
    def compareTo(obj: Object): Int = ???

    @stub
    // Get the name of this field.
    def getName(): String = ???

    @stub
    // Offset of field within instance data.
    def getOffset(): Int = ???

    @stub
    // Get the type of the field.
    def getType(): Class[_] = ???

    @stub
    // Returns character encoding of field type.
    def getTypeCode(): Char = ???

    @stub
    // Return the JVM type signature.
    def getTypeString(): String = ???

    @stub
    // Return true if this field has a primitive type.
    def isPrimitive(): Boolean = ???

    @stub
    // Returns boolean value indicating whether or not the serializable field
    // represented by this ObjectStreamField instance is unshared.
    def isUnshared(): Boolean = ???

    @stub
    // Offset within instance data.
    protected def setOffset(offset: Int): Unit = ???
}
