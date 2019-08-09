package javax.swing.plaf.synth

import java.awt.{Dimension, Graphics}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, ToolTipUI}
import javax.swing.plaf.basic.BasicToolTipUI

/** Provides the Synth L&F UI delegate for
 *  JToolTip.
 */
class SynthToolTipUI extends BasicToolTipUI with PropertyChangeListener with SynthUI {

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
    protected def installDefaults(c: JComponent): Unit = ???

    /**  */
    @stub
    protected def installListeners(c: JComponent): Unit = ???

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
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(c: JComponent): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(c: JComponent): Unit = ???
}

object SynthToolTipUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
