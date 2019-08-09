package java.util.concurrent

import java.io.Serializable
import java.lang.{Cloneable, Object}
import java.util.{AbstractMap, Comparator, Map, Map.Entry, NavigableSet, Set}
import java.util.function.{BiConsumer, BiFunction, Function}

/** A scalable concurrent ConcurrentNavigableMap implementation.
 *  The map is sorted according to the natural
 *  ordering of its keys, or by a Comparator provided at map
 *  creation time, depending on which constructor is used.
 * 
 *  This class implements a concurrent variant of SkipLists
 *  providing expected average log(n) time cost for the
 *  containsKey, get, put and
 *  remove operations and their variants.  Insertion, removal,
 *  update, and access operations safely execute concurrently by
 *  multiple threads.
 * 
 *  Iterators and spliterators are
 *  weakly consistent.
 * 
 *  Ascending key ordered views and their iterators are faster than
 *  descending ones.
 * 
 *  All Map.Entry pairs returned by methods in this class
 *  and its views represent snapshots of mappings at the time they were
 *  produced. They do not support the Entry.setValue
 *  method. (Note however that it is possible to change mappings in the
 *  associated map using put, putIfAbsent, or
 *  replace, depending on exactly which effect you need.)
 * 
 *  Beware that, unlike in most collections, the size
 *  method is not a constant-time operation. Because of the
 *  asynchronous nature of these maps, determining the current number
 *  of elements requires a traversal of the elements, and so may report
 *  inaccurate results if this collection is modified during traversal.
 *  Additionally, the bulk operations putAll, equals,
 *  toArray, containsValue, and clear are
 *  not guaranteed to be performed atomically. For example, an
 *  iterator operating concurrently with a putAll operation
 *  might view only some of the added elements.
 * 
 *  This class and its views and iterators implement all of the
 *  optional methods of the Map and Iterator
 *  interfaces. Like most other concurrent collections, this class does
 *  not permit the use of null keys or values because some
 *  null return values cannot be reliably distinguished from the absence of
 *  elements.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class ConcurrentSkipListMap[K, V] extends AbstractMap[K, V] with ConcurrentNavigableMap[K, V] with Cloneable with Serializable {

    /** Constructs a new, empty map, sorted according to the
     *  natural ordering of the keys.
     */
    @stub
    def this() = ???

    /** Constructs a new, empty map, sorted according to the specified
     *  comparator.
     */
    @stub
    def this(comparator: Comparator[_ >: K]) = ???

    /** Constructs a new map containing the same mappings as the given map,
     *  sorted according to the natural ordering of
     *  the keys.
     */
    @stub
    def this(m: Map[_ <: K, _ <: V]) = ???

    /** Returns a key-value mapping associated with the least key
     *  greater than or equal to the given key, or null if
     *  there is no such entry.
     */
    @stub
    def ceilingEntry(key: K): Map.Entry[K, V] = ???

    /** Returns the least key greater than or equal to the given key,
     *  or null if there is no such key.
     */
    @stub
    def ceilingKey(key: K): K = ???

    /** Removes all of the mappings from this map. */
    @stub
    def clear(): Unit = ???

    /** Returns a shallow copy of this ConcurrentSkipListMap
     *  instance.
     */
    @stub
    def clone(): ConcurrentSkipListMap[K, V] = ???

    /** Returns the comparator used to order the keys in this map, or
     *  null if this map uses the natural ordering of its keys.
     */
    @stub
    def comparator(): Comparator[_ >: K] = ???

    /** Attempts to compute a mapping for the specified key and its
     *  current mapped value (or null if there is no current
     *  mapping).
     */
    @stub
    def compute(key: K, remappingFunction: BiFunction[_ >: K, _ >: V, _ <: V]): V = ???

    /** If the specified key is not already associated with a value,
     *  attempts to compute its value using the given mapping function
     *  and enters it into this map unless null.
     */
    @stub
    def computeIfAbsent(key: K, mappingFunction: Function[_ >: K, _ <: V]): V = ???

    /** If the value for the specified key is present, attempts to
     *  compute a new mapping given the key and its current mapped
     *  value.
     */
    @stub
    def computeIfPresent(key: K, remappingFunction: BiFunction[_ >: K, _ >: V, _ <: V]): V = ???

    /** Returns true if this map contains a mapping for the specified
     *  key.
     */
    @stub
    def containsKey(key: Object): Boolean = ???

    /** Returns true if this map maps one or more keys to the
     *  specified value.
     */
    @stub
    def containsValue(value: Object): Boolean = ???

    /** Returns a reverse order NavigableSet view of the keys contained in this map. */
    @stub
    def descendingKeySet(): NavigableSet[K] = ???

    /** Returns a reverse order view of the mappings contained in this map. */
    @stub
    def descendingMap(): ConcurrentNavigableMap[K, V] = ???

    /** Returns a Set view of the mappings contained in this map. */
    @stub
    def entrySet(): Set[Map.Entry[K, V]] = ???

    /** Compares the specified object with this map for equality. */
    @stub
    def equals(o: Object): Boolean = ???

    /** Returns a key-value mapping associated with the least
     *  key in this map, or null if the map is empty.
     */
    @stub
    def firstEntry(): Map.Entry[K, V] = ???

    /** Returns the first (lowest) key currently in this map. */
    @stub
    def firstKey(): K = ???

    /** Returns a key-value mapping associated with the greatest key
     *  less than or equal to the given key, or null if there
     *  is no such key.
     */
    @stub
    def floorEntry(key: K): Map.Entry[K, V] = ???

    /** Returns the greatest key less than or equal to the given key,
     *  or null if there is no such key.
     */
    @stub
    def floorKey(key: K): K = ???

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

    /** Returns the value to which the specified key is mapped,
     *  or the given defaultValue if this map contains no mapping for the key.
     */
    @stub
    def getOrDefault(key: Object, defaultValue: V): V = ???

    /** Returns a view of the portion of this map whose keys are
     *  strictly less than toKey.
     */
    @stub
    def headMap(toKey: K): ConcurrentNavigableMap[K, V] = ???

    /** Returns a view of the portion of this map whose keys are less than (or
     *  equal to, if inclusive is true) toKey.
     */
    @stub
    def headMap(toKey: K, inclusive: Boolean): ConcurrentNavigableMap[K, V] = ???

    /** Returns a key-value mapping associated with the least key
     *  strictly greater than the given key, or null if there
     *  is no such key.
     */
    @stub
    def higherEntry(key: K): Map.Entry[K, V] = ???

    /** Returns the least key strictly greater than the given key, or
     *  null if there is no such key.
     */
    @stub
    def higherKey(key: K): K = ???

    /** Returns true if this map contains no key-value mappings. */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns a NavigableSet view of the keys contained in this map. */
    @stub
    def keySet(): NavigableSet[K] = ???

    /** Returns a key-value mapping associated with the greatest
     *  key in this map, or null if the map is empty.
     */
    @stub
    def lastEntry(): Map.Entry[K, V] = ???

    /** Returns the last (highest) key currently in this map. */
    @stub
    def lastKey(): K = ???

    /** Returns a key-value mapping associated with the greatest key
     *  strictly less than the given key, or null if there is
     *  no such key.
     */
    @stub
    def lowerEntry(key: K): Map.Entry[K, V] = ???

    /** Returns the greatest key strictly less than the given key, or
     *  null if there is no such key.
     */
    @stub
    def lowerKey(key: K): K = ???

    /** If the specified key is not already associated with a value,
     *  associates it with the given value.
     */
    @stub
    def merge(key: K, value: V, remappingFunction: BiFunction[_ >: V, _ >: V, _ <: V]): V = ???

    /** Returns a NavigableSet view of the keys contained in this map. */
    @stub
    def navigableKeySet(): NavigableSet[K] = ???

    /** Removes and returns a key-value mapping associated with
     *  the least key in this map, or null if the map is empty.
     */
    @stub
    def pollFirstEntry(): Map.Entry[K, V] = ???

    /** Removes and returns a key-value mapping associated with
     *  the greatest key in this map, or null if the map is empty.
     */
    @stub
    def pollLastEntry(): Map.Entry[K, V] = ???

    /** Associates the specified value with the specified key in this map. */
    @stub
    def put(key: K, value: V): V = ???

    /** If the specified key is not already associated
     *  with a value, associate it with the given value.
     */
    @stub
    def putIfAbsent(key: K, value: V): V = ???

    /** Removes the mapping for the specified key from this map if present. */
    @stub
    def remove(key: Object): V = ???

    /** Removes the entry for a key only if currently mapped to a given value. */
    @stub
    def remove(key: Object, value: Object): Boolean = ???

    /** Replaces the entry for a key only if currently mapped to some value. */
    @stub
    def replace(key: K, value: V): V = ???

    /** Replaces the entry for a key only if currently mapped to a given value. */
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

    /** Returns a view of the portion of this map whose keys range from
     *  fromKey to toKey.
     */
    @stub
    def subMap(fromKey: K, fromInclusive: Boolean, toKey: K, toInclusive: Boolean): ConcurrentNavigableMap[K, V] = ???

    /** Returns a view of the portion of this map whose keys range from
     *  fromKey, inclusive, to toKey, exclusive.
     */
    @stub
    def subMap(fromKey: K, toKey: K): ConcurrentNavigableMap[K, V] = ???

    /** Returns a view of the portion of this map whose keys are
     *  greater than or equal to fromKey.
     */
    @stub
    def tailMap(fromKey: K): ConcurrentNavigableMap[K, V] = ???

    /** Returns a view of the portion of this map whose keys are greater than (or
     *  equal to, if inclusive is true) fromKey.
     */
    @stub
    def tailMap(fromKey: K, inclusive: Boolean): ConcurrentNavigableMap[K, V] = ???
}
