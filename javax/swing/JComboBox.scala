package javax.swing

import java.awt.{Component, Container, ItemSelectable}
import java.awt.event.{ActionEvent, ActionListener, ItemEvent, ItemListener, KeyEvent}
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.event.{ListDataEvent, ListDataListener, PopupMenuListener}
import javax.swing.plaf.ComboBoxUI

// A component that combines a button or editable field and a drop-down list.
// The user can select a value from the drop-down list, which appears at the
// user's request. If you make the combo box editable, then the combo box
// includes an editable field into which the user can type a value.
// 
// Warning: Swing is not thread safe. For more
// information see Swing's Threading
// Policy.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
//
// 
// See How to Use Combo Boxes
// in The Java Tutorial
// for further information.
// 
class JComboBox[E] extends JComponent with ItemSelectable, with ListDataListener, with ActionListener, with Accessible {

    @stub
    // Creates a JComboBox with a default data model.
    def this() = ???

    @stub
    // Creates a JComboBox that takes its items from an
    // existing ComboBoxModel.
    def this(aModel: ComboBoxModel[E]) = ???

    @stub
    // Creates a JComboBox that contains the elements
    // in the specified array.
    def this(items: Array[E]) = ???

    @stub
    // This class implements accessibility support for the
    // JComboBox class.
    protected def JComboBox.AccessibleJComboBox: class = ???

    @stub
    // This protected field is implementation specific.
    protected def actionCommand: String = ???

    @stub
    // This protected field is implementation specific.
    protected def dataModel: ComboBoxModel[E] = ???

    @stub
    // This protected field is implementation specific.
    protected def editor: ComboBoxEditor = ???

    @stub
    // This protected field is implementation specific.
    protected def isEditable: Boolean = ???

    @stub
    // This protected field is implementation specific.
    protected def keySelectionManager: JComboBox.KeySelectionManager = ???

    @stub
    // This protected field is implementation specific.
    protected def lightWeightPopupEnabled: Boolean = ???

    @stub
    // This protected field is implementation specific.
    protected def maximumRowCount: Int = ???

    @stub
    // This protected field is implementation specific.
    protected def renderer: ListCellRenderer[_ >: E] = ???

    @stub
    // This method is public as an implementation side effect.
    def actionPerformed(e: ActionEvent): Unit = ???

    @stub
    // Updates the combobox's state in response to property changes in
    // associated action.
    protected def actionPropertyChanged(action: Action, propertyName: String): Unit = ???

    @stub
    // Adds an ActionListener.
    def addActionListener(l: ActionListener): Unit = ???

    @stub
    // Adds an item to the item list.
    def addItem(item: E): Unit = ???

    @stub
    // Adds an ItemListener.
    def addItemListener(aListener: ItemListener): Unit = ???

    @stub
    // Adds a PopupMenu listener which will listen to notification
    // messages from the popup portion of the combo box.
    def addPopupMenuListener(l: PopupMenuListener): Unit = ???

    @stub
    // Initializes the editor with the specified item.
    def configureEditor(anEditor: ComboBoxEditor, anItem: Object): Unit = ???

    @stub
    // Sets the properties on this combobox to match those in the specified
    // Action.
    protected def configurePropertiesFromAction(a: Action): Unit = ???

    @stub
    // This method is public as an implementation side effect.
    def contentsChanged(e: ListDataEvent): Unit = ???

    @stub
    // Creates and returns a PropertyChangeListener that is
    // responsible for listening for changes from the specified
    // Action and updating the appropriate properties.
    protected def createActionPropertyChangeListener(a: Action): PropertyChangeListener = ???

    @stub
    // Returns an instance of the default key-selection manager.
    protected def createDefaultKeySelectionManager(): JComboBox.KeySelectionManager = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireActionEvent(): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireItemStateChanged(e: ItemEvent): Unit = ???

    @stub
    // Notifies PopupMenuListeners that the popup portion of the
    // combo box has been canceled.
    def firePopupMenuCanceled(): Unit = ???

    @stub
    // Notifies PopupMenuListeners that the popup portion of the
    // combo box has become invisible.
    def firePopupMenuWillBecomeInvisible(): Unit = ???

    @stub
    // Notifies PopupMenuListeners that the popup portion of the
    // combo box will become visible.
    def firePopupMenuWillBecomeVisible(): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this JComboBox.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the currently set Action for this
    // ActionEvent source, or null if no
    // Action is set.
    def getAction(): Action = ???

    @stub
    // Returns the action command that is included in the event sent to
    // action listeners.
    def getActionCommand(): String = ???

    @stub
    // Returns an array of all the ActionListeners added
    // to this JComboBox with addActionListener().
    def getActionListeners(): Array[ActionListener] = ???

    @stub
    // Returns the editor used to paint and edit the selected item in the
    // JComboBox field.
    def getEditor(): ComboBoxEditor = ???

    @stub
    // Returns the list item at the specified index.
    def getItemAt(index: Int): E = ???

    @stub
    // Returns the number of items in the list.
    def getItemCount(): Int = ???

    @stub
    // Returns an array of all the ItemListeners added
    // to this JComboBox with addItemListener().
    def getItemListeners(): Array[ItemListener] = ???

    @stub
    // Returns the list's key-selection manager.
    def getKeySelectionManager(): JComboBox.KeySelectionManager = ???

    @stub
    // Returns the maximum number of items the combo box can display
    // without a scrollbar
    def getMaximumRowCount(): Int = ???

    @stub
    // Returns the data model currently used by the JComboBox.
    def getModel(): ComboBoxModel[E] = ???

