package java.awt.geom

import java.io.Serializable
import java.lang.Object

// A quadratic parametric curve segment specified with
// double coordinates.
object QuadCurve2D.Double extends QuadCurve2D with Serializable {

    @stub
    // Constructs and initializes a QuadCurve2D with
    // coordinates (0, 0, 0, 0, 0, 0).
    def Double() = ???

    @stub
    // The X coordinate of the control point of the quadratic curve
    // segment.
    def ctrlx: double = ???

    @stub
    // The Y coordinate of the control point of the quadratic curve
    // segment.
    def ctrly: double = ???

    @stub
    // The X coordinate of the start point of the quadratic curve
    // segment.
    def x1: double = ???

    @stub
    // The X coordinate of the end point of the quadratic curve
    // segment.
    def x2: double = ???

    @stub
    // The Y coordinate of the start point of the quadratic curve
    // segment.
    def y1: double = ???

    @stub
    // Returns a high precision and more accurate bounding box of
    // the Shape than the getBounds method.
    def getBounds2D(): Rectangle2D = ???

    @stub
    // Returns the control point.
    def getCtrlPt(): Point2D = ???

    @stub
    // Returns the X coordinate of the control point in
    // double precision.
    def getCtrlX(): double = ???

    @stub
    // Returns the Y coordinate of the control point in
    // double precision.
    def getCtrlY(): double = ???

    @stub
    // Returns the start point.
    def getP1(): Point2D = ???

    @stub
    // Returns the end point.
    def getP2(): Point2D = ???

    @stub
    // Returns the X coordinate of the start point in
    // double in precision.
    def getX1(): double = ???

    @stub
    // Returns the X coordinate of the end point in
    // double precision.
    def getX2(): double = ???

    @stub
    // Returns the Y coordinate of the start point in
    // double precision.
    def getY1(): double = ???

    @stub
    // Returns the Y coordinate of the end point in
    // double precision.
    def getY2(): double = ???
}
