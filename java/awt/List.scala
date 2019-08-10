package java.awt

import java.awt.event.{ActionEvent, ActionListener, FocusListener, ItemEvent, ItemListener}
import java.lang.{Class, Object, String}
import java.util.{EventListener, Locale}
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole, AccessibleSelection, AccessibleStateSet}
import scala.scalanative.annotation.stub

/** The List component presents the user with a
 *  scrolling list of text items. The list can be set up so that
 *  the user can choose either one item or multiple items.
 *  
 *  For example, the code . . .
 * 
 *  
 *  List lst = new List(4, false);
 *  lst.add("Mercury");
 *  lst.add("Venus");
 *  lst.add("Earth");
 *  lst.add("JavaSoft");
 *  lst.add("Mars");
 *  lst.add("Jupiter");
 *  lst.add("Saturn");
 *  lst.add("Uranus");
 *  lst.add("Neptune");
 *  lst.add("Pluto");
 *  cnt.add(lst);
 *  
 *  
 *  where cnt is a container, produces the following
 *  scrolling list:
 *  
 *  
 *  
 *  If the List allows multiple selections, then clicking on
 *  an item that is already selected deselects it. In the preceding
 *  example, only one item from the scrolling list can be selected
 *  at a time, since the second argument when creating the new scrolling
 *  list is false. If the List does not allow multiple
 *  selections, selecting an item causes any other selected item
 *  to be deselected.
 *  
 *  Note that the list in the example shown was created with four visible
 *  rows.  Once the list has been created, the number of visible rows
 *  cannot be changed.  A default List is created with
 *  four rows, so that lst = new List() is equivalent to
 *  list = new List(4, false).
 *  
 *  Beginning with Java 1.1, the Abstract Window Toolkit
 *  sends the List object all mouse, keyboard, and focus events
 *  that occur over it. (The old AWT event model is being maintained
 *  only for backwards compatibility, and its use is discouraged.)
 *  
 *  When an item is selected or deselected by the user, AWT sends an instance
 *  of ItemEvent to the list.
 *  When the user double-clicks on an item in a scrolling list,
 *  AWT sends an instance of ActionEvent to the
 *  list following the item event. AWT also generates an action event
 *  when the user presses the return key while an item in the
 *  list is selected.
 *  
 *  If an application wants to perform some action based on an item
 *  in this list being selected or activated by the user, it should implement
 *  ItemListener or ActionListener
 *  as appropriate and register the new listener to receive
 *  events from this list.
 *  
 *  For multiple-selection scrolling lists, it is considered a better
 *  user interface to use an external gesture (such as clicking on a
 *  button) to trigger the action.
 */
class List extends Component with ItemSelectable with Accessible {

    /** Creates a new scrolling list. */
    @stub
    def this() = ???

    /** Creates a new scrolling list initialized with the specified
     *  number of visible lines.
     */
    @stub
    def this(rows: Int) = ???

    /** Creates a new scrolling list initialized to display the specified
     *  number of rows.
     */
    @stub
    def this(rows: Int, multipleMode: Boolean) = ???

    /** This class implements accessibility support for the
     *  List class.  It provides an implementation of the
     *  Java Accessibility API appropriate to list user-interface elements.
     */
    protected class AccessibleAWTList extends Component.AccessibleAWTComponent with AccessibleSelection with ItemListener with ActionListener {

        /**  */
        @stub
        def this() = ???

        /** This class implements accessibility support for
         *  List children.  It provides an implementation of the
         *  Java Accessibility API appropriate to list children
         *  user-interface elements.
         */
        protected class AccessibleAWTListChild extends Component.AccessibleAWTComponent with Accessible {

            /**  */
            @stub
            def this(parent: List, indexInParent: Int) = ???

            /** Adds the specified focus listener to receive focus events from
             *  this component.
             */
            @stub
            def addFocusListener(l: FocusListener): Unit = ???

            /** Checks whether the specified point is within this object's
             *  bounds, where the point's x and y coordinates are defined to
             *  be relative to the coordinate system of the object.
             */
            @stub
            def contains(p: Point): Boolean = ???

