package javax.swing.plaf.synth

import java.awt.Graphics
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, ListUI}
import javax.swing.plaf.basic.BasicListUI

// Provides the Synth L&F UI delegate for
// JList.
class SynthListUI extends BasicListUI with PropertyChangeListener, with SynthUI {

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // Initializes list properties such as font, foreground, and background,
    // and adds the CellRendererPane.
    protected def installDefaults(): Unit = ???

    @stub
    // Creates and installs the listeners for the JList, its model, and its
    // selectionModel.
    protected def installListeners(): Unit = ???

    @stub
    // Paints the border.
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    @stub
    // This method gets called when a bound property is changed.
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    @stub
    // Sets the list properties that have not been explicitly overridden to
    // null.
    protected def uninstallDefaults(): Unit = ???

    @stub
    // Removes the listeners from the JList, its model, and its
    // selectionModel.
    protected def uninstallListeners(): Unit = ???
}

object SynthListUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(list: JComponent): ComponentUI = ???
}
