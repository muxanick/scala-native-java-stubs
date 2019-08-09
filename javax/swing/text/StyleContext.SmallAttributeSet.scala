package javax.swing.text

import java.lang.Object
import java.util.Enumeration

/** This class holds a small number of attributes in an array.
 *  The storage format is key, value, key, value, etc.  The size
 *  of the set is the length of the array divided by two.  By
 *  default, this is the class that will be used to store attributes
 *  when held in the compact sharable form.
 */
class StyleContext.SmallAttributeSet extends Object with AttributeSet {

    /**  */
    @stub
    def SmallAttributeSet(attrs: AttributeSet) = ???

    /** Clones a set of attributes. */
    @stub
    def clone(): Object = ???

    /** Checks whether a given attribute name/value is defined. */
    @stub
    def containsAttribute(name: Object, value: Object): Boolean = ???

    /** Checks whether the attribute set contains all of
     *  the given attributes.
     */
    @stub
    def containsAttributes(attrs: AttributeSet): Boolean = ???

    /** Copies a set of attributes. */
    @stub
    def copyAttributes(): AttributeSet = ???

    /** Compares this object to the specified object. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Gets the value of an attribute. */
    @stub
    def getAttribute(key: Object): Object = ???

    /** Gets the number of attributes that are defined. */
    @stub
    def getAttributeCount(): Int = ???

    /** Gets the names of all attributes. */
    @stub
    def getAttributeNames(): Enumeration[_] = ???

    /** If not overriden, the resolving parent defaults to
     *  the parent element.
     */
    @stub
    def getResolveParent(): AttributeSet = ???

    /** Returns a hashcode for this set of attributes. */
    @stub
    def hashCode(): Int = ???

    /** Checks whether a given attribute is defined. */
    @stub
    def isDefined(key: Object): Boolean = ???

    /** Checks whether two attribute sets are equal. */
    @stub
    def isEqual(attr: AttributeSet): Boolean = ???
}
