package javax.activation

import java.lang.{Object, String}
import java.util.Enumeration

// A parameter list of a MimeType
// as defined in RFC 2045 and 2046. The Primary type of the
// object must already be stripped off.
class MimeTypeParameterList extends Object {

    @stub
    // Default constructor.
    def this() = ???

    @stub
    // Retrieve the value associated with the given name, or null if there
    // is no current association.
    def get(name: String): String = ???

    @stub
    // Retrieve an enumeration of all the names in this list.
    def getNames(): Enumeration = ???

    @stub
    // Determine whether or not this list is empty.
    def isEmpty(): Boolean = ???

    @stub
    // A routine for parsing the parameter list out of a String.
    protected def parse(parameterList: String): Unit = ???

    @stub
    // Remove any value associated with the given name.
    def remove(name: String): Unit = ???

    @stub
    // Set the value to be associated with the given name, replacing
    // any previous association.
    def set(name: String, value: String): Unit = ???

    @stub
    // Return the number of name-value pairs in this list.
    def size(): Int = ???
}
