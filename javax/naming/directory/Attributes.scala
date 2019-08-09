package javax.naming.directory

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import javax.naming.NamingEnumeration

// This interface represents a collection of attributes.
//
// In a directory, named objects can have associated with them
// attributes.  The Attributes interface represents a collection of attributes.
// For example, you can request from the directory the attributes
// associated with an object.  Those attributes are returned in
// an object that implements the Attributes interface.
//
// Attributes in an object that implements the  Attributes interface are
// unordered. The object can have zero or more attributes.
// Attributes is either case-sensitive or case-insensitive (case-ignore).
// This property is determined at the time the Attributes object is
// created. (see BasicAttributes constructor for example).
// In a case-insensitive Attributes, the case of its attribute identifiers
// is ignored when searching for an attribute, or adding attributes.
// In a case-sensitive Attributes, the case is significant.
//
// Note that updates to Attributes (such as adding or removing an attribute)
// do not affect the corresponding representation in the directory.
// Updates to the directory can only be effected
// using operations in the DirContext interface.
trait Attributes extends Cloneable , Serializable {

    @stub
    // Makes a copy of the attribute set.
    def clone(): Object = ???

    @stub
    // Retrieves the attribute with the given attribute id from the
    // attribute set.
    def get(attrID: String): Attribute = ???

    @stub
    // Retrieves an enumeration of the attributes in the attribute set.
    def getAll(): NamingEnumeration[_ <: Attribute] = ???

    @stub
    // Retrieves an enumeration of the ids of the attributes in the
    // attribute set.
    def getIDs(): NamingEnumeration[String] = ???

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
}
