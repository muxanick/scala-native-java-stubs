package javax.swing.plaf.synth

import java.awt.{Dimension, Graphics, Rectangle}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{JComponent, JSlider}
import javax.swing.plaf.{ComponentUI, SliderUI}
import javax.swing.plaf.basic.{BasicSliderUI, BasicSliderUI.TrackListener}

// Provides the Synth L&F UI delegate for
// JSlider.
class SynthSliderUI extends BasicSliderUI with PropertyChangeListener, with SynthUI {

    @stub
    // 
    protected def calculateGeometry(): Unit = ???

    @stub
    // 
    protected def calculateThumbLocation(): Unit = ???

    @stub
    // 
    protected def createTrackListener(s: JSlider): BasicSliderUI.TrackListener = ???

    @stub
    // Returns the baseline.
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // Returns the specified component's minimum size appropriate for
    // the look and feel.
    def getMinimumSize(c: JComponent): Dimension = ???

    @stub
    // Returns the specified component's preferred size appropriate for
    // the look and feel.
    def getPreferredSize(c: JComponent): Dimension = ???

    @stub
    // 
    protected def getThumbSize(): Dimension = ???

    @stub
    // 
    protected def installDefaults(slider: JSlider): Unit = ???

    @stub
    // 
    protected def installListeners(slider: JSlider): Unit = ???

    @stub
    // Lays out the slider.
    protected def layout(): Unit = ???

    @stub
    // Paints the specified component according to the Look and Feel.
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // Paints the specified component.
    protected def paint(context: SynthContext, g: Graphics): Unit = ???

    @stub
    // Paints the border.
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    @stub
    // Paints the slider thumb.
    protected def paintThumb(context: SynthContext, g: Graphics, thumbBounds: Rectangle): Unit = ???

    @stub
    // Paints the slider track.
    protected def paintTrack(context: SynthContext, g: Graphics, trackBounds: Rectangle): Unit = ???

    @stub
    // This method gets called when a bound property is changed.
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    @stub
    // 
    protected def recalculateIfInsetsChanged(): Unit = ???

    @stub
    // 
    def setThumbLocation(x: Int, y: Int): Unit = ???

    @stub
    // Uninstalls default setting.
    protected def uninstallDefaults(slider: JSlider): Unit = ???

    @stub
    // 
    protected def uninstallListeners(slider: JSlider): Unit = ???

    @stub
    // Notifies this UI delegate to repaint the specified component.
    def update(g: Graphics, c: JComponent): Unit = ???

    @stub
    // Returns the value at the x position.
    def valueForXPosition(xPos: Int): Int = ???

    @stub
    // Returns the value at the y position.
    def valueForYPosition(yPos: Int): Int = ???

    @stub
    // 
    protected def xPositionForValue(value: Int): Int = ???
}

object SynthSliderUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(c: JComponent): ComponentUI = ???
}
