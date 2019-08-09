package java.util.concurrent

import java.util.{NavigableMap, NavigableSet}

// A ConcurrentMap supporting NavigableMap operations,
// and recursively so for its navigable sub-maps.
//
// This interface is a member of the
// 
// Java Collections Framework.
trait ConcurrentNavigableMap[K, V] extends ConcurrentMap[K, V] , NavigableMap[K, V] {

    @stub
    // Returns a reverse order NavigableSet view of the keys contained in this map.
    def descendingKeySet(): NavigableSet[K] = ???

    @stub
    // Returns a reverse order view of the mappings contained in this map.
    def descendingMap(): ConcurrentNavigableMap[K, V] = ???

    @stub
    // Returns a view of the portion of this map whose keys are
    // strictly less than toKey.
    def headMap(toKey: K): ConcurrentNavigableMap[K, V] = ???

    @stub
    // Returns a view of the portion of this map whose keys are less than (or
    // equal to, if inclusive is true) toKey.
    def headMap(toKey: K, inclusive: Boolean): ConcurrentNavigableMap[K, V] = ???

    @stub
    // Returns a NavigableSet view of the keys contained in this map.
    def keySet(): NavigableSet[K] = ???

    @stub
    // Returns a NavigableSet view of the keys contained in this map.
    def navigableKeySet(): NavigableSet[K] = ???

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
}
