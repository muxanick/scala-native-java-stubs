package javax.swing.plaf.synth

import java.awt.{Dimension, Graphics}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{AbstractButton, Icon, JComponent}
import javax.swing.plaf.{ButtonUI, ComponentUI}
import javax.swing.plaf.basic.BasicButtonUI

// Provides the Synth L&F UI delegate for
// JButton.
class SynthButtonUI extends BasicButtonUI with PropertyChangeListener, with SynthUI {

    @stub
    // Returns the baseline.
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // Returns the default icon.
    protected def getDefaultIcon(b: AbstractButton): Icon = ???

    @stub
    // Returns the Icon to use for painting the button.
    protected def getIcon(b: AbstractButton): Icon = ???

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
    // Returns the Icon used in calculating the
    // preferred/minimum/maximum size.
    protected def getSizingIcon(b: AbstractButton): Icon = ???

    @stub
    // 
    protected def installDefaults(b: AbstractButton): Unit = ???

    @stub
    // 
    protected def installListeners(b: AbstractButton): Unit = ???

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
    protected def uninstallDefaults(b: AbstractButton): Unit = ???

    @stub
    // 
    protected def uninstallListeners(b: AbstractButton): Unit = ???
}

object SynthButtonUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(c: JComponent): ComponentUI = ???
}
