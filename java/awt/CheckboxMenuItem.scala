package java.awt

import java.awt.event.{ItemEvent, ItemListener}
import java.lang.{Class, Object, String}
import java.util.EventListener
import javax.accessibility.{Accessible, AccessibleContext}

// This class represents a check box that can be included in a menu.
// Selecting the check box in the menu changes its state from
// "on" to "off" or from "off" to "on."
// 
// The following picture depicts a menu which contains an instance
// of CheckBoxMenuItem:
// 
// 
// 
// The item labeled Check shows a check box menu item
// in its "off" state.
// 
// When a check box menu item is selected, AWT sends an item event to
// the item. Since the event is an instance of ItemEvent,
// the processEvent method examines the event and passes
// it along to processItemEvent. The latter method redirects
// the event to any ItemListener objects that have
// registered an interest in item events generated by this menu item.
class CheckboxMenuItem extends MenuItem with ItemSelectable, with Accessible {

    @stub
    // Create a check box menu item with an empty label.
    def this() = ???

    @stub
    // Create a check box menu item with the specified label.
    def this(label: String) = ???

    @stub
    // Adds the specified item listener to receive item events from
    // this check box menu item.
    def addItemListener(l: ItemListener): Unit = ???

    @stub
    // Creates the peer of the checkbox item.
    def addNotify(): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this CheckboxMenuItem.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns an array of all the item listeners
    // registered on this checkbox menuitem.
    def getItemListeners(): Array[ItemListener] = ???

    @stub
    // Returns an array of all the objects currently registered
    // as FooListeners
    // upon this CheckboxMenuItem.
    def Array[T]: [T <: EventListener] = ???

    @stub
    // Returns the an array (length 1) containing the checkbox menu item
    // label or null if the checkbox is not selected.
    def getSelectedObjects(): Array[Object] = ???

    @stub
    // Determines whether the state of this check box menu item
    // is "on" or "off."
    def getState(): Boolean = ???

    @stub
    // Returns a string representing the state of this
    // CheckBoxMenuItem.
    def paramString(): String = ???

    @stub
    // Processes events on this check box menu item.
    protected def processEvent(e: AWTEvent): Unit = ???

    @stub
    // Processes item events occurring on this check box menu item by
    // dispatching them to any registered ItemListener objects.
    protected def processItemEvent(e: ItemEvent): Unit = ???

    @stub
    // Removes the specified item listener so that it no longer receives
    // item events from this check box menu item.
    def removeItemListener(l: ItemListener): Unit = ???
}