package javax.swing.plaf.metal

import java.awt.{Dimension, Graphics, Rectangle}
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.swing.{JButton, JComponent}
import javax.swing.plaf.{ComponentUI, ScrollBarUI}
import javax.swing.plaf.basic.BasicScrollBarUI

/** Implementation of ScrollBarUI for the Metal Look and Feel
 *  
 */
class MetalScrollBarUI extends BasicScrollBarUI {

    /**  */
    @stub
    protected val bumps: javax.swing.plaf.metal.MetalBumps = ???

    /**  */
    @stub
    protected val decreaseButton: MetalScrollButton = ???

    /**  */
    @stub
    protected val increaseButton: MetalScrollButton = ???

    /**  */
    @stub
    protected val isFreeStanding: Boolean = ???

    /**  */
    @stub
    protected def configureScrollBarColors(): Unit = ???

    /** Returns the view that represents the decrease view. */
    @stub
    protected def createDecreaseButton(orientation: Int): JButton = ???

    /** Returns the view that represents the increase view. */
    @stub
    protected def createIncreaseButton(orientation: Int): JButton = ???

    /**  */
    @stub
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

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

    /**  */
    @stub
    protected def installDefaults(): Unit = ???

    /**  */
    @stub
    protected def installListeners(): Unit = ???

    /**  */
    @stub
    protected def paintThumb(g: Graphics, c: JComponent, thumbBounds: Rectangle): Unit = ???

    /**  */
    @stub
    protected def paintTrack(g: Graphics, c: JComponent, trackBounds: Rectangle): Unit = ???
}

object MetalScrollBarUI {
    /**  */
    @stub
    val FREE_STANDING_PROP: String = ???

    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
