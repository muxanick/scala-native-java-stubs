package javax.swing.plaf.basic

import java.awt.{Color, Dimension, Graphics}
import java.lang.Object
import javax.swing.{JComponent, JSeparator}
import javax.swing.plaf.{ComponentUI, SeparatorUI}
import scala.scalanative.annotation.stub

/** A Basic L&F implementation of SeparatorUI.  This implementation
 *  is a "combined" view/controller.
 */
class BasicSeparatorUI extends SeparatorUI {

    /**  */
    @stub
    def this() = ???

    /**  */
    @stub
    protected val highlight: Color = ???

    /**  */
    @stub
    protected val shadow: Color = ???

    /** Returns the specified component's maximum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMaximumSize(c: JComponent): Dimension = ???

    /** Returns the specified component's minimum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMinimumSize(c: JComponent): Dimension = ???

    /** Returns the specified component's preferred size appropriate for
     *  the look and feel.
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /**  */
    @stub
    protected def installDefaults(s: JSeparator): Unit = ???

    /**  */
    @stub
    protected def installListeners(s: JSeparator): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Paints the specified component appropriately for the look and feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(s: JSeparator): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(s: JSeparator): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???
}

object BasicSeparatorUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
