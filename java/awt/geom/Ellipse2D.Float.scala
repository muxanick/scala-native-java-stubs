package java.awt.geom

import java.io.Serializable
import java.lang.Object

// The Float class defines an ellipse specified
// in float precision.
object Ellipse2D.Float extends Ellipse2D with Serializable {

    @stub
    // Constructs a new Ellipse2D, initialized to
    // location (0, 0) and size (0, 0).
    def Float() = ???

    @stub
    // The overall height of this Ellipse2D.
    def height: float = ???

    @stub
    // The overall width of this Ellipse2D.
    def width: float = ???

    @stub
    // The X coordinate of the upper-left corner of the
    // framing rectangle of this Ellipse2D.
    def x: float = ???

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
    // Sets the location and size of the framing rectangle of this
    // Shape to the specified rectangular values.
    def setFrame(x: double, y: double, w: double, h: double): Unit = ???
}
