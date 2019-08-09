package javax.swing.plaf.synth

import java.awt.Graphics
import java.beans.PropertyChangeEvent
import java.lang.Object
import javax.swing.{JComponent, JRootPane}
import javax.swing.plaf.{ComponentUI, RootPaneUI}
import javax.swing.plaf.basic.BasicRootPaneUI

// Provides the Synth L&F UI delegate for
// JRootPane.
class SynthRootPaneUI extends BasicRootPaneUI with SynthUI {

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // 
    protected def installDefaults(c: JRootPane): Unit = ???

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
    // Invoked when a property changes on the root pane.
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(root: JRootPane): Unit = ???
}

object SynthRootPaneUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(c: JComponent): ComponentUI = ???
}
