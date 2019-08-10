package java.awt.geom

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** A cubic parametric curve segment specified with
 *  float coordinates.
 */
object CubicCurve2D_Float extends CubicCurve2D with Serializable {

    /** Constructs and initializes a CubicCurve with coordinates
     *  (0, 0, 0, 0, 0, 0, 0, 0).
     */
    @stub
    def Float() = ???

    /** Constructs and initializes a CubicCurve2D from
     *  the specified float coordinates.
     */
    @stub
    def Float(x1: Float, y1: Float, ctrlx1: Float, ctrly1: Float, ctrlx2: Float, ctrly2: Float, x2: Float, y2: Float) = ???

    /** The X coordinate of the first control point
     *  of the cubic curve segment.
     */
    @stub
    val ctrlx1: Float = ???

    /** The X coordinate of the second control point
     *  of the cubic curve segment.
     */
    @stub
    val ctrlx2: Float = ???

    /** The Y coordinate of the first control point
     *  of the cubic curve segment.
     */
    @stub
    val ctrly1: Float = ???

    /** The Y coordinate of the second control point
     *  of the cubic curve segment.
     */
    @stub
    val ctrly2: Float = ???

    /** The X coordinate of the start point
     *  of the cubic curve segment.
     */
    @stub
    val x1: Float = ???

    /** The X coordinate of the end point
     *  of the cubic curve segment.
     */
    @stub
    val x2: Float = ???

    /** The Y coordinate of the start point
     *  of the cubic curve segment.
     */
    @stub
    val y1: Float = ???

    /** The Y coordinate of the end point
     *  of the cubic curve segment.
     */
    @stub
    val y2: Float = ???

    /** Returns a high precision and more accurate bounding box of
     *  the Shape than the getBounds method.
     */
    @stub
    def getBounds2D(): Rectangle2D = ???

    /** Returns the first control point. */
    @stub
    def getCtrlP1(): Point2D = ???

    /** Returns the second control point. */
    @stub
    def getCtrlP2(): Point2D = ???

    /** Returns the X coordinate of the first control point in double precision. */
    @stub
    def getCtrlX1(): Double = ???

    /** Returns the X coordinate of the second control point
     *  in double precision.
     */
    @stub
    def getCtrlX2(): Double = ???

    /** Returns the Y coordinate of the first control point in double precision. */
    @stub
    def getCtrlY1(): Double = ???

    /** Returns the Y coordinate of the second control point
     *  in double precision.
     */
    @stub
    def getCtrlY2(): Double = ???

    /** Returns the start point. */
    @stub
    def getP1(): Point2D = ???

    /** Returns the end point. */
    @stub
    def getP2(): Point2D = ???

    /** Returns the X coordinate of the start point in double precision. */
    @stub
    def getX1(): Double = ???

    /** Returns the X coordinate of the end point in double precision. */
    @stub
    def getX2(): Double = ???

    /** Returns the Y coordinate of the start point in double precision. */
    @stub
    def getY1(): Double = ???

    /** Returns the Y coordinate of the end point in double precision. */
    @stub
    def getY2(): Double = ???

    /** Sets the location of the end points and control points of this curve
     *  to the specified double coordinates.
     */
    @stub
    def setCurve(x1: Double, y1: Double, ctrlx1: Double, ctrly1: Double, ctrlx2: Double, ctrly2: Double, x2: Double, y2: Double): Unit = ???

    /** Sets the location of the end points and control points
     *  of this curve to the specified float coordinates.
     */
    @stub
    def setCurve(x1: Float, y1: Float, ctrlx1: Float, ctrly1: Float, ctrlx2: Float, ctrly2: Float, x2: Float, y2: Float): Unit = ???
}
