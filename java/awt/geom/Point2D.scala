package java.awt.geom

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import scala.scalanative.annotation.stub

/** The Point2D class defines a point representing a location
 *  in (x,y) coordinate space.
 *  
 *  This class is only the abstract superclass for all objects that
 *  store a 2D coordinate.
 *  The actual storage representation of the coordinates is left to
 *  the subclass.
 */
abstract class Point2D extends Object with Cloneable {

    /** This is an abstract class that cannot be instantiated directly. */
    @stub
    protected def this() = ???

    /** Creates a new object of the same class and with the
     *  same contents as this object.
     */
    def clone(): Any

    /** Returns the distance from this Point2D to
     *  a specified point.
     */
    def distance(px: Double, py: Double): Double

    /** Returns the distance from this Point2D to a
     *  specified Point2D.
     */
    def distance(pt: Point2D): Double

    /** Returns the square of the distance from this
     *  Point2D to a specified point.
     */
    def distanceSq(px: Double, py: Double): Double

    /** Returns the square of the distance from this
     *  Point2D to a specified Point2D.
     */
    def distanceSq(pt: Point2D): Double

    /** Determines whether or not two points are equal. */
    def equals(obj: Any): Boolean

    /** Returns the X coordinate of this Point2D in
     *  double precision.
     */
    def getX(): Double

    /** Returns the Y coordinate of this Point2D in
     *  double precision.
     */
    def getY(): Double

    /** Returns the hashcode for this Point2D. */
    def hashCode(): Int

    /** Sets the location of this Point2D to the
     *  specified double coordinates.
     */
    def setLocation(x: Double, y: Double): Unit

    /** Sets the location of this Point2D to the same
     *  coordinates as the specified Point2D object.
     */
    def setLocation(p: Point2D): Unit
}

object Point2D {
    /** The Double class defines a point specified in
     *  double precision.
     */
    object Double extends Point2D with Serializable {

        /** Constructs and initializes a Point2D with
         *  coordinates (0, 0).
         */
        @stub
        def apply() = ???

        /** Constructs and initializes a Point2D with the
         *  specified coordinates.
         */
        @stub
        def apply(x: Double, y: Double) = ???

        /** The X coordinate of this Point2D. */
        @stub
        val x: Double = ???

        /** The Y coordinate of this Point2D. */
        @stub
        val y: Double = ???

        /** Returns the X coordinate of this Point2D in
         *  double precision.
         */
        @stub
        def getX(): Double = ???

        /** Returns the Y coordinate of this Point2D in
         *  double precision.
         */
        @stub
        def getY(): Double = ???

        /** Sets the location of this Point2D to the
         *  specified double coordinates.
         */
        @stub
        def setLocation(x: Double, y: Double): Unit = ???

        /** Returns a String that represents the value
         *  of this Point2D.
         */
        @stub
        def toString(): String = ???
    }


    /** The Float class defines a point specified in float
     *  precision.
     */
    object Float extends Point2D with Serializable {

        /** Constructs and initializes a Point2D with
         *  coordinates (0, 0).
         */
        @stub
        def apply() = ???

        /** Constructs and initializes a Point2D with
         *  the specified coordinates.
         */
        @stub
        def apply(x: Float, y: Float) = ???

        /** The X coordinate of this Point2D. */
        @stub
        val x: Float = ???

        /** The Y coordinate of this Point2D. */
        @stub
        val y: Float = ???

        /** Returns the X coordinate of this Point2D in
         *  double precision.
         */
        @stub
        def getX(): Double = ???

        /** Returns the Y coordinate of this Point2D in
         *  double precision.
         */
        @stub
        def getY(): Double = ???

        /** Sets the location of this Point2D to the
         *  specified double coordinates.
         */
        @stub
        def setLocation(x: Double, y: Double): Unit = ???

        /** Sets the location of this Point2D to the
         *  specified float coordinates.
         */
        @stub
        def setLocation(x: Float, y: Float): Unit = ???

        /** Returns a String that represents the value
         *  of this Point2D.
         */
        @stub
        def toString(): String = ???
    }


    /** Returns the distance between two points. */
    @stub
    def distance(x1: Double, y1: Double, x2: Double, y2: Double): Double = ???

    /** Returns the square of the distance between two points. */
    @stub
    def distanceSq(x1: Double, y1: Double, x2: Double, y2: Double): Double = ???
}
