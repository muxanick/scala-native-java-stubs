package java.awt.geom

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** The Float class defines an ellipse specified
 *  in float precision.
 */
object Ellipse2D.Float extends Ellipse2D with Serializable {

    /** Constructs a new Ellipse2D, initialized to
     *  location (0, 0) and size (0, 0).
     */
    @stub
    def Float() = ???

    /** Constructs and initializes an Ellipse2D from the
     *  specified coordinates.
     */
    @stub
    def Float(x: Float, y: Float, w: Float, h: Float) = ???

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
