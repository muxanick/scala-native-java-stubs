package java.awt.geom

import scala.scalanative.annotation.stub

/** The PathIterator interface provides the mechanism
 *  for objects that implement the Shape
 *  interface to return the geometry of their boundary by allowing
 *  a caller to retrieve the path of that boundary a segment at a
 *  time.  This interface allows these objects to retrieve the path of
 *  their boundary a segment at a time by using 1st through 3rd order
 *  Bézier curves, which are lines and quadratic or cubic
 *  Bézier splines.
 *  
 *  Multiple subpaths can be expressed by using a "MOVETO" segment to
 *  create a discontinuity in the geometry to move from the end of
 *  one subpath to the beginning of the next.
 *  
 *  Each subpath can be closed manually by ending the last segment in
 *  the subpath on the same coordinate as the beginning "MOVETO" segment
 *  for that subpath or by using a "CLOSE" segment to append a line
 *  segment from the last point back to the first.
 *  Be aware that manually closing an outline as opposed to using a
 *  "CLOSE" segment to close the path might result in different line
 *  style decorations being used at the end points of the subpath.
 *  For example, the BasicStroke object
 *  uses a line "JOIN" decoration to connect the first and last points
 *  if a "CLOSE" segment is encountered, whereas simply ending the path
 *  on the same coordinate as the beginning coordinate results in line
 *  "CAP" decorations being used at the ends.
 */
trait PathIterator {

    /** Returns the coordinates and type of the current path segment in
     *  the iteration.
     */
    @stub
    def currentSegment(coords: Array[Double]): Int = ???

    /** Returns the coordinates and type of the current path segment in
     *  the iteration.
     */
    @stub
    def currentSegment(coords: Array[Float]): Int = ???

    /** Returns the winding rule for determining the interior of the
     *  path.
     */
    @stub
    def getWindingRule(): Int = ???

    /** Tests if the iteration is complete. */
    @stub
    def isDone(): Boolean = ???

    /** Moves the iterator to the next segment of the path forwards
     *  along the primary direction of traversal as long as there are
     *  more points in that direction.
     */
    @stub
    def next(): Unit = ???
}

object PathIterator {
    /** The segment type constant that specifies that
     *  the preceding subpath should be closed by appending a line segment
     *  back to the point corresponding to the most recent SEG_MOVETO.
     */
    @stub
    val SEG_CLOSE: Int = ???

    /** The segment type constant for the set of 3 points that specify
     *  a cubic parametric curve to be drawn from the most recently
     *  specified point.
     */
    @stub
    val SEG_CUBICTO: Int = ???

    /** The segment type constant for a point that specifies the
     *  end point of a line to be drawn from the most recently
     *  specified point.
     */
    @stub
    val SEG_LINETO: Int = ???

    /** The segment type constant for a point that specifies the
     *  starting location for a new subpath.
     */
    @stub
    val SEG_MOVETO: Int = ???

    /** The segment type constant for the pair of points that specify
     *  a quadratic parametric curve to be drawn from the most recently
     *  specified point.
     */
    @stub
    val SEG_QUADTO: Int = ???

    /** The winding rule constant for specifying an even-odd rule
     *  for determining the interior of a path.
     */
    @stub
    val WIND_EVEN_ODD: Int = ???

    /** The winding rule constant for specifying a non-zero rule
     *  for determining the interior of a path.
     */
    @stub
    val WIND_NON_ZERO: Int = ???
}
