package java.awt

import java.awt.event.{ActionEvent, ActionListener, ItemEvent, ItemListener}
import java.lang.{Class, Object, String}
import java.util.EventListener
import javax.accessibility.{Accessible, AccessibleContext}

// The List component presents the user with a
// scrolling list of text items. The list can be set up so that
// the user can choose either one item or multiple items.
// 
// For example, the code . . .
//
// 
// List lst = new List(4, false);
// lst.add("Mercury");
// lst.add("Venus");
// lst.add("Earth");
// lst.add("JavaSoft");
// lst.add("Mars");
// lst.add("Jupiter");
// lst.add("Saturn");
// lst.add("Uranus");
// lst.add("Neptune");
// lst.add("Pluto");
// cnt.add(lst);
// 
// 
// where cnt is a container, produces the following
// scrolling list:
// 
// 
// 
// If the List allows multiple selections, then clicking on
// an item that is already selected deselects it. In the preceding
// example, only one item from the scrolling list can be selected
// at a time, since the second argument when creating the new scrolling
// list is false. If the List does not allow multiple
// selections, selecting an item causes any other selected item
// to be deselected.
// 
// Note that the list in the example shown was created with four visible
// rows.  Once the list has been created, the number of visible rows
// cannot be changed.  A default List is created with
// four rows, so that lst = new List() is equivalent to
// list = new List(4, false).
// 
// Beginning with Java 1.1, the Abstract Window Toolkit
// sends the List object all mouse, keyboard, and focus events
// that occur over it. (The old AWT event model is being maintained
// only for backwards compatibility, and its use is discouraged.)
// 
// When an item is selected or deselected by the user, AWT sends an instance
// of ItemEvent to the list.
// When the user double-clicks on an item in a scrolling list,
// AWT sends an instance of ActionEvent to the
// list following the item event. AWT also generates an action event
// when the user presses the return key while an item in the
// list is selected.
// 
// If an application wants to perform some action based on an item
// in this list being selected or activated by the user, it should implement
// ItemListener or ActionListener
// as appropriate and register the new listener to receive
// events from this list.
// 
// For multiple-selection scrolling lists, it is considered a better
// user interface to use an external gesture (such as clicking on a
// button) to trigger the action.
class List extends Component with ItemSelectable, with Accessible {

    @stub
    // Creates a new scrolling list.
    def this() = ???

    @stub
    // Creates a new scrolling list initialized with the specified
    // number of visible lines.
    def this(rows: Int) = ???

    @stub
    // Adds the specified item to the end of scrolling list.
    def add(item: String): Unit = ???

    @stub
    // Adds the specified item to the the scrolling list
    // at the position indicated by the index.
    def add(item: String, index: Int): Unit = ???

    @stub
    // Adds the specified action listener to receive action events from
    // this list.
    def addActionListener(l: ActionListener): Unit = ???

    @stub
    // Deprecated. 
    //replaced by add(String).
    //
    def addItem(item: String): Unit = ???

    @stub
    // Deprecated. 
    //replaced by add(String, int).
    //
    def addItem(item: String, index: Int): Unit = ???

    @stub
    // Adds the specified item listener to receive item events from
    // this list.
    def addItemListener(l: ItemListener): Unit = ???

    @stub
    // Creates the peer for the list.
    def addNotify(): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by isMultipleMode().
    //
    def allowsMultipleSelections(): Boolean = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by removeAll().
    //
    def clear(): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getItemCount().
    //
    def countItems(): Int = ???

    @stub
    // Deprecated. 
    //replaced by remove(String)
    //                         and remove(int).
    //
    def delItem(position: Int): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // Not for public use in the future.
    // This method is expected to be retained only as a package
    // private method.
    //
    def delItems(start: Int, end: Int): Unit = ???

    @stub
    // Deselects the item at the specified index.
    def deselect(index: Int): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this
    // List.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns an array of all the action listeners
    // registered on this list.
    def getActionListeners(): Array[ActionListener] = ???

    @stub
    // Gets the item associated with the specified index.
    def getItem(index: Int): String = ???

