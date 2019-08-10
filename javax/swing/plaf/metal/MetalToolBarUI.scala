package javax.swing.plaf.metal

import java.awt.{Component, Graphics, Point}
import java.awt.event.{ContainerListener, MouseEvent}
import java.beans.PropertyChangeListener
import java.lang.Object
import javax.swing.{JComponent, JToolBar}
import javax.swing.border.Border
import javax.swing.event.MouseInputListener
import javax.swing.plaf.{ComponentUI, ToolBarUI}
import javax.swing.plaf.basic.{BasicToolBarUI, BasicToolBarUI.DockingListener, BasicToolBarUI.PropertyListener, BasicToolBarUI.ToolBarContListener}
import scala.scalanative.annotation.stub

/** A Metal Look and Feel implementation of ToolBarUI.  This implementation
 *  is a "combined" view/controller.
 *  
 */
class MetalToolBarUI extends BasicToolBarUI {

    /**  */
    @stub
    def this() = ???

    /**  */
    protected class MetalContainerListener extends BasicToolBarUI.ToolBarContListener {

        /**  */
        @stub
        protected def this() = ???
    }


    /**  */
    protected class MetalDockingListener extends BasicToolBarUI.DockingListener {

        /**  */
        @stub
        def this(t: JToolBar) = ???

        /** Invoked when a mouse button is pressed on a component and then
         *  dragged.
         */
        @stub
        def mouseDragged(e: MouseEvent): Unit = ???

        /** Invoked when a mouse button has been pressed on a component. */
        @stub
        def mousePressed(e: MouseEvent): Unit = ???
    }


    /**  */
    protected class MetalRolloverListener extends BasicToolBarUI.PropertyListener {

        /**  */
        @stub
        protected def this() = ???
    }


    /** This protected field is implementation specific. */
    @stub
    protected val contListener: ContainerListener = ???

    /** This protected field is implementation specific. */
    @stub
    protected val rolloverListener: PropertyChangeListener = ???

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

    /** If necessary paints the background of the component, then invokes
     *  paint.
     */
    @stub
    def update(g: Graphics, c: JComponent): Unit = ???
}

object MetalToolBarUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
