package javax.swing

import java.awt.{Component, Component.AccessibleAWTComponent, ComponentOrientation, Container, Container.AccessibleAWTContainer, LayoutManager, Rectangle}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole}
import javax.swing.border.Border
import javax.swing.event.{ChangeEvent, ChangeListener}
import javax.swing.plaf.{ScrollPaneUI, UIResource}
import scala.scalanative.annotation.stub

/** Provides a scrollable view of a lightweight component.
 *  A JScrollPane manages a viewport, optional
 *  vertical and horizontal scroll bars, and optional row and
 *  column heading viewports.
 *  You can find task-oriented documentation of JScrollPane in
 *   How to Use Scroll Panes,
 *  a section in The Java Tutorial.  Note that
 *  JScrollPane does not support heavyweight components.
 * 
 *  
 *     
 *     
 *       
 *     
 *     
 *  
 *  The JViewport provides a window,
 *  or "viewport" onto a data
 *  source -- for example, a text file. That data source is the
 *  "scrollable client" (aka data model) displayed by the
 *  JViewport view.
 *  A JScrollPane basically consists of JScrollBars,
 *  a JViewport, and the wiring between them,
 *  as shown in the diagram at right.
 *  
 *  In addition to the scroll bars and viewport,
 *  a JScrollPane can have a
 *  column header and a row header. Each of these is a
 *  JViewport object that
 *  you specify with setRowHeaderView,
 *  and setColumnHeaderView.
 *  The column header viewport automatically scrolls left and right, tracking
 *  the left-right scrolling of the main viewport.
 *  (It never scrolls vertically, however.)
 *  The row header acts in a similar fashion.
 *  
 *  Where two scroll bars meet, the row header meets the column header,
 *  or a scroll bar meets one of the headers, both components stop short
 *  of the corner, leaving a rectangular space which is, by default, empty.
 *  These spaces can potentially exist in any number of the four corners.
 *  In the previous diagram, the top right space is present and identified
 *  by the label "corner component".
 *  
 *  Any number of these empty spaces can be replaced by using the
 *  setCorner method to add a component to a particular corner.
 *  (Note: The same component cannot be added to multiple corners.)
 *  This is useful if there's
 *  some extra decoration or function you'd like to add to the scroll pane.
 *  The size of each corner component is entirely determined by the size of the
 *  headers and/or scroll bars that surround it.
 *  
 *  A corner component will only be visible if there is an empty space in that
 *  corner for it to exist in. For example, consider a component set into the
 *  top right corner of a scroll pane with a column header. If the scroll pane's
 *  vertical scrollbar is not present, perhaps because the view component hasn't
 *  grown large enough to require it, then the corner component will not be
 *  shown (since there is no empty space in that corner created by the meeting
 *  of the header and vertical scroll bar). Forcing the scroll bar to always be
 *  shown, using
 *  setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_ALWAYS),
 *  will ensure that the space for the corner component always exists.
 *  
 *  To add a border around the main viewport,
 *  you can use setViewportBorder.
 *  (Of course, you can also add a border around the whole scroll pane using
 *  setBorder.)
 *  
 *  A common operation to want to do is to set the background color that will
 *  be used if the main viewport view is smaller than the viewport, or is
 *  not opaque. This can be accomplished by setting the background color
 *  of the viewport, via scrollPane.getViewport().setBackground().
 *  The reason for setting the color of the viewport and not the scrollpane
 *  is that by default JViewport is opaque
 *  which, among other things, means it will completely fill
 *  in its background using its background color.  Therefore when
 *  JScrollPane draws its background the viewport will
 *  usually draw over it.
 *  
 *  By default JScrollPane uses ScrollPaneLayout
 *  to handle the layout of its child Components. ScrollPaneLayout
 *  determines the size to make the viewport view in one of two ways:
 *  
 *    If the view implements Scrollable
 *        a combination of getPreferredScrollableViewportSize,
 *        getScrollableTracksViewportWidth and
 *        getScrollableTracksViewportHeightis used, otherwise
 *    getPreferredSize is used.
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
 */
class JScrollPane extends JComponent with ScrollPaneConstants with Accessible {

    /** Creates an empty (no viewport view) JScrollPane
     *  where both horizontal and vertical scrollbars appear when needed.
     */
    @stub
    def this() = ???

    /** Creates a JScrollPane that displays the
     *  contents of the specified
     *  component, where both horizontal and vertical scrollbars appear
     *  whenever the component's contents are larger than the view.
     */
    @stub
    def this(view: Component) = ???

    /** Creates a JScrollPane that displays the view
     *  component in a viewport
     *  whose view position can be controlled with a pair of scrollbars.
     */
    @stub
    def this(view: Component, vsbPolicy: Int, hsbPolicy: Int) = ???

