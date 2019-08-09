package java.awt.geom

import java.awt.{Rectangle, Shape}
import java.lang.{Cloneable, Object}

// This Line2D represents a line segment in (x,y)
// coordinate space.  This class, like all of the Java 2D API, uses a
// default coordinate system called user space in which the y-axis
// values increase downward and x-axis values increase to the right.  For
// more information on the user space coordinate system, see the
// 
// Coordinate Systems section of the Java 2D Programmer's Guide.
// 
// This class is only the abstract superclass for all objects that
// store a 2D line segment.
// The actual storage representation of the coordinates is left to
// the subclass.
abstract class Line2D extends Object with Shape, with Cloneable {

    // Creates a new object of the same class as this object.
    def clone(): Object

    // Tests if a specified coordinate is inside the boundary of this
    // Line2D.
    def contains(x: double, y: double): Boolean

    // Tests if the interior of this Line2D entirely contains
    // the specified set of rectangular coordinates.
    def contains(x: double, y: double, w: double, h: double): Boolean

    // Tests if a given Point2D is inside the boundary of
    // this Line2D.
    def contains(p: Point2D): Boolean

    // Tests if the interior of this Line2D entirely contains
    // the specified Rectangle2D.
    def contains(r: Rectangle2D): Boolean

    // Returns an integer Rectangle that completely encloses the
    // Shape.
    def getBounds(): Rectangle

    // Returns the start Point2D of this Line2D.
    def getP1(): Point2D

    // Returns the end Point2D of this Line2D.
    def getP2(): Point2D

    // Returns an iteration object that defines the boundary of this
    // Line2D.
    def getPathIterator(at: AffineTransform): PathIterator

    // Returns an iteration object that defines the boundary of this
    // flattened Line2D.
    def getPathIterator(at: AffineTransform, flatness: double): PathIterator

    // Returns the X coordinate of the start point in double precision.
    def getX1(): double

    // Returns the X coordinate of the end point in double precision.
    def getX2(): double

    // Returns the Y coordinate of the start point in double precision.
    def getY1(): double

    // Returns the Y coordinate of the end point in double precision.
    def getY2(): double

    // Tests if the interior of the Shape intersects the
    // interior of a specified rectangular area.
    def intersects(x: double, y: double, w: double, h: double): Boolean

    // Tests if the interior of the Shape intersects the
    // interior of a specified Rectangle2D.
    def intersects(r: Rectangle2D): Boolean

    // Tests if the line segment from (x1,y1) to
    // (x2,y2) intersects this line segment.
    def intersectsLine(x1: double, y1: double, x2: double, y2: double): Boolean

    // Tests if the specified line segment intersects this line segment.
    def intersectsLine(l: Line2D): Boolean

    // Returns the distance from a point to this line.
    def ptLineDist(px: double, py: double): double

    // Returns the distance from a Point2D to this line.
    def ptLineDist(pt: Point2D): double

    // Returns the square of the distance from a point to this line.
    def ptLineDistSq(px: double, py: double): double

    // Returns the square of the distance from a specified
    // Point2D to this line.
    def ptLineDistSq(pt: Point2D): double

    // Returns the distance from a point to this line segment.
    def ptSegDist(px: double, py: double): double

    // Returns the distance from a Point2D to this line
    // segment.
    def ptSegDist(pt: Point2D): double

    // Returns the square of the distance from a point to this line segment.
    def ptSegDistSq(px: double, py: double): double

    // Returns the square of the distance from a Point2D to
    // this line segment.
    def ptSegDistSq(pt: Point2D): double

    // Returns an indicator of where the specified point
    // (px,py) lies with respect to this line segment.
    def relativeCCW(px: double, py: double): Int

    // Returns an indicator of where the specified Point2D
    // lies with respect to this line segment.
    def relativeCCW(p: Point2D): Int

    // Sets the location of the end points of this Line2D to
    // the specified double coordinates.
    def setLine(x1: double, y1: double, x2: double, y2: double): Unit

    // Sets the location of the end points of this Line2D to
    // the same as those end points of the specified Line2D.
    def setLine(l: Line2D): Unit
}

object Line2D {
    @stub
    // A line segment specified with double coordinates.
    def Line2D.Double: class = ???

    @stub
    // Tests if the line segment from (x1,y1) to
    // (x2,y2) intersects the line segment from (x3,y3)
    // to (x4,y4).
    def linesIntersect(x1: double, y1: double, x2: double, y2: double, x3: double, y3: double, x4: double, y4: double): Boolean = ???

    @stub
    // Returns the distance from a point to a line.
    def ptLineDist(x1: double, y1: double, x2: double, y2: double, px: double, py: double): double = ???

    @stub
    // Returns the square of the distance from a point to a line.
    def ptLineDistSq(x1: double, y1: double, x2: double, y2: double, px: double, py: double): double = ???

    @stub
    // Returns the distance from a point to a line segment.
    def ptSegDist(x1: double, y1: double, x2: double, y2: double, px: double, py: double): double = ???

    @stub
    // Returns the square of the distance from a point to a line segment.
    def ptSegDistSq(x1: double, y1: double, x2: double, y2: double, px: double, py: double): double = ???

    @stub
    // Returns an indicator of where the specified point
    // (px,py) lies with respect to the line segment from
    // (x1,y1) to (x2,y2).
    def relativeCCW(x1: double, y1: double, x2: double, y2: double, px: double, py: double): Int = ???
}
