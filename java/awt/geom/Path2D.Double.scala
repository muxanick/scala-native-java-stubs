package java.awt.geom

import java.awt.Shape
import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** The Double class defines a geometric path with
 *  coordinates stored in double precision floating point.
 */
object Path2D_Double extends Path2D with Serializable {

    /** Constructs a new empty double precision Path2D object
     *  with a default winding rule of Path2D.WIND_NON_ZERO.
     */
    @stub
    def Double() = ???

    /** Constructs a new empty double precision Path2D object
     *  with the specified winding rule to control operations that
     *  require the interior of the path to be defined.
     */
    @stub
    def Double(rule: Int) = ???

    /** Constructs a new empty double precision Path2D object
     *  with the specified winding rule and the specified initial
     *  capacity to store path segments.
     */
    @stub
    def Double(rule: Int, initialCapacity: Int) = ???

    /** Constructs a new double precision Path2D object
     *  from an arbitrary Shape object.
     */
    @stub
    def Double(s: Shape) = ???

    /** Constructs a new double precision Path2D object
     *  from an arbitrary Shape object, transformed by an
     *  AffineTransform object.
     */
    @stub
    def Double(s: Shape, at: AffineTransform) = ???

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
