package javax.swing.text

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import java.util.Enumeration
import scala.scalanative.annotation.stub

/** A straightforward implementation of MutableAttributeSet using a
 *  hash table.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class SimpleAttributeSet extends Object with MutableAttributeSet with Serializable with Cloneable {

    /** Creates a new attribute set. */
    @stub
    def this() = ???

    /** Creates a new attribute set based on a supplied set of attributes. */
    @stub
    def this(source: AttributeSet) = ???

    /** Adds an attribute to the list. */
    @stub
    def addAttribute(name: Object, value: Object): Unit = ???

    /** Adds a set of attributes to the list. */
    @stub
    def addAttributes(attributes: AttributeSet): Unit = ???

    /** Clones a set of attributes. */
    @stub
    def clone(): Object = ???

    /** Checks whether the attribute list contains a
     *  specified attribute name/value pair.
     */
    @stub
    def containsAttribute(name: Object, value: Object): Boolean = ???

    /** Checks whether the attribute list contains all the
     *  specified name/value pairs.
     */
    @stub
    def containsAttributes(attributes: AttributeSet): Boolean = ???

    /** Makes a copy of the attributes. */
    @stub
    def copyAttributes(): AttributeSet = ???

    /** Compares this object to the specified object. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Gets the value of an attribute. */
    @stub
    def getAttribute(name: Object): Object = ???

    /** Gets a count of the number of attributes. */
    @stub
    def getAttributeCount(): Int = ???

    /** Gets the names of the attributes in the set. */
    @stub
    def getAttributeNames(): Enumeration[_] = ???

    /** Gets the resolving parent. */
    @stub
    def getResolveParent(): AttributeSet = ???

    /** Returns a hashcode for this set of attributes. */
    @stub
    def hashCode(): Int = ???

    /** Tells whether a given attribute is defined. */
    @stub
    def isDefined(attrName: Object): Boolean = ???

    /** Checks whether the set of attributes is empty. */
    @stub
    def isEmpty(): Boolean = ???

    /** Compares two attribute sets. */
    @stub
    def isEqual(attr: AttributeSet): Boolean = ???

    /** Removes an attribute from the list. */
    @stub
    def removeAttribute(name: Object): Unit = ???

    /** Removes a set of attributes from the list. */
    @stub
    def removeAttributes(attributes: AttributeSet): Unit = ???

    /** Removes a set of attributes from the list. */
    @stub
    def removeAttributes(names: Enumeration[_]): Unit = ???

    /** Sets the resolving parent. */
    @stub
    def setResolveParent(parent: AttributeSet): Unit = ???

    /** Converts the attribute set to a String. */
    @stub
    def toString(): String = ???
}

object SimpleAttributeSet {
    /** An empty attribute set. */
    @stub
    val EMPTY: AttributeSet = ???
}
