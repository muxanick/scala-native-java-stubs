package java.awt.geom

import java.awt.{Rectangle, Shape}
import java.io.Serializable
import java.lang.{Cloneable, Object}
import scala.scalanative.annotation.stub

/** The Path2D class provides a simple, yet flexible
 *  shape which represents an arbitrary geometric path.
 *  It can fully represent any path which can be iterated by the
 *  PathIterator interface including all of its segment
 *  types and winding rules and it implements all of the
 *  basic hit testing methods of the Shape interface.
 *  
 *  Use Path2D.Float when dealing with data that can be represented
 *  and used with floating point precision.  Use Path2D.Double
 *  for data that requires the accuracy or range of double precision.
 *  
 *  Path2D provides exactly those facilities required for
 *  basic construction and management of a geometric path and
 *  implementation of the above interfaces with little added
 *  interpretation.
 *  If it is useful to manipulate the interiors of closed
 *  geometric shapes beyond simple hit testing then the
 *  Area class provides additional capabilities
 *  specifically targeted at closed figures.
 *  While both classes nominally implement the Shape
 *  interface, they differ in purpose and together they provide
 *  two useful views of a geometric shape where Path2D
 *  deals primarily with a trajectory formed by path segments
 *  and Area deals more with interpretation and manipulation
 *  of enclosed regions of 2D geometric space.
 *  
 *  The PathIterator interface has more detailed descriptions
 *  of the types of segments that make up a path and the winding rules
 *  that control how to determine which regions are inside or outside
 *  the path.
 */
abstract class Path2D extends Object with Shape with Cloneable {

    /** Appends the geometry of the specified
     *  PathIterator object
     *  to the path, possibly connecting the new geometry to the existing
     *  path segments with a line segment.
     */
    def append(pi: PathIterator, connect: Boolean): Unit

    /** Appends the geometry of the specified Shape object to the
     *  path, possibly connecting the new geometry to the existing path
     *  segments with a line segment.
     */
    def append(s: Shape, connect: Boolean): Unit

    /** Creates a new object of the same class as this object. */
    def clone(): Any

    /** Closes the current subpath by drawing a straight line back to
     *  the coordinates of the last moveTo.
     */
    def closePath(): Unit

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

    /** Returns a new Shape representing a transformed version
     *  of this Path2D.
     */
    def createTransformedShape(at: AffineTransform): Shape

    /** Adds a curved segment, defined by three new points, to the path by
     *  drawing a Bézier curve that intersects both the current
     *  coordinates and the specified coordinates (x3,y3),
     *  using the specified points (x1,y1) and (x2,y2) as
     *  Bézier control points.
     */
    def curveTo(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Unit

    /** Returns an integer Rectangle that completely encloses the
     *  Shape.
     */
    def getBounds(): Rectangle

    /** Returns the coordinates most recently added to the end of the path
     *  as a Point2D object.
     */
    def getCurrentPoint(): Point2D

    /** Returns an iterator object that iterates along the Shape
     *  boundary and provides access to a flattened view of the
     *  Shape outline geometry.
     */
    def getPathIterator(at: AffineTransform, flatness: Double): PathIterator

    /** Returns the fill style winding rule. */
    def getWindingRule(): Int

    /** Tests if the interior of the Shape intersects the
     *  interior of a specified rectangular area.
     */
    def intersects(x: Double, y: Double, w: Double, h: Double): Boolean

    /** Tests if the interior of the Shape intersects the
     *  interior of a specified Rectangle2D.
     */
    def intersects(r: Rectangle2D): Boolean

    /** Adds a point to the path by drawing a straight line from the
     *  current coordinates to the new specified coordinates
     *  specified in double precision.
     */
    def lineTo(x: Double, y: Double): Unit

    /** Adds a point to the path by moving to the specified
     *  coordinates specified in double precision.
     */
    def moveTo(x: Double, y: Double): Unit

    /** Adds a curved segment, defined by two new points, to the path by
     *  drawing a Quadratic curve that intersects both the current
     *  coordinates and the specified coordinates (x2,y2),
     *  using the specified point (x1,y1) as a quadratic
     *  parametric control point.
     */
    def quadTo(x1: Double, y1: Double, x2: Double, y2: Double): Unit

    /** Resets the path to empty. */
    def reset(): Unit

    /** Sets the winding rule for this path to the specified value. */
    def setWindingRule(rule: Int): Unit

    /** Transforms the geometry of this path using the specified
     *  AffineTransform.
     */
    def transform(at: AffineTransform): Unit
}

object Path2D {
    /** The Double class defines a geometric path with
     *  coordinates stored in double precision floating point.
     */
    object Double extends Path2D with Serializable {

