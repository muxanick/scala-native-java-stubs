package javax.management.modelmbean

import java.lang.{Object, String}
import javax.management.Descriptor

// This class represents the metadata set for a ModelMBean element.  A
// descriptor is part of the ModelMBeanInfo,
// ModelMBeanNotificationInfo, ModelMBeanAttributeInfo,
// ModelMBeanConstructorInfo, and ModelMBeanParameterInfo.
// 
// A descriptor consists of a collection of fields.  Each field is in
// fieldname=fieldvalue format.  Field names are not case sensitive,
// case will be preserved on field values.
// 
// All field names and values are not predefined. New fields can be
// defined and added by any program.  Some fields have been predefined
// for consistency of implementation and support by the
// ModelMBeanInfo, ModelMBeanAttributeInfo, ModelMBeanConstructorInfo,
// ModelMBeanNotificationInfo, ModelMBeanOperationInfo and ModelMBean
// classes.
//
// The serialVersionUID of this class is -6292969195866300415L.
class DescriptorSupport extends Object with Descriptor {

    @stub
    // Descriptor default constructor.
    def this() = ???

    @stub
    // Descriptor constructor taking a Descriptor as parameter.
    def this(inDescr: DescriptorSupport) = ???

    @stub
    // Descriptor constructor.
    def this(initNumFields: Int) = ???

    @stub
    // Constructor taking fields in the fieldName=fieldValue
    // format.
    def this(fields: String*) = ???

    @stub
    // Descriptor constructor taking an XML String.
    def this(inStr: String) = ???

    @stub
    // Returns a new Descriptor which is a duplicate of the Descriptor.
    def clone(): Object = ???

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
    // Sets the value for a specific field name.
    def setField(fieldName: String, fieldValue: Object): Unit = ???

    @stub
    // Sets all fields in the field names array to the new value with
    // the same index in the field values array.
    def setFields(fieldNames: Array[String], fieldValues: Array[Object]): Unit = ???

    @stub
    // Returns a human readable string representing the
    // descriptor.
    def toString(): String = ???
}
