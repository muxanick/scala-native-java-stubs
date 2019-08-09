package javax.naming.directory

import java.lang.{Object, String}
import javax.naming.NamingEnumeration

/** This class provides a basic implementation of the Attribute interface.
 * 
 *  This implementation does not support the schema methods
 *  getAttributeDefinition() and getAttributeSyntaxDefinition().
 *  They simply throw OperationNotSupportedException.
 *  Subclasses of BasicAttribute should override these methods if they
 *  support them.
 * 
 *  The BasicAttribute class by default uses Object.equals() to
 *  determine equality of attribute values when testing for equality or
 *  when searching for values, except when the value is an array.
 *  For an array, each element of the array is checked using Object.equals().
 *  Subclasses of BasicAttribute can make use of schema information
 *  when doing similar equality checks by overriding methods
 *  in which such use of schema is meaningful.
 *  Similarly, the BasicAttribute class by default returns the values passed to its
 *  constructor and/or manipulated using the add/remove methods.
 *  Subclasses of BasicAttribute can override get() and getAll()
 *  to get the values dynamically from the directory (or implement
 *  the Attribute interface directly instead of subclassing BasicAttribute).
 * 
 *  Note that updates to BasicAttribute (such as adding or removing a value)
 *  does not affect the corresponding representation of the attribute
 *  in the directory.  Updates to the directory can only be effected
 *  using operations in the DirContext interface.
 * 
 *  A BasicAttribute instance is not synchronized against concurrent
 *  multithreaded access. Multiple threads trying to access and modify a
 *  BasicAttribute should lock the object.
 */
class BasicAttribute extends Object with Attribute {

    /** Constructs a new instance of an unordered attribute with no value. */
    @stub
    def this(id: String) = ???

    /** Constructs a new instance of a possibly ordered attribute with no value. */
    @stub
    def this(id: String, ordered: Boolean) = ???

    /** Constructs a new instance of an unordered attribute with a single value. */
    @stub
    def this(id: String, value: Object) = ???

    /** Holds the attribute's id. */
    @stub
    protected val attrID: String = ???

    /** A flag for recording whether this attribute's values are ordered. */
    @stub
    protected val ordered: Boolean = ???

    /** Adds an attribute value to the ordered list of attribute values. */
    @stub
    def add(ix: Int, attrVal: Object): Unit = ???

    /** Adds a new value to this attribute. */
    @stub
    def add(attrVal: Object): Boolean = ???

    /** Removes all values from this attribute. */
    @stub
    def clear(): Unit = ???

    /** Creates and returns a copy of this object. */
    @stub
    def clone(): Object = ???

    /** Determines whether a value is in this attribute. */
    @stub
    def contains(attrVal: Object): Boolean = ???

    /** Determines whether obj is equal to this attribute. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Retrieves one of this attribute's values. */
    @stub
    def get(): Object = ???

    /** Retrieves the attribute value from the ordered list of attribute values. */
    @stub
    def get(ix: Int): Object = ???

    /** Retrieves an enumeration of this attribute's values. */
    @stub
    def getAll(): NamingEnumeration[_] = ???

    /** Retrieves this attribute's schema definition. */
    @stub
    def getAttributeDefinition(): DirContext = ???

    /** Retrieves the syntax definition associated with this attribute. */
    @stub
    def getAttributeSyntaxDefinition(): DirContext = ???

    /** Retrieves the id of this attribute. */
    @stub
    def getID(): String = ???

    /** Calculates the hash code of this attribute. */
    @stub
    def hashCode(): Int = ???

    /** Determines whether this attribute's values are ordered. */
    @stub
    def isOrdered(): Boolean = ???

    /** Removes an attribute value from the ordered list of attribute values. */
    @stub
    def remove(ix: Int): Object = ???

    /** Removes a specified value from this attribute. */
    @stub
    def remove(attrval: Object): Boolean = ???

    /** Sets an attribute value in the ordered list of attribute values. */
    @stub
    def set(ix: Int, attrVal: Object): Object = ???

    /** Retrieves the number of values in this attribute. */
    @stub
    def size(): Int = ???
}
