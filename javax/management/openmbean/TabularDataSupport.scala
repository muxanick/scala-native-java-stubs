package javax.management.openmbean

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import java.util.{Collection, Map, Map.Entry, Set}
import scala.scalanative.annotation.stub

/** The TabularDataSupport class is the open data class which implements the TabularData
 *  and the Map interfaces, and which is internally based on a hash map data structure.
 */
class TabularDataSupport extends Object with TabularData with Map[Object, Object] with Cloneable with Serializable {

    /** Creates an empty TabularDataSupport instance whose open-type is tabularType,
     *  and whose underlying HashMap has a default initial capacity (101) and default load factor (0.75).
     */
    @stub
    def this(tabularType: TabularType) = ???

    /** Creates an empty TabularDataSupport instance whose open-type is tabularType,
     *  and whose underlying HashMap has the specified initial capacity and load factor.
     */
    @stub
    def this(tabularType: TabularType, initialCapacity: Int, loadFactor: Float) = ???

    /** Calculates the index that would be used in this TabularData instance to refer to the specified
     *  composite data value parameter if it were added to this instance.
     */
    @stub
    def calculateIndex(value: CompositeData): Array[Object] = ???

    /** Removes all rows from this TabularDataSupport instance. */
    @stub
    def clear(): Unit = ???

    /** Returns a clone of this TabularDataSupport instance:
     *  the clone is obtained by calling super.clone(), and then cloning the underlying map.
     */
    @stub
    def clone(): Object = ???

    /** Returns true if and only if this TabularData instance contains a CompositeData value
     *  (ie a row) whose index is the specified key.
     */
    @stub
    def containsKey(key: Object): Boolean = ???

    /** Returns true if and only if this TabularData instance contains a CompositeData value
     *  (ie a row) whose index is the specified key.
     */
    @stub
    def containsKey(key: Array[Object]): Boolean = ???

    /** Returns true if and only if this TabularData instance contains the specified
     *  CompositeData value.
     */
    @stub
    def containsValue(value: CompositeData): Boolean = ???

    /** Returns true if and only if this TabularData instance contains the specified
     *  value.
     */
    @stub
    def containsValue(value: Object): Boolean = ???

    /** Returns a collection view of the index to row mappings
     *  contained in this TabularDataSupport instance.
     */
    @stub
    def entrySet(): Set[Map.Entry[Object, Object]] = ???

    /** Compares the specified obj parameter with this TabularDataSupport instance for equality. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** This method simply calls get((Object[]) key). */
    @stub
    def get(key: Object): Object = ???

    /** Returns the CompositeData value whose index is
     *  key, or null if there is no value mapping
     *  to key, in this TabularData instance.
     */
    @stub
    def get(key: Array[Object]): CompositeData = ???

    /** Returns the tabular type describing this TabularData instance. */
    @stub
    def getTabularType(): TabularType = ???

    /** Returns the hash code value for this TabularDataSupport instance. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if this TabularDataSupport instance contains no rows. */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns a set view of the keys contained in the underlying map of this
     *  TabularDataSupport instance used to index the rows.
     */
    @stub
    def keySet(): Set[Object] = ???

    /** Adds value to this TabularData instance. */
    @stub
    def put(value: CompositeData): Unit = ???

    /** This method simply calls put((CompositeData) value) and
     *  therefore ignores its key parameter which can be null.
     */
    @stub
    def put(key: Object, value: Object): Object = ???

    /** Add all the elements in values to this
     *  TabularData instance.
     */
    @stub
    def putAll(values: Array[CompositeData]): Unit = ???

    /** Add all the values contained in the specified map t
     *  to this TabularData instance.
     */
    @stub
    def putAll(t: Map[_, _]): Unit = ???

    /** This method simply calls remove((Object[]) key). */
    @stub
    def remove(key: Object): Object = ???

    /** Removes the CompositeData value whose index is key from this TabularData instance,
     *  and returns the removed value, or returns null if there is no value whose index is key.
     */
    @stub
    def remove(key: Array[Object]): CompositeData = ???

    /** Returns the number of rows in this TabularDataSupport instance. */
    @stub
    def size(): Int = ???

    /** Returns a string representation of this TabularDataSupport instance. */
    @stub
    def toString(): String = ???

    /** Returns a collection view of the rows contained in this
     *  TabularDataSupport instance.
     */
    @stub
    def values(): Collection[Object] = ???
}
