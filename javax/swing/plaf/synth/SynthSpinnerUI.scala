package javax.swing.plaf.synth

import java.awt.{Component, Graphics, LayoutManager}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, SpinnerUI}
import javax.swing.plaf.basic.BasicSpinnerUI

/** Provides the Synth L&F UI delegate for
 *  JSpinner.
 */
class SynthSpinnerUI extends BasicSpinnerUI with PropertyChangeListener with SynthUI {

    /** This method is called by installUI to get the editor component
     *  of the JSpinner.
     */
    @stub
    protected def createEditor(): JComponent = ???

    /** Creates a LayoutManager that manages the editor,
     *  nextButton, and previousButton
     *  children of the JSpinner.
     */
    @stub
    protected def createLayout(): LayoutManager = ???

    /** Creates an increment button, i.e. */
    @stub
    protected def createNextButton(): Component = ???

    /** Creates a decrement button, i.e. */
    @stub
    protected def createPreviousButton(): Component = ???

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /** Initializes the JSpinner border,
     *  foreground, and background, properties
     *  based on the corresponding "Spinner.*" properties from defaults table.
     */
    @stub
    protected def installDefaults(): Unit = ???

    /** Initializes PropertyChangeListener with
     *  a shared object that delegates interesting PropertyChangeEvents
     *  to protected methods.
     */
    @stub
    protected def installListeners(): Unit = ???

    /** Paints the specified component according to the Look and Feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /** Paints the specified component. */
    @stub
    protected def paint(context: SynthContext, g: Graphics): Unit = ???

    /** Paints the border. */
    @stub
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /** Called by the PropertyChangeListener when the
     *  JSpinner editor property changes.
     */
    @stub
    protected def replaceEditor(oldEditor: JComponent, newEditor: JComponent): Unit = ???

    /** Sets the JSpinner's layout manager to null. */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /** Removes the PropertyChangeListener added
     *  by installListeners.
     */
    @stub
    protected def uninstallListeners(): Unit = ???
}

object SynthSpinnerUI {
    /** Returns a new instance of SynthSpinnerUI. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
