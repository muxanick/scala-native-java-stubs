package java.awt

import java.awt.event.{ItemEvent, ItemListener}
import java.lang.{Class, Object, String}
import java.util.EventListener
import javax.accessibility.{Accessible, AccessibleContext}
import scala.scalanative.annotation.stub

/** The Choice class presents a pop-up menu of choices.
 *  The current choice is displayed as the title of the menu.
 *  
 *  The following code example produces a pop-up menu:
 * 
 *  
 *  Choice ColorChooser = new Choice();
 *  ColorChooser.add("Green");
 *  ColorChooser.add("Red");
 *  ColorChooser.add("Blue");
 *  
 *  
 *  After this choice menu has been added to a panel,
 *  it appears as follows in its normal state:
 *  
 *  
 *  
 *  In the picture, "Green" is the current choice.
 *  Pushing the mouse button down on the object causes a menu to
 *  appear with the current choice highlighted.
 *  
 *  Some native platforms do not support arbitrary resizing of
 *  Choice components and the behavior of
 *  setSize()/getSize() is bound by
 *  such limitations.
 *  Native GUI Choice components' size are often bound by such
 *  attributes as font size and length of items contained within
 *  the Choice.
 *  
 */
class Choice extends Component with ItemSelectable with Accessible {

    /** Creates a new choice menu. */
    @stub
    def this() = ???

    /** This class implements accessibility support for the
     *  Choice class.
     */
    @stub
    protected object AccessibleAWTChoice extends Choice.AccessibleAWTChoice

    /** Adds an item to this Choice menu. */
    @stub
    def add(item: String): Unit = ???

    /** Obsolete as of Java 2 platform v1.1. */
    @stub
    def addItem(item: String): Unit = ???

    /** Adds the specified item listener to receive item events from
     *  this Choice menu.
     */
    @stub
    def addItemListener(l: ItemListener): Unit = ???

    /** Creates the Choice's peer. */
    @stub
    def addNotify(): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getItemCount().
     * 
     */
    @stub
    def countItems(): Int = ???

    /** Gets the AccessibleContext associated with this
     *  Choice.
     */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Gets the string at the specified index in this
     *  Choice menu.
     */
    @stub
    def getItem(index: Int): String = ???

    /** Returns the number of items in this Choice menu. */
    @stub
    def getItemCount(): Int = ???

    /** Returns an array of all the item listeners
     *  registered on this choice.
     */
    @stub
    def getItemListeners(): Array[ItemListener] = ???

    /** Returns an array of all the objects currently registered
     *  as FooListeners
     *  upon this Choice.
     */
    @stub
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T] = ???

    /** Returns the index of the currently selected item. */
    @stub
    def getSelectedIndex(): Int = ???

    /** Gets a representation of the current choice as a string. */
    @stub
    def getSelectedItem(): String = ???

    /** Returns an array (length 1) containing the currently selected
     *  item.
     */
    @stub
    def getSelectedObjects(): Array[Object] = ???

    /** Inserts the item into this choice at the specified position. */
    @stub
    def insert(item: String, index: Int): Unit = ???

    /** Returns a string representing the state of this Choice
     *  menu.
     */
    @stub
    protected def paramString(): String = ???

    /** Processes events on this choice. */
    @stub
    protected def processEvent(e: AWTEvent): Unit = ???

    /** Processes item events occurring on this Choice
     *  menu by dispatching them to any registered
     *  ItemListener objects.
     */
    @stub
    protected def processItemEvent(e: ItemEvent): Unit = ???

    /** Removes an item from the choice menu
     *  at the specified position.
     */
    @stub
    def remove(position: Int): Unit = ???

    /** Removes the first occurrence of item
     *  from the Choice menu.
     */
    @stub
    def remove(item: String): Unit = ???

    /** Removes all items from the choice menu. */
    @stub
    def removeAll(): Unit = ???

    /** Removes the specified item listener so that it no longer receives
     *  item events from this Choice menu.
     */
    @stub
    def removeItemListener(l: ItemListener): Unit = ???

    /** Sets the selected item in this Choice menu to be the
     *  item at the specified position.
     */
    @stub
    def select(pos: Int): Unit = ???

    /** Sets the selected item in this Choice menu
     *  to be the item whose name is equal to the specified string.
     */
    @stub
    def select(str: String): Unit = ???
}
