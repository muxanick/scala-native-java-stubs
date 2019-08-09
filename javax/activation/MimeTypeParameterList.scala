package javax.activation

import java.lang.{Object, String}
import java.util.Enumeration

/** A parameter list of a MimeType
 *  as defined in RFC 2045 and 2046. The Primary type of the
 *  object must already be stripped off.
 */
class MimeTypeParameterList extends Object {

    /** Default constructor. */
    @stub
    def this() = ???

    /** Retrieve the value associated with the given name, or null if there
     *  is no current association.
     */
    @stub
    def get(name: String): String = ???

    /** Retrieve an enumeration of all the names in this list. */
    @stub
    def getNames(): Enumeration = ???

    /** Determine whether or not this list is empty. */
    @stub
    def isEmpty(): Boolean = ???

    /** A routine for parsing the parameter list out of a String. */
    @stub
    protected def parse(parameterList: String): Unit = ???

    /** Remove any value associated with the given name. */
    @stub
    def remove(name: String): Unit = ???

    /** Set the value to be associated with the given name, replacing
     *  any previous association.
     */
    @stub
    def set(name: String, value: String): Unit = ???

    /** Return the number of name-value pairs in this list. */
    @stub
    def size(): Int = ???
}
