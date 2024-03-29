package javax.swing.plaf.basic

import java.awt.{Color, Component, Component.BaselineResizeBehavior, Dimension, Graphics, Insets, Rectangle}
import java.awt.event.{ActionEvent, ActionListener, ComponentAdapter, ComponentEvent, ComponentListener, FocusEvent, FocusListener, MouseAdapter, MouseEvent}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.{Integer, Object}
import javax.swing.{AbstractAction, JComponent, JSlider, Timer}
import javax.swing.event.{ChangeEvent, ChangeListener, MouseInputAdapter}
import javax.swing.plaf.{ComponentUI, SliderUI}
import scala.scalanative.annotation.stub

/** A Basic L&F implementation of SliderUI. */
class BasicSliderUI extends SliderUI {

    /**  */
    @stub
    def this(b: JSlider) = ???

    /** As of Java 2 platform v1.3 this undocumented class is no longer used.
     *  The recommended approach to creating bindings is to use a
     *  combination of an ActionMap, to contain the action,
     *  and an InputMap to contain the mapping from KeyStroke
     *  to action description. The InputMap is is usually described in the
     *  LookAndFeel tables.
     *  
     *  Please refer to the key bindings specification for further details.
     *  
     *  This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of Foo.
     */
    class ActionScroller extends AbstractAction {

        /**  */
        @stub
        def this(slider: JSlider, dir: Int, block: Boolean) = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???

        /** Returns true if the action is enabled. */
        @stub
        def isEnabled(): Boolean = ???
    }


    /** Data model listener.
     * 
     *  This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of Foo.
     */
    class ChangeHandler extends Object with ChangeListener {

        /**  */
        @stub
        def this() = ???

        /** Invoked when the target of the listener has changed its state. */
        @stub
        def stateChanged(e: ChangeEvent): Unit = ???
    }


    /** Listener for resizing events.
     *  
     *  This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of Foo.
     */
    class ComponentHandler extends ComponentAdapter {

        /**  */
        @stub
        def this() = ???

        /** Invoked when the component's size changes. */
        @stub
        def componentResized(e: ComponentEvent): Unit = ???
    }


    /** Focus-change listener.
     *  
     *  This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of Foo.
     */
    class FocusHandler extends Object with FocusListener {

        /**  */
        @stub
        def this() = ???

        /** Invoked when a component gains the keyboard focus. */
        @stub
        def focusGained(e: FocusEvent): Unit = ???

        /** Invoked when a component loses the keyboard focus. */
        @stub
        def focusLost(e: FocusEvent): Unit = ???
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


    /** Scroll-event listener.
     * 
     *  This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of Foo.
     */
    class ScrollListener extends Object with ActionListener {

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


    /** Track mouse movements.
     * 
     *  This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of Foo.
     */
    class TrackListener extends MouseInputAdapter {

        /**  */
        @stub
        def this() = ???

        /**  */
        @stub
        protected val currentMouseX: Int = ???

        /**  */
        @stub
        protected val currentMouseY: Int = ???

        /**  */
        @stub
        protected val offset: Int = ???

        /** Set the models value to the position of the top/left
         *  of the thumb relative to the origin of the track.
         */
        @stub
        def mouseDragged(e: MouseEvent): Unit = ???

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

        /**  */
        @stub
        def shouldScroll(direction: Int): Boolean = ???
    }


    /**  */
    @stub
    protected val changeListener: ChangeListener = ???

    /**  */
    @stub
    protected val componentListener: ComponentListener = ???

    /**  */
    @stub
    protected val contentRect: Rectangle = ???

    /**  */
    @stub
    protected val focusInsets: Insets = ???

    /**  */
    @stub
    protected val focusListener: FocusListener = ???

    /**  */
    @stub
    protected val focusRect: Rectangle = ???

    /**  */
    @stub
    protected val insetCache: Insets = ???

    /**  */
    @stub
    protected val labelRect: Rectangle = ???

    /**  */
    @stub
    protected val leftToRightCache: Boolean = ???

