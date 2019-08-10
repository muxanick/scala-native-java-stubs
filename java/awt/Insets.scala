package java.awt

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import scala.scalanative.annotation.stub

/** An Insets object is a representation of the borders
 *  of a container. It specifies the space that a container must leave
 *  at each of its edges. The space can be a border, a blank space, or
 *  a title.
 */
class Insets extends Object with Cloneable with Serializable {

    /** Creates and initializes a new Insets object with the
     *  specified top, left, bottom, and right insets.
     */
    @stub
    def this(top: Int, left: Int, bottom: Int, right: Int) = ???

    /** The inset from the bottom. */
    @stub
    val bottom: Int = ???

    /** The inset from the left. */
    @stub
    val left: Int = ???

    /** The inset from the right. */
    @stub
    val right: Int = ???

    /** The inset from the top. */
    @stub
    val top: Int = ???

    /** Create a copy of this object. */
    @stub
    def clone(): Any = ???

    /** Checks whether two insets objects are equal. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the hash code for this Insets. */
    @stub
    def hashCode(): Int = ???

    /** Set top, left, bottom, and right to the specified values */
    @stub
    def set(top: Int, left: Int, bottom: Int, right: Int): Unit = ???

    /** Returns a string representation of this Insets object. */
    @stub
    def toString(): String = ???
}
