package java.util

import java.lang.Object
import java.util.function.{BiConsumer, BiFunction}
import scala.scalanative.annotation.stub

/** Hash table and linked list implementation of the Map interface,
 *  with predictable iteration order.  This implementation differs from
 *  HashMap in that it maintains a doubly-linked list running through
 *  all of its entries.  This linked list defines the iteration ordering,
 *  which is normally the order in which keys were inserted into the map
 *  (insertion-order).  Note that insertion order is not affected
 *  if a key is re-inserted into the map.  (A key k is
 *  reinserted into a map m if m.put(k, v) is invoked when
 *  m.containsKey(k) would return true immediately prior to
 *  the invocation.)
 * 
 *  This implementation spares its clients from the unspecified, generally
 *  chaotic ordering provided by HashMap (and Hashtable),
 *  without incurring the increased cost associated with TreeMap.  It
 *  can be used to produce a copy of a map that has the same order as the
 *  original, regardless of the original map's implementation:
 *  
 *      void foo(Map m) {
 *          Map copy = new LinkedHashMap(m);
 *          ...
 *      }
 *  
 *  This technique is particularly useful if a module takes a map on input,
 *  copies it, and later returns results whose order is determined by that of
 *  the copy.  (Clients generally appreciate having things returned in the same
 *  order they were presented.)
 * 
 *  A special constructor is
 *  provided to create a linked hash map whose order of iteration is the order
 *  in which its entries were last accessed, from least-recently accessed to
 *  most-recently (access-order).  This kind of map is well-suited to
 *  building LRU caches.  Invoking the put, putIfAbsent,
 *  get, getOrDefault, compute, computeIfAbsent,
 *  computeIfPresent, or merge methods results
 *  in an access to the corresponding entry (assuming it exists after the
 *  invocation completes). The replace methods only result in an access
 *  of the entry if the value is replaced.  The putAll method generates one
 *  entry access for each mapping in the specified map, in the order that
 *  key-value mappings are provided by the specified map's entry set iterator.
 *  No other methods generate entry accesses.  In particular, operations
 *  on collection-views do not affect the order of iteration of the
 *  backing map.
 * 
 *  The removeEldestEntry(Map.Entry) method may be overridden to
 *  impose a policy for removing stale mappings automatically when new mappings
 *  are added to the map.
 * 
 *  This class provides all of the optional Map operations, and
 *  permits null elements.  Like HashMap, it provides constant-time
 *  performance for the basic operations (add, contains and
 *  remove), assuming the hash function disperses elements
 *  properly among the buckets.  Performance is likely to be just slightly
 *  below that of HashMap, due to the added expense of maintaining the
 *  linked list, with one exception: Iteration over the collection-views
 *  of a LinkedHashMap requires time proportional to the size
 *  of the map, regardless of its capacity.  Iteration over a HashMap
 *  is likely to be more expensive, requiring time proportional to its
 *  capacity.
 * 
 *  A linked hash map has two parameters that affect its performance:
 *  initial capacity and load factor.  They are defined precisely
 *  as for HashMap.  Note, however, that the penalty for choosing an
 *  excessively high value for initial capacity is less severe for this class
 *  than for HashMap, as iteration times for this class are unaffected
 *  by capacity.
 * 
 *  Note that this implementation is not synchronized.
 *  If multiple threads access a linked hash map concurrently, and at least
 *  one of the threads modifies the map structurally, it must be
 *  synchronized externally.  This is typically accomplished by
 *  synchronizing on some object that naturally encapsulates the map.
 * 
 *  If no such object exists, the map should be "wrapped" using the
 *  Collections.synchronizedMap
 *  method.  This is best done at creation time, to prevent accidental
 *  unsynchronized access to the map:
 *    Map m = Collections.synchronizedMap(new LinkedHashMap(...));
 * 
 *  A structural modification is any operation that adds or deletes one or more
 *  mappings or, in the case of access-ordered linked hash maps, affects
 *  iteration order.  In insertion-ordered linked hash maps, merely changing
 *  the value associated with a key that is already contained in the map is not
 *  a structural modification.  In access-ordered linked hash maps,
 *  merely querying the map with get is a structural modification.
 *  )
 * 
 *  The iterators returned by the iterator method of the collections
 *  returned by all of this class's collection view methods are
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
 *  The spliterators returned by the spliterator method of the collections
 *  returned by all of this class's collection view methods are
 *  late-binding,
 *  fail-fast, and additionally report Spliterator.ORDERED.
 * 
 *  This class is a member of the
 *  
 *  Java Collections Framework.
 */
class LinkedHashMap[K, V] extends HashMap[K, V] with Map[K, V] {

    /** Constructs an empty insertion-ordered LinkedHashMap instance
     *  with the default initial capacity (16) and load factor (0.75).
     */
    @stub
    def this() = ???

    /** Constructs an empty insertion-ordered LinkedHashMap instance
     *  with the specified initial capacity and a default load factor (0.75).
     */
    @stub
    def this(initialCapacity: Int) = ???

    /** Constructs an empty insertion-ordered LinkedHashMap instance
     *  with the specified initial capacity and load factor.
     */
    @stub
    def this(initialCapacity: Int, loadFactor: Float) = ???

    /** Constructs an empty LinkedHashMap instance with the
     *  specified initial capacity, load factor and ordering mode.
     */
    @stub
    def this(initialCapacity: Int, loadFactor: Float, accessOrder: Boolean) = ???

    /** Constructs an insertion-ordered LinkedHashMap instance with
     *  the same mappings as the specified map.
     */
    @stub
    def this(m: Map[_ <: K, _ <: V]) = ???

    /** Removes all of the mappings from this map. */
    @stub
    def clear(): Unit = ???

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

    /** Returns a Set view of the keys contained in this map. */
    @stub
    def keySet(): Set[K] = ???

    /** Returns true if this map should remove its eldest entry. */
    @stub
    protected def removeEldestEntry(eldest: Map.Entry[K, V]): Boolean = ???

    /** Replaces each entry's value with the result of invoking the given
     *  function on that entry until all entries have been processed or the
     *  function throws an exception.
     */
    @stub
    def replaceAll(function: BiFunction[_ >: K, _ >: V, _ <: V]): Unit = ???

    /** Returns a Collection view of the values contained in this map. */
    @stub
    def values(): Collection[V] = ???
}
