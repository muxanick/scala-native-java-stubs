package javax.swing.plaf.synth

import java.awt.Graphics
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, DesktopPaneUI}
import javax.swing.plaf.basic.BasicDesktopPaneUI

// Provides the Synth L&F UI delegate for
// JDesktopPane.
class SynthDesktopPaneUI extends BasicDesktopPaneUI with PropertyChangeListener, with SynthUI {

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // 
    protected def installDefaults(): Unit = ???

    @stub
    // 
    protected def installDesktopManager(): Unit = ???

    @stub
    // Installs the PropertyChangeListener returned from
    // createPropertyChangeListener on the
    // JDesktopPane.
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
    protected def uninstallDefaults(): Unit = ???

    @stub
    // 
    protected def uninstallDesktopManager(): Unit = ???

    @stub
    // Uninstalls the PropertyChangeListener returned from
    // createPropertyChangeListener from the
    // JDesktopPane.
    protected def uninstallListeners(): Unit = ???
}

object SynthDesktopPaneUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(c: JComponent): ComponentUI = ???
}
