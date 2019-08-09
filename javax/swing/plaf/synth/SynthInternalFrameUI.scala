package javax.swing.plaf.synth

import java.awt.Graphics
import java.awt.event.ComponentListener
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{JComponent, JInternalFrame}
import javax.swing.plaf.{ComponentUI, InternalFrameUI}
import javax.swing.plaf.basic.BasicInternalFrameUI

/** Provides the Synth L&F UI delegate for
 *  JInternalFrame.
 */
class SynthInternalFrameUI extends BasicInternalFrameUI with SynthUI with PropertyChangeListener {

    /**  */
    @stub
    protected def createComponentListener(): ComponentListener = ???

    /**  */
    @stub
    protected def createNorthPane(w: JInternalFrame): JComponent = ???

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /**  */
    @stub
    def installDefaults(): Unit = ???

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

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(evt: PropertyChangeEvent): Unit = ???

    /**  */
    @stub
    protected def uninstallComponents(): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(): Unit = ???
}

object SynthInternalFrameUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(b: JComponent): ComponentUI = ???
}
