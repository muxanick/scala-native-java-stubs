package javax.swing.plaf.synth

import java.awt.{Dimension, Graphics, Rectangle}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, ProgressBarUI}
import javax.swing.plaf.basic.BasicProgressBarUI
import scala.scalanative.annotation.stub

/** Provides the Synth L&F UI delegate for
 *  JProgressBar.
 */
class SynthProgressBarUI extends BasicProgressBarUI with SynthUI with PropertyChangeListener {

    /**  */
    @stub
    def this() = ???

    /** Returns the baseline. */
    @stub
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    /** Stores the position and size of
     *  the bouncing box that would be painted for the current animation index
     *  in r and returns r.
     */
    @stub
    protected def getBox(r: Rectangle): Rectangle = ???

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /** Returns the specified component's preferred size appropriate for
     *  the look and feel.
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

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

    /** Paints the component's text. */
    @stub
    protected def paintText(context: SynthContext, g: Graphics, title: String): Unit = ???

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /** Sets the index of the current animation frame
     *  to the specified value and requests that the
     *  progress bar be repainted.
     */
    @stub
    protected def setAnimationIndex(newValue: Int): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /** Removes all listeners installed by this object. */
    @stub
    protected def uninstallListeners(): Unit = ???

    /** Notifies this UI delegate to repaint the specified component. */
    @stub
    def update(g: Graphics, c: JComponent): Unit = ???
}

object SynthProgressBarUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(x: JComponent): ComponentUI = ???
}
