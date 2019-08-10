package javax.swing.plaf.basic

import java.awt.{Color, Component, Container, Dimension, Graphics, LayoutManager, Rectangle}
import java.awt.event.{ActionEvent, ActionListener, MouseAdapter, MouseEvent, MouseMotionListener}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.{Object, String}
import javax.swing.{JButton, JComponent, JScrollBar, SwingConstants, Timer}
import javax.swing.event.{ChangeEvent, ChangeListener}
import javax.swing.plaf.{ComponentUI, ScrollBarUI}
import scala.scalanative.annotation.stub

/** Implementation of ScrollBarUI for the Basic Look and Feel */
class BasicScrollBarUI extends ScrollBarUI with LayoutManager with SwingConstants {

    /**  */
    @stub
    def this() = ???

    /** Listener for cursor keys. */
    protected class ArrowButtonListener extends MouseAdapter {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when a mouse button has been pressed on a component. */
        @stub
        def mousePressed(e: MouseEvent): Unit = ???

        /** Invoked when a mouse button has been released on a component. */
        @stub
        def mouseReleased(e: MouseEvent): Unit = ???
    }


    /** A listener to listen for model changes. */
    protected class ModelListener extends Object with ChangeListener {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when the target of the listener has changed its state. */
        @stub
        def stateChanged(e: ChangeEvent): Unit = ???
    }


    /**  */
    class PropertyChangeHandler extends Object with PropertyChangeListener {

        /**  */
        @stub
        def this() = ???

        /** This method gets called when a bound property is changed. */
        @stub
        def propertyChange(e: PropertyChangeEvent): Unit = ???
    }


    /** Listener for scrolling events initiated in the
     *  ScrollPane.
     */
    protected class ScrollListener extends Object with ActionListener {

        /**  */
        @stub
        def this() = ???

        /**  */
        @stub
        def this(dir: Int, block: Boolean) = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???

        /**  */
        @stub
        def setDirection(direction: Int): Unit = ???

        /**  */
        @stub
        def setScrollByBlock(block: Boolean): Unit = ???
    }


    /** Track mouse drags. */
    protected class TrackListener extends MouseAdapter with MouseMotionListener {

        /**  */
        @stub
        protected def this() = ???

        /**  */
        @stub
        protected val currentMouseX: Int = ???

        /**  */
        @stub
        protected val currentMouseY: Int = ???

        /**  */
        @stub
        protected val offset: Int = ???

        /** Set the models value to the position of the thumb's top of Vertical
         *  scrollbar, or the left/right of Horizontal scrollbar in
         *  left-to-right/right-to-left scrollbar relative to the origin of the
         *  track.
         */
        @stub
        def mouseDragged(e: MouseEvent): Unit = ???

        /** Invoked when the mouse exits the scrollbar. */
        @stub
        def mouseExited(e: MouseEvent): Unit = ???

        /** Invoked when the mouse cursor has been moved onto a component
         *  but no buttons have been pushed.
         */
        @stub
        def mouseMoved(e: MouseEvent): Unit = ???

        /** If the mouse is pressed above the "thumb" component
         *  then reduce the scrollbars value by one page ("page up"),
         *  otherwise increase it by one page.
         */
        @stub
        def mousePressed(e: MouseEvent): Unit = ???

        /** Invoked when a mouse button has been released on a component. */
        @stub
        def mouseReleased(e: MouseEvent): Unit = ???
    }


    /**  */
    @stub
    protected val buttonListener: BasicScrollBarUI.ArrowButtonListener = ???

    /**  */
    @stub
    protected val decrButton: JButton = ???

    /** Distance between the decrement button and the track. */
    @stub
    protected val decrGap: Int = ???

    /**  */
    @stub
    protected val incrButton: JButton = ???

    /** Distance between the increment button and the track. */
    @stub
    protected val incrGap: Int = ???

    /**  */
    @stub
    protected val isDragging: Boolean = ???

    /**  */
    @stub
    protected val maximumThumbSize: Dimension = ???

    /**  */
    @stub
    protected val minimumThumbSize: Dimension = ???

    /**  */
    @stub
    protected val modelListener: BasicScrollBarUI.ModelListener = ???

    /**  */
    @stub
    protected val propertyChangeListener: PropertyChangeListener = ???

    /**  */
    @stub
    protected val scrollbar: JScrollBar = ???

    /** Hint as to what width (when vertical) or height (when horizontal)
     *  should be.
     */
    @stub
    protected val scrollBarWidth: Int = ???

    /**  */
    @stub
    protected val scrollListener: BasicScrollBarUI.ScrollListener = ???

    /**  */
    @stub
    protected val scrollTimer: Timer = ???

    /**  */
    @stub
    protected val thumbColor: Color = ???

    /**  */
    @stub
    protected val thumbDarkShadowColor: Color = ???

    /**  */
    @stub
    protected val thumbHighlightColor: Color = ???

    /**  */
    @stub
    protected val thumbLightShadowColor: Color = ???

    /**  */
    @stub
    protected val thumbRect: Rectangle = ???

