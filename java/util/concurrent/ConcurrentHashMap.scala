package java.util.concurrent

import java.io.Serializable
import java.lang.{Boolean, Object, String}
import java.util.{AbstractMap, Enumeration, Map, Map.Entry, Set}
import java.util.function.{BiConsumer, BiFunction, Consumer, DoubleBinaryOperator, Function, IntBinaryOperator, LongBinaryOperator, ToDoubleBiFunction, ToDoubleFunction, ToIntBiFunction, ToIntFunction, ToLongBiFunction, ToLongFunction}

// A hash table supporting full concurrency of retrievals and
// high expected concurrency for updates. This class obeys the
// same functional specification as Hashtable, and
// includes versions of methods corresponding to each method of
// Hashtable. However, even though all operations are
// thread-safe, retrieval operations do not entail locking,
// and there is not any support for locking the entire table
// in a way that prevents all access.  This class is fully
// interoperable with Hashtable in programs that rely on its
// thread safety but not on its synchronization details.
//
// Retrieval operations (including get) generally do not
// block, so may overlap with update operations (including put
// and remove). Retrievals reflect the results of the most
// recently completed update operations holding upon their
// onset. (More formally, an update operation for a given key bears a
// happens-before relation with any (non-null) retrieval for
// that key reporting the updated value.)  For aggregate operations
// such as putAll and clear, concurrent retrievals may
// reflect insertion or removal of only some entries.  Similarly,
// Iterators, Spliterators and Enumerations return elements reflecting the
// state of the hash table at some point at or since the creation of the
// iterator/enumeration.  They do not throw ConcurrentModificationException.
// However, iterators are designed to be used by only one thread at a time.
// Bear in mind that the results of aggregate status methods including
// size, isEmpty, and containsValue are typically
// useful only when a map is not undergoing concurrent updates in other threads.
// Otherwise the results of these methods reflect transient states
// that may be adequate for monitoring or estimation purposes, but not
// for program control.
//
// The table is dynamically expanded when there are too many
// collisions (i.e., keys that have distinct hash codes but fall into
// the same slot modulo the table size), with the expected average
// effect of maintaining roughly two bins per mapping (corresponding
// to a 0.75 load factor threshold for resizing). There may be much
// variance around this average as mappings are added and removed, but
// overall, this maintains a commonly accepted time/space tradeoff for
// hash tables.  However, resizing this or any other kind of hash
// table may be a relatively slow operation. When possible, it is a
// good idea to provide a size estimate as an optional initialCapacity constructor argument. An additional optional
// loadFactor constructor argument provides a further means of
// customizing initial table capacity by specifying the table density
// to be used in calculating the amount of space to allocate for the
// given number of elements.  Also, for compatibility with previous
// versions of this class, constructors may optionally specify an
// expected concurrencyLevel as an additional hint for
// internal sizing.  Note that using many keys with exactly the same
// hashCode() is a sure way to slow down performance of any
// hash table. To ameliorate impact, when keys are Comparable,
// this class may use comparison order among keys to help break ties.
//
// A Set projection of a ConcurrentHashMap may be created
// (using newKeySet() or newKeySet(int)), or viewed
// (using keySet(Object) when only keys are of interest, and the
// mapped values are (perhaps transiently) not used or all take the
// same mapping value.
//
// A ConcurrentHashMap can be used as scalable frequency map (a
// form of histogram or multiset) by using LongAdder values and initializing via
// computeIfAbsent. For example, to add a count
// to a ConcurrentHashMap<String,LongAdder> freqs, you can use
// freqs.computeIfAbsent(k -> new LongAdder()).increment();
//
// This class and its views and iterators implement all of the
// optional methods of the Map and Iterator
// interfaces.
//
// Like Hashtable but unlike HashMap, this class
// does not allow null to be used as a key or value.
//
// ConcurrentHashMaps support a set of sequential and parallel bulk
// operations that, unlike most Stream methods, are designed
// to be safely, and often sensibly, applied even with maps that are
// being concurrently updated by other threads; for example, when
// computing a snapshot summary of the values in a shared registry.
// There are three kinds of operation, each with four forms, accepting
// functions with Keys, Values, Entries, and (Key, Value) arguments
// and/or return values. Because the elements of a ConcurrentHashMap
// are not ordered in any particular way, and may be processed in
// different orders in different parallel executions, the correctness
// of supplied functions should not depend on any ordering, or on any
// other objects or values that may transiently change while
// computation is in progress; and except for forEach actions, should
// ideally be side-effect-free. Bulk operations on Map.Entry
// objects do not support method setValue.
//
// 
//  forEach: Perform a given action on each element.
// A variant form applies a given transformation on each element
// before performing the action.
//
//  search: Return the first available non-null result of
// applying a given function on each element; skipping further
// search when a result is found.
//
//  reduce: Accumulate each element.  The supplied reduction
// function cannot rely on ordering (more formally, it should be
// both associative and commutative).  There are five variants:
//
// 
//
//  Plain reductions. (There is not a form of this method for
// (key, value) function arguments since there is no corresponding
// return type.)
//
//  Mapped reductions that accumulate the results of a given
// function applied to each element.
//
//  Reductions to scalar doubles, longs, and ints, using a
// given basis value.
//
// 
// 
// 
//
// These bulk operations accept a parallelismThreshold
// argument. Methods proceed sequentially if the current map size is
// estimated to be less than the given threshold. Using a value of
// Long.MAX_VALUE suppresses all parallelism.  Using a value
// of 1 results in maximal parallelism by partitioning into
// enough subtasks to fully utilize the ForkJoinPool.commonPool() that is used for all parallel
// computations. Normally, you would initially choose one of these
// extreme values, and then measure performance of using in-between
// values that trade off overhead versus throughput.
//
// The concurrency properties of bulk operations follow
// from those of ConcurrentHashMap: Any non-null result returned
// from get(key) and related access methods bears a
// happens-before relation with the associated insertion or
// update.  The result of any bulk operation reflects the
// composition of these per-element relations (but is not
// necessarily atomic with respect to the map as a whole unless it
// is somehow known to be quiescent).  Conversely, because keys
// and values in the map are never null, null serves as a reliable
// atomic indicator of the current lack of any result.  To
// maintain this property, null serves as an implicit basis for
// all non-scalar reduction operations. For the double, long, and
// int versions, the basis should be one that, when combined with
// any other value, returns that other value (more formally, it
// should be the identity element for the reduction). Most common
// reductions have these properties; for example, computing a sum
// with basis 0 or a minimum with basis MAX_VALUE.
//
// Search and transformation functions provided as arguments
// should similarly return null to indicate the lack of any result
// (in which case it is not used). In the case of mapped
// reductions, this also enables transformations to serve as
// filters, returning null (or, in the case of primitive
// specializations, the identity basis) if the element should not
// be combined. You can create compound transformations and
// filterings by composing them yourself under this "null means
// there is nothing there now" rule before using them in search or
// reduce operations.
//
// Methods accepting and/or returning Entry arguments maintain
// key-value associations. They may be useful for example when
// finding the key for the greatest value. Note that "plain" Entry
// arguments can be supplied using new
// AbstractMap.SimpleEntry(k,v).
//
// Bulk operations may complete abruptly, throwing an
// exception encountered in the application of a supplied
// function. Bear in mind when handling such exceptions that other
// concurrently executing functions could also have thrown
// exceptions, or would have done so if the first exception had
// not occurred.
//
// Speedups for parallel compared to sequential forms are common
// but not guaranteed.  Parallel operations involving brief functions
// on small maps may execute more slowly than sequential forms if the
// underlying work to parallelize the computation is more expensive
// than the computation itself.  Similarly, parallelization may not
// lead to much actual parallelism if all processors are busy
// performing unrelated tasks.
//
// All arguments to all task methods must be non-null.
//
// This class is a member of the
// 
// Java Collections Framework.
class ConcurrentHashMap[K, V] extends AbstractMap[K, V] with ConcurrentMap[K, V], with Serializable {

