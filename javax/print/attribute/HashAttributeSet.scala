package javax.print.attribute

import java.io.Serializable
import java.lang.{Class, Object}
import scala.scalanative.annotation.stub

/** Class HashAttributeSet provides an AttributeSet
 *  implementation with characteristics of a hash map.
 *  
 */
class HashAttributeSet extends Object with AttributeSet with Serializable {

    /** Construct a new, empty attribute set. */
    @stub
    def this() = ???

    /** Construct a new attribute set,
     *  initially populated with the given attribute.
     */
    @stub
    def this(attribute: Attribute) = ???

    /** Construct a new attribute set,
     *  initially populated with the values from the
     *  given array.
     */
    @stub
    def this(attributes: Array[Attribute]) = ???

    /** Construct a new attribute set, where the members of the attribute
     *  set are restricted to the given interface.
     */
    @stub
    protected def this(attributes: Array[Attribute], interfaceName: Class[_]) = ???

    /** Construct a new attribute set, initially populated with the given
     *  attribute, where the members of the attribute set are restricted to the
     *  given interface.
     */
    @stub
    protected def this(attribute: Attribute, interfaceName: Class[_]) = ???

    /** Construct a new attribute set,
     *  initially populated with the values from the  given set.
     */
    @stub
    def this(attributes: AttributeSet) = ???

    /** Construct a new attribute set, initially populated with the
     *  values from the  given set where the members of the attribute
     *  set are restricted to the given interface.
     */
    @stub
    protected def this(attributes: AttributeSet, interfaceName: Class[_]) = ???

    /** Construct a new, empty attribute set, where the members of
     *  the attribute set are restricted to the given interface.
     */
    @stub
    protected def this(interfaceName: Class[_]) = ???

    /** Adds the specified attribute to this attribute set if it is not
     *  already present, first removing any existing in the same
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
     *  attribute.
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
