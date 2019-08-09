package java.awt.geom

import java.lang.Object

// The FlatteningPathIterator class returns a flattened view of
// another PathIterator object.  Other Shape
// classes can use this class to provide flattening behavior for their paths
// without having to perform the interpolation calculations themselves.
class FlatteningPathIterator extends Object with PathIterator {

    @stub
    // Constructs a new FlatteningPathIterator object that
    // flattens a path as it iterates over it.
    def this(src: PathIterator, flatness: double) = ???

    @stub
    // Returns the coordinates and type of the current path segment in
    // the iteration.
    def currentSegment(coords: Array[double]): Int = ???

    @stub
    // Returns the coordinates and type of the current path segment in
    // the iteration.
    def currentSegment(coords: Array[float]): Int = ???

    @stub
    // Returns the flatness of this iterator.
    def getFlatness(): double = ???

    @stub
    // Returns the recursion limit of this iterator.
    def getRecursionLimit(): Int = ???

    @stub
    // Returns the winding rule for determining the interior of the
    // path.
    def getWindingRule(): Int = ???

    @stub
    // Tests if the iteration is complete.
    def isDone(): Boolean = ???
}
