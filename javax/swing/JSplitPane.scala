package javax.swing

import java.awt.{Component, Container, Graphics}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.plaf.SplitPaneUI

// JSplitPane is used to divide two (and only two)
// Components. The two Components
// are graphically divided based on the look and feel
// implementation, and the two Components can then be
// interactively resized by the user.
// Information on using JSplitPane is in
// How to Use Split Panes in
// The Java Tutorial.
// 
// The two Components in a split pane can be aligned
// left to right using
// JSplitPane.HORIZONTAL_SPLIT, or top to bottom using
// JSplitPane.VERTICAL_SPLIT.
// The preferred way to change the size of the Components
// is to invoke
// setDividerLocation where location is either
// the new x or y position, depending on the orientation of the
// JSplitPane.
// 
// To resize the Components to their preferred sizes invoke
// resetToPreferredSizes.
// 
// When the user is resizing the Components the minimum
// size of the Components is used to determine the
// maximum/minimum position the Components
// can be set to. If the minimum size of the two
// components is greater than the size of the split pane the divider
// will not allow you to resize it. To alter the minimum size of a
// JComponent, see JComponent.setMinimumSize(java.awt.Dimension).
// 
// When the user resizes the split pane the new space is distributed between
// the two components based on the resizeWeight property.
// A value of 0,
// the default, indicates the right/bottom component gets all the space,
// where as a value of 1 indicates the left/top component gets all the space.
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
class JSplitPane extends JComponent with Accessible {

    @stub
    // Creates a new JSplitPane configured to arrange the child
    // components side-by-side horizontally, using two buttons for the components.
    def this() = ???

    @stub
    // Creates a new JSplitPane configured with the
    // specified orientation.
    def this(newOrientation: Int) = ???

    @stub
    // Creates a new JSplitPane with the specified
    // orientation and redrawing style.
    def this(newOrientation: Int, newContinuousLayout: Boolean) = ???

    @stub
    // Creates a new JSplitPane with the specified
    // orientation and
    // redrawing style, and with the specified components.
    def this(newOrientation: Int, newContinuousLayout: Boolean, newLeftComponent: Component, newRightComponent: Component) = ???

    @stub
    // Whether or not the views are continuously redisplayed while
    // resizing.
    protected def continuousLayout: Boolean = ???

    @stub
    // Size of the divider.
    protected def dividerSize: Int = ???

    @stub
    // Previous location of the split pane.
    protected def lastDividerLocation: Int = ???

    @stub
    // The left or top component.
    protected def leftComponent: Component = ???

    @stub
    // Is a little widget provided to quickly expand/collapse the
    // split pane?
    protected def oneTouchExpandable: Boolean = ???

    @stub
    // How the views are split.
    protected def orientation: Int = ???

    @stub
    // The right or bottom component.
    protected def rightComponent: Component = ???

    @stub
    // Adds the specified component to this split pane.
    protected def addImpl(comp: Component, constraints: Object, index: Int): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this JSplitPane.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the component below, or to the right of the divider.
    def getBottomComponent(): Component = ???

    @stub
    // Returns the last value passed to setDividerLocation.
    def getDividerLocation(): Int = ???

    @stub
    // Returns the size of the divider.
    def getDividerSize(): Int = ???

    @stub
    // Returns the last location the divider was at.
    def getLastDividerLocation(): Int = ???

    @stub
    // Returns the component to the left (or above) the divider.
    def getLeftComponent(): Component = ???

    @stub
    // Returns the maximum location of the divider from the look and feel
    // implementation.
    def getMaximumDividerLocation(): Int = ???

    @stub
    // Returns the minimum location of the divider from the look and feel
    // implementation.
    def getMinimumDividerLocation(): Int = ???

    @stub
    // Returns the orientation.
    def getOrientation(): Int = ???

    @stub
    // Returns the number that determines how extra space is distributed.
    def getResizeWeight(): double = ???

    @stub
    // Returns the component to the right (or below) the divider.
    def getRightComponent(): Component = ???

    @stub
    // Returns the component above, or to the left of the divider.
    def getTopComponent(): Component = ???

    @stub
    // Returns the SplitPaneUI that is providing the
    // current look and feel.
    def getUI(): SplitPaneUI = ???

    @stub
    // Returns the name of the L&F class that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Gets the continuousLayout property.
    def isContinuousLayout(): Boolean = ???