    /**  */
    @stub
    protected val trackColor: Color = ???

    /**  */
    @stub
    protected val trackHighlight: Int = ???

    /**  */
    @stub
    protected val trackHighlightColor: Color = ???

    /**  */
    @stub
    protected val trackListener: BasicScrollBarUI.TrackListener = ???

    /**  */
    @stub
    protected val trackRect: Rectangle = ???

    /** If the layout manager uses a per-component string,
     *  adds the component comp to the layout,
     *  associating it
     *  with the string specified by name.
     */
    @stub
    def addLayoutComponent(name: String, child: Component): Unit = ???

    /**  */
    @stub
    protected def configureScrollBarColors(): Unit = ???

    /**  */
    @stub
    protected def createArrowButtonListener(): BasicScrollBarUI.ArrowButtonListener = ???

    /**  */
    @stub
    protected def createDecreaseButton(orientation: Int): JButton = ???

    /**  */
    @stub
    protected def createIncreaseButton(orientation: Int): JButton = ???

    /**  */
    @stub
    protected def createModelListener(): BasicScrollBarUI.ModelListener = ???

    /**  */
    @stub
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    /**  */
    @stub
    protected def createScrollListener(): BasicScrollBarUI.ScrollListener = ???

    /**  */
    @stub
    protected def createTrackListener(): BasicScrollBarUI.TrackListener = ???

    /** Returns the specified component's maximum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMaximumSize(c: JComponent): Dimension = ???

    /** Returns the largest acceptable size for the thumb. */
    @stub
    protected def getMaximumThumbSize(): Dimension = ???

    /** Returns the smallest acceptable size for the thumb. */
    @stub
    protected def getMinimumThumbSize(): Dimension = ???

    /** A vertical scrollbar's preferred width is the maximum of
     *  preferred widths of the (non null)
     *  increment/decrement buttons,
     *  and the minimum width of the thumb.
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /** Indicates whether the user can absolutely position the thumb with
     *  a mouse gesture (usually the middle mouse button).
     */
    @stub
    def getSupportsAbsolutePositioning(): Boolean = ???

    /** Return the current size/location of the thumb. */
    @stub
    protected def getThumbBounds(): Rectangle = ???

    /** Returns the current bounds of the track, i.e. */
    @stub
    protected def getTrackBounds(): Rectangle = ???

    /**  */
    @stub
    protected def installComponents(): Unit = ???

    /**  */
    @stub
    protected def installDefaults(): Unit = ???

    /**  */
    @stub
    protected def installKeyboardActions(): Unit = ???

    /**  */
    @stub
    protected def installListeners(): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Returns true if the mouse is currently over the thumb. */
    @stub
    def isThumbRollover(): Boolean = ???

    /** Lays out the specified container. */
    @stub
    def layoutContainer(scrollbarContainer: Container): Unit = ???

    /**  */
    @stub
    protected def layoutHScrollbar(sb: JScrollBar): Unit = ???

    /**  */
    @stub
    protected def layoutVScrollbar(sb: JScrollBar): Unit = ???

    /** Calculates the minimum size dimensions for the specified
     *  container, given the components it contains.
     */
    @stub
    def minimumLayoutSize(scrollbarContainer: Container): Dimension = ???

    /** Paints the specified component appropriately for the look and feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /**  */
    @stub
    protected def paintDecreaseHighlight(g: Graphics): Unit = ???

    /**  */
    @stub
    protected def paintIncreaseHighlight(g: Graphics): Unit = ???

    /**  */
    @stub
    protected def paintThumb(g: Graphics, c: JComponent, thumbBounds: Rectangle): Unit = ???

    /**  */
    @stub
    protected def paintTrack(g: Graphics, c: JComponent, trackBounds: Rectangle): Unit = ???

    /** Calculates the preferred size dimensions for the specified
     *  container, given the components it contains.
     */
    @stub
    def preferredLayoutSize(scrollbarContainer: Container): Dimension = ???

    /** Removes the specified component from the layout. */
    @stub
    def removeLayoutComponent(child: Component): Unit = ???

    /**  */
    @stub
    protected def scrollByBlock(direction: Int): Unit = ???

    /**  */
    @stub
    protected def scrollByUnit(direction: Int): Unit = ???

    /** Set the bounds of the thumb and force a repaint that includes
     *  the old thumbBounds and the new one.
     */
    @stub
    protected def setThumbBounds(x: Int, y: Int, width: Int, height: Int): Unit = ???

    /** Sets whether or not the mouse is currently over the thumb. */
    @stub
    protected def setThumbRollover(active: Boolean): Unit = ???

    /**  */
    @stub
    protected def uninstallComponents(): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /**  */
    @stub
    protected def uninstallKeyboardActions(): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???
}

object BasicScrollBarUI {
    /**  */
    @stub
    protected val DECREASE_HIGHLIGHT: Int = ???

    /**  */
    @stub
    protected val INCREASE_HIGHLIGHT: Int = ???

    /**  */
    @stub
    protected val NO_HIGHLIGHT: Int = ???

    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
