package javax.swing.plaf.basic

import java.awt.{Color, Component, Container, Dimension, Graphics, LayoutManager, Rectangle}
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.swing.{JButton, JComponent, JScrollBar, SwingConstants, Timer}
import javax.swing.plaf.{ComponentUI, ScrollBarUI}

// Implementation of ScrollBarUI for the Basic Look and Feel
class BasicScrollBarUI extends ScrollBarUI with LayoutManager, with SwingConstants {

    @stub
    // Listener for cursor keys.
    protected def BasicScrollBarUI.ArrowButtonListener: class = ???

    @stub
    // A listener to listen for model changes.
    protected def BasicScrollBarUI.ModelListener: class = ???

    @stub
    // 
    def BasicScrollBarUI.PropertyChangeHandler: class = ???

    @stub
    // Listener for scrolling events initiated in the
    // ScrollPane.
    protected def BasicScrollBarUI.ScrollListener: class = ???

    @stub
    // 
    protected def buttonListener: BasicScrollBarUI.ArrowButtonListener = ???

    @stub
    // 
    protected def decrButton: JButton = ???

    @stub
    // Distance between the decrement button and the track.
    protected def decrGap: Int = ???

    @stub
    // 
    protected def incrButton: JButton = ???

    @stub
    // Distance between the increment button and the track.
    protected def incrGap: Int = ???

    @stub
    // 
    protected def isDragging: Boolean = ???

    @stub
    // 
    protected def maximumThumbSize: Dimension = ???

    @stub
    // 
    protected def minimumThumbSize: Dimension = ???

    @stub
    // 
    protected def modelListener: BasicScrollBarUI.ModelListener = ???

    @stub
    // 
    protected def propertyChangeListener: PropertyChangeListener = ???

    @stub
    // 
    protected def scrollbar: JScrollBar = ???

    @stub
    // Hint as to what width (when vertical) or height (when horizontal)
    // should be.
    protected def scrollBarWidth: Int = ???

    @stub
    // 
    protected def scrollListener: BasicScrollBarUI.ScrollListener = ???

    @stub
    // 
    protected def scrollTimer: Timer = ???

    @stub
    // 
    protected def thumbColor: Color = ???

    @stub
    // 
    protected def thumbDarkShadowColor: Color = ???

    @stub
    // 
    protected def thumbHighlightColor: Color = ???

    @stub
    // 
    protected def thumbLightShadowColor: Color = ???

    @stub
    // 
    protected def thumbRect: Rectangle = ???

    @stub
    // 
    protected def trackColor: Color = ???

    @stub
    // 
    protected def trackHighlight: Int = ???

    @stub
    // 
    protected def trackHighlightColor: Color = ???

    @stub
    // 
    protected def trackListener: BasicScrollBarUI.TrackListener = ???

    @stub
    // If the layout manager uses a per-component string,
    // adds the component comp to the layout,
    // associating it
    // with the string specified by name.
    def addLayoutComponent(name: String, child: Component): Unit = ???

    @stub
    // 
    protected def configureScrollBarColors(): Unit = ???

    @stub
    // 
    protected def createArrowButtonListener(): BasicScrollBarUI.ArrowButtonListener = ???

    @stub
    // 
    protected def createDecreaseButton(orientation: Int): JButton = ???

    @stub
    // 
    protected def createIncreaseButton(orientation: Int): JButton = ???

    @stub
    // 
    protected def createModelListener(): BasicScrollBarUI.ModelListener = ???

    @stub
    // 
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    @stub
    // 
    protected def createScrollListener(): BasicScrollBarUI.ScrollListener = ???

    @stub
    // 
    protected def createTrackListener(): BasicScrollBarUI.TrackListener = ???

    @stub
    // Returns the specified component's maximum size appropriate for
    // the look and feel.
    def getMaximumSize(c: JComponent): Dimension = ???

    @stub
    // Returns the largest acceptable size for the thumb.
    protected def getMaximumThumbSize(): Dimension = ???

    @stub
    // Returns the smallest acceptable size for the thumb.
    protected def getMinimumThumbSize(): Dimension = ???

    @stub
    // A vertical scrollbar's preferred width is the maximum of
    // preferred widths of the (non null)
    // increment/decrement buttons,
    // and the minimum width of the thumb.
    def getPreferredSize(c: JComponent): Dimension = ???

    @stub
    // Indicates whether the user can absolutely position the thumb with
    // a mouse gesture (usually the middle mouse button).
    def getSupportsAbsolutePositioning(): Boolean = ???

    @stub
    // Return the current size/location of the thumb.
    protected def getThumbBounds(): Rectangle = ???

    @stub
    // Returns the current bounds of the track, i.e.
    protected def getTrackBounds(): Rectangle = ???

    @stub
    // 
    protected def installComponents(): Unit = ???

    @stub
    // 
    protected def installDefaults(): Unit = ???

    @stub
    // 
    protected def installKeyboardActions(): Unit = ???

    @stub
    // 
    protected def installListeners(): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // Returns true if the mouse is currently over the thumb.
    def isThumbRollover(): Boolean = ???

    @stub
    // Lays out the specified container.
    def layoutContainer(scrollbarContainer: Container): Unit = ???

    @stub
    // 
    protected def layoutHScrollbar(sb: JScrollBar): Unit = ???

    @stub
    // 
    protected def layoutVScrollbar(sb: JScrollBar): Unit = ???

    @stub
    // Calculates the minimum size dimensions for the specified
    // container, given the components it contains.
    def minimumLayoutSize(scrollbarContainer: Container): Dimension = ???

    @stub
    // Paints the specified component appropriately for the look and feel.
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // 
    protected def paintDecreaseHighlight(g: Graphics): Unit = ???

    @stub
    // 
    protected def paintIncreaseHighlight(g: Graphics): Unit = ???

    @stub
    // 
    protected def paintThumb(g: Graphics, c: JComponent, thumbBounds: Rectangle): Unit = ???

    @stub
    // 
    protected def paintTrack(g: Graphics, c: JComponent, trackBounds: Rectangle): Unit = ???

    @stub
    // Calculates the preferred size dimensions for the specified
    // container, given the components it contains.
    def preferredLayoutSize(scrollbarContainer: Container): Dimension = ???

    @stub
    // Removes the specified component from the layout.
    def removeLayoutComponent(child: Component): Unit = ???

    @stub
    // 
    protected def scrollByBlock(direction: Int): Unit = ???

    @stub
    // 
    protected def scrollByUnit(direction: Int): Unit = ???

    @stub
    // Set the bounds of the thumb and force a repaint that includes
    // the old thumbBounds and the new one.
    protected def setThumbBounds(x: Int, y: Int, width: Int, height: Int): Unit = ???

    @stub
    // Sets whether or not the mouse is currently over the thumb.
    protected def setThumbRollover(active: Boolean): Unit = ???

    @stub
    // 
    protected def uninstallComponents(): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???

    @stub
    // 
    protected def uninstallKeyboardActions(): Unit = ???

    @stub
    // 
    protected def uninstallListeners(): Unit = ???
}

object BasicScrollBarUI {
    @stub
    // 
    protected def DECREASE_HIGHLIGHT: Int = ???

    @stub
    // 
    protected def INCREASE_HIGHLIGHT: Int = ???

    @stub
    // 
    protected def NO_HIGHLIGHT: Int = ???

    @stub
    // 
    def createUI(c: JComponent): ComponentUI = ???
}
