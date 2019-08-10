package java.awt

import java.awt.event.{ItemEvent, ItemListener}
import java.lang.{Class, Number, Object, String}
import java.util.EventListener
import javax.accessibility.{Accessible, AccessibleAction, AccessibleContext, AccessibleRole, AccessibleValue}
import scala.scalanative.annotation.stub

/** This class represents a check box that can be included in a menu.
 *  Selecting the check box in the menu changes its state from
 *  "on" to "off" or from "off" to "on."
 *  
 *  The following picture depicts a menu which contains an instance
 *  of CheckBoxMenuItem:
 *  
 *  
 *  
 *  The item labeled Check shows a check box menu item
 *  in its "off" state.
 *  
 *  When a check box menu item is selected, AWT sends an item event to
 *  the item. Since the event is an instance of ItemEvent,
 *  the processEvent method examines the event and passes
 *  it along to processItemEvent. The latter method redirects
 *  the event to any ItemListener objects that have
 *  registered an interest in item events generated by this menu item.
 */
class CheckboxMenuItem extends MenuItem with ItemSelectable with Accessible {

    /** Create a check box menu item with an empty label. */
    @stub
    def this() = ???

    /** Create a check box menu item with the specified label. */
    @stub
    def this(label: String) = ???

    /** Create a check box menu item with the specified label and state. */
    @stub
    def this(label: String, state: Boolean) = ???

    /** Inner class of CheckboxMenuItem used to provide default support for
     *  accessibility.  This class is not meant to be used directly by
     *  application developers, but is instead meant only to be
     *  subclassed by menu component developers.
     *  
     *  This class implements accessibility support for the
     *  CheckboxMenuItem class.  It provides an implementation
     *  of the Java Accessibility API appropriate to checkbox menu item
     *  user-interface elements.
     */
    protected class AccessibleAWTCheckboxMenuItem extends MenuItem.AccessibleAWTMenuItem with AccessibleAction with AccessibleValue {

        /**  */
        @stub
        protected def this() = ???

        /** Perform the specified Action on the object */
        @stub
        def doAccessibleAction(i: Int): Boolean = ???

        /** Get the AccessibleAction associated with this object. */
        @stub
        def getAccessibleAction(): AccessibleAction = ???

        /** Returns the number of Actions available in this object. */
        @stub
        def getAccessibleActionCount(): Int = ???

        /** Return a description of the specified action of the object. */
        @stub
        def getAccessibleActionDescription(i: Int): String = ???

        /** Get the role of this object. */
        @stub
        def getAccessibleRole(): AccessibleRole = ???

        /** Get the AccessibleValue associated with this object. */
        @stub
        def getAccessibleValue(): AccessibleValue = ???

        /** Get the value of this object as a Number. */
        @stub
        def getCurrentAccessibleValue(): Number = ???

        /** Get the maximum value of this object as a Number. */
        @stub
        def getMaximumAccessibleValue(): Number = ???

        /** Get the minimum value of this object as a Number. */
        @stub
        def getMinimumAccessibleValue(): Number = ???

        /** Set the value of this object as a Number. */
        @stub
        def setCurrentAccessibleValue(n: Number): Boolean = ???
    }


    /** Adds the specified item listener to receive item events from
     *  this check box menu item.
     */
    @stub
    def addItemListener(l: ItemListener): Unit = ???

    /** Creates the peer of the checkbox item. */
    @stub
    def addNotify(): Unit = ???

    /** Gets the AccessibleContext associated with this CheckboxMenuItem. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns an array of all the item listeners
     *  registered on this checkbox menuitem.
     */
    @stub
    def getItemListeners(): Array[ItemListener] = ???

    /** Returns an array of all the objects currently registered
     *  as FooListeners
     *  upon this CheckboxMenuItem.
     */
    @stub
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T] = ???

    /** Returns the an array (length 1) containing the checkbox menu item
     *  label or null if the checkbox is not selected.
     */
    @stub
    def getSelectedObjects(): Array[Object] = ???

    /** Determines whether the state of this check box menu item
     *  is "on" or "off."
     */
    @stub
    def getState(): Boolean = ???

    /** Returns a string representing the state of this
     *  CheckBoxMenuItem.
     */
    @stub
    def paramString(): String = ???

    /** Processes events on this check box menu item. */
    @stub
    protected def processEvent(e: AWTEvent): Unit = ???

    /** Processes item events occurring on this check box menu item by
     *  dispatching them to any registered ItemListener objects.
     */
    @stub
    protected def processItemEvent(e: ItemEvent): Unit = ???

    /** Removes the specified item listener so that it no longer receives
     *  item events from this check box menu item.
     */
    @stub
    def removeItemListener(l: ItemListener): Unit = ???

    /** Sets this check box menu item to the specified state. */
    @stub
    def setState(b: Boolean): Unit = ???
}
