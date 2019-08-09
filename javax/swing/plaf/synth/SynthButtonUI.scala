package javax.swing.plaf.synth

import java.awt.{Dimension, Graphics}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{AbstractButton, Icon, JComponent}
import javax.swing.plaf.{ButtonUI, ComponentUI}
import javax.swing.plaf.basic.BasicButtonUI

/** Provides the Synth L&F UI delegate for
 *  JButton.
 */
class SynthButtonUI extends BasicButtonUI with PropertyChangeListener with SynthUI {

    /** Returns the baseline. */
    @stub
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /** Returns the default icon. */
    @stub
    protected def getDefaultIcon(b: AbstractButton): Icon = ???

    /** Returns the Icon to use for painting the button. */
    @stub
    protected def getIcon(b: AbstractButton): Icon = ???

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

    /** Returns the Icon used in calculating the
     *  preferred/minimum/maximum size.
     */
    @stub
    protected def getSizingIcon(b: AbstractButton): Icon = ???

    /**  */
    @stub
    protected def installDefaults(b: AbstractButton): Unit = ???

    /**  */
    @stub
    protected def installListeners(b: AbstractButton): Unit = ???

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
    protected def uninstallDefaults(b: AbstractButton): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(b: AbstractButton): Unit = ???
}

object SynthButtonUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
