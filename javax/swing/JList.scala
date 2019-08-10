package javax.swing

import java.awt.{Color, Component, Container, Dimension, Point, Rectangle}
import java.awt.event.MouseEvent
import java.lang.{Object, String}
import java.util.{List, Vector}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.event.ListSelectionListener
import javax.swing.plaf.ListUI
import javax.swing.text.Position.Bias
import scala.scalanative.annotation.stub

/** A component that displays a list of objects and allows the user to select
 *  one or more items. A separate model, ListModel, maintains the
 *  contents of the list.
 *  
 *  It's easy to display an array or Vector of objects, using the JList
 *  constructor that automatically builds a read-only ListModel instance
 *  for you:
 *  
 *  
 *  // Create a JList that displays strings from an array
 * 
 *  String[] data = {"one", "two", "three", "four"};
 *  JList<String> myList = new JList<String>(data);
 * 
 *  // Create a JList that displays the superclasses of JList.class, by
 *  // creating it with a Vector populated with this data
 * 
 *  Vector<Class<?>> superClasses = new Vector<Class<?>>();
 *  Class<JList> rootClass = javax.swing.JList.class;
 *  for(Class<?> cls = rootClass; cls != null; cls = cls.getSuperclass()) {
 *      superClasses.addElement(cls);
 *  }
 *  JList<Class<?>> myList = new JList<Class<?>>(superClasses);
 * 
 *  // The automatically created model is stored in JList's "model"
 *  // property, which you can retrieve
 * 
 *  ListModel<Class<?>> model = myList.getModel();
 *  for(int i = 0; i < model.getSize(); i++) {
 *      System.out.println(model.getElementAt(i));
 *  }
 *  
 *  
 *  
 *  A ListModel can be supplied directly to a JList by way of a
 *  constructor or the setModel method. The contents need not be static -
 *  the number of items, and the values of items can change over time. A correct
 *  ListModel implementation notifies the set of
 *  javax.swing.event.ListDataListeners that have been added to it, each
 *  time a change occurs. These changes are characterized by a
 *  javax.swing.event.ListDataEvent, which identifies the range of list
 *  indices that have been modified, added, or removed. JList's
 *  ListUI is responsible for keeping the visual representation up to
 *  date with changes, by listening to the model.
 *  
 *  Simple, dynamic-content, JList applications can use the
 *  DefaultListModel class to maintain list elements. This class
 *  implements the ListModel interface and also provides a
 *  java.util.Vector-like API. Applications that need a more
 *  custom ListModel implementation may instead wish to subclass
 *  AbstractListModel, which provides basic support for managing and
 *  notifying listeners. For example, a read-only implementation of
 *  AbstractListModel:
 *  
 *  
 *  // This list model has about 2^16 elements.  Enjoy scrolling.
 * 
 *  ListModel<String> bigData = new AbstractListModel<String>() {
 *      public int getSize() { return Short.MAX_VALUE; }
 *      public String getElementAt(int index) { return "Index " + index; }
 *  };
 *  
 *  
 *  
 *  The selection state of a JList is managed by another separate
 *  model, an instance of ListSelectionModel. JList is
 *  initialized with a selection model on construction, and also contains
 *  methods to query or set this selection model. Additionally, JList
 *  provides convenient methods for easily managing the selection. These methods,
 *  such as setSelectedIndex and getSelectedValue, are cover
 *  methods that take care of the details of interacting with the selection
 *  model. By default, JList's selection model is configured to allow any
 *  combination of items to be selected at a time; selection mode
 *  MULTIPLE_INTERVAL_SELECTION. The selection mode can be changed
 *  on the selection model directly, or via JList's cover method.
 *  Responsibility for updating the selection model in response to user gestures
 *  lies with the list's ListUI.
 *  
 *  A correct ListSelectionModel implementation notifies the set of
 *  javax.swing.event.ListSelectionListeners that have been added to it
 *  each time a change to the selection occurs. These changes are characterized
 *  by a javax.swing.event.ListSelectionEvent, which identifies the range
 *  of the selection change.
 *  
 *  The preferred way to listen for changes in list selection is to add
 *  ListSelectionListeners directly to the JList. JList
 *  then takes care of listening to the the selection model and notifying your
 *  listeners of change.
 *  
 *  Responsibility for listening to selection changes in order to keep the list's
 *  visual representation up to date lies with the list's ListUI.
 *  
 *  
 *  Painting of cells in a JList is handled by a delegate called a
 *  cell renderer, installed on the list as the cellRenderer property.
 *  The renderer provides a java.awt.Component that is used
 *  like a "rubber stamp" to paint the cells. Each time a cell needs to be
 *  painted, the list's ListUI asks the cell renderer for the component,
 *  moves it into place, and has it paint the contents of the cell by way of its
 *  paint method. A default cell renderer, which uses a JLabel
 *  component to render, is installed by the lists's ListUI. You can
 *  substitute your own renderer using code like this:
 *  
 *  
 *   // Display an icon and a string for each object in the list.
 * 
 *  class MyCellRenderer extends JLabel implements ListCellRenderer<Object> {
 *      final static ImageIcon longIcon = new ImageIcon("long.gif");
 *      final static ImageIcon shortIcon = new ImageIcon("short.gif");
 * 
 *      // This is the only method defined by ListCellRenderer.
 *      // We just reconfigure the JLabel each time we're called.
 * 
 *      public Component getListCellRendererComponent(
 *        JList<?> list,           // the list
 *        Object value,            // value to display
 *        int index,               // cell index
 *        boolean isSelected,      // is the cell selected
 *        boolean cellHasFocus)    // does the cell have focus
 *      {
 *          String s = value.toString();
 *          setText(s);
 *          setIcon((s.length() > 10) ? longIcon : shortIcon);
 *          if (isSelected) {
 *              setBackground(list.getSelectionBackground());
 *              setForeground(list.getSelectionForeground());
 *          } else {
 *              setBackground(list.getBackground());
 *              setForeground(list.getForeground());
 *          }
 *          setEnabled(list.isEnabled());
 *          setFont(list.getFont());
 *          setOpaque(true);
 *          return this;
 *      }
 *  }
 * 
 *  myList.setCellRenderer(new MyCellRenderer());
 *  
 *  
 *  
 *  Another job for the cell renderer is in helping to determine sizing
 *  information for the list. By default, the list's ListUI determines
 *  the size of cells by asking the cell renderer for its preferred
 *  size for each list item. This can be expensive for large lists of items.
 *  To avoid these calculations, you can set a fixedCellWidth and
 *  fixedCellHeight on the list, or have these values calculated
 *  automatically based on a single prototype value:
 *  
 *  
 *  
 *  JList<String> bigDataList = new JList<String>(bigData);
 * 
 *  // We don't want the JList implementation to compute the width
 *  // or height of all of the list cells, so we give it a string
 *  // that's as big as we'll need for any cell.  It uses this to
 *  // compute values for the fixedCellWidth and fixedCellHeight
 *  // properties.
 * 
 *  bigDataList.setPrototypeCellValue("Index 1234567890");
 *  
 *  
 *  
 *  JList doesn't implement scrolling directly. To create a list that
 *  scrolls, make it the viewport view of a JScrollPane. For example:
 *  
 *  JScrollPane scrollPane = new JScrollPane(myList);
 * 
 *  // Or in two steps:
 *  JScrollPane scrollPane = new JScrollPane();
 *  scrollPane.getViewport().setView(myList);
 *  
 *  
 *  JList doesn't provide any special handling of double or triple
 *  (or N) mouse clicks, but it's easy to add a MouseListener if you
 *  wish to take action on these events. Use the locationToIndex
 *  method to determine what cell was clicked. For example:
 *  
 *  MouseListener mouseListener = new MouseAdapter() {
 *      public void mouseClicked(MouseEvent e) {
 *          if (e.getClickCount() == 2) {
 *              int index = list.locationToIndex(e.getPoint());
 *              System.out.println("Double clicked on Item " + index);
 *           }
 *      }
 *  };
 *  list.addMouseListener(mouseListener);
 *  
 *  
 *  Warning: Swing is not thread safe. For more
 *  information see Swing's Threading
 *  Policy.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 *  
 *  See How to Use Lists
 *  in The Java Tutorial
 *  for further documentation.
 *  
 */
