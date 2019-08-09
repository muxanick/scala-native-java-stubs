package javax.swing.text

import java.io.Serializable
import java.lang.{Cloneable, Object}
import java.util.Enumeration

// A straightforward implementation of MutableAttributeSet using a
// hash table.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class SimpleAttributeSet extends Object with MutableAttributeSet, with Serializable, with Cloneable {

    @stub
    // Creates a new attribute set.
    def this() = ???

    @stub
    // Adds an attribute to the list.
    def addAttribute(name: Object, value: Object): Unit = ???

    @stub
    // Adds a set of attributes to the list.
    def addAttributes(attributes: AttributeSet): Unit = ???

    @stub
    // Clones a set of attributes.
    def clone(): Object = ???

    @stub
    // Checks whether the attribute list contains a
    // specified attribute name/value pair.
    def containsAttribute(name: Object, value: Object): Boolean = ???

    @stub
    // Checks whether the attribute list contains all the
    // specified name/value pairs.
    def containsAttributes(attributes: AttributeSet): Boolean = ???

    @stub
    // Makes a copy of the attributes.
    def copyAttributes(): AttributeSet = ???

    @stub
    // Compares this object to the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Gets the value of an attribute.
    def getAttribute(name: Object): Object = ???

    @stub
    // Gets a count of the number of attributes.
    def getAttributeCount(): Int = ???

    @stub
    // Gets the names of the attributes in the set.
    def getAttributeNames(): Enumeration[_] = ???

    @stub
    // Gets the resolving parent.
    def getResolveParent(): AttributeSet = ???

    @stub
    // Returns a hashcode for this set of attributes.
    def hashCode(): Int = ???

    @stub
    // Tells whether a given attribute is defined.
    def isDefined(attrName: Object): Boolean = ???

    @stub
    // Checks whether the set of attributes is empty.
    def isEmpty(): Boolean = ???

    @stub
    // Compares two attribute sets.
    def isEqual(attr: AttributeSet): Boolean = ???

    @stub
    // Removes an attribute from the list.
    def removeAttribute(name: Object): Unit = ???

    @stub
    // Removes a set of attributes from the list.
    def removeAttributes(attributes: AttributeSet): Unit = ???

    @stub
    // Removes a set of attributes from the list.
    def removeAttributes(names: Enumeration[_]): Unit = ???

    @stub
    // Sets the resolving parent.
    def setResolveParent(parent: AttributeSet): Unit = ???
}
