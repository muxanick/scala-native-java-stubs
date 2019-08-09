package javax.swing.plaf.synth

import java.awt.{Dimension, Graphics}
import java.beans.PropertyChangeEvent
import java.lang.Object
import javax.swing.{JComponent, JLabel}
import javax.swing.plaf.{ComponentUI, LabelUI}
import javax.swing.plaf.basic.BasicLabelUI
import scala.scalanative.annotation.stub

/** Provides the Synth L&F UI delegate for
 *  JLabel.
 */
class SynthLabelUI extends BasicLabelUI with SynthUI {

    /**  */
    @stub
    def this() = ???

    /** Returns the baseline. */
    @stub
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

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

    /** Installs default properties. */
    @stub
    protected def installDefaults(c: JLabel): Unit = ???

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

    /** Uninstalls default properties. */
    @stub
    protected def uninstallDefaults(c: JLabel): Unit = ???

    /** Notifies this UI delegate to repaint the specified component. */
    @stub
    def update(g: Graphics, c: JComponent): Unit = ???
}

object SynthLabelUI {
    /** Returns the LabelUI implementation used for the skins look and feel. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
