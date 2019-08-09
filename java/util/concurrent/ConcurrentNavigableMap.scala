package java.util.concurrent

import java.util.{NavigableMap, NavigableSet}

/** A ConcurrentMap supporting NavigableMap operations,
 *  and recursively so for its navigable sub-maps.
 * 
 *  This interface is a member of the
 *  
 *  Java Collections Framework.
 */
trait ConcurrentNavigableMap[K, V] extends ConcurrentMap[K, V] with NavigableMap[K, V] {

    /** Returns a reverse order NavigableSet view of the keys contained in this map. */
    @stub
    def descendingKeySet(): NavigableSet[K] = ???

    /** Returns a reverse order view of the mappings contained in this map. */
    @stub
    def descendingMap(): ConcurrentNavigableMap[K, V] = ???

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

    /** Returns a NavigableSet view of the keys contained in this map. */
    @stub
    def keySet(): NavigableSet[K] = ???

    /** Returns a NavigableSet view of the keys contained in this map. */
    @stub
    def navigableKeySet(): NavigableSet[K] = ???

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
}
