package java.util

import java.lang.Object
import java.util.function.{BiConsumer, BiFunction}
import scala.scalanative.annotation.stub

/** Hash table based implementation of the Map interface, with
 *  weak keys.
 *  An entry in a WeakHashMap will automatically be removed when
 *  its key is no longer in ordinary use.  More precisely, the presence of a
 *  mapping for a given key will not prevent the key from being discarded by the
 *  garbage collector, that is, made finalizable, finalized, and then reclaimed.
 *  When a key has been discarded its entry is effectively removed from the map,
 *  so this class behaves somewhat differently from other Map
 *  implementations.
 * 
 *   Both null values and the null key are supported. This class has
 *  performance characteristics similar to those of the HashMap
 *  class, and has the same efficiency parameters of initial capacity
 *  and load factor.
 * 
 *   Like most collection classes, this class is not synchronized.
 *  A synchronized WeakHashMap may be constructed using the
 *  Collections.synchronizedMap
 *  method.
 * 
 *   This class is intended primarily for use with key objects whose
 *  equals methods test for object identity using the
 *  == operator.  Once such a key is discarded it can never be
 *  recreated, so it is impossible to do a lookup of that key in a
 *  WeakHashMap at some later time and be surprised that its entry
 *  has been removed.  This class will work perfectly well with key objects
 *  whose equals methods are not based upon object identity, such
 *  as String instances.  With such recreatable key objects,
 *  however, the automatic removal of WeakHashMap entries whose
 *  keys have been discarded may prove to be confusing.
 * 
 *   The behavior of the WeakHashMap class depends in part upon
 *  the actions of the garbage collector, so several familiar (though not
 *  required) Map invariants do not hold for this class.  Because
 *  the garbage collector may discard keys at any time, a
 *  WeakHashMap may behave as though an unknown thread is silently
 *  removing entries.  In particular, even if you synchronize on a
 *  WeakHashMap instance and invoke none of its mutator methods, it
 *  is possible for the size method to return smaller values over
 *  time, for the isEmpty method to return false and
 *  then true, for the containsKey method to return
 *  true and later false for a given key, for the
 *  get method to return a value for a given key but later return
 *  null, for the put method to return
 *  null and the remove method to return
 *  false for a key that previously appeared to be in the map, and
 *  for successive examinations of the key set, the value collection, and
 *  the entry set to yield successively smaller numbers of elements.
 * 
 *   Each key object in a WeakHashMap is stored indirectly as
 *  the referent of a weak reference.  Therefore a key will automatically be
 *  removed only after the weak references to it, both inside and outside of the
 *  map, have been cleared by the garbage collector.
 * 
 *   Implementation note: The value objects in a
 *  WeakHashMap are held by ordinary strong references.  Thus care
 *  should be taken to ensure that value objects do not strongly refer to their
 *  own keys, either directly or indirectly, since that will prevent the keys
 *  from being discarded.  Note that a value object may refer indirectly to its
 *  key via the WeakHashMap itself; that is, a value object may
 *  strongly refer to some other key object whose associated value object, in
 *  turn, strongly refers to the key of the first value object.  If the values
 *  in the map do not rely on the map holding strong references to them, one way
 *  to deal with this is to wrap values themselves within
 *  WeakReferences before
 *  inserting, as in: m.put(key, new WeakReference(value)),
 *  and then unwrapping upon each get.
 * 
 *  The iterators returned by the iterator method of the collections
 *  returned by all of this class's "collection view methods" are
 *  fail-fast: if the map is structurally modified at any time after the
 *  iterator is created, in any way except through the iterator's own
 *  remove method, the iterator will throw a ConcurrentModificationException.  Thus, in the face of concurrent
 *  modification, the iterator fails quickly and cleanly, rather than risking
 *  arbitrary, non-deterministic behavior at an undetermined time in the future.
 * 
 *  Note that the fail-fast behavior of an iterator cannot be guaranteed
 *  as it is, generally speaking, impossible to make any hard guarantees in the
 *  presence of unsynchronized concurrent modification.  Fail-fast iterators
 *  throw ConcurrentModificationException on a best-effort basis.
 *  Therefore, it would be wrong to write a program that depended on this
 *  exception for its correctness:  the fail-fast behavior of iterators
 *  should be used only to detect bugs.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class WeakHashMap[K, V] extends AbstractMap[K, V] with Map[K, V] {

    /** Constructs a new, empty WeakHashMap with the default initial
     *  capacity (16) and load factor (0.75).
     */
    @stub
    def this() = ???

    /** Constructs a new, empty WeakHashMap with the given initial
     *  capacity and the default load factor (0.75).
     */
    @stub
    def this(initialCapacity: Int) = ???

    /** Constructs a new, empty WeakHashMap with the given initial
     *  capacity and the given load factor.
     */
    @stub
    def this(initialCapacity: Int, loadFactor: Float) = ???

    /** Constructs a new WeakHashMap with the same mappings as the
     *  specified map.
     */
    @stub
    def this(m: Map[_ <: K, _ <: V]) = ???

    /** Removes all of the mappings from this map. */
    @stub
    def clear(): Unit = ???

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

    /** Returns true if this map contains no key-value mappings. */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns a Set view of the keys contained in this map. */
    @stub
    def keySet(): Set[K] = ???

    /** Associates the specified value with the specified key in this map. */
    @stub
    def put(key: K, value: V): V = ???

    /** Copies all of the mappings from the specified map to this map. */
    @stub
    def putAll(m: Map[_ <: K, _ <: V]): Unit = ???

    /** Removes the mapping for a key from this weak hash map if it is present. */
    @stub
    def remove(key: Object): V = ???

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
