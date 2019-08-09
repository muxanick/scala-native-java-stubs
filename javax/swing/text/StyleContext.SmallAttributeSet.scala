package javax.swing.text

import java.lang.Object
import java.util.Enumeration

// This class holds a small number of attributes in an array.
// The storage format is key, value, key, value, etc.  The size
// of the set is the length of the array divided by two.  By
// default, this is the class that will be used to store attributes
// when held in the compact sharable form.
class StyleContext.SmallAttributeSet extends Object with AttributeSet {

    @stub
    // 
    def SmallAttributeSet(attrs: AttributeSet) = ???

    @stub
    // Clones a set of attributes.
    def clone(): Object = ???

    @stub
    // Checks whether a given attribute name/value is defined.
    def containsAttribute(name: Object, value: Object): Boolean = ???

    @stub
    // Checks whether the attribute set contains all of
    // the given attributes.
    def containsAttributes(attrs: AttributeSet): Boolean = ???

    @stub
    // Copies a set of attributes.
    def copyAttributes(): AttributeSet = ???

    @stub
    // Compares this object to the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Gets the value of an attribute.
    def getAttribute(key: Object): Object = ???

    @stub
    // Gets the number of attributes that are defined.
    def getAttributeCount(): Int = ???

    @stub
    // Gets the names of all attributes.
    def getAttributeNames(): Enumeration[_] = ???

    @stub
    // If not overriden, the resolving parent defaults to
    // the parent element.
    def getResolveParent(): AttributeSet = ???

    @stub
    // Returns a hashcode for this set of attributes.
    def hashCode(): Int = ???

    @stub
    // Checks whether a given attribute is defined.
    def isDefined(key: Object): Boolean = ???

    @stub
    // Checks whether two attribute sets are equal.
    def isEqual(attr: AttributeSet): Boolean = ???
}
