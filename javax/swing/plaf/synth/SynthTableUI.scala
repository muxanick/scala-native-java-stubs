package javax.swing.plaf.synth

import java.awt.Graphics
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TableUI}
import javax.swing.plaf.basic.BasicTableUI

// Provides the Synth L&F UI delegate for
// JTable.
class SynthTableUI extends BasicTableUI with SynthUI, with PropertyChangeListener {

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // Initializes JTable properties, such as font, foreground, and background.
    protected def installDefaults(): Unit = ???

    @stub
    // Attaches listeners to the JTable.
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
    def propertyChange(event: PropertyChangeEvent): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???

    @stub
    // 
    protected def uninstallListeners(): Unit = ???
}

object SynthTableUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(c: JComponent): ComponentUI = ???
}
