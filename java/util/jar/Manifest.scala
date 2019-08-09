package java.util.jar

import java.io.InputStream
import java.lang.{Cloneable, Object, String}
import java.util.Map

/** The Manifest class is used to maintain Manifest entry names and their
 *  associated Attributes. There are main Manifest Attributes as well as
 *  per-entry Attributes. For information on the Manifest format, please
 *  see the
 *  
 *  Manifest format specification.
 */
class Manifest extends Object with Cloneable {

    /** Constructs a new, empty Manifest. */
    @stub
    def this() = ???

    /** Constructs a new Manifest from the specified input stream. */
    @stub
    def this(is: InputStream) = ???

    /** Clears the main Attributes as well as the entries in this Manifest. */
    @stub
    def clear(): Unit = ???

    /** Returns a shallow copy of this Manifest. */
    @stub
    def clone(): Object = ???

    /** Returns true if the specified Object is also a Manifest and has
     *  the same main Attributes and entries.
     */
    @stub
    def equals(o: Object): Boolean = ???

    /** Returns the Attributes for the specified entry name. */
    @stub
    def getAttributes(name: String): Attributes = ???

    /** Returns a Map of the entries contained in this Manifest. */
    @stub
    def getEntries(): Map[String, Attributes] = ???

    /** Returns the main Attributes for the Manifest. */
    @stub
    def getMainAttributes(): Attributes = ???

    /** Returns the hash code for this Manifest. */
    @stub
    def hashCode(): Int = ???

    /** Reads the Manifest from the specified InputStream. */
    @stub
    def read(is: InputStream): Unit = ???
}
