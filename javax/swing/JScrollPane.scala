package javax.swing

import java.awt.{Component, ComponentOrientation, Container, LayoutManager, Rectangle}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.border.Border
import javax.swing.plaf.ScrollPaneUI

// Provides a scrollable view of a lightweight component.
// A JScrollPane manages a viewport, optional
// vertical and horizontal scroll bars, and optional row and
// column heading viewports.
// You can find task-oriented documentation of JScrollPane in
//  How to Use Scroll Panes,
// a section in The Java Tutorial.  Note that
// JScrollPane does not support heavyweight components.
//
// 
//    
//    
//      
//    
//    
// 
// The JViewport provides a window,
// or "viewport" onto a data
// source -- for example, a text file. That data source is the
// "scrollable client" (aka data model) displayed by the
// JViewport view.
// A JScrollPane basically consists of JScrollBars,
// a JViewport, and the wiring between them,
// as shown in the diagram at right.
// 
// In addition to the scroll bars and viewport,
// a JScrollPane can have a
// column header and a row header. Each of these is a
// JViewport object that
// you specify with setRowHeaderView,
// and setColumnHeaderView.
// The column header viewport automatically scrolls left and right, tracking
// the left-right scrolling of the main viewport.
// (It never scrolls vertically, however.)
// The row header acts in a similar fashion.
// 
// Where two scroll bars meet, the row header meets the column header,
// or a scroll bar meets one of the headers, both components stop short
// of the corner, leaving a rectangular space which is, by default, empty.
// These spaces can potentially exist in any number of the four corners.
// In the previous diagram, the top right space is present and identified
// by the label "corner component".
// 
// Any number of these empty spaces can be replaced by using the
// setCorner method to add a component to a particular corner.
// (Note: The same component cannot be added to multiple corners.)
// This is useful if there's
// some extra decoration or function you'd like to add to the scroll pane.
// The size of each corner component is entirely determined by the size of the
// headers and/or scroll bars that surround it.
// 
// A corner component will only be visible if there is an empty space in that
// corner for it to exist in. For example, consider a component set into the
// top right corner of a scroll pane with a column header. If the scroll pane's
// vertical scrollbar is not present, perhaps because the view component hasn't
// grown large enough to require it, then the corner component will not be
// shown (since there is no empty space in that corner created by the meeting
// of the header and vertical scroll bar). Forcing the scroll bar to always be
// shown, using
// setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_ALWAYS),
// will ensure that the space for the corner component always exists.
// 
// To add a border around the main viewport,
// you can use setViewportBorder.
// (Of course, you can also add a border around the whole scroll pane using
// setBorder.)
// 
// A common operation to want to do is to set the background color that will
// be used if the main viewport view is smaller than the viewport, or is
// not opaque. This can be accomplished by setting the background color
// of the viewport, via scrollPane.getViewport().setBackground().
// The reason for setting the color of the viewport and not the scrollpane
// is that by default JViewport is opaque
// which, among other things, means it will completely fill
// in its background using its background color.  Therefore when
// JScrollPane draws its background the viewport will
// usually draw over it.
// 
// By default JScrollPane uses ScrollPaneLayout
// to handle the layout of its child Components. ScrollPaneLayout
// determines the size to make the viewport view in one of two ways:
// 
//   If the view implements Scrollable
//       a combination of getPreferredScrollableViewportSize,
//       getScrollableTracksViewportWidth and
//       getScrollableTracksViewportHeightis used, otherwise
//   getPreferredSize is used.
// 
// 
// Warning: Swing is not thread safe. For more
// information see Swing's Threading
// Policy.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class JScrollPane extends JComponent with ScrollPaneConstants, with Accessible {

    @stub
    // Creates an empty (no viewport view) JScrollPane
    // where both horizontal and vertical scrollbars appear when needed.
    def this() = ???

    @stub
    // Creates a JScrollPane that displays the
    // contents of the specified
    // component, where both horizontal and vertical scrollbars appear
    // whenever the component's contents are larger than the view.
    def this(view: Component) = ???

    @stub
    // Creates a JScrollPane that displays the view
    // component in a viewport
    // whose view position can be controlled with a pair of scrollbars.
    def this(view: Component, vsbPolicy: Int, hsbPolicy: Int) = ???

    @stub
    // This class implements accessibility support for the
    // JScrollPane class.
    protected def JScrollPane.AccessibleJScrollPane: class = ???

    @stub
    // The column header child.
    protected def columnHeader: JViewport = ???

    @stub
    // The scrollpane's horizontal scrollbar child.
    protected def horizontalScrollBar: JScrollBar = ???

    @stub
    // The display policy for the horizontal scrollbar.
    protected def horizontalScrollBarPolicy: Int = ???

    @stub
    // The component to display in the lower left corner.
    protected def lowerLeft: Component = ???

    @stub
    // The component to display in the lower right corner.
    protected def lowerRight: Component = ???

    @stub
    // The row header child.
    protected def rowHeader: JViewport = ???

    @stub
    // The component to display in the upper left corner.
    protected def upperLeft: Component = ???

    @stub
    // The component to display in the upper right corner.
    protected def upperRight: Component = ???

    @stub
    // The scrollpane's vertical scrollbar child.
    protected def verticalScrollBar: JScrollBar = ???

    @stub
    // The display policy for the vertical scrollbar.
    protected def verticalScrollBarPolicy: Int = ???

    @stub
    // Returns a JScrollPane.ScrollBar by default.
    def createHorizontalScrollBar(): JScrollBar = ???

    @stub
    // Returns a JScrollPane.ScrollBar by default.
    def createVerticalScrollBar(): JScrollBar = ???

    @stub
    // Returns a new JViewport by default.
    protected def createViewport(): JViewport = ???

    @stub
    // Gets the AccessibleContext associated with this JScrollPane.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the column header.
    def getColumnHeader(): JViewport = ???

    @stub
    // Returns the component at the specified corner.
    def getCorner(key: String): Component = ???

    @stub
    // Returns the horizontal scroll bar that controls the viewport's
    // horizontal view position.
    def getHorizontalScrollBar(): JScrollBar = ???

    @stub
    // Returns the horizontal scroll bar policy value.
    def getHorizontalScrollBarPolicy(): Int = ???

    @stub
    // Returns the row header.
    def getRowHeader(): JViewport = ???

    @stub
    // Returns the look and feel (L&F) object that renders this component.
    def getUI(): ScrollPaneUI = ???

    @stub
    // Returns the suffix used to construct the name of the L&F class used to
    // render this component.
    def getUIClassID(): String = ???

    @stub
    // Returns the vertical scroll bar that controls the viewports
    // vertical view position.
    def getVerticalScrollBar(): JScrollBar = ???

    @stub
    // Returns the vertical scroll bar policy value.
    def getVerticalScrollBarPolicy(): Int = ???

    @stub
    // Returns the current JViewport.
    def getViewport(): JViewport = ???

    @stub
    // Returns the Border object that surrounds the viewport.
    def getViewportBorder(): Border = ???

    @stub
    // Returns the bounds of the viewport's border.
    def getViewportBorderBounds(): Rectangle = ???

    @stub
    // Overridden to return true so that any calls to revalidate
    // on any descendants of this JScrollPane will cause the
    // entire tree beginning with this JScrollPane to be
    // validated.
    def isValidateRoot(): Boolean = ???

    @stub
    // Indicates whether or not scrolling will take place in response to the
    // mouse wheel.
    def isWheelScrollingEnabled(): Boolean = ???

    @stub
    // Returns a string representation of this JScrollPane.
    protected def paramString(): String = ???

    @stub
    // Removes the old columnHeader, if it exists; if the new columnHeader
    // isn't null, syncs the x coordinate of its viewPosition
    // with the viewport (if there is one) and then adds it to the scroll pane.
    def setColumnHeader(columnHeader: JViewport): Unit = ???

    @stub
    // Creates a column-header viewport if necessary, sets
    // its view, and then adds the column-header viewport
    // to the scrollpane.
    def setColumnHeaderView(view: Component): Unit = ???

    @stub
    // Sets the orientation for the vertical and horizontal
    // scrollbars as determined by the
    // ComponentOrientation argument.
    def setComponentOrientation(co: ComponentOrientation): Unit = ???

    @stub
    // Adds a child that will appear in one of the scroll panes
    // corners, if there's room.
    def setCorner(key: String, corner: Component): Unit = ???

    @stub
    // Adds the scrollbar that controls the viewport's horizontal view
    // position to the scrollpane.
    def setHorizontalScrollBar(horizontalScrollBar: JScrollBar): Unit = ???

    @stub
    // Determines when the horizontal scrollbar appears in the scrollpane.
    def setHorizontalScrollBarPolicy(policy: Int): Unit = ???

    @stub
    // Sets the layout manager for this JScrollPane.
    def setLayout(layout: LayoutManager): Unit = ???

    @stub
    // Removes the old rowHeader, if it exists; if the new rowHeader
    // isn't null, syncs the y coordinate of its
    // viewPosition with
    // the viewport (if there is one) and then adds it to the scroll pane.
    def setRowHeader(rowHeader: JViewport): Unit = ???

    @stub
    // Creates a row-header viewport if necessary, sets
    // its view and then adds the row-header viewport
    // to the scrollpane.
    def setRowHeaderView(view: Component): Unit = ???

    @stub
    // Sets the ScrollPaneUI object that provides the
    // look and feel (L&F) for this component.
    def setUI(ui: ScrollPaneUI): Unit = ???

    @stub
    // Adds the scrollbar that controls the viewports vertical view position
    // to the scrollpane.
    def setVerticalScrollBar(verticalScrollBar: JScrollBar): Unit = ???

    @stub
    // Determines when the vertical scrollbar appears in the scrollpane.
    def setVerticalScrollBarPolicy(policy: Int): Unit = ???

    @stub
    // Removes the old viewport (if there is one); forces the
    // viewPosition of the new viewport to be in the +x,+y quadrant;
    // syncs up the row and column headers (if there are any) with the
    // new viewport; and finally syncs the scrollbars and
    // headers with the new viewport.
    def setViewport(viewport: JViewport): Unit = ???

    @stub
    // Adds a border around the viewport.
    def setViewportBorder(viewportBorder: Border): Unit = ???

    @stub
    // Creates a viewport if necessary and then sets its view.
    def setViewportView(view: Component): Unit = ???

    @stub
    // Enables/disables scrolling in response to movement of the mouse wheel.
    def setWheelScrollingEnabled(handleWheel: Boolean): Unit = ???
}
