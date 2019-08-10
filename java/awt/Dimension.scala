package java.awt

import java.awt.geom.Dimension2D
import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The Dimension class encapsulates the width and
 *  height of a component (in integer precision) in a single object.
 *  The class is
 *  associated with certain properties of components. Several methods
 *  defined by the Component class and the
 *  LayoutManager interface return a
 *  Dimension object.
 *  
 *  Normally the values of width
 *  and height are non-negative integers.
 *  The constructors that allow you to create a dimension do
 *  not prevent you from setting a negative value for these properties.
 *  If the value of width or height is
 *  negative, the behavior of some methods defined by other objects is
 *  undefined.
 */
class Dimension extends Dimension2D with Serializable {

    /** Creates an instance of Dimension with a width
     *  of zero and a height of zero.
     */
    @stub
    def this() = ???

    /** Creates an instance of Dimension whose width
     *  and height are the same as for the specified dimension.
     */
    @stub
    def this(d: Dimension) = ???

    /** Constructs a Dimension and initializes
     *  it to the specified width and specified height.
     */
    @stub
    def this(width: Int, height: Int) = ???

    /** The height dimension; negative values can be used. */
    @stub
    val height: Int = ???

    /** The width dimension; negative values can be used. */
    @stub
    val width: Int = ???

    /** Checks whether two dimension objects have equal values. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the height of this Dimension in double
     *  precision.
     */
    @stub
    def getHeight(): Double = ???

    /** Gets the size of this Dimension object. */
    @stub
    def getSize(): Dimension = ???

    /** Returns the width of this Dimension in double
     *  precision.
     */
    @stub
    def getWidth(): Double = ???

    /** Returns the hash code for this Dimension. */
    @stub
    def hashCode(): Int = ???

    /** Sets the size of this Dimension object to the specified size. */
    @stub
    def setSize(d: Dimension): Unit = ???

    /** Sets the size of this Dimension object to
     *  the specified width and height in double precision.
     */
    @stub
    def setSize(width: Double, height: Double): Unit = ???

    /** Sets the size of this Dimension object
     *  to the specified width and height.
     */
    @stub
    def setSize(width: Int, height: Int): Unit = ???

    /** Returns a string representation of the values of this
     *  Dimension object's height and
     *  width fields.
     */
    @stub
    def toString(): String = ???
}
