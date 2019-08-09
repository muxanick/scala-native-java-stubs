package java.awt

import java.awt.geom.{AffineTransform, PathIterator, Point2D, Rectangle2D}
import java.io.Serializable
import java.lang.Object

// The Polygon class encapsulates a description of a
// closed, two-dimensional region within a coordinate space. This
// region is bounded by an arbitrary number of line segments, each of
// which is one side of the polygon. Internally, a polygon
// comprises of a list of (x,y)
// coordinate pairs, where each pair defines a vertex of the
// polygon, and two successive pairs are the endpoints of a
// line that is a side of the polygon. The first and final
// pairs of (x,y) points are joined by a line segment
// that closes the polygon.  This Polygon is defined with
// an even-odd winding rule.  See
// WIND_EVEN_ODD
// for a definition of the even-odd winding rule.
// This class's hit-testing methods, which include the
// contains, intersects and inside
// methods, use the insideness definition described in the
// Shape class comments.
class Polygon extends Object with Shape, with Serializable {

    @stub
    // Creates an empty polygon.
    def this() = ???

    @stub
    // The bounds of this Polygon.
    protected def bounds: Rectangle = ???

    @stub
    // The total number of points.
    def npoints: Int = ???

    @stub
    // The array of X coordinates.
    def xpoints: Array[Int] = ???

    @stub
    // Appends the specified coordinates to this Polygon.
    def addPoint(x: Int, y: Int): Unit = ???

    @stub
    // Tests if the specified coordinates are inside the boundary of the
    // Shape, as described by the
    // 
    // definition of insideness.
    def contains(x: double, y: double): Boolean = ???

    @stub
    // Tests if the interior of the Shape entirely contains
    // the specified rectangular area.
    def contains(x: double, y: double, w: double, h: double): Boolean = ???

    @stub
    // Determines whether the specified coordinates are inside this
    // Polygon.
    def contains(x: Int, y: Int): Boolean = ???

    @stub
    // Determines whether the specified Point is inside this
    // Polygon.
    def contains(p: Point): Boolean = ???

    @stub
    // Tests if a specified Point2D is inside the boundary
    // of the Shape, as described by the
    // 
    // definition of insideness.
    def contains(p: Point2D): Boolean = ???

    @stub
    // Tests if the interior of the Shape entirely contains the
    // specified Rectangle2D.
    def contains(r: Rectangle2D): Boolean = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getBounds().
    //
    def getBoundingBox(): Rectangle = ???

    @stub
    // Gets the bounding box of this Polygon.
    def getBounds(): Rectangle = ???

    @stub
    // Returns a high precision and more accurate bounding box of
    // the Shape than the getBounds method.
    def getBounds2D(): Rectangle2D = ???

    @stub
    // Returns an iterator object that iterates along the boundary of this
    // Polygon and provides access to the geometry
    // of the outline of this Polygon.
    def getPathIterator(at: AffineTransform): PathIterator = ???

    @stub
    // Returns an iterator object that iterates along the boundary of
    // the Shape and provides access to the geometry of the
    // outline of the Shape.
    def getPathIterator(at: AffineTransform, flatness: double): PathIterator = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by contains(int, int).
    //
    def inside(x: Int, y: Int): Boolean = ???

    @stub
    // Tests if the interior of the Shape intersects the
    // interior of a specified rectangular area.
    def intersects(x: double, y: double, w: double, h: double): Boolean = ???

    @stub
    // Tests if the interior of the Shape intersects the
    // interior of a specified Rectangle2D.
    def intersects(r: Rectangle2D): Boolean = ???

    @stub
    // Invalidates or flushes any internally-cached data that depends
    // on the vertex coordinates of this Polygon.
    def invalidate(): Unit = ???

    @stub
    // Resets this Polygon object to an empty polygon.
    def reset(): Unit = ???
}
