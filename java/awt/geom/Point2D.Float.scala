package java.awt.geom

import java.io.Serializable
import java.lang.Object

/** The Float class defines a point specified in float
 *  precision.
 */
object Point2D.Float extends Point2D with Serializable {

    /** Constructs and initializes a Point2D with
     *  coordinates (0, 0).
     */
    @stub
    def Float() = ???

    /** The X coordinate of this Point2D. */
    @stub
    val x: Float = ???

    /** Returns the X coordinate of this Point2D in
     *  double precision.
     */
    @stub
    def getX(): Double = ???

    /** Returns the Y coordinate of this Point2D in
     *  double precision.
     */
    @stub
    def getY(): Double = ???

    /** Sets the location of this Point2D to the
     *  specified double coordinates.
     */
    @stub
    def setLocation(x: Double, y: Double): Unit = ???

    /** Sets the location of this Point2D to the
     *  specified float coordinates.
     */
    @stub
    def setLocation(x: Float, y: Float): Unit = ???
}
