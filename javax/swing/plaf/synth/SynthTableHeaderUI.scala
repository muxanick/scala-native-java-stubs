package javax.swing.plaf.synth

import java.awt.Graphics
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TableHeaderUI}
import javax.swing.plaf.basic.BasicTableHeaderUI

// Provides the Synth L&F UI delegate for
// JTableHeader.
class SynthTableHeaderUI extends BasicTableHeaderUI with PropertyChangeListener, with SynthUI {

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // Initializes JTableHeader properties such as font, foreground, and background.
    protected def installDefaults(): Unit = ???

    @stub
    // Attaches listeners to the JTableHeader.
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
    // This method gets called every time when a rollover column in the table
    // header is updated.
    protected def rolloverColumnUpdated(oldColumn: Int, newColumn: Int): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???

    @stub
    // 
    protected def uninstallListeners(): Unit = ???
}

object SynthTableHeaderUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(h: JComponent): ComponentUI = ???
}
