package javax.imageio.metadata

import java.lang.{Class, Comparable, Object, String}
import java.util.Locale
import javax.imageio.ImageTypeSpecifier
import scala.scalanative.annotation.stub

/** An object describing the structure of metadata documents returned
 *  from IIOMetadata.getAsTree and passed to
 *  IIOMetadata.setFromTree and mergeTree.
 *  Document structures are described by a set of constraints on the
 *  type and number of child elements that may belong to a given parent
 *  element type, the names, types, and values of attributes that may
 *  belong to an element, and the type and values of
 *  Object reference that may be stored at a node.
 * 
 *   N.B: classes that implement this interface should contain a
 *  method declared as public static getInstance() which
 *  returns an instance of the class.  Commonly, an implementation will
 *  construct only a single instance and cache it for future
 *  invocations of getInstance.
 * 
 *   The structures that may be described by this class are a subset
 *  of those expressible using XML document type definitions (DTDs),
 *  with the addition of some basic information on the datatypes of
 *  attributes and the ability to store an Object
 *  reference within a node.  In the future, XML Schemas could be used
 *  to represent these structures, and many others.
 * 
 *   The differences between
 *  IIOMetadataFormat-described structures and DTDs are as
 *  follows:
 * 
 *  
 *   Elements may not contain text or mix text with embedded
 *  tags.
 * 
 *   The children of an element must conform to one of a few simple
 *  patterns, described in the documentation for the
 *  CHILD_* constants;
 * 
 *   The in-memory representation of an elements may contain a
 *  reference to an Object.  There is no provision for
 *  representing such objects textually.
 *  
 */
trait IIOMetadataFormat {

    /** Returns true if the element (and the subtree below
     *  it) is allowed to appear in a metadata document for an image of
     *  the given type, defined by an ImageTypeSpecifier.
     */
    @stub
    def canNodeAppear(elementName: String, imageType: ImageTypeSpecifier): Boolean = ???

    /** Returns one of the constants starting with
     *  DATATYPE_, indicating the format and
     *  interpretation of the value of the given attribute within the
     *  named element.
     */
    @stub
    def getAttributeDataType(elementName: String, attrName: String): Int = ???

    /** Returns the default value of the named attribute, if it is not
     *  explicitly present within the named element, as a
     *  String, or null if no default value
     *  is available.
     */
    @stub
    def getAttributeDefaultValue(elementName: String, attrName: String): String = ???

    /** Returns a String containing a description of the
     *  named attribute, or null.
     */
    @stub
    def getAttributeDescription(elementName: String, attrName: String, locale: Locale): String = ???

    /** Returns an array of Strings containing the legal
     *  enumerated values for the given attribute within the named
     *  element.
     */
    @stub
    def getAttributeEnumerations(elementName: String, attrName: String): Array[String] = ???

    /** Returns the maximum number of list items that may be used to
     *  define this attribute.
     */
    @stub
    def getAttributeListMaxLength(elementName: String, attrName: String): Int = ???

    /** Returns the minimum number of list items that may be used to
     *  define this attribute.
     */
    @stub
    def getAttributeListMinLength(elementName: String, attrName: String): Int = ???

    /** Returns the maximum legal value for the attribute. */
    @stub
    def getAttributeMaxValue(elementName: String, attrName: String): String = ???

    /** Returns the minimum legal value for the attribute. */
    @stub
    def getAttributeMinValue(elementName: String, attrName: String): String = ???

    /** Returns an array of Strings listing the names of
     *  the attributes that may be associated with the named element.
     */
    @stub
    def getAttributeNames(elementName: String): Array[String] = ???

    /** Returns one of the constants starting with VALUE_,
     *  indicating whether the values of the given attribute within the
     *  named element are arbitrary, constrained to lie within a
     *  specified range, constrained to be one of a set of enumerated
     *  values, or are a whitespace-separated list of arbitrary values.
     */
    @stub
    def getAttributeValueType(elementName: String, attrName: String): Int = ???

    /** Returns an array of Strings indicating the names
     *  of the element which are allowed to be children of the named
     *  element, in the order in which they should appear.
     */
    @stub
    def getChildNames(elementName: String): Array[String] = ???

    /** Returns one of the constants starting with
     *  CHILD_POLICY_, indicating the legal pattern of
     *  children for the named element.
     */
    @stub
    def getChildPolicy(elementName: String): Int = ???

    /** Returns a String containing a description of the
     *  named element, or null.
     */
    @stub
    def getElementDescription(elementName: String, locale: Locale): String = ???

    /** Returns the maximum number of children of the named element
     *  with child policy CHILD_POLICY_REPEAT.
     */
    @stub
    def getElementMaxChildren(elementName: String): Int = ???

    /** Returns the minimum number of children of the named element
     *  with child policy CHILD_POLICY_REPEAT.
     */
    @stub
    def getElementMinChildren(elementName: String): Int = ???

    /** Returns the maximum number of array elements that may be used
     *  to define the Object reference within the named
     *  element.
     */
    @stub
    def getObjectArrayMaxLength(elementName: String): Int = ???

    /** Returns the minimum number of array elements that may be used
     *  to define the Object reference within the named
     *  element.
     */
    @stub
    def getObjectArrayMinLength(elementName: String): Int = ???

    /** Returns the Class type of the Object
     *  reference stored within the element.
     */
    @stub
    def getObjectClass(elementName: String): Class[_] = ???

    /** Returns an Objects containing the default
     *  value for the Object reference within
     *  the named element.
     */
    @stub
    def getObjectDefaultValue(elementName: String): Any = ???

    /** Returns an array of Objects containing the legal
     *  enumerated values for the Object reference within
     *  the named element.
     */
    @stub
    def getObjectEnumerations(elementName: String): Array[Object] = ???

