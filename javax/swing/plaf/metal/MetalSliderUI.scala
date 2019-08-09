package javax.swing.plaf.metal

import java.awt.{Color, Dimension, Graphics, Rectangle}
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.swing.{Icon, JComponent, JSlider}
import javax.swing.plaf.{ComponentUI, SliderUI}
import javax.swing.plaf.basic.BasicSliderUI

// A Java L&F implementation of SliderUI.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class MetalSliderUI extends BasicSliderUI {

    @stub
    // 
    protected def filledSlider: Boolean = ???

    @stub
    // 
    protected def SLIDER_FILL: String = ???

    @stub
    // 
    protected def TICK_BUFFER: Int = ???

    @stub
    // 
    protected def createPropertyChangeListener(slider: JSlider): PropertyChangeListener = ???

    @stub
    // Returns the amount that the thumb goes past the slide bar.
    protected def getThumbOverhang(): Int = ???

    @stub
    // 
    protected def getThumbSize(): Dimension = ???

    @stub
    // Gets the height of the tick area for horizontal sliders and the width of the
    // tick area for vertical sliders.
    def getTickLength(): Int = ???

    @stub
    // Returns the longer dimension of the slide bar.
    protected def getTrackLength(): Int = ???

    @stub
    // Returns the shorter dimension of the track.
    protected def getTrackWidth(): Int = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // 
    def paintFocus(g: Graphics): Unit = ???

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
    def paintTrack(g: Graphics): Unit = ???
}

object MetalSliderUI {
    @stub
    // 
    protected def darkShadowColor: Color = ???

    @stub
    // 
    protected def highlightColor: Color = ???

    @stub
    // A default horizontal thumb Icon.
    protected def horizThumbIcon: Icon = ???

    @stub
    // 
    protected def thumbColor: Color = ???

    @stub
    // 
    protected def tickLength: Int = ???

    @stub
    // 
    protected def trackWidth: Int = ???

    @stub
    // 
    def createUI(c: JComponent): ComponentUI = ???
}
