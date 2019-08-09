package javax.swing.plaf.synth

import java.awt.{Dimension, Graphics, Rectangle}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{JButton, JComponent}
import javax.swing.plaf.{ComponentUI, ScrollBarUI}
import javax.swing.plaf.basic.BasicScrollBarUI

/** Provides the Synth L&F UI delegate for
 *  JScrollBar.
 */
class SynthScrollBarUI extends BasicScrollBarUI with PropertyChangeListener with SynthUI {

    /**  */
    @stub
    protected def configureScrollBarColors(): Unit = ???

    /**  */
    @stub
    protected def createDecreaseButton(orientation: Int): JButton = ???

    /**  */
    @stub
    protected def createIncreaseButton(orientation: Int): JButton = ???

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

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

    /**  */
    @stub
    protected def installDefaults(): Unit = ???

    /**  */
    @stub
    protected def installListeners(): Unit = ???

    /** Paints the specified component according to the Look and Feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /** Paints the specified component. */
    @stub
    protected def paint(context: SynthContext, g: Graphics): Unit = ???

    /** Paints the border. */
    @stub
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /** Paints the scrollbar thumb. */
    @stub
    protected def paintThumb(context: SynthContext, g: Graphics, thumbBounds: Rectangle): Unit = ???

    /** Paints the scrollbar track. */
    @stub
    protected def paintTrack(context: SynthContext, g: Graphics, trackBounds: Rectangle): Unit = ???

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /** Sets whether or not the mouse is currently over the thumb. */
    @stub
    protected def setThumbRollover(active: Boolean): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(): Unit = ???
}

object SynthScrollBarUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
