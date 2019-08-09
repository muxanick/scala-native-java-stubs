package javax.imageio.metadata

import java.lang.{Class, Comparable, Object, String}
import java.util.Locale
import javax.imageio.ImageTypeSpecifier

// An object describing the structure of metadata documents returned
// from IIOMetadata.getAsTree and passed to
// IIOMetadata.setFromTree and mergeTree.
// Document structures are described by a set of constraints on the
// type and number of child elements that may belong to a given parent
// element type, the names, types, and values of attributes that may
// belong to an element, and the type and values of
// Object reference that may be stored at a node.
//
//  N.B: classes that implement this interface should contain a
// method declared as public static getInstance() which
// returns an instance of the class.  Commonly, an implementation will
// construct only a single instance and cache it for future
// invocations of getInstance.
//
//  The structures that may be described by this class are a subset
// of those expressible using XML document type definitions (DTDs),
// with the addition of some basic information on the datatypes of
// attributes and the ability to store an Object
// reference within a node.  In the future, XML Schemas could be used
// to represent these structures, and many others.
//
//  The differences between
// IIOMetadataFormat-described structures and DTDs are as
// follows:
//
// 
//  Elements may not contain text or mix text with embedded
// tags.
//
//  The children of an element must conform to one of a few simple
// patterns, described in the documentation for the
// CHILD_* constants;
//
//  The in-memory representation of an elements may contain a
// reference to an Object.  There is no provision for
// representing such objects textually.
// 
trait IIOMetadataFormat {

    @stub
    // Returns true if the element (and the subtree below
    // it) is allowed to appear in a metadata document for an image of
    // the given type, defined by an ImageTypeSpecifier.
    def canNodeAppear(elementName: String, imageType: ImageTypeSpecifier): Boolean = ???

    @stub
    // Returns one of the constants starting with
    // DATATYPE_, indicating the format and
    // interpretation of the value of the given attribute within the
    // named element.
    def getAttributeDataType(elementName: String, attrName: String): Int = ???

    @stub
    // Returns the default value of the named attribute, if it is not
    // explicitly present within the named element, as a
    // String, or null if no default value
    // is available.
    def getAttributeDefaultValue(elementName: String, attrName: String): String = ???

    @stub
    // Returns a String containing a description of the
    // named attribute, or null.
    def getAttributeDescription(elementName: String, attrName: String, locale: Locale): String = ???

    @stub
    // Returns an array of Strings containing the legal
    // enumerated values for the given attribute within the named
    // element.
    def getAttributeEnumerations(elementName: String, attrName: String): Array[String] = ???

    @stub
    // Returns the maximum number of list items that may be used to
    // define this attribute.
    def getAttributeListMaxLength(elementName: String, attrName: String): Int = ???

    @stub
    // Returns the minimum number of list items that may be used to
    // define this attribute.
    def getAttributeListMinLength(elementName: String, attrName: String): Int = ???

    @stub
    // Returns the maximum legal value for the attribute.
    def getAttributeMaxValue(elementName: String, attrName: String): String = ???

    @stub
    // Returns the minimum legal value for the attribute.
    def getAttributeMinValue(elementName: String, attrName: String): String = ???

    @stub
    // Returns an array of Strings listing the names of
    // the attributes that may be associated with the named element.
    def getAttributeNames(elementName: String): Array[String] = ???

    @stub
    // Returns one of the constants starting with VALUE_,
    // indicating whether the values of the given attribute within the
    // named element are arbitrary, constrained to lie within a
    // specified range, constrained to be one of a set of enumerated
    // values, or are a whitespace-separated list of arbitrary values.
    def getAttributeValueType(elementName: String, attrName: String): Int = ???

    @stub
    // Returns an array of Strings indicating the names
    // of the element which are allowed to be children of the named
    // element, in the order in which they should appear.
    def getChildNames(elementName: String): Array[String] = ???

    @stub
    // Returns one of the constants starting with
    // CHILD_POLICY_, indicating the legal pattern of
    // children for the named element.
    def getChildPolicy(elementName: String): Int = ???

    @stub
    // Returns a String containing a description of the
    // named element, or null.
    def getElementDescription(elementName: String, locale: Locale): String = ???

    @stub
    // Returns the maximum number of children of the named element
    // with child policy CHILD_POLICY_REPEAT.
    def getElementMaxChildren(elementName: String): Int = ???

    @stub
    // Returns the minimum number of children of the named element
    // with child policy CHILD_POLICY_REPEAT.
    def getElementMinChildren(elementName: String): Int = ???

    @stub
    // Returns the maximum number of array elements that may be used
    // to define the Object reference within the named
    // element.
    def getObjectArrayMaxLength(elementName: String): Int = ???

    @stub
    // Returns the minimum number of array elements that may be used
    // to define the Object reference within the named
    // element.
    def getObjectArrayMinLength(elementName: String): Int = ???

    @stub
    // Returns the Class type of the Object
    // reference stored within the element.
    def getObjectClass(elementName: String): Class[_] = ???

    @stub
    // Returns an Objects containing the default
    // value for the Object reference within
    // the named element.
    def getObjectDefaultValue(elementName: String): Object = ???

