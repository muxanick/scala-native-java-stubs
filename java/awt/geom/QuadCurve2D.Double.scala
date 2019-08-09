package java.awt.geom

import java.io.Serializable
import java.lang.Object

/** A quadratic parametric curve segment specified with
 *  double coordinates.
 */
object QuadCurve2D.Double extends QuadCurve2D with Serializable {

    /** Constructs and initializes a QuadCurve2D with
     *  coordinates (0, 0, 0, 0, 0, 0).
     */
    @stub
    def Double() = ???

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
}
