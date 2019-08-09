package javax.swing.plaf.synth

import java.awt.{Container, Graphics}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, OptionPaneUI}
import javax.swing.plaf.basic.BasicOptionPaneUI

// Provides the Synth L&F UI delegate for
// JOptionPane.
class SynthOptionPaneUI extends BasicOptionPaneUI with PropertyChangeListener, with SynthUI {

    @stub
    // Called from installComponents() to create a Container
    // containing the body of the message.
    protected def createMessageArea(): Container = ???

    @stub
    // 
    protected def createSeparator(): Container = ???

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // Returns true, basic L&F wants all the buttons to have the same
    // width.
    protected def getSizeButtonsToSameWidth(): Boolean = ???

    @stub
    // 
    protected def installComponents(): Unit = ???

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

object SynthOptionPaneUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(x: JComponent): ComponentUI = ???
}
