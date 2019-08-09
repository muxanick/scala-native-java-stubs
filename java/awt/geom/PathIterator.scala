package java.awt.geom

// The PathIterator interface provides the mechanism
// for objects that implement the Shape
// interface to return the geometry of their boundary by allowing
// a caller to retrieve the path of that boundary a segment at a
// time.  This interface allows these objects to retrieve the path of
// their boundary a segment at a time by using 1st through 3rd order
// Bézier curves, which are lines and quadratic or cubic
// Bézier splines.
// 
// Multiple subpaths can be expressed by using a "MOVETO" segment to
// create a discontinuity in the geometry to move from the end of
// one subpath to the beginning of the next.
// 
// Each subpath can be closed manually by ending the last segment in
// the subpath on the same coordinate as the beginning "MOVETO" segment
// for that subpath or by using a "CLOSE" segment to append a line
// segment from the last point back to the first.
// Be aware that manually closing an outline as opposed to using a
// "CLOSE" segment to close the path might result in different line
// style decorations being used at the end points of the subpath.
// For example, the BasicStroke object
// uses a line "JOIN" decoration to connect the first and last points
// if a "CLOSE" segment is encountered, whereas simply ending the path
// on the same coordinate as the beginning coordinate results in line
// "CAP" decorations being used at the ends.
trait PathIterator {

    @stub
    // Returns the coordinates and type of the current path segment in
    // the iteration.
    def currentSegment(coords: Array[double]): Int = ???

    @stub
    // Returns the coordinates and type of the current path segment in
    // the iteration.
    def currentSegment(coords: Array[float]): Int = ???

    @stub
    // Returns the winding rule for determining the interior of the
    // path.
    def getWindingRule(): Int = ???

    @stub
    // Tests if the iteration is complete.
    def isDone(): Boolean = ???
}

object PathIterator {
    @stub
    // The segment type constant that specifies that
    // the preceding subpath should be closed by appending a line segment
    // back to the point corresponding to the most recent SEG_MOVETO.
    def SEG_CLOSE: Int = ???

    @stub
    // The segment type constant for the set of 3 points that specify
    // a cubic parametric curve to be drawn from the most recently
    // specified point.
    def SEG_CUBICTO: Int = ???

    @stub
    // The segment type constant for a point that specifies the
    // end point of a line to be drawn from the most recently
    // specified point.
    def SEG_LINETO: Int = ???

    @stub
    // The segment type constant for a point that specifies the
    // starting location for a new subpath.
    def SEG_MOVETO: Int = ???

    @stub
    // The segment type constant for the pair of points that specify
    // a quadratic parametric curve to be drawn from the most recently
    // specified point.
    def SEG_QUADTO: Int = ???

    @stub
    // The winding rule constant for specifying an even-odd rule
    // for determining the interior of a path.
    def WIND_EVEN_ODD: Int = ???
}
