package java.awt.geom

import java.io.Serializable
import java.lang.Object

// The Float class defines a point specified in float
// precision.
object Point2D.Float extends Point2D with Serializable {

    @stub
    // Constructs and initializes a Point2D with
    // coordinates (0, 0).
    def Float() = ???

    @stub
    // The X coordinate of this Point2D.
    def x: float = ???

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

    @stub
    // Sets the location of this Point2D to the
    // specified float coordinates.
    def setLocation(x: float, y: float): Unit = ???
}
