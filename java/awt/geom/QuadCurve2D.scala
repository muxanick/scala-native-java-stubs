package java.awt.geom

import java.awt.{Rectangle, Shape}
import java.lang.{Cloneable, Object}
import scala.scalanative.annotation.stub

/** The QuadCurve2D class defines a quadratic parametric curve
 *  segment in (x,y) coordinate space.
 *  
 *  This class is only the abstract superclass for all objects that
 *  store a 2D quadratic curve segment.
 *  The actual storage representation of the coordinates is left to
 *  the subclass.
 */
abstract class QuadCurve2D extends Object with Shape with Cloneable {

    /** This is an abstract class that cannot be instantiated directly. */
    @stub
    protected def this() = ???

    /** Creates a new object of the same class and with the same contents
     *  as this object.
     */
    def clone(): Any

    /** Tests if the specified coordinates are inside the boundary of the
     *  Shape, as described by the
     *  
     *  definition of insideness.
     */
    def contains(x: Double, y: Double): Boolean

    /** Tests if the interior of the Shape entirely contains
     *  the specified rectangular area.
     */
    def contains(x: Double, y: Double, w: Double, h: Double): Boolean

    /** Tests if a specified Point2D is inside the boundary
     *  of the Shape, as described by the
     *  
     *  definition of insideness.
     */
    def contains(p: Point2D): Boolean

    /** Tests if the interior of the Shape entirely contains the
     *  specified Rectangle2D.
     */
    def contains(r: Rectangle2D): Boolean

    /** Returns an integer Rectangle that completely encloses the
     *  Shape.
     */
    def getBounds(): Rectangle

    /** Returns the control point. */
    def getCtrlPt(): Point2D

    /** Returns the X coordinate of the control point in
     *  double precision.
     */
    def getCtrlX(): Double

    /** Returns the Y coordinate of the control point in
     *  double precision.
     */
    def getCtrlY(): Double

    /** Returns the flatness, or maximum distance of a
     *  control point from the line connecting the end points, of this
     *  QuadCurve2D.
     */
    def getFlatness(): Double

    /** Returns the square of the flatness, or maximum distance of a
     *  control point from the line connecting the end points, of this
     *  QuadCurve2D.
     */
    def getFlatnessSq(): Double

    /** Returns the start point. */
    def getP1(): Point2D

    /** Returns the end point. */
    def getP2(): Point2D

    /** Returns an iteration object that defines the boundary of the
     *  shape of this QuadCurve2D.
     */
    def getPathIterator(at: AffineTransform): PathIterator

    /** Returns an iteration object that defines the boundary of the
     *  flattened shape of this QuadCurve2D.
     */
    def getPathIterator(at: AffineTransform, flatness: Double): PathIterator

    /** Returns the X coordinate of the start point in
     *  double in precision.
     */
    def getX1(): Double

    /** Returns the X coordinate of the end point in
     *  double precision.
     */
    def getX2(): Double

    /** Returns the Y coordinate of the start point in
     *  double precision.
     */
    def getY1(): Double

    /** Returns the Y coordinate of the end point in
     *  double precision.
     */
    def getY2(): Double

    /** Tests if the interior of the Shape intersects the
     *  interior of a specified rectangular area.
     */
    def intersects(x: Double, y: Double, w: Double, h: Double): Boolean

    /** Tests if the interior of the Shape intersects the
     *  interior of a specified Rectangle2D.
     */
    def intersects(r: Rectangle2D): Boolean

    /** Sets the location of the end points and control points of this
     *  QuadCurve2D to the double coordinates at
     *  the specified offset in the specified array.
     */
    def setCurve(coords: Array[Double], offset: Int): Unit

    /** Sets the location of the end points and control point of this curve
     *  to the specified double coordinates.
     */
    def setCurve(x1: Double, y1: Double, ctrlx: Double, ctrly: Double, x2: Double, y2: Double): Unit

    /** Sets the location of the end points and control points of this
     *  QuadCurve2D to the coordinates of the
     *  Point2D objects at the specified offset in
     *  the specified array.
     */
    def setCurve(pts: Array[Point2D], offset: Int): Unit

    /** Sets the location of the end points and control point of this
     *  QuadCurve2D to the specified Point2D
     *  coordinates.
     */
    def setCurve(p1: Point2D, cp: Point2D, p2: Point2D): Unit

    /** Sets the location of the end points and control point of this
     *  QuadCurve2D to the same as those in the specified
     *  QuadCurve2D.
     */
    def setCurve(c: QuadCurve2D): Unit

    /** Subdivides this QuadCurve2D and stores the resulting
     *  two subdivided curves into the left and
     *  right curve parameters.
     */
    def subdivide(left: QuadCurve2D, right: QuadCurve2D): Unit
}

object QuadCurve2D {
    /** A quadratic parametric curve segment specified with
     *  double coordinates.
     */
    type Double = QuadCurve2D_Double

    /** A quadratic parametric curve segment specified with
     *  float coordinates.
     */
    type Float = QuadCurve2D_Float

    /** Returns the flatness, or maximum distance of a
     *  control point from the line connecting the end points, of the
     *  quadratic curve specified by the control points stored in the
     *  indicated array at the indicated index.
     */
    @stub
    def getFlatness(coords: Array[Double], offset: Int): Double = ???

    /** Returns the flatness, or maximum distance of a
     *  control point from the line connecting the end points, of the
     *  quadratic curve specified by the indicated control points.
     */
    @stub
    def getFlatness(x1: Double, y1: Double, ctrlx: Double, ctrly: Double, x2: Double, y2: Double): Double = ???

    /** Returns the square of the flatness, or maximum distance of a
     *  control point from the line connecting the end points, of the
     *  quadratic curve specified by the control points stored in the
     *  indicated array at the indicated index.
     */
    @stub
    def getFlatnessSq(coords: Array[Double], offset: Int): Double = ???

    /** Returns the square of the flatness, or maximum distance of a
     *  control point from the line connecting the end points, of the
     *  quadratic curve specified by the indicated control points.
     */
    @stub
    def getFlatnessSq(x1: Double, y1: Double, ctrlx: Double, ctrly: Double, x2: Double, y2: Double): Double = ???

    /** Solves the quadratic whose coefficients are in the eqn
     *  array and places the non-complex roots back into the same array,
     *  returning the number of roots.
     */
    @stub
    def solveQuadratic(eqn: Array[Double]): Int = ???

    /** Solves the quadratic whose coefficients are in the eqn
     *  array and places the non-complex roots into the res
     *  array, returning the number of roots.
     */
    @stub
    def solveQuadratic(eqn: Array[Double], res: Array[Double]): Int = ???

    /** Subdivides the quadratic curve specified by the coordinates
     *  stored in the src array at indices
     *  srcoff through srcoff + 5
     *  and stores the resulting two subdivided curves into the two
     *  result arrays at the corresponding indices.
     */
    @stub
    def subdivide(src: Array[Double], srcoff: Int, left: Array[Double], leftoff: Int, right: Array[Double], rightoff: Int): Unit = ???

    /** Subdivides the quadratic curve specified by the src
     *  parameter and stores the resulting two subdivided curves into the
     *  left and right curve parameters.
     */
    @stub
    def subdivide(src: QuadCurve2D, left: QuadCurve2D, right: QuadCurve2D): Unit = ???
}