    @stub
    // Gets the number of items in the list.
    def getItemCount(): Int = ???

    @stub
    // Returns an array of all the item listeners
    // registered on this list.
    def getItemListeners(): Array[ItemListener] = ???

    @stub
    // Gets the items in the list.
    def getItems(): Array[String] = ???

    @stub
    // Returns an array of all the objects currently registered
    // as FooListeners
    // upon this List.
    def Array[T]: [T <: EventListener] = ???

    @stub
    // Determines the minimum size of this scrolling list.
    def getMinimumSize(): Dimension = ???

    @stub
    // Gets the minimum dimensions for a list with the specified
    // number of rows.
    def getMinimumSize(rows: Int): Dimension = ???

    @stub
    // Gets the preferred size of this scrolling list.
    def getPreferredSize(): Dimension = ???

    @stub
    // Gets the preferred dimensions for a list with the specified
    // number of rows.
    def getPreferredSize(rows: Int): Dimension = ???

    @stub
    // Gets the number of visible lines in this list.
    def getRows(): Int = ???

    @stub
    // Gets the index of the selected item on the list,
    def getSelectedIndex(): Int = ???

    @stub
    // Gets the selected indexes on the list.
    def getSelectedIndexes(): Array[Int] = ???

    @stub
    // Gets the selected item on this scrolling list.
    def getSelectedItem(): String = ???

    @stub
    // Gets the selected items on this scrolling list.
    def getSelectedItems(): Array[String] = ???

    @stub
    // Gets the selected items on this scrolling list in an array of Objects.
    def getSelectedObjects(): Array[Object] = ???

    @stub
    // Gets the index of the item that was last made visible by
    // the method makeVisible.
    def getVisibleIndex(): Int = ???

    @stub
    // Determines if the specified item in this scrolling list is
    // selected.
    def isIndexSelected(index: Int): Boolean = ???

    @stub
    // Determines whether this list allows multiple selections.
    def isMultipleMode(): Boolean = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by isIndexSelected(int).
    //
    def isSelected(index: Int): Boolean = ???

    @stub
    // Makes the item at the specified index visible.
    def makeVisible(index: Int): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getMinimumSize().
    //
    def minimumSize(): Dimension = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getMinimumSize(int).
    //
    def minimumSize(rows: Int): Dimension = ???

    @stub
    // Returns the parameter string representing the state of this
    // scrolling list.
    protected def paramString(): String = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getPreferredSize().
    //
    def preferredSize(): Dimension = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getPreferredSize(int).
    //
    def preferredSize(rows: Int): Dimension = ???

    @stub
    // Processes action events occurring on this component
    // by dispatching them to any registered
    // ActionListener objects.
    protected def processActionEvent(e: ActionEvent): Unit = ???

    @stub
    // Processes events on this scrolling list.
    protected def processEvent(e: AWTEvent): Unit = ???

    @stub
    // Processes item events occurring on this list by
    // dispatching them to any registered
    // ItemListener objects.
    protected def processItemEvent(e: ItemEvent): Unit = ???

    @stub
    // Removes the item at the specified position
    // from this scrolling list.
    def remove(position: Int): Unit = ???

    @stub
    // Removes the first occurrence of an item from the list.
    def remove(item: String): Unit = ???

    @stub
    // Removes the specified action listener so that it no longer
    // receives action events from this list.
    def removeActionListener(l: ActionListener): Unit = ???

    @stub
    // Removes all items from this list.
    def removeAll(): Unit = ???

    @stub
    // Removes the specified item listener so that it no longer
    // receives item events from this list.
    def removeItemListener(l: ItemListener): Unit = ???

    @stub
    // Removes the peer for this list.
    def removeNotify(): Unit = ???

    @stub
    // Replaces the item at the specified index in the scrolling list
    // with the new string.
    def replaceItem(newValue: String, index: Int): Unit = ???

    @stub
    // Selects the item at the specified index in the scrolling list.
    def select(index: Int): Unit = ???

    @stub
    // Sets the flag that determines whether this list
    // allows multiple selections.
    def setMultipleMode(b: Boolean): Unit = ???
}