            /** Returns the Accessible child, if one exists,
             *  contained at the local coordinate Point.
             */
            @stub
            def getAccessibleAt(p: Point): Accessible = ???

            /** Return the specified Accessible child of the object. */
            @stub
            def getAccessibleChild(i: Int): Accessible = ???

            /** Returns the number of accessible children of the object. */
            @stub
            def getAccessibleChildrenCount(): Int = ???

            /** Gets the AccessibleContext for this object. */
            @stub
            def getAccessibleContext(): AccessibleContext = ???

            /** Get the 0-based index of this object in its accessible parent. */
            @stub
            def getAccessibleIndexInParent(): Int = ???

            /** Get the role of this object. */
            @stub
            def getAccessibleRole(): AccessibleRole = ???

            /** Get the state set of this object. */
            @stub
            def getAccessibleStateSet(): AccessibleStateSet = ???

            /** Get the background color of this object. */
            @stub
            def getBackground(): Color = ???

            /** Gets the bounds of this object in the form of a Rectangle object. */
            @stub
            def getBounds(): Rectangle = ???

            /** Get the Cursor of this object. */
            @stub
            def getCursor(): Cursor = ???

            /** Get the Font of this object. */
            @stub
            def getFont(): Font = ???

            /** Get the FontMetrics of this object. */
            @stub
            def getFontMetrics(f: Font): FontMetrics = ???

            /** Get the foreground color of this object. */
            @stub
            def getForeground(): Color = ???

            /** Gets the locale of the component. */
            @stub
            def getLocale(): Locale = ???

            /** Gets the location of the object relative to the parent in the
             *  form of a point specifying the object's top-left corner in the
             *  screen's coordinate space.
             */
            @stub
            def getLocation(): Point = ???

            /** Returns the location of the object on the screen. */
            @stub
            def getLocationOnScreen(): Point = ???

            /** Returns the size of this object in the form of a Dimension
             *  object.
             */
            @stub
            def getSize(): Dimension = ???

            /** Determine if the object is enabled. */
            @stub
            def isEnabled(): Boolean = ???

            /** Returns whether this object can accept focus or not. */
            @stub
            def isFocusTraversable(): Boolean = ???

            /** Determine if the object is showing. */
            @stub
            def isShowing(): Boolean = ???

            /** Determine if the object is visible. */
            @stub
            def isVisible(): Boolean = ???

            /** Removes the specified focus listener so it no longer receives
             *  focus events from this component.
             */
            @stub
            def removeFocusListener(l: FocusListener): Unit = ???

            /** Requests focus for this object. */
            @stub
            def requestFocus(): Unit = ???

            /** Set the background color of this object. */
            @stub
            def setBackground(c: Color): Unit = ???

            /** Sets the bounds of this object in the form of a Rectangle
             *  object.
             */
            @stub
            def setBounds(r: Rectangle): Unit = ???

            /** Set the Cursor of this object. */
            @stub
            def setCursor(cursor: Cursor): Unit = ???

            /** Set the enabled state of the object. */
            @stub
            def setEnabled(b: Boolean): Unit = ???

            /** Set the Font of this object. */
            @stub
            def setFont(f: Font): Unit = ???

            /** Set the foreground color of this object. */
            @stub
            def setForeground(c: Color): Unit = ???

            /** Sets the location of the object relative to the parent. */
            @stub
            def setLocation(p: Point): Unit = ???

            /** Resizes this object so that it has width and height. */
            @stub
            def setSize(d: Dimension): Unit = ???

            /** Set the visible state of the object. */
            @stub
            def setVisible(b: Boolean): Unit = ???
        }


        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(event: ActionEvent): Unit = ???

        /** Adds the specified selected item in the object to the object's
         *  selection.
         */
        @stub
        def addAccessibleSelection(i: Int): Unit = ???

        /** Clears the selection in the object, so that nothing in the
         *  object is selected.
         */
        @stub
        def clearAccessibleSelection(): Unit = ???

