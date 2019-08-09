package javax.swing.plaf.synth

import java.awt.Graphics
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.JComponent
import javax.swing.colorchooser.AbstractColorChooserPanel
import javax.swing.plaf.{ColorChooserUI, ComponentUI}
import javax.swing.plaf.basic.BasicColorChooserUI

// Provides the Synth L&F UI delegate for
// JColorChooser.
class SynthColorChooserUI extends BasicColorChooserUI with PropertyChangeListener, with SynthUI {

    @stub
    // 
    protected def createDefaultChoosers(): Array[AbstractColorChooserPanel] = ???

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

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
    // Paints the specified component.
    protected def paint(context: SynthContext, g: Graphics): Unit = ???

    @stub
    // Paints the border.
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    @stub
    // This method gets called when a bound property is changed.
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???

    @stub
    // 
    protected def uninstallListeners(): Unit = ???
}

object SynthColorChooserUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(c: JComponent): ComponentUI = ???
}
