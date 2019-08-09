package javax.swing.plaf.basic

import java.awt.{Component, Component.BaselineResizeBehavior, LayoutManager}
import java.beans.PropertyChangeListener
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, SpinnerUI}

// The default Spinner UI delegate.
class BasicSpinnerUI extends SpinnerUI {

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
    // Creates a PropertyChangeListener that can be
    // added to the JSpinner itself.
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    @stub
    // Returns the baseline.
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    @stub
    // Returns an enum indicating how the baseline of the component
    // changes as the size changes.
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    @stub
    // Initialize the JSpinner border,
    // foreground, and background, properties
    // based on the corresponding "Spinner.*" properties from defaults table.
    protected def installDefaults(): Unit = ???

    @stub
    // Installs the keyboard Actions onto the JSpinner.
    protected def installKeyboardActions(): Unit = ???

    @stub
    // Initializes PropertyChangeListener with
    // a shared object that delegates interesting PropertyChangeEvents
    // to protected methods.
    protected def installListeners(): Unit = ???

    @stub
    // Installs the necessary listeners on the next button, c,
    // to update the JSpinner in response to a user gesture.
    protected def installNextButtonListeners(c: Component): Unit = ???

    @stub
    // Installs the necessary listeners on the previous button, c,
    // to update the JSpinner in response to a user gesture.
    protected def installPreviousButtonListeners(c: Component): Unit = ???

    @stub
    // Calls installDefaults, installListeners,
    // and then adds the components returned by createNextButton,
    // createPreviousButton, and createEditor.
    def installUI(c: JComponent): Unit = ???

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

object BasicSpinnerUI {
    @stub
    // Returns a new instance of BasicSpinnerUI.
    def createUI(c: JComponent): ComponentUI = ???
}
