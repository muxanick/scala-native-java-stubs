package java.awt.geom

import java.io.Serializable
import java.lang.Object

// A cubic parametric curve segment specified with
// float coordinates.
object CubicCurve2D.Float extends CubicCurve2D with Serializable {

    @stub
    // Constructs and initializes a CubicCurve with coordinates
    // (0, 0, 0, 0, 0, 0, 0, 0).
    def Float() = ???

    @stub
    // The X coordinate of the first control point
    // of the cubic curve segment.
    def ctrlx1: float = ???

    @stub
    // The X coordinate of the second control point
    // of the cubic curve segment.
    def ctrlx2: float = ???

    @stub
    // The Y coordinate of the first control point
    // of the cubic curve segment.
    def ctrly1: float = ???

    @stub
    // The Y coordinate of the second control point
    // of the cubic curve segment.
    def ctrly2: float = ???

    @stub
    // The X coordinate of the start point
    // of the cubic curve segment.
    def x1: float = ???

    @stub
    // The X coordinate of the end point
    // of the cubic curve segment.
    def x2: float = ???

    @stub
    // The Y coordinate of the start point
    // of the cubic curve segment.
    def y1: float = ???

    @stub
    // Returns a high precision and more accurate bounding box of
    // the Shape than the getBounds method.
    def getBounds2D(): Rectangle2D = ???

    @stub
    // Returns the first control point.
    def getCtrlP1(): Point2D = ???

    @stub
    // Returns the second control point.
    def getCtrlP2(): Point2D = ???

    @stub
    // Returns the X coordinate of the first control point in double precision.
    def getCtrlX1(): double = ???

    @stub
    // Returns the X coordinate of the second control point
    // in double precision.
    def getCtrlX2(): double = ???

    @stub
    // Returns the Y coordinate of the first control point in double precision.
    def getCtrlY1(): double = ???

    @stub
    // Returns the Y coordinate of the second control point
    // in double precision.
    def getCtrlY2(): double = ???

    @stub
    // Returns the start point.
    def getP1(): Point2D = ???

    @stub
    // Returns the end point.
    def getP2(): Point2D = ???

    @stub
    // Returns the X coordinate of the start point in double precision.
    def getX1(): double = ???

    @stub
    // Returns the X coordinate of the end point in double precision.
    def getX2(): double = ???

    @stub
    // Returns the Y coordinate of the start point in double precision.
    def getY1(): double = ???

    @stub
    // Returns the Y coordinate of the end point in double precision.
    def getY2(): double = ???

    @stub
    // Sets the location of the end points and control points of this curve
    // to the specified double coordinates.
    def setCurve(x1: double, y1: double, ctrlx1: double, ctrly1: double, ctrlx2: double, ctrly2: double, x2: double, y2: double): Unit = ???
}
