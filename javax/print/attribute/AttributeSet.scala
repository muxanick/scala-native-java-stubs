package javax.print.attribute

import java.lang.{Class, Object}
import scala.scalanative.annotation.stub

/** Interface AttributeSet specifies the interface for a set of printing
 *  attributes. A printing attribute is an object whose class implements
 *  interface Attribute.
 *  
 *  An attribute set contains a group of attribute values,
 *  where duplicate values are not allowed in the set.
 *  Furthermore, each value in an attribute set is
 *  a member of some category, and at most one value in any particular
 *  category is allowed in the set. For an attribute set, the values are Attribute objects, and the categories are Class objects. An attribute's category is the class (or interface) at the
 *  root of the class hierarchy for that kind of attribute. Note that an
 *  attribute object's category may be a superclass of the attribute object's
 *  class rather than the attribute object's class itself. An attribute
 *  object's
 *  category is determined by calling the getCategory() method defined in interface Attribute.
 *  
 *  The interfaces of an AttributeSet resemble those of the Java Collections
 *  API's java.util.Map interface, but is more restrictive in the types
 *  it will accept, and combines keys and values into an Attribute.
 *  
 *  Attribute sets are used in several places in the Print Service API. In
 *  each context, only certain kinds of attributes are allowed to appear in the
 *  attribute set, as determined by the tagging interfaces which the attribute
 *  class implements -- DocAttribute, PrintRequestAttribute, PrintJobAttribute, and PrintServiceAttribute.
 *  There are four specializations of an attribute set that are restricted to
 *  contain just one of the four kinds of attribute -- DocAttributeSet, PrintRequestAttributeSet,
 *  PrintJobAttributeSet, and PrintServiceAttributeSet, respectively. Note that
 *  many attribute classes implement more than one tagging interface and so may
 *  appear in more than one context.
 *  
 *  
 *  A DocAttributeSet, containing DocAttributes, specifies the characteristics of an individual doc and the
 *  print job settings to be applied to an individual doc.
 *  
 *  
 *  A PrintRequestAttributeSet, containing
 *  PrintRequestAttributes, specifies the
 *  settings
 *  to be applied to a whole print job and to all the docs in the print job.
 *  
 *  
 *  A PrintJobAttributeSet, containing PrintJobAttributes, reports the status of a print job.
 *  
 *  
 *  A PrintServiceAttributeSet, containing
 *  PrintServiceAttributes, reports the status of
 *   a Print Service instance.
 *  
 *  
 *  In some contexts, the client is only allowed to examine an attribute set's
 *  contents but not change them (the set is read-only). In other places, the
 *  client is allowed both to examine and to change an attribute set's contents
 *  (the set is read-write). For a read-only attribute set, calling a mutating
 *  operation throws an UnmodifiableSetException.
 *  
 *  The Print Service API provides one implementation of interface
 *  AttributeSet, class HashAttributeSet.
 *  A client can use class HashAttributeSet or provide its own implementation of
 *  interface AttributeSet. The Print Service API also provides
 *  implementations of interface AttributeSet's subinterfaces -- classes HashDocAttributeSet,
 *  HashPrintRequestAttributeSet, HashPrintJobAttributeSet, and HashPrintServiceAttributeSet.
 *  
 */
trait AttributeSet {

    /** Adds the specified attribute to this attribute set if it is not
     *  already present, first removing any existing value in the same
     *  attribute category as the specified attribute value.
     */
    @stub
    def add(attribute: Attribute): Boolean = ???

    /** Adds all of the elements in the specified set to this attribute. */
    @stub
    def addAll(attributes: AttributeSet): Boolean = ???

    /** Removes all attributes from this attribute set. */
    @stub
    def clear(): Unit = ???

    /** Returns true if this attribute set contains an
     *  attribute for the specified category.
     */
    @stub
    def containsKey(category: Class[_]): Boolean = ???

    /** Returns true if this attribute set contains the given
     *  attribute value.
     */
    @stub
    def containsValue(attribute: Attribute): Boolean = ???

    /** Compares the specified object with this attribute set for equality. */
    @stub
    def equals(object: Any): Boolean = ???

    /** Returns the attribute value which this attribute set contains in the
     *  given attribute category.
     */
    @stub
    def get(category: Class[_]): Attribute = ???

    /** Returns the hash code value for this attribute set. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if this attribute set contains no attributes. */
    @stub
    def isEmpty(): Boolean = ???

    /** Removes the specified attribute from this attribute set if
     *  present.
     */
    @stub
    def remove(attribute: Attribute): Boolean = ???

    /** Removes any attribute for this category from this attribute set if
     *  present.
     */
    @stub
    def remove(category: Class[_]): Boolean = ???

    /** Returns the number of attributes in this attribute set. */
    @stub
    def size(): Int = ???

    /** Returns an array of the attributes contained in this set. */
    @stub
    def toArray(): Array[Attribute] = ???
}