    /**  */
    @stub
    protected val propertyChangeListener: PropertyChangeListener = ???

    /**  */
    @stub
    protected val scrollListener: BasicSliderUI.ScrollListener = ???

    /**  */
    @stub
    protected val scrollTimer: Timer = ???

    /**  */
    @stub
    protected val slider: JSlider = ???

    /**  */
    @stub
    protected val thumbRect: Rectangle = ???

    /**  */
    @stub
    protected val tickRect: Rectangle = ???

    /**  */
    @stub
    protected val trackBuffer: Int = ???

    /**  */
    @stub
    protected val trackListener: BasicSliderUI.TrackListener = ???

    /**  */
    @stub
    protected val trackRect: Rectangle = ???

    /**  */
    @stub
    protected def calculateContentRect(): Unit = ???

    /**  */
    @stub
    protected def calculateFocusRect(): Unit = ???

    /**  */
    @stub
    protected def calculateGeometry(): Unit = ???

    /**  */
    @stub
    protected def calculateLabelRect(): Unit = ???

    /**  */
    @stub
    protected def calculateThumbLocation(): Unit = ???

    /**  */
    @stub
    protected def calculateThumbSize(): Unit = ???

    /**  */
    @stub
    protected def calculateTickRect(): Unit = ???

    /**  */
    @stub
    protected def calculateTrackBuffer(): Unit = ???

    /**  */
    @stub
    protected def calculateTrackRect(): Unit = ???

    /**  */
    @stub
    protected def createChangeListener(slider: JSlider): ChangeListener = ???

    /**  */
    @stub
    protected def createComponentListener(slider: JSlider): ComponentListener = ???

    /**  */
    @stub
    protected def createFocusListener(slider: JSlider): FocusListener = ???

    /**  */
    @stub
    protected def createPropertyChangeListener(slider: JSlider): PropertyChangeListener = ???

    /**  */
    @stub
    protected def createScrollListener(slider: JSlider): BasicSliderUI.ScrollListener = ???

    /**  */
    @stub
    protected def createTrackListener(slider: JSlider): BasicSliderUI.TrackListener = ???

    /**  */
    @stub
    protected def drawInverted(): Boolean = ???

    /** Returns the baseline. */
    @stub
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    /** Returns an enum indicating how the baseline of the component
     *  changes as the size changes.
     */
    @stub
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    /**  */
    @stub
    protected def getFocusColor(): Color = ???

    /**  */
    @stub
    protected def getHeightOfHighValueLabel(): Int = ???

    /**  */
    @stub
    protected def getHeightOfLowValueLabel(): Int = ???

    /**  */
    @stub
    protected def getHeightOfTallestLabel(): Int = ???

    /** Returns the biggest value that has an entry in the label table. */
    @stub
    protected def getHighestValue(): Integer = ???

    /** Returns the label that corresponds to the lowest slider value in the label table. */
    @stub
    protected def getHighestValueLabel(): Component = ???

    /**  */
    @stub
    protected def getHighlightColor(): Color = ???

    /** Returns the smallest value that has an entry in the label table. */
    @stub
    protected def getLowestValue(): Integer = ???

    /** Returns the label that corresponds to the highest slider value in the label table. */
    @stub
    protected def getLowestValueLabel(): Component = ???

    /** Returns the specified component's maximum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMaximumSize(c: JComponent): Dimension = ???

    /**  */
    @stub
    def getMinimumHorizontalSize(): Dimension = ???

    /** Returns the specified component's minimum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMinimumSize(c: JComponent): Dimension = ???

    /**  */
    @stub
    def getMinimumVerticalSize(): Dimension = ???

    /**  */
    @stub
    def getPreferredHorizontalSize(): Dimension = ???

    /** Returns the specified component's preferred size appropriate for
     *  the look and feel.
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /**  */
    @stub
    def getPreferredVerticalSize(): Dimension = ???

    /**  */
    @stub
    protected def getShadowColor(): Color = ???

    /**  */
    @stub
    protected def getThumbSize(): Dimension = ???

