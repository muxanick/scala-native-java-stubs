package java.util

import java.io.Serializable
import java.lang.Object

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
}
