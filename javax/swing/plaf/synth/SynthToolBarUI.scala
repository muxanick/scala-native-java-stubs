package javax.swing.plaf.synth

import java.awt.{Component, Graphics, LayoutManager, Rectangle}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, ToolBarUI}
import javax.swing.plaf.basic.BasicToolBarUI

// Provides the Synth L&F UI delegate for
// JToolBar.
class SynthToolBarUI extends BasicToolBarUI with PropertyChangeListener, with SynthUI {

    @stub
    // Creates a LayoutManager to use with the toolbar.
    protected def createLayout(): LayoutManager = ???

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // 
    protected def installComponents(): Unit = ???

    @stub
    // 
    protected def installDefaults(): Unit = ???

    @stub
    // 
    protected def installListeners(): Unit = ???

    @stub
    // Paints the specified component according to the Look and Feel.
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // Paints the toolbar.
    protected def paint(context: SynthContext, g: Graphics): Unit = ???

    @stub
    // Paints the border.
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    @stub
    // Paints the toolbar content.
    protected def paintContent(context: SynthContext, g: Graphics, bounds: Rectangle): Unit = ???

    @stub
    // Paints the contents of the window used for dragging.
    protected def paintDragWindow(g: Graphics): Unit = ???

    @stub
    // This method gets called when a bound property is changed.
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    @stub
    // This implementation does nothing, because the rollover
    // property of the JToolBar class is not used
    // in the Synth Look and Feel.
    protected def setBorderToNonRollover(c: Component): Unit = ???

    @stub
    // This implementation does nothing, because the rollover
    // property of the JToolBar class is not used
    // in the Synth Look and Feel.
    protected def setBorderToNormal(c: Component): Unit = ???

    @stub
    // This implementation does nothing, because the rollover
    // property of the JToolBar class is not used
    // in the Synth Look and Feel.
    protected def setBorderToRollover(c: Component): Unit = ???

    @stub
    // 
    protected def uninstallComponents(): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???

    @stub
    // 
    protected def uninstallListeners(): Unit = ???
}

object SynthToolBarUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(c: JComponent): ComponentUI = ???
}