class JList[E] extends JComponent with Scrollable with Accessible {

    /** Constructs a JList with an empty, read-only, model. */
    @stub
    def this() = ???

    /** Constructs a JList that displays the elements in
     *  the specified array.
     */
    @stub
    def this(listData: Array[E]) = ???

    /** Constructs a JList that displays elements from the specified,
     *  non-null, model.
     */
    @stub
    def this(dataModel: ListModel[E]) = ???

    /** Constructs a JList that displays the elements in
     *  the specified Vector.
     */
    @stub
    def this(listData: Vector[_ <: E]) = ???

    /** This class implements accessibility support for the
     *  JList class.
     */
    protected type AccessibleJList = JList_AccessibleJList

    /** Adds a listener to the list, to be notified each time a change to the
     *  selection occurs; the preferred way of listening for selection state
     *  changes.
     */
    @stub
    def addListSelectionListener(listener: ListSelectionListener): Unit = ???

    /** Sets the selection to be the union of the specified interval with current
     *  selection.
     */
    @stub
    def addSelectionInterval(anchor: Int, lead: Int): Unit = ???

    /** Clears the selection; after calling this method, isSelectionEmpty
     *  will return true.
     */
    @stub
    def clearSelection(): Unit = ???

    /** Returns an instance of DefaultListSelectionModel; called
     *  during construction to initialize the list's selection model
     *  property.
     */
    @stub
    protected def createSelectionModel(): ListSelectionModel = ???

