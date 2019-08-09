package java.awt.geom

import java.lang.{Cloneable, Object}

// The Point2D class defines a point representing a location
// in (x,y) coordinate space.
// 
// This class is only the abstract superclass for all objects that
// store a 2D coordinate.
// The actual storage representation of the coordinates is left to
// the subclass.
abstract class Point2D extends Object with Cloneable {

    // Creates a new object of the same class and with the
    // same contents as this object.
    def clone(): Object

    // Returns the distance from this Point2D to
    // a specified point.
    def distance(px: double, py: double): double

    // Returns the distance from this Point2D to a
    // specified Point2D.
    def distance(pt: Point2D): double

    // Returns the square of the distance from this
    // Point2D to a specified point.
    def distanceSq(px: double, py: double): double

    // Returns the square of the distance from this
    // Point2D to a specified Point2D.
    def distanceSq(pt: Point2D): double

    // Determines whether or not two points are equal.
    def equals(obj: Object): Boolean

    // Returns the X coordinate of this Point2D in
    // double precision.
    def getX(): double

    // Returns the Y coordinate of this Point2D in
    // double precision.
    def getY(): double

    // Returns the hashcode for this Point2D.
    def hashCode(): Int

    // Sets the location of this Point2D to the
    // specified double coordinates.
    def setLocation(x: double, y: double): Unit
}

object Point2D {
    @stub
    // The Double class defines a point specified in
    // double precision.
    def Point2D.Double: class = ???

    @stub
    // Returns the distance between two points.
    def distance(x1: double, y1: double, x2: double, y2: double): double = ???

    @stub
    // Returns the square of the distance between two points.
    def distanceSq(x1: double, y1: double, x2: double, y2: double): double = ???
}
