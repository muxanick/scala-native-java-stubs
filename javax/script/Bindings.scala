package javax.script

import java.lang.{Object, String}
import java.util.Map

// A mapping of key/value pairs, all of whose keys are
// Strings.
trait Bindings extends Map[String, Object] {

    @stub
    // Returns true if this map contains a mapping for the specified
    // key.
    def containsKey(key: Object): Boolean = ???

    @stub
    // Returns the value to which this map maps the specified key.
    def get(key: Object): Object = ???

    @stub
    // Set a named value.
    def put(name: String, value: Object): Object = ???

    @stub
    // Adds all the mappings in a given Map to this Bindings.
    def putAll(toMerge: Map[_ <: String, _ <: Object]): Unit = ???
}