        /** Constructs a new empty double precision Path2D object
         *  with a default winding rule of Path2D.WIND_NON_ZERO.
         */
        @stub
        def apply() = ???

        /** Constructs a new empty double precision Path2D object
         *  with the specified winding rule to control operations that
         *  require the interior of the path to be defined.
         */
        @stub
        def apply(rule: Int) = ???

        /** Constructs a new empty double precision Path2D object
         *  with the specified winding rule and the specified initial
         *  capacity to store path segments.
         */
        @stub
        def apply(rule: Int, initialCapacity: Int) = ???

        /** Constructs a new double precision Path2D object
         *  from an arbitrary Shape object.
         */
        @stub
        def apply(s: Shape) = ???

        /** Constructs a new double precision Path2D object
         *  from an arbitrary Shape object, transformed by an
         *  AffineTransform object.
         */
        @stub
        def apply(s: Shape, at: AffineTransform) = ???

        /** Appends the geometry of the specified
         *  PathIterator object
         *  to the path, possibly connecting the new geometry to the existing
         *  path segments with a line segment.
         */
        @stub
        def append(pi: PathIterator, connect: Boolean): Unit = ???

        /** Creates a new object of the same class as this object. */
        @stub
        def clone(): Any = ???

        /** Adds a curved segment, defined by three new points, to the path by
         *  drawing a Bézier curve that intersects both the current
         *  coordinates and the specified coordinates (x3,y3),
         *  using the specified points (x1,y1) and (x2,y2) as
         *  Bézier control points.
         */
        @stub
        def curveTo(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Unit = ???

        /** Returns a high precision and more accurate bounding box of
         *  the Shape than the getBounds method.
         */
        @stub
        def getBounds2D(): Rectangle2D = ???

        /** Returns an iterator object that iterates along the
         *  Shape boundary and provides access to the geometry of the
         *  Shape outline.
         */
        @stub
        def getPathIterator(at: AffineTransform): PathIterator = ???

        /** Adds a point to the path by drawing a straight line from the
         *  current coordinates to the new specified coordinates
         *  specified in double precision.
         */
        @stub
        def lineTo(x: Double, y: Double): Unit = ???

        /** Adds a point to the path by moving to the specified
         *  coordinates specified in double precision.
         */
        @stub
        def moveTo(x: Double, y: Double): Unit = ???

        /** Adds a curved segment, defined by two new points, to the path by
         *  drawing a Quadratic curve that intersects both the current
         *  coordinates and the specified coordinates (x2,y2),
         *  using the specified point (x1,y1) as a quadratic
         *  parametric control point.
         */
        @stub
        def quadTo(x1: Double, y1: Double, x2: Double, y2: Double): Unit = ???

        /** Transforms the geometry of this path using the specified
         *  AffineTransform.
         */
        @stub
        def transform(at: AffineTransform): Unit = ???
    }


    /** The Float class defines a geometric path with
     *  coordinates stored in single precision floating point.
     */
    object Float extends Path2D with Serializable {

        /** Constructs a new empty single precision Path2D object
         *  with a default winding rule of Path2D.WIND_NON_ZERO.
         */
        @stub
        def apply() = ???

        /** Constructs a new empty single precision Path2D object
         *  with the specified winding rule to control operations that
         *  require the interior of the path to be defined.
         */
        @stub
        def apply(rule: Int) = ???

        /** Constructs a new empty single precision Path2D object
         *  with the specified winding rule and the specified initial
         *  capacity to store path segments.
         */
        @stub
        def apply(rule: Int, initialCapacity: Int) = ???

        /** Constructs a new single precision Path2D object
         *  from an arbitrary Shape object.
         */
        @stub
        def apply(s: Shape) = ???

        /** Constructs a new single precision Path2D object
         *  from an arbitrary Shape object, transformed by an
         *  AffineTransform object.
         */
        @stub
        def apply(s: Shape, at: AffineTransform) = ???

        /** Appends the geometry of the specified
         *  PathIterator object
         *  to the path, possibly connecting the new geometry to the existing
         *  path segments with a line segment.
         */
        @stub
        def append(pi: PathIterator, connect: Boolean): Unit = ???

