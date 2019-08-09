package java.awt

import java.awt.geom.{Rectangle2D, RectangularShape}
import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A Rectangle specifies an area in a coordinate space that is
 *  enclosed by the Rectangle object's upper-left point
 *  (x,y)
 *  in the coordinate space, its width, and its height.
 *  
 *  A Rectangle object's width and
 *  height are public fields. The constructors
 *  that create a Rectangle, and the methods that can modify
 *  one, do not prevent setting a negative value for width or height.
 *  
 *  
 *  A Rectangle whose width or height is exactly zero has location
 *  along those axes with zero dimension, but is otherwise considered empty.
 *  The isEmpty() method will return true for such a Rectangle.
 *  Methods which test if an empty Rectangle contains or intersects
 *  a point or rectangle will always return false if either dimension is zero.
 *  Methods which combine such a Rectangle with a point or rectangle
 *  will include the location of the Rectangle on that axis in the
 *  result as if the add(Point) method were being called.
 *  
 *  
 *  
 *  A Rectangle whose width or height is negative has neither
 *  location nor dimension along those axes with negative dimensions.
 *  Such a Rectangle is treated as non-existant along those axes.
 *  Such a Rectangle is also empty with respect to containment
 *  calculations and methods which test if it contains or intersects a
 *  point or rectangle will always return false.
 *  Methods which combine such a Rectangle with a point or rectangle
 *  will ignore the Rectangle entirely in generating the result.
 *  If two Rectangle objects are combined and each has a negative
 *  dimension, the result will have at least one negative dimension.
 *  
 *  
 *  Methods which affect only the location of a Rectangle will
 *  operate on its location regardless of whether or not it has a negative
 *  or zero dimension along either axis.
 *  
 *  Note that a Rectangle constructed with the default no-argument
 *  constructor will have dimensions of 0x0 and therefore be empty.
 *  That Rectangle will still have a location of (0,0) and
 *  will contribute that location to the union and add operations.
 *  Code attempting to accumulate the bounds of a set of points should
 *  therefore initially construct the Rectangle with a specifically
 *  negative width and height or it should use the first point in the set
 *  to construct the Rectangle.
 *  For example:
 *  
 *      Rectangle bounds = new Rectangle(0, 0, -1, -1);
 *      for (int i = 0; i < points.length; i++) {
 *          bounds.add(points[i]);
 *      }
 *  
 *  or if we know that the points array contains at least one point:
 *  
 *      Rectangle bounds = new Rectangle(points[0]);
 *      for (int i = 1; i < points.length; i++) {
 *          bounds.add(points[i]);
 *      }
 *  
 *  
 *  This class uses 32-bit integers to store its location and dimensions.
 *  Frequently operations may produce a result that exceeds the range of
 *  a 32-bit integer.
 *  The methods will calculate their results in a way that avoids any
 *  32-bit overflow for intermediate results and then choose the best
 *  representation to store the final results back into the 32-bit fields
 *  which hold the location and dimensions.
 *  The location of the result will be stored into the x and
 *  y fields by clipping the true result to the nearest 32-bit value.
 *  The values stored into the width and height dimension
 *  fields will be chosen as the 32-bit values that encompass the largest
 *  part of the true result as possible.
 *  Generally this means that the dimension will be clipped independently
 *  to the range of 32-bit integers except that if the location had to be
 *  moved to store it into its pair of 32-bit fields then the dimensions
 *  will be adjusted relative to the "best representation" of the location.
 *  If the true result had a negative dimension and was therefore
 *  non-existant along one or both axes, the stored dimensions will be
 *  negative numbers in those axes.
 *  If the true result had a location that could be represented within
 *  the range of 32-bit integers, but zero dimension along one or both
 *  axes, then the stored dimensions will be zero in those axes.
 */
class Rectangle extends Rectangle2D with Shape with Serializable {

    /** Constructs a new Rectangle whose upper-left corner
     *  is at (0, 0) in the coordinate space, and whose width and
     *  height are both zero.
     */
    @stub
    def this() = ???

    /** Constructs a new Rectangle whose top left corner is
     *  (0, 0) and whose width and height are specified
     *  by the Dimension argument.
     */
    @stub
    def this(d: Dimension) = ???

    /** Constructs a new Rectangle whose upper-left corner
     *  is at (0, 0) in the coordinate space, and whose width and
     *  height are specified by the arguments of the same name.
     */
    @stub
    def this(width: Int, height: Int) = ???

    /** Constructs a new Rectangle whose upper-left corner is
     *  specified as
     *  (x,y) and whose width and height
     *  are specified by the arguments of the same name.
     */
    @stub
    def this(x: Int, y: Int, width: Int, height: Int) = ???

    /** Constructs a new Rectangle whose upper-left corner is the
     *  specified Point, and whose width and height are both zero.
     */
    @stub
    def this(p: Point) = ???

    /** Constructs a new Rectangle whose upper-left corner is
     *  specified by the Point argument, and
     *  whose width and height are specified by the
     *  Dimension argument.
     */
    @stub
    def this(p: Point, d: Dimension) = ???

    /** Constructs a new Rectangle, initialized to match
     *  the values of the specified Rectangle.
     */
    @stub
    def this(r: Rectangle) = ???

    /** The height of the Rectangle. */
    @stub
    val height: Int = ???

    /** The width of the Rectangle. */
    @stub
    val width: Int = ???

    /** The X coordinate of the upper-left corner of the Rectangle. */
    @stub
    val x: Int = ???

