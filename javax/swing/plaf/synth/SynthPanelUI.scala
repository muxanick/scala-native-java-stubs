package javax.swing.plaf.synth

import java.awt.Graphics
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{JComponent, JPanel}
import javax.swing.plaf.{ComponentUI, PanelUI}
import javax.swing.plaf.basic.BasicPanelUI
import scala.scalanative.annotation.stub

/** Provides the Synth L&F UI delegate for
 *  JPanel.
 */
class SynthPanelUI extends BasicPanelUI with PropertyChangeListener with SynthUI {

    /**  */
    @stub
    def this() = ???

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /**  */
    @stub
    protected def installDefaults(p: JPanel): Unit = ???

    /** Installs listeners into the panel. */
    @stub
    protected def installListeners(p: JPanel): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

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
    def propertyChange(pce: PropertyChangeEvent): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(p: JPanel): Unit = ???

    /** Uninstalls listeners from the panel. */
    @stub
    protected def uninstallListeners(p: JPanel): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???

    /** Notifies this UI delegate to repaint the specified component. */
    @stub
    def update(g: Graphics, c: JComponent): Unit = ???
}

object SynthPanelUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
