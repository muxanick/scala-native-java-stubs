package java.io

import java.lang.{Class, Object, String}

// Serialization's descriptor for classes.  It contains the name and
// serialVersionUID of the class.  The ObjectStreamClass for a specific class
// loaded in this Java VM can be found/created using the lookup method.
//
// The algorithm to compute the SerialVersionUID is described in
// Object
// Serialization Specification, Section 4.6, Stream Unique Identifiers.
class ObjectStreamClass extends Object with Serializable {

    @stub
    // Return the class in the local VM that this version is mapped to.
    def forClass(): Class[_] = ???

    @stub
    // Get the field of this class by name.
    def getField(name: String): ObjectStreamField = ???

    @stub
    // Return an array of the fields of this serializable class.
    def getFields(): Array[ObjectStreamField] = ???

    @stub
    // Returns the name of the class described by this descriptor.
    def getName(): String = ???

    @stub
    // Return the serialVersionUID for this class.
    def getSerialVersionUID(): Long = ???
}

object ObjectStreamClass {
    @stub
    // Find the descriptor for a class that can be serialized.
    def lookup(cl: Class[_]): ObjectStreamClass = ???

    @stub
    // Returns the descriptor for any class, regardless of whether it
    // implements Serializable.
    def lookupAny(cl: Class[_]): ObjectStreamClass = ???
}
