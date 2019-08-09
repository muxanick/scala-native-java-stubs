package javax.activation

import java.io.{Externalizable, ObjectInput, ObjectOutput}
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A Multipurpose Internet Mail Extension (MIME) type, as defined
 *  in RFC 2045 and 2046.
 */
class MimeType extends Object with Externalizable {

    /** Default constructor. */
    @stub
    def this() = ???

    /** Constructor that builds a MimeType from a String. */
    @stub
    def this(rawdata: String) = ???

    /** Constructor that builds a MimeType with the given primary and sub type
     *  but has an empty parameter list.
     */
    @stub
    def this(primary: String, sub: String) = ???

    /** Return a String representation of this object
     *  without the parameter list.
     */
    @stub
    def getBaseType(): String = ???

    /** Retrieve the value associated with the given name, or null if there
     *  is no current association.
     */
    @stub
    def getParameter(name: String): String = ???

    /** Retrieve this object's parameter list. */
    @stub
    def getParameters(): MimeTypeParameterList = ???

    /** Retrieve the primary type of this object. */
    @stub
    def getPrimaryType(): String = ???

    /** Retrieve the subtype of this object. */
    @stub
    def getSubType(): String = ???

    /** Determine if the primary and sub type of this object is
     *  the same as what is in the given type.
     */
    @stub
    def match(type: MimeType): Boolean = ???

    /** Determine if the primary and sub type of this object is
     *  the same as the content type described in rawdata.
     */
    @stub
    def match(rawdata: String): Boolean = ???

    /** The object implements the readExternal method to restore its
     *  contents by calling the methods of DataInput for primitive
     *  types and readObject for objects, strings and arrays.
     */
    @stub
    def readExternal(in: ObjectInput): Unit = ???

    /** Remove any value associated with the given name. */
    @stub
    def removeParameter(name: String): Unit = ???

    /** Set the value to be associated with the given name, replacing
     *  any previous association.
     */
    @stub
    def setParameter(name: String, value: String): Unit = ???

    /** Set the primary type for this object to the given String. */
    @stub
    def setPrimaryType(primary: String): Unit = ???

    /** Set the subtype for this object to the given String. */
    @stub
    def setSubType(sub: String): Unit = ???

    /** Return the String representation of this object. */
    @stub
    def toString(): String = ???

    /** The object implements the writeExternal method to save its contents
     *  by calling the methods of DataOutput for its primitive values or
     *  calling the writeObject method of ObjectOutput for objects, strings
     *  and arrays.
     */
    @stub
    def writeExternal(out: ObjectOutput): Unit = ???
}
