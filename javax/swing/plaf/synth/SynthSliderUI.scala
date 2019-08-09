package javax.swing.plaf.synth

import java.awt.{Dimension, Graphics, Rectangle}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{JComponent, JSlider}
import javax.swing.plaf.{ComponentUI, SliderUI}
import javax.swing.plaf.basic.{BasicSliderUI, BasicSliderUI.TrackListener}

/** Provides the Synth L&F UI delegate for
 *  JSlider.
 */
class SynthSliderUI extends BasicSliderUI with PropertyChangeListener with SynthUI {

    /**  */
    @stub
    protected def calculateGeometry(): Unit = ???

    /**  */
    @stub
    protected def calculateThumbLocation(): Unit = ???

    /**  */
    @stub
    protected def createTrackListener(s: JSlider): BasicSliderUI.TrackListener = ???

    /** Returns the baseline. */
    @stub
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /** Returns the specified component's minimum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMinimumSize(c: JComponent): Dimension = ???

    /** Returns the specified component's preferred size appropriate for
     *  the look and feel.
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /**  */
    @stub
    protected def getThumbSize(): Dimension = ???

    /**  */
    @stub
    protected def installDefaults(slider: JSlider): Unit = ???

    /**  */
    @stub
    protected def installListeners(slider: JSlider): Unit = ???

    /** Lays out the slider. */
    @stub
    protected def layout(): Unit = ???

    /** Paints the specified component according to the Look and Feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /** Paints the specified component. */
    @stub
    protected def paint(context: SynthContext, g: Graphics): Unit = ???

    /** Paints the border. */
    @stub
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /** Paints the slider thumb. */
    @stub
    protected def paintThumb(context: SynthContext, g: Graphics, thumbBounds: Rectangle): Unit = ???

    /** Paints the slider track. */
    @stub
    protected def paintTrack(context: SynthContext, g: Graphics, trackBounds: Rectangle): Unit = ???

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /**  */
    @stub
    protected def recalculateIfInsetsChanged(): Unit = ???

    /**  */
    @stub
    def setThumbLocation(x: Int, y: Int): Unit = ???

    /** Uninstalls default setting. */
    @stub
    protected def uninstallDefaults(slider: JSlider): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(slider: JSlider): Unit = ???

    /** Notifies this UI delegate to repaint the specified component. */
    @stub
    def update(g: Graphics, c: JComponent): Unit = ???

    /** Returns the value at the x position. */
    @stub
    def valueForXPosition(xPos: Int): Int = ???

    /** Returns the value at the y position. */
    @stub
    def valueForYPosition(yPos: Int): Int = ???

    /**  */
    @stub
    protected def xPositionForValue(value: Int): Int = ???
}

object SynthSliderUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
