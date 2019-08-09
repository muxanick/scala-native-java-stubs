package java.awt.geom

import java.io.Serializable
import java.lang.Object

// The Float class defines a rectangle specified in float
// coordinates.
object Rectangle2D.Float extends Rectangle2D with Serializable {

    @stub
    // Constructs a new Rectangle2D, initialized to
    // location (0.0, 0.0) and size (0.0, 0.0).
    def Float() = ???

    @stub
    // The height of this Rectangle2D.
    def height: float = ???

    @stub
    // The width of this Rectangle2D.
    def width: float = ???

    @stub
    // The X coordinate of this Rectangle2D.
    def x: float = ???

    @stub
    // Returns a new Rectangle2D object representing the
    // intersection of this Rectangle2D with the specified
    // Rectangle2D.
    def createIntersection(r: Rectangle2D): Rectangle2D = ???

    @stub
    // Returns a new Rectangle2D object representing the
    // union of this Rectangle2D with the specified
    // Rectangle2D.
    def createUnion(r: Rectangle2D): Rectangle2D = ???

    @stub
    // Returns a high precision and more accurate bounding box of
    // the Shape than the getBounds method.
    def getBounds2D(): Rectangle2D = ???

    @stub
    // Returns the height of the framing rectangle
    // in double precision.
    def getHeight(): double = ???

    @stub
    // Returns the width of the framing rectangle in
    // double precision.
    def getWidth(): double = ???

    @stub
    // Returns the X coordinate of the upper-left corner of
    // the framing rectangle in double precision.
    def getX(): double = ???

    @stub
    // Returns the Y coordinate of the upper-left corner of
    // the framing rectangle in double precision.
    def getY(): double = ???

    @stub
    // Determines whether the RectangularShape is empty.
    def isEmpty(): Boolean = ???

    @stub
    // Determines where the specified coordinates lie with respect
    // to this Rectangle2D.
    def outcode(x: double, y: double): Int = ???

    @stub
    // Sets the location and size of this Rectangle2D
    // to the specified double values.
    def setRect(x: double, y: double, w: double, h: double): Unit = ???

    @stub
    // Sets the location and size of this Rectangle2D
    // to the specified float values.
    def setRect(x: float, y: float, w: float, h: float): Unit = ???

    @stub
    // Sets this Rectangle2D to be the same as the specified
    // Rectangle2D.
    def setRect(r: Rectangle2D): Unit = ???
}
