package javax.swing

import java.awt.{Component, Container, Graphics}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.plaf.SplitPaneUI
import scala.scalanative.annotation.stub

/** JSplitPane is used to divide two (and only two)
 *  Components. The two Components
 *  are graphically divided based on the look and feel
 *  implementation, and the two Components can then be
 *  interactively resized by the user.
 *  Information on using JSplitPane is in
 *  How to Use Split Panes in
 *  The Java Tutorial.
 *  
 *  The two Components in a split pane can be aligned
 *  left to right using
 *  JSplitPane.HORIZONTAL_SPLIT, or top to bottom using
 *  JSplitPane.VERTICAL_SPLIT.
 *  The preferred way to change the size of the Components
 *  is to invoke
 *  setDividerLocation where location is either
 *  the new x or y position, depending on the orientation of the
 *  JSplitPane.
 *  
 *  To resize the Components to their preferred sizes invoke
 *  resetToPreferredSizes.
 *  
 *  When the user is resizing the Components the minimum
 *  size of the Components is used to determine the
 *  maximum/minimum position the Components
 *  can be set to. If the minimum size of the two
 *  components is greater than the size of the split pane the divider
 *  will not allow you to resize it. To alter the minimum size of a
 *  JComponent, see JComponent.setMinimumSize(java.awt.Dimension).
 *  
 *  When the user resizes the split pane the new space is distributed between
 *  the two components based on the resizeWeight property.
 *  A value of 0,
 *  the default, indicates the right/bottom component gets all the space,
 *  where as a value of 1 indicates the left/top component gets all the space.
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
class JSplitPane extends JComponent with Accessible {

    /** Creates a new JSplitPane configured to arrange the child
     *  components side-by-side horizontally, using two buttons for the components.
     */
    @stub
    def this() = ???

    /** Creates a new JSplitPane configured with the
     *  specified orientation.
     */
    @stub
    def this(newOrientation: Int) = ???

    /** Creates a new JSplitPane with the specified
     *  orientation and redrawing style.
     */
    @stub
    def this(newOrientation: Int, newContinuousLayout: Boolean) = ???

    /** Creates a new JSplitPane with the specified
     *  orientation and
     *  redrawing style, and with the specified components.
     */
    @stub
    def this(newOrientation: Int, newContinuousLayout: Boolean, newLeftComponent: Component, newRightComponent: Component) = ???

    /** Creates a new JSplitPane with the specified
     *  orientation and the specified components.
     */
    @stub
    def this(newOrientation: Int, newLeftComponent: Component, newRightComponent: Component) = ???

    /** This class implements accessibility support for the
     *  JSplitPane class.
     */
    @stub
    protected object AccessibleJSplitPane extends JSplitPane.AccessibleJSplitPane

    /** Whether or not the views are continuously redisplayed while
     *  resizing.
     */
    @stub
    protected val continuousLayout: Boolean = ???

    /** Size of the divider. */
    @stub
    protected val dividerSize: Int = ???

    /** Previous location of the split pane. */
    @stub
    protected val lastDividerLocation: Int = ???

    /** The left or top component. */
    @stub
    protected val leftComponent: Component = ???

    /** Is a little widget provided to quickly expand/collapse the
     *  split pane?
     */
    @stub
    protected val oneTouchExpandable: Boolean = ???

    /** How the views are split. */
    @stub
    protected val orientation: Int = ???

    /** The right or bottom component. */
    @stub
    protected val rightComponent: Component = ???

    /** Adds the specified component to this split pane. */
    @stub
    protected def addImpl(comp: Component, constraints: Object, index: Int): Unit = ???

    /** Gets the AccessibleContext associated with this JSplitPane. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the component below, or to the right of the divider. */
    @stub
    def getBottomComponent(): Component = ???

    /** Returns the last value passed to setDividerLocation. */
    @stub
    def getDividerLocation(): Int = ???

    /** Returns the size of the divider. */
    @stub
    def getDividerSize(): Int = ???

    /** Returns the last location the divider was at. */
    @stub
    def getLastDividerLocation(): Int = ???

    /** Returns the component to the left (or above) the divider. */
    @stub
    def getLeftComponent(): Component = ???

    /** Returns the maximum location of the divider from the look and feel
     *  implementation.
     */
    @stub
    def getMaximumDividerLocation(): Int = ???

    /** Returns the minimum location of the divider from the look and feel
     *  implementation.
     */
    @stub
    def getMinimumDividerLocation(): Int = ???

    /** Returns the orientation. */
    @stub
    def getOrientation(): Int = ???

    /** Returns the number that determines how extra space is distributed. */
    @stub
    def getResizeWeight(): Double = ???

    /** Returns the component to the right (or below) the divider. */
    @stub
    def getRightComponent(): Component = ???

    /** Returns the component above, or to the left of the divider. */
    @stub
    def getTopComponent(): Component = ???

    /** Returns the SplitPaneUI that is providing the
     *  current look and feel.
     */
    @stub
    def getUI(): SplitPaneUI = ???

    /** Returns the name of the L&F class that renders this component. */
    @stub
    def getUIClassID(): String = ???

    /** Gets the continuousLayout property. */
    @stub
    def isContinuousLayout(): Boolean = ???

    /** Gets the oneTouchExpandable property. */
    @stub
    def isOneTouchExpandable(): Boolean = ???

    /** Returns true, so that calls to revalidate
     *  on any descendant of this JSplitPane
     *  will cause a request to be queued that
     *  will validate the JSplitPane and all its descendants.
     */
    @stub
    def isValidateRoot(): Boolean = ???

    /** Subclassed to message the UI with finishedPaintingChildren
     *  after super has been messaged, as well as painting the border.
     */
    @stub
    protected def paintChildren(g: Graphics): Unit = ???

    /** Returns a string representation of this JSplitPane. */
    @stub
    protected def paramString(): String = ???

    /** Removes the child component, component from the
     *  pane.
     */
    @stub
    def remove(component: Component): Unit = ???

    /** Removes the Component at the specified index. */
    @stub
    def remove(index: Int): Unit = ???

    /** Removes all the child components from the split pane. */
    @stub
    def removeAll(): Unit = ???

    /** Lays out the JSplitPane layout based on the preferred size
     *  of the children components.
     */
    @stub
    def resetToPreferredSizes(): Unit = ???

    /** Sets the component below, or to the right of the divider. */
    @stub
    def setBottomComponent(comp: Component): Unit = ???

    /** Sets the value of the continuousLayout property,
     *  which must be true for the child components
     *  to be continuously
     *  redisplayed and laid out during user intervention.
     */
    @stub
    def setContinuousLayout(newContinuousLayout: Boolean): Unit = ???

    /** Sets the divider location as a percentage of the
     *  JSplitPane's size.
     */
    @stub
    def setDividerLocation(proportionalLocation: Double): Unit = ???

    /** Sets the location of the divider. */
    @stub
    def setDividerLocation(location: Int): Unit = ???

    /** Sets the size of the divider. */
    @stub
    def setDividerSize(newSize: Int): Unit = ???

    /** Sets the last location the divider was at to
     *  newLastLocation.
     */
    @stub
    def setLastDividerLocation(newLastLocation: Int): Unit = ???

    /** Sets the component to the left (or above) the divider. */
    @stub
    def setLeftComponent(comp: Component): Unit = ???

    /** Sets the value of the oneTouchExpandable property,
     *  which must be true for the
     *  JSplitPane to provide a UI widget
     *  on the divider to quickly expand/collapse the divider.
     */
    @stub
    def setOneTouchExpandable(newValue: Boolean): Unit = ???

    /** Sets the orientation, or how the splitter is divided. */
    @stub
    def setOrientation(orientation: Int): Unit = ???

    /** Specifies how to distribute extra space when the size of the split pane
     *  changes.
     */
    @stub
    def setResizeWeight(value: Double): Unit = ???

    /** Sets the component to the right (or below) the divider. */
    @stub
    def setRightComponent(comp: Component): Unit = ???

    /** Sets the component above, or to the left of the divider. */
    @stub
    def setTopComponent(comp: Component): Unit = ???

    /** Sets the L&F object that renders this component. */
    @stub
    def setUI(ui: SplitPaneUI): Unit = ???

    /** Notification from the UIManager that the L&F has changed. */
    @stub
    def updateUI(): Unit = ???
}

