package javax.script

import java.lang.{Object, String}
import java.util.{Collection, Map, Map.Entry, Set}
import scala.scalanative.annotation.stub

/** A simple implementation of Bindings backed by
 *  a HashMap or some other specified Map.
 */
class SimpleBindings extends Object with Bindings {

    /** Default constructor uses a HashMap. */
    @stub
    def this() = ???

    /** Constructor uses an existing Map to store the values. */
    @stub
    def this(m: Map[String, Object]) = ???

    /** Removes all of the mappings from this map (optional operation). */
    @stub
    def clear(): Unit = ???

    /** Returns true if this map contains a mapping for the specified
     *  key.
     */
    @stub
    def containsKey(key: Any): Boolean = ???

    /** Returns true if this map maps one or more keys to the
     *  specified value.
     */
    @stub
    def containsValue(value: Any): Boolean = ???

    /** Returns a Set view of the mappings contained in this map. */
    @stub
    def entrySet(): Set[Map.Entry[String, Object]] = ???

    /** Returns the value to which this map maps the specified key. */
    @stub
    def get(key: Any): Any = ???

    /** Returns true if this map contains no key-value mappings. */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns a Set view of the keys contained in this map. */
    @stub
    def keySet(): Set[String] = ???

    /** Sets the specified key/value in the underlying map field. */
    @stub
    def put(name: String, value: Any): Any = ???

    /** putAll is implemented using Map.putAll. */
    @stub
    def putAll(toMerge: Map[_ <: String, _ <: Object]): Unit = ???

    /** Removes the mapping for this key from this map if it is present
     *  (optional operation).
     */
    @stub
    def remove(key: Any): Any = ???

    /** Returns the number of key-value mappings in this map. */
    @stub
    def size(): Int = ???

    /** Returns a Collection view of the values contained in this map. */
    @stub
    def values(): Collection[Object] = ???
}
