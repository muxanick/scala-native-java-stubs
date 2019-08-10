package javax.management.modelmbean

import java.lang.{Object, String}
import javax.management.Descriptor
import scala.scalanative.annotation.stub

/** This class represents the metadata set for a ModelMBean element.  A
 *  descriptor is part of the ModelMBeanInfo,
 *  ModelMBeanNotificationInfo, ModelMBeanAttributeInfo,
 *  ModelMBeanConstructorInfo, and ModelMBeanParameterInfo.
 *  
 *  A descriptor consists of a collection of fields.  Each field is in
 *  fieldname=fieldvalue format.  Field names are not case sensitive,
 *  case will be preserved on field values.
 *  
 *  All field names and values are not predefined. New fields can be
 *  defined and added by any program.  Some fields have been predefined
 *  for consistency of implementation and support by the
 *  ModelMBeanInfo, ModelMBeanAttributeInfo, ModelMBeanConstructorInfo,
 *  ModelMBeanNotificationInfo, ModelMBeanOperationInfo and ModelMBean
 *  classes.
 * 
 *  The serialVersionUID of this class is -6292969195866300415L.
 */
class DescriptorSupport extends Object with Descriptor {

    /** Descriptor default constructor. */
    @stub
    def this() = ???

    /** Descriptor constructor taking a Descriptor as parameter. */
    @stub
    def this(inDescr: DescriptorSupport) = ???

    /** Descriptor constructor. */
    @stub
    def this(initNumFields: Int) = ???

    /** Constructor taking fields in the fieldName=fieldValue
     *  format.
     */
    @stub
    def this(fields: String*) = ???

    /** Descriptor constructor taking an XML String. */
    @stub
    def this(inStr: String) = ???

    /** Constructor taking field names and field values. */
    @stub
    def this(fieldNames: Array[String], fieldValues: Array[Object]) = ???

    /** Returns a new Descriptor which is a duplicate of the Descriptor. */
    @stub
    def clone(): Any = ???

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

    /** Sets the value for a specific field name. */
    @stub
    def setField(fieldName: String, fieldValue: Any): Unit = ???

    /** Sets all fields in the field names array to the new value with
     *  the same index in the field values array.
     */
    @stub
    def setFields(fieldNames: Array[String], fieldValues: Array[Object]): Unit = ???

    /** Returns a human readable string representing the
     *  descriptor.
     */
    @stub
    def toString(): String = ???

    /** Returns an XML String representing the descriptor. */
    @stub
    def toXMLString(): String = ???
}
