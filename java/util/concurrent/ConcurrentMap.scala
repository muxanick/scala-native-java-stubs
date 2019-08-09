package java.util.concurrent

import java.lang.Object
import java.util.Map
import java.util.function.{BiConsumer, BiFunction, Function}

// A Map providing thread safety and atomicity
// guarantees.
//
// Memory consistency effects: As with other concurrent
// collections, actions in a thread prior to placing an object into a
// ConcurrentMap as a key or value
// happen-before
// actions subsequent to the access or removal of that object from
// the ConcurrentMap in another thread.
//
// This interface is a member of the
// 
// Java Collections Framework.
trait ConcurrentMap[K, V] extends Map[K, V] {

    @stub
    // Attempts to compute a mapping for the specified key and its current
    // mapped value (or null if there is no current mapping).
    def V: default = ???

    @stub
    // If the specified key is not already associated with a value (or is mapped
    // to null), attempts to compute its value using the given mapping
    // function and enters it into this map unless null.
    def V: default = ???

    @stub
    // If the value for the specified key is present and non-null, attempts to
    // compute a new mapping given the key and its current mapped value.
    def V: default = ???

    @stub
    // Performs the given action for each entry in this map until all entries
    // have been processed or the action throws an exception.
    def Unit: default = ???

    @stub
    // Returns the value to which the specified key is mapped, or
    // defaultValue if this map contains no mapping for the key.
    def V: default = ???

    @stub
    // If the specified key is not already associated with a value or is
    // associated with null, associates it with the given non-null value.
    def V: default = ???

    @stub
    // If the specified key is not already associated
    // with a value, associate it with the given value.
    def putIfAbsent(key: K, value: V): V = ???

    @stub
    // Removes the entry for a key only if currently mapped to a given value.
    def remove(key: Object, value: Object): Boolean = ???

    @stub
    // Replaces the entry for a key only if currently mapped to some value.
    def replace(key: K, value: V): V = ???

    @stub
    // Replaces the entry for a key only if currently mapped to a given value.
    def replace(key: K, oldValue: V, newValue: V): Boolean = ???
}