    /** Scrolls the list within an enclosing viewport to make the specified
     *  cell completely visible.
     */
    @stub
    def ensureIndexIsVisible(index: Int): Unit = ???

    /** Notifies ListSelectionListeners added directly to the list
     *  of selection changes made to the selection model.
     */
    @stub
    protected def fireSelectionValueChanged(firstIndex: Int, lastIndex: Int, isAdjusting: Boolean): Unit = ???

    /** Gets the AccessibleContext associated with this JList. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the anchor selection index. */
    @stub
    def getAnchorSelectionIndex(): Int = ???

    /** Returns the bounding rectangle, in the list's coordinate system,
     *  for the range of cells specified by the two indices.
     */
    @stub
    def getCellBounds(index0: Int, index1: Int): Rectangle = ???

    /** Returns the object responsible for painting list items. */
    @stub
    def getCellRenderer(): ListCellRenderer[_ >: E] = ???

    /** Returns whether or not automatic drag handling is enabled. */
    @stub
    def getDragEnabled(): Boolean = ???

    /** Returns the location that this component should visually indicate
     *  as the drop location during a DnD operation over the component,
     *  or null if no location is to currently be shown.
     */
    @stub
    def getDropLocation(): JList.DropLocation = ???

    /** Returns the drop mode for this component. */
    @stub
    def getDropMode(): DropMode = ???

    /** Returns the smallest list index that is currently visible. */
    @stub
    def getFirstVisibleIndex(): Int = ???

    /** Returns the value of the fixedCellHeight property. */
    @stub
    def getFixedCellHeight(): Int = ???

    /** Returns the value of the fixedCellWidth property. */
    @stub
    def getFixedCellWidth(): Int = ???

    /** Returns the largest list index that is currently visible. */
    @stub
    def getLastVisibleIndex(): Int = ???

    /** Returns the layout orientation property for the list: VERTICAL
     *  if the layout is a single column of cells, VERTICAL_WRAP if the
     *  layout is "newspaper style" with the content flowing vertically then
     *  horizontally, or HORIZONTAL_WRAP if the layout is "newspaper
     *  style" with the content flowing horizontally then vertically.
     */
    @stub
    def getLayoutOrientation(): Int = ???

    /** Returns the lead selection index. */
    @stub
    def getLeadSelectionIndex(): Int = ???

    /** Returns an array of all the ListSelectionListeners added
     *  to this JList by way of addListSelectionListener.
     */
    @stub
    def getListSelectionListeners(): Array[ListSelectionListener] = ???

    /** Returns the largest selected cell index, or -1 if the selection
     *  is empty.
     */
    @stub
    def getMaxSelectionIndex(): Int = ???

    /** Returns the smallest selected cell index, or -1 if the selection
     *  is empty.
     */
    @stub
    def getMinSelectionIndex(): Int = ???

    /** Returns the data model that holds the list of items displayed
     *  by the JList component.
     */
    @stub
    def getModel(): ListModel[E] = ???

    /** Returns the next list element whose toString value
     *  starts with the given prefix.
     */
    @stub
    def getNextMatch(prefix: String, startIndex: Int, bias: Position.Bias): Int = ???

