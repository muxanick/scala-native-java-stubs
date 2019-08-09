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

/** A Metal Look and Feel implementation of ToolBarUI.  This implementation
 *  is a "combined" view/controller.
 *  
 */
class MetalToolBarUI extends BasicToolBarUI {

    /**  */
    @stub
    protected object MetalContainerListener extends MetalToolBarUI.MetalContainerListener

    /**  */
    @stub
    protected object MetalDockingListener extends MetalToolBarUI.MetalDockingListener

    /** This protected field is implementation specific. */
    @stub
    protected val contListener: ContainerListener = ???

    /** Creates a container listener that will be added to the JToolBar. */
    @stub
    protected def createContainerListener(): ContainerListener = ???

    /**  */
    @stub
    protected def createDockingListener(): MouseInputListener = ???

    /** Creates the non rollover border for toolbar components. */
    @stub
    protected def createNonRolloverBorder(): Border = ???

    /** Creates a rollover border for toolbar components. */
    @stub
    protected def createRolloverBorder(): Border = ???

    /** Creates a property change listener that will be added to the JToolBar. */
    @stub
    protected def createRolloverListener(): PropertyChangeListener = ???

    /**  */
    @stub
    protected def installListeners(): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Sets the border of the component to have a non-rollover border which
     *  was created by the BasicToolBarUI.createNonRolloverBorder() method.
     */
    @stub
    protected def setBorderToNonRollover(c: Component): Unit = ???

    /**  */
    @stub
    protected def setDragOffset(p: Point): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???
}

object MetalToolBarUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
