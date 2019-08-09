package javax.swing.plaf.synth

import java.awt.{Dimension, Graphics}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{JComponent, JSeparator}
import javax.swing.plaf.{ComponentUI, SeparatorUI}
import scala.scalanative.annotation.stub

/** Provides the Synth L&F UI delegate for
 *  JSeparator.
 */
class SynthSeparatorUI extends SeparatorUI with PropertyChangeListener with SynthUI {

    /**  */
    @stub
    def this() = ???

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /** Returns the specified component's maximum size appropriate for
     *  the look and feel.
     */
    @stub
    def getMaximumSize(c: JComponent): Dimension = ???

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

    /** Installs default setting. */
    @stub
    def installDefaults(c: JSeparator): Unit = ???

    /** Installs listeners. */
    @stub
    def installListeners(c: JSeparator): Unit = ???

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
    def propertyChange(evt: PropertyChangeEvent): Unit = ???

    /** Uninstalls default setting. */
    @stub
    def uninstallDefaults(c: JSeparator): Unit = ???

    /** Uninstalls listeners. */
    @stub
    def uninstallListeners(c: JSeparator): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???

    /** Notifies this UI delegate to repaint the specified component. */
    @stub
    def update(g: Graphics, c: JComponent): Unit = ???
}

object SynthSeparatorUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
