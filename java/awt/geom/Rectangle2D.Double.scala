package java.awt.geom

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The Double class defines a rectangle specified in
 *  double coordinates.
 */
object Rectangle2D_Double extends Rectangle2D with Serializable {

    /** Constructs a new Rectangle2D, initialized to
     *  location (0, 0) and size (0, 0).
     */
    @stub
    def Double() = ???

    /** Constructs and initializes a Rectangle2D
     *  from the specified double coordinates.
     */
    @stub
    def Double(x: Double, y: Double, w: Double, h: Double) = ???

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