    @stub
    // Creates a new, empty map with the default initial table size (16).
    def this() = ???

    @stub
    // Creates a new, empty map with an initial table size
    // accommodating the specified number of elements without the need
    // to dynamically resize.
    def this(initialCapacity: Int) = ???

    @stub
    // Creates a new, empty map with an initial table size based on
    // the given number of elements (initialCapacity) and
    // initial table density (loadFactor).
    def this(initialCapacity: Int, loadFactor: float) = ???

    @stub
    // Creates a new, empty map with an initial table size based on
    // the given number of elements (initialCapacity), table
    // density (loadFactor), and number of concurrently
    // updating threads (concurrencyLevel).
    def this(initialCapacity: Int, loadFactor: float, concurrencyLevel: Int) = ???

    @stub
    // Removes all of the mappings from this map.
    def clear(): Unit = ???

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
    // Legacy method testing if some key maps into the specified value
    // in this table.
    def contains(value: Object): Boolean = ???

    @stub
    // Tests if the specified object is a key in this table.
    def containsKey(key: Object): Boolean = ???

    @stub
    // Returns true if this map maps one or more keys to the
    // specified value.
    def containsValue(value: Object): Boolean = ???

    @stub
    // Returns an enumeration of the values in this table.
    def elements(): Enumeration[V] = ???

    @stub
    // Returns a Set view of the mappings contained in this map.
    def entrySet(): Set[Map.Entry[K, V]] = ???

    @stub
    // Compares the specified object with this map for equality.
    def equals(o: Object): Boolean = ???

