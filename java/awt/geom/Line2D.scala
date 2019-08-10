package java.awt.geom

import java.awt.{Rectangle, Shape}
import java.lang.{Cloneable, Object}
import scala.scalanative.annotation.stub

/** This Line2D represents a line segment in (x,y)
 *  coordinate space.  This class, like all of the Java 2D API, uses a
 *  default coordinate system called user space in which the y-axis
 *  values increase downward and x-axis values increase to the right.  For
 *  more information on the user space coordinate system, see the
 *  
 *  Coordinate Systems section of the Java 2D Programmer's Guide.
 *  
 *  This class is only the abstract superclass for all objects that
 *  store a 2D line segment.
 *  The actual storage representation of the coordinates is left to
 *  the subclass.
 */
abstract class Line2D extends Object with Shape with Cloneable {

    /** This is an abstract class that cannot be instantiated directly. */
    @stub
    protected def this() = ???

    /** Creates a new object of the same class as this object. */
    def clone(): Any

    /** Tests if a specified coordinate is inside the boundary of this
     *  Line2D.
     */
    def contains(x: Double, y: Double): Boolean

    /** Tests if the interior of this Line2D entirely contains
     *  the specified set of rectangular coordinates.
     */
    def contains(x: Double, y: Double, w: Double, h: Double): Boolean

    /** Tests if a given Point2D is inside the boundary of
     *  this Line2D.
     */
    def contains(p: Point2D): Boolean

    /** Tests if the interior of this Line2D entirely contains
     *  the specified Rectangle2D.
     */
    def contains(r: Rectangle2D): Boolean

    /** Returns an integer Rectangle that completely encloses the
     *  Shape.
     */
    def getBounds(): Rectangle

    /** Returns the start Point2D of this Line2D. */
    def getP1(): Point2D

    /** Returns the end Point2D of this Line2D. */
    def getP2(): Point2D

    /** Returns an iteration object that defines the boundary of this
     *  Line2D.
     */
    def getPathIterator(at: AffineTransform): PathIterator

    /** Returns an iteration object that defines the boundary of this
     *  flattened Line2D.
     */
    def getPathIterator(at: AffineTransform, flatness: Double): PathIterator

    /** Returns the X coordinate of the start point in double precision. */
    def getX1(): Double

    /** Returns the X coordinate of the end point in double precision. */
    def getX2(): Double

    /** Returns the Y coordinate of the start point in double precision. */
    def getY1(): Double

    /** Returns the Y coordinate of the end point in double precision. */
    def getY2(): Double

    /** Tests if the interior of the Shape intersects the
     *  interior of a specified rectangular area.
     */
    def intersects(x: Double, y: Double, w: Double, h: Double): Boolean

    /** Tests if the interior of the Shape intersects the
     *  interior of a specified Rectangle2D.
     */
    def intersects(r: Rectangle2D): Boolean

    /** Tests if the line segment from (x1,y1) to
     *  (x2,y2) intersects this line segment.
     */
    def intersectsLine(x1: Double, y1: Double, x2: Double, y2: Double): Boolean

    /** Tests if the specified line segment intersects this line segment. */
    def intersectsLine(l: Line2D): Boolean

    /** Returns the distance from a point to this line. */
    def ptLineDist(px: Double, py: Double): Double

    /** Returns the distance from a Point2D to this line. */
    def ptLineDist(pt: Point2D): Double

    /** Returns the square of the distance from a point to this line. */
    def ptLineDistSq(px: Double, py: Double): Double

    /** Returns the square of the distance from a specified
     *  Point2D to this line.
     */
    def ptLineDistSq(pt: Point2D): Double

    /** Returns the distance from a point to this line segment. */
    def ptSegDist(px: Double, py: Double): Double

    /** Returns the distance from a Point2D to this line
     *  segment.
     */
    def ptSegDist(pt: Point2D): Double

    /** Returns the square of the distance from a point to this line segment. */
    def ptSegDistSq(px: Double, py: Double): Double

    /** Returns the square of the distance from a Point2D to
     *  this line segment.
     */
    def ptSegDistSq(pt: Point2D): Double

    /** Returns an indicator of where the specified point
     *  (px,py) lies with respect to this line segment.
     */
    def relativeCCW(px: Double, py: Double): Int

    /** Returns an indicator of where the specified Point2D
     *  lies with respect to this line segment.
     */
    def relativeCCW(p: Point2D): Int

    /** Sets the location of the end points of this Line2D to
     *  the specified double coordinates.
     */
    def setLine(x1: Double, y1: Double, x2: Double, y2: Double): Unit

    /** Sets the location of the end points of this Line2D to
     *  the same as those end points of the specified Line2D.
     */
    def setLine(l: Line2D): Unit

    /** Sets the location of the end points of this Line2D to
     *  the specified Point2D coordinates.
     */
    def setLine(p1: Point2D, p2: Point2D): Unit
}

object Line2D {
    /** A line segment specified with double coordinates. */
    type Double = Line2D_Double

    /** A line segment specified with float coordinates. */
    type Float = Line2D_Float

    /** Tests if the line segment from (x1,y1) to
     *  (x2,y2) intersects the line segment from (x3,y3)
     *  to (x4,y4).
     */
    @stub
    def linesIntersect(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): Boolean = ???

    /** Returns the distance from a point to a line. */
    @stub
    def ptLineDist(x1: Double, y1: Double, x2: Double, y2: Double, px: Double, py: Double): Double = ???

    /** Returns the square of the distance from a point to a line. */
    @stub
    def ptLineDistSq(x1: Double, y1: Double, x2: Double, y2: Double, px: Double, py: Double): Double = ???

    /** Returns the distance from a point to a line segment. */
    @stub
    def ptSegDist(x1: Double, y1: Double, x2: Double, y2: Double, px: Double, py: Double): Double = ???

    /** Returns the square of the distance from a point to a line segment. */
    @stub
    def ptSegDistSq(x1: Double, y1: Double, x2: Double, y2: Double, px: Double, py: Double): Double = ???

    /** Returns an indicator of where the specified point
     *  (px,py) lies with respect to the line segment from
     *  (x1,y1) to (x2,y2).
     */
    @stub
    def relativeCCW(x1: Double, y1: Double, x2: Double, y2: Double, px: Double, py: Double): Int = ???
}
