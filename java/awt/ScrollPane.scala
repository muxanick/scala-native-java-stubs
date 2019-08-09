package java.awt

import java.awt.event.MouseWheelEvent
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}

// A container class which implements automatic horizontal and/or
// vertical scrolling for a single child component.  The display
// policy for the scrollbars can be set to:
// 
// as needed: scrollbars created and shown only when needed by scrollpane
// always: scrollbars created and always shown by the scrollpane
// never: scrollbars never created or shown by the scrollpane
// 
// 
// The state of the horizontal and vertical scrollbars is represented
// by two ScrollPaneAdjustable objects (one for each
// dimension) which implement the Adjustable interface.
// The API provides methods to access those objects such that the
// attributes on the Adjustable object (such as unitIncrement, value,
// etc.) can be manipulated.
// 
// Certain adjustable properties (minimum, maximum, blockIncrement,
// and visibleAmount) are set internally by the scrollpane in accordance
// with the geometry of the scrollpane and its child and these should
// not be set by programs using the scrollpane.
// 
// If the scrollbar display policy is defined as "never", then the
// scrollpane can still be programmatically scrolled using the
// setScrollPosition() method and the scrollpane will move and clip
// the child's contents appropriately.  This policy is useful if the
// program needs to create and manage its own adjustable controls.
// 
// The placement of the scrollbars is controlled by platform-specific
// properties set by the user outside of the program.
// 
// The initial size of this container is set to 100x100, but can
// be reset using setSize().
// 
// Scrolling with the wheel on a wheel-equipped mouse is enabled by default.
// This can be disabled using setWheelScrollingEnabled.
// Wheel scrolling can be customized by setting the block and
// unit increment of the horizontal and vertical Adjustables.
// For information on how mouse wheel events are dispatched, see
// the class description for MouseWheelEvent.
// 
// Insets are used to define any space used by scrollbars and any
// borders created by the scroll pane. getInsets() can be used
// to get the current value for the insets.  If the value of
// scrollbarsAlwaysVisible is false, then the value of the insets
// will change dynamically depending on whether the scrollbars are
// currently visible or not.
class ScrollPane extends Container with Accessible {

    @stub
    // Create a new scrollpane container with a scrollbar display
    // policy of "as needed".
    def this() = ???

    @stub
    // Adds the specified component to this scroll pane container.
    protected def addImpl(comp: Component, constraints: Object, index: Int): Unit = ???

    @stub
    // Creates the scroll pane's peer.
    def addNotify(): Unit = ???

    @stub
    // Lays out this container by resizing its child to its preferred size.
    def doLayout(): Unit = ???

    @stub
    // If wheel scrolling is enabled, we return true for MouseWheelEvents
    protected def eventTypeEnabled(type: Int): Boolean = ???

    @stub
    // Gets the AccessibleContext associated with this ScrollPane.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the ScrollPaneAdjustable object which
    // represents the state of the horizontal scrollbar.
    def getHAdjustable(): Adjustable = ???

    @stub
    // Returns the height that would be occupied by a horizontal
    // scrollbar, which is independent of whether it is currently
    // displayed by the scroll pane or not.
    def getHScrollbarHeight(): Int = ???

    @stub
    // Returns the display policy for the scrollbars.
    def getScrollbarDisplayPolicy(): Int = ???

    @stub
    // Returns the current x,y position within the child which is displayed
    // at the 0,0 location of the scrolled panel's view port.
    def getScrollPosition(): Point = ???

    @stub
    // Returns the ScrollPaneAdjustable object which
    // represents the state of the vertical scrollbar.
    def getVAdjustable(): Adjustable = ???

    @stub
    // Returns the current size of the scroll pane's view port.
    def getViewportSize(): Dimension = ???

    @stub
    // Returns the width that would be occupied by a vertical
    // scrollbar, which is independent of whether it is currently
    // displayed by the scroll pane or not.
    def getVScrollbarWidth(): Int = ???

    @stub
    // Indicates whether or not scrolling will take place in response to
    // the mouse wheel.
    def isWheelScrollingEnabled(): Boolean = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by doLayout().
    //
    def layout(): Unit = ???

    @stub
    // Returns a string representing the state of this
    // ScrollPane.
    def paramString(): String = ???

    @stub
    // Prints the component in this scroll pane.
    def printComponents(g: Graphics): Unit = ???

    @stub
    // Process mouse wheel events that are delivered to this
    // ScrollPane by scrolling an appropriate amount.
    protected def processMouseWheelEvent(e: MouseWheelEvent): Unit = ???

    @stub
    // Sets the layout manager for this container.
    def setLayout(mgr: LayoutManager): Unit = ???

    @stub
    // Scrolls to the specified position within the child component.
    def setScrollPosition(x: Int, y: Int): Unit = ???

    @stub
    // Scrolls to the specified position within the child component.
    def setScrollPosition(p: Point): Unit = ???
}

object ScrollPane {
    @stub
    // Specifies that horizontal/vertical scrollbars should always be
    // shown regardless of the respective sizes of the scrollpane and child.
    def SCROLLBARS_ALWAYS: Int = ???

    @stub
    // Specifies that horizontal/vertical scrollbar should be shown
    // only when the size of the child exceeds the size of the scrollpane
    // in the horizontal/vertical dimension.
    def SCROLLBARS_AS_NEEDED: Int = ???
}
