package javax.management.openmbean

import java.lang.{Object, String}
import java.util.{Collection, Set}
import scala.scalanative.annotation.stub

/** The TabularData interface specifies the behavior of a specific type of complex open data objects
 *  which represent tabular data structures.
 */
trait TabularData {

    /** Calculates the index that would be used in this TabularData instance to refer to the specified
     *  composite data value parameter if it were added to this instance.
     */
    @stub
    def calculateIndex(value: CompositeData): Array[Object] = ???

    /** Removes all CompositeData values (ie rows) from this TabularData instance. */
    @stub
    def clear(): Unit = ???

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

    /** Compares the specified obj parameter with this TabularData instance for equality. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the CompositeData value whose index is
     *  key, or null if there is no value mapping
     *  to key, in this TabularData instance.
     */
    @stub
    def get(key: Array[Object]): CompositeData = ???

    /** Returns the tabular type describing this
     *  TabularData instance.
     */
    @stub
    def getTabularType(): TabularType = ???

    /** Returns the hash code value for this TabularData instance. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if the number of CompositeData
     *  values (ie the number of rows) contained in this
     *  TabularData instance is zero.
     */
    @stub
    def isEmpty(): Boolean = ???

    /** Returns a set view of the keys (ie the index values) of the
     *  CompositeData values (ie the rows) contained in this
     *  TabularData instance.
     */
    @stub
    def keySet(): Set[_] = ???

    /** Adds value to this TabularData instance. */
    @stub
    def put(value: CompositeData): Unit = ???

    /** Add all the elements in values to this TabularData instance. */
    @stub
    def putAll(values: Array[CompositeData]): Unit = ???

    /** Removes the CompositeData value whose index is key from this TabularData instance,
     *  and returns the removed value, or returns null if there is no value whose index is key.
     */
    @stub
    def remove(key: Array[Object]): CompositeData = ???

    /** Returns the number of CompositeData values (ie the
     *  number of rows) contained in this TabularData
     *  instance.
     */
    @stub
    def size(): Int = ???

    /** Returns a string representation of this TabularData instance. */
    @stub
    def toString(): String = ???

    /** Returns a collection view of the CompositeData values
     *  (ie the rows) contained in this TabularData instance.
     */
    @stub
    def values(): Collection[_] = ???
}
