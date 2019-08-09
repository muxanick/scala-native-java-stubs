package java.awt.geom

import java.lang.Object

/** The GeneralPath class represents a geometric path
 *  constructed from straight lines, and quadratic and cubic
 *  (Bézier) curves.  It can contain multiple subpaths.
 *  
 *  GeneralPath is a legacy final class which exactly
 *  implements the behavior of its superclass Path2D.Float.
 *  Together with Path2D.Double, the Path2D classes
 *  provide full implementations of a general geometric path that
 *  support all of the functionality of the Shape and
 *  PathIterator interfaces with the ability to explicitly
 *  select different levels of internal coordinate precision.
 *  
 *  Use Path2D.Float (or this legacy GeneralPath
 *  subclass) when dealing with data that can be represented
 *  and used with floating point precision.  Use Path2D.Double
 *  for data that requires the accuracy or range of double precision.
 */
final class GeneralPath extends Path2D.Float {

    /** Constructs a new empty single precision GeneralPath object
     *  with a default winding rule of Path2D.WIND_NON_ZERO.
     */
    @stub
    def this() = ???

    /** Constructs a new GeneralPath object with the specified
     *  winding rule to control operations that require the interior of the
     *  path to be defined.
     */
    @stub
    def this(rule: Int) = ???

    /** Constructs a new GeneralPath object with the specified
     *  winding rule and the specified initial capacity to store path
     *  coordinates.
     */
    @stub
    def this(rule: Int, initialCapacity: Int) = ???
}
