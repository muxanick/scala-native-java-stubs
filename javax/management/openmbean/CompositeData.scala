package javax.management.openmbean

import java.lang.{Object, String}

// The CompositeData interface specifies the behavior of a specific type of complex open data objects
// which represent composite data structures.
trait CompositeData {

    @stub
    // Returns true if and only if this CompositeData instance contains
    // an item whose name is key.
    def containsKey(key: String): Boolean = ???

    @stub
    // Returns true if and only if this CompositeData instance contains an item
    // whose value is value.
    def containsValue(value: Object): Boolean = ???

    @stub
    // Compares the specified obj parameter with this
    // CompositeData instance for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the value of the item whose name is key.
    def get(key: String): Object = ???

    @stub
    // Returns an array of the values of the items whose names are specified by keys, in the same order as keys.
    def getAll(keys: Array[String]): Array[Object] = ???

    @stub
    // Returns the composite type  of this composite data instance.
    def getCompositeType(): CompositeType = ???

    @stub
    // Returns the hash code value for this CompositeData instance.
    def hashCode(): Int = ???

    @stub
    // Returns a string representation of this CompositeData instance.
    def toString(): String = ???
}
