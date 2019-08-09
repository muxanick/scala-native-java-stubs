package javax.swing.border

import java.awt.{Component, Graphics, Insets}
import scala.scalanative.annotation.stub

/** Interface describing an object capable of rendering a border
 *  around the edges of a swing component.
 *  For examples of using borders see
 *  How to Use Borders,
 *  a section in The Java Tutorial.
 *  
 *  In the Swing component set, borders supercede Insets as the
 *  mechanism for creating a (decorated or plain) area around the
 *  edge of a component.
 *  
 *  Usage Notes:
 *  
 *  Use EmptyBorder to create a plain border (this mechanism
 *      replaces its predecessor, setInsets).
 *  Use CompoundBorder to nest multiple border objects, creating
 *      a single, combined border.
 *  Border instances are designed to be shared. Rather than creating
 *      a new border object using one of border classes, use the
 *      BorderFactory methods, which produces a shared instance of the
 *      common border types.
 *  Additional border styles include BevelBorder, SoftBevelBorder,
 *      EtchedBorder, LineBorder, TitledBorder, and MatteBorder.
 *  To create a new border class, subclass AbstractBorder.
 *  
 */
trait Border {

    /** Returns the insets of the border. */
    @stub
    def getBorderInsets(c: Component): Insets = ???

    /** Returns whether or not the border is opaque. */
    @stub
    def isBorderOpaque(): Boolean = ???

    /** Paints the border for the specified component with the specified
     *  position and size.
     */
    @stub
    def paintBorder(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???
}
