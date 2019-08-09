package javax.swing.plaf.basic

import java.awt.{Color, Component.BaselineResizeBehavior, Dimension, Graphics, Insets, Point, Rectangle}
import java.lang.{Object, String}
import javax.swing.{JComponent, JProgressBar}
import javax.swing.event.ChangeListener
import javax.swing.plaf.{ComponentUI, ProgressBarUI}
import scala.scalanative.annotation.stub

/** A Basic L&F implementation of ProgressBarUI. */
class BasicProgressBarUI extends ProgressBarUI {

    /**  */
    @stub
    def this() = ???

    /** This class should be treated as a "protected" inner class. */
    @stub
    object ChangeHandler extends BasicProgressBarUI.ChangeHandler

    /** Used to hold the location and size of the bouncing box (returned
     *  by getBox) to be painted.
     */
    @stub
    protected val boxRect: Rectangle = ???

    /**  */
    @stub
    protected val changeListener: ChangeListener = ???

    /**  */
    @stub
    protected val progressBar: JProgressBar = ???

    /** This determines the amount of the progress bar that should be filled
     *  based on the percent done gathered from the model.
     */
    @stub
    protected def getAmountFull(b: Insets, width: Int, height: Int): Int = ???

    /** Gets the index of the current animation frame. */
    @stub
    protected def getAnimationIndex(): Int = ???

    /** Returns the baseline. */
    @stub
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    /** Returns an enum indicating how the baseline of the component
     *  changes as the size changes.
     */
    @stub
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    /** Stores the position and size of
     *  the bouncing box that would be painted for the current animation index
     *  in r and returns r.
     */
    @stub
    protected def getBox(r: Rectangle): Rectangle = ???

    /** Returns the length
     *  of the "bouncing box" to be painted.
     */
    @stub
    protected def getBoxLength(availableLength: Int, otherDimension: Int): Int = ???

    /** Returns the width (if HORIZONTAL) or height (if VERTICAL)
     *  of each of the individual cells/units to be rendered in the
     *  progress bar.
     */
    @stub
    protected def getCellLength(): Int = ???

    /** Returns the spacing between each of the cells/units in the
     *  progress bar.
     */
    @stub
    protected def getCellSpacing(): Int = ???

    /** Returns the number of frames for the complete animation loop
     *  used by an indeterminate JProgessBar.
     */
    @stub
    protected def getFrameCount(): Int = ???

    /** Returns the specified component's maximum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMaximumSize(c: JComponent): Dimension = ???

    /** The Minimum size for this component is 10. */
    @stub
    def getMinimumSize(c: JComponent): Dimension = ???

    /**  */
    @stub
    protected def getPreferredInnerHorizontal(): Dimension = ???

    /**  */
    @stub
    protected def getPreferredInnerVertical(): Dimension = ???

    /** Returns the specified component's preferred size appropriate for
     *  the look and feel.
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /** The "selectionBackground" is the color of the text when it is painted
     *  over an unfilled area of the progress bar.
     */
    @stub
    protected def getSelectionBackground(): Color = ???

    /** The "selectionForeground" is the color of the text when it is painted
     *  over a filled area of the progress bar.
     */
    @stub
    protected def getSelectionForeground(): Color = ???

    /** Designate the place where the progress string will be painted. */
    @stub
    protected def getStringPlacement(g: Graphics, progressString: String, x: Int, y: Int, width: Int, height: Int): Point = ???

    /** Sets the index of the current animation frame,
     *  to the next valid value,
     *  which results in the progress bar being repainted.
     */
    @stub
    protected def incrementAnimationIndex(): Unit = ???

    /**  */
    @stub
    protected def installDefaults(): Unit = ???

    /**  */
    @stub
    protected def installListeners(): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Delegates painting to one of two methods:
     *  paintDeterminate or paintIndeterminate.
     */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /** All purpose paint method that should do the right thing for almost
     *  all linear, determinate progress bars.
     */
    @stub
    protected def paintDeterminate(g: Graphics, c: JComponent): Unit = ???

    /** All purpose paint method that should do the right thing for all
     *  linear bouncing-box progress bars.
     */
    @stub
    protected def paintIndeterminate(g: Graphics, c: JComponent): Unit = ???

    /**  */
    @stub
    protected def paintString(g: Graphics, x: Int, y: Int, width: Int, height: Int, amountFull: Int, b: Insets): Unit = ???

    /** Sets the index of the current animation frame
     *  to the specified value and requests that the
     *  progress bar be repainted.
     */
    @stub
    protected def setAnimationIndex(newValue: Int): Unit = ???

    /**  */
    @stub
    protected def setCellLength(cellLen: Int): Unit = ???

    /**  */
    @stub
    protected def setCellSpacing(cellSpace: Int): Unit = ???

    /** Starts the animation thread, creating and initializing
     *  it if necessary.
     */
    @stub
    protected def startAnimationTimer(): Unit = ???

    /** Stops the animation thread. */
    @stub
    protected def stopAnimationTimer(): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /** Removes all listeners installed by this object. */
    @stub
    protected def uninstallListeners(): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???
}

object BasicProgressBarUI {
    /**  */
    @stub
    def createUI(x: JComponent): ComponentUI = ???
}
