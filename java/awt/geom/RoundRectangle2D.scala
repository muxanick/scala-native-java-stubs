package java.awt.geom

import java.lang.Object
import scala.scalanative.annotation.stub

/** The RoundRectangle2D class defines a rectangle with
 *  rounded corners defined by a location (x,y), a
 *  dimension (w x h), and the width and height of an arc
 *  with which to round the corners.
 *  
 *  This class is the abstract superclass for all objects that
 *  store a 2D rounded rectangle.
 *  The actual storage representation of the coordinates is left to
 *  the subclass.
 */
abstract class RoundRectangle2D extends RectangularShape {

    /** This is an abstract class that cannot be instantiated directly. */
    @stub
    protected def this() = ???

    /** Tests if the specified coordinates are inside the boundary of the
     *  Shape, as described by the
     *  
     *  definition of insideness.
     */
    def contains(x: Double, y: Double): Boolean

    /** Tests if the interior of the Shape entirely contains
     *  the specified rectangular area.
     */
    def contains(x: Double, y: Double, w: Double, h: Double): Boolean

    /** Determines whether or not the specified Object is
     *  equal to this RoundRectangle2D.
     */
    def equals(obj: Object): Boolean

    /** Gets the height of the arc that rounds off the corners. */
    def getArcHeight(): Double

    /** Gets the width of the arc that rounds off the corners. */
    def getArcWidth(): Double

    /** Returns an iteration object that defines the boundary of this
     *  RoundRectangle2D.
     */
    def getPathIterator(at: AffineTransform): PathIterator

    /** Returns the hashcode for this RoundRectangle2D. */
    def hashCode(): Int

    /** Tests if the interior of the Shape intersects the
     *  interior of a specified rectangular area.
     */
    def intersects(x: Double, y: Double, w: Double, h: Double): Boolean

    /** Sets the location and size of the framing rectangle of this
     *  Shape to the specified rectangular values.
     */
    def setFrame(x: Double, y: Double, w: Double, h: Double): Unit

    /** Sets the location, size, and corner radii of this
     *  RoundRectangle2D to the specified
     *  double values.
     */
    def setRoundRect(x: Double, y: Double, w: Double, h: Double, arcWidth: Double, arcHeight: Double): Unit

    /** Sets this RoundRectangle2D to be the same as the
     *  specified RoundRectangle2D.
     */
    def setRoundRect(rr: RoundRectangle2D): Unit
}

object RoundRectangle2D {
    /** The Double class defines a rectangle with rounded
     *  corners all specified in double coordinates.
     */
    @stub
    object Double extends RoundRectangle2D.Double

    /** The Float class defines a rectangle with rounded
     *  corners all specified in float coordinates.
     */
    @stub
    object Float extends RoundRectangle2D.Float
}
