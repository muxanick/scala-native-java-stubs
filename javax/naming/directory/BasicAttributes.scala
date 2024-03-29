package javax.naming.directory

import java.lang.{Object, String}
import javax.naming.NamingEnumeration
import scala.scalanative.annotation.stub

/** This class provides a basic implementation
 *  of the Attributes interface.
 * 
 *  BasicAttributes is either case-sensitive or case-insensitive (case-ignore).
 *  This property is determined at the time the BasicAttributes constructor
 *  is called.
 *  In a case-insensitive BasicAttributes, the case of its attribute identifiers
 *  is ignored when searching for an attribute, or adding attributes.
 *  In a case-sensitive BasicAttributes, the case is significant.
 * 
 *  When the BasicAttributes class needs to create an Attribute, it
 *  uses BasicAttribute. There is no other dependency on BasicAttribute.
 * 
 *  Note that updates to BasicAttributes (such as adding or removing an attribute)
 *  does not affect the corresponding representation in the directory.
 *  Updates to the directory can only be effected
 *  using operations in the DirContext interface.
 * 
 *  A BasicAttributes instance is not synchronized against concurrent
 *  multithreaded access. Multiple threads trying to access and modify
 *  a single BasicAttributes instance should lock the object.
 */
class BasicAttributes extends Object with Attributes {

    /** Constructs a new instance of Attributes. */
    @stub
    def this() = ???

    /** Constructs a new instance of Attributes. */
    @stub
    def this(ignoreCase: Boolean) = ???

    /** Constructs a new instance of Attributes with one attribute. */
    @stub
    def this(attrID: String, val: Any) = ???

    /** Constructs a new instance of Attributes with one attribute. */
    @stub
    def this(attrID: String, val: Any, ignoreCase: Boolean) = ???

    /** Creates and returns a copy of this object. */
    @stub
    def clone(): Any = ???

    /** Determines whether this BasicAttributes is equal to another
     *  Attributes
     *  Two Attributes are equal if they are both instances of
     *  Attributes,
     *  treat the case of attribute IDs the same way, and contain the
     *  same attributes.
     */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Retrieves the attribute with the given attribute id from the
     *  attribute set.
     */
    @stub
    def get(attrID: String): Attribute = ???

    /** Retrieves an enumeration of the attributes in the attribute set. */
    @stub
    def getAll(): NamingEnumeration[Attribute] = ???

    /** Retrieves an enumeration of the ids of the attributes in the
     *  attribute set.
     */
    @stub
    def getIDs(): NamingEnumeration[String] = ???

    /** Calculates the hash code of this BasicAttributes. */
    @stub
    def hashCode(): Int = ???

    /** Determines whether the attribute set ignores the case of
     *  attribute identifiers when retrieving or adding attributes.
     */
    @stub
    def isCaseIgnored(): Boolean = ???

    /** Adds a new attribute to the attribute set. */
    @stub
    def put(attr: Attribute): Attribute = ???

    /** Adds a new attribute to the attribute set. */
    @stub
    def put(attrID: String, val: Any): Attribute = ???

    /** Removes the attribute with the attribute id 'attrID' from
     *  the attribute set.
     */
    @stub
    def remove(attrID: String): Attribute = ???

    /** Retrieves the number of attributes in the attribute set. */
    @stub
    def size(): Int = ???

    /** Generates the string representation of this attribute set. */
    @stub
    def toString(): String = ???
}
