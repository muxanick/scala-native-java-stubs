package javax.swing.plaf.basic

import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{JComponent, JRootPane}
import javax.swing.plaf.{ComponentUI, RootPaneUI}

// Basic implementation of RootPaneUI, there is one shared between all
// JRootPane instances.
class BasicRootPaneUI extends RootPaneUI with PropertyChangeListener {

    @stub
    // 
    protected def installComponents(root: JRootPane): Unit = ???

    @stub
    // 
    protected def installDefaults(c: JRootPane): Unit = ???

    @stub
    // 
    protected def installKeyboardActions(root: JRootPane): Unit = ???

    @stub
    // 
    protected def installListeners(root: JRootPane): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // Invoked when a property changes on the root pane.
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    @stub
    // 
    protected def uninstallComponents(root: JRootPane): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(root: JRootPane): Unit = ???

    @stub
    // 
    protected def uninstallKeyboardActions(root: JRootPane): Unit = ???

    @stub
    // 
    protected def uninstallListeners(root: JRootPane): Unit = ???
}

object BasicRootPaneUI {
    @stub
    // 
    def createUI(c: JComponent): ComponentUI = ???
}
