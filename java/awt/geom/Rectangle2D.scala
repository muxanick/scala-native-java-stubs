package java.awt.geom

import java.lang.Object
import scala.scalanative.annotation.stub

/** The Rectangle2D class describes a rectangle
 *  defined by a location (x,y) and dimension
 *  (w x h).
 *  
 *  This class is only the abstract superclass for all objects that
 *  store a 2D rectangle.
 *  The actual storage representation of the coordinates is left to
 *  the subclass.
 */
abstract class Rectangle2D extends RectangularShape {

    /** This is an abstract class that cannot be instantiated directly. */
    @stub
    protected def this() = ???

    /** Adds a point, specified by the double precision arguments
     *  newx and newy, to this
     *  Rectangle2D.
     */
    def add(newx: Double, newy: Double): Unit

    /** Adds the Point2D object pt to this
     *  Rectangle2D.
     */
    def add(pt: Point2D): Unit

    /** Adds a Rectangle2D object to this
     *  Rectangle2D.
     */
    def add(r: Rectangle2D): Unit

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

    /** Returns a new Rectangle2D object representing the
     *  intersection of this Rectangle2D with the specified
     *  Rectangle2D.
     */
    def createIntersection(r: Rectangle2D): Rectangle2D

    /** Returns a new Rectangle2D object representing the
     *  union of this Rectangle2D with the specified
     *  Rectangle2D.
     */
    def createUnion(r: Rectangle2D): Rectangle2D

    /** Determines whether or not the specified Object is
     *  equal to this Rectangle2D.
     */
    def equals(obj: Any): Boolean

    /** Returns a high precision and more accurate bounding box of
     *  the Shape than the getBounds method.
     */
    def getBounds2D(): Rectangle2D

    /** Returns an iteration object that defines the boundary of this
     *  Rectangle2D.
     */
    def getPathIterator(at: AffineTransform): PathIterator

    /** Returns an iteration object that defines the boundary of the
     *  flattened Rectangle2D.
     */
    def getPathIterator(at: AffineTransform, flatness: Double): PathIterator

    /** Returns the hashcode for this Rectangle2D. */
    def hashCode(): Int

    /** Tests if the interior of the Shape intersects the
     *  interior of a specified rectangular area.
     */
    def intersects(x: Double, y: Double, w: Double, h: Double): Boolean

    /** Tests if the specified line segment intersects the interior of this
     *  Rectangle2D.
     */
    def intersectsLine(x1: Double, y1: Double, x2: Double, y2: Double): Boolean

    /** Tests if the specified line segment intersects the interior of this
     *  Rectangle2D.
     */
    def intersectsLine(l: Line2D): Boolean

    /** Determines where the specified coordinates lie with respect
     *  to this Rectangle2D.
     */
    def outcode(x: Double, y: Double): Int

    /** Determines where the specified Point2D lies with
     *  respect to this Rectangle2D.
     */
    def outcode(p: Point2D): Int

    /** Sets the location and size of the outer bounds of this
     *  Rectangle2D to the specified rectangular values.
     */
    def setFrame(x: Double, y: Double, w: Double, h: Double): Unit

    /** Sets the location and size of this Rectangle2D
     *  to the specified double values.
     */
    def setRect(x: Double, y: Double, w: Double, h: Double): Unit

    /** Sets this Rectangle2D to be the same as the specified
     *  Rectangle2D.
     */
    def setRect(r: Rectangle2D): Unit
}

object Rectangle2D {
    /** The Double class defines a rectangle specified in
     *  double coordinates.
     */
    type Double = Rectangle2D_Double

    /** The Float class defines a rectangle specified in float
     *  coordinates.
     */
    type Float = Rectangle2D_Float

    /** The bitmask that indicates that a point lies below
     *  this Rectangle2D.
     */
    @stub
    val OUT_BOTTOM: Int = ???

    /** The bitmask that indicates that a point lies to the left of
     *  this Rectangle2D.
     */
    @stub
    val OUT_LEFT: Int = ???

    /** The bitmask that indicates that a point lies to the right of
     *  this Rectangle2D.
     */
    @stub
    val OUT_RIGHT: Int = ???

    /** The bitmask that indicates that a point lies above
     *  this Rectangle2D.
     */
    @stub
    val OUT_TOP: Int = ???

    /** Intersects the pair of specified source Rectangle2D
     *  objects and puts the result into the specified destination
     *  Rectangle2D object.
     */
    @stub
    def intersect(src1: Rectangle2D, src2: Rectangle2D, dest: Rectangle2D): Unit = ???

    /** Unions the pair of source Rectangle2D objects
     *  and puts the result into the specified destination
     *  Rectangle2D object.
     */
    @stub
    def union(src1: Rectangle2D, src2: Rectangle2D, dest: Rectangle2D): Unit = ???
}
