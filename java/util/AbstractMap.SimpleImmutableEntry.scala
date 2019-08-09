package java.util

import java.io.Serializable
import java.lang.Object

// An Entry maintaining an immutable key and value.  This class
// does not support method setValue.  This class may be
// convenient in methods that return thread-safe snapshots of
// key-value mappings.
object AbstractMap.SimpleImmutableEntry[K, V] extends Object with Map.Entry[K, V], with Serializable {

    @stub
    // Creates an entry representing a mapping from the specified
    // key to the specified value.
    def SimpleImmutableEntry(key: K, value: V) = ???

    @stub
    // Compares the specified object with this entry for equality.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns the key corresponding to this entry.
    def getKey(): K = ???

    @stub
    // Returns the value corresponding to this entry.
    def getValue(): V = ???

    @stub
    // Returns the hash code value for this map entry.
    def hashCode(): Int = ???

    @stub
    // Replaces the value corresponding to this entry with the specified
    // value (optional operation).
    def setValue(value: V): V = ???
}
