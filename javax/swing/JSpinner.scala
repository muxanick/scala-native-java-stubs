package javax.swing

import java.awt.{Component, Container}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.event.ChangeListener
import javax.swing.plaf.SpinnerUI
import scala.scalanative.annotation.stub

/** A single line input field that lets the user select a
 *  number or an object value from an ordered sequence. Spinners typically
 *  provide a pair of tiny arrow buttons for stepping through the elements
 *  of the sequence. The keyboard up/down arrow keys also cycle through the
 *  elements. The user may also be allowed to type a (legal) value directly
 *  into the spinner. Although combo boxes provide similar functionality,
 *  spinners are sometimes preferred because they don't require a drop down list
 *  that can obscure important data.
 *  
 *  A JSpinner's sequence value is defined by its
 *  SpinnerModel.
 *  The model can be specified as a constructor argument and
 *  changed with the model property.  SpinnerModel
 *  classes for some common types are provided: SpinnerListModel,
 *  SpinnerNumberModel, and SpinnerDateModel.
 *  
 *  A JSpinner has a single child component that's
 *  responsible for displaying
 *  and potentially changing the current element or value of
 *  the model, which is called the editor.  The editor is created
 *  by the JSpinner's constructor and can be changed with the
 *  editor property.  The JSpinner's editor stays
 *  in sync with the model by listening for ChangeEvents. If the
 *  user has changed the value displayed by the editor it is
 *  possible for the model's value to differ from that of
 *  the editor. To make sure the model has the same
 *  value as the editor use the commitEdit method, eg:
 *  
 *    try {
 *        spinner.commitEdit();
 *    }
 *    catch (ParseException pe) {
 *        // Edited value is invalid, spinner.getValue() will return
 *        // the last valid value, you could revert the spinner to show that:
 *        JComponent editor = spinner.getEditor();
 *        if (editor instanceof DefaultEditor) {
 *            ((DefaultEditor)editor).getTextField().setValue(spinner.getValue());
 *        }
 *        // reset the value to some known value:
 *        spinner.setValue(fallbackValue);
 *        // or treat the last valid value as the current, in which
 *        // case you don't need to do anything.
 *    }
 *    return spinner.getValue();
 *  
 *  
 *  For information and examples of using spinner see
 *  How to Use Spinners,
 *  a section in The Java Tutorial.
 *  
 *  Warning: Swing is not thread safe. For more
 *  information see Swing's Threading
 *  Policy.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class JSpinner extends JComponent with Accessible {

    /** Constructs a spinner with an Integer SpinnerNumberModel
     *  with initial value 0 and no minimum or maximum limits.
     */
    @stub
    def this() = ???

    /** Constructs a spinner for the given model. */
    @stub
    def this(model: SpinnerModel) = ???

    /** AccessibleJSpinner implements accessibility
     *  support for the JSpinner class.
     */
    protected type AccessibleJSpinner = JSpinner_AccessibleJSpinner

    /** Adds a listener to the list that is notified each time a change
     *  to the model occurs.
     */
    @stub
    def addChangeListener(listener: ChangeListener): Unit = ???

    /** Commits the currently edited value to the SpinnerModel. */
    @stub
    def commitEdit(): Unit = ???

    /** This method is called by the constructors to create the
     *  JComponent
     *  that displays the current value of the sequence.
     */
    @stub
    protected def createEditor(model: SpinnerModel): JComponent = ???

    /** Sends a ChangeEvent, whose source is this
     *  JSpinner, to each ChangeListener.
     */
    @stub
    protected def fireStateChanged(): Unit = ???

    /** Gets the AccessibleContext for the JSpinner */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns an array of all the ChangeListeners added
     *  to this JSpinner with addChangeListener().
     */
    @stub
    def getChangeListeners(): Array[ChangeListener] = ???

    /** Returns the component that displays and potentially
     *  changes the model's value.
     */
    @stub
    def getEditor(): JComponent = ???

    /** Returns the SpinnerModel that defines
     *  this spinners sequence of values.
     */
    @stub
    def getModel(): SpinnerModel = ???

    /** Returns the object in the sequence that comes after the object returned
     *  by getValue().
     */
    @stub
    def getNextValue(): Any = ???

    /** Returns the object in the sequence that comes
     *  before the object returned by getValue().
     */
    @stub
    def getPreviousValue(): Any = ???

    /** Returns the look and feel (L&F) object that renders this component. */
    @stub
    def getUI(): SpinnerUI = ???

    /** Returns the suffix used to construct the name of the look and feel
     *  (L&F) class used to render this component.
     */
    @stub
    def getUIClassID(): String = ???

    /** Returns the current value of the model, typically
     *  this value is displayed by the editor.
     */
    @stub
    def getValue(): Any = ???

    /** Removes a ChangeListener from this spinner. */
    @stub
    def removeChangeListener(listener: ChangeListener): Unit = ???

    /** Changes the JComponent that displays the current value
     *  of the SpinnerModel.
     */
    @stub
    def setEditor(editor: JComponent): Unit = ???

    /** Changes the model that represents the value of this spinner. */
    @stub
    def setModel(model: SpinnerModel): Unit = ???

    /** Sets the look and feel (L&F) object that renders this component. */
    @stub
    def setUI(ui: SpinnerUI): Unit = ???

    /** Changes current value of the model, typically
     *  this value is displayed by the editor.
     */
    @stub
    def setValue(value: Any): Unit = ???

    /** Resets the UI property with the value from the current look and feel. */
    @stub
    def updateUI(): Unit = ???
}

object JSpinner {
    /** An editor for a JSpinner whose model is a
     *  SpinnerDateModel.
     */
    type DateEditor = JSpinner_DateEditor

    /** A simple base class for more specialized editors
     *  that displays a read-only view of the model's current
     *  value with a JFormattedTextField.
     */
    type DefaultEditor = JSpinner_DefaultEditor

    /** An editor for a JSpinner whose model is a
     *  SpinnerListModel.
     */
    type ListEditor = JSpinner_ListEditor

    /** An editor for a JSpinner whose model is a
     *  SpinnerNumberModel.
     */
    type NumberEditor = JSpinner_NumberEditor
}
