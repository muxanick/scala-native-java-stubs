package java.util.concurrent

import java.io.Serializable
import java.lang.{Cloneable, Object}
import java.util.{AbstractMap, Comparator, Map, Map.Entry, NavigableSet, Set}
import java.util.function.{BiConsumer, BiFunction, Function}

// A scalable concurrent ConcurrentNavigableMap implementation.
// The map is sorted according to the natural
// ordering of its keys, or by a Comparator provided at map
// creation time, depending on which constructor is used.
//
// This class implements a concurrent variant of SkipLists
// providing expected average log(n) time cost for the
// containsKey, get, put and
// remove operations and their variants.  Insertion, removal,
// update, and access operations safely execute concurrently by
// multiple threads.
//
// Iterators and spliterators are
// weakly consistent.
//
// Ascending key ordered views and their iterators are faster than
// descending ones.
//
// All Map.Entry pairs returned by methods in this class
// and its views represent snapshots of mappings at the time they were
// produced. They do not support the Entry.setValue
// method. (Note however that it is possible to change mappings in the
// associated map using put, putIfAbsent, or
// replace, depending on exactly which effect you need.)
//
// Beware that, unlike in most collections, the size
// method is not a constant-time operation. Because of the
// asynchronous nature of these maps, determining the current number
// of elements requires a traversal of the elements, and so may report
// inaccurate results if this collection is modified during traversal.
// Additionally, the bulk operations putAll, equals,
// toArray, containsValue, and clear are
// not guaranteed to be performed atomically. For example, an
// iterator operating concurrently with a putAll operation
// might view only some of the added elements.
//
// This class and its views and iterators implement all of the
// optional methods of the Map and Iterator
// interfaces. Like most other concurrent collections, this class does
// not permit the use of null keys or values because some
// null return values cannot be reliably distinguished from the absence of
// elements.
//
// This class is a member of the
// 
// Java Collections Framework.
class ConcurrentSkipListMap[K, V] extends AbstractMap[K, V] with ConcurrentNavigableMap[K, V], with Cloneable, with Serializable {

    @stub
    // Constructs a new, empty map, sorted according to the
    // natural ordering of the keys.
    def this() = ???

    @stub
    // Constructs a new, empty map, sorted according to the specified
    // comparator.
    def this(comparator: Comparator[_ >: K]) = ???

    @stub
    // Constructs a new map containing the same mappings as the given map,
    // sorted according to the natural ordering of
    // the keys.
    def this(m: Map[_ <: K, _ <: V]) = ???

    @stub
    // Returns a key-value mapping associated with the least key
    // greater than or equal to the given key, or null if
    // there is no such entry.
    def ceilingEntry(key: K): Map.Entry[K, V] = ???

    @stub
    // Returns the least key greater than or equal to the given key,
    // or null if there is no such key.
    def ceilingKey(key: K): K = ???

    @stub
    // Removes all of the mappings from this map.
    def clear(): Unit = ???

    @stub
    // Returns a shallow copy of this ConcurrentSkipListMap
    // instance.
    def clone(): ConcurrentSkipListMap[K, V] = ???

    @stub
    // Returns the comparator used to order the keys in this map, or
    // null if this map uses the natural ordering of its keys.
    def comparator(): Comparator[_ >: K] = ???

    @stub
    // Attempts to compute a mapping for the specified key and its
    // current mapped value (or null if there is no current
    // mapping).
    def compute(key: K, remappingFunction: BiFunction[_ >: K, _ >: V, _ <: V]): V = ???

    @stub
    // If the specified key is not already associated with a value,
    // attempts to compute its value using the given mapping function
    // and enters it into this map unless null.
    def computeIfAbsent(key: K, mappingFunction: Function[_ >: K, _ <: V]): V = ???

    @stub
    // If the value for the specified key is present, attempts to
    // compute a new mapping given the key and its current mapped
    // value.
    def computeIfPresent(key: K, remappingFunction: BiFunction[_ >: K, _ >: V, _ <: V]): V = ???

    @stub
    // Returns true if this map contains a mapping for the specified
    // key.
    def containsKey(key: Object): Boolean = ???

    @stub
    // Returns true if this map maps one or more keys to the
    // specified value.
    def containsValue(value: Object): Boolean = ???

    @stub
    // Returns a reverse order NavigableSet view of the keys contained in this map.
    def descendingKeySet(): NavigableSet[K] = ???

    @stub
    // Returns a reverse order view of the mappings contained in this map.
    def descendingMap(): ConcurrentNavigableMap[K, V] = ???

    @stub
    // Returns a Set view of the mappings contained in this map.
    def entrySet(): Set[Map.Entry[K, V]] = ???

    @stub
    // Compares the specified object with this map for equality.
    def equals(o: Object): Boolean = ???

    @stub
    // Returns a key-value mapping associated with the least
    // key in this map, or null if the map is empty.
    def firstEntry(): Map.Entry[K, V] = ???

    @stub
    // Returns the first (lowest) key currently in this map.
    def firstKey(): K = ???

