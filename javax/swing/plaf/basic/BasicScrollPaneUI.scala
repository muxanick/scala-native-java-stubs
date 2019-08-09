package javax.swing.plaf.basic

import java.awt.{Component.BaselineResizeBehavior, Dimension, Graphics}
import java.awt.event.MouseWheelListener
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{JComponent, JScrollPane, ScrollPaneConstants}
import javax.swing.event.ChangeListener
import javax.swing.plaf.{ComponentUI, ScrollPaneUI}
import scala.scalanative.annotation.stub

/** A default L&F implementation of ScrollPaneUI. */
class BasicScrollPaneUI extends ScrollPaneUI with ScrollPaneConstants {

    /**  */
    @stub
    def this() = ???

    /** Horizontal scrollbar listener. */
    @stub
    object HSBChangeListener extends BasicScrollPaneUI.HSBChangeListener

    /** MouseWheelHandler is an inner class which implements the
     *  MouseWheelListener interface.
     */
    @stub
    protected object MouseWheelHandler extends BasicScrollPaneUI.MouseWheelHandler

    /**  */
    @stub
    object PropertyChangeHandler extends BasicScrollPaneUI.PropertyChangeHandler

    /** Listener for viewport events. */
    @stub
    object ViewportChangeHandler extends BasicScrollPaneUI.ViewportChangeHandler

    /** Vertical scrollbar listener. */
    @stub
    object VSBChangeListener extends BasicScrollPaneUI.VSBChangeListener

    /**  */
    @stub
    protected val hsbChangeListener: ChangeListener = ???

    /**  */
    @stub
    protected val scrollpane: JScrollPane = ???

    /**  */
    @stub
    protected val spPropertyChangeListener: PropertyChangeListener = ???

    /**  */
    @stub
    protected val viewportChangeListener: ChangeListener = ???

    /**  */
    @stub
    protected val vsbChangeListener: ChangeListener = ???

    /**  */
    @stub
    protected def createHSBChangeListener(): ChangeListener = ???

    /** Creates an instance of MouseWheelListener, which is added to the
     *  JScrollPane by installUI().
     */
    @stub
    protected def createMouseWheelListener(): MouseWheelListener = ???

    /** Creates an instance of PropertyChangeListener that's added to
     *  the JScrollPane by installUI().
     */
    @stub
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    /**  */
    @stub
    protected def createViewportChangeListener(): ChangeListener = ???

    /**  */
    @stub
    protected def createVSBChangeListener(): ChangeListener = ???

    /** Returns the baseline. */
    @stub
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    /** Returns an enum indicating how the baseline of the component
     *  changes as the size changes.
     */
    @stub
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    /** Returns the specified component's maximum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMaximumSize(c: JComponent): Dimension = ???

    /**  */
    @stub
    protected def installDefaults(scrollpane: JScrollPane): Unit = ???

    /**  */
    @stub
    protected def installKeyboardActions(c: JScrollPane): Unit = ???

    /**  */
    @stub
    protected def installListeners(c: JScrollPane): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(x: JComponent): Unit = ???

    /** Paints the specified component appropriately for the look and feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /**  */
    @stub
    protected def syncScrollPaneWithViewport(): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(c: JScrollPane): Unit = ???

    /**  */
    @stub
    protected def uninstallKeyboardActions(c: JScrollPane): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(c: JComponent): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???

    /**  */
    @stub
    protected def updateColumnHeader(e: PropertyChangeEvent): Unit = ???

    /**  */
    @stub
    protected def updateRowHeader(e: PropertyChangeEvent): Unit = ???

    /**  */
    @stub
    protected def updateScrollBarDisplayPolicy(e: PropertyChangeEvent): Unit = ???

    /**  */
    @stub
    protected def updateViewport(e: PropertyChangeEvent): Unit = ???
}

object BasicScrollPaneUI {
    /**  */
    @stub
    def createUI(x: JComponent): ComponentUI = ???
}