        /** Returns the Accessible child contained at the local coordinate
         *  Point, if one exists.
         */
        @stub
        def getAccessibleAt(p: Point): Accessible = ???

        /** Return the nth Accessible child of the object. */
        @stub
        def getAccessibleChild(i: Int): Accessible = ???

        /** Returns the number of accessible children in the object. */
        @stub
        def getAccessibleChildrenCount(): Int = ???

        /** Get the role of this object. */
        @stub
        def getAccessibleRole(): AccessibleRole = ???

        /** Get the AccessibleSelection associated with this object. */
        @stub
        def getAccessibleSelection(): AccessibleSelection = ???

        /** Returns an Accessible representing the specified selected item
         *  in the object.
         */
        @stub
        def getAccessibleSelection(i: Int): Accessible = ???

        /** Returns the number of items currently selected. */
        @stub
        def getAccessibleSelectionCount(): Int = ???

        /** Get the state set of this object. */
        @stub
        def getAccessibleStateSet(): AccessibleStateSet = ???

        /** Returns true if the current child of this object is selected. */
        @stub
        def isAccessibleChildSelected(i: Int): Boolean = ???

        /** Invoked when an item has been selected or deselected by the user. */
        @stub
        def itemStateChanged(event: ItemEvent): Unit = ???

        /** Removes the specified selected item in the object from the object's
         *  selection.
         */
        @stub
        def removeAccessibleSelection(i: Int): Unit = ???

        /** Causes every selected item in the object to be selected
         *  if the object supports multiple selections.
         */
        @stub
        def selectAllAccessibleSelection(): Unit = ???
    }


    /** Adds the specified item to the end of scrolling list. */
    @stub
    def add(item: String): Unit = ???

    /** Adds the specified item to the the scrolling list
     *  at the position indicated by the index.
     */
    @stub
    def add(item: String, index: Int): Unit = ???

    /** Adds the specified action listener to receive action events from
     *  this list.
     */
    @stub
    def addActionListener(l: ActionListener): Unit = ???

    /** Deprecated. 
     * replaced by add(String).
     * 
     */
    @stub
    def addItem(item: String): Unit = ???

    /** Deprecated. 
     * replaced by add(String, int).
     * 
     */
    @stub
    def addItem(item: String, index: Int): Unit = ???

    /** Adds the specified item listener to receive item events from
     *  this list.
     */
    @stub
    def addItemListener(l: ItemListener): Unit = ???

    /** Creates the peer for the list. */
    @stub
    def addNotify(): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by isMultipleMode().
     * 
     */
    @stub
    def allowsMultipleSelections(): Boolean = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by removeAll().
     * 
     */
    @stub
    def clear(): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getItemCount().
     * 
     */
    @stub
    def countItems(): Int = ???

    /** Deprecated. 
     * replaced by remove(String)
     *                          and remove(int).
     * 
     */
    @stub
    def delItem(position: Int): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  Not for public use in the future.
     *  This method is expected to be retained only as a package
     *  private method.
     * 
     */
    @stub
    def delItems(start: Int, end: Int): Unit = ???

    /** Deselects the item at the specified index. */
    @stub
    def deselect(index: Int): Unit = ???

    /** Gets the AccessibleContext associated with this
     *  List.
     */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns an array of all the action listeners
     *  registered on this list.
     */
    @stub
    def getActionListeners(): Array[ActionListener] = ???

    /** Gets the item associated with the specified index. */
    @stub
    def getItem(index: Int): String = ???

    /** Gets the number of items in the list. */
    @stub
    def getItemCount(): Int = ???

    /** Returns an array of all the item listeners
     *  registered on this list.
     */
    @stub
    def getItemListeners(): Array[ItemListener] = ???

    /** Gets the items in the list. */
    @stub
    def getItems(): Array[String] = ???

