package javax.swing

import java.awt.event.{ActionEvent, ActionListener, ItemEvent, ItemListener}
import java.io.Serializable
import java.lang.{Class, Object, String}
import java.util.EventListener
import javax.swing.event.{ChangeEvent, ChangeListener, EventListenerList}
import scala.scalanative.annotation.stub

/** The default implementation of a Button component's data model.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing. As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class DefaultButtonModel extends Object with ButtonModel with Serializable {

    /** Constructs a DefaultButtonModel. */
    @stub
    def this() = ???

    /** The action command string fired by the button. */
    @stub
    protected val actionCommand: String = ???

    /** Only one ChangeEvent is needed per button model
     *  instance since the event's only state is the source property.
     */
    @stub
    protected val changeEvent: ChangeEvent = ???

    /** The button group that the button belongs to. */
    @stub
    protected val group: ButtonGroup = ???

    /** Stores the listeners on this model. */
    @stub
    protected val listenerList: EventListenerList = ???

    /** The button's mnemonic. */
    @stub
    protected val mnemonic: Int = ???

    /** The bitmask used to store the state of the button. */
    @stub
    protected val stateMask: Int = ???

    /** Adds an ActionListener to the model. */
    @stub
    def addActionListener(l: ActionListener): Unit = ???

    /** Adds a ChangeListener to the model. */
    @stub
    def addChangeListener(l: ChangeListener): Unit = ???

    /** Adds an ItemListener to the model. */
    @stub
    def addItemListener(l: ItemListener): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireActionPerformed(e: ActionEvent): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireItemStateChanged(e: ItemEvent): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireStateChanged(): Unit = ???

    /** Returns the action command string for the button. */
    @stub
    def getActionCommand(): String = ???

    /** Returns an array of all the action listeners
     *  registered on this DefaultButtonModel.
     */
    @stub
    def getActionListeners(): Array[ActionListener] = ???

    /** Returns an array of all the change listeners
     *  registered on this DefaultButtonModel.
     */
    @stub
    def getChangeListeners(): Array[ChangeListener] = ???

    /** Returns the group that the button belongs to. */
    @stub
    def getGroup(): ButtonGroup = ???

    /** Returns an array of all the item listeners
     *  registered on this DefaultButtonModel.
     */
    @stub
    def getItemListeners(): Array[ItemListener] = ???

    /** Returns an array of all the objects currently registered as
     *  FooListeners
     *  upon this model.
     */
    @stub
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T] = ???

    /** Gets the keyboard mnemonic for the button. */
    @stub
    def getMnemonic(): Int = ???

    /** Overridden to return null. */
    @stub
    def getSelectedObjects(): Array[Object] = ???

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
    def setActionCommand(actionCommand: String): Unit = ???

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

object DefaultButtonModel {
    /** Identifies the "armed" bit in the bitmask, which
     *  indicates partial commitment towards choosing/triggering
     *  the button.
     */
    @stub
    val ARMED: Int = ???

    /** Identifies the "enabled" bit in the bitmask, which
     *  indicates that the button can be selected by
     *  an input device (such as a mouse pointer).
     */
    @stub
    val ENABLED: Int = ???

    /** Identifies the "pressed" bit in the bitmask, which
     *  indicates that the button is pressed.
     */
    @stub
    val PRESSED: Int = ???

    /** Identifies the "rollover" bit in the bitmask, which
     *  indicates that the mouse is over the button.
     */
    @stub
    val ROLLOVER: Int = ???

    /** Identifies the "selected" bit in the bitmask, which
     *  indicates that the button has been selected.
     */
    @stub
    val SELECTED: Int = ???
}