    /** Returns the maximum legal value for the Object
     *  reference within the named element.
     */
    @stub
    def getObjectMaxValue(elementName: String): Comparable[_] = ???

    /** Returns the minimum legal value for the Object
     *  reference within the named element.
     */
    @stub
    def getObjectMinValue(elementName: String): Comparable[_] = ???

    /** Returns one of the enumerated values starting with
     *  VALUE_, indicating the type of values
     *  (enumeration, range, or array) that are allowed for the
     *  Object reference.
     */
    @stub
    def getObjectValueType(elementName: String): Int = ???

    /** Returns the name of the root element of the format. */
    @stub
    def getRootName(): String = ???

    /** Returns true if the named attribute must be
     *  present within the named element.
     */
    @stub
    def isAttributeRequired(elementName: String, attrName: String): Boolean = ???
}

object IIOMetadataFormat {
    /** A constant returned by getChildPolicy to indicate
     *  that an element must have a single instance of each of its
     *  legal child elements, in order.
     */
    @stub
    val CHILD_POLICY_ALL: Int = ???

    /** A constant returned by getChildPolicy to indicate
     *  that an element must have zero or one children, selected from
     *  among its legal child elements.
     */
    @stub
    val CHILD_POLICY_CHOICE: Int = ???

    /** A constant returned by getChildPolicy to indicate
     *  that an element may not have any children.
     */
    @stub
    val CHILD_POLICY_EMPTY: Int = ???

    /** The largest valid CHILD_POLICY_* constant,
     *  to be used for range checks.
     */
    @stub
    val CHILD_POLICY_MAX: Int = ???

    /** A constant returned by getChildPolicy to indicate
     *  that an element must have zero or more instances of its unique
     *  legal child element.
     */
    @stub
    val CHILD_POLICY_REPEAT: Int = ???

    /** A constant returned by getChildPolicy to indicate
     *  that an element must have a sequence of instances of any of its
     *  legal child elements.
     */
    @stub
    val CHILD_POLICY_SEQUENCE: Int = ???

    /** A constant returned by getChildPolicy to indicate
     *  that an element must have zero or one instance of each of its
     *  legal child elements, in order.
     */
    @stub
    val CHILD_POLICY_SOME: Int = ???

    /** A constant returned by getAttributeDataType
     *  indicating that the value of an attribute is one of the boolean
     *  values 'true' or 'false'.
     */
    @stub
    val DATATYPE_BOOLEAN: Int = ???

    /** A constant returned by getAttributeDataType
     *  indicating that the value of an attribute is a string
     *  representation of a double-precision decimal floating-point
     *  number.
     */
    @stub
    val DATATYPE_DOUBLE: Int = ???

    /** A constant returned by getAttributeDataType
     *  indicating that the value of an attribute is a string
     *  representation of a decimal floating-point number.
     */
    @stub
    val DATATYPE_FLOAT: Int = ???

    /** A constant returned by getAttributeDataType
     *  indicating that the value of an attribute is a string
     *  representation of an integer.
     */
    @stub
    val DATATYPE_INTEGER: Int = ???

    /** A constant returned by getAttributeDataType
     *  indicating that the value of an attribute is a general Unicode
     *  string.
     */
    @stub
    val DATATYPE_STRING: Int = ???

    /** A constant returned by getAttributeValueType and
     *  getObjectValueType to indicate that the attribute
     *  or user object may be set a single, arbitrary value.
     */
    @stub
    val VALUE_ARBITRARY: Int = ???

    /** A constant returned by getAttributeValueType and
     *  getObjectValueType to indicate that the attribute
     *  or user object may be set one of a number of enumerated values.
     */
    @stub
    val VALUE_ENUMERATION: Int = ???

    /** A constant returned by getAttributeValueType and
     *  getObjectValueType to indicate that the attribute
     *  or user object may be set to a list or array of values.
     */
    @stub
    val VALUE_LIST: Int = ???

    /** A constant returned by getObjectValueType to
     *  indicate the absence of a user object.
     */
    @stub
    val VALUE_NONE: Int = ???

    /** A constant returned by getAttributeValueType and
     *  getObjectValueType to indicate that the attribute
     *  or user object may be set a range of values.
     */
    @stub
    val VALUE_RANGE: Int = ???

    /** A constant returned by getAttributeValueType and
     *  getObjectValueType to indicate that the attribute
     *  or user object may be set to a range of values.
     */
    @stub
    val VALUE_RANGE_MAX_INCLUSIVE: Int = ???

    /** A value that may be or'ed with VALUE_RANGE to
     *  obtain VALUE_RANGE_MAX_INCLUSIVE, and with
     *  VALUE_RANGE_MIN_INCLUSIVE to obtain
     *  VALUE_RANGE_MIN_MAX_INCLUSIVE.
     */
    @stub
    val VALUE_RANGE_MAX_INCLUSIVE_MASK: Int = ???

    /** A constant returned by getAttributeValueType and
     *  getObjectValueType to indicate that the attribute
     *  or user object may be set to a range of values.
     */
    @stub
    val VALUE_RANGE_MIN_INCLUSIVE: Int = ???

    /** A value that may be or'ed with VALUE_RANGE to
     *  obtain VALUE_RANGE_MIN_INCLUSIVE, and with
     *  VALUE_RANGE_MAX_INCLUSIVE to obtain
     *  VALUE_RANGE_MIN_MAX_INCLUSIVE.
     */
    @stub
    val VALUE_RANGE_MIN_INCLUSIVE_MASK: Int = ???

    /** A constant returned by getAttributeValueType and
     *  getObjectValueType to indicate that the attribute
     *  or user object may be set a range of values.
     */
    @stub
    val VALUE_RANGE_MIN_MAX_INCLUSIVE: Int = ???
}