    @stub
    // Performs the given action for each entry in this map until all entries
    // have been processed or the action throws an exception.
    def forEach(action: BiConsumer[_ >: K, _ >: V]): Unit = ???

    @stub
    // Performs the given action for each (key, value).
    def forEach(parallelismThreshold: Long, action: BiConsumer[_ >: K, _ >: V]): Unit = ???

    @stub
    // Performs the given action for each non-null transformation
    // of each (key, value).
    def Unit: [U] = ???

    @stub
    // Performs the given action for each entry.
    def forEachEntry(parallelismThreshold: Long, action: Consumer[_ >: Map.Entry[K, V]]): Unit = ???

    @stub
    // Performs the given action for each non-null transformation
    // of each entry.
    def Unit: [U] = ???

    @stub
    // Performs the given action for each key.
    def forEachKey(parallelismThreshold: Long, action: Consumer[_ >: K]): Unit = ???

    @stub
    // Performs the given action for each non-null transformation
    // of each key.
    def Unit: [U] = ???

    @stub
    // Performs the given action for each value.
    def forEachValue(parallelismThreshold: Long, action: Consumer[_ >: V]): Unit = ???

    @stub
    // Performs the given action for each non-null transformation
    // of each value.
    def Unit: [U] = ???

    @stub
    // Returns the value to which the specified key is mapped,
    // or null if this map contains no mapping for the key.
    def get(key: Object): V = ???

    @stub
    // Returns the value to which the specified key is mapped, or the
    // given default value if this map contains no mapping for the
    // key.
    def getOrDefault(key: Object, defaultValue: V): V = ???

    @stub
    // Returns the hash code value for this Map, i.e.,
    // the sum of, for each key-value pair in the map,
    // key.hashCode() ^ value.hashCode().
    def hashCode(): Int = ???

    @stub
    // Returns true if this map contains no key-value mappings.
    def isEmpty(): Boolean = ???

    @stub
    // Returns an enumeration of the keys in this table.
    def keys(): Enumeration[K] = ???

    @stub
    // Returns a Set view of the keys contained in this map.
    def keySet(): ConcurrentHashMap.KeySetView[K, V] = ???

    @stub
    // Returns a Set view of the keys in this map, using the
    // given common mapped value for any additions (i.e., Collection.add(E) and Collection.addAll(Collection)).
    def keySet(mappedValue: V): ConcurrentHashMap.KeySetView[K, V] = ???

    @stub
    // Returns the number of mappings.
    def mappingCount(): Long = ???

    @stub
    // If the specified key is not already associated with a
    // (non-null) value, associates it with the given value.
    def merge(key: K, value: V, remappingFunction: BiFunction[_ >: V, _ >: V, _ <: V]): V = ???

    @stub
    // Maps the specified key to the specified value in this table.
    def put(key: K, value: V): V = ???

    @stub
    // Copies all of the mappings from the specified map to this one.
    def putAll(m: Map[_ <: K, _ <: V]): Unit = ???

    @stub
    // If the specified key is not already associated
    // with a value, associate it with the given value.
    def putIfAbsent(key: K, value: V): V = ???

    @stub
    // Returns the result of accumulating the given transformation
    // of all (key, value) pairs using the given reducer to
    // combine values, or null if none.
    def U: [U] = ???

    @stub
    // Returns the result of accumulating all entries using the
    // given reducer to combine values, or null if none.
    def reduceEntries(parallelismThreshold: Long, reducer: BiFunction[Map.Entry[K, V], Map.Entry[K, V], _ <: Map.Entry[K, V]]): Map.Entry[K, V] = ???

    @stub
    // Returns the result of accumulating the given transformation
    // of all entries using the given reducer to combine values,
    // or null if none.
    def U: [U] = ???

    @stub
    // Returns the result of accumulating the given transformation
    // of all entries using the given reducer to combine values,
    // and the given basis as an identity value.
    def reduceEntriesToDouble(parallelismThreshold: Long, transformer: ToDoubleFunction[Map.Entry[K, V]], basis: double, reducer: DoubleBinaryOperator): double = ???

    @stub
    // Returns the result of accumulating the given transformation
    // of all entries using the given reducer to combine values,
    // and the given basis as an identity value.
    def reduceEntriesToInt(parallelismThreshold: Long, transformer: ToIntFunction[Map.Entry[K, V]], basis: Int, reducer: IntBinaryOperator): Int = ???

    @stub
    // Returns the result of accumulating the given transformation
    // of all entries using the given reducer to combine values,
    // and the given basis as an identity value.
    def reduceEntriesToLong(parallelismThreshold: Long, transformer: ToLongFunction[Map.Entry[K, V]], basis: Long, reducer: LongBinaryOperator): Long = ???

