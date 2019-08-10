package java.util

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class provides a skeletal implementation of the Map
 *  interface, to minimize the effort required to implement this interface.
 * 
 *  To implement an unmodifiable map, the programmer needs only to extend this
 *  class and provide an implementation for the entrySet method, which
 *  returns a set-view of the map's mappings.  Typically, the returned set
 *  will, in turn, be implemented atop AbstractSet.  This set should
 *  not support the add or remove methods, and its iterator
 *  should not support the remove method.
 * 
 *  To implement a modifiable map, the programmer must additionally override
 *  this class's put method (which otherwise throws an
 *  UnsupportedOperationException), and the iterator returned by
 *  entrySet().iterator() must additionally implement its
 *  remove method.
 * 
 *  The programmer should generally provide a void (no argument) and map
 *  constructor, as per the recommendation in the Map interface
 *  specification.
 * 
 *  The documentation for each non-abstract method in this class describes its
 *  implementation in detail.  Each of these methods may be overridden if the
 *  map being implemented admits a more efficient implementation.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
abstract class AbstractMap[K, V] extends Object with Map[K, V] {

    /** Sole constructor. */
    @stub
    protected def this() = ???

    /** Removes all of the mappings from this map (optional operation). */
    def clear(): Unit

    /** Returns a shallow copy of this AbstractMap instance: the keys
     *  and values themselves are not cloned.
     */
    protected def clone(): Any

    /** Returns true if this map contains a mapping for the specified
     *  key.
     */
    def containsKey(key: Any): Boolean

    /** Returns true if this map maps one or more keys to the
     *  specified value.
     */
    def containsValue(value: Any): Boolean

    /** Returns a Set view of the mappings contained in this map. */
    def entrySet(): Set[Map.Entry[K, V]]

    /** Compares the specified object with this map for equality. */
    def equals(o: Any): Boolean

    /** Returns the value to which the specified key is mapped,
     *  or null if this map contains no mapping for the key.
     */
    def get(key: Any): V

    /** Returns the hash code value for this map. */
    def hashCode(): Int

    /** Returns true if this map contains no key-value mappings. */
    def isEmpty(): Boolean

    /** Returns a Set view of the keys contained in this map. */
    def keySet(): Set[K]

    /** Associates the specified value with the specified key in this map
     *  (optional operation).
     */
    def put(key: K, value: V): V

    /** Copies all of the mappings from the specified map to this map
     *  (optional operation).
     */
    def putAll(m: Map[_ <: K, _ <: V]): Unit

    /** Removes the mapping for a key from this map if it is present
     *  (optional operation).
     */
    def remove(key: Any): V

    /** Returns the number of key-value mappings in this map. */
    def size(): Int

    /** Returns a string representation of this map. */
    def toString(): String

    /** Returns a Collection view of the values contained in this map. */
    def values(): Collection[V]
}

object AbstractMap {
    /** An Entry maintaining a key and a value.  The value may be
     *  changed using the setValue method.  This class
     *  facilitates the process of building custom map
     *  implementations. For example, it may be convenient to return
     *  arrays of SimpleEntry instances in method
     *  Map.entrySet().toArray.
     */
    object SimpleEntry[K, V] extends Object with Map.Entry[K, V] with Serializable {

        /** Creates an entry representing a mapping from the specified
         *  key to the specified value.
         */
        @stub
        def apply(key: K, value: V) = ???

        /** Creates an entry representing the same mapping as the
         *  specified entry.
         */
        @stub
        def apply(entry: Map.Entry[_ <: K, _ <: V]) = ???

        /** Compares the specified object with this entry for equality. */
        @stub
        def equals(o: Any): Boolean = ???

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


    /** An Entry maintaining an immutable key and value.  This class
     *  does not support method setValue.  This class may be
     *  convenient in methods that return thread-safe snapshots of
     *  key-value mappings.
     */
    object SimpleImmutableEntry[K, V] extends Object with Map.Entry[K, V] with Serializable {

        /** Creates an entry representing a mapping from the specified
         *  key to the specified value.
         */
        @stub
        def apply(key: K, value: V) = ???

        /** Creates an entry representing the same mapping as the
         *  specified entry.
         */
        @stub
        def apply(entry: Map.Entry[_ <: K, _ <: V]) = ???

        /** Compares the specified object with this entry for equality. */
        @stub
        def equals(o: Any): Boolean = ???

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

}