    /** Gets the height of the tick area for horizontal sliders and the width of the
     *  tick area for vertical sliders.
     */
    @stub
    protected def getTickLength(): Int = ???

    /**  */
    @stub
    protected def getWidthOfHighValueLabel(): Int = ???

    /**  */
    @stub
    protected def getWidthOfLowValueLabel(): Int = ???

    /**  */
    @stub
    protected def getWidthOfWidestLabel(): Int = ???

    /**  */
    @stub
    protected def installDefaults(slider: JSlider): Unit = ???

    /**  */
    @stub
    protected def installKeyboardActions(slider: JSlider): Unit = ???

    /**  */
    @stub
    protected def installListeners(slider: JSlider): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Returns true if the user is dragging the slider. */
    @stub
    protected def isDragging(): Boolean = ???

    /** Returns true if all the labels from the label table have the same
     *  baseline.
     */
    @stub
    protected def labelsHaveSameBaselines(): Boolean = ???

    /** Paints the specified component appropriately for the look and feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /**  */
    @stub
    def paintFocus(g: Graphics): Unit = ???

    /** Called for every label in the label table. */
    @stub
    protected def paintHorizontalLabel(g: Graphics, value: Int, label: Component): Unit = ???

    /**  */
    @stub
    def paintLabels(g: Graphics): Unit = ???

    /**  */
    @stub
    protected def paintMajorTickForHorizSlider(g: Graphics, tickBounds: Rectangle, x: Int): Unit = ???

    /**  */
    @stub
    protected def paintMajorTickForVertSlider(g: Graphics, tickBounds: Rectangle, y: Int): Unit = ???

    /**  */
    @stub
    protected def paintMinorTickForHorizSlider(g: Graphics, tickBounds: Rectangle, x: Int): Unit = ???

    /**  */
    @stub
    protected def paintMinorTickForVertSlider(g: Graphics, tickBounds: Rectangle, y: Int): Unit = ???

    /**  */
    @stub
    def paintThumb(g: Graphics): Unit = ???

    /**  */
    @stub
    def paintTicks(g: Graphics): Unit = ???

    /**  */
    @stub
    def paintTrack(g: Graphics): Unit = ???

    /** Called for every label in the label table. */
    @stub
    protected def paintVerticalLabel(g: Graphics, value: Int, label: Component): Unit = ???

    /**  */
    @stub
    protected def recalculateIfInsetsChanged(): Unit = ???

    /**  */
    @stub
    protected def recalculateIfOrientationChanged(): Unit = ???

    /**  */
    @stub
    def scrollByBlock(direction: Int): Unit = ???

    /**  */
    @stub
    def scrollByUnit(direction: Int): Unit = ???

    /** This function is called when a mousePressed was detected in the track, not
     *  in the thumb.
     */
    @stub
    protected def scrollDueToClickInTrack(dir: Int): Unit = ???

    /**  */
    @stub
    def setThumbLocation(x: Int, y: Int): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(slider: JSlider): Unit = ???

    /**  */
    @stub
    protected def uninstallKeyboardActions(slider: JSlider): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(slider: JSlider): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???

    /** Returns the value at the x position. */
    @stub
    def valueForXPosition(xPos: Int): Int = ???

    /** Returns the value at the y position. */
    @stub
    def valueForYPosition(yPos: Int): Int = ???

    /**  */
    @stub
    protected def xPositionForValue(value: Int): Int = ???

    /**  */
    @stub
    protected def yPositionForValue(value: Int): Int = ???

    /** Returns the y location for the specified value. */
    @stub
    protected def yPositionForValue(value: Int, trackY: Int, trackHeight: Int): Int = ???
}

object BasicSliderUI {
    /**  */
    @stub
    val MAX_SCROLL: Int = ???

    /**  */
    @stub
    val MIN_SCROLL: Int = ???

    /**  */
    @stub
    val NEGATIVE_SCROLL: Int = ???

    /**  */
    @stub
    val POSITIVE_SCROLL: Int = ???

    /**  */
    @stub
    def createUI(b: JComponent): ComponentUI = ???
}
