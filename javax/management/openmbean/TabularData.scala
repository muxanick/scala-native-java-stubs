package javax.management.openmbean

import java.lang.{Object, String}
import java.util.Set

// The TabularData interface specifies the behavior of a specific type of complex open data objects
// which represent tabular data structures.
trait TabularData {

    @stub
    // Calculates the index that would be used in this TabularData instance to refer to the specified
    // composite data value parameter if it were added to this instance.
    def calculateIndex(value: CompositeData): Array[Object] = ???

    @stub
    // Removes all CompositeData values (ie rows) from this TabularData instance.
    def clear(): Unit = ???

    @stub
    // Returns true if and only if this TabularData instance contains a CompositeData value
    // (ie a row) whose index is the specified key.
    def containsKey(key: Array[Object]): Boolean = ???

    @stub
    // Returns true if and only if this TabularData instance contains the specified
    // CompositeData value.
    def containsValue(value: CompositeData): Boolean = ???

    @stub
    // Compares the specified obj parameter with this TabularData instance for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the CompositeData value whose index is
    // key, or null if there is no value mapping
    // to key, in this TabularData instance.
    def get(key: Array[Object]): CompositeData = ???

    @stub
    // Returns the tabular type describing this
    // TabularData instance.
    def getTabularType(): TabularType = ???

    @stub
    // Returns the hash code value for this TabularData instance.
    def hashCode(): Int = ???

    @stub
    // Returns true if the number of CompositeData
    // values (ie the number of rows) contained in this
    // TabularData instance is zero.
    def isEmpty(): Boolean = ???

    @stub
    // Returns a set view of the keys (ie the index values) of the
    // CompositeData values (ie the rows) contained in this
    // TabularData instance.
    def keySet(): Set[_] = ???

    @stub
    // Adds value to this TabularData instance.
    def put(value: CompositeData): Unit = ???

    @stub
    // Add all the elements in values to this TabularData instance.
    def putAll(values: Array[CompositeData]): Unit = ???

    @stub
    // Removes the CompositeData value whose index is key from this TabularData instance,
    // and returns the removed value, or returns null if there is no value whose index is key.
    def remove(key: Array[Object]): CompositeData = ???

    @stub
    // Returns the number of CompositeData values (ie the
    // number of rows) contained in this TabularData
    // instance.
    def size(): Int = ???

    @stub
    // Returns a string representation of this TabularData instance.
    def toString(): String = ???
}
