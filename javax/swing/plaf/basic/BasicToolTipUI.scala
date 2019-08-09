package javax.swing.plaf.basic

import java.awt.{Dimension, Graphics}
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, ToolTipUI}

// Standard tool tip L&F.
// 
class BasicToolTipUI extends ToolTipUI {

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
    protected def installDefaults(c: JComponent): Unit = ???

    @stub
    // 
    protected def installListeners(c: JComponent): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // Paints the specified component appropriately for the look and feel.
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(c: JComponent): Unit = ???

    @stub
    // 
    protected def uninstallListeners(c: JComponent): Unit = ???
}

object BasicToolTipUI {
    @stub
    // 
    def createUI(c: JComponent): ComponentUI = ???
}
