package java.awt

import java.awt.geom.Dimension2D
import java.io.Serializable
import java.lang.Object

// The Dimension class encapsulates the width and
// height of a component (in integer precision) in a single object.
// The class is
// associated with certain properties of components. Several methods
// defined by the Component class and the
// LayoutManager interface return a
// Dimension object.
// 
// Normally the values of width
// and height are non-negative integers.
// The constructors that allow you to create a dimension do
// not prevent you from setting a negative value for these properties.
// If the value of width or height is
// negative, the behavior of some methods defined by other objects is
// undefined.
class Dimension extends Dimension2D with Serializable {

    @stub
    // Creates an instance of Dimension with a width
    // of zero and a height of zero.
    def this() = ???

    @stub
    // Creates an instance of Dimension whose width
    // and height are the same as for the specified dimension.
    def this(d: Dimension) = ???

    @stub
    // The height dimension; negative values can be used.
    def height: Int = ???

    @stub
    // Checks whether two dimension objects have equal values.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the height of this Dimension in double
    // precision.
    def getHeight(): double = ???

    @stub
    // Gets the size of this Dimension object.
    def getSize(): Dimension = ???

    @stub
    // Returns the width of this Dimension in double
    // precision.
    def getWidth(): double = ???

    @stub
    // Returns the hash code for this Dimension.
    def hashCode(): Int = ???

    @stub
    // Sets the size of this Dimension object to the specified size.
    def setSize(d: Dimension): Unit = ???

    @stub
    // Sets the size of this Dimension object to
    // the specified width and height in double precision.
    def setSize(width: double, height: double): Unit = ???

    @stub
    // Sets the size of this Dimension object
    // to the specified width and height.
    def setSize(width: Int, height: Int): Unit = ???
}
