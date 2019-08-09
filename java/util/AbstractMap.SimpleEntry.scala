package java.util

import java.io.Serializable
import java.lang.Object

// An Entry maintaining a key and a value.  The value may be
// changed using the setValue method.  This class
// facilitates the process of building custom map
// implementations. For example, it may be convenient to return
// arrays of SimpleEntry instances in method
// Map.entrySet().toArray.
object AbstractMap.SimpleEntry[K, V] extends Object with Map.Entry[K, V], with Serializable {

    @stub
    // Creates an entry representing a mapping from the specified
    // key to the specified value.
    def SimpleEntry(key: K, value: V) = ???

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
    // value.
    def setValue(value: V): V = ???
}
