package javax.naming.directory

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import javax.naming.NamingEnumeration
import scala.scalanative.annotation.stub

/** This interface represents an attribute associated with a named object.
 * 
 *  In a directory, named objects can have associated with them
 *  attributes.  The Attribute interface represents an attribute associated
 *  with a named object.  An attribute contains 0 or more, possibly null, values.
 *  The attribute values can be ordered or unordered (see isOrdered()).
 *  If the values are unordered, no duplicates are allowed.
 *  If the values are ordered, duplicates are allowed.
 * 
 *  The content and representation of an attribute and its values is defined by
 *  the attribute's schema. The schema contains information
 *  about the attribute's syntax and other properties about the attribute.
 *  See getAttributeDefinition() and
 *  getAttributeSyntaxDefinition()
 *  for details regarding how to get schema information about an attribute
 *  if the underlying directory service supports schemas.
 * 
 *  Equality of two attributes is determined by the implementation class.
 *  A simple implementation can use Object.equals() to determine equality
 *  of attribute values, while a more sophisticated implementation might
 *  make use of schema information to determine equality.
 *  Similarly, one implementation might provide a static storage
 *  structure which simply returns the values passed to its
 *  constructor, while another implementation might define get() and
 *  getAll().
 *  to get the values dynamically from the directory.
 * 
 *  Note that updates to Attribute (such as adding or removing a
 *  value) do not affect the corresponding representation of the attribute
 *  in the directory.  Updates to the directory can only be effected
 *  using operations in the DirContext interface.
 */
trait Attribute extends Cloneable with Serializable {

    /** Adds an attribute value to the ordered list of attribute values. */
    @stub
    def add(ix: Int, attrVal: Any): Unit = ???

    /** Adds a new value to the attribute. */
    @stub
    def add(attrVal: Any): Boolean = ???

    /** Removes all values from this attribute. */
    @stub
    def clear(): Unit = ???

    /** Makes a copy of the attribute. */
    @stub
    def clone(): Any = ???

    /** Determines whether a value is in the attribute. */
    @stub
    def contains(attrVal: Any): Boolean = ???

    /** Retrieves one of this attribute's values. */
    @stub
    def get(): Any = ???

    /** Retrieves the attribute value from the ordered list of attribute values. */
    @stub
    def get(ix: Int): Any = ???

    /** Retrieves an enumeration of the attribute's values. */
    @stub
    def getAll(): NamingEnumeration[_] = ???

    /** Retrieves the attribute's schema definition. */
    @stub
    def getAttributeDefinition(): DirContext = ???

    /** Retrieves the syntax definition associated with the attribute. */
    @stub
    def getAttributeSyntaxDefinition(): DirContext = ???

    /** Retrieves the id of this attribute. */
    @stub
    def getID(): String = ???

    /** Determines whether this attribute's values are ordered. */
    @stub
    def isOrdered(): Boolean = ???

    /** Removes an attribute value from the ordered list of attribute values. */
    @stub
    def remove(ix: Int): Any = ???

    /** Removes a specified value from the attribute. */
    @stub
    def remove(attrval: Any): Boolean = ???

    /** Sets an attribute value in the ordered list of attribute values. */
    @stub
    def set(ix: Int, attrVal: Any): Any = ???

    /** Retrieves the number of values in this attribute. */
    @stub
    def size(): Int = ???
}

object Attribute {
    /** Use serialVersionUID from JNDI 1.1.1 for interoperability. */
    @stub
    val serialVersionUID: Long = ???
}