    /** Creates an empty (no viewport view) JScrollPane
     *  with specified
     *  scrollbar policies.
     */
    @stub
    def this(vsbPolicy: Int, hsbPolicy: Int) = ???

    /** This class implements accessibility support for the
     *  JScrollPane class.  It provides an implementation of the
     *  Java Accessibility API appropriate to scroll pane user-interface
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
    protected class AccessibleJScrollPane extends JComponent.AccessibleJComponent with ChangeListener with PropertyChangeListener {

        /** AccessibleJScrollPane constructor */
        @stub
        def this() = ???

        /**  */
        @stub
        protected val viewPort: JViewport = ???

        /** Get the role of this object. */
        @stub
        def getAccessibleRole(): AccessibleRole = ???

        /** This method gets called when a bound property is changed. */
        @stub
        def propertyChange(e: PropertyChangeEvent): Unit = ???

        /**  */
        @stub
        def resetViewPort(): Unit = ???

        /** Invoked when the target of the listener has changed its state. */
        @stub
        def stateChanged(e: ChangeEvent): Unit = ???
    }


    /** By default JScrollPane creates scrollbars
     *  that are instances
     *  of this class.  Scrollbar overrides the
     *  getUnitIncrement and getBlockIncrement
     *  methods so that, if the viewport's view is a Scrollable,
     *  the view is asked to compute these values. Unless
     *  the unit/block increment have been explicitly set.
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
    protected class ScrollBar extends JScrollBar with UIResource {

        /** Creates a scrollbar with the specified orientation. */
        @stub
        def this(orientation: Int) = ???

        /** Computes the block increment for scrolling if the viewport's
         *  view is a Scrollable object.
         */
        @stub
        def getBlockIncrement(direction: Int): Int = ???

        /** Computes the unit increment for scrolling if the viewport's
         *  view is a Scrollable object.
         */
        @stub
        def getUnitIncrement(direction: Int): Int = ???

        /** Messages super to set the value, and resets the
         *  blockIncrementSet instance variable to true.
         */
        @stub
        def setBlockIncrement(blockIncrement: Int): Unit = ???

        /** Messages super to set the value, and resets the
         *  unitIncrementSet instance variable to true.
         */
        @stub
        def setUnitIncrement(unitIncrement: Int): Unit = ???
    }


    /** The column header child. */
    @stub
    protected val columnHeader: JViewport = ???

    /** The scrollpane's horizontal scrollbar child. */
    @stub
    protected val horizontalScrollBar: JScrollBar = ???

    /** The display policy for the horizontal scrollbar. */
    @stub
    protected val horizontalScrollBarPolicy: Int = ???

    /** The component to display in the lower left corner. */
    @stub
    protected val lowerLeft: Component = ???

    /** The component to display in the lower right corner. */
    @stub
    protected val lowerRight: Component = ???

    /** The row header child. */
    @stub
    protected val rowHeader: JViewport = ???

    /** The component to display in the upper left corner. */
    @stub
    protected val upperLeft: Component = ???

    /** The component to display in the upper right corner. */
    @stub
    protected val upperRight: Component = ???

    /** The scrollpane's vertical scrollbar child. */
    @stub
    protected val verticalScrollBar: JScrollBar = ???

    /** The display policy for the vertical scrollbar. */
    @stub
    protected val verticalScrollBarPolicy: Int = ???

    /** The scrollpane's viewport child. */
    @stub
    protected val viewport: JViewport = ???

    /** Returns a JScrollPane.ScrollBar by default. */
    @stub
    def createHorizontalScrollBar(): JScrollBar = ???

    /** Returns a JScrollPane.ScrollBar by default. */
    @stub
    def createVerticalScrollBar(): JScrollBar = ???

    /** Returns a new JViewport by default. */
    @stub
    protected def createViewport(): JViewport = ???

    /** Gets the AccessibleContext associated with this JScrollPane. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the column header. */
    @stub
    def getColumnHeader(): JViewport = ???

    /** Returns the component at the specified corner. */
    @stub
    def getCorner(key: String): Component = ???

    /** Returns the horizontal scroll bar that controls the viewport's
     *  horizontal view position.
     */
    @stub
    def getHorizontalScrollBar(): JScrollBar = ???

    /** Returns the horizontal scroll bar policy value. */
    @stub
    def getHorizontalScrollBarPolicy(): Int = ???

    /** Returns the row header. */
    @stub
    def getRowHeader(): JViewport = ???

    /** Returns the look and feel (L&F) object that renders this component. */
    @stub
    def getUI(): ScrollPaneUI = ???

    /** Returns the suffix used to construct the name of the L&F class used to
     *  render this component.
     */
    @stub
    def getUIClassID(): String = ???

    /** Returns the vertical scroll bar that controls the viewports
     *  vertical view position.
     */
    @stub
    def getVerticalScrollBar(): JScrollBar = ???

    /** Returns the vertical scroll bar policy value. */
    @stub
    def getVerticalScrollBarPolicy(): Int = ???

    /** Returns the current JViewport. */
    @stub
    def getViewport(): JViewport = ???

    /** Returns the Border object that surrounds the viewport. */
    @stub
    def getViewportBorder(): Border = ???

    /** Returns the bounds of the viewport's border. */
    @stub
    def getViewportBorderBounds(): Rectangle = ???

    /** Overridden to return true so that any calls to revalidate
     *  on any descendants of this JScrollPane will cause the
     *  entire tree beginning with this JScrollPane to be
     *  validated.
     */
    @stub
    def isValidateRoot(): Boolean = ???

    /** Indicates whether or not scrolling will take place in response to the
     *  mouse wheel.
     */
    @stub
    def isWheelScrollingEnabled(): Boolean = ???

    /** Returns a string representation of this JScrollPane. */
    @stub
    protected def paramString(): String = ???

    /** Removes the old columnHeader, if it exists; if the new columnHeader
     *  isn't null, syncs the x coordinate of its viewPosition
     *  with the viewport (if there is one) and then adds it to the scroll pane.
     */
    @stub
    def setColumnHeader(columnHeader: JViewport): Unit = ???

    /** Creates a column-header viewport if necessary, sets
     *  its view, and then adds the column-header viewport
     *  to the scrollpane.
     */
    @stub
    def setColumnHeaderView(view: Component): Unit = ???

    /** Sets the orientation for the vertical and horizontal
     *  scrollbars as determined by the
     *  ComponentOrientation argument.
     */
    @stub
    def setComponentOrientation(co: ComponentOrientation): Unit = ???

    /** Adds a child that will appear in one of the scroll panes
     *  corners, if there's room.
     */
    @stub
    def setCorner(key: String, corner: Component): Unit = ???

    /** Adds the scrollbar that controls the viewport's horizontal view
     *  position to the scrollpane.
     */
    @stub
    def setHorizontalScrollBar(horizontalScrollBar: JScrollBar): Unit = ???

    /** Determines when the horizontal scrollbar appears in the scrollpane. */
    @stub
    def setHorizontalScrollBarPolicy(policy: Int): Unit = ???

    /** Sets the layout manager for this JScrollPane. */
    @stub
    def setLayout(layout: LayoutManager): Unit = ???

    /** Removes the old rowHeader, if it exists; if the new rowHeader
     *  isn't null, syncs the y coordinate of its
     *  viewPosition with
     *  the viewport (if there is one) and then adds it to the scroll pane.
     */
    @stub
    def setRowHeader(rowHeader: JViewport): Unit = ???

    /** Creates a row-header viewport if necessary, sets
     *  its view and then adds the row-header viewport
     *  to the scrollpane.
     */
    @stub
    def setRowHeaderView(view: Component): Unit = ???

    /** Sets the ScrollPaneUI object that provides the
     *  look and feel (L&F) for this component.
     */
    @stub
    def setUI(ui: ScrollPaneUI): Unit = ???

    /** Adds the scrollbar that controls the viewports vertical view position
     *  to the scrollpane.
     */
    @stub
    def setVerticalScrollBar(verticalScrollBar: JScrollBar): Unit = ???

    /** Determines when the vertical scrollbar appears in the scrollpane. */
    @stub
    def setVerticalScrollBarPolicy(policy: Int): Unit = ???

    /** Removes the old viewport (if there is one); forces the
     *  viewPosition of the new viewport to be in the +x,+y quadrant;
     *  syncs up the row and column headers (if there are any) with the
     *  new viewport; and finally syncs the scrollbars and
     *  headers with the new viewport.
     */
    @stub
    def setViewport(viewport: JViewport): Unit = ???

    /** Adds a border around the viewport. */
    @stub
    def setViewportBorder(viewportBorder: Border): Unit = ???

    /** Creates a viewport if necessary and then sets its view. */
    @stub
    def setViewportView(view: Component): Unit = ???

    /** Enables/disables scrolling in response to movement of the mouse wheel. */
    @stub
    def setWheelScrollingEnabled(handleWheel: Boolean): Unit = ???

    /** Replaces the current ScrollPaneUI object with a version
     *  from the current default look and feel.
     */
    @stub
    def updateUI(): Unit = ???
}
