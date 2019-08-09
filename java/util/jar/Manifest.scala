package java.util.jar

import java.io.InputStream
import java.lang.{Cloneable, Object, String}
import java.util.Map

// The Manifest class is used to maintain Manifest entry names and their
// associated Attributes. There are main Manifest Attributes as well as
// per-entry Attributes. For information on the Manifest format, please
// see the
// 
// Manifest format specification.
class Manifest extends Object with Cloneable {

    @stub
    // Constructs a new, empty Manifest.
    def this() = ???

    @stub
    // Constructs a new Manifest from the specified input stream.
    def this(is: InputStream) = ???

    @stub
    // Clears the main Attributes as well as the entries in this Manifest.
    def clear(): Unit = ???

    @stub
    // Returns a shallow copy of this Manifest.
    def clone(): Object = ???

    @stub
    // Returns true if the specified Object is also a Manifest and has
    // the same main Attributes and entries.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns the Attributes for the specified entry name.
    def getAttributes(name: String): Attributes = ???

    @stub
    // Returns a Map of the entries contained in this Manifest.
    def getEntries(): Map[String, Attributes] = ???

    @stub
    // Returns the main Attributes for the Manifest.
    def getMainAttributes(): Attributes = ???

    @stub
    // Returns the hash code for this Manifest.
    def hashCode(): Int = ???

    @stub
    // Reads the Manifest from the specified InputStream.
    def read(is: InputStream): Unit = ???
}
