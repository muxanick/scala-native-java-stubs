package java.awt.geom

import java.io.Serializable
import java.lang.Object

// The Double class defines an ellipse specified
// in double precision.
object Ellipse2D.Double extends Ellipse2D with Serializable {

    @stub
    // Constructs a new Ellipse2D, initialized to
    // location (0, 0) and size (0, 0).
    def Double() = ???

    @stub
    // The overall height of the Ellipse2D.
    def height: double = ???

    @stub
    // The overall width of this Ellipse2D.
    def width: double = ???

    @stub
    // The X coordinate of the upper-left corner of the
    // framing rectangle of this Ellipse2D.
    def x: double = ???

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
}
