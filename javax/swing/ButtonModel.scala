package javax.swing

import java.awt.ItemSelectable
import java.awt.event.{ActionListener, ItemListener}
import java.lang.String
import javax.swing.event.ChangeListener

// State model for buttons.
// 
// This model is used for regular buttons, as well as check boxes
// and radio buttons, which are special kinds of buttons. In practice,
// a button's UI takes the responsibility of calling methods on its
// model to manage the state, as detailed below:
// 
// In simple terms, pressing and releasing the mouse over a regular
// button triggers the button and causes and ActionEvent
// to be fired. The same behavior can be produced via a keyboard key
// defined by the look and feel of the button (typically the SPACE BAR).
// Pressing and releasing this key while the button has
// focus will give the same results. For check boxes and radio buttons, the
// mouse or keyboard equivalent sequence just described causes the button
// to become selected.
// 
// In details, the state model for buttons works as follows
// when used with the mouse:
// 
// Pressing the mouse on top of a button makes the model both
// armed and pressed. As long as the mouse remains down,
// the model remains pressed, even if the mouse moves
// outside the button. On the contrary, the model is only
// armed while the mouse remains pressed within the bounds of
// the button (it can move in or out of the button, but the model
// is only armed during the portion of time spent within the button).
// A button is triggered, and an ActionEvent is fired,
// when the mouse is released while the model is armed
// - meaning when it is released over top of the button after the mouse
// has previously been pressed on that button (and not already released).
// Upon mouse release, the model becomes unarmed and unpressed.
// 
// In details, the state model for buttons works as follows
// when used with the keyboard:
// 
// Pressing the look and feel defined keyboard key while the button
// has focus makes the model both armed and pressed. As long as this key
// remains down, the model remains in this state. Releasing the key sets
// the model to unarmed and unpressed, triggers the button, and causes an
// ActionEvent to be fired.
trait ButtonModel extends ItemSelectable {

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
    // Returns the action command string for the button.
    def getActionCommand(): String = ???

    @stub
    // Gets the keyboard mnemonic for the button.
    def getMnemonic(): Int = ???

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
    def setActionCommand(s: String): Unit = ???

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
