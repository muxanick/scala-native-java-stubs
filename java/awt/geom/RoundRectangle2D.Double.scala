package java.awt.geom

import java.io.Serializable
import java.lang.Object

/** The Double class defines a rectangle with rounded
 *  corners all specified in double coordinates.
 */
object RoundRectangle2D.Double extends RoundRectangle2D with Serializable {

    /** Constructs a new RoundRectangle2D, initialized to
     *  location (0.0, 0.0), size (0.0, 0.0), and corner arcs
     *  of radius 0.0.
     */
    @stub
    def Double() = ???

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
}
