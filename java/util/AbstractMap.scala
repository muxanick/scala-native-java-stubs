package java.util

import java.lang.{Object, String}

// This class provides a skeletal implementation of the Map
// interface, to minimize the effort required to implement this interface.
//
// To implement an unmodifiable map, the programmer needs only to extend this
// class and provide an implementation for the entrySet method, which
// returns a set-view of the map's mappings.  Typically, the returned set
// will, in turn, be implemented atop AbstractSet.  This set should
// not support the add or remove methods, and its iterator
// should not support the remove method.
//
// To implement a modifiable map, the programmer must additionally override
// this class's put method (which otherwise throws an
// UnsupportedOperationException), and the iterator returned by
// entrySet().iterator() must additionally implement its
// remove method.
//
// The programmer should generally provide a void (no argument) and map
// constructor, as per the recommendation in the Map interface
// specification.
//
// The documentation for each non-abstract method in this class describes its
// implementation in detail.  Each of these methods may be overridden if the
// map being implemented admits a more efficient implementation.
//
// This class is a member of the
// 
// Java Collections Framework.
abstract class AbstractMap[K, V] extends Object with Map[K, V] {

    // Removes all of the mappings from this map (optional operation).
    def clear(): Unit

    // Returns a shallow copy of this AbstractMap instance: the keys
    // and values themselves are not cloned.
    protected def clone(): Object

    // Returns true if this map contains a mapping for the specified
    // key.
    def containsKey(key: Object): Boolean

    // Returns true if this map maps one or more keys to the
    // specified value.
    def containsValue(value: Object): Boolean

    // Returns a Set view of the mappings contained in this map.
    def entrySet(): Set[Map.Entry[K, V]]

    // Compares the specified object with this map for equality.
    def equals(o: Object): Boolean

    // Returns the value to which the specified key is mapped,
    // or null if this map contains no mapping for the key.
    def get(key: Object): V

    // Returns the hash code value for this map.
    def hashCode(): Int

    // Returns true if this map contains no key-value mappings.
    def isEmpty(): Boolean

    // Returns a Set view of the keys contained in this map.
    def keySet(): Set[K]

    // Associates the specified value with the specified key in this map
    // (optional operation).
    def put(key: K, value: V): V

    // Copies all of the mappings from the specified map to this map
    // (optional operation).
    def putAll(m: Map[_ <: K, _ <: V]): Unit

    // Removes the mapping for a key from this map if it is present
    // (optional operation).
    def remove(key: Object): V

    // Returns the number of key-value mappings in this map.
    def size(): Int

    // Returns a string representation of this map.
    def toString(): String
}

object AbstractMap {
    @stub
    // An Entry maintaining a key and a value.
    def AbstractMap.SimpleEntry[K, V]: class = ???
}
