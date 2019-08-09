package java.util

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** An Entry maintaining an immutable key and value.  This class
 *  does not support method setValue.  This class may be
 *  convenient in methods that return thread-safe snapshots of
 *  key-value mappings.
 */
object AbstractMap.SimpleImmutableEntry[K, V] extends Object with Map.Entry[K, V] with Serializable {

    /** Creates an entry representing a mapping from the specified
     *  key to the specified value.
     */
    @stub
    def SimpleImmutableEntry(key: K, value: V) = ???

    /** Creates an entry representing the same mapping as the
     *  specified entry.
     */
    @stub
    def SimpleImmutableEntry(entry: Map.Entry[_ <: K, _ <: V]) = ???

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
     *  value (optional operation).
     */
    @stub
    def setValue(value: V): V = ???

    /** Returns a String representation of this map entry. */
    @stub
    def toString(): String = ???
}
