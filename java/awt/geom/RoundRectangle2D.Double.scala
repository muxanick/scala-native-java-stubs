package java.awt.geom

import java.io.Serializable
import java.lang.Object

// The Double class defines a rectangle with rounded
// corners all specified in double coordinates.
object RoundRectangle2D.Double extends RoundRectangle2D with Serializable {

    @stub
    // Constructs a new RoundRectangle2D, initialized to
    // location (0.0, 0.0), size (0.0, 0.0), and corner arcs
    // of radius 0.0.
    def Double() = ???

    @stub
    // The height of the arc that rounds off the corners.
    def archeight: double = ???

    @stub
    // The width of the arc that rounds off the corners.
    def arcwidth: double = ???

    @stub
    // The height of this RoundRectangle2D.
    def height: double = ???

    @stub
    // The width of this RoundRectangle2D.
    def width: double = ???

    @stub
    // The X coordinate of this RoundRectangle2D.
    def x: double = ???

    @stub
    // Gets the height of the arc that rounds off the corners.
    def getArcHeight(): double = ???

    @stub
    // Gets the width of the arc that rounds off the corners.
    def getArcWidth(): double = ???

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
    // Sets the location, size, and corner radii of this
    // RoundRectangle2D to the specified
    // double values.
    def setRoundRect(x: double, y: double, w: double, h: double, arcw: double, arch: double): Unit = ???
}
