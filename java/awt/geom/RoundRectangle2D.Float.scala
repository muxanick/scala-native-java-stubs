package java.awt.geom

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** The Float class defines a rectangle with rounded
 *  corners all specified in float coordinates.
 */
object RoundRectangle2D_Float extends RoundRectangle2D with Serializable {

    /** Constructs a new RoundRectangle2D, initialized to
     *  location (0.0, 0.0), size (0.0, 0.0), and corner arcs
     *  of radius 0.0.
     */
    @stub
    def Float() = ???

    /** Constructs and initializes a RoundRectangle2D
     *  from the specified float coordinates.
     */
    @stub
    def Float(x: Float, y: Float, w: Float, h: Float, arcw: Float, arch: Float) = ???

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
