package java.awt.geom

import java.io.Serializable
import java.lang.{Object, String}
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
    object Double extends Rectangle2D with Serializable {

        /** Constructs a new Rectangle2D, initialized to
         *  location (0, 0) and size (0, 0).
         */
        @stub
        def apply() = ???

        /** Constructs and initializes a Rectangle2D
         *  from the specified double coordinates.
         */
        @stub
        def apply(x: Double, y: Double, w: Double, h: Double) = ???

        /** The height of this Rectangle2D. */
        @stub
        val height: Double = ???

        /** The width of this Rectangle2D. */
        @stub
        val width: Double = ???

        /** The X coordinate of this Rectangle2D. */
        @stub
        val x: Double = ???

        /** The Y coordinate of this Rectangle2D. */
        @stub
        val y: Double = ???

        /** Returns a new Rectangle2D object representing the
         *  intersection of this Rectangle2D with the specified
         *  Rectangle2D.
         */
        @stub
        def createIntersection(r: Rectangle2D): Rectangle2D = ???

        /** Returns a new Rectangle2D object representing the
         *  union of this Rectangle2D with the specified
         *  Rectangle2D.
         */
        @stub
        def createUnion(r: Rectangle2D): Rectangle2D = ???

        /** Returns a high precision and more accurate bounding box of
         *  the Shape than the getBounds method.
         */
        @stub
        def getBounds2D(): Rectangle2D = ???

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

        /** Determines where the specified coordinates lie with respect
         *  to this Rectangle2D.
         */
        @stub
        def outcode(x: Double, y: Double): Int = ???

        /** Sets the location and size of this Rectangle2D
         *  to the specified double values.
         */
        @stub
        def setRect(x: Double, y: Double, w: Double, h: Double): Unit = ???

        /** Sets this Rectangle2D to be the same as the specified
         *  Rectangle2D.
         */
        @stub
        def setRect(r: Rectangle2D): Unit = ???

        /** Returns the String representation of this
         *  Rectangle2D.
         */
        @stub
        def toString(): String = ???
    }


    /** The Float class defines a rectangle specified in float
     *  coordinates.
     */
    object Float extends Rectangle2D with Serializable {

        /** Constructs a new Rectangle2D, initialized to
         *  location (0.0, 0.0) and size (0.0, 0.0).
         */
        @stub
        def apply() = ???

        /** Constructs and initializes a Rectangle2D
         *  from the specified float coordinates.
         */
        @stub
        def apply(x: Float, y: Float, w: Float, h: Float) = ???

        /** The height of this Rectangle2D. */
        @stub
        val height: Float = ???

        /** The width of this Rectangle2D. */
        @stub
        val width: Float = ???

        /** The X coordinate of this Rectangle2D. */
        @stub
        val x: Float = ???

        /** The Y coordinate of this Rectangle2D. */
        @stub
        val y: Float = ???

        /** Returns a new Rectangle2D object representing the
         *  intersection of this Rectangle2D with the specified
         *  Rectangle2D.
         */
        @stub
        def createIntersection(r: Rectangle2D): Rectangle2D = ???

        /** Returns a new Rectangle2D object representing the
         *  union of this Rectangle2D with the specified
         *  Rectangle2D.
         */
        @stub
        def createUnion(r: Rectangle2D): Rectangle2D = ???

        /** Returns a high precision and more accurate bounding box of
         *  the Shape than the getBounds method.
         */
        @stub
        def getBounds2D(): Rectangle2D = ???

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

        /** Determines where the specified coordinates lie with respect
         *  to this Rectangle2D.
         */
        @stub
        def outcode(x: Double, y: Double): Int = ???

        /** Sets the location and size of this Rectangle2D
         *  to the specified double values.
         */
        @stub
        def setRect(x: Double, y: Double, w: Double, h: Double): Unit = ???

        /** Sets the location and size of this Rectangle2D
         *  to the specified float values.
         */
        @stub
        def setRect(x: Float, y: Float, w: Float, h: Float): Unit = ???

        /** Sets this Rectangle2D to be the same as the specified
         *  Rectangle2D.
         */
        @stub
        def setRect(r: Rectangle2D): Unit = ???

        /** Returns the String representation of this
         *  Rectangle2D.
         */
        @stub
        def toString(): String = ???
    }


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
