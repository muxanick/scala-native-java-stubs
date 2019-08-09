package java.awt.geom

import java.io.Serializable
import java.lang.Object

/** A line segment specified with double coordinates. */
object Line2D.Double extends Line2D with Serializable {

    /** Constructs and initializes a Line with coordinates (0, 0) → (0, 0). */
    @stub
    def Double() = ???

    /** Constructs and initializes a Line2D from the
     *  specified coordinates.
     */
    @stub
    def Double(x1: Double, y1: Double, x2: Double, y2: Double) = ???

    /** The X coordinate of the start point of the line segment. */
    @stub
    val x1: Double = ???

    /** The X coordinate of the end point of the line segment. */
    @stub
    val x2: Double = ???

    /** The Y coordinate of the start point of the line segment. */
    @stub
    val y1: Double = ???

    /** Returns a high precision and more accurate bounding box of
     *  the Shape than the getBounds method.
     */
    @stub
    def getBounds2D(): Rectangle2D = ???

    /** Returns the start Point2D of this Line2D. */
    @stub
    def getP1(): Point2D = ???

    /** Returns the end Point2D of this Line2D. */
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
}
