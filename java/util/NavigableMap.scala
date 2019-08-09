package java.util

// A SortedMap extended with navigation methods returning the
// closest matches for given search targets. Methods
// lowerEntry, floorEntry, ceilingEntry,
// and higherEntry return Map.Entry objects
// associated with keys respectively less than, less than or equal,
// greater than or equal, and greater than a given key, returning
// null if there is no such key.  Similarly, methods
// lowerKey, floorKey, ceilingKey, and
// higherKey return only the associated keys. All of these
// methods are designed for locating, not traversing entries.
//
// A NavigableMap may be accessed and traversed in either
// ascending or descending key order.  The descendingMap
// method returns a view of the map with the senses of all relational
// and directional methods inverted. The performance of ascending
// operations and views is likely to be faster than that of descending
// ones.  Methods subMap, headMap,
// and tailMap differ from the like-named SortedMap methods in accepting additional arguments describing
// whether lower and upper bounds are inclusive versus exclusive.
// Submaps of any NavigableMap must implement the NavigableMap interface.
//
// This interface additionally defines methods firstEntry,
// pollFirstEntry, lastEntry, and
// pollLastEntry that return and/or remove the least and
// greatest mappings, if any exist, else returning null.
//
// Implementations of entry-returning methods are expected to
// return Map.Entry pairs representing snapshots of mappings
// at the time they were produced, and thus generally do not
// support the optional Entry.setValue method. Note however
// that it is possible to change mappings in the associated map using
// method put.
//
// Methods
// subMap(K, K),
// headMap(K), and
// tailMap(K)
// are specified to return SortedMap to allow existing
// implementations of SortedMap to be compatibly retrofitted to
// implement NavigableMap, but extensions and implementations
// of this interface are encouraged to override these methods to return
// NavigableMap.  Similarly,
// SortedMap.keySet() can be overriden to return NavigableSet.
//
// This interface is a member of the
// 
// Java Collections Framework.
trait NavigableMap[K, V] extends SortedMap[K, V] {

    @stub
    // Returns a key-value mapping associated with the least key
    // greater than or equal to the given key, or null if
    // there is no such key.
    def ceilingEntry(key: K): Map.Entry[K, V] = ???

    @stub
    // Returns the least key greater than or equal to the given key,
    // or null if there is no such key.
    def ceilingKey(key: K): K = ???

    @stub
    // Returns a reverse order NavigableSet view of the keys contained in this map.
    def descendingKeySet(): NavigableSet[K] = ???

    @stub
    // Returns a reverse order view of the mappings contained in this map.
    def descendingMap(): NavigableMap[K, V] = ???

    @stub
    // Returns a key-value mapping associated with the least
    // key in this map, or null if the map is empty.
    def firstEntry(): Map.Entry[K, V] = ???

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
    // Returns a view of the portion of this map whose keys are
    // strictly less than toKey.
    def headMap(toKey: K): SortedMap[K, V] = ???

    @stub
    // Returns a view of the portion of this map whose keys are less than (or
    // equal to, if inclusive is true) toKey.
    def headMap(toKey: K, inclusive: Boolean): NavigableMap[K, V] = ???

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
    // Returns a key-value mapping associated with the greatest
    // key in this map, or null if the map is empty.
    def lastEntry(): Map.Entry[K, V] = ???

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
    // Returns a view of the portion of this map whose keys range from
    // fromKey to toKey.
    def subMap(fromKey: K, fromInclusive: Boolean, toKey: K, toInclusive: Boolean): NavigableMap[K, V] = ???

    @stub
    // Returns a view of the portion of this map whose keys range from
    // fromKey, inclusive, to toKey, exclusive.
    def subMap(fromKey: K, toKey: K): SortedMap[K, V] = ???

    @stub
    // Returns a view of the portion of this map whose keys are
    // greater than or equal to fromKey.
    def tailMap(fromKey: K): SortedMap[K, V] = ???
}
