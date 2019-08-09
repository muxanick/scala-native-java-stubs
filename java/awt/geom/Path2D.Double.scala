package java.awt.geom

import java.awt.Shape
import java.io.Serializable
import java.lang.Object

// The Double class defines a geometric path with
// coordinates stored in double precision floating point.
object Path2D.Double extends Path2D with Serializable {

    @stub
    // Constructs a new empty double precision Path2D object
    // with a default winding rule of Path2D.WIND_NON_ZERO.
    def Double() = ???

    @stub
    // Constructs a new empty double precision Path2D object
    // with the specified winding rule to control operations that
    // require the interior of the path to be defined.
    def Double(rule: Int) = ???

    @stub
    // Constructs a new empty double precision Path2D object
    // with the specified winding rule and the specified initial
    // capacity to store path segments.
    def Double(rule: Int, initialCapacity: Int) = ???

    @stub
    // Constructs a new double precision Path2D object
    // from an arbitrary Shape object.
    def Double(s: Shape) = ???

    @stub
    // Appends the geometry of the specified
    // PathIterator object
    // to the path, possibly connecting the new geometry to the existing
    // path segments with a line segment.
    def append(pi: PathIterator, connect: Boolean): Unit = ???

    @stub
    // Creates a new object of the same class as this object.
    def clone(): Object = ???

    @stub
    // Adds a curved segment, defined by three new points, to the path by
    // drawing a Bézier curve that intersects both the current
    // coordinates and the specified coordinates (x3,y3),
    // using the specified points (x1,y1) and (x2,y2) as
    // Bézier control points.
    def curveTo(x1: double, y1: double, x2: double, y2: double, x3: double, y3: double): Unit = ???

    @stub
    // Returns a high precision and more accurate bounding box of
    // the Shape than the getBounds method.
    def getBounds2D(): Rectangle2D = ???

    @stub
    // Returns an iterator object that iterates along the
    // Shape boundary and provides access to the geometry of the
    // Shape outline.
    def getPathIterator(at: AffineTransform): PathIterator = ???

    @stub
    // Adds a point to the path by drawing a straight line from the
    // current coordinates to the new specified coordinates
    // specified in double precision.
    def lineTo(x: double, y: double): Unit = ???

    @stub
    // Adds a point to the path by moving to the specified
    // coordinates specified in double precision.
    def moveTo(x: double, y: double): Unit = ???

    @stub
    // Adds a curved segment, defined by two new points, to the path by
    // drawing a Quadratic curve that intersects both the current
    // coordinates and the specified coordinates (x2,y2),
    // using the specified point (x1,y1) as a quadratic
    // parametric control point.
    def quadTo(x1: double, y1: double, x2: double, y2: double): Unit = ???
}
