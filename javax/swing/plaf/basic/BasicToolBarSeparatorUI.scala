package javax.swing.plaf.basic

import java.awt.{Dimension, Graphics}
import java.lang.Object
import javax.swing.{JComponent, JSeparator}
import javax.swing.plaf.{ComponentUI, SeparatorUI}
import scala.scalanative.annotation.stub

/** A Basic L&F implementation of ToolBarSeparatorUI.  This implementation
 *  is a "combined" view/controller.
 *  
 */
class BasicToolBarSeparatorUI extends BasicSeparatorUI {

    /**  */
    @stub
    def this() = ???

    /** Returns the specified component's preferred size appropriate for
     *  the look and feel.
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /**  */
    @stub
    protected def installDefaults(s: JSeparator): Unit = ???

    /** Paints the specified component appropriately for the look and feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???
}

object BasicToolBarSeparatorUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
