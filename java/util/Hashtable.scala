package java.util

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import java.util.function.{BiConsumer, BiFunction, Function}
import scala.scalanative.annotation.stub

/** This class implements a hash table, which maps keys to values. Any
 *  non-null object can be used as a key or as a value. 
 * 
 *  To successfully store and retrieve objects from a hashtable, the
 *  objects used as keys must implement the hashCode
 *  method and the equals method. 
 * 
 *  An instance of Hashtable has two parameters that affect its
 *  performance: initial capacity and load factor.  The
 *  capacity is the number of buckets in the hash table, and the
 *  initial capacity is simply the capacity at the time the hash table
 *  is created.  Note that the hash table is open: in the case of a "hash
 *  collision", a single bucket stores multiple entries, which must be searched
 *  sequentially.  The load factor is a measure of how full the hash
 *  table is allowed to get before its capacity is automatically increased.
 *  The initial capacity and load factor parameters are merely hints to
 *  the implementation.  The exact details as to when and whether the rehash
 *  method is invoked are implementation-dependent.
 * 
 *  Generally, the default load factor (.75) offers a good tradeoff between
 *  time and space costs.  Higher values decrease the space overhead but
 *  increase the time cost to look up an entry (which is reflected in most
 *  Hashtable operations, including get and put).
 * 
 *  The initial capacity controls a tradeoff between wasted space and the
 *  need for rehash operations, which are time-consuming.
 *  No rehash operations will ever occur if the initial
 *  capacity is greater than the maximum number of entries the
 *  Hashtable will contain divided by its load factor.  However,
 *  setting the initial capacity too high can waste space.
 * 
 *  If many entries are to be made into a Hashtable,
 *  creating it with a sufficiently large capacity may allow the
 *  entries to be inserted more efficiently than letting it perform
 *  automatic rehashing as needed to grow the table. 
 * 
 *  This example creates a hashtable of numbers. It uses the names of
 *  the numbers as keys:
 *     
 *    Hashtable<String, Integer> numbers
 *      = new Hashtable<String, Integer>();
 *    numbers.put("one", 1);
 *    numbers.put("two", 2);
 *    numbers.put("three", 3);
 * 
 *  To retrieve a number, use the following code:
 *     
 *    Integer n = numbers.get("two");
 *    if (n != null) {
 *      System.out.println("two = " + n);
 *    }
 * 
 *  The iterators returned by the iterator method of the collections
 *  returned by all of this class's "collection view methods" are
 *  fail-fast: if the Hashtable is structurally modified at any time
 *  after the iterator is created, in any way except through the iterator's own
 *  remove method, the iterator will throw a ConcurrentModificationException.  Thus, in the face of concurrent
 *  modification, the iterator fails quickly and cleanly, rather than risking
 *  arbitrary, non-deterministic behavior at an undetermined time in the future.
 *  The Enumerations returned by Hashtable's keys and elements methods are
 *  not fail-fast.
 * 
 *  Note that the fail-fast behavior of an iterator cannot be guaranteed
 *  as it is, generally speaking, impossible to make any hard guarantees in the
 *  presence of unsynchronized concurrent modification.  Fail-fast iterators
 *  throw ConcurrentModificationException on a best-effort basis.
 *  Therefore, it would be wrong to write a program that depended on this
 *  exception for its correctness: the fail-fast behavior of iterators
 *  should be used only to detect bugs.
 * 
 *  As of the Java 2 platform v1.2, this class was retrofitted to
 *  implement the Map interface, making it a member of the
 *  
 * 
 *  Java Collections Framework.  Unlike the new collection
 *  implementations, Hashtable is synchronized.  If a
 *  thread-safe implementation is not needed, it is recommended to use
 *  HashMap in place of Hashtable.  If a thread-safe
 *  highly-concurrent implementation is desired, then it is recommended
 *  to use ConcurrentHashMap in place of
 *  Hashtable.
 */
