package java.awt.geom

import java.io.Serializable
import java.lang.Object

/** The Double class defines an ellipse specified
 *  in double precision.
 */
object Ellipse2D.Double extends Ellipse2D with Serializable {

    /** Constructs a new Ellipse2D, initialized to
     *  location (0, 0) and size (0, 0).
     */
    @stub
    def Double() = ???

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
}
