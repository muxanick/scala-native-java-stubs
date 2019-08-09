package javax.swing

import java.awt.Component
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A Constraints object holds the
 *  constraints that govern the way a component's size and position
 *  change in a container controlled by a SpringLayout.
 *  A Constraints object is
 *  like a Rectangle, in that it
 *  has x, y,
 *  width, and height properties.
 *  In the Constraints object, however,
 *  these properties have
 *  Spring values instead of integers.
 *  In addition,
 *  a Constraints object
 *  can be manipulated as four edges
 *  -- north, south, east, and west --
 *  using the constraint property.
 * 
 *  
 *  The following formulas are always true
 *  for a Constraints object (here WEST and x are synonyms, as are and NORTH and y):
 * 
 *  
 *                EAST = WEST + WIDTH
 *               SOUTH = NORTH + HEIGHT
 *   HORIZONTAL_CENTER = WEST + WIDTH/2
 *     VERTICAL_CENTER = NORTH + HEIGHT/2
 *   ABSOLUTE_BASELINE = NORTH + RELATIVE_BASELINE*
 *  
 *  
 *  For example, if you have specified the WIDTH and WEST (X) location
 *  the EAST is calculated as WEST + WIDTH.  If you instead specified
 *  the WIDTH and EAST locations the WEST (X) location is then calculated
 *  as EAST - WIDTH.
 *  
 *  [RELATIVE_BASELINE is a private constraint that is set automatically when
 *  the SpringLayout.Constraints(Component) constructor is called or when
 *  a constraints object is registered with a SpringLayout object.]
 *  
 *  Note: In this document,
 *  operators represent methods
 *  in the Spring class.
 *  For example, "a + b" is equal to
 *  Spring.sum(a, b),
 *  and "a - b" is equal to
 *  Spring.sum(a, Spring.minus(b)).
 *  See the
 *  Spring API documentation
 *  for further details
 *  of spring arithmetic.
 * 
 *  
 * 
 *  Because a Constraints object's properties --
 *  representing its edges, size, and location -- can all be set
 *  independently and yet are interrelated,
 *  a Constraints object can become over-constrained.
 *  For example, if the WEST, WIDTH and
 *  EAST edges are all set, steps must be taken to ensure that
 *  the first of the formulas above holds.  To do this, the
 *  Constraints
 *  object throws away the least recently set
 *  constraint so as to make the formulas hold.
 */
object SpringLayout.Constraints extends Object {

    /** Creates an empty Constraints object. */
    @stub
    def Constraints() = ???

    /** Creates a Constraints object with
     *  suitable x, y, width and
     *  height springs for component, c.
     */
    @stub
    def Constraints(c: Component) = ???

    /** Creates a Constraints object with the
     *  specified values for its
     *  x and y properties.
     */
    @stub
    def Constraints(x: Spring, y: Spring) = ???

    /** Creates a Constraints object with the
     *  specified values for its
     *  x, y, width,
     *  and height properties.
     */
    @stub
    def Constraints(x: Spring, y: Spring, width: Spring, height: Spring) = ???

    /** Returns the value of the specified edge, which may be
     *  a derived value, or even null.
     */
    @stub
    def getConstraint(edgeName: String): Spring = ???

    /** Returns the value of the height property. */
    @stub
    def getHeight(): Spring = ???

    /** Returns the value of the width property. */
    @stub
    def getWidth(): Spring = ???

    /** Returns the value of the x property. */
    @stub
    def getX(): Spring = ???

    /** Returns the value of the y property. */
    @stub
    def getY(): Spring = ???

    /** Sets the spring controlling the specified edge. */
    @stub
    def setConstraint(edgeName: String, s: Spring): Unit = ???

    /** Sets the height property,
     *  which controls the height of a component.
     */
    @stub
    def setHeight(height: Spring): Unit = ???

    /** Sets the width property,
     *  which controls the width of a component.
     */
    @stub
    def setWidth(width: Spring): Unit = ???

    /** Sets the x property,
     *  which controls the x value
     *  of a component's location.
     */
    @stub
    def setX(x: Spring): Unit = ???

    /** Sets the y property,
     *  which controls the y value
     *  of a component's location.
     */
    @stub
    def setY(y: Spring): Unit = ???
}
