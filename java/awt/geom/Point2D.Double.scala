package java.awt.geom

import java.io.Serializable
import java.lang.Object

// The Double class defines a point specified in
// double precision.
object Point2D.Double extends Point2D with Serializable {

    @stub
    // Constructs and initializes a Point2D with
    // coordinates (0, 0).
    def Double() = ???

    @stub
    // The X coordinate of this Point2D.
    def x: double = ???

    @stub
    // Returns the X coordinate of this Point2D in
    // double precision.
    def getX(): double = ???

    @stub
    // Returns the Y coordinate of this Point2D in
    // double precision.
    def getY(): double = ???

    @stub
    // Sets the location of this Point2D to the
    // specified double coordinates.
    def setLocation(x: double, y: double): Unit = ???
}
