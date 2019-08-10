package java.awt.geom

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** The Ellipse2D class describes an ellipse that is defined
 *  by a framing rectangle.
 *  
 *  This class is only the abstract superclass for all objects which
 *  store a 2D ellipse.
 *  The actual storage representation of the coordinates is left to
 *  the subclass.
 */
abstract class Ellipse2D extends RectangularShape {

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
     *  equal to this Ellipse2D.
     */
    def equals(obj: Any): Boolean

    /** Returns an iteration object that defines the boundary of this
     *  Ellipse2D.
     */
    def getPathIterator(at: AffineTransform): PathIterator

    /** Returns the hashcode for this Ellipse2D. */
    def hashCode(): Int

    /** Tests if the interior of the Shape intersects the
     *  interior of a specified rectangular area.
     */
    def intersects(x: Double, y: Double, w: Double, h: Double): Boolean
}

object Ellipse2D {
    /** The Double class defines an ellipse specified
     *  in double precision.
     */
    object Double extends Ellipse2D with Serializable {

        /** Constructs a new Ellipse2D, initialized to
         *  location (0, 0) and size (0, 0).
         */
        @stub
        def apply() = ???

        /** Constructs and initializes an Ellipse2D from the
         *  specified coordinates.
         */
        @stub
        def apply(x: Double, y: Double, w: Double, h: Double) = ???

        /** The overall height of the Ellipse2D. */
        @stub
        val height: Double = ???

        /** The overall width of this Ellipse2D. */
        @stub
        val width: Double = ???

        /** The X coordinate of the upper-left corner of the
         *  framing rectangle of this Ellipse2D.
         */
        @stub
        val x: Double = ???

        /** The Y coordinate of the upper-left corner of the
         *  framing rectangle of this Ellipse2D.
         */
        @stub
        val y: Double = ???

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

        /** Sets the location and size of the framing rectangle of this
         *  Shape to the specified rectangular values.
         */
        @stub
        def setFrame(x: Double, y: Double, w: Double, h: Double): Unit = ???
    }


    /** The Float class defines an ellipse specified
     *  in float precision.
     */
    object Float extends Ellipse2D with Serializable {

        /** Constructs a new Ellipse2D, initialized to
         *  location (0, 0) and size (0, 0).
         */
        @stub
        def apply() = ???

        /** Constructs and initializes an Ellipse2D from the
         *  specified coordinates.
         */
        @stub
        def apply(x: Float, y: Float, w: Float, h: Float) = ???

        /** The overall height of this Ellipse2D. */
        @stub
        val height: Float = ???

        /** The overall width of this Ellipse2D. */
        @stub
        val width: Float = ???

        /** The X coordinate of the upper-left corner of the
         *  framing rectangle of this Ellipse2D.
         */
        @stub
        val x: Float = ???

        /** The Y coordinate of the upper-left corner of the
         *  framing rectangle of this Ellipse2D.
         */
        @stub
        val y: Float = ???

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

        /** Sets the location and size of the framing rectangle of this
         *  Shape to the specified rectangular values.
         */
        @stub
        def setFrame(x: Double, y: Double, w: Double, h: Double): Unit = ???

        /** Sets the location and size of the framing rectangle of this
         *  Shape to the specified rectangular values.
         */
        @stub
        def setFrame(x: Float, y: Float, w: Float, h: Float): Unit = ???
    }

}
