package javax.swing.plaf.metal

import java.awt.{Color, Dimension, Graphics, Rectangle}
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.swing.{Icon, JComponent, JSlider}
import javax.swing.plaf.{ComponentUI, SliderUI}
import javax.swing.plaf.basic.BasicSliderUI
import scala.scalanative.annotation.stub

/** A Java L&F implementation of SliderUI.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class MetalSliderUI extends BasicSliderUI {

    /**  */
    @stub
    def this() = ???

    /**  */
    @stub
    protected object MetalPropertyListener extends MetalSliderUI.MetalPropertyListener

    /**  */
    @stub
    protected val filledSlider: Boolean = ???

    /**  */
    @stub
    protected val SLIDER_FILL: String = ???

    /**  */
    @stub
    protected val TICK_BUFFER: Int = ???

    /**  */
    @stub
    protected def createPropertyChangeListener(slider: JSlider): PropertyChangeListener = ???

    /** Returns the amount that the thumb goes past the slide bar. */
    @stub
    protected def getThumbOverhang(): Int = ???

    /**  */
    @stub
    protected def getThumbSize(): Dimension = ???

    /** Gets the height of the tick area for horizontal sliders and the width of the
     *  tick area for vertical sliders.
     */
    @stub
    def getTickLength(): Int = ???

    /** Returns the longer dimension of the slide bar. */
    @stub
    protected def getTrackLength(): Int = ???

    /** Returns the shorter dimension of the track. */
    @stub
    protected def getTrackWidth(): Int = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /**  */
    @stub
    def paintFocus(g: Graphics): Unit = ???

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
    def paintTrack(g: Graphics): Unit = ???

    /** This function is called when a mousePressed was detected in the track, not
     *  in the thumb.
     */
    @stub
    protected def scrollDueToClickInTrack(dir: Int): Unit = ???
}

object MetalSliderUI {
    /**  */
    @stub
    protected val darkShadowColor: Color = ???

    /**  */
    @stub
    protected val highlightColor: Color = ???

    /** A default horizontal thumb Icon. */
    @stub
    protected val horizThumbIcon: Icon = ???

    /**  */
    @stub
    protected val thumbColor: Color = ???

    /**  */
    @stub
    protected val tickLength: Int = ???

    /**  */
    @stub
    protected val trackWidth: Int = ???

    /** A default vertical thumb Icon. */
    @stub
    protected val vertThumbIcon: Icon = ???

    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
