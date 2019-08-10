package java.awt.geom

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** A quadratic parametric curve segment specified with
 *  double coordinates.
 */
object QuadCurve2D_Double extends QuadCurve2D with Serializable {

    /** Constructs and initializes a QuadCurve2D with
     *  coordinates (0, 0, 0, 0, 0, 0).
     */
    @stub
    def Double() = ???

    /** Constructs and initializes a QuadCurve2D from the
     *  specified double coordinates.
     */
    @stub
    def Double(x1: Double, y1: Double, ctrlx: Double, ctrly: Double, x2: Double, y2: Double) = ???

    /** The X coordinate of the control point of the quadratic curve
     *  segment.
     */
    @stub
    val ctrlx: Double = ???

    /** The Y coordinate of the control point of the quadratic curve
     *  segment.
     */
    @stub
    val ctrly: Double = ???

    /** The X coordinate of the start point of the quadratic curve
     *  segment.
     */
    @stub
    val x1: Double = ???

    /** The X coordinate of the end point of the quadratic curve
     *  segment.
     */
    @stub
    val x2: Double = ???

    /** The Y coordinate of the start point of the quadratic curve
     *  segment.
     */
    @stub
    val y1: Double = ???

    /** The Y coordinate of the end point of the quadratic curve
     *  segment.
     */
    @stub
    val y2: Double = ???

    /** Returns a high precision and more accurate bounding box of
     *  the Shape than the getBounds method.
     */
    @stub
    def getBounds2D(): Rectangle2D = ???

    /** Returns the control point. */
    @stub
    def getCtrlPt(): Point2D = ???

    /** Returns the X coordinate of the control point in
     *  double precision.
     */
    @stub
    def getCtrlX(): Double = ???

    /** Returns the Y coordinate of the control point in
     *  double precision.
     */
    @stub
    def getCtrlY(): Double = ???

    /** Returns the start point. */
    @stub
    def getP1(): Point2D = ???

    /** Returns the end point. */
    @stub
    def getP2(): Point2D = ???

    /** Returns the X coordinate of the start point in
     *  double in precision.
     */
    @stub
    def getX1(): Double = ???

    /** Returns the X coordinate of the end point in
     *  double precision.
     */
    @stub
    def getX2(): Double = ???

    /** Returns the Y coordinate of the start point in
     *  double precision.
     */
    @stub
    def getY1(): Double = ???

    /** Returns the Y coordinate of the end point in
     *  double precision.
     */
    @stub
    def getY2(): Double = ???

    /** Sets the location of the end points and control point of this curve
     *  to the specified double coordinates.
     */
    @stub
    def setCurve(x1: Double, y1: Double, ctrlx: Double, ctrly: Double, x2: Double, y2: Double): Unit = ???
}
