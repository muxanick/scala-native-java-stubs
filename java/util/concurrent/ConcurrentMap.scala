package java.util.concurrent

import java.lang.Object
import java.util.Map
import java.util.function.{BiConsumer, BiFunction, Function}
import scala.scalanative.annotation.stub

/** A Map providing thread safety and atomicity
 *  guarantees.
 * 
 *  Memory consistency effects: As with other concurrent
 *  collections, actions in a thread prior to placing an object into a
 *  ConcurrentMap as a key or value
 *  happen-before
 *  actions subsequent to the access or removal of that object from
 *  the ConcurrentMap in another thread.
 * 
 *  This interface is a member of the
 *  
 *  Java Collections Framework.
 */
trait ConcurrentMap[K, V] extends Map[K, V] {

    /** Attempts to compute a mapping for the specified key and its current
     *  mapped value (or null if there is no current mapping).
     */
    @stub
    val V: default = ???

    /** If the specified key is not already associated with a value (or is mapped
     *  to null), attempts to compute its value using the given mapping
     *  function and enters it into this map unless null.
     */
    @stub
    val V: default = ???

    /** If the value for the specified key is present and non-null, attempts to
     *  compute a new mapping given the key and its current mapped value.
     */
    @stub
    val V: default = ???

    /** Performs the given action for each entry in this map until all entries
     *  have been processed or the action throws an exception.
     */
    @stub
    val Unit: default = ???

    /** Returns the value to which the specified key is mapped, or
     *  defaultValue if this map contains no mapping for the key.
     */
    @stub
    val V: default = ???

    /** If the specified key is not already associated with a value or is
     *  associated with null, associates it with the given non-null value.
     */
    @stub
    val V: default = ???

    /** If the specified key is not already associated
     *  with a value, associate it with the given value.
     */
    @stub
    def putIfAbsent(key: K, value: V): V = ???

    /** Removes the entry for a key only if currently mapped to a given value. */
    @stub
    def remove(key: Object, value: Object): Boolean = ???

    /** Replaces the entry for a key only if currently mapped to some value. */
    @stub
    def replace(key: K, value: V): V = ???

    /** Replaces the entry for a key only if currently mapped to a given value. */
    @stub
    def replace(key: K, oldValue: V, newValue: V): Boolean = ???

    /** Replaces each entry's value with the result of invoking the given
     *  function on that entry until all entries have been processed or the
     *  function throws an exception.
     */
    @stub
    val Unit: default = ???
}
