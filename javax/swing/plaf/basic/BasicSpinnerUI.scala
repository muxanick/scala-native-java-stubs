package javax.swing.plaf.basic

import java.awt.{Component, Component.BaselineResizeBehavior, LayoutManager}
import java.beans.PropertyChangeListener
import java.lang.Object
import javax.swing.{JComponent, JSpinner}
import javax.swing.plaf.{ComponentUI, SpinnerUI}
import scala.scalanative.annotation.stub

/** The default Spinner UI delegate. */
class BasicSpinnerUI extends SpinnerUI {

    /**  */
    @stub
    def this() = ???

    /** The spinner that we're a UI delegate for. */
    @stub
    protected val spinner: JSpinner = ???

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

    /** Creates a PropertyChangeListener that can be
     *  added to the JSpinner itself.
     */
    @stub
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    /** Returns the baseline. */
    @stub
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    /** Returns an enum indicating how the baseline of the component
     *  changes as the size changes.
     */
    @stub
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    /** Initialize the JSpinner border,
     *  foreground, and background, properties
     *  based on the corresponding "Spinner.*" properties from defaults table.
     */
    @stub
    protected def installDefaults(): Unit = ???

    /** Installs the keyboard Actions onto the JSpinner. */
    @stub
    protected def installKeyboardActions(): Unit = ???

    /** Initializes PropertyChangeListener with
     *  a shared object that delegates interesting PropertyChangeEvents
     *  to protected methods.
     */
    @stub
    protected def installListeners(): Unit = ???

    /** Installs the necessary listeners on the next button, c,
     *  to update the JSpinner in response to a user gesture.
     */
    @stub
    protected def installNextButtonListeners(c: Component): Unit = ???

    /** Installs the necessary listeners on the previous button, c,
     *  to update the JSpinner in response to a user gesture.
     */
    @stub
    protected def installPreviousButtonListeners(c: Component): Unit = ???

    /** Calls installDefaults, installListeners,
     *  and then adds the components returned by createNextButton,
     *  createPreviousButton, and createEditor.
     */
    @stub
    def installUI(c: JComponent): Unit = ???

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

    /** Calls uninstallDefaults, uninstallListeners,
     *  and then removes all of the spinners children.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???
}

object BasicSpinnerUI {
    /** Returns a new instance of BasicSpinnerUI. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
