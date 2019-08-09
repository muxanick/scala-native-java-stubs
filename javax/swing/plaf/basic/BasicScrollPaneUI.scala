package javax.swing.plaf.basic

import java.awt.{Component.BaselineResizeBehavior, Dimension, Graphics}
import java.awt.event.MouseWheelListener
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{JComponent, JScrollPane, ScrollPaneConstants}
import javax.swing.event.ChangeListener
import javax.swing.plaf.{ComponentUI, ScrollPaneUI}

// A default L&F implementation of ScrollPaneUI.
class BasicScrollPaneUI extends ScrollPaneUI with ScrollPaneConstants {

    @stub
    // Horizontal scrollbar listener.
    def BasicScrollPaneUI.HSBChangeListener: class = ???

    @stub
    // MouseWheelHandler is an inner class which implements the
    // MouseWheelListener interface.
    protected def BasicScrollPaneUI.MouseWheelHandler: class = ???

    @stub
    // 
    def BasicScrollPaneUI.PropertyChangeHandler: class = ???

    @stub
    // Listener for viewport events.
    def BasicScrollPaneUI.ViewportChangeHandler: class = ???

    @stub
    // 
    protected def hsbChangeListener: ChangeListener = ???

    @stub
    // 
    protected def scrollpane: JScrollPane = ???

    @stub
    // 
    protected def spPropertyChangeListener: PropertyChangeListener = ???

    @stub
    // 
    protected def viewportChangeListener: ChangeListener = ???

    @stub
    // 
    protected def createHSBChangeListener(): ChangeListener = ???

    @stub
    // Creates an instance of MouseWheelListener, which is added to the
    // JScrollPane by installUI().
    protected def createMouseWheelListener(): MouseWheelListener = ???

    @stub
    // Creates an instance of PropertyChangeListener that's added to
    // the JScrollPane by installUI().
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    @stub
    // 
    protected def createViewportChangeListener(): ChangeListener = ???

    @stub
    // 
    protected def createVSBChangeListener(): ChangeListener = ???

    @stub
    // Returns the baseline.
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    @stub
    // Returns an enum indicating how the baseline of the component
    // changes as the size changes.
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    @stub
    // Returns the specified component's maximum size appropriate for
    // the look and feel.
    def getMaximumSize(c: JComponent): Dimension = ???

    @stub
    // 
    protected def installDefaults(scrollpane: JScrollPane): Unit = ???

    @stub
    // 
    protected def installKeyboardActions(c: JScrollPane): Unit = ???

    @stub
    // 
    protected def installListeners(c: JScrollPane): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(x: JComponent): Unit = ???

    @stub
    // Paints the specified component appropriately for the look and feel.
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // 
    protected def syncScrollPaneWithViewport(): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(c: JScrollPane): Unit = ???

    @stub
    // 
    protected def uninstallKeyboardActions(c: JScrollPane): Unit = ???

    @stub
    // 
    protected def uninstallListeners(c: JComponent): Unit = ???

    @stub
    // Reverses configuration which was done on the specified component during
    // installUI.
    def uninstallUI(c: JComponent): Unit = ???

    @stub
    // 
    protected def updateColumnHeader(e: PropertyChangeEvent): Unit = ???

    @stub
    // 
    protected def updateRowHeader(e: PropertyChangeEvent): Unit = ???

    @stub
    // 
    protected def updateScrollBarDisplayPolicy(e: PropertyChangeEvent): Unit = ???
}

object BasicScrollPaneUI {
    @stub
    // 
    def createUI(x: JComponent): ComponentUI = ???
}
