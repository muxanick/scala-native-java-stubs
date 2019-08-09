package java.util.concurrent

import java.io.Serializable
import java.lang.Object
import java.util.{Collection, Iterator, Set, Spliterator}
import java.util.function.Consumer

// A view of a ConcurrentHashMap as a Set of keys, in
// which additions may optionally be enabled by mapping to a
// common value.  This class cannot be directly instantiated.
// See keySet(),
// keySet(V),
// newKeySet(),
// newKeySet(int).
object ConcurrentHashMap.KeySetView[K, V] extends Object with Set[K], with Serializable {

    @stub
    // Adds the specified key to this set view by mapping the key to
    // the default mapped value in the backing map, if defined.
    def add(e: K): Boolean = ???

    @stub
    // Adds all of the elements in the specified collection to this set,
    // as if by calling add(K) on each one.
    def addAll(c: Collection[_ <: K]): Boolean = ???

    @stub
    // Removes all of the elements from this view, by removing all
    // the mappings from the map backing this view.
    def clear(): Unit = ???

    @stub
    // Returns true if this collection contains the specified element.
    def contains(o: Object): Boolean = ???

    @stub
    // Returns true if this collection contains all of the elements
    // in the specified collection.
    def containsAll(c: Collection[_]): Boolean = ???

    @stub
    // Indicates whether some other object is "equal to" this one.
    def equals(o: Object): Boolean = ???

    @stub
    // Performs the given action for each element of the Iterable
    // until all elements have been processed or the action throws an
    // exception.
    def forEach(action: Consumer[_ >: K]): Unit = ???

    @stub
    // Returns the map backing this view.
    def getMap(): ConcurrentHashMap[K, V] = ???

    @stub
    // Returns the default mapped value for additions,
    // or null if additions are not supported.
    def getMappedValue(): V = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???

    @stub
    // Returns true if this collection contains no elements.
    def isEmpty(): Boolean = ???

    @stub
    // Returns an iterator over the elements in this collection.
    def iterator(): Iterator[K] = ???

    @stub
    // Removes the key from this map view, by removing the key (and its
    // corresponding value) from the backing map.
    def remove(o: Object): Boolean = ???

    @stub
    // Removes all of this collection's elements that are also contained in the
    // specified collection (optional operation).
    def removeAll(c: Collection[_]): Boolean = ???

    @stub
    // Retains only the elements in this collection that are contained in the
    // specified collection (optional operation).
    def retainAll(c: Collection[_]): Boolean = ???

    @stub
    // Returns the number of elements in this collection.
    def size(): Int = ???

    @stub
    // Creates a Spliterator over the elements in this set.
    def spliterator(): Spliterator[K] = ???

    @stub
    // Returns an array containing all of the elements in this collection.
    def toArray(): Array[Object] = ???

    @stub
    // Returns an array containing all of the elements in this collection;
    // the runtime type of the returned array is that of the specified array.
    def Array[T]: [T] = ???
}
