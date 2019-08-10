package javax.swing

import java.awt.{Component, Container, ItemSelectable}
import java.awt.event.{ActionEvent, ActionListener, ItemEvent, ItemListener, KeyEvent}
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import java.util.Vector
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.event.{ListDataEvent, ListDataListener, PopupMenuListener}
import javax.swing.plaf.ComboBoxUI
import scala.scalanative.annotation.stub

/** A component that combines a button or editable field and a drop-down list.
 *  The user can select a value from the drop-down list, which appears at the
 *  user's request. If you make the combo box editable, then the combo box
 *  includes an editable field into which the user can type a value.
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
 * 
 *  
 *  See How to Use Combo Boxes
 *  in The Java Tutorial
 *  for further information.
 *  
 */
class JComboBox[E] extends JComponent with ItemSelectable with ListDataListener with ActionListener with Accessible {

    /** Creates a JComboBox with a default data model. */
    @stub
    def this() = ???

    /** Creates a JComboBox that takes its items from an
     *  existing ComboBoxModel.
     */
    @stub
    def this(aModel: ComboBoxModel[E]) = ???

    /** Creates a JComboBox that contains the elements
     *  in the specified array.
     */
    @stub
    def this(items: Array[E]) = ???

    /** Creates a JComboBox that contains the elements
     *  in the specified Vector.
     */
    @stub
    def this(items: Vector[E]) = ???

    /** This class implements accessibility support for the
     *  JComboBox class.
     */
    protected type AccessibleJComboBox = JComboBox_AccessibleJComboBox

    /** This protected field is implementation specific. */
    @stub
    protected val actionCommand: String = ???

    /** This protected field is implementation specific. */
    @stub
    protected val dataModel: ComboBoxModel[E] = ???

    /** This protected field is implementation specific. */
    @stub
    protected val editor: ComboBoxEditor = ???

    /** This protected field is implementation specific. */
    @stub
    protected val isEditable: Boolean = ???

    /** This protected field is implementation specific. */
    @stub
    protected val keySelectionManager: JComboBox.KeySelectionManager = ???

    /** This protected field is implementation specific. */
    @stub
    protected val lightWeightPopupEnabled: Boolean = ???

    /** This protected field is implementation specific. */
    @stub
    protected val maximumRowCount: Int = ???

    /** This protected field is implementation specific. */
    @stub
    protected val renderer: ListCellRenderer[_ >: E] = ???

    /** This protected field is implementation specific. */
    @stub
    protected val selectedItemReminder: Any = ???

    /** This method is public as an implementation side effect. */
    @stub
    def actionPerformed(e: ActionEvent): Unit = ???

    /** Updates the combobox's state in response to property changes in
     *  associated action.
     */
    @stub
    protected def actionPropertyChanged(action: Action, propertyName: String): Unit = ???

    /** Adds an ActionListener. */
    @stub
    def addActionListener(l: ActionListener): Unit = ???

    /** Adds an item to the item list. */
    @stub
    def addItem(item: E): Unit = ???

    /** Adds an ItemListener. */
    @stub
    def addItemListener(aListener: ItemListener): Unit = ???

    /** Adds a PopupMenu listener which will listen to notification
     *  messages from the popup portion of the combo box.
     */
    @stub
    def addPopupMenuListener(l: PopupMenuListener): Unit = ???

    /** Initializes the editor with the specified item. */
    @stub
    def configureEditor(anEditor: ComboBoxEditor, anItem: Any): Unit = ???

    /** Sets the properties on this combobox to match those in the specified
     *  Action.
     */
    @stub
    protected def configurePropertiesFromAction(a: Action): Unit = ???

    /** This method is public as an implementation side effect. */
    @stub
    def contentsChanged(e: ListDataEvent): Unit = ???

    /** Creates and returns a PropertyChangeListener that is
     *  responsible for listening for changes from the specified
     *  Action and updating the appropriate properties.
     */
    @stub
    protected def createActionPropertyChangeListener(a: Action): PropertyChangeListener = ???

    /** Returns an instance of the default key-selection manager. */
    @stub
    protected def createDefaultKeySelectionManager(): JComboBox.KeySelectionManager = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireActionEvent(): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireItemStateChanged(e: ItemEvent): Unit = ???