    @stub
    // Gets the oneTouchExpandable property.
    def isOneTouchExpandable(): Boolean = ???

    @stub
    // Returns true, so that calls to revalidate
    // on any descendant of this JSplitPane
    // will cause a request to be queued that
    // will validate the JSplitPane and all its descendants.
    def isValidateRoot(): Boolean = ???

    @stub
    // Subclassed to message the UI with finishedPaintingChildren
    // after super has been messaged, as well as painting the border.
    protected def paintChildren(g: Graphics): Unit = ???

    @stub
    // Returns a string representation of this JSplitPane.
    protected def paramString(): String = ???

    @stub
    // Removes the child component, component from the
    // pane.
    def remove(component: Component): Unit = ???

    @stub
    // Removes the Component at the specified index.
    def remove(index: Int): Unit = ???

    @stub
    // Removes all the child components from the split pane.
    def removeAll(): Unit = ???

    @stub
    // Lays out the JSplitPane layout based on the preferred size
    // of the children components.
    def resetToPreferredSizes(): Unit = ???

    @stub
    // Sets the component below, or to the right of the divider.
    def setBottomComponent(comp: Component): Unit = ???

    @stub
    // Sets the value of the continuousLayout property,
    // which must be true for the child components
    // to be continuously
    // redisplayed and laid out during user intervention.
    def setContinuousLayout(newContinuousLayout: Boolean): Unit = ???

    @stub
    // Sets the divider location as a percentage of the
    // JSplitPane's size.
    def setDividerLocation(proportionalLocation: double): Unit = ???

    @stub
    // Sets the location of the divider.
    def setDividerLocation(location: Int): Unit = ???

    @stub
    // Sets the size of the divider.
    def setDividerSize(newSize: Int): Unit = ???

    @stub
    // Sets the last location the divider was at to
    // newLastLocation.
    def setLastDividerLocation(newLastLocation: Int): Unit = ???

    @stub
    // Sets the component to the left (or above) the divider.
    def setLeftComponent(comp: Component): Unit = ???

    @stub
    // Sets the value of the oneTouchExpandable property,
    // which must be true for the
    // JSplitPane to provide a UI widget
    // on the divider to quickly expand/collapse the divider.
    def setOneTouchExpandable(newValue: Boolean): Unit = ???

    @stub
    // Sets the orientation, or how the splitter is divided.
    def setOrientation(orientation: Int): Unit = ???

    @stub
    // Specifies how to distribute extra space when the size of the split pane
    // changes.
    def setResizeWeight(value: double): Unit = ???

    @stub
    // Sets the component to the right (or below) the divider.
    def setRightComponent(comp: Component): Unit = ???

    @stub
    // Sets the component above, or to the left of the divider.
    def setTopComponent(comp: Component): Unit = ???

    @stub
    // Sets the L&F object that renders this component.
    def setUI(ui: SplitPaneUI): Unit = ???
}

object JSplitPane {
    @stub
    // Used to add a Component below the other
    // Component.
    def BOTTOM: String = ???

    @stub
    // Bound property name for continuousLayout.
    def CONTINUOUS_LAYOUT_PROPERTY: String = ???

    @stub
    // Used to add a Component that will represent the divider.
    def DIVIDER: String = ???

    @stub
    // Bound property for the dividerLocation.
    def DIVIDER_LOCATION_PROPERTY: String = ???

    @stub
    // Bound property name for border.
    def DIVIDER_SIZE_PROPERTY: String = ???

    @stub
    // Horizontal split indicates the Components are
    // split along the x axis.
    def HORIZONTAL_SPLIT: Int = ???

    @stub
    // Bound property for lastLocation.
    def LAST_DIVIDER_LOCATION_PROPERTY: String = ???

    @stub
    // Used to add a Component to the left of the other
    // Component.
    def LEFT: String = ???

    @stub
    // Bound property for oneTouchExpandable.
    def ONE_TOUCH_EXPANDABLE_PROPERTY: String = ???

    @stub
    // Bound property name for orientation (horizontal or vertical).
    def ORIENTATION_PROPERTY: String = ???

    @stub
    // Bound property for weight.
    def RESIZE_WEIGHT_PROPERTY: String = ???

    @stub
    // Used to add a Component to the right of the other
    // Component.
    def RIGHT: String = ???

    @stub
    // Used to add a Component above the other
    // Component.
    def TOP: String = ???
}
