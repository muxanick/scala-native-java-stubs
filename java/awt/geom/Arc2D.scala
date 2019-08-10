package java.awt.geom

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** Arc2D is the abstract superclass for all objects that
 *  store a 2D arc defined by a framing rectangle,
 *  start angle, angular extent (length of the arc), and a closure type
 *  (OPEN, CHORD, or PIE).
 *  
 *  
 *  The arc is a partial section of a full ellipse which
 *  inscribes the framing rectangle of its parent RectangularShape.
 *  
 *  
 *  The angles are specified relative to the non-square
 *  framing rectangle such that 45 degrees always falls on the line from
 *  the center of the ellipse to the upper right corner of the framing
 *  rectangle.
 *  As a result, if the framing rectangle is noticeably longer along one
 *  axis than the other, the angles to the start and end of the arc segment
 *  will be skewed farther along the longer axis of the frame.
 *  
 *  
 *  The actual storage representation of the coordinates is left to
 *  the subclass.
 */
abstract class Arc2D extends RectangularShape {

    /** This is an abstract class that cannot be instantiated directly. */
    @stub
    protected def this() = ???

    /** This is an abstract class that cannot be instantiated directly. */
    @stub
    protected def this(type: Int) = ???

    /** Determines whether or not the specified point is inside the boundary
     *  of the arc.
     */
    def contains(x: Double, y: Double): Boolean

    /** Determines whether or not the interior of the arc entirely contains
     *  the specified rectangle.
     */
    def contains(x: Double, y: Double, w: Double, h: Double): Boolean

    /** Determines whether or not the interior of the arc entirely contains
     *  the specified rectangle.
     */
    def contains(r: Rectangle2D): Boolean

    /** Determines whether or not the specified angle is within the
     *  angular extents of the arc.
     */
    def containsAngle(angle: Double): Boolean

    /** Determines whether or not the specified Object is
     *  equal to this Arc2D.
     */
    def equals(obj: Any): Boolean

    /** Returns the angular extent of the arc. */
    def getAngleExtent(): Double

    /** Returns the starting angle of the arc. */
    def getAngleStart(): Double

    /** Returns the arc closure type of the arc: OPEN,
     *  CHORD, or PIE.
     */
    def getArcType(): Int

    /** Returns the high-precision framing rectangle of the arc. */
    def getBounds2D(): Rectangle2D

    /** Returns the ending point of the arc. */
    def getEndPoint(): Point2D

    /** Returns an iteration object that defines the boundary of the
     *  arc.
     */
    def getPathIterator(at: AffineTransform): PathIterator

    /** Returns the starting point of the arc. */
    def getStartPoint(): Point2D

    /** Returns the hashcode for this Arc2D. */
    def hashCode(): Int

    /** Determines whether or not the interior of the arc intersects
     *  the interior of the specified rectangle.
     */
    def intersects(x: Double, y: Double, w: Double, h: Double): Boolean

    /** Constructs a Rectangle2D of the appropriate precision
     *  to hold the parameters calculated to be the framing rectangle
     *  of this arc.
     */
    protected def makeBounds(x: Double, y: Double, w: Double, h: Double): Rectangle2D

    /** Sets the angular extent of this arc to the specified double
     *  value.
     */
    def setAngleExtent(angExt: Double): Unit

    /** Sets the starting angle and angular extent of this arc using two
     *  sets of coordinates.
     */
    def setAngles(x1: Double, y1: Double, x2: Double, y2: Double): Unit

    /** Sets the starting angle and angular extent of this arc using
     *  two points.
     */
    def setAngles(p1: Point2D, p2: Point2D): Unit

    /** Sets the starting angle of this arc to the specified double
     *  value.
     */
    def setAngleStart(angSt: Double): Unit

    /** Sets the starting angle of this arc to the angle that the
     *  specified point defines relative to the center of this arc.
     */
    def setAngleStart(p: Point2D): Unit

    /** Sets this arc to be the same as the specified arc. */
    def setArc(a: Arc2D): Unit

    /** Sets the location, size, angular extents, and closure type of
     *  this arc to the specified double values.
     */
    def setArc(x: Double, y: Double, w: Double, h: Double, angSt: Double, angExt: Double, closure: Int): Unit

