package javax.swing.plaf.synth

import java.awt.Graphics
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{JComponent, JPanel}
import javax.swing.plaf.{ComponentUI, PanelUI}
import javax.swing.plaf.basic.BasicPanelUI

// Provides the Synth L&F UI delegate for
// JPanel.
class SynthPanelUI extends BasicPanelUI with PropertyChangeListener, with SynthUI {

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // 
    protected def installDefaults(p: JPanel): Unit = ???

    @stub
    // Installs listeners into the panel.
    protected def installListeners(p: JPanel): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

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
    def propertyChange(pce: PropertyChangeEvent): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(p: JPanel): Unit = ???

    @stub
    // Uninstalls listeners from the panel.
    protected def uninstallListeners(p: JPanel): Unit = ???

    @stub
    // Reverses configuration which was done on the specified component during
    // installUI.
    def uninstallUI(c: JComponent): Unit = ???
}

object SynthPanelUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(c: JComponent): ComponentUI = ???
}
