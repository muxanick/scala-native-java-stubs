package java.awt

import java.awt.geom.{AffineTransform, PathIterator, Point2D, Rectangle2D}
import scala.scalanative.annotation.stub

/** The Shape interface provides definitions for objects
 *  that represent some form of geometric shape.  The Shape
 *  is described by a PathIterator object, which can express the
 *  outline of the Shape as well as a rule for determining
 *  how the outline divides the 2D plane into interior and exterior
 *  points.  Each Shape object provides callbacks to get the
 *  bounding box of the geometry, determine whether points or
 *  rectangles lie partly or entirely within the interior
 *  of the Shape, and retrieve a PathIterator
 *  object that describes the trajectory path of the Shape
 *  outline.
 *  
 *  Definition of insideness:
 *  A point is considered to lie inside a
 *  Shape if and only if:
 *  
 *   it lies completely
 *  inside theShape boundary or
 *  
 *  it lies exactly on the Shape boundary and the
 *  space immediately adjacent to the
 *  point in the increasing X direction is
 *  entirely inside the boundary or
 *  
 *  it lies exactly on a horizontal boundary segment and the
 *  space immediately adjacent to the point in the
 *  increasing Y direction is inside the boundary.
 *  
 *  The contains and intersects methods
 *  consider the interior of a Shape to be the area it
 *  encloses as if it were filled.  This means that these methods
 *  consider
 *  unclosed shapes to be implicitly closed for the purpose of
 *  determining if a shape contains or intersects a rectangle or if a
 *  shape contains a point.
 */
trait Shape {

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

    /** Returns an integer Rectangle that completely encloses the
     *  Shape.
     */
    @stub
    def getBounds(): Rectangle = ???

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

    /** Returns an iterator object that iterates along the Shape
     *  boundary and provides access to a flattened view of the
     *  Shape outline geometry.
     */
    @stub
    def getPathIterator(at: AffineTransform, flatness: Double): PathIterator = ???

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
}
