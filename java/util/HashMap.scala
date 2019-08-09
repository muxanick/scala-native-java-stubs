package java.util

import java.io.Serializable
import java.lang.{Cloneable, Object}
import java.util.function.{BiConsumer, BiFunction, Function}
import scala.scalanative.annotation.stub

/** Hash table based implementation of the Map interface.  This
 *  implementation provides all of the optional map operations, and permits
 *  null values and the null key.  (The HashMap
 *  class is roughly equivalent to Hashtable, except that it is
 *  unsynchronized and permits nulls.)  This class makes no guarantees as to
 *  the order of the map; in particular, it does not guarantee that the order
 *  will remain constant over time.
 * 
 *  This implementation provides constant-time performance for the basic
 *  operations (get and put), assuming the hash function
 *  disperses the elements properly among the buckets.  Iteration over
 *  collection views requires time proportional to the "capacity" of the
 *  HashMap instance (the number of buckets) plus its size (the number
 *  of key-value mappings).  Thus, it's very important not to set the initial
 *  capacity too high (or the load factor too low) if iteration performance is
 *  important.
 * 
 *  An instance of HashMap has two parameters that affect its
 *  performance: initial capacity and load factor.  The
 *  capacity is the number of buckets in the hash table, and the initial
 *  capacity is simply the capacity at the time the hash table is created.  The
 *  load factor is a measure of how full the hash table is allowed to
 *  get before its capacity is automatically increased.  When the number of
 *  entries in the hash table exceeds the product of the load factor and the
 *  current capacity, the hash table is rehashed (that is, internal data
 *  structures are rebuilt) so that the hash table has approximately twice the
 *  number of buckets.
 * 
 *  As a general rule, the default load factor (.75) offers a good
 *  tradeoff between time and space costs.  Higher values decrease the
 *  space overhead but increase the lookup cost (reflected in most of
 *  the operations of the HashMap class, including
 *  get and put).  The expected number of entries in
 *  the map and its load factor should be taken into account when
 *  setting its initial capacity, so as to minimize the number of
 *  rehash operations.  If the initial capacity is greater than the
 *  maximum number of entries divided by the load factor, no rehash
 *  operations will ever occur.
 * 
 *  If many mappings are to be stored in a HashMap
 *  instance, creating it with a sufficiently large capacity will allow
 *  the mappings to be stored more efficiently than letting it perform
 *  automatic rehashing as needed to grow the table.  Note that using
 *  many keys with the same hashCode() is a sure way to slow
 *  down performance of any hash table. To ameliorate impact, when keys
 *  are Comparable, this class may use comparison order among
 *  keys to help break ties.
 * 
 *  Note that this implementation is not synchronized.
 *  If multiple threads access a hash map concurrently, and at least one of
 *  the threads modifies the map structurally, it must be
 *  synchronized externally.  (A structural modification is any operation
 *  that adds or deletes one or more mappings; merely changing the value
 *  associated with a key that an instance already contains is not a
 *  structural modification.)  This is typically accomplished by
 *  synchronizing on some object that naturally encapsulates the map.
 * 
 *  If no such object exists, the map should be "wrapped" using the
 *  Collections.synchronizedMap
 *  method.  This is best done at creation time, to prevent accidental
 *  unsynchronized access to the map:
 *    Map m = Collections.synchronizedMap(new HashMap(...));
 * 
 *  The iterators returned by all of this class's "collection view methods"
 *  are fail-fast: if the map is structurally modified at any time after
 *  the iterator is created, in any way except through the iterator's own
 *  remove method, the iterator will throw a
 *  ConcurrentModificationException.  Thus, in the face of concurrent
 *  modification, the iterator fails quickly and cleanly, rather than risking
 *  arbitrary, non-deterministic behavior at an undetermined time in the
 *  future.
 * 
 *  Note that the fail-fast behavior of an iterator cannot be guaranteed
 *  as it is, generally speaking, impossible to make any hard guarantees in the
 *  presence of unsynchronized concurrent modification.  Fail-fast iterators
 *  throw ConcurrentModificationException on a best-effort basis.
 *  Therefore, it would be wrong to write a program that depended on this
 *  exception for its correctness: the fail-fast behavior of iterators
 *  should be used only to detect bugs.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class HashMap[K, V] extends AbstractMap[K, V] with Map[K, V] with Cloneable with Serializable {

    /** Constructs an empty HashMap with the default initial capacity
     *  (16) and the default load factor (0.75).
     */
    @stub
    def this() = ???

    /** Constructs an empty HashMap with the specified initial
     *  capacity and the default load factor (0.75).
     */
    @stub
    def this(initialCapacity: Int) = ???

    /** Constructs an empty HashMap with the specified initial
     *  capacity and load factor.
     */
    @stub
    def this(initialCapacity: Int, loadFactor: Float) = ???

    /** Constructs a new HashMap with the same mappings as the
     *  specified Map.
     */
    @stub
    def this(m: Map[_ <: K, _ <: V]) = ???

    /** Removes all of the mappings from this map. */
    @stub
    def clear(): Unit = ???

    /** Returns a shallow copy of this HashMap instance: the keys and
     *  values themselves are not cloned.
     */
    @stub
    def clone(): Object = ???

    /** Attempts to compute a mapping for the specified key and its current
     *  mapped value (or null if there is no current mapping).
     */
    @stub
    def compute(key: K, remappingFunction: BiFunction[_ >: K, _ >: V, _ <: V]): V = ???

    /** If the specified key is not already associated with a value (or is mapped
     *  to null), attempts to compute its value using the given mapping
     *  function and enters it into this map unless null.
     */
    @stub
    def computeIfAbsent(key: K, mappingFunction: Function[_ >: K, _ <: V]): V = ???

    /** If the value for the specified key is present and non-null, attempts to
     *  compute a new mapping given the key and its current mapped value.
     */
    @stub
    def computeIfPresent(key: K, remappingFunction: BiFunction[_ >: K, _ >: V, _ <: V]): V = ???

    /** Returns true if this map contains a mapping for the
     *  specified key.
     */
    @stub
    def containsKey(key: Object): Boolean = ???

    /** Returns true if this map maps one or more keys to the
     *  specified value.
     */
    @stub
    def containsValue(value: Object): Boolean = ???

    /** Returns a Set view of the mappings contained in this map. */
    @stub
    def entrySet(): Set[Map.Entry[K, V]] = ???

    /** Performs the given action for each entry in this map until all entries
     *  have been processed or the action throws an exception.
     */
    @stub
    def forEach(action: BiConsumer[_ >: K, _ >: V]): Unit = ???

    /** Returns the value to which the specified key is mapped,
     *  or null if this map contains no mapping for the key.
     */
    @stub
    def get(key: Object): V = ???

    /** Returns the value to which the specified key is mapped, or
     *  defaultValue if this map contains no mapping for the key.
     */
    @stub
    def getOrDefault(key: Object, defaultValue: V): V = ???

    /** Returns true if this map contains no key-value mappings. */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns a Set view of the keys contained in this map. */
    @stub
    def keySet(): Set[K] = ???

    /** If the specified key is not already associated with a value or is
     *  associated with null, associates it with the given non-null value.
     */
    @stub
    def merge(key: K, value: V, remappingFunction: BiFunction[_ >: V, _ >: V, _ <: V]): V = ???

    /** Associates the specified value with the specified key in this map. */
    @stub
    def put(key: K, value: V): V = ???

    /** Copies all of the mappings from the specified map to this map. */
    @stub
    def putAll(m: Map[_ <: K, _ <: V]): Unit = ???

    /** If the specified key is not already associated with a value (or is mapped
     *  to null) associates it with the given value and returns
     *  null, else returns the current value.
     */
    @stub
    def putIfAbsent(key: K, value: V): V = ???

    /** Removes the mapping for the specified key from this map if present. */
    @stub
    def remove(key: Object): V = ???

    /** Removes the entry for the specified key only if it is currently
     *  mapped to the specified value.
     */
    @stub
    def remove(key: Object, value: Object): Boolean = ???

    /** Replaces the entry for the specified key only if it is
     *  currently mapped to some value.
     */
    @stub
    def replace(key: K, value: V): V = ???

    /** Replaces the entry for the specified key only if currently
     *  mapped to the specified value.
     */
    @stub
    def replace(key: K, oldValue: V, newValue: V): Boolean = ???

    /** Replaces each entry's value with the result of invoking the given
     *  function on that entry until all entries have been processed or the
     *  function throws an exception.
     */
    @stub
    def replaceAll(function: BiFunction[_ >: K, _ >: V, _ <: V]): Unit = ???

    /** Returns the number of key-value mappings in this map. */
    @stub
    def size(): Int = ???

    /** Returns a Collection view of the values contained in this map. */
    @stub
    def values(): Collection[V] = ???
}
