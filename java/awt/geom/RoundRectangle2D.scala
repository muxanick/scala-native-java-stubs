package java.awt.geom

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** The RoundRectangle2D class defines a rectangle with
 *  rounded corners defined by a location (x,y), a
 *  dimension (w x h), and the width and height of an arc
 *  with which to round the corners.
 *  
 *  This class is the abstract superclass for all objects that
 *  store a 2D rounded rectangle.
 *  The actual storage representation of the coordinates is left to
 *  the subclass.
 */
abstract class RoundRectangle2D extends RectangularShape {

    /** This is an abstract class that cannot be instantiated directly. */
    @stub
    protected def this() = ???

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

    /** Determines whether or not the specified Object is
     *  equal to this RoundRectangle2D.
     */
    def equals(obj: Any): Boolean

    /** Gets the height of the arc that rounds off the corners. */
    def getArcHeight(): Double

    /** Gets the width of the arc that rounds off the corners. */
    def getArcWidth(): Double

    /** Returns an iteration object that defines the boundary of this
     *  RoundRectangle2D.
     */
    def getPathIterator(at: AffineTransform): PathIterator

    /** Returns the hashcode for this RoundRectangle2D. */
    def hashCode(): Int

    /** Tests if the interior of the Shape intersects the
     *  interior of a specified rectangular area.
     */
    def intersects(x: Double, y: Double, w: Double, h: Double): Boolean

    /** Sets the location and size of the framing rectangle of this
     *  Shape to the specified rectangular values.
     */
    def setFrame(x: Double, y: Double, w: Double, h: Double): Unit

    /** Sets the location, size, and corner radii of this
     *  RoundRectangle2D to the specified
     *  double values.
     */
    def setRoundRect(x: Double, y: Double, w: Double, h: Double, arcWidth: Double, arcHeight: Double): Unit

    /** Sets this RoundRectangle2D to be the same as the
     *  specified RoundRectangle2D.
     */
    def setRoundRect(rr: RoundRectangle2D): Unit
}

object RoundRectangle2D {
    /** The Double class defines a rectangle with rounded
     *  corners all specified in double coordinates.
     */
    object Double extends RoundRectangle2D with Serializable {

        /** Constructs a new RoundRectangle2D, initialized to
         *  location (0.0, 0.0), size (0.0, 0.0), and corner arcs
         *  of radius 0.0.
         */
        @stub
        def apply() = ???

        /** Constructs and initializes a RoundRectangle2D
         *  from the specified double coordinates.
         */
        @stub
        def apply(x: Double, y: Double, w: Double, h: Double, arcw: Double, arch: Double) = ???

        /** The height of the arc that rounds off the corners. */
        @stub
        val archeight: Double = ???

        /** The width of the arc that rounds off the corners. */
        @stub
        val arcwidth: Double = ???

        /** The height of this RoundRectangle2D. */
        @stub
        val height: Double = ???

        /** The width of this RoundRectangle2D. */
        @stub
        val width: Double = ???

        /** The X coordinate of this RoundRectangle2D. */
        @stub
        val x: Double = ???

        /** The Y coordinate of this RoundRectangle2D. */
        @stub
        val y: Double = ???

        /** Gets the height of the arc that rounds off the corners. */
        @stub
        def getArcHeight(): Double = ???

        /** Gets the width of the arc that rounds off the corners. */
        @stub
        def getArcWidth(): Double = ???

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

        /** Sets the location, size, and corner radii of this
         *  RoundRectangle2D to the specified
         *  double values.
         */
        @stub
        def setRoundRect(x: Double, y: Double, w: Double, h: Double, arcw: Double, arch: Double): Unit = ???

        /** Sets this RoundRectangle2D to be the same as the
         *  specified RoundRectangle2D.
         */
        @stub
        def setRoundRect(rr: RoundRectangle2D): Unit = ???
    }


    /** The Float class defines a rectangle with rounded
     *  corners all specified in float coordinates.
     */
    object Float extends RoundRectangle2D with Serializable {

        /** Constructs a new RoundRectangle2D, initialized to
         *  location (0.0, 0.0), size (0.0, 0.0), and corner arcs
         *  of radius 0.0.
         */
        @stub
        def apply() = ???

        /** Constructs and initializes a RoundRectangle2D
         *  from the specified float coordinates.
         */
        @stub
        def apply(x: Float, y: Float, w: Float, h: Float, arcw: Float, arch: Float) = ???

        /** The height of the arc that rounds off the corners. */
        @stub
        val archeight: Float = ???

        /** The width of the arc that rounds off the corners. */
        @stub
        val arcwidth: Float = ???

        /** The height of this RoundRectangle2D. */
        @stub
        val height: Float = ???

        /** The width of this RoundRectangle2D. */
        @stub
        val width: Float = ???

        /** The X coordinate of this RoundRectangle2D. */
        @stub
        val x: Float = ???

        /** The Y coordinate of this RoundRectangle2D. */
        @stub
        val y: Float = ???

        /** Gets the height of the arc that rounds off the corners. */
        @stub
        def getArcHeight(): Double = ???

        /** Gets the width of the arc that rounds off the corners. */
        @stub
        def getArcWidth(): Double = ???

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

        /** Sets the location, size, and corner radii of this
         *  RoundRectangle2D to the specified
         *  double values.
         */
        @stub
        def setRoundRect(x: Double, y: Double, w: Double, h: Double, arcw: Double, arch: Double): Unit = ???

        /** Sets the location, size, and corner radii of this
         *  RoundRectangle2D to the specified
         *  float values.
         */
        @stub
        def setRoundRect(x: Float, y: Float, w: Float, h: Float, arcw: Float, arch: Float): Unit = ???

        /** Sets this RoundRectangle2D to be the same as the
         *  specified RoundRectangle2D.
         */
        @stub
        def setRoundRect(rr: RoundRectangle2D): Unit = ???
    }

}
