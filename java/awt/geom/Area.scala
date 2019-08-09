package java.awt.geom

import java.awt.{Rectangle, Shape}
import java.lang.{Cloneable, Object}
import scala.scalanative.annotation.stub

/** An Area object stores and manipulates a
 *  resolution-independent description of an enclosed area of
 *  2-dimensional space.
 *  Area objects can be transformed and can perform
 *  various Constructive Area Geometry (CAG) operations when combined
 *  with other Area objects.
 *  The CAG operations include area
 *  addition, subtraction,
 *  intersection, and exclusive or.
 *  See the linked method documentation for examples of the various
 *  operations.
 *  
 *  The Area class implements the Shape
 *  interface and provides full support for all of its hit-testing
 *  and path iteration facilities, but an Area is more
 *  specific than a generalized path in a number of ways:
 *  
 *  Only closed paths and sub-paths are stored.
 *      Area objects constructed from unclosed paths
 *      are implicitly closed during construction as if those paths
 *      had been filled by the Graphics2D.fill method.
 *  The interiors of the individual stored sub-paths are all
 *      non-empty and non-overlapping.  Paths are decomposed during
 *      construction into separate component non-overlapping parts,
 *      empty pieces of the path are discarded, and then these
 *      non-empty and non-overlapping properties are maintained
 *      through all subsequent CAG operations.  Outlines of different
 *      component sub-paths may touch each other, as long as they
 *      do not cross so that their enclosed areas overlap.
 *  The geometry of the path describing the outline of the
 *      Area resembles the path from which it was
 *      constructed only in that it describes the same enclosed
 *      2-dimensional area, but may use entirely different types
 *      and ordering of the path segments to do so.
 *  
 *  Interesting issues which are not always obvious when using
 *  the Area include:
 *  
 *  Creating an Area from an unclosed (open)
 *      Shape results in a closed outline in the
 *      Area object.
 *  Creating an Area from a Shape
 *      which encloses no area (even when "closed") produces an
 *      empty Area.  A common example of this issue
 *      is that producing an Area from a line will
 *      be empty since the line encloses no area.  An empty
 *      Area will iterate no geometry in its
 *      PathIterator objects.
 *  A self-intersecting Shape may be split into
 *      two (or more) sub-paths each enclosing one of the
 *      non-intersecting portions of the original path.
 *  An Area may take more path segments to
 *      describe the same geometry even when the original
 *      outline is simple and obvious.  The analysis that the
 *      Area class must perform on the path may
 *      not reflect the same concepts of "simple and obvious"
 *      as a human being perceives.
 *  
 */
class Area extends Object with Shape with Cloneable {

    /** Default constructor which creates an empty area. */
    @stub
    def this() = ???

    /** The Area class creates an area geometry from the
     *  specified Shape object.
     */
    @stub
    def this(s: Shape) = ???

    /** Adds the shape of the specified Area to the
     *  shape of this Area.
     */
    @stub
    def add(rhs: Area): Unit = ???

    /** Returns an exact copy of this Area object. */
    @stub
    def clone(): Object = ???

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

    /** Creates a new Area object that contains the same
     *  geometry as this Area transformed by the specified
     *  AffineTransform.
     */
    @stub
    def createTransformedArea(t: AffineTransform): Area = ???

    /** Tests whether the geometries of the two Area objects
     *  are equal.
     */
    @stub
    def equals(other: Area): Boolean = ???

    /** Sets the shape of this Area to be the combined area
     *  of its current shape and the shape of the specified Area,
     *  minus their intersection.
     */
    @stub
    def exclusiveOr(rhs: Area): Unit = ???

    /** Returns a bounding Rectangle that completely encloses
     *  this Area.
     */
    @stub
    def getBounds(): Rectangle = ???

    /** Returns a high precision bounding Rectangle2D that
     *  completely encloses this Area.
     */
    @stub
    def getBounds2D(): Rectangle2D = ???

    /** Creates a PathIterator for the outline of this
     *  Area object.
     */
    @stub
    def getPathIterator(at: AffineTransform): PathIterator = ???

    /** Creates a PathIterator for the flattened outline of
     *  this Area object.
     */
    @stub
    def getPathIterator(at: AffineTransform, flatness: Double): PathIterator = ???

    /** Sets the shape of this Area to the intersection of
     *  its current shape and the shape of the specified Area.
     */
    @stub
    def intersect(rhs: Area): Unit = ???

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

    /** Tests whether this Area object encloses any area. */
    @stub
    def isEmpty(): Boolean = ???

    /** Tests whether this Area consists entirely of
     *  straight edged polygonal geometry.
     */
    @stub
    def isPolygonal(): Boolean = ???

    /** Tests whether this Area is rectangular in shape. */
    @stub
    def isRectangular(): Boolean = ???

    /** Tests whether this Area is comprised of a single
     *  closed subpath.
     */
    @stub
    def isSingular(): Boolean = ???

    /** Removes all of the geometry from this Area and
     *  restores it to an empty area.
     */
    @stub
    def reset(): Unit = ???

    /** Subtracts the shape of the specified Area from the
     *  shape of this Area.
     */
    @stub
    def subtract(rhs: Area): Unit = ???

    /** Transforms the geometry of this Area using the specified
     *  AffineTransform.
     */
    @stub
    def transform(t: AffineTransform): Unit = ???
}
