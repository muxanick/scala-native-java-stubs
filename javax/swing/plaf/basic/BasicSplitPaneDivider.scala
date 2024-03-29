package javax.swing.plaf.basic

import java.awt.{Component, Container, Dimension, Graphics, Insets, LayoutManager}
import java.awt.event.{MouseAdapter, MouseEvent, MouseMotionListener}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.{Object, String}
import javax.swing.{JButton, JSplitPane}
import javax.swing.border.Border
import scala.scalanative.annotation.stub

/** Divider used by BasicSplitPaneUI. Subclassers may wish to override
 *  paint to do something more interesting.
 *  The border effect is drawn in BasicSplitPaneUI, so if you don't like
 *  that border, reset it there.
 *  To conditionally drag from certain areas subclass mousePressed and
 *  call super when you wish the dragging to begin.
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
class BasicSplitPaneDivider extends Container with PropertyChangeListener {

    /** Creates an instance of BasicSplitPaneDivider. */
    @stub
    def this(ui: BasicSplitPaneUI) = ???

    /** Used to layout a BasicSplitPaneDivider.
     *  Layout for the divider
     *  involves appropriately moving the left/right buttons around.
     */
    protected class DividerLayout extends Object with LayoutManager {

        /**  */
        @stub
        protected def this() = ???

        /** If the layout manager uses a per-component string,
         *  adds the component comp to the layout,
         *  associating it
         *  with the string specified by name.
         */
        @stub
        def addLayoutComponent(string: String, c: Component): Unit = ???

        /** Lays out the specified container. */
        @stub
        def layoutContainer(c: Container): Unit = ???

        /** Calculates the minimum size dimensions for the specified
         *  container, given the components it contains.
         */
        @stub
        def minimumLayoutSize(c: Container): Dimension = ???

        /** Calculates the preferred size dimensions for the specified
         *  container, given the components it contains.
         */
        @stub
        def preferredLayoutSize(c: Container): Dimension = ???

        /** Removes the specified component from the layout. */
        @stub
        def removeLayoutComponent(c: Component): Unit = ???
    }


    /** Handles the events during a dragging session for a
     *  HORIZONTAL_SPLIT oriented split pane. This continually
     *  messages dragDividerTo and then when done messages
     *  finishDraggingTo. When an instance is created it should be
     *  messaged with isValid to insure that dragging can happen
     *  (dragging won't be allowed if the two views can not be resized).
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
    protected class DragController extends Object {

        /**  */
        @stub
        protected def this(e: MouseEvent) = ???

        /**  */
        @stub
        protected def completeDrag(x: Int, y: Int): Unit = ???

        /** Messages finishDraggingTo with the new location for the mouse
         *  event.
         */
        @stub
        protected def completeDrag(e: MouseEvent): Unit = ???

        /**  */
        @stub
        protected def continueDrag(newX: Int, newY: Int): Unit = ???

        /** Messages dragDividerTo with the new location for the mouse
         *  event.
         */
        @stub
        protected def continueDrag(e: MouseEvent): Unit = ???

        /** Returns the x argument, since this is used for horizontal
         *  splits.
         */
        @stub
        protected def getNeededLocation(x: Int, y: Int): Int = ???

        /** Returns true if the dragging session is valid. */
        @stub
        protected def isValid(): Boolean = ???

        /** Returns the new position to put the divider at based on
         *  the passed in MouseEvent.
         */
        @stub
        protected def positionForMouseEvent(e: MouseEvent): Int = ???
    }


    /** MouseHandler is responsible for converting mouse events
     *  (released, dragged...) into the appropriate DragController
     *  methods.
     */
    protected class MouseHandler extends MouseAdapter with MouseMotionListener {

        /**  */
        @stub
        protected def this() = ???

        /** If dragger is not null it is messaged with continueDrag. */
        @stub
        def mouseDragged(e: MouseEvent): Unit = ???

        /** Invoked when the mouse enters a component. */
        @stub
        def mouseEntered(e: MouseEvent): Unit = ???

        /** Invoked when the mouse exits a component. */
        @stub
        def mouseExited(e: MouseEvent): Unit = ???

        /** Resets the cursor based on the orientation. */
        @stub
        def mouseMoved(e: MouseEvent): Unit = ???

        /** Starts the dragging session by creating the appropriate instance
         *  of DragController.
         */
        @stub
        def mousePressed(e: MouseEvent): Unit = ???

        /** If dragger is not null it is messaged with completeDrag. */
        @stub
        def mouseReleased(e: MouseEvent): Unit = ???
    }


    /** Handles the events during a dragging session for a
     *  VERTICAL_SPLIT oriented split pane. This continually
     *  messages dragDividerTo and then when done messages
     *  finishDraggingTo. When an instance is created it should be
     *  messaged with isValid to insure that dragging can happen
     *  (dragging won't be allowed if the two views can not be resized).
     */
    protected class VerticalDragController extends BasicSplitPaneDivider.DragController {

        /**  */
        @stub
        protected def this(e: MouseEvent) = ???

        /** Returns the y argument, since this is used for vertical
         *  splits.
         */
        @stub
        protected def getNeededLocation(x: Int, y: Int): Int = ???

        /** Returns the new position to put the divider at based on
         *  the passed in MouseEvent.
         */
        @stub
        protected def positionForMouseEvent(e: MouseEvent): Int = ???
    }


    /** Size of the divider. */
    @stub
    protected val dividerSize: Int = ???

    /** Handles mouse dragging message to do the actual dragging. */
    @stub
    protected val dragger: BasicSplitPaneDivider.DragController = ???

    /** Divider that is used for noncontinuous layout mode. */
    @stub
    protected val hiddenDivider: Component = ???

    /** Button for quickly toggling the left component. */
    @stub
    protected val leftButton: JButton = ???

    /** Handles mouse events from both this class, and the split pane. */
    @stub
    protected val mouseHandler: BasicSplitPaneDivider.MouseHandler = ???

    /** Orientation of the JSplitPane. */
    @stub
    protected val orientation: Int = ???

    /** Button for quickly toggling the right component. */
    @stub
    protected val rightButton: JButton = ???

    /** JSplitPane the receiver is contained in. */
    @stub
    protected val splitPane: JSplitPane = ???

    /** UI this instance was created from. */
    @stub
    protected val splitPaneUI: BasicSplitPaneUI = ???

    /** Creates and return an instance of JButton that can be used to
     *  collapse the left component in the split pane.
     */
    @stub
    protected def createLeftOneTouchButton(): JButton = ???

    /** Creates and return an instance of JButton that can be used to
     *  collapse the right component in the split pane.
     */
    @stub
    protected def createRightOneTouchButton(): JButton = ???

    /** Messages the BasicSplitPaneUI with dragDividerTo that this instance
     *  is contained in.
     */
    @stub
    protected def dragDividerTo(location: Int): Unit = ???

    /** Messages the BasicSplitPaneUI with finishDraggingTo that this instance
     *  is contained in.
     */
    @stub
    protected def finishDraggingTo(location: Int): Unit = ???

    /** Returns the SplitPaneUI the receiver is currently
     *  in.
     */
    @stub
    def getBasicSplitPaneUI(): BasicSplitPaneUI = ???

    /** Returns the border of this component or null if no border is
     *  currently set.
     */
    @stub
    def getBorder(): Border = ???

    /** Returns the size of the divider, that is the width if the splitpane
     *  is HORIZONTAL_SPLIT, or the height of VERTICAL_SPLIT.
     */
    @stub
    def getDividerSize(): Int = ???

    /** If a border has been set on this component, returns the
     *  border's insets, else calls super.getInsets.
     */
    @stub
    def getInsets(): Insets = ???

    /** Returns dividerSize x dividerSize */
    @stub
    def getMinimumSize(): Dimension = ???

    /** Returns dividerSize x dividerSize */
    @stub
    def getPreferredSize(): Dimension = ???

    /** Returns whether or not the mouse is currently over the divider */
    @stub
    def isMouseOver(): Boolean = ???

    /** Messaged when the oneTouchExpandable value of the JSplitPane the
     *  receiver is contained in changes.
     */
    @stub
    protected def oneTouchExpandableChanged(): Unit = ???

    /** Paints the divider. */
    @stub
    def paint(g: Graphics): Unit = ???

    /** Message to prepare for dragging. */
    @stub
    protected def prepareForDragging(): Unit = ???

    /** Property change event, presumably from the JSplitPane, will message
     *  updateOrientation if necessary.
     */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /** Sets the SplitPaneUI that is using the receiver. */
    @stub
    def setBasicSplitPaneUI(newUI: BasicSplitPaneUI): Unit = ???

    /** Sets the border of this component. */
    @stub
    def setBorder(border: Border): Unit = ???

    /** Sets the size of the divider to newSize. */
    @stub
    def setDividerSize(newSize: Int): Unit = ???

    /** Sets whether or not the mouse is currently over the divider. */
    @stub
    protected def setMouseOver(mouseOver: Boolean): Unit = ???
}

object BasicSplitPaneDivider {
    /**  */
    @stub
    protected val ONE_TOUCH_OFFSET: Int = ???

    /** Width or height of the divider based on orientation
     *  BasicSplitPaneUI adds two to this.
     */
    @stub
    protected val ONE_TOUCH_SIZE: Int = ???
}
