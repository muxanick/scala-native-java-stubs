package java.awt.geom

import java.lang.Object

/** The Ellipse2D class describes an ellipse that is defined
 *  by a framing rectangle.
 *  
 *  This class is only the abstract superclass for all objects which
 *  store a 2D ellipse.
 *  The actual storage representation of the coordinates is left to
 *  the subclass.
 */
abstract class Ellipse2D extends RectangularShape {

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
     *  equal to this Ellipse2D.
     */
    def equals(obj: Object): Boolean

    /** Returns an iteration object that defines the boundary of this
     *  Ellipse2D.
     */
    def getPathIterator(at: AffineTransform): PathIterator

    /** Returns the hashcode for this Ellipse2D. */
    def hashCode(): Int
}

object Ellipse2D {
    /** The Double class defines an ellipse specified
     *  in double precision.
     */
    @stub
    object Double extends Ellipse2D.Double
}
