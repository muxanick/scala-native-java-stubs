package javax.management.openmbean

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import java.util.{Map, Map.Entry, Set}

// The TabularDataSupport class is the open data class which implements the TabularData
// and the Map interfaces, and which is internally based on a hash map data structure.
class TabularDataSupport extends Object with TabularData, with Map[Object, Object], with Cloneable, with Serializable {

    @stub
    // Creates an empty TabularDataSupport instance whose open-type is tabularType,
    // and whose underlying HashMap has a default initial capacity (101) and default load factor (0.75).
    def this(tabularType: TabularType) = ???

    @stub
    // Calculates the index that would be used in this TabularData instance to refer to the specified
    // composite data value parameter if it were added to this instance.
    def calculateIndex(value: CompositeData): Array[Object] = ???

    @stub
    // Removes all rows from this TabularDataSupport instance.
    def clear(): Unit = ???

    @stub
    // Returns a clone of this TabularDataSupport instance:
    // the clone is obtained by calling super.clone(), and then cloning the underlying map.
    def clone(): Object = ???

    @stub
    // Returns true if and only if this TabularData instance contains a CompositeData value
    // (ie a row) whose index is the specified key.
    def containsKey(key: Object): Boolean = ???

    @stub
    // Returns true if and only if this TabularData instance contains a CompositeData value
    // (ie a row) whose index is the specified key.
    def containsKey(key: Array[Object]): Boolean = ???

    @stub
    // Returns true if and only if this TabularData instance contains the specified
    // CompositeData value.
    def containsValue(value: CompositeData): Boolean = ???

    @stub
    // Returns true if and only if this TabularData instance contains the specified
    // value.
    def containsValue(value: Object): Boolean = ???

    @stub
    // Returns a collection view of the index to row mappings
    // contained in this TabularDataSupport instance.
    def entrySet(): Set[Map.Entry[Object, Object]] = ???

    @stub
    // Compares the specified obj parameter with this TabularDataSupport instance for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // This method simply calls get((Object[]) key).
    def get(key: Object): Object = ???

    @stub
    // Returns the CompositeData value whose index is
    // key, or null if there is no value mapping
    // to key, in this TabularData instance.
    def get(key: Array[Object]): CompositeData = ???

    @stub
    // Returns the tabular type describing this TabularData instance.
    def getTabularType(): TabularType = ???

    @stub
    // Returns the hash code value for this TabularDataSupport instance.
    def hashCode(): Int = ???

    @stub
    // Returns true if this TabularDataSupport instance contains no rows.
    def isEmpty(): Boolean = ???

    @stub
    // Returns a set view of the keys contained in the underlying map of this
    // TabularDataSupport instance used to index the rows.
    def keySet(): Set[Object] = ???

    @stub
    // Adds value to this TabularData instance.
    def put(value: CompositeData): Unit = ???

    @stub
    // This method simply calls put((CompositeData) value) and
    // therefore ignores its key parameter which can be null.
    def put(key: Object, value: Object): Object = ???

    @stub
    // Add all the elements in values to this
    // TabularData instance.
    def putAll(values: Array[CompositeData]): Unit = ???

    @stub
    // Add all the values contained in the specified map t
    // to this TabularData instance.
    def putAll(t: Map[_, _]): Unit = ???

    @stub
    // This method simply calls remove((Object[]) key).
    def remove(key: Object): Object = ???

    @stub
    // Removes the CompositeData value whose index is key from this TabularData instance,
    // and returns the removed value, or returns null if there is no value whose index is key.
    def remove(key: Array[Object]): CompositeData = ???

    @stub
    // Returns the number of rows in this TabularDataSupport instance.
    def size(): Int = ???

    @stub
    // Returns a string representation of this TabularDataSupport instance.
    def toString(): String = ???
}
