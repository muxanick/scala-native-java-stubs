package javax.imageio.metadata

import java.lang.{Class, Comparable, Object, String}
import java.util.{List, Locale}
import javax.imageio.ImageTypeSpecifier
import scala.scalanative.annotation.stub

/** A concrete class providing a reusable implementation of the
 *  IIOMetadataFormat interface.  In addition, a static
 *  instance representing the standard, plug-in neutral
 *  javax_imageio_1.0 format is provided by the
 *  getStandardFormatInstance method.
 * 
 *   In order to supply localized descriptions of elements and
 *  attributes, a ResourceBundle with a base name of
 *  this.getClass().getName() + "Resources" should be
 *  supplied via the usual mechanism used by
 *  ResourceBundle.getBundle.  Briefly, the subclasser
 *  supplies one or more additional classes according to a naming
 *  convention (by default, the fully-qualified name of the subclass
 *  extending IIMetadataFormatImpl, plus the string
 *  "Resources", plus the country, language, and variant codes
 *  separated by underscores).  At run time, calls to
 *  getElementDescription or
 *  getAttributeDescription will attempt to load such
 *  classes dynamically according to the supplied locale, and will use
 *  either the element name, or the element name followed by a '/'
 *  character followed by the attribute name as a key.  This key will
 *  be supplied to the ResourceBundle's
 *  getString method, and the resulting localized
 *  description of the node or attribute is returned.
 * 
 *   The subclass may supply a different base name for the resource
 *  bundles using the setResourceBaseName method.
 * 
 *   A subclass may choose its own localization mechanism, if so
 *  desired, by overriding the supplied implementations of
 *  getElementDescription and
 *  getAttributeDescription.
 */
abstract class IIOMetadataFormatImpl extends Object with IIOMetadataFormat {

    /** Constructs a blank IIOMetadataFormatImpl instance,
     *  with a given root element name and child policy (other than
     *  CHILD_POLICY_REPEAT).
     */
    @stub
    def this(rootName: String, childPolicy: Int) = ???

    /** Constructs a blank IIOMetadataFormatImpl instance,
     *  with a given root element name and a child policy of
     *  CHILD_POLICY_REPEAT.
     */
    @stub
    def this(rootName: String, minChildren: Int, maxChildren: Int) = ???

    /** Adds a new attribute to a previously defined element that will
     *  be defined by a list of values.
     */
    protected def addAttribute(elementName: String, attrName: String, dataType: Int, required: Boolean, listMinLength: Int, listMaxLength: Int): Unit

    /** Adds a new attribute to a previously defined element that may
     *  be set to an arbitrary value.
     */
    protected def addAttribute(elementName: String, attrName: String, dataType: Int, required: Boolean, defaultValue: String): Unit

    /** Adds a new attribute to a previously defined element that will
     *  be defined by a set of enumerated values.
     */
    protected def addAttribute(elementName: String, attrName: String, dataType: Int, required: Boolean, defaultValue: String, enumeratedValues: List[String]): Unit

    /** Adds a new attribute to a previously defined element that will
     *  be defined by a range of values.
     */
    protected def addAttribute(elementName: String, attrName: String, dataType: Int, required: Boolean, defaultValue: String, minValue: String, maxValue: String, minInclusive: Boolean, maxInclusive: Boolean): Unit

    /** Adds a new attribute to a previously defined element that will
     *  be defined by the enumerated values TRUE and
     *  FALSE, with a datatype of
     *  DATATYPE_BOOLEAN.
     */
    protected def addBooleanAttribute(elementName: String, attrName: String, hasDefaultValue: Boolean, defaultValue: Boolean): Unit

    /** Adds an existing element to the list of legal children for a
     *  given parent node type.
     */
    protected def addChildElement(elementName: String, parentName: String): Unit

    /** Adds a new element type to this metadata document format with a
     *  child policy other than CHILD_POLICY_REPEAT.
     */
    protected def addElement(elementName: String, parentName: String, childPolicy: Int): Unit

    /** Adds a new element type to this metadata document format with a
     *  child policy of CHILD_POLICY_REPEAT.
     */
    protected def addElement(elementName: String, parentName: String, minChildren: Int, maxChildren: Int): Unit

    /** Allows an Object reference of a given class type
     *  to be stored in nodes implementing the named element.
     */
    protected def addObjectValue(elementName: String, classType: Class[_], arrayMinLength: Int, arrayMaxLength: Int): Unit

    /** Allows an Object reference of a given class type
     *  to be stored in nodes implementing the named element.
     */
    val Unit: protected[T]

    /** Allows an Object reference of a given class type
     *  to be stored in nodes implementing the named element.
     */
    val Unit: protected[T]

    /** Allows an Object reference of a given class type
     *  to be stored in nodes implementing the named element.
     */
    val Unit: protected[T <: Object, with, Comparable[_ >: T]]

    /** Returns true if the element (and the subtree below
     *  it) is allowed to appear in a metadata document for an image of
     *  the given type, defined by an ImageTypeSpecifier.
     */
    def canNodeAppear(elementName: String, imageType: ImageTypeSpecifier): Boolean

