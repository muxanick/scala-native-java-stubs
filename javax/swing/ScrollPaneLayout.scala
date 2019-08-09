package javax.swing

import java.awt.{Component, Container, Dimension, LayoutManager, Rectangle}
import java.io.Serializable
import java.lang.{Object, String}

// The layout manager used by JScrollPane.
// JScrollPaneLayout is
// responsible for nine components: a viewport, two scrollbars,
// a row header, a column header, and four "corner" components.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class ScrollPaneLayout extends Object with LayoutManager, with ScrollPaneConstants, with Serializable {

    @stub
    // The column header child.
    protected def colHead: JViewport = ???

    @stub
    // The scrollpane's horizontal scrollbar child.
    protected def hsb: JScrollBar = ???

    @stub
    // The display policy for the horizontal scrollbar.
    protected def hsbPolicy: Int = ???

    @stub
    // The component to display in the lower left corner.
    protected def lowerLeft: Component = ???

    @stub
    // The component to display in the lower right corner.
    protected def lowerRight: Component = ???

    @stub
    // The row header child.
    protected def rowHead: JViewport = ???

    @stub
    // The component to display in the upper left corner.
    protected def upperLeft: Component = ???

    @stub
    // The component to display in the upper right corner.
    protected def upperRight: Component = ???

    @stub
    // The scrollpane's viewport child.
    protected def viewport: JViewport = ???

    @stub
    // The scrollpane's vertical scrollbar child.
    protected def vsb: JScrollBar = ???

    @stub
    // Adds the specified component to the layout.
    def addLayoutComponent(s: String, c: Component): Unit = ???

    @stub
    // Removes an existing component.
    protected def addSingletonComponent(oldC: Component, newC: Component): Component = ???

    @stub
    // Returns the JViewport object that is the column header.
    def getColumnHeader(): JViewport = ???

    @stub
    // Returns the Component at the specified corner.
    def getCorner(key: String): Component = ???

    @stub
    // Returns the JScrollBar object that handles horizontal scrolling.
    def getHorizontalScrollBar(): JScrollBar = ???

    @stub
    // Returns the horizontal scrollbar-display policy.
    def getHorizontalScrollBarPolicy(): Int = ???

    @stub
    // Returns the JViewport object that is the row header.
    def getRowHeader(): JViewport = ???

    @stub
    // Returns the JScrollBar object that handles vertical scrolling.
    def getVerticalScrollBar(): JScrollBar = ???

    @stub
    // Returns the vertical scrollbar-display policy.
    def getVerticalScrollBarPolicy(): Int = ???

    @stub
    // Returns the JViewport object that displays the
    // scrollable contents.
    def getViewport(): JViewport = ???

    @stub
    // Deprecated. 
    //As of JDK version Swing1.1
    //    replaced by JScrollPane.getViewportBorderBounds().
    //
    def getViewportBorderBounds(scrollpane: JScrollPane): Rectangle = ???

    @stub
    // Lays out the scrollpane.
    def layoutContainer(parent: Container): Unit = ???

    @stub
    // The minimum size of a ScrollPane is the size of the insets
    // plus minimum size of the viewport, plus the scrollpane's
    // viewportBorder insets, plus the minimum size
    // of the visible headers, plus the minimum size of the
    // scrollbars whose displayPolicy isn't NEVER.
    def minimumLayoutSize(parent: Container): Dimension = ???

    @stub
    // The preferred size of a ScrollPane is the size of the insets,
    // plus the preferred size of the viewport, plus the preferred size of
    // the visible headers, plus the preferred size of the scrollbars
    // that will appear given the current view and the current
    // scrollbar displayPolicies.
    def preferredLayoutSize(parent: Container): Dimension = ???

    @stub
    // Removes the specified component from the layout.
    def removeLayoutComponent(c: Component): Unit = ???

    @stub
    // Sets the horizontal scrollbar-display policy.
    def setHorizontalScrollBarPolicy(x: Int): Unit = ???

    @stub
    // Sets the vertical scrollbar-display policy.
    def setVerticalScrollBarPolicy(x: Int): Unit = ???
}