        /** Creates a new object of the same class as this object. */
        @stub
        def clone(): Any = ???

        /** Adds a curved segment, defined by three new points, to the path by
         *  drawing a Bézier curve that intersects both the current
         *  coordinates and the specified coordinates (x3,y3),
         *  using the specified points (x1,y1) and (x2,y2) as
         *  Bézier control points.
         */
        @stub
        def curveTo(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Unit = ???

        /** Adds a curved segment, defined by three new points, to the path by
         *  drawing a Bézier curve that intersects both the current
         *  coordinates and the specified coordinates (x3,y3),
         *  using the specified points (x1,y1) and (x2,y2) as
         *  Bézier control points.
         */
        @stub
        def curveTo(x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float): Unit = ???

        /** Returns a high precision and more accurate bounding box of
         *  the Shape than the getBounds method.
         */
        @stub
        def getBounds2D(): Rectangle2D = ???

        /** Returns an iterator object that iterates along the
         *  Shape boundary and provides access to the geometry of the
         *  Shape outline.
         */
        @stub
        def getPathIterator(at: AffineTransform): PathIterator = ???

        /** Adds a point to the path by drawing a straight line from the
         *  current coordinates to the new specified coordinates
         *  specified in double precision.
         */
        @stub
        def lineTo(x: Double, y: Double): Unit = ???

        /** Adds a point to the path by drawing a straight line from the
         *  current coordinates to the new specified coordinates
         *  specified in float precision.
         */
        @stub
        def lineTo(x: Float, y: Float): Unit = ???

        /** Adds a point to the path by moving to the specified
         *  coordinates specified in double precision.
         */
        @stub
        def moveTo(x: Double, y: Double): Unit = ???

        /** Adds a point to the path by moving to the specified
         *  coordinates specified in float precision.
         */
        @stub
        def moveTo(x: Float, y: Float): Unit = ???

        /** Adds a curved segment, defined by two new points, to the path by
         *  drawing a Quadratic curve that intersects both the current
         *  coordinates and the specified coordinates (x2,y2),
         *  using the specified point (x1,y1) as a quadratic
         *  parametric control point.
         */
        @stub
        def quadTo(x1: Double, y1: Double, x2: Double, y2: Double): Unit = ???

        /** Adds a curved segment, defined by two new points, to the path by
         *  drawing a Quadratic curve that intersects both the current
         *  coordinates and the specified coordinates (x2,y2),
         *  using the specified point (x1,y1) as a quadratic
         *  parametric control point.
         */
        @stub
        def quadTo(x1: Float, y1: Float, x2: Float, y2: Float): Unit = ???

        /** Transforms the geometry of this path using the specified
         *  AffineTransform.
         */
        @stub
        def transform(at: AffineTransform): Unit = ???
    }


    /** An even-odd winding rule for determining the interior of
     *  a path.
     */
    @stub
    val WIND_EVEN_ODD: Int = ???

    /** A non-zero winding rule for determining the interior of a
     *  path.
     */
    @stub
    val WIND_NON_ZERO: Int = ???

    /** Tests if the specified coordinates are inside the closed
     *  boundary of the specified PathIterator.
     */
    @stub
    def contains(pi: PathIterator, x: Double, y: Double): Boolean = ???

    /** Tests if the specified rectangular area is entirely inside the
     *  closed boundary of the specified PathIterator.
     */
    @stub
    def contains(pi: PathIterator, x: Double, y: Double, w: Double, h: Double): Boolean = ???

    /** Tests if the specified Point2D is inside the closed
     *  boundary of the specified PathIterator.
     */
    @stub
    def contains(pi: PathIterator, p: Point2D): Boolean = ???

    /** Tests if the specified Rectangle2D is entirely inside the
     *  closed boundary of the specified PathIterator.
     */
    @stub
    def contains(pi: PathIterator, r: Rectangle2D): Boolean = ???

    /** Tests if the interior of the specified PathIterator
     *  intersects the interior of a specified set of rectangular
     *  coordinates.
     */
    @stub
    def intersects(pi: PathIterator, x: Double, y: Double, w: Double, h: Double): Boolean = ???

    /** Tests if the interior of the specified PathIterator
     *  intersects the interior of a specified Rectangle2D.
     */
    @stub
    def intersects(pi: PathIterator, r: Rectangle2D): Boolean = ???
}
