package javax.swing.plaf.synth

import java.awt.{Component, Graphics, LayoutManager, Rectangle}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, ToolBarUI}
import javax.swing.plaf.basic.BasicToolBarUI

/** Provides the Synth L&F UI delegate for
 *  JToolBar.
 */
class SynthToolBarUI extends BasicToolBarUI with PropertyChangeListener with SynthUI {

    /** Creates a LayoutManager to use with the toolbar. */
    @stub
    protected def createLayout(): LayoutManager = ???

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /**  */
    @stub
    protected def installComponents(): Unit = ???

    /**  */
    @stub
    protected def installDefaults(): Unit = ???

    /**  */
    @stub
    protected def installListeners(): Unit = ???

    /** Paints the specified component according to the Look and Feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /** Paints the toolbar. */
    @stub
    protected def paint(context: SynthContext, g: Graphics): Unit = ???

    /** Paints the border. */
    @stub
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /** Paints the toolbar content. */
    @stub
    protected def paintContent(context: SynthContext, g: Graphics, bounds: Rectangle): Unit = ???

    /** Paints the contents of the window used for dragging. */
    @stub
    protected def paintDragWindow(g: Graphics): Unit = ???

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /** This implementation does nothing, because the rollover
     *  property of the JToolBar class is not used
     *  in the Synth Look and Feel.
     */
    @stub
    protected def setBorderToNonRollover(c: Component): Unit = ???

    /** This implementation does nothing, because the rollover
     *  property of the JToolBar class is not used
     *  in the Synth Look and Feel.
     */
    @stub
    protected def setBorderToNormal(c: Component): Unit = ???

    /** This implementation does nothing, because the rollover
     *  property of the JToolBar class is not used
     *  in the Synth Look and Feel.
     */
    @stub
    protected def setBorderToRollover(c: Component): Unit = ???

    /**  */
    @stub
    protected def uninstallComponents(): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(): Unit = ???
}

object SynthToolBarUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
