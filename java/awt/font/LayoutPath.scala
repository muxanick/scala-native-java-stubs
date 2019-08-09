package java.awt.font

import java.awt.geom.Point2D
import java.lang.Object
import scala.scalanative.annotation.stub

/** LayoutPath provides a mapping between locations relative to the
 *  baseline and points in user space.  Locations consist of an advance
 *  along the baseline, and an offset perpendicular to the baseline at
 *  the advance.  Positive values along the perpendicular are in the
 *  direction that is 90 degrees clockwise from the baseline vector.
 *  Locations are represented as a Point2D, where x is the advance and
 *  y is the offset.
 */
abstract class LayoutPath extends Object {

    /**  */
    @stub
    def this() = ???

    /** Convert a location relative to the path to a point in user
     *  coordinates.
     */
    def pathToPoint(location: Point2D, preceding: Boolean, point: Point2D): Unit

    /** Convert a point in user space to a location relative to the
     *  path.
     */
    def pointToPath(point: Point2D, location: Point2D): Boolean
}
