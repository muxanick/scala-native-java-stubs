package javax.swing

import java.awt.{Component, Container, Dimension, LayoutManager, Rectangle}
import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The layout manager used by JScrollPane.
 *  JScrollPaneLayout is
 *  responsible for nine components: a viewport, two scrollbars,
 *  a row header, a column header, and four "corner" components.
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
class ScrollPaneLayout extends Object with LayoutManager with ScrollPaneConstants with Serializable {

    /**  */
    @stub
    def this() = ???

    /** The column header child. */
    @stub
    protected val colHead: JViewport = ???

    /** The scrollpane's horizontal scrollbar child. */
    @stub
    protected val hsb: JScrollBar = ???

    /** The display policy for the horizontal scrollbar. */
    @stub
    protected val hsbPolicy: Int = ???

    /** The component to display in the lower left corner. */
    @stub
    protected val lowerLeft: Component = ???

    /** The component to display in the lower right corner. */
    @stub
    protected val lowerRight: Component = ???

    /** The row header child. */
    @stub
    protected val rowHead: JViewport = ???

    /** The component to display in the upper left corner. */
    @stub
    protected val upperLeft: Component = ???

    /** The component to display in the upper right corner. */
    @stub
    protected val upperRight: Component = ???

    /** The scrollpane's viewport child. */
    @stub
    protected val viewport: JViewport = ???

    /** The scrollpane's vertical scrollbar child. */
    @stub
    protected val vsb: JScrollBar = ???

    /** The display policy for the vertical scrollbar. */
    @stub
    protected val vsbPolicy: Int = ???

    /** Adds the specified component to the layout. */
    @stub
    def addLayoutComponent(s: String, c: Component): Unit = ???

    /** Removes an existing component. */
    @stub
    protected def addSingletonComponent(oldC: Component, newC: Component): Component = ???

    /** Returns the JViewport object that is the column header. */
    @stub
    def getColumnHeader(): JViewport = ???

    /** Returns the Component at the specified corner. */
    @stub
    def getCorner(key: String): Component = ???

    /** Returns the JScrollBar object that handles horizontal scrolling. */
    @stub
    def getHorizontalScrollBar(): JScrollBar = ???

    /** Returns the horizontal scrollbar-display policy. */
    @stub
    def getHorizontalScrollBarPolicy(): Int = ???

    /** Returns the JViewport object that is the row header. */
    @stub
    def getRowHeader(): JViewport = ???

    /** Returns the JScrollBar object that handles vertical scrolling. */
    @stub
    def getVerticalScrollBar(): JScrollBar = ???

    /** Returns the vertical scrollbar-display policy. */
    @stub
    def getVerticalScrollBarPolicy(): Int = ???

    /** Returns the JViewport object that displays the
     *  scrollable contents.
     */
    @stub
    def getViewport(): JViewport = ???

    /** Deprecated. 
     * As of JDK version Swing1.1
     *     replaced by JScrollPane.getViewportBorderBounds().
     * 
     */
    @stub
    def getViewportBorderBounds(scrollpane: JScrollPane): Rectangle = ???

    /** Lays out the scrollpane. */
    @stub
    def layoutContainer(parent: Container): Unit = ???

    /** The minimum size of a ScrollPane is the size of the insets
     *  plus minimum size of the viewport, plus the scrollpane's
     *  viewportBorder insets, plus the minimum size
     *  of the visible headers, plus the minimum size of the
     *  scrollbars whose displayPolicy isn't NEVER.
     */
    @stub
    def minimumLayoutSize(parent: Container): Dimension = ???

    /** The preferred size of a ScrollPane is the size of the insets,
     *  plus the preferred size of the viewport, plus the preferred size of
     *  the visible headers, plus the preferred size of the scrollbars
     *  that will appear given the current view and the current
     *  scrollbar displayPolicies.
     */
    @stub
    def preferredLayoutSize(parent: Container): Dimension = ???

    /** Removes the specified component from the layout. */
    @stub
    def removeLayoutComponent(c: Component): Unit = ???

    /** Sets the horizontal scrollbar-display policy. */
    @stub
    def setHorizontalScrollBarPolicy(x: Int): Unit = ???

    /** Sets the vertical scrollbar-display policy. */
    @stub
    def setVerticalScrollBarPolicy(x: Int): Unit = ???

    /** This method is invoked after the ScrollPaneLayout is set as the
     *  LayoutManager of a JScrollPane.
     */
    @stub
    def syncWithScrollPane(sp: JScrollPane): Unit = ???
}

object ScrollPaneLayout {
    /** The UI resource version of ScrollPaneLayout. */
    type UIResource = ScrollPaneLayout_UIResource
}
