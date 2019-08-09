package java.awt

import java.awt.geom.{AffineTransform, PathIterator, Point2D, Rectangle2D}
import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** The Polygon class encapsulates a description of a
 *  closed, two-dimensional region within a coordinate space. This
 *  region is bounded by an arbitrary number of line segments, each of
 *  which is one side of the polygon. Internally, a polygon
 *  comprises of a list of (x,y)
 *  coordinate pairs, where each pair defines a vertex of the
 *  polygon, and two successive pairs are the endpoints of a
 *  line that is a side of the polygon. The first and final
 *  pairs of (x,y) points are joined by a line segment
 *  that closes the polygon.  This Polygon is defined with
 *  an even-odd winding rule.  See
 *  WIND_EVEN_ODD
 *  for a definition of the even-odd winding rule.
 *  This class's hit-testing methods, which include the
 *  contains, intersects and inside
 *  methods, use the insideness definition described in the
 *  Shape class comments.
 */
class Polygon extends Object with Shape with Serializable {

    /** Creates an empty polygon. */
    @stub
    def this() = ???

    /** Constructs and initializes a Polygon from the specified
     *  parameters.
     */
    @stub
    def this(xpoints: Array[Int], ypoints: Array[Int], npoints: Int) = ???

    /** The bounds of this Polygon. */
    @stub
    protected val bounds: Rectangle = ???

    /** The total number of points. */
    @stub
    val npoints: Int = ???

    /** The array of X coordinates. */
    @stub
    val xpoints: Array[Int] = ???

    /** The array of Y coordinates. */
    @stub
    val ypoints: Array[Int] = ???

    /** Appends the specified coordinates to this Polygon. */
    @stub
    def addPoint(x: Int, y: Int): Unit = ???

    /** Tests if the specified coordinates are inside the boundary of the
     *  Shape, as described by the
     *  
     *  definition of insideness.
     */
    @stub
    def contains(x: Double, y: Double): Boolean = ???

    /** Tests if the interior of the Shape entirely contains
     *  the specified rectangular area.
     */
    @stub
    def contains(x: Double, y: Double, w: Double, h: Double): Boolean = ???

    /** Determines whether the specified coordinates are inside this
     *  Polygon.
     */
    @stub
    def contains(x: Int, y: Int): Boolean = ???

    /** Determines whether the specified Point is inside this
     *  Polygon.
     */
    @stub
    def contains(p: Point): Boolean = ???

    /** Tests if a specified Point2D is inside the boundary
     *  of the Shape, as described by the
     *  
     *  definition of insideness.
     */
    @stub
    def contains(p: Point2D): Boolean = ???

    /** Tests if the interior of the Shape entirely contains the
     *  specified Rectangle2D.
     */
    @stub
    def contains(r: Rectangle2D): Boolean = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getBounds().
     * 
     */
    @stub
    def getBoundingBox(): Rectangle = ???

    /** Gets the bounding box of this Polygon. */
    @stub
    def getBounds(): Rectangle = ???

    /** Returns a high precision and more accurate bounding box of
     *  the Shape than the getBounds method.
     */
    @stub
    def getBounds2D(): Rectangle2D = ???

    /** Returns an iterator object that iterates along the boundary of this
     *  Polygon and provides access to the geometry
     *  of the outline of this Polygon.
     */
    @stub
    def getPathIterator(at: AffineTransform): PathIterator = ???

    /** Returns an iterator object that iterates along the boundary of
     *  the Shape and provides access to the geometry of the
     *  outline of the Shape.
     */
    @stub
    def getPathIterator(at: AffineTransform, flatness: Double): PathIterator = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by contains(int, int).
     * 
     */
    @stub
    def inside(x: Int, y: Int): Boolean = ???

    /** Tests if the interior of the Shape intersects the
     *  interior of a specified rectangular area.
     */
    @stub
    def intersects(x: Double, y: Double, w: Double, h: Double): Boolean = ???

    /** Tests if the interior of the Shape intersects the
     *  interior of a specified Rectangle2D.
     */
    @stub
    def intersects(r: Rectangle2D): Boolean = ???

    /** Invalidates or flushes any internally-cached data that depends
     *  on the vertex coordinates of this Polygon.
     */
    @stub
    def invalidate(): Unit = ???

    /** Resets this Polygon object to an empty polygon. */
    @stub
    def reset(): Unit = ???

    /** Translates the vertices of the Polygon by
     *  deltaX along the x axis and by
     *  deltaY along the y axis.
     */
    @stub
    def translate(deltaX: Int, deltaY: Int): Unit = ???
}
