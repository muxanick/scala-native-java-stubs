package java.awt.geom

import java.io.Serializable
import java.lang.Object

/** The Float class defines a rectangle specified in float
 *  coordinates.
 */
object Rectangle2D.Float extends Rectangle2D with Serializable {

    /** Constructs a new Rectangle2D, initialized to
     *  location (0.0, 0.0) and size (0.0, 0.0).
     */
    @stub
    def Float() = ???

    /** The height of this Rectangle2D. */
    @stub
    val height: Float = ???

    /** The width of this Rectangle2D. */
    @stub
    val width: Float = ???

    /** The X coordinate of this Rectangle2D. */
    @stub
    val x: Float = ???

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
}
