package java.awt

import java.awt.geom.{Rectangle2D, RectangularShape}
import java.io.Serializable
import java.lang.{Object, String}

// A Rectangle specifies an area in a coordinate space that is
// enclosed by the Rectangle object's upper-left point
// (x,y)
// in the coordinate space, its width, and its height.
// 
// A Rectangle object's width and
// height are public fields. The constructors
// that create a Rectangle, and the methods that can modify
// one, do not prevent setting a negative value for width or height.
// 
// 
// A Rectangle whose width or height is exactly zero has location
// along those axes with zero dimension, but is otherwise considered empty.
// The isEmpty() method will return true for such a Rectangle.
// Methods which test if an empty Rectangle contains or intersects
// a point or rectangle will always return false if either dimension is zero.
// Methods which combine such a Rectangle with a point or rectangle
// will include the location of the Rectangle on that axis in the
// result as if the add(Point) method were being called.
// 
// 
// 
// A Rectangle whose width or height is negative has neither
// location nor dimension along those axes with negative dimensions.
// Such a Rectangle is treated as non-existant along those axes.
// Such a Rectangle is also empty with respect to containment
// calculations and methods which test if it contains or intersects a
// point or rectangle will always return false.
// Methods which combine such a Rectangle with a point or rectangle
// will ignore the Rectangle entirely in generating the result.
// If two Rectangle objects are combined and each has a negative
// dimension, the result will have at least one negative dimension.
// 
// 
// Methods which affect only the location of a Rectangle will
// operate on its location regardless of whether or not it has a negative
// or zero dimension along either axis.
// 
// Note that a Rectangle constructed with the default no-argument
// constructor will have dimensions of 0x0 and therefore be empty.
// That Rectangle will still have a location of (0,0) and
// will contribute that location to the union and add operations.
// Code attempting to accumulate the bounds of a set of points should
// therefore initially construct the Rectangle with a specifically
// negative width and height or it should use the first point in the set
// to construct the Rectangle.
// For example:
// 
//     Rectangle bounds = new Rectangle(0, 0, -1, -1);
//     for (int i = 0; i < points.length; i++) {
//         bounds.add(points[i]);
//     }
// 
// or if we know that the points array contains at least one point:
// 
//     Rectangle bounds = new Rectangle(points[0]);
//     for (int i = 1; i < points.length; i++) {
//         bounds.add(points[i]);
//     }
// 
// 
// This class uses 32-bit integers to store its location and dimensions.
// Frequently operations may produce a result that exceeds the range of
// a 32-bit integer.
// The methods will calculate their results in a way that avoids any
// 32-bit overflow for intermediate results and then choose the best
// representation to store the final results back into the 32-bit fields
// which hold the location and dimensions.
// The location of the result will be stored into the x and
// y fields by clipping the true result to the nearest 32-bit value.
// The values stored into the width and height dimension
// fields will be chosen as the 32-bit values that encompass the largest
// part of the true result as possible.
// Generally this means that the dimension will be clipped independently
// to the range of 32-bit integers except that if the location had to be
// moved to store it into its pair of 32-bit fields then the dimensions
// will be adjusted relative to the "best representation" of the location.
// If the true result had a negative dimension and was therefore
// non-existant along one or both axes, the stored dimensions will be
// negative numbers in those axes.
// If the true result had a location that could be represented within
// the range of 32-bit integers, but zero dimension along one or both
// axes, then the stored dimensions will be zero in those axes.
class Rectangle extends Rectangle2D with Shape, with Serializable {

    @stub
    // Constructs a new Rectangle whose upper-left corner
    // is at (0, 0) in the coordinate space, and whose width and
    // height are both zero.
    def this() = ???

    @stub
    // Constructs a new Rectangle whose top left corner is
    // (0, 0) and whose width and height are specified
    // by the Dimension argument.
    def this(d: Dimension) = ???

    @stub
    // Constructs a new Rectangle whose upper-left corner
    // is at (0, 0) in the coordinate space, and whose width and
    // height are specified by the arguments of the same name.
    def this(width: Int, height: Int) = ???

    @stub
    // Constructs a new Rectangle whose upper-left corner is
    // specified as
    // (x,y) and whose width and height
    // are specified by the arguments of the same name.
    def this(x: Int, y: Int, width: Int, height: Int) = ???

    @stub
    // Constructs a new Rectangle whose upper-left corner is the
    // specified Point, and whose width and height are both zero.
    def this(p: Point) = ???

    @stub
    // Constructs a new Rectangle whose upper-left corner is
    // specified by the Point argument, and
    // whose width and height are specified by the
    // Dimension argument.
    def this(p: Point, d: Dimension) = ???

    @stub
    // The height of the Rectangle.
    def height: Int = ???

    @stub
    // The width of the Rectangle.
    def width: Int = ???

    @stub
    // The X coordinate of the upper-left corner of the Rectangle.
    def x: Int = ???

