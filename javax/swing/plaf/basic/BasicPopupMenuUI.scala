package javax.swing.plaf.basic

import java.awt.event.MouseEvent
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, PopupMenuUI}

// A Windows L&F implementation of PopupMenuUI.  This implementation
// is a "combined" view/controller.
class BasicPopupMenuUI extends PopupMenuUI {

    @stub
    // 
    def installDefaults(): Unit = ???

    @stub
    // 
    protected def installKeyboardActions(): Unit = ???

    @stub
    // 
    protected def installListeners(): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // 
    def isPopupTrigger(e: MouseEvent): Boolean = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???

    @stub
    // 
    protected def uninstallKeyboardActions(): Unit = ???

    @stub
    // 
    protected def uninstallListeners(): Unit = ???
}

object BasicPopupMenuUI {
    @stub
    // 
    def createUI(x: JComponent): ComponentUI = ???
}
