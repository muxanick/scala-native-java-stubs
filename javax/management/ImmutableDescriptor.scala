package javax.management

import java.lang.{Object, String}
import java.util.Map

// An immutable descriptor.
class ImmutableDescriptor extends Object with Descriptor {

    @stub
    // Construct a descriptor where the names and values of the fields
    // are the keys and values of the given Map.
    def this(fields: Map[String, _]) = ???

    @stub
    // Construct a descriptor containing the given fields.
    def this(fields: String*) = ???

    @stub
    // Returns a descriptor which is equal to this descriptor.
    def clone(): Descriptor = ???

    @stub
    // Compares this descriptor to the given object.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns all the field names in the descriptor.
    def getFieldNames(): Array[String] = ???

    @stub
    // Returns all of the fields contained in this descriptor as a string array.
    def getFields(): Array[String] = ???

    @stub
    // Returns the value for a specific field name, or null if no value
    // is present for that name.
    def getFieldValue(fieldName: String): Object = ???

    @stub
    // Returns all the field values in the descriptor as an array of Objects.
    def getFieldValues(fieldNames: String*): Array[Object] = ???

    @stub
    // Returns the hash code value for this descriptor.
    def hashCode(): Int = ???

    @stub
    // Returns true if all of the fields have legal values given their
    // names.
    def isValid(): Boolean = ???

    @stub
    // Removes a field from the descriptor.
    def removeField(fieldName: String): Unit = ???

    @stub
    // This operation is unsupported since this class is immutable.
    def setField(fieldName: String, fieldValue: Object): Unit = ???

    @stub
    // This operation is unsupported since this class is immutable.
    def setFields(fieldNames: Array[String], fieldValues: Array[Object]): Unit = ???

    @stub
    // Returns a string representation of the object.
    def toString(): String = ???
}
