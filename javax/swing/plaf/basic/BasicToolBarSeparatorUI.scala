package javax.swing.plaf.basic

import java.awt.Dimension
import java.lang.Object
import javax.swing.{JComponent, JSeparator}
import javax.swing.plaf.{ComponentUI, SeparatorUI}

// A Basic L&F implementation of ToolBarSeparatorUI.  This implementation
// is a "combined" view/controller.
// 
class BasicToolBarSeparatorUI extends BasicSeparatorUI {

    @stub
    // Returns the specified component's preferred size appropriate for
    // the look and feel.
    def getPreferredSize(c: JComponent): Dimension = ???

    @stub
    // 
    protected def installDefaults(s: JSeparator): Unit = ???
}

object BasicToolBarSeparatorUI {
    @stub
    // 
    def createUI(c: JComponent): ComponentUI = ???
}