    /** Sets the location, size, angular extents, and closure type of
     *  this arc to the specified values.
     */
    def setArc(loc: Point2D, size: Dimension2D, angSt: Double, angExt: Double, closure: Int): Unit

    /** Sets the location, size, angular extents, and closure type of
     *  this arc to the specified values.
     */
    def setArc(rect: Rectangle2D, angSt: Double, angExt: Double, closure: Int): Unit

    /** Sets the position, bounds, angular extents, and closure type of
     *  this arc to the specified values.
     */
    def setArcByCenter(x: Double, y: Double, radius: Double, angSt: Double, angExt: Double, closure: Int): Unit

    /** Sets the position, bounds, and angular extents of this arc to the
     *  specified value.
     */
    def setArcByTangent(p1: Point2D, p2: Point2D, p3: Point2D, radius: Double): Unit

    /** Sets the closure type of this arc to the specified value:
     *  OPEN, CHORD, or PIE.
     */
    def setArcType(type: Int): Unit

    /** Sets the location and size of the framing rectangle of this
     *  Shape to the specified rectangular values.
     */
    def setFrame(x: Double, y: Double, w: Double, h: Double): Unit
}

object Arc2D {
    /** This class defines an arc specified in double precision. */
    object Double extends Arc2D with Serializable {

        /** Constructs a new OPEN arc, initialized to location (0, 0),
         *  size (0, 0), angular extents (start = 0, extent = 0).
         */
        @stub
        def apply() = ???

        /** Constructs a new arc, initialized to the specified location,
         *  size, angular extents, and closure type.
         */
        @stub
        def apply(x: Double, y: Double, w: Double, h: Double, start: Double, extent: Double, type: Int) = ???

        /** Constructs a new arc, initialized to location (0, 0),
         *  size (0, 0), angular extents (start = 0, extent = 0), and
         *  the specified closure type.
         */
        @stub
        def apply(type: Int) = ???

        /** Constructs a new arc, initialized to the specified location,
         *  size, angular extents, and closure type.
         */
        @stub
        def apply(ellipseBounds: Rectangle2D, start: Double, extent: Double, type: Int) = ???

        /** The angular extent of the arc in degrees. */
        @stub
        val extent: Double = ???

        /** The overall height of the full ellipse of which this arc is
         *  a partial section (not considering the angular extents).
         */
        @stub
        val height: Double = ???

        /** The starting angle of the arc in degrees. */
        @stub
        val start: Double = ???

        /** The overall width of the full ellipse of which this arc is
         *  a partial section (not considering the angular extents).
         */
        @stub
        val width: Double = ???

        /** The X coordinate of the upper-left corner of the framing
         *  rectangle of the arc.
         */
        @stub
        val x: Double = ???

        /** The Y coordinate of the upper-left corner of the framing
         *  rectangle of the arc.
         */
        @stub
        val y: Double = ???

        /** Returns the angular extent of the arc. */
        @stub
        def getAngleExtent(): Double = ???

        /** Returns the starting angle of the arc. */
        @stub
        def getAngleStart(): Double = ???

        /** Returns the height of the framing rectangle
         *  in double precision.
         */
        @stub
        def getHeight(): Double = ???

        /** Returns the width of the framing rectangle in
         *  double precision.
         */
        @stub
        def getWidth(): Double = ???

        /** Returns the X coordinate of the upper-left corner of
         *  the framing rectangle in double precision.
         */
        @stub
        def getX(): Double = ???

        /** Returns the Y coordinate of the upper-left corner of
         *  the framing rectangle in double precision.
         */
        @stub
        def getY(): Double = ???

        /** Determines whether the RectangularShape is empty. */
        @stub
        def isEmpty(): Boolean = ???

        /** Constructs a Rectangle2D of the appropriate precision
         *  to hold the parameters calculated to be the framing rectangle
         *  of this arc.
         */
        @stub
        protected def makeBounds(x: Double, y: Double, w: Double, h: Double): Rectangle2D = ???

        /** Sets the angular extent of this arc to the specified double
         *  value.
         */
        @stub
        def setAngleExtent(angExt: Double): Unit = ???

