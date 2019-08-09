package javax.swing

import java.awt.ItemSelectable
import java.awt.event.{ActionListener, ItemListener}
import java.lang.String
import javax.swing.event.ChangeListener
import scala.scalanative.annotation.stub

/** State model for buttons.
 *  
 *  This model is used for regular buttons, as well as check boxes
 *  and radio buttons, which are special kinds of buttons. In practice,
 *  a button's UI takes the responsibility of calling methods on its
 *  model to manage the state, as detailed below:
 *  
 *  In simple terms, pressing and releasing the mouse over a regular
 *  button triggers the button and causes and ActionEvent
 *  to be fired. The same behavior can be produced via a keyboard key
 *  defined by the look and feel of the button (typically the SPACE BAR).
 *  Pressing and releasing this key while the button has
 *  focus will give the same results. For check boxes and radio buttons, the
 *  mouse or keyboard equivalent sequence just described causes the button
 *  to become selected.
 *  
 *  In details, the state model for buttons works as follows
 *  when used with the mouse:
 *  
 *  Pressing the mouse on top of a button makes the model both
 *  armed and pressed. As long as the mouse remains down,
 *  the model remains pressed, even if the mouse moves
 *  outside the button. On the contrary, the model is only
 *  armed while the mouse remains pressed within the bounds of
 *  the button (it can move in or out of the button, but the model
 *  is only armed during the portion of time spent within the button).
 *  A button is triggered, and an ActionEvent is fired,
 *  when the mouse is released while the model is armed
 *  - meaning when it is released over top of the button after the mouse
 *  has previously been pressed on that button (and not already released).
 *  Upon mouse release, the model becomes unarmed and unpressed.
 *  
 *  In details, the state model for buttons works as follows
 *  when used with the keyboard:
 *  
 *  Pressing the look and feel defined keyboard key while the button
 *  has focus makes the model both armed and pressed. As long as this key
 *  remains down, the model remains in this state. Releasing the key sets
 *  the model to unarmed and unpressed, triggers the button, and causes an
 *  ActionEvent to be fired.
 */
trait ButtonModel extends ItemSelectable {

    /** Adds an ActionListener to the model. */
    @stub
    def addActionListener(l: ActionListener): Unit = ???

    /** Adds a ChangeListener to the model. */
    @stub
    def addChangeListener(l: ChangeListener): Unit = ???

    /** Adds an ItemListener to the model. */
    @stub
    def addItemListener(l: ItemListener): Unit = ???

    /** Returns the action command string for the button. */
    @stub
    def getActionCommand(): String = ???

    /** Gets the keyboard mnemonic for the button. */
    @stub
    def getMnemonic(): Int = ???

    /** Indicates partial commitment towards triggering the
     *  button.
     */
    @stub
    def isArmed(): Boolean = ???

    /** Indicates if the button can be selected or triggered by
     *  an input device, such as a mouse pointer.
     */
    @stub
    def isEnabled(): Boolean = ???

    /** Indicates if the button is pressed. */
    @stub
    def isPressed(): Boolean = ???

    /** Indicates that the mouse is over the button. */
    @stub
    def isRollover(): Boolean = ???

    /** Indicates if the button has been selected. */
    @stub
    def isSelected(): Boolean = ???

    /** Removes an ActionListener from the model. */
    @stub
    def removeActionListener(l: ActionListener): Unit = ???

    /** Removes a ChangeListener from the model. */
    @stub
    def removeChangeListener(l: ChangeListener): Unit = ???

    /** Removes an ItemListener from the model. */
    @stub
    def removeItemListener(l: ItemListener): Unit = ???

    /** Sets the action command string that gets sent as part of the
     *  ActionEvent when the button is triggered.
     */
    @stub
    def setActionCommand(s: String): Unit = ???

    /** Marks the button as armed or unarmed. */
    @stub
    def setArmed(b: Boolean): Unit = ???

    /** Enables or disables the button. */
    @stub
    def setEnabled(b: Boolean): Unit = ???

    /** Identifies the group the button belongs to --
     *  needed for radio buttons, which are mutually
     *  exclusive within their group.
     */
    @stub
    def setGroup(group: ButtonGroup): Unit = ???

    /** Sets the keyboard mnemonic (shortcut key or
     *  accelerator key) for the button.
     */
    @stub
    def setMnemonic(key: Int): Unit = ???

    /** Sets the button to pressed or unpressed. */
    @stub
    def setPressed(b: Boolean): Unit = ???

    /** Sets or clears the button's rollover state */
    @stub
    def setRollover(b: Boolean): Unit = ???

    /** Selects or deselects the button. */
    @stub
    def setSelected(b: Boolean): Unit = ???
}
