package javax.swing.plaf.basic

import java.awt.{Color, Component.BaselineResizeBehavior, Dimension, Graphics, Insets, Point, Rectangle}
import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.event.ChangeListener
import javax.swing.plaf.{ComponentUI, ProgressBarUI}

// A Basic L&F implementation of ProgressBarUI.
class BasicProgressBarUI extends ProgressBarUI {

    @stub
    // Used to hold the location and size of the bouncing box (returned
    // by getBox) to be painted.
    protected def boxRect: Rectangle = ???

    @stub
    // 
    protected def changeListener: ChangeListener = ???

    @stub
    // This determines the amount of the progress bar that should be filled
    // based on the percent done gathered from the model.
    protected def getAmountFull(b: Insets, width: Int, height: Int): Int = ???

    @stub
    // Gets the index of the current animation frame.
    protected def getAnimationIndex(): Int = ???

    @stub
    // Returns the baseline.
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    @stub
    // Returns an enum indicating how the baseline of the component
    // changes as the size changes.
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    @stub
    // Stores the position and size of
    // the bouncing box that would be painted for the current animation index
    // in r and returns r.
    protected def getBox(r: Rectangle): Rectangle = ???

    @stub
    // Returns the length
    // of the "bouncing box" to be painted.
    protected def getBoxLength(availableLength: Int, otherDimension: Int): Int = ???

    @stub
    // Returns the width (if HORIZONTAL) or height (if VERTICAL)
    // of each of the individual cells/units to be rendered in the
    // progress bar.
    protected def getCellLength(): Int = ???

    @stub
    // Returns the spacing between each of the cells/units in the
    // progress bar.
    protected def getCellSpacing(): Int = ???

    @stub
    // Returns the number of frames for the complete animation loop
    // used by an indeterminate JProgessBar.
    protected def getFrameCount(): Int = ???

    @stub
    // Returns the specified component's maximum size appropriate for
    // the look and feel.
    def getMaximumSize(c: JComponent): Dimension = ???

    @stub
    // The Minimum size for this component is 10.
    def getMinimumSize(c: JComponent): Dimension = ???

    @stub
    // 
    protected def getPreferredInnerHorizontal(): Dimension = ???

    @stub
    // 
    protected def getPreferredInnerVertical(): Dimension = ???

    @stub
    // Returns the specified component's preferred size appropriate for
    // the look and feel.
    def getPreferredSize(c: JComponent): Dimension = ???

    @stub
    // The "selectionBackground" is the color of the text when it is painted
    // over an unfilled area of the progress bar.
    protected def getSelectionBackground(): Color = ???

    @stub
    // The "selectionForeground" is the color of the text when it is painted
    // over a filled area of the progress bar.
    protected def getSelectionForeground(): Color = ???

    @stub
    // Designate the place where the progress string will be painted.
    protected def getStringPlacement(g: Graphics, progressString: String, x: Int, y: Int, width: Int, height: Int): Point = ???

    @stub
    // Sets the index of the current animation frame,
    // to the next valid value,
    // which results in the progress bar being repainted.
    protected def incrementAnimationIndex(): Unit = ???

    @stub
    // 
    protected def installDefaults(): Unit = ???

    @stub
    // 
    protected def installListeners(): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // Delegates painting to one of two methods:
    // paintDeterminate or paintIndeterminate.
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // All purpose paint method that should do the right thing for almost
    // all linear, determinate progress bars.
    protected def paintDeterminate(g: Graphics, c: JComponent): Unit = ???

    @stub
    // All purpose paint method that should do the right thing for all
    // linear bouncing-box progress bars.
    protected def paintIndeterminate(g: Graphics, c: JComponent): Unit = ???

    @stub
    // 
    protected def paintString(g: Graphics, x: Int, y: Int, width: Int, height: Int, amountFull: Int, b: Insets): Unit = ???

    @stub
    // Sets the index of the current animation frame
    // to the specified value and requests that the
    // progress bar be repainted.
    protected def setAnimationIndex(newValue: Int): Unit = ???

    @stub
    // 
    protected def setCellLength(cellLen: Int): Unit = ???

    @stub
    // 
    protected def setCellSpacing(cellSpace: Int): Unit = ???

    @stub
    // Starts the animation thread, creating and initializing
    // it if necessary.
    protected def startAnimationTimer(): Unit = ???

    @stub
    // Stops the animation thread.
    protected def stopAnimationTimer(): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???

    @stub
    // Removes all listeners installed by this object.
    protected def uninstallListeners(): Unit = ???
}

object BasicProgressBarUI {
    @stub
    // 
    def createUI(x: JComponent): ComponentUI = ???
}
