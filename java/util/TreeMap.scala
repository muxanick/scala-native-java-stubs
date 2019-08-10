package java.util

import java.io.Serializable
import java.lang.{Cloneable, Object}
import java.util.function.{BiConsumer, BiFunction}
import scala.scalanative.annotation.stub

/** A Red-Black tree based NavigableMap implementation.
 *  The map is sorted according to the natural
 *  ordering of its keys, or by a Comparator provided at map
 *  creation time, depending on which constructor is used.
 * 
 *  This implementation provides guaranteed log(n) time cost for the
 *  containsKey, get, put and remove
 *  operations.  Algorithms are adaptations of those in Cormen, Leiserson, and
 *  Rivest's Introduction to Algorithms.
 * 
 *  Note that the ordering maintained by a tree map, like any sorted map, and
 *  whether or not an explicit comparator is provided, must be consistent
 *  with equals if this sorted map is to correctly implement the
 *  Map interface.  (See Comparable or Comparator for a
 *  precise definition of consistent with equals.)  This is so because
 *  the Map interface is defined in terms of the equals
 *  operation, but a sorted map performs all key comparisons using its compareTo (or compare) method, so two keys that are deemed equal by
 *  this method are, from the standpoint of the sorted map, equal.  The behavior
 *  of a sorted map is well-defined even if its ordering is
 *  inconsistent with equals; it just fails to obey the general contract
 *  of the Map interface.
 * 
 *  Note that this implementation is not synchronized.
 *  If multiple threads access a map concurrently, and at least one of the
 *  threads modifies the map structurally, it must be synchronized
 *  externally.  (A structural modification is any operation that adds or
 *  deletes one or more mappings; merely changing the value associated
 *  with an existing key is not a structural modification.)  This is
 *  typically accomplished by synchronizing on some object that naturally
 *  encapsulates the map.
 *  If no such object exists, the map should be "wrapped" using the
 *  Collections.synchronizedSortedMap
 *  method.  This is best done at creation time, to prevent accidental
 *  unsynchronized access to the map: 
 *    SortedMap m = Collections.synchronizedSortedMap(new TreeMap(...));
 * 
 *  The iterators returned by the iterator method of the collections
 *  returned by all of this class's "collection view methods" are
 *  fail-fast: if the map is structurally modified at any time after
 *  the iterator is created, in any way except through the iterator's own
 *  remove method, the iterator will throw a ConcurrentModificationException.  Thus, in the face of concurrent
 *  modification, the iterator fails quickly and cleanly, rather than risking
 *  arbitrary, non-deterministic behavior at an undetermined time in the future.
 * 
 *  Note that the fail-fast behavior of an iterator cannot be guaranteed
 *  as it is, generally speaking, impossible to make any hard guarantees in the
 *  presence of unsynchronized concurrent modification.  Fail-fast iterators
 *  throw ConcurrentModificationException on a best-effort basis.
 *  Therefore, it would be wrong to write a program that depended on this
 *  exception for its correctness:   the fail-fast behavior of iterators
 *  should be used only to detect bugs.
 * 
 *  All Map.Entry pairs returned by methods in this class
 *  and its views represent snapshots of mappings at the time they were
 *  produced. They do not support the Entry.setValue
 *  method. (Note however that it is possible to change mappings in the
 *  associated map using put.)
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class TreeMap[K, V] extends AbstractMap[K, V] with NavigableMap[K, V] with Cloneable with Serializable {

    /** Constructs a new, empty tree map, using the natural ordering of its
     *  keys.
     */
    @stub
    def this() = ???

    /** Constructs a new, empty tree map, ordered according to the given
     *  comparator.
     */
    @stub
    def this(comparator: Comparator[_ >: K]) = ???

    /** Constructs a new tree map containing the same mappings as the given
     *  map, ordered according to the natural ordering of its keys.
     */
    @stub
    def this(m: Map[_ <: K, _ <: V]) = ???

    /** Constructs a new tree map containing the same mappings and
     *  using the same ordering as the specified sorted map.
     */
    @stub
    def this(m: SortedMap[K, _ <: V]) = ???

    /** Returns a key-value mapping associated with the least key
     *  greater than or equal to the given key, or null if
     *  there is no such key.
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

    /** Returns a shallow copy of this TreeMap instance. */
    @stub
    def clone(): Any = ???

    /** Returns the comparator used to order the keys in this map, or
     *  null if this map uses the natural ordering of its keys.
     */
    @stub
    def comparator(): Comparator[_ >: K] = ???

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

    /** Returns a reverse order NavigableSet view of the keys contained in this map. */
    @stub
    def descendingKeySet(): NavigableSet[K] = ???

    /** Returns a reverse order view of the mappings contained in this map. */
    @stub
    def descendingMap(): NavigableMap[K, V] = ???

    /** Returns a Set view of the mappings contained in this map. */
    @stub
    def entrySet(): Set[Map.Entry[K, V]] = ???

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
    def get(key: Any): V = ???

    /** Returns a view of the portion of this map whose keys are
     *  strictly less than toKey.
     */
    @stub
    def headMap(toKey: K): SortedMap[K, V] = ???

    /** Returns a view of the portion of this map whose keys are less than (or
     *  equal to, if inclusive is true) toKey.
     */
    @stub
    def headMap(toKey: K, inclusive: Boolean): NavigableMap[K, V] = ???

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

    /** Returns a Set view of the keys contained in this map. */
    @stub
    def keySet(): Set[K] = ???

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

    /** Copies all of the mappings from the specified map to this map. */
    @stub
    def putAll(map: Map[_ <: K, _ <: V]): Unit = ???

    /** Removes the mapping for this key from this TreeMap if present. */
    @stub
    def remove(key: Any): V = ???

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

    /** Returns a view of the portion of this map whose keys range from
     *  fromKey to toKey.
     */
    @stub
    def subMap(fromKey: K, fromInclusive: Boolean, toKey: K, toInclusive: Boolean): NavigableMap[K, V] = ???

    /** Returns a view of the portion of this map whose keys range from
     *  fromKey, inclusive, to toKey, exclusive.
     */
    @stub
    def subMap(fromKey: K, toKey: K): SortedMap[K, V] = ???

    /** Returns a view of the portion of this map whose keys are
     *  greater than or equal to fromKey.
     */
    @stub
    def tailMap(fromKey: K): SortedMap[K, V] = ???

    /** Returns a view of the portion of this map whose keys are greater than (or
     *  equal to, if inclusive is true) fromKey.
     */
    @stub
    def tailMap(fromKey: K, inclusive: Boolean): NavigableMap[K, V] = ???

    /** Returns a Collection view of the values contained in this map. */
    @stub
    def values(): Collection[V] = ???
}
