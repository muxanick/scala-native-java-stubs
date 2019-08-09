package java.awt.geom

import java.io.Serializable
import java.lang.Object

// The Float class defines a rectangle with rounded
// corners all specified in float coordinates.
object RoundRectangle2D.Float extends RoundRectangle2D with Serializable {

    @stub
    // Constructs a new RoundRectangle2D, initialized to
    // location (0.0, 0.0), size (0.0, 0.0), and corner arcs
    // of radius 0.0.
    def Float() = ???

    @stub
    // The height of the arc that rounds off the corners.
    def archeight: float = ???

    @stub
    // The width of the arc that rounds off the corners.
    def arcwidth: float = ???

    @stub
    // The height of this RoundRectangle2D.
    def height: float = ???

    @stub
    // The width of this RoundRectangle2D.
    def width: float = ???

    @stub
    // The X coordinate of this RoundRectangle2D.
    def x: float = ???

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

    @stub
    // Sets the location, size, and corner radii of this
    // RoundRectangle2D to the specified
    // float values.
    def setRoundRect(x: float, y: float, w: float, h: float, arcw: float, arch: float): Unit = ???
}