    @stub
    // Returns the result of accumulating all keys using the given
    // reducer to combine values, or null if none.
    def reduceKeys(parallelismThreshold: Long, reducer: BiFunction[_ >: K, _ >: K, _ <: K]): K = ???

    @stub
    // Returns the result of accumulating the given transformation
    // of all keys using the given reducer to combine values, or
    // null if none.
    def U: [U] = ???

    @stub
    // Returns the result of accumulating the given transformation
    // of all keys using the given reducer to combine values, and
    // the given basis as an identity value.
    def reduceKeysToDouble(parallelismThreshold: Long, transformer: ToDoubleFunction[_ >: K], basis: double, reducer: DoubleBinaryOperator): double = ???

    @stub
    // Returns the result of accumulating the given transformation
    // of all keys using the given reducer to combine values, and
    // the given basis as an identity value.
    def reduceKeysToInt(parallelismThreshold: Long, transformer: ToIntFunction[_ >: K], basis: Int, reducer: IntBinaryOperator): Int = ???

    @stub
    // Returns the result of accumulating the given transformation
    // of all keys using the given reducer to combine values, and
    // the given basis as an identity value.
    def reduceKeysToLong(parallelismThreshold: Long, transformer: ToLongFunction[_ >: K], basis: Long, reducer: LongBinaryOperator): Long = ???

    @stub
    // Returns the result of accumulating the given transformation
    // of all (key, value) pairs using the given reducer to
    // combine values, and the given basis as an identity value.
    def reduceToDouble(parallelismThreshold: Long, transformer: ToDoubleBiFunction[_ >: K, _ >: V], basis: double, reducer: DoubleBinaryOperator): double = ???

    @stub
    // Returns the result of accumulating the given transformation
    // of all (key, value) pairs using the given reducer to
    // combine values, and the given basis as an identity value.
    def reduceToInt(parallelismThreshold: Long, transformer: ToIntBiFunction[_ >: K, _ >: V], basis: Int, reducer: IntBinaryOperator): Int = ???

    @stub
    // Returns the result of accumulating the given transformation
    // of all (key, value) pairs using the given reducer to
    // combine values, and the given basis as an identity value.
    def reduceToLong(parallelismThreshold: Long, transformer: ToLongBiFunction[_ >: K, _ >: V], basis: Long, reducer: LongBinaryOperator): Long = ???

    @stub
    // Returns the result of accumulating all values using the
    // given reducer to combine values, or null if none.
    def reduceValues(parallelismThreshold: Long, reducer: BiFunction[_ >: V, _ >: V, _ <: V]): V = ???

    @stub
    // Returns the result of accumulating the given transformation
    // of all values using the given reducer to combine values, or
    // null if none.
    def U: [U] = ???

    @stub
    // Returns the result of accumulating the given transformation
    // of all values using the given reducer to combine values,
    // and the given basis as an identity value.
    def reduceValuesToDouble(parallelismThreshold: Long, transformer: ToDoubleFunction[_ >: V], basis: double, reducer: DoubleBinaryOperator): double = ???

    @stub
    // Returns the result of accumulating the given transformation
    // of all values using the given reducer to combine values,
    // and the given basis as an identity value.
    def reduceValuesToInt(parallelismThreshold: Long, transformer: ToIntFunction[_ >: V], basis: Int, reducer: IntBinaryOperator): Int = ???

    @stub
    // Returns the result of accumulating the given transformation
    // of all values using the given reducer to combine values,
    // and the given basis as an identity value.
    def reduceValuesToLong(parallelismThreshold: Long, transformer: ToLongFunction[_ >: V], basis: Long, reducer: LongBinaryOperator): Long = ???

    @stub
    // Removes the key (and its corresponding value) from this map.
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
    // Returns a non-null result from applying the given search
    // function on each (key, value), or null if none.
    def U: [U] = ???

    @stub
    // Returns a non-null result from applying the given search
    // function on each entry, or null if none.
    def U: [U] = ???

    @stub
    // Returns a non-null result from applying the given search
    // function on each key, or null if none.
    def U: [U] = ???

    @stub
    // Returns a non-null result from applying the given search
    // function on each value, or null if none.
    def U: [U] = ???

    @stub
    // Returns the number of key-value mappings in this map.
    def size(): Int = ???

    @stub
    // Returns a string representation of this map.
    def toString(): String = ???
}

object ConcurrentHashMap {
    @stub
    // Creates a new Set backed by a ConcurrentHashMap
    // from the given type to Boolean.TRUE.
    def ConcurrentHashMap.KeySetView[K, Boolean]: [K] = ???

    @stub
    // Creates a new Set backed by a ConcurrentHashMap
    // from the given type to Boolean.TRUE.
    def ConcurrentHashMap.KeySetView[K, Boolean]: [K] = ???
}
