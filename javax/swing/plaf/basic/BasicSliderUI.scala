package javax.swing.plaf.basic

import java.awt.{Color, Component, Component.BaselineResizeBehavior, Dimension, Graphics, Insets, Rectangle}
import java.awt.event.{ComponentListener, FocusListener}
import java.beans.PropertyChangeListener
import java.lang.{Integer, Object}
import javax.swing.{JComponent, JSlider, Timer}
import javax.swing.event.ChangeListener
import javax.swing.plaf.{ComponentUI, SliderUI}

// A Basic L&F implementation of SliderUI.
class BasicSliderUI extends SliderUI {

    @stub
    // As of Java 2 platform v1.3 this undocumented class is no longer used.
    def BasicSliderUI.ActionScroller: class = ???

    @stub
    // Data model listener.
    def BasicSliderUI.ChangeHandler: class = ???

    @stub
    // Listener for resizing events.
    def BasicSliderUI.ComponentHandler: class = ???

    @stub
    // Focus-change listener.
    def BasicSliderUI.FocusHandler: class = ???

    @stub
    // 
    def BasicSliderUI.PropertyChangeHandler: class = ???

    @stub
    // Scroll-event listener.
    def BasicSliderUI.ScrollListener: class = ???

    @stub
    // 
    protected def changeListener: ChangeListener = ???

    @stub
    // 
    protected def componentListener: ComponentListener = ???

    @stub
    // 
    protected def contentRect: Rectangle = ???

    @stub
    // 
    protected def focusInsets: Insets = ???

    @stub
    // 
    protected def focusListener: FocusListener = ???

    @stub
    // 
    protected def focusRect: Rectangle = ???

    @stub
    // 
    protected def insetCache: Insets = ???

    @stub
    // 
    protected def labelRect: Rectangle = ???

    @stub
    // 
    protected def leftToRightCache: Boolean = ???

    @stub
    // 
    protected def propertyChangeListener: PropertyChangeListener = ???

    @stub
    // 
    protected def scrollListener: BasicSliderUI.ScrollListener = ???

    @stub
    // 
    protected def scrollTimer: Timer = ???

    @stub
    // 
    protected def slider: JSlider = ???

    @stub
    // 
    protected def thumbRect: Rectangle = ???

    @stub
    // 
    protected def tickRect: Rectangle = ???

    @stub
    // 
    protected def trackBuffer: Int = ???

    @stub
    // 
    protected def trackListener: BasicSliderUI.TrackListener = ???

    @stub
    // 
    protected def calculateContentRect(): Unit = ???

    @stub
    // 
    protected def calculateFocusRect(): Unit = ???

    @stub
    // 
    protected def calculateGeometry(): Unit = ???

    @stub
    // 
    protected def calculateLabelRect(): Unit = ???

    @stub
    // 
    protected def calculateThumbLocation(): Unit = ???

    @stub
    // 
    protected def calculateThumbSize(): Unit = ???

    @stub
    // 
    protected def calculateTickRect(): Unit = ???

    @stub
    // 
    protected def calculateTrackBuffer(): Unit = ???

    @stub
    // 
    protected def calculateTrackRect(): Unit = ???

    @stub
    // 
    protected def createChangeListener(slider: JSlider): ChangeListener = ???

    @stub
    // 
    protected def createComponentListener(slider: JSlider): ComponentListener = ???

    @stub
    // 
    protected def createFocusListener(slider: JSlider): FocusListener = ???

    @stub
    // 
    protected def createPropertyChangeListener(slider: JSlider): PropertyChangeListener = ???

    @stub
    // 
    protected def createScrollListener(slider: JSlider): BasicSliderUI.ScrollListener = ???

    @stub
    // 
    protected def createTrackListener(slider: JSlider): BasicSliderUI.TrackListener = ???

    @stub
    // 
    protected def drawInverted(): Boolean = ???

    @stub
    // Returns the baseline.
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    @stub
    // Returns an enum indicating how the baseline of the component
    // changes as the size changes.
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    @stub
    // 
    protected def getFocusColor(): Color = ???

    @stub
    // 
    protected def getHeightOfHighValueLabel(): Int = ???

    @stub
    // 
    protected def getHeightOfLowValueLabel(): Int = ???

    @stub
    // 
    protected def getHeightOfTallestLabel(): Int = ???

    @stub
    // Returns the biggest value that has an entry in the label table.
    protected def getHighestValue(): Integer = ???

    @stub
    // Returns the label that corresponds to the lowest slider value in the label table.
    protected def getHighestValueLabel(): Component = ???

    @stub
    // 
    protected def getHighlightColor(): Color = ???

    @stub
    // Returns the smallest value that has an entry in the label table.
    protected def getLowestValue(): Integer = ???

    @stub
    // Returns the label that corresponds to the highest slider value in the label table.
    protected def getLowestValueLabel(): Component = ???

