package javax.management.openmbean

import java.lang.{Object, String}
import java.util.Collection
import scala.scalanative.annotation.stub

/** The CompositeData interface specifies the behavior of a specific type of complex open data objects
 *  which represent composite data structures.
 */
trait CompositeData {

    /** Returns true if and only if this CompositeData instance contains
     *  an item whose name is key.
     */
    @stub
    def containsKey(key: String): Boolean = ???

    /** Returns true if and only if this CompositeData instance contains an item
     *  whose value is value.
     */
    @stub
    def containsValue(value: Any): Boolean = ???

    /** Compares the specified obj parameter with this
     *  CompositeData instance for equality.
     */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the value of the item whose name is key. */
    @stub
    def get(key: String): Any = ???

    /** Returns an array of the values of the items whose names are specified by keys, in the same order as keys. */
    @stub
    def getAll(keys: Array[String]): Array[Object] = ???

    /** Returns the composite type  of this composite data instance. */
    @stub
    def getCompositeType(): CompositeType = ???

    /** Returns the hash code value for this CompositeData instance. */
    @stub
    def hashCode(): Int = ???

    /** Returns a string representation of this CompositeData instance. */
    @stub
    def toString(): String = ???

    /** Returns an unmodifiable Collection view of the item values contained in this CompositeData instance. */
    @stub
    def values(): Collection[_] = ???
}
