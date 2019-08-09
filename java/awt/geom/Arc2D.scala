package java.awt.geom

import java.lang.Object

// Arc2D is the abstract superclass for all objects that
// store a 2D arc defined by a framing rectangle,
// start angle, angular extent (length of the arc), and a closure type
// (OPEN, CHORD, or PIE).
// 
// 
// The arc is a partial section of a full ellipse which
// inscribes the framing rectangle of its parent RectangularShape.
// 
// 
// The angles are specified relative to the non-square
// framing rectangle such that 45 degrees always falls on the line from
// the center of the ellipse to the upper right corner of the framing
// rectangle.
// As a result, if the framing rectangle is noticeably longer along one
// axis than the other, the angles to the start and end of the arc segment
// will be skewed farther along the longer axis of the frame.
// 
// 
// The actual storage representation of the coordinates is left to
// the subclass.
abstract class Arc2D extends RectangularShape {

    @stub
    // This is an abstract class that cannot be instantiated directly.
    protected def this() = ???

    // Determines whether or not the specified point is inside the boundary
    // of the arc.
    def contains(x: double, y: double): Boolean

    // Determines whether or not the interior of the arc entirely contains
    // the specified rectangle.
    def contains(x: double, y: double, w: double, h: double): Boolean

    // Determines whether or not the interior of the arc entirely contains
    // the specified rectangle.
    def contains(r: Rectangle2D): Boolean

    // Determines whether or not the specified angle is within the
    // angular extents of the arc.
    def containsAngle(angle: double): Boolean

    // Determines whether or not the specified Object is
    // equal to this Arc2D.
    def equals(obj: Object): Boolean

    // Returns the angular extent of the arc.
    def getAngleExtent(): double

    // Returns the starting angle of the arc.
    def getAngleStart(): double

    // Returns the arc closure type of the arc: OPEN,
    // CHORD, or PIE.
    def getArcType(): Int

    // Returns the high-precision framing rectangle of the arc.
    def getBounds2D(): Rectangle2D

    // Returns the ending point of the arc.
    def getEndPoint(): Point2D

    // Returns an iteration object that defines the boundary of the
    // arc.
    def getPathIterator(at: AffineTransform): PathIterator

    // Returns the starting point of the arc.
    def getStartPoint(): Point2D

    // Returns the hashcode for this Arc2D.
    def hashCode(): Int

    // Determines whether or not the interior of the arc intersects
    // the interior of the specified rectangle.
    def intersects(x: double, y: double, w: double, h: double): Boolean

    // Constructs a Rectangle2D of the appropriate precision
    // to hold the parameters calculated to be the framing rectangle
    // of this arc.
    protected def makeBounds(x: double, y: double, w: double, h: double): Rectangle2D

    // Sets the angular extent of this arc to the specified double
    // value.
    def setAngleExtent(angExt: double): Unit

    // Sets the starting angle and angular extent of this arc using two
    // sets of coordinates.
    def setAngles(x1: double, y1: double, x2: double, y2: double): Unit

    // Sets the starting angle and angular extent of this arc using
    // two points.
    def setAngles(p1: Point2D, p2: Point2D): Unit

    // Sets the starting angle of this arc to the specified double
    // value.
    def setAngleStart(angSt: double): Unit

    // Sets the starting angle of this arc to the angle that the
    // specified point defines relative to the center of this arc.
    def setAngleStart(p: Point2D): Unit

    // Sets this arc to be the same as the specified arc.
    def setArc(a: Arc2D): Unit

    // Sets the location, size, angular extents, and closure type of
    // this arc to the specified double values.
    def setArc(x: double, y: double, w: double, h: double, angSt: double, angExt: double, closure: Int): Unit

    // Sets the location, size, angular extents, and closure type of
    // this arc to the specified values.
    def setArc(loc: Point2D, size: Dimension2D, angSt: double, angExt: double, closure: Int): Unit

    // Sets the location, size, angular extents, and closure type of
    // this arc to the specified values.
    def setArc(rect: Rectangle2D, angSt: double, angExt: double, closure: Int): Unit

    // Sets the position, bounds, angular extents, and closure type of
    // this arc to the specified values.
    def setArcByCenter(x: double, y: double, radius: double, angSt: double, angExt: double, closure: Int): Unit

    // Sets the position, bounds, and angular extents of this arc to the
    // specified value.
    def setArcByTangent(p1: Point2D, p2: Point2D, p3: Point2D, radius: double): Unit

    // Sets the closure type of this arc to the specified value:
    // OPEN, CHORD, or PIE.
    def setArcType(type: Int): Unit
}

object Arc2D {
    @stub
    // This class defines an arc specified in double precision.
    def Arc2D.Double: class = ???

    @stub
    // The closure type for an arc closed by drawing a straight
    // line segment from the start of the arc segment to the end of the
    // arc segment.
    def CHORD: Int = ???

    @stub
    // The closure type for an open arc with no path segments
    // connecting the two ends of the arc segment.
    def OPEN: Int = ???
}
