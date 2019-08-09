package java.awt

import java.awt.geom.Point2D
import java.io.Serializable
import java.lang.{Object, String}

// A point representing a location in (x,y) coordinate space,
// specified in integer precision.
class Point extends Point2D with Serializable {

    @stub
    // Constructs and initializes a point at the origin
    // (0, 0) of the coordinate space.
    def this() = ???

    @stub
    // Constructs and initializes a point at the specified
    // (x,y) location in the coordinate space.
    def this(x: Int, y: Int) = ???

    @stub
    // The X coordinate of this Point.
    def x: Int = ???

    @stub
    // Determines whether or not two points are equal.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the location of this point.
    def getLocation(): Point = ???

    @stub
    // Returns the X coordinate of this Point2D in
    // double precision.
    def getX(): double = ???

    @stub
    // Returns the Y coordinate of this Point2D in
    // double precision.
    def getY(): double = ???

    @stub
    // Moves this point to the specified location in the
    // (x,y) coordinate plane.
    def move(x: Int, y: Int): Unit = ???

    @stub
    // Sets the location of this point to the specified double coordinates.
    def setLocation(x: double, y: double): Unit = ???

    @stub
    // Changes the point to have the specified location.
    def setLocation(x: Int, y: Int): Unit = ???

    @stub
    // Sets the location of the point to the specified location.
    def setLocation(p: Point): Unit = ???

    @stub
    // Returns a string representation of this point and its location
    // in the (x,y) coordinate space.
    def toString(): String = ???
}
