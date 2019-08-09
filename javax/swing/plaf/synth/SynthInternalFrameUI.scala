package javax.swing.plaf.synth

import java.awt.Graphics
import java.awt.event.ComponentListener
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{JComponent, JInternalFrame}
import javax.swing.plaf.{ComponentUI, InternalFrameUI}
import javax.swing.plaf.basic.BasicInternalFrameUI

// Provides the Synth L&F UI delegate for
// JInternalFrame.
class SynthInternalFrameUI extends BasicInternalFrameUI with SynthUI, with PropertyChangeListener {

    @stub
    // 
    protected def createComponentListener(): ComponentListener = ???

    @stub
    // 
    protected def createNorthPane(w: JInternalFrame): JComponent = ???

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // 
    def installDefaults(): Unit = ???

    @stub
    // 
    protected def installListeners(): Unit = ???

    @stub
    // Paints the specified component according to the Look and Feel.
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // Paints the specified component.
    protected def paint(context: SynthContext, g: Graphics): Unit = ???

    @stub
    // Paints the border.
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    @stub
    // This method gets called when a bound property is changed.
    def propertyChange(evt: PropertyChangeEvent): Unit = ???

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

object SynthInternalFrameUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(b: JComponent): ComponentUI = ???
}
