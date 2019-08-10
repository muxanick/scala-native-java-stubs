package javax.management

import java.lang.{Object, String}
import java.util.Map
import scala.scalanative.annotation.stub

/** An immutable descriptor. */
class ImmutableDescriptor extends Object with Descriptor {

    /** Construct a descriptor where the names and values of the fields
     *  are the keys and values of the given Map.
     */
    @stub
    def this(fields: Map[String, _]) = ???

    /** Construct a descriptor containing the given fields. */
    @stub
    def this(fields: String*) = ???

    /** Construct a descriptor containing the given fields and values. */
    @stub
    def this(fieldNames: Array[String], fieldValues: Array[Object]) = ???

    /** Returns a descriptor which is equal to this descriptor. */
    @stub
    def clone(): Descriptor = ???

    /** Compares this descriptor to the given object. */
    @stub
    def equals(o: Any): Boolean = ???

    /** Returns all the field names in the descriptor. */
    @stub
    def getFieldNames(): Array[String] = ???

    /** Returns all of the fields contained in this descriptor as a string array. */
    @stub
    def getFields(): Array[String] = ???

    /** Returns the value for a specific field name, or null if no value
     *  is present for that name.
     */
    @stub
    def getFieldValue(fieldName: String): Any = ???

    /** Returns all the field values in the descriptor as an array of Objects. */
    @stub
    def getFieldValues(fieldNames: String*): Array[Object] = ???

    /** Returns the hash code value for this descriptor. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if all of the fields have legal values given their
     *  names.
     */
    @stub
    def isValid(): Boolean = ???

    /** Removes a field from the descriptor. */
    @stub
    def removeField(fieldName: String): Unit = ???

    /** This operation is unsupported since this class is immutable. */
    @stub
    def setField(fieldName: String, fieldValue: Any): Unit = ???

    /** This operation is unsupported since this class is immutable. */
    @stub
    def setFields(fieldNames: Array[String], fieldValues: Array[Object]): Unit = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???
}

object ImmutableDescriptor {
    /** An empty descriptor. */
    @stub
    val EMPTY_DESCRIPTOR: ImmutableDescriptor = ???

    /** Return an ImmutableDescriptor whose contents are the union of
     *  the given descriptors.
     */
    @stub
    def union(descriptors: Descriptor*): ImmutableDescriptor = ???
}
