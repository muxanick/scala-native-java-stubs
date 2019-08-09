package javax.swing.plaf.basic

import java.awt.{Component, Container, Dimension, Graphics, Insets}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{JButton, JSplitPane}
import javax.swing.border.Border

// Divider used by BasicSplitPaneUI. Subclassers may wish to override
// paint to do something more interesting.
// The border effect is drawn in BasicSplitPaneUI, so if you don't like
// that border, reset it there.
// To conditionally drag from certain areas subclass mousePressed and
// call super when you wish the dragging to begin.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class BasicSplitPaneDivider extends Container with PropertyChangeListener {

    @stub
    // Used to layout a BasicSplitPaneDivider.
    protected def BasicSplitPaneDivider.DividerLayout: class = ???

    @stub
    // Handles the events during a dragging session for a
    // HORIZONTAL_SPLIT oriented split pane.
    protected def BasicSplitPaneDivider.DragController: class = ???

    @stub
    // MouseHandler is responsible for converting mouse events
    // (released, dragged...) into the appropriate DragController
    // methods.
    protected def BasicSplitPaneDivider.MouseHandler: class = ???

    @stub
    // Size of the divider.
    protected def dividerSize: Int = ???

    @stub
    // Handles mouse dragging message to do the actual dragging.
    protected def dragger: BasicSplitPaneDivider.DragController = ???

    @stub
    // Divider that is used for noncontinuous layout mode.
    protected def hiddenDivider: Component = ???

    @stub
    // Button for quickly toggling the left component.
    protected def leftButton: JButton = ???

    @stub
    // Handles mouse events from both this class, and the split pane.
    protected def mouseHandler: BasicSplitPaneDivider.MouseHandler = ???

    @stub
    // Orientation of the JSplitPane.
    protected def orientation: Int = ???

    @stub
    // Button for quickly toggling the right component.
    protected def rightButton: JButton = ???

    @stub
    // JSplitPane the receiver is contained in.
    protected def splitPane: JSplitPane = ???

    @stub
    // Creates and return an instance of JButton that can be used to
    // collapse the left component in the split pane.
    protected def createLeftOneTouchButton(): JButton = ???

    @stub
    // Creates and return an instance of JButton that can be used to
    // collapse the right component in the split pane.
    protected def createRightOneTouchButton(): JButton = ???

    @stub
    // Messages the BasicSplitPaneUI with dragDividerTo that this instance
    // is contained in.
    protected def dragDividerTo(location: Int): Unit = ???

    @stub
    // Messages the BasicSplitPaneUI with finishDraggingTo that this instance
    // is contained in.
    protected def finishDraggingTo(location: Int): Unit = ???

    @stub
    // Returns the SplitPaneUI the receiver is currently
    // in.
    def getBasicSplitPaneUI(): BasicSplitPaneUI = ???

    @stub
    // Returns the border of this component or null if no border is
    // currently set.
    def getBorder(): Border = ???

    @stub
    // Returns the size of the divider, that is the width if the splitpane
    // is HORIZONTAL_SPLIT, or the height of VERTICAL_SPLIT.
    def getDividerSize(): Int = ???

    @stub
    // If a border has been set on this component, returns the
    // border's insets, else calls super.getInsets.
    def getInsets(): Insets = ???

    @stub
    // Returns dividerSize x dividerSize
    def getMinimumSize(): Dimension = ???

    @stub
    // Returns dividerSize x dividerSize
    def getPreferredSize(): Dimension = ???

    @stub
    // Returns whether or not the mouse is currently over the divider
    def isMouseOver(): Boolean = ???

    @stub
    // Messaged when the oneTouchExpandable value of the JSplitPane the
    // receiver is contained in changes.
    protected def oneTouchExpandableChanged(): Unit = ???

    @stub
    // Paints the divider.
    def paint(g: Graphics): Unit = ???

    @stub
    // Message to prepare for dragging.
    protected def prepareForDragging(): Unit = ???

    @stub
    // Property change event, presumably from the JSplitPane, will message
    // updateOrientation if necessary.
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    @stub
    // Sets the SplitPaneUI that is using the receiver.
    def setBasicSplitPaneUI(newUI: BasicSplitPaneUI): Unit = ???

    @stub
    // Sets the border of this component.
    def setBorder(border: Border): Unit = ???

    @stub
    // Sets the size of the divider to newSize.
    def setDividerSize(newSize: Int): Unit = ???
}

object BasicSplitPaneDivider {
    @stub
    // 
    protected def ONE_TOUCH_OFFSET: Int = ???

    @stub
    // Width or height of the divider based on orientation
    // BasicSplitPaneUI adds two to this.
    protected def ONE_TOUCH_SIZE: Int = ???
}
