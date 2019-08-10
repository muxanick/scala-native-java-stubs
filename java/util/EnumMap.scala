package java.util

import java.io.Serializable
import java.lang.{Class, Cloneable, Enum, Object}
import scala.scalanative.annotation.stub

/** A specialized Map implementation for use with enum type keys.  All
 *  of the keys in an enum map must come from a single enum type that is
 *  specified, explicitly or implicitly, when the map is created.  Enum maps
 *  are represented internally as arrays.  This representation is extremely
 *  compact and efficient.
 * 
 *  Enum maps are maintained in the natural order of their keys
 *  (the order in which the enum constants are declared).  This is reflected
 *  in the iterators returned by the collections views (keySet(),
 *  entrySet(), and values()).
 * 
 *  Iterators returned by the collection views are weakly consistent:
 *  they will never throw ConcurrentModificationException and they may
 *  or may not show the effects of any modifications to the map that occur while
 *  the iteration is in progress.
 * 
 *  Null keys are not permitted.  Attempts to insert a null key will
 *  throw NullPointerException.  Attempts to test for the
 *  presence of a null key or to remove one will, however, function properly.
 *  Null values are permitted.
 * 
 *  Like most collection implementations EnumMap is not
 *  synchronized. If multiple threads access an enum map concurrently, and at
 *  least one of the threads modifies the map, it should be synchronized
 *  externally.  This is typically accomplished by synchronizing on some
 *  object that naturally encapsulates the enum map.  If no such object exists,
 *  the map should be "wrapped" using the Collections.synchronizedMap(java.util.Map<K, V>)
 *  method.  This is best done at creation time, to prevent accidental
 *  unsynchronized access:
 * 
 *  
 *      Map<EnumKey, V> m
 *          = Collections.synchronizedMap(new EnumMap<EnumKey, V>(...));
 *  
 * 
 *  Implementation note: All basic operations execute in constant time.
 *  They are likely (though not guaranteed) to be faster than their
 *  HashMap counterparts.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class EnumMap[K <: Enum[K], V] extends AbstractMap[K, V] with Serializable with Cloneable {

    /** Creates an empty enum map with the specified key type. */
    @stub
    def this(keyType: Class[K]) = ???

    /** Creates an enum map with the same key type as the specified enum
     *  map, initially containing the same mappings (if any).
     */
    @stub
    def this(m: EnumMap[K, _ <: V]) = ???

    /** Creates an enum map initialized from the specified map. */
    @stub
    def this(m: Map[K, _ <: V]) = ???

    /** Removes all mappings from this map. */
    @stub
    def clear(): Unit = ???

    /** Returns a shallow copy of this enum map. */
    @stub
    def clone(): EnumMap[K, V] = ???

    /** Returns true if this map contains a mapping for the specified
     *  key.
     */
    @stub
    def containsKey(key: Any): Boolean = ???

    /** Returns true if this map maps one or more keys to the
     *  specified value.
     */
    @stub
    def containsValue(value: Any): Boolean = ???

    /** Returns a Set view of the mappings contained in this map. */
    @stub
    def entrySet(): Set[Map.Entry[K, V]] = ???

    /** Compares the specified object with this map for equality. */
    @stub
    def equals(o: Any): Boolean = ???

    /** Returns the value to which the specified key is mapped,
     *  or null if this map contains no mapping for the key.
     */
    @stub
    def get(key: Any): V = ???

    /** Returns the hash code value for this map. */
    @stub
    def hashCode(): Int = ???

    /** Returns a Set view of the keys contained in this map. */
    @stub
    def keySet(): Set[K] = ???

    /** Associates the specified value with the specified key in this map. */
    @stub
    def put(key: K, value: V): V = ???

    /** Copies all of the mappings from the specified map to this map. */
    @stub
    def putAll(m: Map[_ <: K, _ <: V]): Unit = ???

    /** Removes the mapping for this key from this map if present. */
    @stub
    def remove(key: Any): V = ???

    /** Returns the number of key-value mappings in this map. */
    @stub
    def size(): Int = ???

    /** Returns a Collection view of the values contained in this map. */
    @stub
    def values(): Collection[V] = ???
}