object JSplitPane {
    /** Used to add a Component below the other
     *  Component.
     */
    @stub
    val BOTTOM: String = ???

    /** Bound property name for continuousLayout. */
    @stub
    val CONTINUOUS_LAYOUT_PROPERTY: String = ???

    /** Used to add a Component that will represent the divider. */
    @stub
    val DIVIDER: String = ???

    /** Bound property for the dividerLocation. */
    @stub
    val DIVIDER_LOCATION_PROPERTY: String = ???

    /** Bound property name for border. */
    @stub
    val DIVIDER_SIZE_PROPERTY: String = ???

    /** Horizontal split indicates the Components are
     *  split along the x axis.
     */
    @stub
    val HORIZONTAL_SPLIT: Int = ???

    /** Bound property for lastLocation. */
    @stub
    val LAST_DIVIDER_LOCATION_PROPERTY: String = ???

    /** Used to add a Component to the left of the other
     *  Component.
     */
    @stub
    val LEFT: String = ???

    /** Bound property for oneTouchExpandable. */
    @stub
    val ONE_TOUCH_EXPANDABLE_PROPERTY: String = ???

    /** Bound property name for orientation (horizontal or vertical). */
    @stub
    val ORIENTATION_PROPERTY: String = ???

    /** Bound property for weight. */
    @stub
    val RESIZE_WEIGHT_PROPERTY: String = ???

    /** Used to add a Component to the right of the other
     *  Component.
     */
    @stub
    val RIGHT: String = ???

    /** Used to add a Component above the other
     *  Component.
     */
    @stub
    val TOP: String = ???

    /** Vertical split indicates the Components are
     *  split along the y axis.
     */
    @stub
    val VERTICAL_SPLIT: Int = ???
}
