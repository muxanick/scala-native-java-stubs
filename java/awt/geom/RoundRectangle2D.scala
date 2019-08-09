package java.awt.geom

import java.lang.Object

// The RoundRectangle2D class defines a rectangle with
// rounded corners defined by a location (x,y), a
// dimension (w x h), and the width and height of an arc
// with which to round the corners.
// 
// This class is the abstract superclass for all objects that
// store a 2D rounded rectangle.
// The actual storage representation of the coordinates is left to
// the subclass.
abstract class RoundRectangle2D extends RectangularShape {

    // Tests if the specified coordinates are inside the boundary of the
    // Shape, as described by the
    // 
    // definition of insideness.
    def contains(x: double, y: double): Boolean

    // Tests if the interior of the Shape entirely contains
    // the specified rectangular area.
    def contains(x: double, y: double, w: double, h: double): Boolean

    // Determines whether or not the specified Object is
    // equal to this RoundRectangle2D.
    def equals(obj: Object): Boolean

    // Gets the height of the arc that rounds off the corners.
    def getArcHeight(): double

    // Gets the width of the arc that rounds off the corners.
    def getArcWidth(): double

    // Returns an iteration object that defines the boundary of this
    // RoundRectangle2D.
    def getPathIterator(at: AffineTransform): PathIterator

    // Returns the hashcode for this RoundRectangle2D.
    def hashCode(): Int

    // Tests if the interior of the Shape intersects the
    // interior of a specified rectangular area.
    def intersects(x: double, y: double, w: double, h: double): Boolean

    // Sets the location and size of the framing rectangle of this
    // Shape to the specified rectangular values.
    def setFrame(x: double, y: double, w: double, h: double): Unit

    // Sets the location, size, and corner radii of this
    // RoundRectangle2D to the specified
    // double values.
    def setRoundRect(x: double, y: double, w: double, h: double, arcWidth: double, arcHeight: double): Unit
}

object RoundRectangle2D {
    @stub
    // The Double class defines a rectangle with rounded
    // corners all specified in double coordinates.
    def RoundRectangle2D.Double: class = ???
}
