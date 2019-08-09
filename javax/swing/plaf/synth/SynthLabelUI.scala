package javax.swing.plaf.synth

import java.awt.{Dimension, Graphics}
import java.beans.PropertyChangeEvent
import java.lang.Object
import javax.swing.{JComponent, JLabel}
import javax.swing.plaf.{ComponentUI, LabelUI}
import javax.swing.plaf.basic.BasicLabelUI

// Provides the Synth L&F UI delegate for
// JLabel.
class SynthLabelUI extends BasicLabelUI with SynthUI {

    @stub
    // Returns the baseline.
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

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
    // Installs default properties.
    protected def installDefaults(c: JLabel): Unit = ???

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
    // Uninstalls default properties.
    protected def uninstallDefaults(c: JLabel): Unit = ???
}

object SynthLabelUI {
    @stub
    // Returns the LabelUI implementation used for the skins look and feel.
    def createUI(c: JComponent): ComponentUI = ???
}
