package javax.swing.border

import java.awt.{Component, Component.BaselineResizeBehavior, Insets, Rectangle}
import java.io.Serializable
import java.lang.Object

/** A class that implements an empty border with no size.
 *  This provides a convenient base class from which other border
 *  classes can be easily derived.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
abstract class AbstractBorder extends Object with Border with Serializable {

    /** Returns the baseline. */
    def getBaseline(c: Component, width: Int, height: Int): Int

    /** Returns an enum indicating how the baseline of a component
     *  changes as the size changes.
     */
    def getBaselineResizeBehavior(c: Component): Component.BaselineResizeBehavior

    /** This default implementation returns a new Insets object
     *  that is initialized by the getBorderInsets(Component,Insets)
     *  method.
     */
    def getBorderInsets(c: Component): Insets

    /** Reinitializes the insets parameter with this Border's current Insets. */
    def getBorderInsets(c: Component, insets: Insets): Insets

    /** This convenience method calls the static method. */
    def getInteriorRectangle(c: Component, x: Int, y: Int, width: Int, height: Int): Rectangle

    /** This default implementation returns false. */
    def isBorderOpaque(): Boolean
}

object AbstractBorder {
    /** Returns a rectangle using the arguments minus the
     *  insets of the border.
     */
    @stub
    def getInteriorRectangle(c: Component, b: Border, x: Int, y: Int, width: Int, height: Int): Rectangle = ???
}
