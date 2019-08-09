package javax.naming.directory

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import javax.naming.NamingEnumeration
import scala.scalanative.annotation.stub

/** This interface represents a collection of attributes.
 * 
 *  In a directory, named objects can have associated with them
 *  attributes.  The Attributes interface represents a collection of attributes.
 *  For example, you can request from the directory the attributes
 *  associated with an object.  Those attributes are returned in
 *  an object that implements the Attributes interface.
 * 
 *  Attributes in an object that implements the  Attributes interface are
 *  unordered. The object can have zero or more attributes.
 *  Attributes is either case-sensitive or case-insensitive (case-ignore).
 *  This property is determined at the time the Attributes object is
 *  created. (see BasicAttributes constructor for example).
 *  In a case-insensitive Attributes, the case of its attribute identifiers
 *  is ignored when searching for an attribute, or adding attributes.
 *  In a case-sensitive Attributes, the case is significant.
 * 
 *  Note that updates to Attributes (such as adding or removing an attribute)
 *  do not affect the corresponding representation in the directory.
 *  Updates to the directory can only be effected
 *  using operations in the DirContext interface.
 */
trait Attributes extends Cloneable with Serializable {

    /** Makes a copy of the attribute set. */
    @stub
    def clone(): Object = ???

    /** Retrieves the attribute with the given attribute id from the
     *  attribute set.
     */
    @stub
    def get(attrID: String): Attribute = ???

    /** Retrieves an enumeration of the attributes in the attribute set. */
    @stub
    def getAll(): NamingEnumeration[_ <: Attribute] = ???

    /** Retrieves an enumeration of the ids of the attributes in the
     *  attribute set.
     */
    @stub
    def getIDs(): NamingEnumeration[String] = ???

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
    def put(attrID: String, val: Object): Attribute = ???

    /** Removes the attribute with the attribute id 'attrID' from
     *  the attribute set.
     */
    @stub
    def remove(attrID: String): Attribute = ???

    /** Retrieves the number of attributes in the attribute set. */
    @stub
    def size(): Int = ???
}