    @stub
    // Returns the specified component's maximum size appropriate for
    // the look and feel.
    def getMaximumSize(c: JComponent): Dimension = ???

    @stub
    // 
    def getMinimumHorizontalSize(): Dimension = ???

    @stub
    // Returns the specified component's minimum size appropriate for
    // the look and feel.
    def getMinimumSize(c: JComponent): Dimension = ???

    @stub
    // 
    def getMinimumVerticalSize(): Dimension = ???

    @stub
    // 
    def getPreferredHorizontalSize(): Dimension = ???

    @stub
    // Returns the specified component's preferred size appropriate for
    // the look and feel.
    def getPreferredSize(c: JComponent): Dimension = ???

    @stub
    // 
    def getPreferredVerticalSize(): Dimension = ???

    @stub
    // 
    protected def getShadowColor(): Color = ???

    @stub
    // 
    protected def getThumbSize(): Dimension = ???

    @stub
    // Gets the height of the tick area for horizontal sliders and the width of the
    // tick area for vertical sliders.
    protected def getTickLength(): Int = ???

    @stub
    // 
    protected def getWidthOfHighValueLabel(): Int = ???

    @stub
    // 
    protected def getWidthOfLowValueLabel(): Int = ???

    @stub
    // 
    protected def getWidthOfWidestLabel(): Int = ???

    @stub
    // 
    protected def installDefaults(slider: JSlider): Unit = ???

    @stub
    // 
    protected def installKeyboardActions(slider: JSlider): Unit = ???

    @stub
    // 
    protected def installListeners(slider: JSlider): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // Returns true if the user is dragging the slider.
    protected def isDragging(): Boolean = ???

    @stub
    // Returns true if all the labels from the label table have the same
    // baseline.
    protected def labelsHaveSameBaselines(): Boolean = ???

    @stub
    // Paints the specified component appropriately for the look and feel.
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // 
    def paintFocus(g: Graphics): Unit = ???

    @stub
    // Called for every label in the label table.
    protected def paintHorizontalLabel(g: Graphics, value: Int, label: Component): Unit = ???

    @stub
    // 
    def paintLabels(g: Graphics): Unit = ???

    @stub
    // 
    protected def paintMajorTickForHorizSlider(g: Graphics, tickBounds: Rectangle, x: Int): Unit = ???

    @stub
    // 
    protected def paintMajorTickForVertSlider(g: Graphics, tickBounds: Rectangle, y: Int): Unit = ???

    @stub
    // 
    protected def paintMinorTickForHorizSlider(g: Graphics, tickBounds: Rectangle, x: Int): Unit = ???

    @stub
    // 
    protected def paintMinorTickForVertSlider(g: Graphics, tickBounds: Rectangle, y: Int): Unit = ???

    @stub
    // 
    def paintThumb(g: Graphics): Unit = ???

    @stub
    // 
    def paintTicks(g: Graphics): Unit = ???

    @stub
    // 
    def paintTrack(g: Graphics): Unit = ???

    @stub
    // Called for every label in the label table.
    protected def paintVerticalLabel(g: Graphics, value: Int, label: Component): Unit = ???

    @stub
    // 
    protected def recalculateIfInsetsChanged(): Unit = ???

    @stub
    // 
    protected def recalculateIfOrientationChanged(): Unit = ???

    @stub
    // 
    def scrollByBlock(direction: Int): Unit = ???

    @stub
    // 
    def scrollByUnit(direction: Int): Unit = ???

    @stub
    // This function is called when a mousePressed was detected in the track, not
    // in the thumb.
    protected def scrollDueToClickInTrack(dir: Int): Unit = ???

    @stub
    // 
    def setThumbLocation(x: Int, y: Int): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(slider: JSlider): Unit = ???

    @stub
    // 
    protected def uninstallKeyboardActions(slider: JSlider): Unit = ???

    @stub
    // 
    protected def uninstallListeners(slider: JSlider): Unit = ???

    @stub
    // Reverses configuration which was done on the specified component during
    // installUI.
    def uninstallUI(c: JComponent): Unit = ???

    @stub
    // Returns the value at the x position.
    def valueForXPosition(xPos: Int): Int = ???

    @stub
    // Returns the value at the y position.
    def valueForYPosition(yPos: Int): Int = ???

    @stub
    // 
    protected def xPositionForValue(value: Int): Int = ???

    @stub
    // 
    protected def yPositionForValue(value: Int): Int = ???
}

object BasicSliderUI {
    @stub
    // 
    def MAX_SCROLL: Int = ???

    @stub
    // 
    def MIN_SCROLL: Int = ???

    @stub
    // 
    def NEGATIVE_SCROLL: Int = ???

    @stub
    // 
    def POSITIVE_SCROLL: Int = ???

    @stub
    // 
    def createUI(b: JComponent): ComponentUI = ???
}
