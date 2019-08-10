package java.awt.geom

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** This class defines an arc specified in float precision. */
object Arc2D_Float extends Arc2D with Serializable {

    /** Constructs a new OPEN arc, initialized to location (0, 0),
     *  size (0, 0), angular extents (start = 0, extent = 0).
     */
    @stub
    def Float() = ???

    /** Constructs a new arc, initialized to the specified location,
     *  size, angular extents, and closure type.
     */
    @stub
    def Float(x: Float, y: Float, w: Float, h: Float, start: Float, extent: Float, type: Int) = ???

    /** Constructs a new arc, initialized to location (0, 0),
     *  size (0, 0), angular extents (start = 0, extent = 0), and
     *  the specified closure type.
     */
    @stub
    def Float(type: Int) = ???

    /** Constructs a new arc, initialized to the specified location,
     *  size, angular extents, and closure type.
     */
    @stub
    def Float(ellipseBounds: Rectangle2D, start: Float, extent: Float, type: Int) = ???

    /** The angular extent of the arc in degrees. */
    @stub
    val extent: Float = ???

    /** The overall height of the full ellipse of which this arc is
     *  a partial section (not considering the
     *  angular extents).
     */
    @stub
    val height: Float = ???

    /** The starting angle of the arc in degrees. */
    @stub
    val start: Float = ???

    /** The overall width of the full ellipse of which this arc is
     *  a partial section (not considering the
     *  angular extents).
     */
    @stub
    val width: Float = ???

    /** The X coordinate of the upper-left corner of the framing
     *  rectangle of the arc.
     */
    @stub
    val x: Float = ???

    /** The Y coordinate of the upper-left corner of the framing
     *  rectangle of the arc.
     */
    @stub
    val y: Float = ???

    /** Returns the angular extent of the arc. */
    @stub
    def getAngleExtent(): Double = ???

    /** Returns the starting angle of the arc. */
    @stub
    def getAngleStart(): Double = ???

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

    /** Constructs a Rectangle2D of the appropriate precision
     *  to hold the parameters calculated to be the framing rectangle
     *  of this arc.
     */
    @stub
    protected def makeBounds(x: Double, y: Double, w: Double, h: Double): Rectangle2D = ???

    /** Sets the angular extent of this arc to the specified double
     *  value.
     */
    @stub
    def setAngleExtent(angExt: Double): Unit = ???

    /** Sets the starting angle of this arc to the specified double
     *  value.
     */
    @stub
    def setAngleStart(angSt: Double): Unit = ???

    /** Sets the location, size, angular extents, and closure type of
     *  this arc to the specified double values.
     */
    @stub
    def setArc(x: Double, y: Double, w: Double, h: Double, angSt: Double, angExt: Double, closure: Int): Unit = ???
}
