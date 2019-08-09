package javax.swing

import java.awt.event.{ActionEvent, ActionListener, ItemEvent, ItemListener}
import java.io.Serializable
import java.lang.{Class, Object, String}
import java.util.EventListener
import javax.swing.event.{ChangeEvent, ChangeListener, EventListenerList}

// The default implementation of a Button component's data model.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing. As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class DefaultButtonModel extends Object with ButtonModel, with Serializable {

    @stub
    // The action command string fired by the button.
    protected def actionCommand: String = ???

    @stub
    // Only one ChangeEvent is needed per button model
    // instance since the event's only state is the source property.
    protected def changeEvent: ChangeEvent = ???

    @stub
    // The button group that the button belongs to.
    protected def group: ButtonGroup = ???

    @stub
    // Stores the listeners on this model.
    protected def listenerList: EventListenerList = ???

    @stub
    // The button's mnemonic.
    protected def mnemonic: Int = ???

    @stub
    // Adds an ActionListener to the model.
    def addActionListener(l: ActionListener): Unit = ???

    @stub
    // Adds a ChangeListener to the model.
    def addChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Adds an ItemListener to the model.
    def addItemListener(l: ItemListener): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireActionPerformed(e: ActionEvent): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireItemStateChanged(e: ItemEvent): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireStateChanged(): Unit = ???

    @stub
    // Returns the action command string for the button.
    def getActionCommand(): String = ???

    @stub
    // Returns an array of all the action listeners
    // registered on this DefaultButtonModel.
    def getActionListeners(): Array[ActionListener] = ???

    @stub
    // Returns an array of all the change listeners
    // registered on this DefaultButtonModel.
    def getChangeListeners(): Array[ChangeListener] = ???

    @stub
    // Returns the group that the button belongs to.
    def getGroup(): ButtonGroup = ???

    @stub
    // Returns an array of all the item listeners
    // registered on this DefaultButtonModel.
    def getItemListeners(): Array[ItemListener] = ???

    @stub
    // Returns an array of all the objects currently registered as
    // FooListeners
    // upon this model.
    def Array[T]: [T <: EventListener] = ???

    @stub
    // Gets the keyboard mnemonic for the button.
    def getMnemonic(): Int = ???

    @stub
    // Overridden to return null.
    def getSelectedObjects(): Array[Object] = ???

    @stub
    // Indicates partial commitment towards triggering the
    // button.
    def isArmed(): Boolean = ???

    @stub
    // Indicates if the button can be selected or triggered by
    // an input device, such as a mouse pointer.
    def isEnabled(): Boolean = ???

    @stub
    // Indicates if the button is pressed.
    def isPressed(): Boolean = ???

    @stub
    // Indicates that the mouse is over the button.
    def isRollover(): Boolean = ???

    @stub
    // Indicates if the button has been selected.
    def isSelected(): Boolean = ???

    @stub
    // Removes an ActionListener from the model.
    def removeActionListener(l: ActionListener): Unit = ???

    @stub
    // Removes a ChangeListener from the model.
    def removeChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Removes an ItemListener from the model.
    def removeItemListener(l: ItemListener): Unit = ???

    @stub
    // Sets the action command string that gets sent as part of the
    // ActionEvent when the button is triggered.
    def setActionCommand(actionCommand: String): Unit = ???

    @stub
    // Marks the button as armed or unarmed.
    def setArmed(b: Boolean): Unit = ???

    @stub
    // Enables or disables the button.
    def setEnabled(b: Boolean): Unit = ???

    @stub
    // Identifies the group the button belongs to --
    // needed for radio buttons, which are mutually
    // exclusive within their group.
    def setGroup(group: ButtonGroup): Unit = ???

    @stub
    // Sets the keyboard mnemonic (shortcut key or
    // accelerator key) for the button.
    def setMnemonic(key: Int): Unit = ???

    @stub
    // Sets the button to pressed or unpressed.
    def setPressed(b: Boolean): Unit = ???

    @stub
    // Sets or clears the button's rollover state
    def setRollover(b: Boolean): Unit = ???
}

object DefaultButtonModel {
    @stub
    // Identifies the "armed" bit in the bitmask, which
    // indicates partial commitment towards choosing/triggering
    // the button.
    def ARMED: Int = ???

    @stub
    // Identifies the "enabled" bit in the bitmask, which
    // indicates that the button can be selected by
    // an input device (such as a mouse pointer).
    def ENABLED: Int = ???

    @stub
    // Identifies the "pressed" bit in the bitmask, which
    // indicates that the button is pressed.
    def PRESSED: Int = ???

    @stub
    // Identifies the "rollover" bit in the bitmask, which
    // indicates that the mouse is over the button.
    def ROLLOVER: Int = ???

    @stub
    // Identifies the "selected" bit in the bitmask, which
    // indicates that the button has been selected.
    def SELECTED: Int = ???
}