    @stub
    // Returns a key-value mapping associated with the greatest key
    // less than or equal to the given key, or null if there
    // is no such key.
    def floorEntry(key: K): Map.Entry[K, V] = ???

    @stub
    // Returns the greatest key less than or equal to the given key,
    // or null if there is no such key.
    def floorKey(key: K): K = ???

    @stub
    // Performs the given action for each entry in this map until all entries
    // have been processed or the action throws an exception.
    def forEach(action: BiConsumer[_ >: K, _ >: V]): Unit = ???

    @stub
    // Returns the value to which the specified key is mapped,
    // or null if this map contains no mapping for the key.
    def get(key: Object): V = ???

    @stub
    // Returns the value to which the specified key is mapped,
    // or the given defaultValue if this map contains no mapping for the key.
    def getOrDefault(key: Object, defaultValue: V): V = ???

    @stub
    // Returns a view of the portion of this map whose keys are
    // strictly less than toKey.
    def headMap(toKey: K): ConcurrentNavigableMap[K, V] = ???

    @stub
    // Returns a view of the portion of this map whose keys are less than (or
    // equal to, if inclusive is true) toKey.
    def headMap(toKey: K, inclusive: Boolean): ConcurrentNavigableMap[K, V] = ???

    @stub
    // Returns a key-value mapping associated with the least key
    // strictly greater than the given key, or null if there
    // is no such key.
    def higherEntry(key: K): Map.Entry[K, V] = ???

    @stub
    // Returns the least key strictly greater than the given key, or
    // null if there is no such key.
    def higherKey(key: K): K = ???

    @stub
    // Returns true if this map contains no key-value mappings.
    def isEmpty(): Boolean = ???

    @stub
    // Returns a NavigableSet view of the keys contained in this map.
    def keySet(): NavigableSet[K] = ???

    @stub
    // Returns a key-value mapping associated with the greatest
    // key in this map, or null if the map is empty.
    def lastEntry(): Map.Entry[K, V] = ???

    @stub
    // Returns the last (highest) key currently in this map.
    def lastKey(): K = ???

    @stub
    // Returns a key-value mapping associated with the greatest key
    // strictly less than the given key, or null if there is
    // no such key.
    def lowerEntry(key: K): Map.Entry[K, V] = ???

    @stub
    // Returns the greatest key strictly less than the given key, or
    // null if there is no such key.
    def lowerKey(key: K): K = ???

    @stub
    // If the specified key is not already associated with a value,
    // associates it with the given value.
    def merge(key: K, value: V, remappingFunction: BiFunction[_ >: V, _ >: V, _ <: V]): V = ???

    @stub
    // Returns a NavigableSet view of the keys contained in this map.
    def navigableKeySet(): NavigableSet[K] = ???

    @stub
    // Removes and returns a key-value mapping associated with
    // the least key in this map, or null if the map is empty.
    def pollFirstEntry(): Map.Entry[K, V] = ???

    @stub
    // Removes and returns a key-value mapping associated with
    // the greatest key in this map, or null if the map is empty.
    def pollLastEntry(): Map.Entry[K, V] = ???

    @stub
    // Associates the specified value with the specified key in this map.
    def put(key: K, value: V): V = ???

    @stub
    // If the specified key is not already associated
    // with a value, associate it with the given value.
    def putIfAbsent(key: K, value: V): V = ???

    @stub
    // Removes the mapping for the specified key from this map if present.
    def remove(key: Object): V = ???

    @stub
    // Removes the entry for a key only if currently mapped to a given value.
    def remove(key: Object, value: Object): Boolean = ???

    @stub
    // Replaces the entry for a key only if currently mapped to some value.
    def replace(key: K, value: V): V = ???

    @stub
    // Replaces the entry for a key only if currently mapped to a given value.
    def replace(key: K, oldValue: V, newValue: V): Boolean = ???

    @stub
    // Replaces each entry's value with the result of invoking the given
    // function on that entry until all entries have been processed or the
    // function throws an exception.
    def replaceAll(function: BiFunction[_ >: K, _ >: V, _ <: V]): Unit = ???

    @stub
    // Returns the number of key-value mappings in this map.
    def size(): Int = ???

    @stub
    // Returns a view of the portion of this map whose keys range from
    // fromKey to toKey.
    def subMap(fromKey: K, fromInclusive: Boolean, toKey: K, toInclusive: Boolean): ConcurrentNavigableMap[K, V] = ???

    @stub
    // Returns a view of the portion of this map whose keys range from
    // fromKey, inclusive, to toKey, exclusive.
    def subMap(fromKey: K, toKey: K): ConcurrentNavigableMap[K, V] = ???

    @stub
    // Returns a view of the portion of this map whose keys are
    // greater than or equal to fromKey.
    def tailMap(fromKey: K): ConcurrentNavigableMap[K, V] = ???

    @stub
    // Returns a view of the portion of this map whose keys are greater than (or
    // equal to, if inclusive is true) fromKey.
    def tailMap(fromKey: K, inclusive: Boolean): ConcurrentNavigableMap[K, V] = ???
}
