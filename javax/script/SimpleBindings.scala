package javax.script

import java.lang.{Object, String}
import java.util.{Map, Map.Entry, Set}

// A simple implementation of Bindings backed by
// a HashMap or some other specified Map.
class SimpleBindings extends Object with Bindings {

    @stub
    // Default constructor uses a HashMap.
    def this() = ???

    @stub
    // Removes all of the mappings from this map (optional operation).
    def clear(): Unit = ???

    @stub
    // Returns true if this map contains a mapping for the specified
    // key.
    def containsKey(key: Object): Boolean = ???

    @stub
    // Returns true if this map maps one or more keys to the
    // specified value.
    def containsValue(value: Object): Boolean = ???

    @stub
    // Returns a Set view of the mappings contained in this map.
    def entrySet(): Set[Map.Entry[String, Object]] = ???

    @stub
    // Returns the value to which this map maps the specified key.
    def get(key: Object): Object = ???

    @stub
    // Returns true if this map contains no key-value mappings.
    def isEmpty(): Boolean = ???

    @stub
    // Returns a Set view of the keys contained in this map.
    def keySet(): Set[String] = ???

    @stub
    // Sets the specified key/value in the underlying map field.
    def put(name: String, value: Object): Object = ???

    @stub
    // putAll is implemented using Map.putAll.
    def putAll(toMerge: Map[_ <: String, _ <: Object]): Unit = ???

    @stub
    // Removes the mapping for this key from this map if it is present
    // (optional operation).
    def remove(key: Object): Object = ???

    @stub
    // Returns the number of key-value mappings in this map.
    def size(): Int = ???
}
