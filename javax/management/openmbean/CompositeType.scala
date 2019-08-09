package javax.management.openmbean

import java.lang.{Object, String}
import java.util.Set

// The CompositeType class is the open type class
// whose instances describe the types of CompositeData values.
class CompositeType extends OpenType[CompositeData] {

    @stub
    // Returns true if this CompositeType instance defines an item
    // whose name is itemName.
    def containsKey(itemName: String): Boolean = ???

    @stub
    // Compares the specified obj parameter with this CompositeType instance for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the description of the item whose name is itemName,
    // or null if this CompositeType instance does not define any item
    // whose name is itemName.
    def getDescription(itemName: String): String = ???

    @stub
    // Returns the open type of the item whose name is itemName,
    // or null if this CompositeType instance does not define any item
    // whose name is itemName.
    def getType(itemName: String): OpenType[_] = ???

    @stub
    // Returns the hash code value for this CompositeType instance.
    def hashCode(): Int = ???

    @stub
    // Tests whether obj is a value which could be
    // described by this CompositeType instance.
    def isValue(obj: Object): Boolean = ???

    @stub
    // Returns an unmodifiable Set view of all the item names defined by this CompositeType instance.
    def keySet(): Set[String] = ???
}