    /** The Y coordinate of the upper-left corner of the Rectangle. */
    @stub
    val y: Int = ???

    /** Adds a point, specified by the integer arguments newx,newy
     *  to the bounds of this Rectangle.
     */
    @stub
    def add(newx: Int, newy: Int): Unit = ???

    /** Adds the specified Point to the bounds of this
     *  Rectangle.
     */
    @stub
    def add(pt: Point): Unit = ???

    /** Adds a Rectangle to this Rectangle. */
    @stub
    def add(r: Rectangle): Unit = ???

    /** Checks whether or not this Rectangle contains the
     *  point at the specified location (x,y).
     */
    @stub
    def contains(x: Int, y: Int): Boolean = ???

    /** Checks whether this Rectangle entirely contains
     *  the Rectangle
     *  at the specified location (X,Y) with the
     *  specified dimensions (W,H).
     */
    @stub
    def contains(X: Int, Y: Int, W: Int, H: Int): Boolean = ???

    /** Checks whether or not this Rectangle contains the
     *  specified Point.
     */
    @stub
    def contains(p: Point): Boolean = ???

    /** Checks whether or not this Rectangle entirely contains
     *  the specified Rectangle.
     */
    @stub
    def contains(r: Rectangle): Boolean = ???

    /** Returns a new Rectangle2D object representing the
     *  intersection of this Rectangle2D with the specified
     *  Rectangle2D.
     */
    @stub
    def createIntersection(r: Rectangle2D): Rectangle2D = ???

    /** Returns a new Rectangle2D object representing the
     *  union of this Rectangle2D with the specified
     *  Rectangle2D.
     */
    @stub
    def createUnion(r: Rectangle2D): Rectangle2D = ???

    /** Checks whether two rectangles are equal. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Gets the bounding Rectangle of this Rectangle. */
    @stub
    def getBounds(): Rectangle = ???

    /** Returns a high precision and more accurate bounding box of
     *  the Shape than the getBounds method.
     */
    @stub
    def getBounds2D(): Rectangle2D = ???

    /** Returns the height of the bounding Rectangle in
     *  double precision.
     */
    @stub
    def getHeight(): Double = ???

    /** Returns the location of this Rectangle. */
    @stub
    def getLocation(): Point = ???

    /** Gets the size of this Rectangle, represented by
     *  the returned Dimension.
     */
    @stub
    def getSize(): Dimension = ???

    /** Returns the width of the bounding Rectangle in
     *  double precision.
     */
    @stub
    def getWidth(): Double = ???

    /** Returns the X coordinate of the bounding Rectangle in
     *  double precision.
     */
    @stub
    def getX(): Double = ???

    /** Returns the Y coordinate of the bounding Rectangle in
     *  double precision.
     */
    @stub
    def getY(): Double = ???

    /** Resizes the Rectangle both horizontally and vertically. */
    @stub
    def grow(h: Int, v: Int): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by contains(int, int).
     * 
     */
    @stub
    def inside(X: Int, Y: Int): Boolean = ???

    /** Computes the intersection of this Rectangle with the
     *  specified Rectangle.
     */
    @stub
    def intersection(r: Rectangle): Rectangle = ???

    /** Determines whether or not this Rectangle and the specified
     *  Rectangle intersect.
     */
    @stub
    def intersects(r: Rectangle): Boolean = ???

    /** Determines whether the RectangularShape is empty. */
    @stub
    def isEmpty(): Boolean = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by setLocation(int, int).
     * 
     */
    @stub
    def move(x: Int, y: Int): Unit = ???

    /** Determines where the specified coordinates lie with respect
     *  to this Rectangle2D.
     */
    @stub
    def outcode(x: Double, y: Double): Int = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by setBounds(int, int, int, int).
     * 
     */
    @stub
    def reshape(x: Int, y: Int, width: Int, height: Int): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by setSize(int, int).
     * 
     */
    @stub
    def resize(width: Int, height: Int): Unit = ???

    /** Sets the bounding Rectangle of this
     *  Rectangle to the specified
     *  x, y, width,
     *  and height.
     */
    @stub
    def setBounds(x: Int, y: Int, width: Int, height: Int): Unit = ???

    /** Sets the bounding Rectangle of this Rectangle
     *  to match the specified Rectangle.
     */
    @stub
    def setBounds(r: Rectangle): Unit = ???

    /** Moves this Rectangle to the specified location. */
    @stub
    def setLocation(x: Int, y: Int): Unit = ???

    /** Moves this Rectangle to the specified location. */
    @stub
    def setLocation(p: Point): Unit = ???

    /** Sets the bounds of this Rectangle to the integer bounds
     *  which encompass the specified x, y, width,
     *  and height.
     */
    @stub
    def setRect(x: Double, y: Double, width: Double, height: Double): Unit = ???

    /** Sets the size of this Rectangle to match the
     *  specified Dimension.
     */
    @stub
    def setSize(d: Dimension): Unit = ???

    /** Sets the size of this Rectangle to the specified
     *  width and height.
     */
    @stub
    def setSize(width: Int, height: Int): Unit = ???

    /** Returns a String representing this
     *  Rectangle and its values.
     */
    @stub
    def toString(): String = ???

    /** Translates this Rectangle the indicated distance,
     *  to the right along the X coordinate axis, and
     *  downward along the Y coordinate axis.
     */
    @stub
    def translate(dx: Int, dy: Int): Unit = ???

    /** Computes the union of this Rectangle with the
     *  specified Rectangle.
     */
    @stub
    def union(r: Rectangle): Rectangle = ???
}