    /** Computes the size of viewport needed to display visibleRowCount
     *  rows.
     */
    @stub
    def getPreferredScrollableViewportSize(): Dimension = ???

    /** Returns the "prototypical" cell value -- a value used to calculate a
     *  fixed width and height for cells.
     */
    @stub
    def getPrototypeCellValue(): E = ???

    /** Returns the distance to scroll to expose the next or previous block. */
    @stub
    def getScrollableBlockIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int = ???

    /** Returns true if this JList is displayed in a
     *  JViewport and the viewport is taller than the list's
     *  preferred height, or if the layout orientation is VERTICAL_WRAP
     *  and visibleRowCount <= 0; otherwise returns false.
     */
    @stub
    def getScrollableTracksViewportHeight(): Boolean = ???

    /** Returns true if this JList is displayed in a
     *  JViewport and the viewport is wider than the list's
     *  preferred width, or if the layout orientation is HORIZONTAL_WRAP
     *  and visibleRowCount <= 0; otherwise returns false.
     */
    @stub
    def getScrollableTracksViewportWidth(): Boolean = ???

    /** Returns the distance to scroll to expose the next or previous
     *  row (for vertical scrolling) or column (for horizontal scrolling).
     */
    @stub
    def getScrollableUnitIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int = ???

    /** Returns the smallest selected cell index; the selection when only
     *  a single item is selected in the list.
     */
    @stub
    def getSelectedIndex(): Int = ???

    /** Returns an array of all of the selected indices, in increasing
     *  order.
     */
    @stub
    def getSelectedIndices(): Array[Int] = ???

    /** Returns the value for the smallest selected cell index;
     *  the selected value when only a single item is selected in the
     *  list.
     */
    @stub
    def getSelectedValue(): E = ???

    /** Deprecated. 
     * As of JDK 1.7, replaced by getSelectedValuesList()
     * 
     */
    @stub
    def getSelectedValues(): Array[Object] = ???

    /** Returns a list of all the selected items, in increasing order based
     *  on their indices in the list.
     */
    @stub
    def getSelectedValuesList(): List[E] = ???

    /** Returns the color used to draw the background of selected items. */
    @stub
    def getSelectionBackground(): Color = ???

    /** Returns the color used to draw the foreground of selected items. */
    @stub
    def getSelectionForeground(): Color = ???

    /** Returns the current selection mode for the list. */
    @stub
    def getSelectionMode(): Int = ???

    /** Returns the current selection model. */
    @stub
    def getSelectionModel(): ListSelectionModel = ???

    /** Returns the tooltip text to be used for the given event. */
    @stub
    def getToolTipText(event: MouseEvent): String = ???

    /** Returns the ListUI, the look and feel object that
     *  renders this component.
     */
    @stub
    def getUI(): ListUI = ???

    /** Returns "ListUI", the UIDefaults key used to look
     *  up the name of the javax.swing.plaf.ListUI class that defines
     *  the look and feel for this component.
     */
    @stub
    def getUIClassID(): String = ???

    /** Returns the value of the selection model's isAdjusting property. */
    @stub
    def getValueIsAdjusting(): Boolean = ???

    /** Returns the value of the visibleRowCount property. */
    @stub
    def getVisibleRowCount(): Int = ???

    /** Returns the origin of the specified item in the list's coordinate
     *  system.
     */
    @stub
    def indexToLocation(index: Int): Point = ???

    /** Returns true if the specified index is selected,
     *  else false.
     */
    @stub
    def isSelectedIndex(index: Int): Boolean = ???

    /** Returns true if nothing is selected, else false. */
    @stub
    def isSelectionEmpty(): Boolean = ???

    /** Returns the cell index closest to the given location in the list's
     *  coordinate system.
     */
    @stub
    def locationToIndex(location: Point): Int = ???

    /** Returns a String representation of this JList. */
    @stub
    protected def paramString(): String = ???

    /** Removes a selection listener from the list. */
    @stub
    def removeListSelectionListener(listener: ListSelectionListener): Unit = ???

    /** Sets the selection to be the set difference of the specified interval
     *  and the current selection.
     */
    @stub
    def removeSelectionInterval(index0: Int, index1: Int): Unit = ???

    /** Sets the delegate that is used to paint each cell in the list. */
    @stub
    def setCellRenderer(cellRenderer: ListCellRenderer[_ >: E]): Unit = ???

