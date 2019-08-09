package javax.swing.plaf.synth

import java.awt.{Component, Graphics, LayoutManager}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, SpinnerUI}
import javax.swing.plaf.basic.BasicSpinnerUI

// Provides the Synth L&F UI delegate for
// JSpinner.
class SynthSpinnerUI extends BasicSpinnerUI with PropertyChangeListener, with SynthUI {

    @stub
    // This method is called by installUI to get the editor component
    // of the JSpinner.
    protected def createEditor(): JComponent = ???

    @stub
    // Creates a LayoutManager that manages the editor,
    // nextButton, and previousButton
    // children of the JSpinner.
    protected def createLayout(): LayoutManager = ???

    @stub
    // Creates an increment button, i.e.
    protected def createNextButton(): Component = ???

    @stub
    // Creates a decrement button, i.e.
    protected def createPreviousButton(): Component = ???

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // Initializes the JSpinner border,
    // foreground, and background, properties
    // based on the corresponding "Spinner.*" properties from defaults table.
    protected def installDefaults(): Unit = ???

    @stub
    // Initializes PropertyChangeListener with
    // a shared object that delegates interesting PropertyChangeEvents
    // to protected methods.
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
    // Called by the PropertyChangeListener when the
    // JSpinner editor property changes.
    protected def replaceEditor(oldEditor: JComponent, newEditor: JComponent): Unit = ???

    @stub
    // Sets the JSpinner's layout manager to null.
    protected def uninstallDefaults(): Unit = ???

    @stub
    // Removes the PropertyChangeListener added
    // by installListeners.
    protected def uninstallListeners(): Unit = ???
}

object SynthSpinnerUI {
    @stub
    // Returns a new instance of SynthSpinnerUI.
    def createUI(c: JComponent): ComponentUI = ???
}