        /** Sets the starting angle of this arc to the specified double
         *  value.
         */
        @stub
        def setAngleStart(angSt: Double): Unit = ???

        /** Sets the location, size, angular extents, and closure type of
         *  this arc to the specified double values.
         */
        @stub
        def setArc(x: Double, y: Double, w: Double, h: Double, angSt: Double, angExt: Double, closure: Int): Unit = ???
    }


    /** This class defines an arc specified in float precision. */
    object Float extends Arc2D with Serializable {

        /** Constructs a new OPEN arc, initialized to location (0, 0),
         *  size (0, 0), angular extents (start = 0, extent = 0).
         */
        @stub
        def apply() = ???

        /** Constructs a new arc, initialized to the specified location,
         *  size, angular extents, and closure type.
         */
        @stub
        def apply(x: Float, y: Float, w: Float, h: Float, start: Float, extent: Float, type: Int) = ???

        /** Constructs a new arc, initialized to location (0, 0),
         *  size (0, 0), angular extents (start = 0, extent = 0), and
         *  the specified closure type.
         */
        @stub
        def apply(type: Int) = ???

        /** Constructs a new arc, initialized to the specified location,
         *  size, angular extents, and closure type.
         */
        @stub
        def apply(ellipseBounds: Rectangle2D, start: Float, extent: Float, type: Int) = ???

        /** The angular extent of the arc in degrees. */
        @stub
        val extent: Float = ???

        /** The overall height of the full ellipse of which this arc is
         *  a partial section (not considering the
         *  angular extents).
         */
        @stub
        val height: Float = ???

        /** The starting angle of the arc in degrees. */
        @stub
        val start: Float = ???

        /** The overall width of the full ellipse of which this arc is
         *  a partial section (not considering the
         *  angular extents).
         */
        @stub
        val width: Float = ???

        /** The X coordinate of the upper-left corner of the framing
         *  rectangle of the arc.
         */
        @stub
        val x: Float = ???

        /** The Y coordinate of the upper-left corner of the framing
         *  rectangle of the arc.
         */
        @stub
        val y: Float = ???

        /** Returns the angular extent of the arc. */
        @stub
        def getAngleExtent(): Double = ???

        /** Returns the starting angle of the arc. */
        @stub
        def getAngleStart(): Double = ???

        /** Returns the height of the framing rectangle
         *  in double precision.
         */
        @stub
        def getHeight(): Double = ???

        /** Returns the width of the framing rectangle in
         *  double precision.
         */
        @stub
        def getWidth(): Double = ???

        /** Returns the X coordinate of the upper-left corner of
         *  the framing rectangle in double precision.
         */
        @stub
        def getX(): Double = ???

        /** Returns the Y coordinate of the upper-left corner of
         *  the framing rectangle in double precision.
         */
        @stub
        def getY(): Double = ???

        /** Determines whether the RectangularShape is empty. */
        @stub
        def isEmpty(): Boolean = ???

        /** Constructs a Rectangle2D of the appropriate precision
         *  to hold the parameters calculated to be the framing rectangle
         *  of this arc.
         */
        @stub
        protected def makeBounds(x: Double, y: Double, w: Double, h: Double): Rectangle2D = ???

        /** Sets the angular extent of this arc to the specified double
         *  value.
         */
        @stub
        def setAngleExtent(angExt: Double): Unit = ???

        /** Sets the starting angle of this arc to the specified double
         *  value.
         */
        @stub
        def setAngleStart(angSt: Double): Unit = ???

        /** Sets the location, size, angular extents, and closure type of
         *  this arc to the specified double values.
         */
        @stub
        def setArc(x: Double, y: Double, w: Double, h: Double, angSt: Double, angExt: Double, closure: Int): Unit = ???
    }


    /** The closure type for an arc closed by drawing a straight
     *  line segment from the start of the arc segment to the end of the
     *  arc segment.
     */
    @stub
    val CHORD: Int = ???

    /** The closure type for an open arc with no path segments
     *  connecting the two ends of the arc segment.
     */
    @stub
    val OPEN: Int = ???

    /** The closure type for an arc closed by drawing straight line
     *  segments from the start of the arc segment to the center
     *  of the full ellipse and from that point to the end of the arc segment.
     */
    @stub
    val PIE: Int = ???
}
