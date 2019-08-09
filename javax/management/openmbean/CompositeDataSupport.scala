package javax.management.openmbean

import java.io.Serializable
import java.lang.{Object, String}
import java.util.Map

// The CompositeDataSupport class is the open data class which
// implements the CompositeData interface.
class CompositeDataSupport extends Object with CompositeData, with Serializable {

    @stub
    // 
    // Constructs a CompositeDataSupport instance with the specified compositeType, whose item names and corresponding values
    // are given by the mappings in the map items.
    def this(compositeType: CompositeType, items: Map[String, _]) = ???

    @stub
    // Returns true if and only if this CompositeData instance contains
    // an item whose name is key.
    def containsKey(key: String): Boolean = ???

    @stub
    // Returns true if and only if this CompositeData instance
    // contains an item
    // whose value is value.
    def containsValue(value: Object): Boolean = ???

    @stub
    // Compares the specified obj parameter with this
    // CompositeDataSupport instance for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the value of the item whose name is key.
    def get(key: String): Object = ???

    @stub
    // Returns an array of the values of the items whose names are specified by
    // keys, in the same order as keys.
    def getAll(keys: Array[String]): Array[Object] = ???

    @stub
    // Returns the composite type  of this composite data instance.
    def getCompositeType(): CompositeType = ???

    @stub
    // Returns the hash code value for this CompositeDataSupport instance.
    def hashCode(): Int = ???

    @stub
    // Returns a string representation of this CompositeDataSupport instance.
    def toString(): String = ???
}