    /** Notifies PopupMenuListeners that the popup portion of the
     *  combo box has been canceled.
     */
    @stub
    def firePopupMenuCanceled(): Unit = ???

    /** Notifies PopupMenuListeners that the popup portion of the
     *  combo box has become invisible.
     */
    @stub
    def firePopupMenuWillBecomeInvisible(): Unit = ???

    /** Notifies PopupMenuListeners that the popup portion of the
     *  combo box will become visible.
     */
    @stub
    def firePopupMenuWillBecomeVisible(): Unit = ???

    /** Gets the AccessibleContext associated with this JComboBox. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the currently set Action for this
     *  ActionEvent source, or null if no
     *  Action is set.
     */
    @stub
    def getAction(): Action = ???

    /** Returns the action command that is included in the event sent to
     *  action listeners.
     */
    @stub
    def getActionCommand(): String = ???

    /** Returns an array of all the ActionListeners added
     *  to this JComboBox with addActionListener().
     */
    @stub
    def getActionListeners(): Array[ActionListener] = ???

    /** Returns the editor used to paint and edit the selected item in the
     *  JComboBox field.
     */
    @stub
    def getEditor(): ComboBoxEditor = ???

    /** Returns the list item at the specified index. */
    @stub
    def getItemAt(index: Int): E = ???

    /** Returns the number of items in the list. */
    @stub
    def getItemCount(): Int = ???

    /** Returns an array of all the ItemListeners added
     *  to this JComboBox with addItemListener().
     */
    @stub
    def getItemListeners(): Array[ItemListener] = ???

    /** Returns the list's key-selection manager. */
    @stub
    def getKeySelectionManager(): JComboBox.KeySelectionManager = ???

    /** Returns the maximum number of items the combo box can display
     *  without a scrollbar
     */
    @stub
    def getMaximumRowCount(): Int = ???

    /** Returns the data model currently used by the JComboBox. */
    @stub
    def getModel(): ComboBoxModel[E] = ???

    /** Returns an array of all the PopupMenuListeners added
     *  to this JComboBox with addPopupMenuListener().
     */
    @stub
    def getPopupMenuListeners(): Array[PopupMenuListener] = ???

    /** Returns the "prototypical display" value - an Object used
     *  for the calculation of the display height and width.
     */
    @stub
    def getPrototypeDisplayValue(): E = ???

    /** Returns the renderer used to display the selected item in the
     *  JComboBox field.
     */
    @stub
    def getRenderer(): ListCellRenderer[_ >: E] = ???

    /** Returns the first item in the list that matches the given item. */
    @stub
    def getSelectedIndex(): Int = ???

    /** Returns the current selected item. */
    @stub
    def getSelectedItem(): Any = ???

    /** Returns an array containing the selected item. */
    @stub
    def getSelectedObjects(): Array[Object] = ???

    /** Returns the L&F object that renders this component. */
    @stub
    def getUI(): ComboBoxUI = ???

    /** Returns the name of the L&F class that renders this component. */
    @stub
    def getUIClassID(): String = ???

    /** Causes the combo box to close its popup window. */
    @stub
    def hidePopup(): Unit = ???

    /** Inserts an item into the item list at a given index. */
    @stub
    def insertItemAt(item: E, index: Int): Unit = ???

    /**  */
    @stub
    protected def installAncestorListener(): Unit = ???

    /** This method is public as an implementation side effect. */
    @stub
    def intervalAdded(e: ListDataEvent): Unit = ???

    /** This method is public as an implementation side effect. */
    @stub
    def intervalRemoved(e: ListDataEvent): Unit = ???

    /** Returns true if the JComboBox is editable. */
    @stub
    def isEditable(): Boolean = ???

    /** Gets the value of the lightWeightPopupEnabled
     *  property.
     */
    @stub
    def isLightWeightPopupEnabled(): Boolean = ???

    /** Determines the visibility of the popup. */
    @stub
    def isPopupVisible(): Boolean = ???

    /** Returns a string representation of this JComboBox. */
    @stub
    protected def paramString(): String = ???

