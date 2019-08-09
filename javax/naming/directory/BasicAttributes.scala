package javax.naming.directory

import java.lang.{Object, String}
import javax.naming.NamingEnumeration

// This class provides a basic implementation
// of the Attributes interface.
//
// BasicAttributes is either case-sensitive or case-insensitive (case-ignore).
// This property is determined at the time the BasicAttributes constructor
// is called.
// In a case-insensitive BasicAttributes, the case of its attribute identifiers
// is ignored when searching for an attribute, or adding attributes.
// In a case-sensitive BasicAttributes, the case is significant.
//
// When the BasicAttributes class needs to create an Attribute, it
// uses BasicAttribute. There is no other dependency on BasicAttribute.
//
// Note that updates to BasicAttributes (such as adding or removing an attribute)
// does not affect the corresponding representation in the directory.
// Updates to the directory can only be effected
// using operations in the DirContext interface.
//
// A BasicAttributes instance is not synchronized against concurrent
// multithreaded access. Multiple threads trying to access and modify
// a single BasicAttributes instance should lock the object.
class BasicAttributes extends Object with Attributes {

    @stub
    // Constructs a new instance of Attributes.
    def this() = ???

    @stub
    // Constructs a new instance of Attributes.
    def this(ignoreCase: Boolean) = ???

    @stub
    // Constructs a new instance of Attributes with one attribute.
    def this(attrID: String, val: Object) = ???

    @stub
    // Creates and returns a copy of this object.
    def clone(): Object = ???

    @stub
    // Determines whether this BasicAttributes is equal to another
    // Attributes
    // Two Attributes are equal if they are both instances of
    // Attributes,
    // treat the case of attribute IDs the same way, and contain the
    // same attributes.
    def equals(obj: Object): Boolean = ???

    @stub
    // Retrieves the attribute with the given attribute id from the
    // attribute set.
    def get(attrID: String): Attribute = ???

    @stub
    // Retrieves an enumeration of the attributes in the attribute set.
    def getAll(): NamingEnumeration[Attribute] = ???

    @stub
    // Retrieves an enumeration of the ids of the attributes in the
    // attribute set.
    def getIDs(): NamingEnumeration[String] = ???

    @stub
    // Calculates the hash code of this BasicAttributes.
    def hashCode(): Int = ???

    @stub
    // Determines whether the attribute set ignores the case of
    // attribute identifiers when retrieving or adding attributes.
    def isCaseIgnored(): Boolean = ???

    @stub
    // Adds a new attribute to the attribute set.
    def put(attr: Attribute): Attribute = ???

    @stub
    // Adds a new attribute to the attribute set.
    def put(attrID: String, val: Object): Attribute = ???

    @stub
    // Removes the attribute with the attribute id 'attrID' from
    // the attribute set.
    def remove(attrID: String): Attribute = ???

    @stub
    // Retrieves the number of attributes in the attribute set.
    def size(): Int = ???
}