    /** Returns one of the constants starting with
     *  DATATYPE_, indicating the format and
     *  interpretation of the value of the given attribute within the
     *  named element.
     */
    def getAttributeDataType(elementName: String, attrName: String): Int

    /** Returns the default value of the named attribute, if it is not
     *  explicitly present within the named element, as a
     *  String, or null if no default value
     *  is available.
     */
    def getAttributeDefaultValue(elementName: String, attrName: String): String

    /** Returns a String containing a description of the
     *  named attribute, or null.
     */
    def getAttributeDescription(elementName: String, attrName: String, locale: Locale): String

    /** Returns an array of Strings containing the legal
     *  enumerated values for the given attribute within the named
     *  element.
     */
    def getAttributeEnumerations(elementName: String, attrName: String): Array[String]

    /** Returns the maximum number of list items that may be used to
     *  define this attribute.
     */
    def getAttributeListMaxLength(elementName: String, attrName: String): Int

    /** Returns the minimum number of list items that may be used to
     *  define this attribute.
     */
    def getAttributeListMinLength(elementName: String, attrName: String): Int

    /** Returns the maximum legal value for the attribute. */
    def getAttributeMaxValue(elementName: String, attrName: String): String

    /** Returns the minimum legal value for the attribute. */
    def getAttributeMinValue(elementName: String, attrName: String): String

    /** Returns an array of Strings listing the names of
     *  the attributes that may be associated with the named element.
     */
    def getAttributeNames(elementName: String): Array[String]

    /** Returns one of the constants starting with VALUE_,
     *  indicating whether the values of the given attribute within the
     *  named element are arbitrary, constrained to lie within a
     *  specified range, constrained to be one of a set of enumerated
     *  values, or are a whitespace-separated list of arbitrary values.
     */
    def getAttributeValueType(elementName: String, attrName: String): Int

    /** Returns an array of Strings indicating the names
     *  of the element which are allowed to be children of the named
     *  element, in the order in which they should appear.
     */
    def getChildNames(elementName: String): Array[String]

    /** Returns one of the constants starting with
     *  CHILD_POLICY_, indicating the legal pattern of
     *  children for the named element.
     */
    def getChildPolicy(elementName: String): Int

    /** Returns a String containing a description of the
     *  named element, or null.
     */
    def getElementDescription(elementName: String, locale: Locale): String

    /** Returns the maximum number of children of the named element
     *  with child policy CHILD_POLICY_REPEAT.
     */
    def getElementMaxChildren(elementName: String): Int

    /** Returns the minimum number of children of the named element
     *  with child policy CHILD_POLICY_REPEAT.
     */
    def getElementMinChildren(elementName: String): Int

    /** Returns the maximum number of array elements that may be used
     *  to define the Object reference within the named
     *  element.
     */
    def getObjectArrayMaxLength(elementName: String): Int

    /** Returns the minimum number of array elements that may be used
     *  to define the Object reference within the named
     *  element.
     */
    def getObjectArrayMinLength(elementName: String): Int

    /** Returns the Class type of the Object
     *  reference stored within the element.
     */
    def getObjectClass(elementName: String): Class[_]

    /** Returns an Objects containing the default
     *  value for the Object reference within
     *  the named element.
     */
    def getObjectDefaultValue(elementName: String): Any

    /** Returns an array of Objects containing the legal
     *  enumerated values for the Object reference within
     *  the named element.
     */
    def getObjectEnumerations(elementName: String): Array[Object]

    /** Returns the maximum legal value for the Object
     *  reference within the named element.
     */
    def getObjectMaxValue(elementName: String): Comparable[_]

    /** Returns the minimum legal value for the Object
     *  reference within the named element.
     */
    def getObjectMinValue(elementName: String): Comparable[_]

    /** Returns one of the enumerated values starting with
     *  VALUE_, indicating the type of values
     *  (enumeration, range, or array) that are allowed for the
     *  Object reference.
     */
    def getObjectValueType(elementName: String): Int

    /** Returns the currently set base name for locating
     *  ResourceBundles.
     */
    protected def getResourceBaseName(): String

    /** Returns the name of the root element of the format. */
    def getRootName(): String

    /** Returns true if the named attribute must be
     *  present within the named element.
     */
    def isAttributeRequired(elementName: String, attrName: String): Boolean

    /** Removes an attribute from a previously defined element. */
    protected def removeAttribute(elementName: String, attrName: String): Unit

    /** Removes an element from the format. */
    protected def removeElement(elementName: String): Unit

    /** Disallows an Object reference from being stored in
     *  nodes implementing the named element.
     */
    protected def removeObjectValue(elementName: String): Unit

    /** Sets a new base name for locating ResourceBundles
     *  containing descriptions of elements and attributes for this
     *  format.
     */
    protected def setResourceBaseName(resourceBaseName: String): Unit
}

object IIOMetadataFormatImpl {
    /** A String constant containing the standard format
     *  name, "javax_imageio_1.0".
     */
    @stub
    val standardMetadataFormatName: String = ???

    /** Returns an IIOMetadataFormat object describing the
     *  standard, plug-in neutral javax.imageio_1.0
     *  metadata document format described in the comment of the
     *  javax.imageio.metadata package.
     */
    @stub
    def getStandardFormatInstance(): IIOMetadataFormat = ???
}
