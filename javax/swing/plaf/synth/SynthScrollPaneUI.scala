package javax.swing.plaf.synth

import java.awt.Graphics
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{JComponent, JScrollPane}
import javax.swing.plaf.{ComponentUI, ScrollPaneUI}
import javax.swing.plaf.basic.BasicScrollPaneUI

// Provides the Synth L&F UI delegate for
// JScrollPane.
class SynthScrollPaneUI extends BasicScrollPaneUI with PropertyChangeListener, with SynthUI {

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // 
    protected def installDefaults(scrollpane: JScrollPane): Unit = ???

    @stub
    // 
    protected def installListeners(c: JScrollPane): Unit = ???

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
    protected def uninstallDefaults(c: JScrollPane): Unit = ???

    @stub
    // 
    protected def uninstallListeners(c: JComponent): Unit = ???
}

object SynthScrollPaneUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(x: JComponent): ComponentUI = ???
}