    /** Invoked to process the key bindings for ks as the result
     *  of the KeyEvent e.
     */
    @stub
    protected def processKeyBinding(ks: KeyStroke, e: KeyEvent, condition: Int, pressed: Boolean): Boolean = ???

    /** Handles KeyEvents, looking for the Tab key. */
    @stub
    def processKeyEvent(e: KeyEvent): Unit = ???

    /** Removes an ActionListener. */
    @stub
    def removeActionListener(l: ActionListener): Unit = ???

    /** Removes all items from the item list. */
    @stub
    def removeAllItems(): Unit = ???

    /** Removes an item from the item list. */
    @stub
    def removeItem(anObject: Any): Unit = ???

    /** Removes the item at anIndex
     *  This method works only if the JComboBox uses a
     *  mutable data model.
     */
    @stub
    def removeItemAt(anIndex: Int): Unit = ???

    /** Removes an ItemListener. */
    @stub
    def removeItemListener(aListener: ItemListener): Unit = ???

    /** Removes a PopupMenuListener. */
    @stub
    def removePopupMenuListener(l: PopupMenuListener): Unit = ???

    /** This protected method is implementation specific. */
    @stub
    protected def selectedItemChanged(): Unit = ???

    /** Selects the list item that corresponds to the specified keyboard
     *  character and returns true, if there is an item corresponding
     *  to that character.
     */
    @stub
    def selectWithKeyChar(keyChar: Char): Boolean = ???

    /** Sets the Action for the ActionEvent source. */
    @stub
    def setAction(a: Action): Unit = ???

    /** Sets the action command that should be included in the event
     *  sent to action listeners.
     */
    @stub
    def setActionCommand(aCommand: String): Unit = ???

    /** Determines whether the JComboBox field is editable. */
    @stub
    def setEditable(aFlag: Boolean): Unit = ???

    /** Sets the editor used to paint and edit the selected item in the
     *  JComboBox field.
     */
    @stub
    def setEditor(anEditor: ComboBoxEditor): Unit = ???

    /** Enables the combo box so that items can be selected. */
    @stub
    def setEnabled(b: Boolean): Unit = ???

    /** Sets the object that translates a keyboard character into a list
     *  selection.
     */
    @stub
    def setKeySelectionManager(aManager: JComboBox.KeySelectionManager): Unit = ???

    /** Sets the lightWeightPopupEnabled property, which
     *  provides a hint as to whether or not a lightweight
     *  Component should be used to contain the
     *  JComboBox, versus a heavyweight
     *  Component such as a Panel
     *  or a Window.
     */
    @stub
    def setLightWeightPopupEnabled(aFlag: Boolean): Unit = ???

    /** Sets the maximum number of rows the JComboBox displays. */
    @stub
    def setMaximumRowCount(count: Int): Unit = ???

    /** Sets the data model that the JComboBox uses to obtain
     *  the list of items.
     */
    @stub
    def setModel(aModel: ComboBoxModel[E]): Unit = ???

    /** Sets the visibility of the popup. */
    @stub
    def setPopupVisible(v: Boolean): Unit = ???

    /** Sets the prototype display value used to calculate the size of the display
     *  for the UI portion.
     */
    @stub
    def setPrototypeDisplayValue(prototypeDisplayValue: E): Unit = ???

    /** Sets the renderer that paints the list items and the item selected from the list in
     *  the JComboBox field.
     */
    @stub
    def setRenderer(aRenderer: ListCellRenderer[_ >: E]): Unit = ???

    /** Selects the item at index anIndex. */
    @stub
    def setSelectedIndex(anIndex: Int): Unit = ???

    /** Sets the selected item in the combo box display area to the object in
     *  the argument.
     */
    @stub
    def setSelectedItem(anObject: Any): Unit = ???

    /** Sets the L&F object that renders this component. */
    @stub
    def setUI(ui: ComboBoxUI): Unit = ???

    /** Causes the combo box to display its popup window. */
    @stub
    def showPopup(): Unit = ???

    /** Resets the UI property to a value from the current look and feel. */
    @stub
    def updateUI(): Unit = ???
}

object JComboBox {
    /** The interface that defines a KeySelectionManager. */
    type KeySelectionManager = JComboBox_KeySelectionManager
}
