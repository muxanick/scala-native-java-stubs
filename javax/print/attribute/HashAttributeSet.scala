package javax.print.attribute

import java.io.Serializable
import java.lang.{Class, Object}

// Class HashAttributeSet provides an AttributeSet
// implementation with characteristics of a hash map.
// 
class HashAttributeSet extends Object with AttributeSet, with Serializable {

    @stub
    // Construct a new, empty attribute set.
    def this() = ???

    @stub
    // Construct a new attribute set,
    // initially populated with the given attribute.
    def this(attribute: Attribute) = ???

    @stub
    // Construct a new attribute set,
    // initially populated with the values from the
    // given array.
    def this(attributes: Array[Attribute]) = ???

    @stub
    // Construct a new attribute set, where the members of the attribute
    // set are restricted to the given interface.
    protected def this(attributes: Array[Attribute], interfaceName: Class[_]) = ???

    @stub
    // Construct a new attribute set, initially populated with the given
    // attribute, where the members of the attribute set are restricted to the
    // given interface.
    protected def this(attribute: Attribute, interfaceName: Class[_]) = ???

    @stub
    // Construct a new attribute set,
    // initially populated with the values from the  given set.
    def this(attributes: AttributeSet) = ???

    @stub
    // Construct a new attribute set, initially populated with the
    // values from the  given set where the members of the attribute
    // set are restricted to the given interface.
    protected def this(attributes: AttributeSet, interfaceName: Class[_]) = ???

    @stub
    // Adds the specified attribute to this attribute set if it is not
    // already present, first removing any existing in the same
    // attribute category as the specified attribute value.
    def add(attribute: Attribute): Boolean = ???

    @stub
    // Adds all of the elements in the specified set to this attribute.
    def addAll(attributes: AttributeSet): Boolean = ???

    @stub
    // Removes all attributes from this attribute set.
    def clear(): Unit = ???

    @stub
    // Returns true if this attribute set contains an
    // attribute for the specified category.
    def containsKey(category: Class[_]): Boolean = ???

    @stub
    // Returns true if this attribute set contains the given
    // attribute.
    def containsValue(attribute: Attribute): Boolean = ???

    @stub
    // Compares the specified object with this attribute set for equality.
    def equals(object: Object): Boolean = ???

    @stub
    // Returns the attribute value which this attribute set contains in the
    // given attribute category.
    def get(category: Class[_]): Attribute = ???

    @stub
    // Returns the hash code value for this attribute set.
    def hashCode(): Int = ???

    @stub
    // Returns true if this attribute set contains no attributes.
    def isEmpty(): Boolean = ???

    @stub
    // Removes the specified attribute from this attribute set if
    // present.
    def remove(attribute: Attribute): Boolean = ???

    @stub
    // Removes any attribute for this category from this attribute set if
    // present.
    def remove(category: Class[_]): Boolean = ???

    @stub
    // Returns the number of attributes in this attribute set.
    def size(): Int = ???
}
