package javax.script

import java.lang.{Object, String}
import java.util.Map
import scala.scalanative.annotation.stub

/** A mapping of key/value pairs, all of whose keys are
 *  Strings.
 */
trait Bindings extends Map[String, Object] {

    /** Returns true if this map contains a mapping for the specified
     *  key.
     */
    @stub
    def containsKey(key: Object): Boolean = ???

    /** Returns the value to which this map maps the specified key. */
    @stub
    def get(key: Object): Object = ???

    /** Set a named value. */
    @stub
    def put(name: String, value: Object): Object = ???

    /** Adds all the mappings in a given Map to this Bindings. */
    @stub
    def putAll(toMerge: Map[_ <: String, _ <: Object]): Unit = ???

    /** Removes the mapping for this key from this map if it is present
     *  (optional operation).
     */
    @stub
    def remove(key: Object): Object = ???
}
