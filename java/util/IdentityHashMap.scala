package java.util

import java.io.Serializable
import java.lang.{Cloneable, Object}
import java.util.function.{BiConsumer, BiFunction}
import scala.scalanative.annotation.stub

/** This class implements the Map interface with a hash table, using
 *  reference-equality in place of object-equality when comparing keys (and
 *  values).  In other words, in an IdentityHashMap, two keys
 *  k1 and k2 are considered equal if and only if
 *  (k1==k2).  (In normal Map implementations (like
 *  HashMap) two keys k1 and k2 are considered equal
 *  if and only if (k1==null ? k2==null : k1.equals(k2)).)
 * 
 *  This class is not a general-purpose Map
 *  implementation!  While this class implements the Map interface, it
 *  intentionally violates Map's general contract, which mandates the
 *  use of the equals method when comparing objects.  This class is
 *  designed for use only in the rare cases wherein reference-equality
 *  semantics are required.
 * 
 *  A typical use of this class is topology-preserving object graph
 *  transformations, such as serialization or deep-copying.  To perform such
 *  a transformation, a program must maintain a "node table" that keeps track
 *  of all the object references that have already been processed.  The node
 *  table must not equate distinct objects even if they happen to be equal.
 *  Another typical use of this class is to maintain proxy objects.  For
 *  example, a debugging facility might wish to maintain a proxy object for
 *  each object in the program being debugged.
 * 
 *  This class provides all of the optional map operations, and permits
 *  null values and the null key.  This class makes no
 *  guarantees as to the order of the map; in particular, it does not guarantee
 *  that the order will remain constant over time.
 * 
 *  This class provides constant-time performance for the basic
 *  operations (get and put), assuming the system
 *  identity hash function (System.identityHashCode(Object))
 *  disperses elements properly among the buckets.
 * 
 *  This class has one tuning parameter (which affects performance but not
 *  semantics): expected maximum size.  This parameter is the maximum
 *  number of key-value mappings that the map is expected to hold.  Internally,
 *  this parameter is used to determine the number of buckets initially
 *  comprising the hash table.  The precise relationship between the expected
 *  maximum size and the number of buckets is unspecified.
 * 
 *  If the size of the map (the number of key-value mappings) sufficiently
 *  exceeds the expected maximum size, the number of buckets is increased.
 *  Increasing the number of buckets ("rehashing") may be fairly expensive, so
 *  it pays to create identity hash maps with a sufficiently large expected
 *  maximum size.  On the other hand, iteration over collection views requires
 *  time proportional to the number of buckets in the hash table, so it
 *  pays not to set the expected maximum size too high if you are especially
 *  concerned with iteration performance or memory usage.
 * 
 *  Note that this implementation is not synchronized.
 *  If multiple threads access an identity hash map concurrently, and at
 *  least one of the threads modifies the map structurally, it must
 *  be synchronized externally.  (A structural modification is any operation
 *  that adds or deletes one or more mappings; merely changing the value
 *  associated with a key that an instance already contains is not a
 *  structural modification.)  This is typically accomplished by
 *  synchronizing on some object that naturally encapsulates the map.
 * 
 *  If no such object exists, the map should be "wrapped" using the
 *  Collections.synchronizedMap
 *  method.  This is best done at creation time, to prevent accidental
 *  unsynchronized access to the map:
 *    Map m = Collections.synchronizedMap(new IdentityHashMap(...));
 * 
 *  The iterators returned by the iterator method of the
 *  collections returned by all of this class's "collection view
 *  methods" are fail-fast: if the map is structurally modified
 *  at any time after the iterator is created, in any way except
 *  through the iterator's own remove method, the iterator
 *  will throw a ConcurrentModificationException.  Thus, in the
 *  face of concurrent modification, the iterator fails quickly and
 *  cleanly, rather than risking arbitrary, non-deterministic behavior
 *  at an undetermined time in the future.
 * 
 *  Note that the fail-fast behavior of an iterator cannot be guaranteed
 *  as it is, generally speaking, impossible to make any hard guarantees in the
 *  presence of unsynchronized concurrent modification.  Fail-fast iterators
 *  throw ConcurrentModificationException on a best-effort basis.
 *  Therefore, it would be wrong to write a program that depended on this
 *  exception for its correctness: fail-fast iterators should be used only
 *  to detect bugs.
 * 
 *  Implementation note: This is a simple linear-probe hash table,
 *  as described for example in texts by Sedgewick and Knuth.  The array
 *  alternates holding keys and values.  (This has better locality for large
 *  tables than does using separate arrays.)  For many JRE implementations
 *  and operation mixes, this class will yield better performance than
 *  HashMap (which uses chaining rather than linear-probing).
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class IdentityHashMap[K, V] extends AbstractMap[K, V] with Map[K, V] with Serializable with Cloneable {

    /** Constructs a new, empty identity hash map with a default expected
     *  maximum size (21).
     */
    @stub
    def this() = ???

    /** Constructs a new, empty map with the specified expected maximum size. */
    @stub
    def this(expectedMaxSize: Int) = ???

    /** Constructs a new identity hash map containing the keys-value mappings
     *  in the specified map.
     */
    @stub
    def this(m: Map[_ <: K, _ <: V]) = ???

    /** Removes all of the mappings from this map. */
    @stub
    def clear(): Unit = ???

    /** Returns a shallow copy of this identity hash map: the keys and values
     *  themselves are not cloned.
     */
    @stub
    def clone(): Object = ???

    /** Tests whether the specified object reference is a key in this identity
     *  hash map.
     */
    @stub
    def containsKey(key: Object): Boolean = ???

    /** Tests whether the specified object reference is a value in this identity
     *  hash map.
     */
    @stub
    def containsValue(value: Object): Boolean = ???

    /** Returns a Set view of the mappings contained in this map. */
    @stub
    def entrySet(): Set[Map.Entry[K, V]] = ???

    /** Compares the specified object with this map for equality. */
    @stub
    def equals(o: Object): Boolean = ???

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

    /** Returns the hash code value for this map. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if this identity hash map contains no key-value
     *  mappings.
     */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns an identity-based set view of the keys contained in this map. */
    @stub
    def keySet(): Set[K] = ???

    /** Associates the specified value with the specified key in this identity
     *  hash map.
     */
    @stub
    def put(key: K, value: V): V = ???

    /** Copies all of the mappings from the specified map to this map. */
    @stub
    def putAll(m: Map[_ <: K, _ <: V]): Unit = ???

    /** Removes the mapping for this key from this map if present. */
    @stub
    def remove(key: Object): V = ???

    /** Replaces each entry's value with the result of invoking the given
     *  function on that entry until all entries have been processed or the
     *  function throws an exception.
     */
    @stub
    def replaceAll(function: BiFunction[_ >: K, _ >: V, _ <: V]): Unit = ???

    /** Returns the number of key-value mappings in this identity hash map. */
    @stub
    def size(): Int = ???

    /** Returns a Collection view of the values contained in this map. */
    @stub
    def values(): Collection[V] = ???
}