    /** Turns on or off automatic drag handling. */
    @stub
    def setDragEnabled(b: Boolean): Unit = ???

    /** Sets the drop mode for this component. */
    @stub
    def setDropMode(dropMode: DropMode): Unit = ???

    /** Sets a fixed value to be used for the height of every cell in the list. */
    @stub
    def setFixedCellHeight(height: Int): Unit = ???

    /** Sets a fixed value to be used for the width of every cell in the list. */
    @stub
    def setFixedCellWidth(width: Int): Unit = ???

    /** Defines the way list cells are layed out. */
    @stub
    def setLayoutOrientation(layoutOrientation: Int): Unit = ???

    /** Constructs a read-only ListModel from an array of items,
     *  and calls setModel with this model.
     */
    @stub
    def setListData(listData: Array[E]): Unit = ???

    /** Constructs a read-only ListModel from a Vector
     *  and calls setModel with this model.
     */
    @stub
    def setListData(listData: Vector[_ <: E]): Unit = ???

    /** Sets the model that represents the contents or "value" of the
     *  list, notifies property change listeners, and then clears the
     *  list's selection.
     */
    @stub
    def setModel(model: ListModel[E]): Unit = ???

    /** Sets the prototypeCellValue property, and then (if the new value
     *  is non-null), computes the fixedCellWidth and
     *  fixedCellHeight properties by requesting the cell renderer
     *  component for the given value (and index 0) from the cell renderer, and
     *  using that component's preferred size.
     */
    @stub
    def setPrototypeCellValue(prototypeCellValue: E): Unit = ???

    /** Selects a single cell. */
    @stub
    def setSelectedIndex(index: Int): Unit = ???

    /** Changes the selection to be the set of indices specified by the given
     *  array.
     */
    @stub
    def setSelectedIndices(indices: Array[Int]): Unit = ???

    /** Selects the specified object from the list. */
    @stub
    def setSelectedValue(anObject: Any, shouldScroll: Boolean): Unit = ???

    /** Sets the color used to draw the background of selected items, which
     *  cell renderers can use fill selected cells.
     */
    @stub
    def setSelectionBackground(selectionBackground: Color): Unit = ???

    /** Sets the color used to draw the foreground of selected items, which
     *  cell renderers can use to render text and graphics.
     */
    @stub
    def setSelectionForeground(selectionForeground: Color): Unit = ???

    /** Selects the specified interval. */
    @stub
    def setSelectionInterval(anchor: Int, lead: Int): Unit = ???

    /** Sets the selection mode for the list. */
    @stub
    def setSelectionMode(selectionMode: Int): Unit = ???

    /** Sets the selectionModel for the list to a
     *  non-null ListSelectionModel
     *  implementation.
     */
    @stub
    def setSelectionModel(selectionModel: ListSelectionModel): Unit = ???

    /** Sets the ListUI, the look and feel object that
     *  renders this component.
     */
    @stub
    def setUI(ui: ListUI): Unit = ???

    /** Sets the selection model's valueIsAdjusting property. */
    @stub
    def setValueIsAdjusting(b: Boolean): Unit = ???

    /** Sets the visibleRowCount property, which has different meanings
     *  depending on the layout orientation: For a VERTICAL layout
     *  orientation, this sets the preferred number of rows to display without
     *  requiring scrolling; for other orientations, it affects the wrapping of
     *  cells.
     */
    @stub
    def setVisibleRowCount(visibleRowCount: Int): Unit = ???

    /** Resets the ListUI property by setting it to the value provided
     *  by the current look and feel.
     */
    @stub
    def updateUI(): Unit = ???
}

object JList {
    /** A subclass of TransferHandler.DropLocation representing
     *  a drop location for a JList.
     */
    type DropLocation = JList_DropLocation

    /** Indicates a "newspaper style" layout with cells flowing horizontally
     *  then vertically.
     */
    @stub
    val HORIZONTAL_WRAP: Int = ???

    /** Indicates a vertical layout of cells, in a single column;
     *  the default layout.
     */
    @stub
    val VERTICAL: Int = ???

    /** Indicates a "newspaper style" layout with cells flowing vertically
     *  then horizontally.
     */
    @stub
    val VERTICAL_WRAP: Int = ???
}
