package java.awt.geom

import java.awt.{Rectangle, Shape}
import java.lang.{Cloneable, Object}

// RectangularShape is the base class for a number of
// Shape objects whose geometry is defined by a rectangular frame.
// This class does not directly specify any specific geometry by
// itself, but merely provides manipulation methods inherited by
// a whole category of Shape objects.
// The manipulation methods provided by this class can be used to
// query and modify the rectangular frame, which provides a reference
// for the subclasses to define their geometry.
abstract class RectangularShape extends Object with Shape, with Cloneable {

    // Creates a new object of the same class and with the same
    // contents as this object.
    def clone(): Object

    // Tests if a specified Point2D is inside the boundary
    // of the Shape, as described by the
    // 
    // definition of insideness.
    def contains(p: Point2D): Boolean

    // Tests if the interior of the Shape entirely contains the
    // specified Rectangle2D.
    def contains(r: Rectangle2D): Boolean

    // Returns an integer Rectangle that completely encloses the
    // Shape.
    def getBounds(): Rectangle

    // Returns the X coordinate of the center of the framing
    // rectangle of the Shape in double
    // precision.
    def getCenterX(): double

    // Returns the Y coordinate of the center of the framing
    // rectangle of the Shape in double
    // precision.
    def getCenterY(): double

    // Returns the framing Rectangle2D
    // that defines the overall shape of this object.
    def getFrame(): Rectangle2D

    // Returns the height of the framing rectangle
    // in double precision.
    def getHeight(): double

    // Returns the largest X coordinate of the framing
    // rectangle of the Shape in double
    // precision.
    def getMaxX(): double

    // Returns the largest Y coordinate of the framing
    // rectangle of the Shape in double
    // precision.
    def getMaxY(): double

    // Returns the smallest X coordinate of the framing
    // rectangle of the Shape in double
    // precision.
    def getMinX(): double

    // Returns the smallest Y coordinate of the framing
    // rectangle of the Shape in double
    // precision.
    def getMinY(): double

    // Returns an iterator object that iterates along the
    // Shape object's boundary and provides access to a
    // flattened view of the outline of the Shape
    // object's geometry.
    def getPathIterator(at: AffineTransform, flatness: double): PathIterator

    // Returns the width of the framing rectangle in
    // double precision.
    def getWidth(): double

    // Returns the X coordinate of the upper-left corner of
    // the framing rectangle in double precision.
    def getX(): double

    // Returns the Y coordinate of the upper-left corner of
    // the framing rectangle in double precision.
    def getY(): double

    // Tests if the interior of the Shape intersects the
    // interior of a specified Rectangle2D.
    def intersects(r: Rectangle2D): Boolean

    // Determines whether the RectangularShape is empty.
    def isEmpty(): Boolean

    // Sets the location and size of the framing rectangle of this
    // Shape to the specified rectangular values.
    def setFrame(x: double, y: double, w: double, h: double): Unit

    // Sets the location and size of the framing rectangle of this
    // Shape to the specified Point2D and
    // Dimension2D, respectively.
    def setFrame(loc: Point2D, size: Dimension2D): Unit

    // Sets the framing rectangle of this Shape to
    // be the specified Rectangle2D.
    def setFrame(r: Rectangle2D): Unit

    // Sets the framing rectangle of this Shape
    // based on the specified center point coordinates and corner point
    // coordinates.
    def setFrameFromCenter(centerX: double, centerY: double, cornerX: double, cornerY: double): Unit

    // Sets the framing rectangle of this Shape based on a
    // specified center Point2D and corner
    // Point2D.
    def setFrameFromCenter(center: Point2D, corner: Point2D): Unit

    // Sets the diagonal of the framing rectangle of this Shape
    // based on the two specified coordinates.
    def setFrameFromDiagonal(x1: double, y1: double, x2: double, y2: double): Unit
}
