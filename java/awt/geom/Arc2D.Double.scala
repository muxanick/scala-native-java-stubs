package java.awt.geom

import java.io.Serializable
import java.lang.Object

// This class defines an arc specified in double precision.
object Arc2D.Double extends Arc2D with Serializable {

    @stub
    // Constructs a new OPEN arc, initialized to location (0, 0),
    // size (0, 0), angular extents (start = 0, extent = 0).
    def Double() = ???

    @stub
    // Constructs a new arc, initialized to the specified location,
    // size, angular extents, and closure type.
    def Double(x: double, y: double, w: double, h: double, start: double, extent: double, type: Int) = ???

    @stub
    // Constructs a new arc, initialized to location (0, 0),
    // size (0, 0), angular extents (start = 0, extent = 0), and
    // the specified closure type.
    def Double(type: Int) = ???

    @stub
    // The angular extent of the arc in degrees.
    def extent: double = ???

    @stub
    // The overall height of the full ellipse of which this arc is
    // a partial section (not considering the angular extents).
    def height: double = ???

    @stub
    // The starting angle of the arc in degrees.
    def start: double = ???

    @stub
    // The overall width of the full ellipse of which this arc is
    // a partial section (not considering the angular extents).
    def width: double = ???

    @stub
    // The X coordinate of the upper-left corner of the framing
    // rectangle of the arc.
    def x: double = ???

    @stub
    // Returns the angular extent of the arc.
    def getAngleExtent(): double = ???

    @stub
    // Returns the starting angle of the arc.
    def getAngleStart(): double = ???

    @stub
    // Returns the height of the framing rectangle
    // in double precision.
    def getHeight(): double = ???

    @stub
    // Returns the width of the framing rectangle in
    // double precision.
    def getWidth(): double = ???

    @stub
    // Returns the X coordinate of the upper-left corner of
    // the framing rectangle in double precision.
    def getX(): double = ???

    @stub
    // Returns the Y coordinate of the upper-left corner of
    // the framing rectangle in double precision.
    def getY(): double = ???

    @stub
    // Determines whether the RectangularShape is empty.
    def isEmpty(): Boolean = ???

    @stub
    // Constructs a Rectangle2D of the appropriate precision
    // to hold the parameters calculated to be the framing rectangle
    // of this arc.
    protected def makeBounds(x: double, y: double, w: double, h: double): Rectangle2D = ???

    @stub
    // Sets the angular extent of this arc to the specified double
    // value.
    def setAngleExtent(angExt: double): Unit = ???

    @stub
    // Sets the starting angle of this arc to the specified double
    // value.
    def setAngleStart(angSt: double): Unit = ???
}
