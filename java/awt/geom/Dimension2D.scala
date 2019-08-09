package java.awt.geom

import java.lang.{Cloneable, Object}
import scala.scalanative.annotation.stub

/** The Dimension2D class is to encapsulate a width
 *  and a height dimension.
 *  
 *  This class is only the abstract superclass for all objects that
 *  store a 2D dimension.
 *  The actual storage representation of the sizes is left to
 *  the subclass.
 */
abstract class Dimension2D extends Object with Cloneable {

    /** This is an abstract class that cannot be instantiated directly. */
    @stub
    protected def this() = ???

    /** Creates a new object of the same class as this object. */
    def clone(): Object

    /** Returns the height of this Dimension in double
     *  precision.
     */
    def getHeight(): Double

    /** Returns the width of this Dimension in double
     *  precision.
     */
    def getWidth(): Double

    /** Sets the size of this Dimension2D object to
     *  match the specified size.
     */
    def setSize(d: Dimension2D): Unit

    /** Sets the size of this Dimension object to the
     *  specified width and height.
     */
    def setSize(width: Double, height: Double): Unit
}