    /** Returns an array of all the objects currently registered
     *  as FooListeners
     *  upon this List.
     */
    @stub
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T] = ???

    /** Determines the minimum size of this scrolling list. */
    @stub
    def getMinimumSize(): Dimension = ???

    /** Gets the minimum dimensions for a list with the specified
     *  number of rows.
     */
    @stub
    def getMinimumSize(rows: Int): Dimension = ???

    /** Gets the preferred size of this scrolling list. */
    @stub
    def getPreferredSize(): Dimension = ???

    /** Gets the preferred dimensions for a list with the specified
     *  number of rows.
     */
    @stub
    def getPreferredSize(rows: Int): Dimension = ???

    /** Gets the number of visible lines in this list. */
    @stub
    def getRows(): Int = ???

    /** Gets the index of the selected item on the list, */
    @stub
    def getSelectedIndex(): Int = ???

    /** Gets the selected indexes on the list. */
    @stub
    def getSelectedIndexes(): Array[Int] = ???

    /** Gets the selected item on this scrolling list. */
    @stub
    def getSelectedItem(): String = ???

    /** Gets the selected items on this scrolling list. */
    @stub
    def getSelectedItems(): Array[String] = ???

    /** Gets the selected items on this scrolling list in an array of Objects. */
    @stub
    def getSelectedObjects(): Array[Object] = ???

    /** Gets the index of the item that was last made visible by
     *  the method makeVisible.
     */
    @stub
    def getVisibleIndex(): Int = ???

    /** Determines if the specified item in this scrolling list is
     *  selected.
     */
    @stub
    def isIndexSelected(index: Int): Boolean = ???

    /** Determines whether this list allows multiple selections. */
    @stub
    def isMultipleMode(): Boolean = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by isIndexSelected(int).
     * 
     */
    @stub
    def isSelected(index: Int): Boolean = ???

    /** Makes the item at the specified index visible. */
    @stub
    def makeVisible(index: Int): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getMinimumSize().
     * 
     */
    @stub
    def minimumSize(): Dimension = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getMinimumSize(int).
     * 
     */
    @stub
    def minimumSize(rows: Int): Dimension = ???

    /** Returns the parameter string representing the state of this
     *  scrolling list.
     */
    @stub
    protected def paramString(): String = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getPreferredSize().
     * 
     */
    @stub
    def preferredSize(): Dimension = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getPreferredSize(int).
     * 
     */
    @stub
    def preferredSize(rows: Int): Dimension = ???

    /** Processes action events occurring on this component
     *  by dispatching them to any registered
     *  ActionListener objects.
     */
    @stub
    protected def processActionEvent(e: ActionEvent): Unit = ???

    /** Processes events on this scrolling list. */
    @stub
    protected def processEvent(e: AWTEvent): Unit = ???

    /** Processes item events occurring on this list by
     *  dispatching them to any registered
     *  ItemListener objects.
     */
    @stub
    protected def processItemEvent(e: ItemEvent): Unit = ???

    /** Removes the item at the specified position
     *  from this scrolling list.
     */
    @stub
    def remove(position: Int): Unit = ???

    /** Removes the first occurrence of an item from the list. */
    @stub
    def remove(item: String): Unit = ???

    /** Removes the specified action listener so that it no longer
     *  receives action events from this list.
     */
    @stub
    def removeActionListener(l: ActionListener): Unit = ???

    /** Removes all items from this list. */
    @stub
    def removeAll(): Unit = ???

    /** Removes the specified item listener so that it no longer
     *  receives item events from this list.
     */
    @stub
    def removeItemListener(l: ItemListener): Unit = ???

    /** Removes the peer for this list. */
    @stub
    def removeNotify(): Unit = ???

    /** Replaces the item at the specified index in the scrolling list
     *  with the new string.
     */
    @stub
    def replaceItem(newValue: String, index: Int): Unit = ???

    /** Selects the item at the specified index in the scrolling list. */
    @stub
    def select(index: Int): Unit = ???

    /** Sets the flag that determines whether this list
     *  allows multiple selections.
     */
    @stub
    def setMultipleMode(b: Boolean): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by setMultipleMode(boolean).
     * 
     */
    @stub
    def setMultipleSelections(b: Boolean): Unit = ???
}
