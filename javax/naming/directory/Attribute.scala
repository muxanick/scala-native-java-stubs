package javax.naming.directory

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import javax.naming.NamingEnumeration

// This interface represents an attribute associated with a named object.
//
// In a directory, named objects can have associated with them
// attributes.  The Attribute interface represents an attribute associated
// with a named object.  An attribute contains 0 or more, possibly null, values.
// The attribute values can be ordered or unordered (see isOrdered()).
// If the values are unordered, no duplicates are allowed.
// If the values are ordered, duplicates are allowed.
//
// The content and representation of an attribute and its values is defined by
// the attribute's schema. The schema contains information
// about the attribute's syntax and other properties about the attribute.
// See getAttributeDefinition() and
// getAttributeSyntaxDefinition()
// for details regarding how to get schema information about an attribute
// if the underlying directory service supports schemas.
//
// Equality of two attributes is determined by the implementation class.
// A simple implementation can use Object.equals() to determine equality
// of attribute values, while a more sophisticated implementation might
// make use of schema information to determine equality.
// Similarly, one implementation might provide a static storage
// structure which simply returns the values passed to its
// constructor, while another implementation might define get() and
// getAll().
// to get the values dynamically from the directory.
//
// Note that updates to Attribute (such as adding or removing a
// value) do not affect the corresponding representation of the attribute
// in the directory.  Updates to the directory can only be effected
// using operations in the DirContext interface.
trait Attribute extends Cloneable , Serializable {

    @stub
    // Adds an attribute value to the ordered list of attribute values.
    def add(ix: Int, attrVal: Object): Unit = ???

    @stub
    // Adds a new value to the attribute.
    def add(attrVal: Object): Boolean = ???

    @stub
    // Removes all values from this attribute.
    def clear(): Unit = ???

    @stub
    // Makes a copy of the attribute.
    def clone(): Object = ???

    @stub
    // Determines whether a value is in the attribute.
    def contains(attrVal: Object): Boolean = ???

    @stub
    // Retrieves one of this attribute's values.
    def get(): Object = ???

    @stub
    // Retrieves the attribute value from the ordered list of attribute values.
    def get(ix: Int): Object = ???

    @stub
    // Retrieves an enumeration of the attribute's values.
    def getAll(): NamingEnumeration[_] = ???

    @stub
    // Retrieves the attribute's schema definition.
    def getAttributeDefinition(): DirContext = ???

    @stub
    // Retrieves the syntax definition associated with the attribute.
    def getAttributeSyntaxDefinition(): DirContext = ???

    @stub
    // Retrieves the id of this attribute.
    def getID(): String = ???

    @stub
    // Determines whether this attribute's values are ordered.
    def isOrdered(): Boolean = ???

    @stub
    // Removes an attribute value from the ordered list of attribute values.
    def remove(ix: Int): Object = ???

    @stub
    // Removes a specified value from the attribute.
    def remove(attrval: Object): Boolean = ???

    @stub
    // Sets an attribute value in the ordered list of attribute values.
    def set(ix: Int, attrVal: Object): Object = ???
}