    @stub
    // Adds a point, specified by the integer arguments newx,newy
    // to the bounds of this Rectangle.
    def add(newx: Int, newy: Int): Unit = ???

    @stub
    // Adds the specified Point to the bounds of this
    // Rectangle.
    def add(pt: Point): Unit = ???

    @stub
    // Adds a Rectangle to this Rectangle.
    def add(r: Rectangle): Unit = ???

    @stub
    // Checks whether or not this Rectangle contains the
    // point at the specified location (x,y).
    def contains(x: Int, y: Int): Boolean = ???

    @stub
    // Checks whether this Rectangle entirely contains
    // the Rectangle
    // at the specified location (X,Y) with the
    // specified dimensions (W,H).
    def contains(X: Int, Y: Int, W: Int, H: Int): Boolean = ???

    @stub
    // Checks whether or not this Rectangle contains the
    // specified Point.
    def contains(p: Point): Boolean = ???

    @stub
    // Checks whether or not this Rectangle entirely contains
    // the specified Rectangle.
    def contains(r: Rectangle): Boolean = ???

    @stub
    // Returns a new Rectangle2D object representing the
    // intersection of this Rectangle2D with the specified
    // Rectangle2D.
    def createIntersection(r: Rectangle2D): Rectangle2D = ???

    @stub
    // Returns a new Rectangle2D object representing the
    // union of this Rectangle2D with the specified
    // Rectangle2D.
    def createUnion(r: Rectangle2D): Rectangle2D = ???

    @stub
    // Checks whether two rectangles are equal.
    def equals(obj: Object): Boolean = ???

    @stub
    // Gets the bounding Rectangle of this Rectangle.
    def getBounds(): Rectangle = ???

    @stub
    // Returns a high precision and more accurate bounding box of
    // the Shape than the getBounds method.
    def getBounds2D(): Rectangle2D = ???

    @stub
    // Returns the height of the bounding Rectangle in
    // double precision.
    def getHeight(): double = ???

    @stub
    // Returns the location of this Rectangle.
    def getLocation(): Point = ???

    @stub
    // Gets the size of this Rectangle, represented by
    // the returned Dimension.
    def getSize(): Dimension = ???

    @stub
    // Returns the width of the bounding Rectangle in
    // double precision.
    def getWidth(): double = ???

    @stub
    // Returns the X coordinate of the bounding Rectangle in
    // double precision.
    def getX(): double = ???

    @stub
    // Returns the Y coordinate of the bounding Rectangle in
    // double precision.
    def getY(): double = ???

    @stub
    // Resizes the Rectangle both horizontally and vertically.
    def grow(h: Int, v: Int): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by contains(int, int).
    //
    def inside(X: Int, Y: Int): Boolean = ???

    @stub
    // Computes the intersection of this Rectangle with the
    // specified Rectangle.
    def intersection(r: Rectangle): Rectangle = ???

    @stub
    // Determines whether or not this Rectangle and the specified
    // Rectangle intersect.
    def intersects(r: Rectangle): Boolean = ???

    @stub
    // Determines whether the RectangularShape is empty.
    def isEmpty(): Boolean = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by setLocation(int, int).
    //
    def move(x: Int, y: Int): Unit = ???

    @stub
    // Determines where the specified coordinates lie with respect
    // to this Rectangle2D.
    def outcode(x: double, y: double): Int = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by setBounds(int, int, int, int).
    //
    def reshape(x: Int, y: Int, width: Int, height: Int): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by setSize(int, int).
    //
    def resize(width: Int, height: Int): Unit = ???

    @stub
    // Sets the bounding Rectangle of this
    // Rectangle to the specified
    // x, y, width,
    // and height.
    def setBounds(x: Int, y: Int, width: Int, height: Int): Unit = ???

    @stub
    // Sets the bounding Rectangle of this Rectangle
    // to match the specified Rectangle.
    def setBounds(r: Rectangle): Unit = ???

    @stub
    // Moves this Rectangle to the specified location.
    def setLocation(x: Int, y: Int): Unit = ???

    @stub
    // Moves this Rectangle to the specified location.
    def setLocation(p: Point): Unit = ???

    @stub
    // Sets the bounds of this Rectangle to the integer bounds
    // which encompass the specified x, y, width,
    // and height.
    def setRect(x: double, y: double, width: double, height: double): Unit = ???

    @stub
    // Sets the size of this Rectangle to match the
    // specified Dimension.
    def setSize(d: Dimension): Unit = ???

    @stub
    // Sets the size of this Rectangle to the specified
    // width and height.
    def setSize(width: Int, height: Int): Unit = ???

    @stub
    // Returns a String representing this
    // Rectangle and its values.
    def toString(): String = ???

    @stub
    // Translates this Rectangle the indicated distance,
    // to the right along the X coordinate axis, and
    // downward along the Y coordinate axis.
    def translate(dx: Int, dy: Int): Unit = ???
}
