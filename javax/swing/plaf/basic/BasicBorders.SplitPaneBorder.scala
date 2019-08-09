package javax.swing.plaf.basic

import java.awt.{Color, Component, Insets}
import java.lang.Object
import javax.swing.border.Border
import javax.swing.plaf.UIResource

/** Draws the border around the splitpane. To work correctly you should
 *  also install a border on the divider (property SplitPaneDivider.border).
 */
object BasicBorders.SplitPaneBorder extends Object with Border with UIResource {

    /**  */
    @stub
    protected val highlight: Color = ???

    /** Returns the insets of the border. */
    @stub
    def getBorderInsets(c: Component): Insets = ???

    /** Returns whether or not the border is opaque. */
    @stub
    def isBorderOpaque(): Boolean = ???
}
