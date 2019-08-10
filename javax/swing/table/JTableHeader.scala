package javax.swing.table

import java.awt.{Color, Component, Component.AccessibleAWTComponent, Container, Container.AccessibleAWTContainer, Cursor, Dimension, Font, FontMetrics, Point, Rectangle}
import java.awt.event.{FocusListener, MouseEvent}
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import java.util.Locale
import javax.accessibility.{Accessible, AccessibleAction, AccessibleComponent, AccessibleContext, AccessibleRole, AccessibleSelection, AccessibleStateSet, AccessibleText, AccessibleValue}
import javax.swing.{JComponent, JComponent.AccessibleJComponent, JTable}
import javax.swing.event.{ChangeEvent, ListSelectionEvent, TableColumnModelEvent, TableColumnModelListener}
import javax.swing.plaf.TableHeaderUI
import scala.scalanative.annotation.stub

/** This is the object which manages the header of the JTable.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class JTableHeader extends JComponent with TableColumnModelListener with Accessible {

    /** Constructs a JTableHeader with a default
     *   TableColumnModel.
     */
    @stub
    def this() = ???

    /** Constructs a JTableHeader which is initialized with
     *   cm as the column model.
     */
    @stub
    def this(cm: TableColumnModel) = ???

    /** This class implements accessibility support for the
     *  JTableHeader class.  It provides an implementation of the
     *  Java Accessibility API appropriate to table header user-interface
     *  elements.
     *  
     *  Warning:
     *  Serialized objects of this class will not be compatible with
     *  future Swing releases. The current serialization support is
     *  appropriate for short term storage or RMI between applications running
     *  the same version of Swing.  As of 1.4, support for long term storage
     *  of all JavaBeans™
     *  has been added to the java.beans package.
     *  Please see XMLEncoder.
     */
    protected class AccessibleJTableHeader extends JComponent.AccessibleJComponent {

        /**  */
        @stub
        protected def this() = ???

        /** This class provides an implementation of the Java Accessibility
         *  API appropriate for JTableHeader entries.
         */
        protected class AccessibleJTableHeaderEntry extends AccessibleContext with Accessible with AccessibleComponent {

            /** Constructs an AccessiblJTableHeaaderEntry */
            @stub
            def this(c: Int, p: JTableHeader, t: JTable) = ???

            /** Adds the specified focus listener to receive focus events from this
             *  component.
             */
            @stub
            def addFocusListener(l: FocusListener): Unit = ???

            /** Adds a PropertyChangeListener to the listener list. */
            @stub
            def addPropertyChangeListener(l: PropertyChangeListener): Unit = ???

            /** Checks whether the specified point is within this object's bounds,
             *  where the point's x and y coordinates are defined to be relative to the
             *  coordinate system of the object.
             */
            @stub
            def contains(p: Point): Boolean = ???

            /** Gets the AccessibleAction associated with this object that supports
             *  one or more actions.
             */
            @stub
            def getAccessibleAction(): AccessibleAction = ???

            /** Returns the Accessible child, if one exists, contained at the local
             *  coordinate Point.
             */
            @stub
            def getAccessibleAt(p: Point): Accessible = ???

            /** Returns the specified Accessible child of the object. */
            @stub
            def getAccessibleChild(i: Int): Accessible = ???

            /** Returns the number of accessible children of the object. */
            @stub
            def getAccessibleChildrenCount(): Int = ???

            /** Get the AccessibleComponent associated with this object. */
            @stub
            def getAccessibleComponent(): AccessibleComponent = ???

            /** Get the AccessibleContext associated with this object. */
            @stub
            def getAccessibleContext(): AccessibleContext = ???

            /** Gets the accessibleDescription property of this object. */
            @stub
            def getAccessibleDescription(): String = ???

            /** Gets the 0-based index of this object in its accessible parent. */
            @stub
            def getAccessibleIndexInParent(): Int = ???

            /** Gets the accessibleName property of this object. */
            @stub
            def getAccessibleName(): String = ???

            /** Gets the role of this object. */
            @stub
            def getAccessibleRole(): AccessibleRole = ???

            /** Gets the AccessibleSelection associated with this object which allows its
             *  Accessible children to be selected.
             */
            @stub
            def getAccessibleSelection(): AccessibleSelection = ???

            /** Gets the state set of this object. */
            @stub
            def getAccessibleStateSet(): AccessibleStateSet = ???

            /** Gets the AccessibleText associated with this object presenting
             *  text on the display.
             */
            @stub
            def getAccessibleText(): AccessibleText = ???

            /** Gets the AccessibleValue associated with this object that supports a
             *  Numerical value.
             */
            @stub
            def getAccessibleValue(): AccessibleValue = ???

            /** Gets the background color of this object. */
            @stub
            def getBackground(): Color = ???

            /** Gets the bounds of this object in the form of a Rectangle object. */
            @stub
            def getBounds(): Rectangle = ???

            /** Gets the Cursor of this object. */
            @stub
            def getCursor(): Cursor = ???

            /** Gets the Font of this object. */
            @stub
            def getFont(): Font = ???

            /** Gets the FontMetrics of this object. */
            @stub
            def getFontMetrics(f: Font): FontMetrics = ???

            /** Gets the foreground color of this object. */
            @stub
            def getForeground(): Color = ???

            /** Gets the locale of the component. */
            @stub
            def getLocale(): Locale = ???

            /** Gets the location of the object relative to the parent in the form
             *  of a point specifying the object's top-left corner in the screen's
             *  coordinate space.
             */
            @stub
            def getLocation(): Point = ???

            /** Returns the location of the object on the screen. */
            @stub
            def getLocationOnScreen(): Point = ???

            /** Returns the size of this object in the form of a Dimension object. */
            @stub
            def getSize(): Dimension = ???

            /** Determines if the object is enabled. */
            @stub
            def isEnabled(): Boolean = ???

            /** Returns whether this object can accept focus or not. */
            @stub
            def isFocusTraversable(): Boolean = ???

            /** Determines if the object is showing. */
            @stub
            def isShowing(): Boolean = ???

            /** Determines if the object is visible. */
            @stub
            def isVisible(): Boolean = ???

            /** Removes the specified focus listener so it no longer receives focus
             *  events from this component.
             */
            @stub
            def removeFocusListener(l: FocusListener): Unit = ???

            /** Removes a PropertyChangeListener from the listener list. */
            @stub
            def removePropertyChangeListener(l: PropertyChangeListener): Unit = ???

            /** Requests focus for this object. */
            @stub
            def requestFocus(): Unit = ???

            /** Sets the accessible description of this object. */
            @stub
            def setAccessibleDescription(s: String): Unit = ???

            /** Sets the localized accessible name of this object. */
            @stub
            def setAccessibleName(s: String): Unit = ???

            /** Sets the background color of this object. */
            @stub
            def setBackground(c: Color): Unit = ???

            /** Sets the bounds of this object in the form of a Rectangle object. */
            @stub
            def setBounds(r: Rectangle): Unit = ???

            /** Sets the Cursor of this object. */
            @stub
            def setCursor(c: Cursor): Unit = ???

            /** Sets the enabled state of the object. */
            @stub
            def setEnabled(b: Boolean): Unit = ???

            /** Sets the Font of this object. */
            @stub
            def setFont(f: Font): Unit = ???

            /** Sets the foreground color of this object. */
            @stub
            def setForeground(c: Color): Unit = ???

            /** Sets the location of the object relative to the parent. */
            @stub
            def setLocation(p: Point): Unit = ???

            /** Resizes this object so that it has width and height. */
            @stub
            def setSize(d: Dimension): Unit = ???

            /** Sets the visible state of the object. */
            @stub
            def setVisible(b: Boolean): Unit = ???
        }


        /** Returns the Accessible child, if one exists, contained at the local
         *  coordinate Point.
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
    }


    /** The TableColumnModel of the table header. */
    @stub
    protected val columnModel: TableColumnModel = ???

    /** The index of the column being dragged. */
    @stub
    protected val draggedColumn: TableColumn = ???

    /** The distance from its original position the column has been dragged. */
    @stub
    protected val draggedDistance: Int = ???

    /** If true, reordering of columns are allowed by the user;
     *  the default is true.
     */
    @stub
    protected val reorderingAllowed: Boolean = ???

    /** If true, resizing of columns are allowed by the user;
     *  the default is true.
     */
    @stub
    protected val resizingAllowed: Boolean = ???

    /** The index of the column being resized. */
    @stub
    protected val resizingColumn: TableColumn = ???

    /** The table for which this object is the header;
     *  the default is null.
     */
    @stub
    protected val table: JTable = ???

    /** Obsolete as of Java 2 platform v1.3. */
    @stub
    protected val updateTableInRealTime: Boolean = ???

    /** Invoked when a column is added to the table column model. */
    @stub
    def columnAdded(e: TableColumnModelEvent): Unit = ???

    /** Returns the index of the column that point lies in, or -1 if it
     *  lies out of bounds.
     */
    @stub
    def columnAtPoint(point: Point): Int = ???

    /** Invoked when a column is moved due to a margin change. */
    @stub
    def columnMarginChanged(e: ChangeEvent): Unit = ???

    /** Invoked when a column is repositioned. */
    @stub
    def columnMoved(e: TableColumnModelEvent): Unit = ???

    /** Invoked when a column is removed from the table column model. */
    @stub
    def columnRemoved(e: TableColumnModelEvent): Unit = ???

    /** Invoked when the selection model of the TableColumnModel
     *  is changed.
     */
    @stub
    def columnSelectionChanged(e: ListSelectionEvent): Unit = ???

    /** Returns the default column model object which is
     *   a DefaultTableColumnModel.
     */
    @stub
    protected def createDefaultColumnModel(): TableColumnModel = ???

    /** Returns a default renderer to be used when no header renderer
     *   is defined by a TableColumn.
     */
    @stub
    protected def createDefaultRenderer(): TableCellRenderer = ???

    /** Gets the AccessibleContext associated with this JTableHeader. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the TableColumnModel that contains all column information
     *  of this table header.
     */
    @stub
    def getColumnModel(): TableColumnModel = ???

    /** Returns the default renderer used when no headerRenderer
     *  is defined by a TableColumn.
     */
    @stub
    def getDefaultRenderer(): TableCellRenderer = ???

    /** Returns the the dragged column, if and only if, a drag is in
     *  process, otherwise returns null.
     */
    @stub
    def getDraggedColumn(): TableColumn = ???

    /** Returns the column's horizontal distance from its original
     *  position, if and only if, a drag is in process.
     */
    @stub
    def getDraggedDistance(): Int = ???

    /** Returns the rectangle containing the header tile at column. */
    @stub
    def getHeaderRect(column: Int): Rectangle = ???

    /** Returns true if the user is allowed to rearrange columns by
     *  dragging their headers, false otherwise.
     */
    @stub
    def getReorderingAllowed(): Boolean = ???

    /** Returns true if the user is allowed to resize columns by dragging
     *  between their headers, false otherwise.
     */
    @stub
    def getResizingAllowed(): Boolean = ???

    /** Returns the resizing column. */
    @stub
    def getResizingColumn(): TableColumn = ???

    /** Returns the table associated with this header. */
    @stub
    def getTable(): JTable = ???

    /** Allows the renderer's tips to be used if there is text set. */
    @stub
    def getToolTipText(event: MouseEvent): String = ???

    /** Returns the look and feel (L&F) object that renders this component. */
    @stub
    def getUI(): TableHeaderUI = ???

    /** Returns the suffix used to construct the name of the look and feel
     *  (L&F) class used to render this component.
     */
    @stub
    def getUIClassID(): String = ???

    /** Obsolete as of Java 2 platform v1.3. */
    @stub
    def getUpdateTableInRealTime(): Boolean = ???

    /** Initializes the local variables and properties with default values. */
    @stub
    protected def initializeLocalVars(): Unit = ???

    /** Returns a string representation of this JTableHeader. */
    @stub
    protected def paramString(): String = ???

    /** Sizes the header and marks it as needing display. */
    @stub
    def resizeAndRepaint(): Unit = ???

    /** Sets the column model for this table to newModel and registers
     *   for listener notifications from the new column model.
     */
    @stub
    def setColumnModel(columnModel: TableColumnModel): Unit = ???

    /** Sets the default renderer to be used when no headerRenderer
     *  is defined by a TableColumn.
     */
    @stub
    def setDefaultRenderer(defaultRenderer: TableCellRenderer): Unit = ???

    /** Sets the header's draggedColumn to aColumn. */
    @stub
    def setDraggedColumn(aColumn: TableColumn): Unit = ???

    /** Sets the header's draggedDistance to distance. */
    @stub
    def setDraggedDistance(distance: Int): Unit = ???

    /** Sets whether the user can drag column headers to reorder columns. */
    @stub
    def setReorderingAllowed(reorderingAllowed: Boolean): Unit = ???

    /** Sets whether the user can resize columns by dragging between headers. */
    @stub
    def setResizingAllowed(resizingAllowed: Boolean): Unit = ???

    /** Sets the header's resizingColumn to aColumn. */
    @stub
    def setResizingColumn(aColumn: TableColumn): Unit = ???

    /** Sets the table associated with this header. */
    @stub
    def setTable(table: JTable): Unit = ???

    /** Sets the look and feel (L&F) object that renders this component. */
    @stub
    def setUI(ui: TableHeaderUI): Unit = ???

    /** Obsolete as of Java 2 platform v1.3. */
    @stub
    def setUpdateTableInRealTime(flag: Boolean): Unit = ???

    /** Notification from the UIManager that the look and feel
     *  (L&F) has changed.
     */
    @stub
    def updateUI(): Unit = ???
}