class Hashtable[K, V] extends Dictionary[K, V] with Map[K, V] with Cloneable with Serializable {

    /** Constructs a new, empty hashtable with a default initial capacity (11)
     *  and load factor (0.75).
     */
    @stub
    def this() = ???

    /** Constructs a new, empty hashtable with the specified initial capacity
     *  and default load factor (0.75).
     */
    @stub
    def this(initialCapacity: Int) = ???

    /** Constructs a new, empty hashtable with the specified initial
     *  capacity and the specified load factor.
     */
    @stub
    def this(initialCapacity: Int, loadFactor: Float) = ???

    /** Constructs a new hashtable with the same mappings as the given
     *  Map.
     */
    @stub
    def this(t: Map[_ <: K, _ <: V]) = ???

    /** Clears this hashtable so that it contains no keys. */
    @stub
    def clear(): Unit = ???

    /** Creates a shallow copy of this hashtable. */
    @stub
    def clone(): Any = ???

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

    /** Tests if some key maps into the specified value in this hashtable. */
    @stub
    def contains(value: Any): Boolean = ???

    /** Tests if the specified object is a key in this hashtable. */
    @stub
    def containsKey(key: Any): Boolean = ???

    /** Returns true if this hashtable maps one or more keys to this value. */
    @stub
    def containsValue(value: Any): Boolean = ???

    /** Returns an enumeration of the values in this hashtable. */
    @stub
    def elements(): Enumeration[V] = ???

    /** Returns a Set view of the mappings contained in this map. */
    @stub
    def entrySet(): Set[Map.Entry[K, V]] = ???

    /** Compares the specified Object with this Map for equality,
     *  as per the definition in the Map interface.
     */
    @stub
    def equals(o: Any): Boolean = ???

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

    /** Returns the value to which the specified key is mapped, or
     *  defaultValue if this map contains no mapping for the key.
     */
    @stub
    def getOrDefault(key: Any, defaultValue: V): V = ???

    /** Returns the hash code value for this Map as per the definition in the
     *  Map interface.
     */
    @stub
    def hashCode(): Int = ???

    /** Tests if this hashtable maps no keys to values. */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns an enumeration of the keys in this hashtable. */
    @stub
    def keys(): Enumeration[K] = ???

    /** Returns a Set view of the keys contained in this map. */
    @stub
    def keySet(): Set[K] = ???

    /** If the specified key is not already associated with a value or is
     *  associated with null, associates it with the given non-null value.
     */
    @stub
    def merge(key: K, value: V, remappingFunction: BiFunction[_ >: V, _ >: V, _ <: V]): V = ???

    /** Maps the specified key to the specified
     *  value in this hashtable.
     */
    @stub
    def put(key: K, value: V): V = ???

    /** Copies all of the mappings from the specified map to this hashtable. */
    @stub
    def putAll(t: Map[_ <: K, _ <: V]): Unit = ???

    /** If the specified key is not already associated with a value (or is mapped
     *  to null) associates it with the given value and returns
     *  null, else returns the current value.
     */
    @stub
    def putIfAbsent(key: K, value: V): V = ???

    /** Increases the capacity of and internally reorganizes this
     *  hashtable, in order to accommodate and access its entries more
     *  efficiently.
     */
    @stub
    protected def rehash(): Unit = ???

    /** Removes the key (and its corresponding value) from this
     *  hashtable.
     */
    @stub
    def remove(key: Any): V = ???

    /** Removes the entry for the specified key only if it is currently
     *  mapped to the specified value.
     */
    @stub
    def remove(key: Any, value: Any): Boolean = ???

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

    /** Returns the number of keys in this hashtable. */
    @stub
    def size(): Int = ???

    /** Returns a string representation of this Hashtable object
     *  in the form of a set of entries, enclosed in braces and separated
     *  by the ASCII characters ", " (comma and space).
     */
    @stub
    def toString(): String = ???

    /** Returns a Collection view of the values contained in this map. */
    @stub
    def values(): Collection[V] = ???
}
