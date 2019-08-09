package javax.naming.directory

import java.lang.{Object, String}
import javax.naming.NamingEnumeration

// This class provides a basic implementation of the Attribute interface.
//
// This implementation does not support the schema methods
// getAttributeDefinition() and getAttributeSyntaxDefinition().
// They simply throw OperationNotSupportedException.
// Subclasses of BasicAttribute should override these methods if they
// support them.
//
// The BasicAttribute class by default uses Object.equals() to
// determine equality of attribute values when testing for equality or
// when searching for values, except when the value is an array.
// For an array, each element of the array is checked using Object.equals().
// Subclasses of BasicAttribute can make use of schema information
// when doing similar equality checks by overriding methods
// in which such use of schema is meaningful.
// Similarly, the BasicAttribute class by default returns the values passed to its
// constructor and/or manipulated using the add/remove methods.
// Subclasses of BasicAttribute can override get() and getAll()
// to get the values dynamically from the directory (or implement
// the Attribute interface directly instead of subclassing BasicAttribute).
//
// Note that updates to BasicAttribute (such as adding or removing a value)
// does not affect the corresponding representation of the attribute
// in the directory.  Updates to the directory can only be effected
// using operations in the DirContext interface.
//
// A BasicAttribute instance is not synchronized against concurrent
// multithreaded access. Multiple threads trying to access and modify a
// BasicAttribute should lock the object.
class BasicAttribute extends Object with Attribute {

    @stub
    // Constructs a new instance of an unordered attribute with no value.
    def this(id: String) = ???

    @stub
    // Constructs a new instance of a possibly ordered attribute with no value.
    def this(id: String, ordered: Boolean) = ???

    @stub
    // Constructs a new instance of an unordered attribute with a single value.
    def this(id: String, value: Object) = ???

    @stub
    // Holds the attribute's id.
    protected def attrID: String = ???

    @stub
    // A flag for recording whether this attribute's values are ordered.
    protected def ordered: Boolean = ???

    @stub
    // Adds an attribute value to the ordered list of attribute values.
    def add(ix: Int, attrVal: Object): Unit = ???

    @stub
    // Adds a new value to this attribute.
    def add(attrVal: Object): Boolean = ???

    @stub
    // Removes all values from this attribute.
    def clear(): Unit = ???

    @stub
    // Creates and returns a copy of this object.
    def clone(): Object = ???

    @stub
    // Determines whether a value is in this attribute.
    def contains(attrVal: Object): Boolean = ???

    @stub
    // Determines whether obj is equal to this attribute.
    def equals(obj: Object): Boolean = ???

    @stub
    // Retrieves one of this attribute's values.
    def get(): Object = ???

    @stub
    // Retrieves the attribute value from the ordered list of attribute values.
    def get(ix: Int): Object = ???

    @stub
    // Retrieves an enumeration of this attribute's values.
    def getAll(): NamingEnumeration[_] = ???

    @stub
    // Retrieves this attribute's schema definition.
    def getAttributeDefinition(): DirContext = ???

    @stub
    // Retrieves the syntax definition associated with this attribute.
    def getAttributeSyntaxDefinition(): DirContext = ???

    @stub
    // Retrieves the id of this attribute.
    def getID(): String = ???

    @stub
    // Calculates the hash code of this attribute.
    def hashCode(): Int = ???

    @stub
    // Determines whether this attribute's values are ordered.
    def isOrdered(): Boolean = ???

    @stub
    // Removes an attribute value from the ordered list of attribute values.
    def remove(ix: Int): Object = ???

    @stub
    // Removes a specified value from this attribute.
    def remove(attrval: Object): Boolean = ???

    @stub
    // Sets an attribute value in the ordered list of attribute values.
    def set(ix: Int, attrVal: Object): Object = ???

    @stub
    // Retrieves the number of values in this attribute.
    def size(): Int = ???
}
