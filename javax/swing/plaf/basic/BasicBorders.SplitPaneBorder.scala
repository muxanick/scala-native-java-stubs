package javax.swing.plaf.basic

import java.awt.{Color, Component, Graphics, Insets}
import java.lang.Object
import javax.swing.border.Border
import javax.swing.plaf.UIResource
import scala.scalanative.annotation.stub

/** Draws the border around the splitpane. To work correctly you should
 *  also install a border on the divider (property SplitPaneDivider.border).
 */
object BasicBorders.SplitPaneBorder extends Object with Border with UIResource {

    /**  */
    @stub
    def SplitPaneBorder(highlight: Color, shadow: Color) = ???

    /**  */
    @stub
    protected val highlight: Color = ???

    /**  */
    @stub
    protected val shadow: Color = ???

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
