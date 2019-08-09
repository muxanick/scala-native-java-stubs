package javax.swing.plaf.synth

import java.awt.{Dimension, Graphics}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{JComponent, JSeparator}
import javax.swing.plaf.{ComponentUI, SeparatorUI}

// Provides the Synth L&F UI delegate for
// JSeparator.
class SynthSeparatorUI extends SeparatorUI with PropertyChangeListener, with SynthUI {

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // Returns the specified component's maximum size appropriate for
    // the look and feel.
    def getMaximumSize(c: JComponent): Dimension = ???

    @stub
    // Returns the specified component's minimum size appropriate for
    // the look and feel.
    def getMinimumSize(c: JComponent): Dimension = ???

    @stub
    // Returns the specified component's preferred size appropriate for
    // the look and feel.
    def getPreferredSize(c: JComponent): Dimension = ???

    @stub
    // Installs default setting.
    def installDefaults(c: JSeparator): Unit = ???

    @stub
    // Installs listeners.
    def installListeners(c: JSeparator): Unit = ???

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
    def propertyChange(evt: PropertyChangeEvent): Unit = ???

    @stub
    // Uninstalls default setting.
    def uninstallDefaults(c: JSeparator): Unit = ???

    @stub
    // Uninstalls listeners.
    def uninstallListeners(c: JSeparator): Unit = ???

    @stub
    // Reverses configuration which was done on the specified component during
    // installUI.
    def uninstallUI(c: JComponent): Unit = ???
}

object SynthSeparatorUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(c: JComponent): ComponentUI = ???
}
