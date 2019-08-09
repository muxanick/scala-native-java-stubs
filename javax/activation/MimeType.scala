package javax.activation

import java.io.{Externalizable, ObjectInput}
import java.lang.{Object, String}

// A Multipurpose Internet Mail Extension (MIME) type, as defined
// in RFC 2045 and 2046.
class MimeType extends Object with Externalizable {

    @stub
    // Default constructor.
    def this() = ???

    @stub
    // Constructor that builds a MimeType from a String.
    def this(rawdata: String) = ???

    @stub
    // Return a String representation of this object
    // without the parameter list.
    def getBaseType(): String = ???

    @stub
    // Retrieve the value associated with the given name, or null if there
    // is no current association.
    def getParameter(name: String): String = ???

    @stub
    // Retrieve this object's parameter list.
    def getParameters(): MimeTypeParameterList = ???

    @stub
    // Retrieve the primary type of this object.
    def getPrimaryType(): String = ???

    @stub
    // Retrieve the subtype of this object.
    def getSubType(): String = ???

    @stub
    // Determine if the primary and sub type of this object is
    // the same as what is in the given type.
    def match(type: MimeType): Boolean = ???

    @stub
    // Determine if the primary and sub type of this object is
    // the same as the content type described in rawdata.
    def match(rawdata: String): Boolean = ???

    @stub
    // The object implements the readExternal method to restore its
    // contents by calling the methods of DataInput for primitive
    // types and readObject for objects, strings and arrays.
    def readExternal(in: ObjectInput): Unit = ???

    @stub
    // Remove any value associated with the given name.
    def removeParameter(name: String): Unit = ???

    @stub
    // Set the value to be associated with the given name, replacing
    // any previous association.
    def setParameter(name: String, value: String): Unit = ???

    @stub
    // Set the primary type for this object to the given String.
    def setPrimaryType(primary: String): Unit = ???

    @stub
    // Set the subtype for this object to the given String.
    def setSubType(sub: String): Unit = ???

    @stub
    // Return the String representation of this object.
    def toString(): String = ???
}
