package javax.swing.plaf.basic

import java.awt.Dimension
import java.awt.event.ContainerListener
import java.lang.Object
import javax.swing.JComponent
import javax.swing.event.ChangeListener
import javax.swing.plaf.{ComponentUI, MenuBarUI}

// A default L&F implementation of MenuBarUI.  This implementation
// is a "combined" view/controller.
class BasicMenuBarUI extends MenuBarUI {

    @stub
    // 
    protected def changeListener: ChangeListener = ???

    @stub
    // 
    protected def containerListener: ContainerListener = ???

    @stub
    // 
    protected def createChangeListener(): ChangeListener = ???

    @stub
    // 
    protected def createContainerListener(): ContainerListener = ???

    @stub
    // Returns the specified component's maximum size appropriate for
    // the look and feel.
    def getMaximumSize(c: JComponent): Dimension = ???

    @stub
    // Returns the specified component's minimum size appropriate for
    // the look and feel.
    def getMinimumSize(c: JComponent): Dimension = ???

    @stub
    // 
    protected def installDefaults(): Unit = ???

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
    protected def uninstallDefaults(): Unit = ???

    @stub
    // 
    protected def uninstallKeyboardActions(): Unit = ???

    @stub
    // 
    protected def uninstallListeners(): Unit = ???
}

object BasicMenuBarUI {
    @stub
    // 
    def createUI(x: JComponent): ComponentUI = ???
}