    @stub
    // Returns an array of all the PopupMenuListeners added
    // to this JComboBox with addPopupMenuListener().
    def getPopupMenuListeners(): Array[PopupMenuListener] = ???

    @stub
    // Returns the "prototypical display" value - an Object used
    // for the calculation of the display height and width.
    def getPrototypeDisplayValue(): E = ???

    @stub
    // Returns the renderer used to display the selected item in the
    // JComboBox field.
    def getRenderer(): ListCellRenderer[_ >: E] = ???

    @stub
    // Returns the first item in the list that matches the given item.
    def getSelectedIndex(): Int = ???

    @stub
    // Returns the current selected item.
    def getSelectedItem(): Object = ???

    @stub
    // Returns an array containing the selected item.
    def getSelectedObjects(): Array[Object] = ???

    @stub
    // Returns the L&F object that renders this component.
    def getUI(): ComboBoxUI = ???

    @stub
    // Returns the name of the L&F class that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Causes the combo box to close its popup window.
    def hidePopup(): Unit = ???

    @stub
    // Inserts an item into the item list at a given index.
    def insertItemAt(item: E, index: Int): Unit = ???

    @stub
    // 
    protected def installAncestorListener(): Unit = ???

    @stub
    // This method is public as an implementation side effect.
    def intervalAdded(e: ListDataEvent): Unit = ???

    @stub
    // This method is public as an implementation side effect.
    def intervalRemoved(e: ListDataEvent): Unit = ???

    @stub
    // Returns true if the JComboBox is editable.
    def isEditable(): Boolean = ???

    @stub
    // Gets the value of the lightWeightPopupEnabled
    // property.
    def isLightWeightPopupEnabled(): Boolean = ???

    @stub
    // Determines the visibility of the popup.
    def isPopupVisible(): Boolean = ???

    @stub
    // Returns a string representation of this JComboBox.
    protected def paramString(): String = ???

    @stub
    // Invoked to process the key bindings for ks as the result
    // of the KeyEvent e.
    protected def processKeyBinding(ks: KeyStroke, e: KeyEvent, condition: Int, pressed: Boolean): Boolean = ???

    @stub
    // Handles KeyEvents, looking for the Tab key.
    def processKeyEvent(e: KeyEvent): Unit = ???

    @stub
    // Removes an ActionListener.
    def removeActionListener(l: ActionListener): Unit = ???

    @stub
    // Removes all items from the item list.
    def removeAllItems(): Unit = ???

    @stub
    // Removes an item from the item list.
    def removeItem(anObject: Object): Unit = ???

    @stub
    // Removes the item at anIndex
    // This method works only if the JComboBox uses a
    // mutable data model.
    def removeItemAt(anIndex: Int): Unit = ???

    @stub
    // Removes an ItemListener.
    def removeItemListener(aListener: ItemListener): Unit = ???

    @stub
    // Removes a PopupMenuListener.
    def removePopupMenuListener(l: PopupMenuListener): Unit = ???

    @stub
    // This protected method is implementation specific.
    protected def selectedItemChanged(): Unit = ???

    @stub
    // Selects the list item that corresponds to the specified keyboard
    // character and returns true, if there is an item corresponding
    // to that character.
    def selectWithKeyChar(keyChar: Char): Boolean = ???

    @stub
    // Sets the Action for the ActionEvent source.
    def setAction(a: Action): Unit = ???

    @stub
    // Sets the action command that should be included in the event
    // sent to action listeners.
    def setActionCommand(aCommand: String): Unit = ???

    @stub
    // Determines whether the JComboBox field is editable.
    def setEditable(aFlag: Boolean): Unit = ???

    @stub
    // Sets the editor used to paint and edit the selected item in the
    // JComboBox field.
    def setEditor(anEditor: ComboBoxEditor): Unit = ???

    @stub
    // Enables the combo box so that items can be selected.
    def setEnabled(b: Boolean): Unit = ???

    @stub
    // Sets the object that translates a keyboard character into a list
    // selection.
    def setKeySelectionManager(aManager: JComboBox.KeySelectionManager): Unit = ???

    @stub
    // Sets the lightWeightPopupEnabled property, which
    // provides a hint as to whether or not a lightweight
    // Component should be used to contain the
    // JComboBox, versus a heavyweight
    // Component such as a Panel
    // or a Window.
    def setLightWeightPopupEnabled(aFlag: Boolean): Unit = ???

    @stub
    // Sets the maximum number of rows the JComboBox displays.
    def setMaximumRowCount(count: Int): Unit = ???

    @stub
    // Sets the data model that the JComboBox uses to obtain
    // the list of items.
    def setModel(aModel: ComboBoxModel[E]): Unit = ???

    @stub
    // Sets the visibility of the popup.
    def setPopupVisible(v: Boolean): Unit = ???

    @stub
    // Sets the prototype display value used to calculate the size of the display
    // for the UI portion.
    def setPrototypeDisplayValue(prototypeDisplayValue: E): Unit = ???

    @stub
    // Sets the renderer that paints the list items and the item selected from the list in
    // the JComboBox field.
    def setRenderer(aRenderer: ListCellRenderer[_ >: E]): Unit = ???

    @stub
    // Selects the item at index anIndex.
    def setSelectedIndex(anIndex: Int): Unit = ???

    @stub
    // Sets the selected item in the combo box display area to the object in
    // the argument.
    def setSelectedItem(anObject: Object): Unit = ???

    @stub
    // Sets the L&F object that renders this component.
    def setUI(ui: ComboBoxUI): Unit = ???

    @stub
    // Causes the combo box to display its popup window.
    def showPopup(): Unit = ???
}
