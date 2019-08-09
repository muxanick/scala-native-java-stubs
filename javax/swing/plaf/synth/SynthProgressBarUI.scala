package javax.swing.plaf.synth

import java.awt.{Dimension, Graphics, Rectangle}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, ProgressBarUI}
import javax.swing.plaf.basic.BasicProgressBarUI

// Provides the Synth L&F UI delegate for
// JProgressBar.
class SynthProgressBarUI extends BasicProgressBarUI with SynthUI, with PropertyChangeListener {

    @stub
    // Returns the baseline.
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    @stub
    // Stores the position and size of
    // the bouncing box that would be painted for the current animation index
    // in r and returns r.
    protected def getBox(r: Rectangle): Rectangle = ???

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // Returns the specified component's preferred size appropriate for
    // the look and feel.
    def getPreferredSize(c: JComponent): Dimension = ???

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
    // Paints the component's text.
    protected def paintText(context: SynthContext, g: Graphics, title: String): Unit = ???

    @stub
    // This method gets called when a bound property is changed.
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    @stub
    // Sets the index of the current animation frame
    // to the specified value and requests that the
    // progress bar be repainted.
    protected def setAnimationIndex(newValue: Int): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???

    @stub
    // Removes all listeners installed by this object.
    protected def uninstallListeners(): Unit = ???
}

object SynthProgressBarUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(x: JComponent): ComponentUI = ???
}
