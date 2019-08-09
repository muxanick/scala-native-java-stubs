package java.awt

import java.awt.geom.Point2D
import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A point representing a location in (x,y) coordinate space,
 *  specified in integer precision.
 */
class Point extends Point2D with Serializable {

    /** Constructs and initializes a point at the origin
     *  (0, 0) of the coordinate space.
     */
    @stub
    def this() = ???

    /** Constructs and initializes a point at the specified
     *  (x,y) location in the coordinate space.
     */
    @stub
    def this(x: Int, y: Int) = ???

    /** Constructs and initializes a point with the same location as
     *  the specified Point object.
     */
    @stub
    def this(p: Point) = ???

    /** The X coordinate of this Point. */
    @stub
    val x: Int = ???

    /** The Y coordinate of this Point. */
    @stub
    val y: Int = ???

    /** Determines whether or not two points are equal. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the location of this point. */
    @stub
    def getLocation(): Point = ???

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

    /** Moves this point to the specified location in the
     *  (x,y) coordinate plane.
     */
    @stub
    def move(x: Int, y: Int): Unit = ???

    /** Sets the location of this point to the specified double coordinates. */
    @stub
    def setLocation(x: Double, y: Double): Unit = ???

    /** Changes the point to have the specified location. */
    @stub
    def setLocation(x: Int, y: Int): Unit = ???

    /** Sets the location of the point to the specified location. */
    @stub
    def setLocation(p: Point): Unit = ???

    /** Returns a string representation of this point and its location
     *  in the (x,y) coordinate space.
     */
    @stub
    def toString(): String = ???

    /** Translates this point, at location (x,y),
     *  by dx along the x axis and dy
     *  along the y axis so that it now represents the point
     *  (x+dx,y+dy).
     */
    @stub
    def translate(dx: Int, dy: Int): Unit = ???
}
