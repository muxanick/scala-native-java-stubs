package java.awt.geom

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** The Double class defines an ellipse specified
 *  in double precision.
 */
object Ellipse2D_Double extends Ellipse2D with Serializable {

    /** Constructs a new Ellipse2D, initialized to
     *  location (0, 0) and size (0, 0).
     */
    @stub
    def Double() = ???

    /** Constructs and initializes an Ellipse2D from the
     *  specified coordinates.
     */
    @stub
    def Double(x: Double, y: Double, w: Double, h: Double) = ???

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
