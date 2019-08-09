package java.util.jar

import java.lang.{Cloneable, Object, String}
import java.util.{Map, Map.Entry, Set}

// The Attributes class maps Manifest attribute names to associated string
// values. Valid attribute names are case-insensitive, are restricted to
// the ASCII characters in the set [0-9a-zA-Z_-], and cannot exceed 70
// characters in length. Attribute values can contain any characters and
// will be UTF8-encoded when written to the output stream.  See the
// JAR File Specification
// for more information about valid attribute names and values.
class Attributes extends Object with Map[Object, Object], with Cloneable {

    @stub
    // Constructs a new, empty Attributes object with default size.
    def this() = ???

    @stub
    // Constructs a new Attributes object with the same attribute name-value
    // mappings as in the specified Attributes.
    def this(attr: Attributes) = ???

    @stub
    // Removes all attributes from this Map.
    def clear(): Unit = ???

    @stub
    // Returns a copy of the Attributes, implemented as follows:
    def clone(): Object = ???

    @stub
    // Returns true if this Map contains the specified attribute name (key).
    def containsKey(name: Object): Boolean = ???

    @stub
    // Returns true if this Map maps one or more attribute names (keys)
    // to the specified value.
    def containsValue(value: Object): Boolean = ???

    @stub
    // Returns a Collection view of the attribute name-value mappings
    // contained in this Map.
    def entrySet(): Set[Map.Entry[Object, Object]] = ???

    @stub
    // Compares the specified Attributes object with this Map for equality.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns the value of the specified attribute name, or null if the
    // attribute name was not found.
    def get(name: Object): Object = ???

    @stub
    // Returns the value of the specified Attributes.Name, or null if the
    // attribute was not found.
    def getValue(name: Attributes.Name): String = ???

    @stub
    // Returns the value of the specified attribute name, specified as
    // a string, or null if the attribute was not found.
    def getValue(name: String): String = ???

    @stub
    // Returns the hash code value for this Map.
    def hashCode(): Int = ???

    @stub
    // Returns true if this Map contains no attributes.
    def isEmpty(): Boolean = ???

    @stub
    // Returns a Set view of the attribute names (keys) contained in this Map.
    def keySet(): Set[Object] = ???

    @stub
    // Associates the specified value with the specified attribute name
    // (key) in this Map.
    def put(name: Object, value: Object): Object = ???

    @stub
    // Copies all of the attribute name-value mappings from the specified
    // Attributes to this Map.
    def putAll(attr: Map[_, _]): Unit = ???

    @stub
    // Associates the specified value with the specified attribute name,
    // specified as a String.
    def putValue(name: String, value: String): String = ???

    @stub
    // Removes the attribute with the specified name (key) from this Map.
    def remove(name: Object): Object = ???

    @stub
    // Returns the number of attributes in this Map.
    def size(): Int = ???
}
