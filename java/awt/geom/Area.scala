package java.awt.geom

import java.awt.{Rectangle, Shape}
import java.lang.{Cloneable, Object}

// An Area object stores and manipulates a
// resolution-independent description of an enclosed area of
// 2-dimensional space.
// Area objects can be transformed and can perform
// various Constructive Area Geometry (CAG) operations when combined
// with other Area objects.
// The CAG operations include area
// addition, subtraction,
// intersection, and exclusive or.
// See the linked method documentation for examples of the various
// operations.
// 
// The Area class implements the Shape
// interface and provides full support for all of its hit-testing
// and path iteration facilities, but an Area is more
// specific than a generalized path in a number of ways:
// 
// Only closed paths and sub-paths are stored.
//     Area objects constructed from unclosed paths
//     are implicitly closed during construction as if those paths
//     had been filled by the Graphics2D.fill method.
// The interiors of the individual stored sub-paths are all
//     non-empty and non-overlapping.  Paths are decomposed during
//     construction into separate component non-overlapping parts,
//     empty pieces of the path are discarded, and then these
//     non-empty and non-overlapping properties are maintained
//     through all subsequent CAG operations.  Outlines of different
//     component sub-paths may touch each other, as long as they
//     do not cross so that their enclosed areas overlap.
// The geometry of the path describing the outline of the
//     Area resembles the path from which it was
//     constructed only in that it describes the same enclosed
//     2-dimensional area, but may use entirely different types
//     and ordering of the path segments to do so.
// 
// Interesting issues which are not always obvious when using
// the Area include:
// 
// Creating an Area from an unclosed (open)
//     Shape results in a closed outline in the
//     Area object.
// Creating an Area from a Shape
//     which encloses no area (even when "closed") produces an
//     empty Area.  A common example of this issue
//     is that producing an Area from a line will
//     be empty since the line encloses no area.  An empty
//     Area will iterate no geometry in its
//     PathIterator objects.
// A self-intersecting Shape may be split into
//     two (or more) sub-paths each enclosing one of the
//     non-intersecting portions of the original path.
// An Area may take more path segments to
//     describe the same geometry even when the original
//     outline is simple and obvious.  The analysis that the
//     Area class must perform on the path may
//     not reflect the same concepts of "simple and obvious"
//     as a human being perceives.
// 
class Area extends Object with Shape, with Cloneable {

    @stub
    // Default constructor which creates an empty area.
    def this() = ???

    @stub
    // Adds the shape of the specified Area to the
    // shape of this Area.
    def add(rhs: Area): Unit = ???

    @stub
    // Returns an exact copy of this Area object.
    def clone(): Object = ???

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
    // Creates a new Area object that contains the same
    // geometry as this Area transformed by the specified
    // AffineTransform.
    def createTransformedArea(t: AffineTransform): Area = ???

    @stub
    // Tests whether the geometries of the two Area objects
    // are equal.
    def equals(other: Area): Boolean = ???

    @stub
    // Sets the shape of this Area to be the combined area
    // of its current shape and the shape of the specified Area,
    // minus their intersection.
    def exclusiveOr(rhs: Area): Unit = ???

    @stub
    // Returns a bounding Rectangle that completely encloses
    // this Area.
    def getBounds(): Rectangle = ???

    @stub
    // Returns a high precision bounding Rectangle2D that
    // completely encloses this Area.
    def getBounds2D(): Rectangle2D = ???

    @stub
    // Creates a PathIterator for the outline of this
    // Area object.
    def getPathIterator(at: AffineTransform): PathIterator = ???

    @stub
    // Creates a PathIterator for the flattened outline of
    // this Area object.
    def getPathIterator(at: AffineTransform, flatness: double): PathIterator = ???

    @stub
    // Sets the shape of this Area to the intersection of
    // its current shape and the shape of the specified Area.
    def intersect(rhs: Area): Unit = ???

    @stub
    // Tests if the interior of the Shape intersects the
    // interior of a specified rectangular area.
    def intersects(x: double, y: double, w: double, h: double): Boolean = ???

    @stub
    // Tests if the interior of the Shape intersects the
    // interior of a specified Rectangle2D.
    def intersects(r: Rectangle2D): Boolean = ???

    @stub
    // Tests whether this Area object encloses any area.
    def isEmpty(): Boolean = ???

    @stub
    // Tests whether this Area consists entirely of
    // straight edged polygonal geometry.
    def isPolygonal(): Boolean = ???

    @stub
    // Tests whether this Area is rectangular in shape.
    def isRectangular(): Boolean = ???

    @stub
    // Tests whether this Area is comprised of a single
    // closed subpath.
    def isSingular(): Boolean = ???

    @stub
    // Removes all of the geometry from this Area and
    // restores it to an empty area.
    def reset(): Unit = ???

    @stub
    // Subtracts the shape of the specified Area from the
    // shape of this Area.
    def subtract(rhs: Area): Unit = ???
}
