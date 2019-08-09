package java.awt

import java.awt.event.{ItemEvent, ItemListener}
import java.lang.{Class, Object, String}
import java.util.EventListener
import javax.accessibility.{Accessible, AccessibleContext}

// The Choice class presents a pop-up menu of choices.
// The current choice is displayed as the title of the menu.
// 
// The following code example produces a pop-up menu:
//
// 
// Choice ColorChooser = new Choice();
// ColorChooser.add("Green");
// ColorChooser.add("Red");
// ColorChooser.add("Blue");
// 
// 
// After this choice menu has been added to a panel,
// it appears as follows in its normal state:
// 
// 
// 
// In the picture, "Green" is the current choice.
// Pushing the mouse button down on the object causes a menu to
// appear with the current choice highlighted.
// 
// Some native platforms do not support arbitrary resizing of
// Choice components and the behavior of
// setSize()/getSize() is bound by
// such limitations.
// Native GUI Choice components' size are often bound by such
// attributes as font size and length of items contained within
// the Choice.
// 
class Choice extends Component with ItemSelectable, with Accessible {

    @stub
    // Adds an item to this Choice menu.
    def add(item: String): Unit = ???

    @stub
    // Obsolete as of Java 2 platform v1.1.
    def addItem(item: String): Unit = ???

    @stub
    // Adds the specified item listener to receive item events from
    // this Choice menu.
    def addItemListener(l: ItemListener): Unit = ???

    @stub
    // Creates the Choice's peer.
    def addNotify(): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getItemCount().
    //
    def countItems(): Int = ???

    @stub
    // Gets the AccessibleContext associated with this
    // Choice.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Gets the string at the specified index in this
    // Choice menu.
    def getItem(index: Int): String = ???

    @stub
    // Returns the number of items in this Choice menu.
    def getItemCount(): Int = ???

    @stub
    // Returns an array of all the item listeners
    // registered on this choice.
    def getItemListeners(): Array[ItemListener] = ???

    @stub
    // Returns an array of all the objects currently registered
    // as FooListeners
    // upon this Choice.
    def Array[T]: [T <: EventListener] = ???

    @stub
    // Returns the index of the currently selected item.
    def getSelectedIndex(): Int = ???

    @stub
    // Gets a representation of the current choice as a string.
    def getSelectedItem(): String = ???

    @stub
    // Returns an array (length 1) containing the currently selected
    // item.
    def getSelectedObjects(): Array[Object] = ???

    @stub
    // Inserts the item into this choice at the specified position.
    def insert(item: String, index: Int): Unit = ???

    @stub
    // Returns a string representing the state of this Choice
    // menu.
    protected def paramString(): String = ???

    @stub
    // Processes events on this choice.
    protected def processEvent(e: AWTEvent): Unit = ???

    @stub
    // Processes item events occurring on this Choice
    // menu by dispatching them to any registered
    // ItemListener objects.
    protected def processItemEvent(e: ItemEvent): Unit = ???

    @stub
    // Removes an item from the choice menu
    // at the specified position.
    def remove(position: Int): Unit = ???

    @stub
    // Removes the first occurrence of item
    // from the Choice menu.
    def remove(item: String): Unit = ???

    @stub
    // Removes all items from the choice menu.
    def removeAll(): Unit = ???

    @stub
    // Removes the specified item listener so that it no longer receives
    // item events from this Choice menu.
    def removeItemListener(l: ItemListener): Unit = ???

    @stub
    // Sets the selected item in this Choice menu to be the
    // item at the specified position.
    def select(pos: Int): Unit = ???
}