    @stub
    // Returns an array of Objects containing the legal
    // enumerated values for the Object reference within
    // the named element.
    def getObjectEnumerations(elementName: String): Array[Object] = ???

    @stub
    // Returns the maximum legal value for the Object
    // reference within the named element.
    def getObjectMaxValue(elementName: String): Comparable[_] = ???

    @stub
    // Returns the minimum legal value for the Object
    // reference within the named element.
    def getObjectMinValue(elementName: String): Comparable[_] = ???

    @stub
    // Returns one of the enumerated values starting with
    // VALUE_, indicating the type of values
    // (enumeration, range, or array) that are allowed for the
    // Object reference.
    def getObjectValueType(elementName: String): Int = ???

    @stub
    // Returns the name of the root element of the format.
    def getRootName(): String = ???
}

object IIOMetadataFormat {
    @stub
    // A constant returned by getChildPolicy to indicate
    // that an element must have a single instance of each of its
    // legal child elements, in order.
    def CHILD_POLICY_ALL: Int = ???

    @stub
    // A constant returned by getChildPolicy to indicate
    // that an element must have zero or one children, selected from
    // among its legal child elements.
    def CHILD_POLICY_CHOICE: Int = ???

    @stub
    // A constant returned by getChildPolicy to indicate
    // that an element may not have any children.
    def CHILD_POLICY_EMPTY: Int = ???

    @stub
    // The largest valid CHILD_POLICY_* constant,
    // to be used for range checks.
    def CHILD_POLICY_MAX: Int = ???

    @stub
    // A constant returned by getChildPolicy to indicate
    // that an element must have zero or more instances of its unique
    // legal child element.
    def CHILD_POLICY_REPEAT: Int = ???

    @stub
    // A constant returned by getChildPolicy to indicate
    // that an element must have a sequence of instances of any of its
    // legal child elements.
    def CHILD_POLICY_SEQUENCE: Int = ???

    @stub
    // A constant returned by getChildPolicy to indicate
    // that an element must have zero or one instance of each of its
    // legal child elements, in order.
    def CHILD_POLICY_SOME: Int = ???

    @stub
    // A constant returned by getAttributeDataType
    // indicating that the value of an attribute is one of the boolean
    // values 'true' or 'false'.
    def DATATYPE_BOOLEAN: Int = ???

    @stub
    // A constant returned by getAttributeDataType
    // indicating that the value of an attribute is a string
    // representation of a double-precision decimal floating-point
    // number.
    def DATATYPE_DOUBLE: Int = ???

    @stub
    // A constant returned by getAttributeDataType
    // indicating that the value of an attribute is a string
    // representation of a decimal floating-point number.
    def DATATYPE_FLOAT: Int = ???

    @stub
    // A constant returned by getAttributeDataType
    // indicating that the value of an attribute is a string
    // representation of an integer.
    def DATATYPE_INTEGER: Int = ???

    @stub
    // A constant returned by getAttributeDataType
    // indicating that the value of an attribute is a general Unicode
    // string.
    def DATATYPE_STRING: Int = ???

    @stub
    // A constant returned by getAttributeValueType and
    // getObjectValueType to indicate that the attribute
    // or user object may be set a single, arbitrary value.
    def VALUE_ARBITRARY: Int = ???

    @stub
    // A constant returned by getAttributeValueType and
    // getObjectValueType to indicate that the attribute
    // or user object may be set one of a number of enumerated values.
    def VALUE_ENUMERATION: Int = ???

    @stub
    // A constant returned by getAttributeValueType and
    // getObjectValueType to indicate that the attribute
    // or user object may be set to a list or array of values.
    def VALUE_LIST: Int = ???

    @stub
    // A constant returned by getObjectValueType to
    // indicate the absence of a user object.
    def VALUE_NONE: Int = ???

    @stub
    // A constant returned by getAttributeValueType and
    // getObjectValueType to indicate that the attribute
    // or user object may be set a range of values.
    def VALUE_RANGE: Int = ???

    @stub
    // A constant returned by getAttributeValueType and
    // getObjectValueType to indicate that the attribute
    // or user object may be set to a range of values.
    def VALUE_RANGE_MAX_INCLUSIVE: Int = ???

    @stub
    // A value that may be or'ed with VALUE_RANGE to
    // obtain VALUE_RANGE_MAX_INCLUSIVE, and with
    // VALUE_RANGE_MIN_INCLUSIVE to obtain
    // VALUE_RANGE_MIN_MAX_INCLUSIVE.
    def VALUE_RANGE_MAX_INCLUSIVE_MASK: Int = ???

    @stub
    // A constant returned by getAttributeValueType and
    // getObjectValueType to indicate that the attribute
    // or user object may be set to a range of values.
    def VALUE_RANGE_MIN_INCLUSIVE: Int = ???

    @stub
    // A value that may be or'ed with VALUE_RANGE to
    // obtain VALUE_RANGE_MIN_INCLUSIVE, and with
    // VALUE_RANGE_MAX_INCLUSIVE to obtain
    // VALUE_RANGE_MIN_MAX_INCLUSIVE.
    def VALUE_RANGE_MIN_INCLUSIVE_MASK: Int = ???
}
