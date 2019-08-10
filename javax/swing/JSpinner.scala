package javax.swing

import java.awt.{Component, Component.AccessibleAWTComponent, Component.BaselineResizeBehavior, Container, Container.AccessibleAWTContainer, Dimension, LayoutManager, Point, Rectangle}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.{Number, Object, String}
import java.text.{DecimalFormat, SimpleDateFormat}
import javax.accessibility.{Accessible, AccessibleAction, AccessibleContext, AccessibleEditableText, AccessibleRole, AccessibleText, AccessibleValue}
import javax.swing.event.{ChangeEvent, ChangeListener}
import javax.swing.plaf.SpinnerUI
import javax.swing.text.AttributeSet
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
    protected class AccessibleJSpinner extends JComponent.AccessibleJComponent with AccessibleValue with AccessibleAction with AccessibleText with AccessibleEditableText with ChangeListener {

        /** AccessibleJSpinner constructor */
        @stub
        protected def this() = ???

        /** Cuts the text between two indices into the system clipboard. */
        @stub
        def cut(startIndex: Int, endIndex: Int): Unit = ???

        /** Deletes the text between two indices */
        @stub
        def delete(startIndex: Int, endIndex: Int): Unit = ???

        /** Performs the specified Action on the object */
        @stub
        def doAccessibleAction(i: Int): Boolean = ???

        /** Gets the AccessibleAction associated with this object that supports
         *  one or more actions.
         */
        @stub
        def getAccessibleAction(): AccessibleAction = ???

        /** Returns the number of accessible actions available in this object
         *  If there are more than one, the first one is considered the "default"
         *  action of the object.
         */
        @stub
        def getAccessibleActionCount(): Int = ???

        /** Returns a description of the specified action of the object. */
        @stub
        def getAccessibleActionDescription(i: Int): String = ???

        /** Returns the specified Accessible child of the object. */
        @stub
        def getAccessibleChild(i: Int): Accessible = ???

        /** Returns the number of accessible children of the object. */
        @stub
        def getAccessibleChildrenCount(): Int = ???

        /** Gets the role of this object. */
        @stub
        def getAccessibleRole(): AccessibleRole = ???

        /** Gets the AccessibleText associated with this object presenting
         *  text on the display.
         */
        @stub
        def getAccessibleText(): AccessibleText = ???

        /** Gets the AccessibleValue associated with this object. */
        @stub
        def getAccessibleValue(): AccessibleValue = ???

        /** Returns the String after a given index. */
        @stub
        def getAfterIndex(part: Int, index: Int): String = ???

        /** Returns the String at a given index. */
        @stub
        def getAtIndex(part: Int, index: Int): String = ???

        /** Returns the String before a given index. */
        @stub
        def getBeforeIndex(part: Int, index: Int): String = ???

        /** Returns the zero-based offset of the caret. */
        @stub
        def getCaretPosition(): Int = ???

        /** Returns the AttributeSet for a given character at a given index */
        @stub
        def getCharacterAttribute(i: Int): AttributeSet = ???

        /** Determines the bounding box of the character at the given
         *  index into the string.
         */
        @stub
        def getCharacterBounds(i: Int): Rectangle = ???

        /** Returns the number of characters (valid indicies) */
        @stub
        def getCharCount(): Int = ???

        /** Get the value of this object as a Number. */
        @stub
        def getCurrentAccessibleValue(): Number = ???

        /** Given a point in local coordinates, return the zero-based index
         *  of the character under that Point.
         */
        @stub
        def getIndexAtPoint(p: Point): Int = ???

        /** Get the maximum value of this object as a Number. */
        @stub
        def getMaximumAccessibleValue(): Number = ???

        /** Get the minimum value of this object as a Number. */
        @stub
        def getMinimumAccessibleValue(): Number = ???

        /** Returns the portion of the text that is selected. */
        @stub
        def getSelectedText(): String = ???

        /** Returns the end offset within the selected text. */
        @stub
        def getSelectionEnd(): Int = ???

        /** Returns the start offset within the selected text. */
        @stub
        def getSelectionStart(): Int = ???

        /** Returns the text string between two indices. */
        @stub
        def getTextRange(startIndex: Int, endIndex: Int): String = ???

        /** Inserts the specified string at the given index/ */
        @stub
        def insertTextAtIndex(index: Int, s: String): Unit = ???

        /** Pastes the text from the system clipboard into the text
         *  starting at the specified index.
         */
        @stub
        def paste(startIndex: Int): Unit = ???

        /** Replaces the text between two indices with the specified
         *  string.
         */
        @stub
        def replaceText(startIndex: Int, endIndex: Int, s: String): Unit = ???

        /** Selects the text between two indices. */
        @stub
        def selectText(startIndex: Int, endIndex: Int): Unit = ???

        /** Sets attributes for the text between two indices. */
        @stub
        def setAttributes(startIndex: Int, endIndex: Int, as: AttributeSet): Unit = ???

        /** Set the value of this object as a Number. */
        @stub
        def setCurrentAccessibleValue(n: Number): Boolean = ???

        /** Sets the text contents to the specified string. */
        @stub
        def setTextContents(s: String): Unit = ???

        /** Invoked when the target of the listener has changed its state. */
        @stub
        def stateChanged(e: ChangeEvent): Unit = ???
    }


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
     *  SpinnerDateModel.  The value of the editor is
     *  displayed with a JFormattedTextField whose format
     *  is defined by a DateFormatter instance whose
     *  minimum and maximum properties
     *  are mapped to the SpinnerDateModel.
     */
    object DateEditor extends JSpinner.DefaultEditor {

        /** Construct a JSpinner editor that supports displaying
         *  and editing the value of a SpinnerDateModel
         *  with a JFormattedTextField.
         */
        @stub
        def apply(spinner: JSpinner) = ???

        /** Construct a JSpinner editor that supports displaying
         *  and editing the value of a SpinnerDateModel
         *  with a JFormattedTextField.
         */
        @stub
        def apply(spinner: JSpinner, dateFormatPattern: String) = ???

        /** Returns the java.text.SimpleDateFormat object the
         *  JFormattedTextField uses to parse and format
         *  numbers.
         */
        @stub
        def getFormat(): SimpleDateFormat = ???

        /** Return our spinner ancestor's SpinnerDateModel. */
        @stub
        def getModel(): SpinnerDateModel = ???
    }


    /** A simple base class for more specialized editors
     *  that displays a read-only view of the model's current
     *  value with a JFormattedTextField.  Subclasses
     *  can configure the JFormattedTextField to create
     *  an editor that's appropriate for the type of model they
     *  support and they may want to override
     *  the stateChanged and propertyChanged
     *  methods, which keep the model and the text field in sync.
     *  
     *  This class defines a dismiss method that removes the
     *  editors ChangeListener from the JSpinner
     *  that it's part of.   The setEditor method knows about
     *  DefaultEditor.dismiss, so if the developer
     *  replaces an editor that's derived from JSpinner.DefaultEditor
     *  its ChangeListener connection back to the
     *  JSpinner will be removed.  However after that,
     *  it's up to the developer to manage their editor listeners.
     *  Similarly, if a subclass overrides createEditor,
     *  it's up to the subclasser to deal with their editor
     *  subsequently being replaced (with setEditor).
     *  We expect that in most cases, and in editor installed
     *  with setEditor or created by a createEditor
     *  override, will not be replaced anyway.
     *  
     *  This class is the LayoutManager for it's single
     *  JFormattedTextField child.   By default the
     *  child is just centered with the parents insets.
     */
    object DefaultEditor extends JPanel with ChangeListener with PropertyChangeListener with LayoutManager {

        /** Constructs an editor component for the specified JSpinner. */
        @stub
        def apply(spinner: JSpinner) = ???

        /** This LayoutManager method does nothing. */
        @stub
        def addLayoutComponent(name: String, child: Component): Unit = ???

        /** Pushes the currently edited value to the SpinnerModel. */
        @stub
        def commitEdit(): Unit = ???

        /** Disconnect this editor from the specified
         *  JSpinner.
         */
        @stub
        def dismiss(spinner: JSpinner): Unit = ???

        /** Returns the baseline. */
        @stub
        def getBaseline(width: Int, height: Int): Int = ???

        /** Returns an enum indicating how the baseline of the component
         *  changes as the size changes.
         */
        @stub
        def getBaselineResizeBehavior(): Component.BaselineResizeBehavior = ???

        /** Returns the JSpinner ancestor of this editor or
         *  null if none of the ancestors are a
         *  JSpinner.
         */
        @stub
        def getSpinner(): JSpinner = ???

        /** Returns the JFormattedTextField child of this
         *  editor.
         */
        @stub
        def getTextField(): JFormattedTextField = ???

        /** Resize the one (and only) child to completely fill the area
         *  within the parents insets.
         */
        @stub
        def layoutContainer(parent: Container): Unit = ???

        /** Returns the minimum size of first (and only) child plus the
         *  size of the parents insets.
         */
        @stub
        def minimumLayoutSize(parent: Container): Dimension = ???

        /** Returns the preferred size of first (and only) child plus the
         *  size of the parents insets.
         */
        @stub
        def preferredLayoutSize(parent: Container): Dimension = ???

        /** Called by the JFormattedTextField
         *  PropertyChangeListener.
         */
        @stub
        def propertyChange(e: PropertyChangeEvent): Unit = ???

        /** This LayoutManager method does nothing. */
        @stub
        def removeLayoutComponent(child: Component): Unit = ???

        /** This method is called when the spinner's model's state changes. */
        @stub
        def stateChanged(e: ChangeEvent): Unit = ???
    }


    /** An editor for a JSpinner whose model is a
     *  SpinnerListModel.
     */
    object ListEditor extends JSpinner.DefaultEditor {

        /** Construct a JSpinner editor that supports displaying
         *  and editing the value of a SpinnerListModel
         *  with a JFormattedTextField.
         */
        @stub
        def apply(spinner: JSpinner) = ???

        /** Return our spinner ancestor's SpinnerNumberModel. */
        @stub
        def getModel(): SpinnerListModel = ???
    }


    /** An editor for a JSpinner whose model is a
     *  SpinnerNumberModel.  The value of the editor is
     *  displayed with a JFormattedTextField whose format
     *  is defined by a NumberFormatter instance whose
     *  minimum and maximum properties
     *  are mapped to the SpinnerNumberModel.
     */
    object NumberEditor extends JSpinner.DefaultEditor {

        /** Construct a JSpinner editor that supports displaying
         *  and editing the value of a SpinnerNumberModel
         *  with a JFormattedTextField.
         */
        @stub
        def apply(spinner: JSpinner) = ???

        /** Construct a JSpinner editor that supports displaying
         *  and editing the value of a SpinnerNumberModel
         *  with a JFormattedTextField.
         */
        @stub
        def apply(spinner: JSpinner, decimalFormatPattern: String) = ???

        /** Returns the java.text.DecimalFormat object the
         *  JFormattedTextField uses to parse and format
         *  numbers.
         */
        @stub
        def getFormat(): DecimalFormat = ???

        /** Return our spinner ancestor's SpinnerNumberModel. */
        @stub
        def getModel(): SpinnerNumberModel = ???
    }

}
