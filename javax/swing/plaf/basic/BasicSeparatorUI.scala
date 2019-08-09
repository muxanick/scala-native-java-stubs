package javax.swing.plaf.basic

import java.awt.{Color, Dimension, Graphics}
import java.lang.Object
import javax.swing.{JComponent, JSeparator}
import javax.swing.plaf.{ComponentUI, SeparatorUI}

// A Basic L&F implementation of SeparatorUI.  This implementation
// is a "combined" view/controller.
class BasicSeparatorUI extends SeparatorUI {

    @stub
    // 
    protected def highlight: Color = ???

    @stub
    // Returns the specified component's maximum size appropriate for
    // the look and feel.
    def getMaximumSize(c: JComponent): Dimension = ???

    @stub
    // Returns the specified component's minimum size appropriate for
    // the look and feel.
    def getMinimumSize(c: JComponent): Dimension = ???

    @stub
    // Returns the specified component's preferred size appropriate for
    // the look and feel.
    def getPreferredSize(c: JComponent): Dimension = ???

    @stub
    // 
    protected def installDefaults(s: JSeparator): Unit = ???

    @stub
    // 
    protected def installListeners(s: JSeparator): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // Paints the specified component appropriately for the look and feel.
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(s: JSeparator): Unit = ???

    @stub
    // 
    protected def uninstallListeners(s: JSeparator): Unit = ???
}

object BasicSeparatorUI {
    @stub
    // 
    def createUI(c: JComponent): ComponentUI = ???
}
