package java.awt

import java.io.Serializable
import java.lang.{Cloneable, Object}

// An Insets object is a representation of the borders
// of a container. It specifies the space that a container must leave
// at each of its edges. The space can be a border, a blank space, or
// a title.
class Insets extends Object with Cloneable, with Serializable {

    @stub
    // The inset from the bottom.
    def bottom: Int = ???

    @stub
    // The inset from the left.
    def left: Int = ???

    @stub
    // The inset from the right.
    def right: Int = ???

    @stub
    // Create a copy of this object.
    def clone(): Object = ???

    @stub
    // Checks whether two insets objects are equal.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the hash code for this Insets.
    def hashCode(): Int = ???

    @stub
    // Set top, left, bottom, and right to the specified values
    def set(top: Int, left: Int, bottom: Int, right: Int): Unit = ???
}
