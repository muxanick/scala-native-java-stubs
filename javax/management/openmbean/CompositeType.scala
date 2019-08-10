package javax.management.openmbean

import java.lang.{Object, String}
import java.util.Set
import scala.scalanative.annotation.stub

/** The CompositeType class is the open type class
 *  whose instances describe the types of CompositeData values.
 */
class CompositeType extends OpenType[CompositeData] {

    /** Constructs a CompositeType instance, checking for the validity of the given parameters. */
    @stub
    def this(typeName: String, description: String, itemNames: Array[String], itemDescriptions: Array[String], itemTypes: Array[OpenType[_]]) = ???

    /** Returns true if this CompositeType instance defines an item
     *  whose name is itemName.
     */
    @stub
    def containsKey(itemName: String): Boolean = ???

    /** Compares the specified obj parameter with this CompositeType instance for equality. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the description of the item whose name is itemName,
     *  or null if this CompositeType instance does not define any item
     *  whose name is itemName.
     */
    @stub
    def getDescription(itemName: String): String = ???

    /** Returns the open type of the item whose name is itemName,
     *  or null if this CompositeType instance does not define any item
     *  whose name is itemName.
     */
    @stub
    def getType(itemName: String): OpenType[_] = ???

    /** Returns the hash code value for this CompositeType instance. */
    @stub
    def hashCode(): Int = ???

    /** Tests whether obj is a value which could be
     *  described by this CompositeType instance.
     */
    @stub
    def isValue(obj: Any): Boolean = ???

    /** Returns an unmodifiable Set view of all the item names defined by this CompositeType instance. */
    @stub
    def keySet(): Set[String] = ???

    /** Returns a string representation of this CompositeType instance. */
    @stub
    def toString(): String = ???
}
