package javax.swing.plaf.metal

import java.awt.{Component, Point}
import java.awt.event.ContainerListener
import java.beans.PropertyChangeListener
import java.lang.Object
import javax.swing.JComponent
import javax.swing.border.Border
import javax.swing.event.MouseInputListener
import javax.swing.plaf.{ComponentUI, ToolBarUI}
import javax.swing.plaf.basic.BasicToolBarUI

// A Metal Look and Feel implementation of ToolBarUI.  This implementation
// is a "combined" view/controller.
// 
class MetalToolBarUI extends BasicToolBarUI {

    @stub
    // 
    protected def MetalToolBarUI.MetalContainerListener: class = ???

    @stub
    // 
    protected def MetalToolBarUI.MetalDockingListener: class = ???

    @stub
    // This protected field is implementation specific.
    protected def contListener: ContainerListener = ???

    @stub
    // Creates a container listener that will be added to the JToolBar.
    protected def createContainerListener(): ContainerListener = ???

    @stub
    // 
    protected def createDockingListener(): MouseInputListener = ???

    @stub
    // Creates the non rollover border for toolbar components.
    protected def createNonRolloverBorder(): Border = ???

    @stub
    // Creates a rollover border for toolbar components.
    protected def createRolloverBorder(): Border = ???

    @stub
    // Creates a property change listener that will be added to the JToolBar.
    protected def createRolloverListener(): PropertyChangeListener = ???

    @stub
    // 
    protected def installListeners(): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // Sets the border of the component to have a non-rollover border which
    // was created by the BasicToolBarUI.createNonRolloverBorder() method.
    protected def setBorderToNonRollover(c: Component): Unit = ???

    @stub
    // 
    protected def setDragOffset(p: Point): Unit = ???

    @stub
    // 
    protected def uninstallListeners(): Unit = ???

    @stub
    // Reverses configuration which was done on the specified component during
    // installUI.
    def uninstallUI(c: JComponent): Unit = ???
}

object MetalToolBarUI {
    @stub
    // 
    def createUI(c: JComponent): ComponentUI = ???
}
