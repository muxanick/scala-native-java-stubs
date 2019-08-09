package java.awt.geom

import java.io.Serializable
import java.lang.Object

// A line segment specified with float coordinates.
object Line2D.Float extends Line2D with Serializable {

    @stub
    // Constructs and initializes a Line with coordinates (0, 0) → (0, 0).
    def Float() = ???

    @stub
    // Constructs and initializes a Line from the specified coordinates.
    def Float(x1: float, y1: float, x2: float, y2: float) = ???

    @stub
    // The X coordinate of the start point of the line segment.
    def x1: float = ???

    @stub
    // The X coordinate of the end point of the line segment.
    def x2: float = ???

    @stub
    // The Y coordinate of the start point of the line segment.
    def y1: float = ???

    @stub
    // Returns a high precision and more accurate bounding box of
    // the Shape than the getBounds method.
    def getBounds2D(): Rectangle2D = ???

    @stub
    // Returns the start Point2D of this Line2D.
    def getP1(): Point2D = ???

    @stub
    // Returns the end Point2D of this Line2D.
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
    // Sets the location of the end points of this Line2D to
    // the specified double coordinates.
    def setLine(x1: double, y1: double, x2: double, y2: double): Unit = ???
}
