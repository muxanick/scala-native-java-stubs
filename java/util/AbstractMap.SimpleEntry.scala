package java.util

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** An Entry maintaining a key and a value.  The value may be
 *  changed using the setValue method.  This class
 *  facilitates the process of building custom map
 *  implementations. For example, it may be convenient to return
 *  arrays of SimpleEntry instances in method
 *  Map.entrySet().toArray.
 */
object AbstractMap.SimpleEntry[K, V] extends Object with Map.Entry[K, V] with Serializable {

    /** Creates an entry representing a mapping from the specified
     *  key to the specified value.
     */
    @stub
    def SimpleEntry(key: K, value: V) = ???

    /** Creates an entry representing the same mapping as the
     *  specified entry.
     */
    @stub
    def SimpleEntry(entry: Map.Entry[_ <: K, _ <: V]) = ???

    /** Compares the specified object with this entry for equality. */
    @stub
    def equals(o: Object): Boolean = ???

    /** Returns the key corresponding to this entry. */
    @stub
    def getKey(): K = ???

    /** Returns the value corresponding to this entry. */
    @stub
    def getValue(): V = ???

    /** Returns the hash code value for this map entry. */
    @stub
    def hashCode(): Int = ???

    /** Replaces the value corresponding to this entry with the specified
     *  value.
     */
    @stub
    def setValue(value: V): V = ???

    /** Returns a String representation of this map entry. */
    @stub
    def toString(): String = ???
}
