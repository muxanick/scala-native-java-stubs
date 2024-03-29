package java.awt.geom

import java.lang.Object
import scala.scalanative.annotation.stub

/** The FlatteningPathIterator class returns a flattened view of
 *  another PathIterator object.  Other Shape
 *  classes can use this class to provide flattening behavior for their paths
 *  without having to perform the interpolation calculations themselves.
 */
class FlatteningPathIterator extends Object with PathIterator {

    /** Constructs a new FlatteningPathIterator object that
     *  flattens a path as it iterates over it.
     */
    @stub
    def this(src: PathIterator, flatness: Double) = ???

    /** Constructs a new FlatteningPathIterator object
     *  that flattens a path as it iterates over it.
     */
    @stub
    def this(src: PathIterator, flatness: Double, limit: Int) = ???

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

    /** Returns the flatness of this iterator. */
    @stub
    def getFlatness(): Double = ???

    /** Returns the recursion limit of this iterator. */
    @stub
    def getRecursionLimit(): Int = ???

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
