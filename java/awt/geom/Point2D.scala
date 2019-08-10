package java.awt.geom

import java.lang.{Cloneable, Object}
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
    type Double = Point2D_Double

    /** The Float class defines a point specified in float
     *  precision.
     */
    type Float = Point2D_Float

    /** Returns the distance between two points. */
    @stub
    def distance(x1: Double, y1: Double, x2: Double, y2: Double): Double = ???

    /** Returns the square of the distance between two points. */
    @stub
    def distanceSq(x1: Double, y1: Double, x2: Double, y2: Double): Double = ???
}
