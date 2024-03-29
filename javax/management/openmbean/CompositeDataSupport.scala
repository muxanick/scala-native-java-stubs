package javax.management.openmbean

import java.io.Serializable
import java.lang.{Object, String}
import java.util.{Collection, Map}
import scala.scalanative.annotation.stub

/** The CompositeDataSupport class is the open data class which
 *  implements the CompositeData interface.
 */
class CompositeDataSupport extends Object with CompositeData with Serializable {

    /** 
     *  Constructs a CompositeDataSupport instance with the specified compositeType, whose item names and corresponding values
     *  are given by the mappings in the map items.
     */
    @stub
    def this(compositeType: CompositeType, items: Map[String, _]) = ???

    /** Constructs a CompositeDataSupport instance with the specified
     *  compositeType, whose item values
     *  are specified by itemValues[], in the same order as in
     *  itemNames[].
     */
    @stub
    def this(compositeType: CompositeType, itemNames: Array[String], itemValues: Array[Object]) = ???

    /** Returns true if and only if this CompositeData instance contains
     *  an item whose name is key.
     */
    @stub
    def containsKey(key: String): Boolean = ???

    /** Returns true if and only if this CompositeData instance
     *  contains an item
     *  whose value is value.
     */
    @stub
    def containsValue(value: Any): Boolean = ???

    /** Compares the specified obj parameter with this
     *  CompositeDataSupport instance for equality.
     */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the value of the item whose name is key. */
    @stub
    def get(key: String): Any = ???

    /** Returns an array of the values of the items whose names are specified by
     *  keys, in the same order as keys.
     */
    @stub
    def getAll(keys: Array[String]): Array[Object] = ???

    /** Returns the composite type  of this composite data instance. */
    @stub
    def getCompositeType(): CompositeType = ???

    /** Returns the hash code value for this CompositeDataSupport instance. */
    @stub
    def hashCode(): Int = ???

    /** Returns a string representation of this CompositeDataSupport instance. */
    @stub
    def toString(): String = ???

    /** Returns an unmodifiable Collection view of the item values contained in this
     *  CompositeData instance.
     */
    @stub
    def values(): Collection[_] = ???
}
